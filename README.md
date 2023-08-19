 ## آزمایشگاه مهندسی نرم‌افزار- آزمایش پنجم
## بخش اول

طبق خواسته‌ی آزمایش Yourkit را نصب کرده و به IDE اضافه می‌کنیم.

<img title="" src="images/1.png" alt="alt text" data-align="center" width="578">

در مرحله‌ی بعد فایل JavaCup را با استفاده از آن ران می‌کنیم:

<img title="" src="images/2.png" alt="alt text" data-align="center" width="578">

شکل زیر استفاده‌ی این فایل از منابع CPU را نشان می‌دهد:

<img title="" src="images/3.png" alt="alt text" data-align="center" width="578">

با توجه به شکل بالا می‌توان گفت استفاده‌ی این کلاس از cpu بسیار بالاست.
در مرحله‌ی بعد استفاده از منابع Memory را چک می‌کنیم:

<img title="" src="images/4.png" alt="alt text" data-align="center" width="578">

 همانطور که مشخص است حافظه‌ی heap نزدیک به پر شدن شده است. 

در شکل زیر Method list هم نشان داده شده است که مشخص می‌کند بیشتر مصرف مربوط به تابع temp است و Arraylist هم مصرف یالایی دارد:

<img title="" src="images/5.png" alt="alt text" data-align="center" width="578">


با توجه به این موارد تابع temp را بررسی می‌کنیم تا ببینیم راهی برای تغییر آن وجود دارد یا خیر:

<img title="" src="images/6.png" alt="alt text" data-align="center" width="578">

در این تابع چون مقدار iteration از پیش مشخص است، استفاده از ArrayList انتخاب بهینه‌ای نیست پس آن را به یک Array تبدیل می‌کنیم:

<img title="" src="images/7.png" alt="alt text" data-align="center" width="578">

حال نتایج حاصل از تغییر را برای cpu و memory  بررسی می‌کنیم:

<img title="" src="images/10.png" alt="alt text" data-align="center" width="578">

استفاده از cpu به میزان قابل توجهی کاهش یافته است.

<img title="" src="images/9.png" alt="alt text" data-align="center" width="578">

این نتیجه برای حافظه هم برقرار است. 

<img title="" src="images/11.png" alt="alt text" data-align="center" width="578">

Method list هم نشان‌دهنده‌ی این کاهش است


## بخش دوم

ابتدا یک کلاس جاوا به نام StringMatcher مطابق شکل زیر تعریف می‌کنیم. (این کلاس در پوشه‌ی Src موجود در ریپازیتوری قرار دارد)

<img title="" src="images/18.png" alt="alt text" data-align="center" width="578">

<img title="" src="images/19.png" alt="alt text" data-align="center" width="578">

سپس نتایج profiling  را بررسی می‌کنیم:

<img title="" src="images/12.png" alt="alt text" data-align="center" width="578">
<img title="" src="images/13.png" alt="alt text" data-align="center" width="578">
<img title="" src="images/14.png" alt="alt text" data-align="center" width="578">

 با توجه به نتایج بالا تصمیم می‌گیریم تابع findCommonStrings را بهینه کنیم. به جای استفاده از دو لیست، از یک هش‌لیست استفاده می‌کنیم و به جای لوپ‌های تودرتو از یک لوپ استفاده می‌کنیم که complexity را از O(n) به O(1) می‌رساند.

 <img title="" src="images/20.png" alt="alt text" data-align="center" width="578">
 <img title="" src="images/21.png" alt="alt text" data-align="center" width="578">

 فایل تغییریافته‌ی بالا هم در پوشه‌ی src وجود دارند.

 نتایج profiling:


 <img title="" src="images/16.png" alt="alt text" data-align="center" width="578">
 <img title="" src="images/17.png" alt="alt text" data-align="center" width="578">

 همانطور که می‌بینید مصرف cpu و حافظه‌ی heap کاهش یافته است.
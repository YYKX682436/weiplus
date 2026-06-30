package gi;

/* loaded from: classes12.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static int f271993a = 50;

    /* renamed from: b, reason: collision with root package name */
    public static long f271994b = 300000;

    /* renamed from: c, reason: collision with root package name */
    public static long f271995c = 6000;

    /* renamed from: d, reason: collision with root package name */
    public static long f271996d = 120;

    /* renamed from: e, reason: collision with root package name */
    public static long f271997e = 120000;

    /* renamed from: f, reason: collision with root package name */
    public static long f271998f = 2000;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f271999g = false;

    /* renamed from: h, reason: collision with root package name */
    public static long f272000h = 2;

    /* renamed from: i, reason: collision with root package name */
    public static int f272001i = 100;

    /* renamed from: j, reason: collision with root package name */
    public static int f272002j = 200;

    /* renamed from: k, reason: collision with root package name */
    public static int f272003k = 50;

    /* renamed from: l, reason: collision with root package name */
    public static long f272004l = 104857600;

    /* renamed from: m, reason: collision with root package name */
    public static long f272005m = 60000;

    /* renamed from: n, reason: collision with root package name */
    public static long f272006n = 300000;

    /* renamed from: o, reason: collision with root package name */
    public static boolean f272007o = false;

    /* renamed from: p, reason: collision with root package name */
    public static boolean f272008p = false;

    /* renamed from: q, reason: collision with root package name */
    public static boolean f272009q = false;

    /* renamed from: r, reason: collision with root package name */
    public static boolean f272010r = true;

    /* renamed from: s, reason: collision with root package name */
    public static boolean f272011s = true;

    /* renamed from: t, reason: collision with root package name */
    public static boolean f272012t = true;

    /* renamed from: u, reason: collision with root package name */
    public static java.lang.String f272013u = "";

    /* renamed from: v, reason: collision with root package name */
    public static long f272014v;

    /* renamed from: w, reason: collision with root package name */
    public static ri.k f272015w;

    /* renamed from: x, reason: collision with root package name */
    public static ph.u f272016x;

    /* JADX WARN: Can't wrap try/catch for region: R(141:1|(9:2|3|4|5|7|8|9|10|(13:12|13|14|15|17|18|19|20|21|22|24|25|(3:27|28|29)))|(34:30|31|32|33|34|35|36|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|59|60|61|62|63|64|65)|(3:421|422|(1:424)(135:425|68|69|70|72|73|74|75|76|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|106|107|108|109|110|111|112|113|114|115|116|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|(3:162|(2:164|74d)(1:321)|171)(1:322)|172|(1:290)(1:180)|181|(1:183)|(1:185)|(1:187)|(1:189)|(1:191)|(1:193)|(1:195)|(1:197)|(1:199)|(2:201|(1:203)(1:204))|205|(4:207|(3:209|(2:211|212)(1:214)|213)|215|216)(1:289)|217|(3:219|(3:221|(3:223|(4:225|(1:227)|228|229)(1:231)|230)|232)|233)(1:288)|(1:237)|(1:239)|(1:241)|242|(1:244)|245|(1:247)|248|(1:250)|251|(3:255|(3:257|(2:259|260)(1:262)|261)|263)|264|(1:266)|267|(1:269)|270|(1:272)|273|(1:275)|276|(1:278)|279|(1:281)|282|(1:284)|285|286))|67|68|69|70|72|73|74|75|76|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|106|107|108|109|110|111|112|113|114|115|116|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|(0)(0)|172|(2:174|176)|290|181|(0)|(0)|(0)|(0)|(0)|(0)|(0)|(0)|(0)|(0)|205|(0)(0)|217|(0)(0)|(2:235|237)|(0)|(0)|242|(0)|245|(0)|248|(0)|251|(4:253|255|(0)|263)|264|(0)|267|(0)|270|(0)|273|(0)|276|(0)|279|(0)|282|(0)|285|286|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(149:1|2|3|4|5|7|8|9|10|(13:12|13|14|15|17|18|19|20|21|22|24|25|(3:27|28|29))|(34:30|31|32|33|34|35|36|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|59|60|61|62|63|64|65)|(3:421|422|(1:424)(135:425|68|69|70|72|73|74|75|76|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|106|107|108|109|110|111|112|113|114|115|116|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|(3:162|(2:164|74d)(1:321)|171)(1:322)|172|(1:290)(1:180)|181|(1:183)|(1:185)|(1:187)|(1:189)|(1:191)|(1:193)|(1:195)|(1:197)|(1:199)|(2:201|(1:203)(1:204))|205|(4:207|(3:209|(2:211|212)(1:214)|213)|215|216)(1:289)|217|(3:219|(3:221|(3:223|(4:225|(1:227)|228|229)(1:231)|230)|232)|233)(1:288)|(1:237)|(1:239)|(1:241)|242|(1:244)|245|(1:247)|248|(1:250)|251|(3:255|(3:257|(2:259|260)(1:262)|261)|263)|264|(1:266)|267|(1:269)|270|(1:272)|273|(1:275)|276|(1:278)|279|(1:281)|282|(1:284)|285|286))|67|68|69|70|72|73|74|75|76|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|106|107|108|109|110|111|112|113|114|115|116|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|(0)(0)|172|(2:174|176)|290|181|(0)|(0)|(0)|(0)|(0)|(0)|(0)|(0)|(0)|(0)|205|(0)(0)|217|(0)(0)|(2:235|237)|(0)|(0)|242|(0)|245|(0)|248|(0)|251|(4:253|255|(0)|263)|264|(0)|267|(0)|270|(0)|273|(0)|276|(0)|279|(0)|282|(0)|285|286|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(161:1|2|3|4|5|7|8|9|10|12|13|14|15|17|18|19|20|21|22|24|25|(3:27|28|29)|(34:30|31|32|33|34|35|36|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|59|60|61|62|63|64|65)|(3:421|422|(1:424)(135:425|68|69|70|72|73|74|75|76|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|106|107|108|109|110|111|112|113|114|115|116|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|(3:162|(2:164|74d)(1:321)|171)(1:322)|172|(1:290)(1:180)|181|(1:183)|(1:185)|(1:187)|(1:189)|(1:191)|(1:193)|(1:195)|(1:197)|(1:199)|(2:201|(1:203)(1:204))|205|(4:207|(3:209|(2:211|212)(1:214)|213)|215|216)(1:289)|217|(3:219|(3:221|(3:223|(4:225|(1:227)|228|229)(1:231)|230)|232)|233)(1:288)|(1:237)|(1:239)|(1:241)|242|(1:244)|245|(1:247)|248|(1:250)|251|(3:255|(3:257|(2:259|260)(1:262)|261)|263)|264|(1:266)|267|(1:269)|270|(1:272)|273|(1:275)|276|(1:278)|279|(1:281)|282|(1:284)|285|286))|67|68|69|70|72|73|74|75|76|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|106|107|108|109|110|111|112|113|114|115|116|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|(0)(0)|172|(2:174|176)|290|181|(0)|(0)|(0)|(0)|(0)|(0)|(0)|(0)|(0)|(0)|205|(0)(0)|217|(0)(0)|(2:235|237)|(0)|(0)|242|(0)|245|(0)|248|(0)|251|(4:253|255|(0)|263)|264|(0)|267|(0)|270|(0)|273|(0)|276|(0)|279|(0)|282|(0)|285|286|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(163:1|2|3|4|5|7|8|9|10|12|13|14|15|17|18|19|20|21|22|24|25|27|28|29|(34:30|31|32|33|34|35|36|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|59|60|61|62|63|64|65)|(3:421|422|(1:424)(135:425|68|69|70|72|73|74|75|76|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|106|107|108|109|110|111|112|113|114|115|116|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|(3:162|(2:164|74d)(1:321)|171)(1:322)|172|(1:290)(1:180)|181|(1:183)|(1:185)|(1:187)|(1:189)|(1:191)|(1:193)|(1:195)|(1:197)|(1:199)|(2:201|(1:203)(1:204))|205|(4:207|(3:209|(2:211|212)(1:214)|213)|215|216)(1:289)|217|(3:219|(3:221|(3:223|(4:225|(1:227)|228|229)(1:231)|230)|232)|233)(1:288)|(1:237)|(1:239)|(1:241)|242|(1:244)|245|(1:247)|248|(1:250)|251|(3:255|(3:257|(2:259|260)(1:262)|261)|263)|264|(1:266)|267|(1:269)|270|(1:272)|273|(1:275)|276|(1:278)|279|(1:281)|282|(1:284)|285|286))|67|68|69|70|72|73|74|75|76|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|106|107|108|109|110|111|112|113|114|115|116|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|(0)(0)|172|(2:174|176)|290|181|(0)|(0)|(0)|(0)|(0)|(0)|(0)|(0)|(0)|(0)|205|(0)(0)|217|(0)(0)|(2:235|237)|(0)|(0)|242|(0)|245|(0)|248|(0)|251|(4:253|255|(0)|263)|264|(0)|267|(0)|270|(0)|273|(0)|276|(0)|279|(0)|282|(0)|285|286|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0424, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x042f, code lost:
    
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0440, code lost:
    
        r2 = r1;
        r1 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0451, code lost:
    
        r16 = r2;
        r17 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0489, code lost:
    
        r24 = r1;
        r2 = r23;
        r14 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0426, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0427, code lost:
    
        r14 = 5000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x042a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x042b, code lost:
    
        r16 = r1;
        r14 = 5000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0432, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0437, code lost:
    
        r14 = 5000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0434, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0435, code lost:
    
        r1 = 10000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x043a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x043b, code lost:
    
        r17 = r1;
        r1 = 10000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0444, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0445, code lost:
    
        r14 = 5000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x044e, code lost:
    
        r2 = 10000;
        r1 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x044a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x044b, code lost:
    
        r18 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0456, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0457, code lost:
    
        r16 = 10000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0468, code lost:
    
        r18 = r1;
        r17 = 5000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0487, code lost:
    
        r1 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x045c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x045d, code lost:
    
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x045f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0460, code lost:
    
        r1 = u04.d.f423477c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0464, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0465, code lost:
    
        r35 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x046d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x046e, code lost:
    
        r16 = 10000;
        r17 = 5000;
        r18 = u04.d.f423477c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x0485, code lost:
    
        r35 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x0476, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x0477, code lost:
    
        r14 = 1800000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x047a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x047b, code lost:
    
        r20 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x047e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x047f, code lost:
    
        r20 = r1;
        r14 = 1800000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x0491, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x0492, code lost:
    
        r14 = 1800000;
        r16 = 10000;
        r17 = 5000;
        r18 = u04.d.f423477c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x04c3, code lost:
    
        r20 = r1;
        r2 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x049d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x049e, code lost:
    
        r1 = 1200000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x04a1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x04a2, code lost:
    
        r22 = r1;
        r23 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x04a7, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x04a8, code lost:
    
        r22 = r1;
        r23 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x04ac, code lost:
    
        r1 = 1200000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x04b0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x04b1, code lost:
    
        r22 = r1;
        r23 = r2;
        r12 = 30000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x04b8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x04b9, code lost:
    
        r22 = r1;
        r23 = r2;
        r1 = 1200000;
        r12 = 30000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x04c9, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x04ca, code lost:
    
        r12 = 30000;
        r14 = 1800000;
        r16 = 10000;
        r17 = 5000;
        r18 = u04.d.f423477c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x04e0, code lost:
    
        r20 = 1200000;
        r2 = r2;
        r22 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x04dc, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x04dd, code lost:
    
        r34 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x04e8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x04e9, code lost:
    
        r23 = r2;
        r1 = 1200000;
        r12 = 30000;
        r14 = 1800000;
        r16 = 10000;
        r17 = 5000;
        r18 = u04.d.f423477c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x04fc, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x04fd, code lost:
    
        r33 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x0500, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x0501, code lost:
    
        r23 = r2;
        r1 = 1200000;
        r12 = 30000;
        r14 = 1800000;
        r16 = 10000;
        r17 = 5000;
        r18 = u04.d.f423477c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0514, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0515, code lost:
    
        r31 = r1 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x0518, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0519, code lost:
    
        r23 = r2;
        r1 = 1200000;
        r12 = 30000;
        r14 = 1800000;
        r16 = 10000;
        r17 = 5000;
        r18 = u04.d.f423477c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x052f, code lost:
    
        r31 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x07fa  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0819  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0825  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0831  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0838  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x083f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0846  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0854  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x085b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0862  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x087e  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x08b8  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x08f9  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x090d  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0916  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x091f  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0928  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x093f  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0953  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0987  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0997  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x09ae  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x09cb  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x09df  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x09f3  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0a07  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x08f6  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x08b1  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x07e4  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ph.u a() {
        /*
            Method dump skipped, instructions count: 2667
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gi.d.a():ph.u");
    }

    public static int b() {
        java.lang.String valueOf = java.lang.String.valueOf(android.text.format.DateFormat.format("yyyyMMdd", java.lang.System.currentTimeMillis()));
        if (android.text.TextUtils.isEmpty(valueOf)) {
            return 0;
        }
        return com.tencent.mm.sdk.platformtools.o4.L().getInt("battery_tkill_count_".concat(valueOf), 0);
    }

    public static long c() {
        return java.lang.Math.max(f271994b, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
    }

    public static long d() {
        return java.lang.Math.max(f271997e, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
    }

    public static ph.u e() {
        if (f272016x == null && ih.d.c()) {
            f272016x = (ph.u) ih.d.d().a(ph.u.class);
        }
        ph.u uVar = f272016x;
        if (uVar == null) {
            return uVar;
        }
        if (uVar.f363455g == 4) {
            return null;
        }
        return uVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:1|(2:2|3)|(8:8|9|(1:54)(1:13)|14|(1:16)(1:53)|17|18|(11:24|25|26|(4:30|31|27|28)|32|33|(1:35)|36|37|38|(2:40|41)(1:42))(1:22))|55|9|(1:11)|54|14|(0)(0)|17|18|(1:20)|24|25|26|(2:27|28)|32|33|(0)|36|37|38|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(24:1|2|3|(8:8|9|(1:54)(1:13)|14|(1:16)(1:53)|17|18|(11:24|25|26|(4:30|31|27|28)|32|33|(1:35)|36|37|38|(2:40|41)(1:42))(1:22))|55|9|(1:11)|54|14|(0)(0)|17|18|(1:20)|24|25|26|(2:27|28)|32|33|(0)|36|37|38|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x012a, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x012b, code lost:
    
        ri.r.a("ProcCpuSpeedReader", r1.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0135, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0136, code lost:
    
        ri.r.a("PowerProfile", r1.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a3 A[Catch: Exception -> 0x00c9, TryCatch #2 {Exception -> 0x00c9, blocks: (B:3:0x0008, B:5:0x0086, B:9:0x0090, B:11:0x0094, B:14:0x009f, B:16:0x00a3, B:17:0x00b2, B:53:0x00b0), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ed A[Catch: all -> 0x0100, TRY_LEAVE, TryCatch #0 {all -> 0x0100, blocks: (B:28:0x00e7, B:30:0x00ed), top: B:27:0x00e7, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0113 A[Catch: all -> 0x012a, LOOP:1: B:34:0x0111->B:35:0x0113, LOOP_END, TryCatch #3 {all -> 0x012a, blocks: (B:33:0x010b, B:35:0x0113, B:37:0x011c), top: B:32:0x010b, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b0 A[Catch: Exception -> 0x00c9, TryCatch #2 {Exception -> 0x00c9, blocks: (B:3:0x0008, B:5:0x0086, B:9:0x0090, B:11:0x0094, B:14:0x009f, B:16:0x00a3, B:17:0x00b2, B:53:0x00b0), top: B:2:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f() {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gi.d.f():void");
    }

    public static boolean g(java.lang.String str, rh.c1 c1Var) {
        qh.b bVar;
        rh.o2 t17;
        if ("canary".equals(str) && (bVar = c1Var.f395330l) != null && bVar.e() >= 120 && ((mm.l.a() || mm.o.c()) && (t17 = c1Var.t(com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.class)) != null && t17.b())) {
            rh.d3 d3Var = t17.f395486c;
            if (!((com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot) d3Var).f52562h.f395560a.isEmpty()) {
                java.lang.String str2 = ((com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesEntry) ((com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot) d3Var).f52562h.f395560a.get(0)).f52566c;
                if (str2.startsWith("TVKDL") || str2.startsWith("Thread-")) {
                    return true;
                }
                return java.util.Arrays.asList("DNSThread", "transThread").contains(str2);
            }
        }
        return false;
    }

    public static boolean h(int i17) {
        try {
            return j62.e.g().a("clicfg_battery_opt_" + i17, "1", false, true).equals("1");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Matrix.battery.BatteryCanaryConfigs", e17, "tryOptimize expt error, id = " + i17, new java.lang.Object[0]);
            return false;
        }
    }

    public static boolean i() {
        return f271999g;
    }
}

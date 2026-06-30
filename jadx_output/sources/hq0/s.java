package hq0;

/* loaded from: classes7.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq0.b0 f283057d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283058e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283059f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f283060g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ iq0.e f283061h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(hq0.b0 b0Var, java.lang.String str, java.lang.String str2, android.graphics.Rect rect, iq0.e eVar) {
        super(0);
        this.f283057d = b0Var;
        this.f283058e = str;
        this.f283059f = str2;
        this.f283060g = rect;
        this.f283061h = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        hq0.b0 b0Var = this.f283057d;
        java.lang.String str = b0Var.f282970x.f293634a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preload, bizName: ");
        sb6.append(str);
        sb6.append(", frameSetName: ");
        java.lang.String str2 = this.f283058e;
        sb6.append(str2);
        sb6.append(", frameSetData.len: ");
        java.lang.String str3 = this.f283059f;
        sb6.append(str3.length());
        sb6.append(", containerRect: ");
        android.graphics.Rect rect = this.f283060g;
        sb6.append(rect);
        sb6.append(", bizConfig: ");
        sb6.append(b0Var.f282970x);
        sb6.append(", rootConfig: ");
        iq0.e eVar = this.f283061h;
        sb6.append(eVar);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str4 = b0Var.f282971y;
        com.tencent.mars.xlog.Log.i(str4, sb7);
        if (!(str2 == null || str2.length() == 0)) {
            if (!(str3.length() == 0)) {
                java.lang.String a17 = vq0.b.a(b0Var, eVar.f293657a, str2);
                if (((qq0.m) ((qq0.i) i95.n0.c(qq0.i.class))).Ai(str, a17)) {
                    com.tencent.mars.xlog.Log.i(str4, "preload, cover already exists, frameSetName: ".concat(a17));
                } else {
                    jc3.j0 j0Var = b0Var.f282995g;
                    if (j0Var == null) {
                        com.tencent.mars.xlog.Log.e(str4, "preload but magicBrush null!");
                    } else {
                        java.lang.String str5 = vq0.b.c(((rc3.w0) j0Var).f394087e) + '-' + a17;
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap = b0Var.F;
                        if (concurrentHashMap.containsKey(str5)) {
                            com.tencent.mars.xlog.Log.i(str4, "preload, already in preloading and not expired, frameSetName: ".concat(str2));
                        } else if (concurrentHashMap.size() >= b0Var.G) {
                            com.tencent.mars.xlog.Log.i(str4, "preload, reach preload limit, frameSetName: " + str2 + ", size: " + concurrentHashMap.size());
                        } else {
                            if (!b0Var.H) {
                                com.tencent.mars.xlog.Log.i(str4, "preload, create biz bizName: ".concat(str));
                                b0Var.a2(true);
                            }
                            if (b0Var.C.get(eVar.a()) == null) {
                                b0Var.R1(eVar, true);
                            }
                            concurrentHashMap.put(str5, new hq0.j(this.f283061h, this.f283058e, this.f283059f, this.f283060g, java.lang.System.currentTimeMillis()));
                            com.tencent.mars.xlog.Log.i(str4, "innerGenerateCover real Start Preload");
                            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(com.tencent.mm.sdk.platformtools.x2.f193071a);
                            frameLayout.layout(rect.left, rect.top, rect.width(), rect.height());
                            iq0.e eVar2 = this.f283061h;
                            java.lang.String str6 = this.f283058e;
                            java.lang.String str7 = this.f283059f;
                            b0Var.getClass();
                            d75.b.g(new hq0.q(b0Var, eVar2, str6, frameLayout, true, null, 0, str7));
                            ((mq0.v0) ((mq0.e0) i95.n0.c(mq0.e0.class))).wi("preloadCover", "begin", a17, str, eVar.f293657a, this.f283058e, "");
                            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(kotlinx.coroutines.internal.b0.f310484a), null, null, new hq0.r(this.f283057d, str5, this.f283058e, a17, str, this.f283061h, null), 3, null);
                        }
                    }
                }
                return jz5.f0.f302826a;
            }
        }
        com.tencent.mars.xlog.Log.e(str4, "preload, invalid data");
        return jz5.f0.f302826a;
    }
}

package xi1;

/* loaded from: classes7.dex */
public final class u implements com.tencent.mm.plugin.appbrand.utils.p2 {

    /* renamed from: b, reason: collision with root package name */
    public static final xi1.t f454715b = new xi1.t(null);

    /* renamed from: a, reason: collision with root package name */
    public final xi1.p f454716a;

    public u(xi1.p orientationHandler) {
        kotlin.jvm.internal.o.g(orientationHandler, "orientationHandler");
        this.f454716a = orientationHandler;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.p2
    public com.tencent.mm.plugin.appbrand.utils.e4 a() {
        xi1.o a17 = this.f454716a.a();
        kotlin.jvm.internal.o.f(a17, "getCurrentOrientation(...)");
        int ordinal = a17.ordinal();
        if (ordinal == 0) {
            return com.tencent.mm.plugin.appbrand.utils.e4.f90422e;
        }
        if (ordinal == 1) {
            return com.tencent.mm.plugin.appbrand.utils.e4.f90421d;
        }
        if (ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 5) {
            return com.tencent.mm.plugin.appbrand.utils.e4.f90423f;
        }
        throw new jz5.j();
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.p2
    public java.lang.String getName() {
        return "WxaOrientationGetter";
    }
}

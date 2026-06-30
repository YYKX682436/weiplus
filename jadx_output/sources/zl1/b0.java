package zl1;

/* loaded from: classes7.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f473572a = new java.util.HashMap();

    public final zl1.y a(java.lang.String iconPath, zl1.w errorHandler, com.tencent.mm.plugin.appbrand.e9 service, int i17) {
        zl1.y f0Var;
        kotlin.jvm.internal.o.g(iconPath, "iconPath");
        kotlin.jvm.internal.o.g(errorHandler, "errorHandler");
        kotlin.jvm.internal.o.g(service, "service");
        if (true == (android.webkit.URLUtil.isHttpsUrl(iconPath) || android.webkit.URLUtil.isHttpUrl(iconPath))) {
            f0Var = new zl1.d0(iconPath, errorHandler, service);
        } else if (true == r26.i0.y(iconPath, "wxfile://", false)) {
            f0Var = new zl1.h0(iconPath, errorHandler, service);
        } else {
            f0Var = true == (r26.i0.n(iconPath, ".png", false) || r26.i0.n(iconPath, com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG, false) || r26.i0.n(iconPath, ".bmp", false) || r26.i0.n(iconPath, ".gif", false)) ? new zl1.f0(iconPath, errorHandler, service) : new zl1.v(iconPath, errorHandler);
        }
        f0Var.f473630e = i17;
        f0Var.f473629d = new zl1.a0(this);
        zl1.y yVar = (zl1.y) this.f473572a.get(java.lang.Integer.valueOf(i17));
        if (yVar != null) {
            yVar.f473631f = null;
        }
        this.f473572a.put(java.lang.Integer.valueOf(i17), f0Var);
        return f0Var;
    }
}

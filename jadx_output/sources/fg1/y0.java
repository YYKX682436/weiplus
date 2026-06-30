package fg1;

/* loaded from: classes7.dex */
public class y0 implements bg.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fg1.g1 f261919a;

    public y0(fg1.g1 g1Var) {
        this.f261919a = g1Var;
    }

    public void a(int i17, int i18) {
        com.tencent.mm.plugin.appbrand.pip.c cVar;
        com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView appBrandPipContainerView;
        fg1.f1 f1Var = this.f261919a.f261869b;
        pd1.m mVar = f1Var.f261859b;
        if (mVar != null) {
            float f17 = (i17 * 100.0f) / i18;
            int i19 = i18 - i17;
            if (f17 >= 99.0f && i19 <= 1000) {
                com.tencent.mm.plugin.appbrand.pip.y yVar = (com.tencent.mm.plugin.appbrand.pip.y) mVar;
                yVar.getClass();
                f1Var.getKey();
                java.lang.String str = yVar.f87567a.f87518a;
                return;
            }
            com.tencent.mm.plugin.appbrand.pip.y yVar2 = (com.tencent.mm.plugin.appbrand.pip.y) mVar;
            yVar2.getClass();
            java.lang.String key = f1Var.getKey();
            com.tencent.mm.plugin.appbrand.pip.o0 o0Var = yVar2.f87567a;
            java.lang.String str2 = o0Var.f87530m;
            if (str2 == null || !str2.equals(key) || (cVar = o0Var.f87533p) == null || (appBrandPipContainerView = o0Var.f87523f) == null) {
                return;
            }
            appBrandPipContainerView.post(new com.tencent.mm.plugin.appbrand.pip.v(yVar2, cVar.f87431c, f17));
        }
    }
}

package xi1;

/* loaded from: classes7.dex */
public class h extends com.tencent.mm.plugin.appbrand.platform.window.activity.r0 implements xi1.i {
    @Override // xi1.i
    public void a(com.tencent.mm.plugin.appbrand.platform.window.WxaWindowLayoutParams wxaWindowLayoutParams, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        com.tencent.mm.plugin.appbrand.widget.q qVar = appBrandRuntime.f74810s;
        if ((qVar instanceof com.tencent.mm.plugin.appbrand.widget.c) && !appBrandRuntime.Q0()) {
            ((com.tencent.mm.plugin.appbrand.widget.c) qVar).setWxaLayoutParams(wxaWindowLayoutParams);
            return;
        }
        com.tencent.mm.plugin.appbrand.widget.q qVar2 = appBrandRuntime.f74810s;
        qVar2.setLayoutParams(wxaWindowLayoutParams);
        qVar2.setScaleX(wxaWindowLayoutParams.f87570a);
        qVar2.setScaleY(wxaWindowLayoutParams.f87570a);
    }

    @Override // xi1.i
    public android.view.ViewGroup.LayoutParams b(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        com.tencent.mm.plugin.appbrand.widget.q qVar = appBrandRuntime.f74810s;
        return (!(qVar instanceof com.tencent.mm.plugin.appbrand.widget.c) || appBrandRuntime.Q0()) ? appBrandRuntime.f74810s.getLayoutParams() : ((com.tencent.mm.plugin.appbrand.widget.c) qVar).getWxaLayoutParams();
    }

    public void d(int i17, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        boolean z17 = i17 == 0 || (i17 >> 24) != 0;
        android.app.Activity w17 = w();
        if (w17 == null) {
            return;
        }
        w17.getWindow().setBackgroundDrawable(z17 ? new android.graphics.drawable.ColorDrawable(0) : new android.graphics.drawable.ColorDrawable(i17));
    }
}

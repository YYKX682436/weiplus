package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class w0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI f184702d;

    public w0(com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI fTSBaseWebViewUI) {
        this.f184702d = fTSBaseWebViewUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/fts/FTSBaseWebViewUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI fTSBaseWebViewUI = this.f184702d;
        if (fTSBaseWebViewUI.K3) {
            androidx.appcompat.app.AppCompatActivity activity = fTSBaseWebViewUI.getContext();
            kotlin.jvm.internal.o.g(activity, "activity");
            com.tencent.mm.plugin.webview.ui.tools.fts.uic.FTSFlutterSearchUIC fTSFlutterSearchUIC = (com.tencent.mm.plugin.webview.ui.tools.fts.uic.FTSFlutterSearchUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.webview.ui.tools.fts.uic.FTSFlutterSearchUIC.class);
            fTSFlutterSearchUIC.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.hitest.FTSFlutterSearchUIC", "onSearchBack");
            fTSFlutterSearchUIC.T6();
        }
        fTSBaseWebViewUI.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSBaseWebViewUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

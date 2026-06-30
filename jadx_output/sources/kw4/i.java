package kw4;

/* loaded from: classes8.dex */
public class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView f313178d;

    public i(com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView ftsWebVideoView) {
        this.f313178d = ftsWebVideoView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView ftsWebVideoView = this.f313178d;
        if (ftsWebVideoView.f182068e.isPlaying()) {
            com.tencent.mm.sdk.platformtools.b4 b4Var = ftsWebVideoView.f182070g.L;
            if (b4Var != null) {
                b4Var.d();
            }
            ftsWebVideoView.i();
        } else {
            ftsWebVideoView.f182070g.x();
            ftsWebVideoView.p(true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

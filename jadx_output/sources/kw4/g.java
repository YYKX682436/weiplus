package kw4;

/* loaded from: classes8.dex */
public class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView f313176d;

    public g(com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView ftsWebVideoView) {
        this.f313176d = ftsWebVideoView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView ftsWebVideoView = this.f313176d;
        boolean z17 = !ftsWebVideoView.f182066J;
        ftsWebVideoView.f182066J = z17;
        ftsWebVideoView.f182068e.setMute(z17);
        if (ftsWebVideoView.f182066J) {
            ftsWebVideoView.f182070g.F.setImageResource(com.tencent.mm.R.drawable.c6f);
        } else {
            ftsWebVideoView.f182070g.F.setImageResource(com.tencent.mm.R.drawable.c6c);
        }
        ftsWebVideoView.f182070g.x();
        yj0.a.h(this, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

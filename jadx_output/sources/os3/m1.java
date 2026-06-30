package os3;

/* loaded from: classes8.dex */
public class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.EmbedWebView f348149d;

    public m1(com.tencent.mm.plugin.qqmail.ui.EmbedWebView embedWebView) {
        this.f348149d = embedWebView;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view;
        com.tencent.mm.plugin.qqmail.ui.EmbedWebView embedWebView = this.f348149d;
        android.view.View view2 = (android.view.View) embedWebView.getParent();
        if (view2 == null || (view = (android.view.View) view2.getParent()) == null || !(view instanceof android.widget.ScrollView)) {
            return;
        }
        embedWebView.H = true;
        view.setOnTouchListener(new os3.l1(this));
    }
}

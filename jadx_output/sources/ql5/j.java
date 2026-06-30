package ql5;

/* loaded from: classes11.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.listview.PullDownListView f364613d;

    public j(com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView) {
        this.f364613d = pullDownListView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView = this.f364613d;
        com.tencent.mm.ui.yk.a("MicroMsg.PullDownListView", "mThis.getLeft()=%s, mThis.getTop()=%s, mThis.getRight()=%s, mThis.getBottom()=%s", java.lang.Integer.valueOf(pullDownListView.f212164t.getLeft()), java.lang.Integer.valueOf(pullDownListView.f212164t.getTop()), java.lang.Integer.valueOf(pullDownListView.f212164t.getRight()), java.lang.Integer.valueOf(pullDownListView.f212164t.getBottom()));
        pullDownListView.f212167w.set(pullDownListView.f212164t.getLeft(), pullDownListView.f212164t.getTop(), pullDownListView.f212164t.getRight(), pullDownListView.f212164t.getBottom());
    }
}

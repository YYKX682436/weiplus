package xc2;

/* loaded from: classes2.dex */
public final class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCommentDrawer f453169d;

    public j1(com.tencent.mm.plugin.finder.view.FinderCommentDrawer finderCommentDrawer) {
        this.f453169d = finderCommentDrawer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.feed.a7 presenter = this.f453169d.getPresenter();
        if (presenter != null) {
            presenter.B0(true);
        }
    }
}

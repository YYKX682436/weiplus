package xt2;

/* loaded from: classes2.dex */
public final class k3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f456850d;

    public k3(com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f456850d = mMPAGView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.view.MMPAGView mMPAGView = this.f456850d;
        mMPAGView.n();
        mMPAGView.setVisibility(8);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveShoppingCartAnimWidget", "cart promote pag stopped after 6 seconds");
    }
}

package uf5;

/* loaded from: classes8.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f427312d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ al5.q f427313e;

    public w(com.tencent.mm.ui.MMActivity mMActivity, al5.q qVar) {
        this.f427312d = mMActivity;
        this.f427313e = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup wrappingFrame = this.f427312d.getWrappingFrame();
        com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout edgeToEdgeWrapperLayout = wrappingFrame instanceof com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout ? (com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout) wrappingFrame : null;
        if (edgeToEdgeWrapperLayout != null) {
            edgeToEdgeWrapperLayout.setNavigationBarStrategy(this.f427313e);
            edgeToEdgeWrapperLayout.M();
        }
    }
}

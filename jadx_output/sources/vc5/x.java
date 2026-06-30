package vc5;

/* loaded from: classes10.dex */
public final class x implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f435349d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryToolBarView f435350e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ad5.l0[] f435351f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f435352g;

    public x(android.view.View view, com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryToolBarView msgHistoryGalleryToolBarView, ad5.l0[] l0VarArr, yz5.l lVar) {
        this.f435349d = view;
        this.f435350e = msgHistoryGalleryToolBarView;
        this.f435351f = l0VarArr;
        this.f435352g = lVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        this.f435349d.removeOnAttachStateChangeListener(this);
        ad5.l0[] l0VarArr = this.f435351f;
        this.f435350e.b((ad5.l0[]) java.util.Arrays.copyOf(l0VarArr, l0VarArr.length), this.f435352g);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
    }
}

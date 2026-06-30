package vc5;

/* loaded from: classes10.dex */
public final class s implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f435342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGallerySearchBarView f435343e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f435344f;

    public s(android.view.View view, com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGallerySearchBarView msgHistoryGallerySearchBarView, java.lang.CharSequence charSequence) {
        this.f435342d = view;
        this.f435343e = msgHistoryGallerySearchBarView;
        this.f435344f = charSequence;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        this.f435342d.removeOnAttachStateChangeListener(this);
        em.d2 d2Var = this.f435343e.f201732f;
        if (d2Var != null) {
            d2Var.d().setHint(this.f435344f);
        } else {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
    }
}

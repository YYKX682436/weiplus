package com.tencent.mm.ui.chatting.history.person;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/ui/chatting/history/person/MsgHistoryGalleryPersonRecommendActionBarView;", "Lcom/tencent/mm/ui/immersive/ImmersiveBaseChromeView;", "Leh5/a;", "g", "Leh5/a;", "getImmersiveType", "()Leh5/a;", "immersiveType", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class MsgHistoryGalleryPersonRecommendActionBarView extends com.tencent.mm.ui.immersive.ImmersiveBaseChromeView {

    /* renamed from: f, reason: collision with root package name */
    public em.c2 f201807f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final eh5.a immersiveType;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MsgHistoryGalleryPersonRecommendActionBarView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.ui.immersive.ImmersiveBaseChromeView
    public android.view.View a() {
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.ekm, (android.view.ViewGroup) this, false);
        em.c2 c2Var = new em.c2(inflate);
        this.f201807f = c2Var;
        if (c2Var.f254172d == null) {
            c2Var.f254172d = (android.widget.FrameLayout) inflate.findViewById(com.tencent.mm.R.id.aa8);
        }
        c2Var.f254172d.setOnClickListener(bd5.d.f19433d);
        kotlin.jvm.internal.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    @Override // com.tencent.mm.ui.immersive.ImmersiveBaseChromeView
    public eh5.a getImmersiveType() {
        return this.immersiveType;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MsgHistoryGalleryPersonRecommendActionBarView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public /* synthetic */ MsgHistoryGalleryPersonRecommendActionBarView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MsgHistoryGalleryPersonRecommendActionBarView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.immersiveType = eh5.a.f252951d;
    }
}

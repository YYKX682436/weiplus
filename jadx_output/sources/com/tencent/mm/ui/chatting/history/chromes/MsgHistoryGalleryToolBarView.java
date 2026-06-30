package com.tencent.mm.ui.chatting.history.chromes;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/tencent/mm/ui/chatting/history/chromes/MsgHistoryGalleryToolBarView;", "Lcom/tencent/mm/ui/immersive/ImmersiveBaseChromeView;", "", "enabled", "Ljz5/f0;", "setButtonsEnabled", "Leh5/a;", "g", "Leh5/a;", "getImmersiveType", "()Leh5/a;", "immersiveType", "", "h", "I", "getDefaultVisibility", "()I", "defaultVisibility", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class MsgHistoryGalleryToolBarView extends com.tencent.mm.ui.immersive.ImmersiveBaseChromeView {

    /* renamed from: f, reason: collision with root package name */
    public em.g2 f201740f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final eh5.a immersiveType;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final int defaultVisibility;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MsgHistoryGalleryToolBarView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.ui.immersive.ImmersiveBaseChromeView
    public android.view.View a() {
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.ekt, (android.view.ViewGroup) this, false);
        this.f201740f = new em.g2(inflate);
        kotlin.jvm.internal.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    public final void b(ad5.l0[] operationList, yz5.l lVar) {
        kotlin.jvm.internal.o.g(operationList, "operationList");
        if (!isAttachedToWindow()) {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            if (n3.x0.b(this)) {
                b((ad5.l0[]) java.util.Arrays.copyOf(operationList, operationList.length), lVar);
                return;
            } else {
                addOnAttachStateChangeListener(new vc5.x(this, this, operationList, lVar));
                return;
            }
        }
        em.g2 g2Var = this.f201740f;
        if (g2Var == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        for (int childCount = g2Var.a().getChildCount() - 1; -1 < childCount; childCount--) {
            em.g2 g2Var2 = this.f201740f;
            if (g2Var2 == null) {
                kotlin.jvm.internal.o.o("binding");
                throw null;
            }
            g2Var2.a().getChildAt(childCount).setOnClickListener(null);
            em.g2 g2Var3 = this.f201740f;
            if (g2Var3 == null) {
                kotlin.jvm.internal.o.o("binding");
                throw null;
            }
            g2Var3.a().removeViewAt(childCount);
        }
        int h17 = i65.a.h(getContext(), com.tencent.mm.R.dimen.f479738dv);
        for (ad5.l0 l0Var : operationList) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(getContext());
            weImageView.s(l0Var.c(), com.tencent.mm.R.color.ahu);
            weImageView.setOnClickListener(new vc5.y(this, l0Var, lVar));
            int i17 = h17 * 3;
            com.google.android.flexbox.FlexboxLayout.LayoutParams layoutParams = new com.google.android.flexbox.FlexboxLayout.LayoutParams(i17, i17);
            int i18 = h17 * 2;
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = i18;
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i18;
            layoutParams.f44190e = 0.0f;
            layoutParams.f44191f = 0.0f;
            weImageView.setLayoutParams(layoutParams);
            em.g2 g2Var4 = this.f201740f;
            if (g2Var4 == null) {
                kotlin.jvm.internal.o.o("binding");
                throw null;
            }
            g2Var4.a().addView(weImageView);
            java.util.WeakHashMap weakHashMap2 = n3.l1.f334362a;
            if (!n3.x0.c(weImageView) || weImageView.isLayoutRequested()) {
                weImageView.addOnLayoutChangeListener(new vc5.z(weImageView, h17));
            } else {
                com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.Companion.expand$default(com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.INSTANCE, weImageView, i18, i18, i18, i18, false, 32, null);
            }
        }
    }

    @Override // com.tencent.mm.ui.immersive.ImmersiveBaseChromeView
    public int getDefaultVisibility() {
        return this.defaultVisibility;
    }

    @Override // com.tencent.mm.ui.immersive.ImmersiveBaseChromeView
    public eh5.a getImmersiveType() {
        return this.immersiveType;
    }

    public final void setButtonsEnabled(boolean z17) {
        em.g2 g2Var = this.f201740f;
        if (g2Var == null) {
            return;
        }
        if (g2Var == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        com.google.android.flexbox.FlexboxLayout a17 = g2Var.a();
        kotlin.jvm.internal.o.f(a17, "getMsgHistoryGalleryToolBarView(...)");
        int childCount = a17.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = a17.getChildAt(i17);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = childAt instanceof com.tencent.mm.ui.widget.imageview.WeImageView ? (com.tencent.mm.ui.widget.imageview.WeImageView) childAt : null;
            if (weImageView != null) {
                weImageView.setEnabled(z17);
                weImageView.setClickable(z17);
                weImageView.setIconAlpha(z17 ? 1.0f : 0.3f);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MsgHistoryGalleryToolBarView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public /* synthetic */ MsgHistoryGalleryToolBarView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MsgHistoryGalleryToolBarView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.immersiveType = eh5.a.f252952e;
        this.defaultVisibility = 8;
    }
}

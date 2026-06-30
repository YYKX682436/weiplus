package com.tencent.mm.plugin.finder.live.view;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 B#\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b\u001f\u0010#R\u001b\u0010\u0007\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\n\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001b\u0010\u000f\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0017\u001a\u00020\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0013R\u001b\u0010\u001a\u001a\u00020\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0004\u001a\u0004\b\u0019\u0010\u0013¨\u0006$"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveAfterRecommendPanelView;", "Landroid/widget/FrameLayout;", "Landroid/widget/TextView;", "d", "Ljz5/g;", "getTitleView", "()Landroid/widget/TextView;", "titleView", "e", "getJumpBtnText", "jumpBtnText", "Landroid/view/View;", "f", "getJumpBtn", "()Landroid/view/View;", "jumpBtn", "Landroid/view/ViewGroup;", "g", "getCardOne", "()Landroid/view/ViewGroup;", "cardOne", "h", "getCardTwo", "cardTwo", "i", "getCardThree", "cardThree", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveAfterRecommendPanelView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g titleView;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g jumpBtnText;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g jumpBtn;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final jz5.g cardOne;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final jz5.g cardTwo;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final jz5.g cardThree;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveAfterRecommendPanelView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.al9, (android.view.ViewGroup) this, true);
        this.titleView = jz5.h.b(new com.tencent.mm.plugin.finder.live.view.j1(this));
        this.jumpBtnText = jz5.h.b(new com.tencent.mm.plugin.finder.live.view.i1(this));
        this.jumpBtn = jz5.h.b(new com.tencent.mm.plugin.finder.live.view.h1(this));
        this.cardOne = jz5.h.b(new com.tencent.mm.plugin.finder.live.view.e1(this));
        this.cardTwo = jz5.h.b(new com.tencent.mm.plugin.finder.live.view.g1(this));
        this.cardThree = jz5.h.b(new com.tencent.mm.plugin.finder.live.view.f1(this));
    }

    public final android.view.ViewGroup getCardOne() {
        java.lang.Object value = this.cardOne.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.ViewGroup) value;
    }

    public final android.view.ViewGroup getCardThree() {
        java.lang.Object value = this.cardThree.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.ViewGroup) value;
    }

    public final android.view.ViewGroup getCardTwo() {
        java.lang.Object value = this.cardTwo.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.ViewGroup) value;
    }

    public final android.view.View getJumpBtn() {
        java.lang.Object value = this.jumpBtn.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final android.widget.TextView getJumpBtnText() {
        java.lang.Object value = this.jumpBtnText.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    public final android.widget.TextView getTitleView() {
        java.lang.Object value = this.titleView.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveAfterRecommendPanelView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.al9, (android.view.ViewGroup) this, true);
        this.titleView = jz5.h.b(new com.tencent.mm.plugin.finder.live.view.j1(this));
        this.jumpBtnText = jz5.h.b(new com.tencent.mm.plugin.finder.live.view.i1(this));
        this.jumpBtn = jz5.h.b(new com.tencent.mm.plugin.finder.live.view.h1(this));
        this.cardOne = jz5.h.b(new com.tencent.mm.plugin.finder.live.view.e1(this));
        this.cardTwo = jz5.h.b(new com.tencent.mm.plugin.finder.live.view.g1(this));
        this.cardThree = jz5.h.b(new com.tencent.mm.plugin.finder.live.view.f1(this));
    }
}

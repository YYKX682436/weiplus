package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class kg extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderPopupBubbleView f132500d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg(com.tencent.mm.plugin.finder.view.FinderPopupBubbleView finderPopupBubbleView) {
        super(0);
        this.f132500d = finderPopupBubbleView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.TextView subTitle;
        subTitle = this.f132500d.getSubTitle();
        android.view.ViewGroup.LayoutParams layoutParams = subTitle.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        return java.lang.Integer.valueOf(((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
    }
}

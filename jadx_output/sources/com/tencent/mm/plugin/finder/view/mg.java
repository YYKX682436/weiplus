package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class mg extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderPopupBubbleView f132661d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg(com.tencent.mm.plugin.finder.view.FinderPopupBubbleView finderPopupBubbleView) {
        super(0);
        this.f132661d = finderPopupBubbleView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.TextView subTitle;
        subTitle = this.f132661d.getSubTitle();
        return java.lang.Integer.valueOf(subTitle.getLayoutParams().width);
    }
}

package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class wf extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderPopupBubbleView f133293d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wf(com.tencent.mm.plugin.finder.view.FinderPopupBubbleView finderPopupBubbleView) {
        super(0);
        this.f133293d = finderPopupBubbleView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.TextView subTitle;
        android.widget.TextView subTitle2;
        com.tencent.mm.plugin.finder.view.FinderPopupBubbleView finderPopupBubbleView = this.f133293d;
        subTitle = finderPopupBubbleView.getSubTitle();
        finderPopupBubbleView.f131351q = subTitle.getMeasuredWidth();
        subTitle2 = finderPopupBubbleView.getSubTitle();
        finderPopupBubbleView.f131352r = subTitle2.getMeasuredHeight();
        return jz5.f0.f302826a;
    }
}

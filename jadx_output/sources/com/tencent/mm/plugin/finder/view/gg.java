package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class gg extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderPopupBubbleView f132161d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg(com.tencent.mm.plugin.finder.view.FinderPopupBubbleView finderPopupBubbleView) {
        super(0);
        this.f132161d = finderPopupBubbleView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View rightPlaceHolder;
        rightPlaceHolder = this.f132161d.getRightPlaceHolder();
        return java.lang.Integer.valueOf(rightPlaceHolder.getLayoutParams().width);
    }
}

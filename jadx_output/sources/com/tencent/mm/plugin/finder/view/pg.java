package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class pg extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderPopupBubbleView f132838d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg(com.tencent.mm.plugin.finder.view.FinderPopupBubbleView finderPopupBubbleView) {
        super(0);
        this.f132838d = finderPopupBubbleView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View topPlaceHolder;
        topPlaceHolder = this.f132838d.getTopPlaceHolder();
        return java.lang.Integer.valueOf(topPlaceHolder.getLayoutParams().height);
    }
}

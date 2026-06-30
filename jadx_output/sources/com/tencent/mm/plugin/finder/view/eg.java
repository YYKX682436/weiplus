package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class eg extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderPopupBubbleView f132005d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg(com.tencent.mm.plugin.finder.view.FinderPopupBubbleView finderPopupBubbleView) {
        super(0);
        this.f132005d = finderPopupBubbleView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.widget.imageview.WeImageView icon;
        icon = this.f132005d.getIcon();
        return java.lang.Integer.valueOf(icon.getLayoutParams().width);
    }
}

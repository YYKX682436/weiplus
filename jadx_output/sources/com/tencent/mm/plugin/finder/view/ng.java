package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class ng extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderPopupBubbleView f132713d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ng(com.tencent.mm.plugin.finder.view.FinderPopupBubbleView finderPopupBubbleView) {
        super(0);
        this.f132713d = finderPopupBubbleView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return (android.widget.TextView) this.f132713d.findViewById(com.tencent.mm.R.id.obc);
    }
}

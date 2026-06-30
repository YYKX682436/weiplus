package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class eh extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderPostOriginView f132006d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh(com.tencent.mm.plugin.finder.view.FinderPostOriginView finderPostOriginView) {
        super(0);
        this.f132006d = finderPostOriginView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.view.FinderPostOriginView finderPostOriginView = this.f132006d;
        android.content.Context context = finderPostOriginView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new qd2.g1(context, finderPostOriginView.getMediaType(), finderPostOriginView.getFeedId(), null, false, 3, 24, null);
    }
}

package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class oe extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderMediaLayout f132786d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe(com.tencent.mm.plugin.finder.view.FinderMediaLayout finderMediaLayout) {
        super(0);
        this.f132786d = finderMediaLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.view.FinderMediaLayout finderMediaLayout = this.f132786d;
        if (finderMediaLayout.getMediaType() != com.tencent.mm.plugin.finder.view.qr.f132907f) {
            finderMediaLayout.getMediaType();
        }
        android.content.Context context = finderMediaLayout.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new com.tencent.mm.plugin.finder.view.FinderVideoBanner(context);
    }
}

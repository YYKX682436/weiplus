package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class ne extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderMediaLayout f132711d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ne(com.tencent.mm.plugin.finder.view.FinderMediaLayout finderMediaLayout) {
        super(0);
        this.f132711d = finderMediaLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.view.FinderMediaLayout finderMediaLayout = this.f132711d;
        return new com.tencent.mm.plugin.finder.view.z0(finderMediaLayout.getContext(), finderMediaLayout, new android.os.Handler(android.os.Looper.getMainLooper()), "Finder.MediaLayout#touchDetector");
    }
}

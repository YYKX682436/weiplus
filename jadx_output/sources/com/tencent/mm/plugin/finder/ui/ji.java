package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class ji extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderShareFeedAffinityUI f129401d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji(com.tencent.mm.plugin.finder.ui.FinderShareFeedAffinityUI finderShareFeedAffinityUI) {
        super(0);
        this.f129401d = finderShareFeedAffinityUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = com.tencent.mm.plugin.finder.ui.FinderShareFeedAffinityUI.f128755v2;
        com.tencent.mars.xlog.Log.i("Finder.FinderShareFeedAffinityUI", "onFinderForeground");
        this.f129401d.f128758s2 = 0L;
        return jz5.f0.f302826a;
    }
}

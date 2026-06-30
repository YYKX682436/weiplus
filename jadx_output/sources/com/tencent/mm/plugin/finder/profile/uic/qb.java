package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class qb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.yb f124152d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb(com.tencent.mm.plugin.finder.profile.uic.yb ybVar) {
        super(0);
        this.f124152d = ybVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.profile.uic.yb ybVar = this.f124152d;
        return new com.tencent.mm.plugin.finder.feed.model.FinderProfileNativeDramaLoader(ybVar.getUsername(), ybVar.getContextObj());
    }
}

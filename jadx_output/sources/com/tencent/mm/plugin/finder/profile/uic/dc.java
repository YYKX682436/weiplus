package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class dc extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ic f123625d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc(com.tencent.mm.plugin.finder.profile.uic.ic icVar) {
        super(0);
        this.f123625d = icVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.profile.uic.ic icVar = this.f123625d;
        com.tencent.mars.xlog.Log.i(icVar.f123795i, "[fetchEndCallback] totalSize=" + icVar.O6().getSize());
        icVar.getRlLayout().E(true);
        return jz5.f0.f302826a;
    }
}

package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class s1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.a2 f124201d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(com.tencent.mm.plugin.finder.profile.uic.a2 a2Var) {
        super(0);
        this.f124201d = a2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.profile.uic.a2 a2Var = this.f124201d;
        return new com.tencent.mm.plugin.finder.profile.d(a2Var.getContext(), 6, a2Var.isSelfFlag());
    }
}

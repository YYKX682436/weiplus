package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class e6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.f6 f123657d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(com.tencent.mm.plugin.finder.profile.uic.f6 f6Var) {
        super(0);
        this.f123657d = f6Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.profile.uic.f6 f6Var = this.f123657d;
        return java.lang.Boolean.valueOf(f6Var.getFragment() != null || lk5.s.c(f6Var.getIntent()));
    }
}

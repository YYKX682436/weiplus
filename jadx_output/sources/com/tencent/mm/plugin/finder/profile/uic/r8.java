package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class r8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f124177d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f124178e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8(com.tencent.mm.plugin.finder.profile.uic.ob obVar, ya2.b2 b2Var) {
        super(0);
        this.f124177d = obVar;
        this.f124178e = b2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String D0 = this.f124178e.D0();
        com.tencent.mm.plugin.finder.profile.uic.ob obVar = this.f124177d;
        obVar.jumpProfile(D0, obVar.P1);
        return jz5.f0.f302826a;
    }
}

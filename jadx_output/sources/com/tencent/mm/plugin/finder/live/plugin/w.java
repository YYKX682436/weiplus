package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.q0 f114832d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mm2.j f114833e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.plugin.finder.live.plugin.q0 q0Var, mm2.j jVar) {
        super(0);
        this.f114832d = q0Var;
        this.f114833e = jVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        r45.ce2 ce2Var;
        mm2.j jVar = this.f114833e;
        if (jVar == null || (ce2Var = jVar.f329150b) == null || (str = ce2Var.getString(0)) == null) {
            str = "";
        }
        com.tencent.mm.plugin.finder.live.plugin.q0.w1(this.f114832d, str, false, 2, null);
        return jz5.f0.f302826a;
    }
}

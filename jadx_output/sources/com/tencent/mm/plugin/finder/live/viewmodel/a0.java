package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.a1 f116869d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f116870e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.tencent.mm.plugin.finder.live.viewmodel.a1 a1Var, java.lang.String str) {
        super(0);
        this.f116869d = a1Var;
        this.f116870e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).getClass();
        com.tencent.mm.pluginsdk.model.app.c1 Ui = zo3.p.Ui();
        com.tencent.mm.plugin.finder.live.viewmodel.a1 a1Var = this.f116869d;
        r45.z53 z53Var = a1Var.f116887w;
        Ui.d(z53Var != null ? z53Var.getString(0) : null);
        pm0.v.X(new com.tencent.mm.plugin.finder.live.viewmodel.z(a1Var, this.f116870e));
        return jz5.f0.f302826a;
    }
}

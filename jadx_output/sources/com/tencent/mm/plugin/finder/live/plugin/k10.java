package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class k10 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.z10 f113182a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f113183b;

    public k10(com.tencent.mm.plugin.finder.live.plugin.z10 z10Var, java.lang.String str) {
        this.f113182a = z10Var;
        this.f113183b = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.m70 m70Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.finder.live.plugin.z10 z10Var = this.f113182a;
        com.tencent.mars.xlog.Log.i(z10Var.f115260i, "CgiFinderLiveReceiveConcertTicket errCode: " + fVar.f70616b + ", errMsg: " + fVar.f70617c + ", errType: " + fVar.f70615a);
        if (fVar.f70616b == 0 && fVar.f70615a == 0 && (m70Var = (r45.m70) ((r45.o62) fVar.f70618d).getCustom(1)) != null) {
            pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.j10(z10Var, m70Var, this.f113183b));
        }
        return jz5.f0.f302826a;
    }
}

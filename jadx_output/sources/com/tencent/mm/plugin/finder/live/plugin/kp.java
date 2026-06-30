package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class kp extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.dq f113313d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kp(com.tencent.mm.plugin.finder.live.plugin.dq dqVar) {
        super(0);
        this.f113313d = dqVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.zb4 zb4Var = new r45.zb4();
        zb4Var.set(0, "");
        zb4Var.set(1, java.lang.Boolean.FALSE);
        com.tencent.mm.plugin.finder.live.plugin.dq dqVar = this.f113313d;
        zb4Var.set(2, dqVar.f365323d.getContext().getString(com.tencent.mm.R.string.f491563dj5));
        ((mm2.s2) dqVar.P0(mm2.s2.class)).f329411p.postValue(zb4Var);
        return jz5.f0.f302826a;
    }
}

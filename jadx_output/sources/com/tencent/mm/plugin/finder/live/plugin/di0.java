package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class di0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ji0 f112293d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.z63 f112294e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di0(com.tencent.mm.plugin.finder.live.plugin.ji0 ji0Var, r45.z63 z63Var) {
        super(1);
        this.f112293d = ji0Var;
        this.f112294e = z63Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        r45.z63 z63Var = this.f112294e;
        com.tencent.mm.plugin.finder.live.plugin.ji0 ji0Var = this.f112293d;
        if (booleanValue) {
            com.tencent.mm.plugin.finder.live.plugin.ji0.t1(ji0Var, z63Var, true);
            ji0Var.v1(true, z63Var);
        } else {
            com.tencent.mm.plugin.finder.live.plugin.ji0.t1(ji0Var, z63Var, false);
            ji0Var.v1(false, z63Var);
        }
        return jz5.f0.f302826a;
    }
}

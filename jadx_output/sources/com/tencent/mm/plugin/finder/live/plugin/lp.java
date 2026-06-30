package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class lp extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.dq f113429d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ad5 f113430e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f113431f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp(com.tencent.mm.plugin.finder.live.plugin.dq dqVar, r45.ad5 ad5Var, long j17) {
        super(0);
        this.f113429d = dqVar;
        this.f113430e = ad5Var;
        this.f113431f = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        db5.t7.makeText(this.f113429d.f365323d.getContext(), "该批次d = " + this.f113430e.getString(3) + " 过期时间 = " + this.f113431f, 0).show();
        return jz5.f0.f302826a;
    }
}

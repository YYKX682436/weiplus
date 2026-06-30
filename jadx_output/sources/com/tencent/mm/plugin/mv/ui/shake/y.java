package com.tencent.mm.plugin.mv.ui.shake;

/* loaded from: classes11.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f150969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f150970e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.shake.a0 f150971f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(long j17, long j18, com.tencent.mm.plugin.mv.ui.shake.a0 a0Var) {
        super(0);
        this.f150969d = j17;
        this.f150970e = j18;
        this.f150971f = a0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        long j17 = this.f150969d;
        if (j17 > 0) {
            long j18 = this.f150970e;
            if (j18 > 0 && j18 - j17 > 0) {
                com.tencent.mm.plugin.mv.ui.shake.a0.a(this.f150971f, (int) j17);
            }
        }
        return jz5.f0.f302826a;
    }
}

package com.tencent.mm.plugin.finder.nearby.video;

/* loaded from: classes2.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.video.d0 f122169d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.tencent.mm.plugin.finder.nearby.video.d0 d0Var) {
        super(0);
        this.f122169d = d0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.assist.n3 n3Var = com.tencent.mm.plugin.finder.assist.n3.f102399a;
        boolean a17 = n3Var.a();
        com.tencent.mm.plugin.finder.nearby.video.d0 d0Var = this.f122169d;
        if (a17) {
            if (!((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(d85.g0.LOCAION, d85.f0.f227163n)) {
                d0Var.f122177f.checkAndShowBusinessPermissionDialog();
                return jz5.f0.f302826a;
            }
        }
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).qj(d0Var.f122175d, 2);
        n3Var.c(d0Var.f122175d, true);
        return jz5.f0.f302826a;
    }
}

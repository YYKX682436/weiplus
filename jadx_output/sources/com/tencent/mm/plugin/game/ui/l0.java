package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.f f141452d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f141453e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameCenterUI5 f141454f;

    public l0(com.tencent.mm.plugin.game.ui.GameCenterUI5 gameCenterUI5, com.tencent.mm.protobuf.f fVar, long j17) {
        this.f141454f = gameCenterUI5;
        this.f141452d = fVar;
        this.f141453e = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        m53.a2 a2Var;
        com.tencent.mm.protobuf.f fVar = this.f141452d;
        if (fVar == null) {
            a2Var = new m53.a2();
        } else {
            a2Var = (m53.a2) fVar;
            ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ri().J0("pb_index_4", a2Var);
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.game.ui.k0(this, new com.tencent.mm.plugin.game.model.x1(a2Var, true)));
    }
}

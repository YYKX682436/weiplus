package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.model.x1 f141669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.o0 f141670e;

    public n0(com.tencent.mm.plugin.game.ui.o0 o0Var, com.tencent.mm.plugin.game.model.x1 x1Var) {
        this.f141670e = o0Var;
        this.f141669d = x1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.ui.GameCenterUI5.Z6(this.f141670e.f141689d, this.f141669d, 1);
    }
}

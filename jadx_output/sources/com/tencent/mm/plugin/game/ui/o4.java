package com.tencent.mm.plugin.game.ui;

/* loaded from: classes5.dex */
public class o4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.f f141693d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameLibraryUI f141694e;

    public o4(com.tencent.mm.plugin.game.ui.GameLibraryUI gameLibraryUI, com.tencent.mm.protobuf.f fVar) {
        this.f141694e = gameLibraryUI;
        this.f141693d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.ui.GameLibraryUI gameLibraryUI = this.f141694e;
        int i17 = gameLibraryUI.f140911s;
        com.tencent.mm.plugin.game.model.y1 y1Var = new com.tencent.mm.plugin.game.model.y1(this.f141693d, i17 == 0 && !gameLibraryUI.f140909q, true, i17);
        gameLibraryUI.f140909q = true;
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.game.ui.n4(this, y1Var));
    }
}

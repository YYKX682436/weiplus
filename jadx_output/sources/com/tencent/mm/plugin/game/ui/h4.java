package com.tencent.mm.plugin.game.ui;

/* loaded from: classes5.dex */
public class h4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.model.y1 f141411d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.i4 f141412e;

    public h4(com.tencent.mm.plugin.game.ui.i4 i4Var, com.tencent.mm.plugin.game.model.y1 y1Var) {
        this.f141412e = i4Var;
        this.f141411d = y1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.ui.GameLibraryUI.T6(this.f141412e.f141422e, this.f141411d, false);
    }
}

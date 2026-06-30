package com.tencent.mm.plugin.game.ui;

/* loaded from: classes5.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.f f141390d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameCategoryUI f141391e;

    public g0(com.tencent.mm.plugin.game.ui.GameCategoryUI gameCategoryUI, com.tencent.mm.protobuf.f fVar) {
        this.f141391e = gameCategoryUI;
        this.f141390d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.ui.GameCategoryUI gameCategoryUI = this.f141391e;
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.game.ui.f0(this, new com.tencent.mm.plugin.game.model.u1(this.f141390d, gameCategoryUI.f140692n, gameCategoryUI.f140690i)));
    }
}

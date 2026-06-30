package com.tencent.mm.plugin.game.ui;

/* loaded from: classes5.dex */
public class i4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f141421d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameLibraryUI f141422e;

    public i4(com.tencent.mm.plugin.game.ui.GameLibraryUI gameLibraryUI, byte[] bArr) {
        this.f141422e = gameLibraryUI;
        this.f141421d = bArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.game.ui.h4(this, new com.tencent.mm.plugin.game.model.y1(this.f141421d)));
    }
}

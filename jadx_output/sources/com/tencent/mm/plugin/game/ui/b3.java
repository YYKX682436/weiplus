package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class b3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.f f141043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f141044e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameDownloadGuidanceUI f141045f;

    public b3(com.tencent.mm.plugin.game.ui.GameDownloadGuidanceUI gameDownloadGuidanceUI, com.tencent.mm.protobuf.f fVar, long j17) {
        this.f141045f = gameDownloadGuidanceUI;
        this.f141043d = fVar;
        this.f141044e = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.ui.GameDownloadGuidanceUI gameDownloadGuidanceUI = this.f141045f;
        com.tencent.mm.protobuf.f fVar = this.f141043d;
        if (fVar == null) {
            gameDownloadGuidanceUI.f140760y = new m53.e2();
        } else {
            gameDownloadGuidanceUI.f140760y = (m53.e2) fVar;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.game.ui.a3(this, new com.tencent.mm.plugin.game.model.v1(fVar)));
    }
}

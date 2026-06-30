package com.tencent.mm.plugin.gamelive.playgame;

/* loaded from: classes8.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveIntPayload f142095d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gamelive.playgame.a f142096e;

    public b(com.tencent.mm.plugin.gamelive.playgame.a aVar, com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveIntPayload gameLiveAppbrandEventService$LiveIntPayload) {
        this.f142096e = aVar;
        this.f142095d = gameLiveAppbrandEventService$LiveIntPayload;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f142095d.f142023d;
        com.tencent.mm.plugin.gamelive.playgame.a aVar = this.f142096e;
        if (i17 == 0) {
            android.content.Context context = aVar.f142073b;
            db5.t7.i(context, context.getString(com.tencent.mm.R.string.a0s), com.tencent.mm.R.raw.icons_filled_done);
            return;
        }
        android.content.Context context2 = aVar.f142073b;
        db5.t7.i(context2, context2.getString(com.tencent.mm.R.string.a0t), com.tencent.mm.R.raw.icons_filled_error);
        aVar.f142072a.s();
        com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LivePlayGamePayLoad gameLiveAppbrandEventService$LivePlayGamePayLoad = aVar.f142083l;
        gameLiveAppbrandEventService$LivePlayGamePayLoad.f142038p = 1;
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData(p60.l.f352186y, null, 0, gameLiveAppbrandEventService$LivePlayGamePayLoad), p60.q.class, null);
    }
}

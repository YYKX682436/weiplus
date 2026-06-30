package com.tencent.mm.plugin.music.model.notification;

/* loaded from: classes11.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.music.model.notification.MMMusicPlayerService f150651d;

    public h(com.tencent.mm.plugin.music.model.notification.MMMusicPlayerService mMMusicPlayerService) {
        this.f150651d = mMMusicPlayerService;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MMMusicPlayerService", "quit");
        com.tencent.mm.plugin.music.model.notification.MMMusicPlayerService mMMusicPlayerService = this.f150651d;
        com.tencent.mm.sdk.platformtools.u3.l(mMMusicPlayerService.f150633e);
        mMMusicPlayerService.stopSelf();
    }
}

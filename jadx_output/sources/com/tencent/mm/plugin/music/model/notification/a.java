package com.tencent.mm.plugin.music.model.notification;

/* loaded from: classes11.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.music.model.notification.e f150634d;

    public a(com.tencent.mm.plugin.music.model.notification.e eVar) {
        this.f150634d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MMMusicNotification", "close");
        com.tencent.mm.plugin.music.model.notification.e eVar = this.f150634d;
        com.tencent.mm.sdk.platformtools.u3.l(eVar.f150645f);
        eVar.f150642c.stopForeground(true);
        eVar.f150641b = null;
    }
}

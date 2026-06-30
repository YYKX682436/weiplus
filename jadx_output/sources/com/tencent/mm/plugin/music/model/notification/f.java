package com.tencent.mm.plugin.music.model.notification;

/* loaded from: classes11.dex */
public class f extends l85.s0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.music.model.notification.g f150647f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.plugin.music.model.notification.g gVar, android.content.Intent intent) {
        super(intent);
        this.f150647f = gVar;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MMMusicNotificationHelper", "onServiceConnected");
        if (!(iBinder instanceof com.tencent.mm.plugin.music.model.notification.i)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.MMMusicNotificationHelper", "service %s isn't MMMusicPlayerService, err, return", iBinder.getClass().getName());
            iz5.a.g(null, false);
        } else {
            this.f150647f.f150649b = false;
            this.f150647f.f150648a = ((com.tencent.mm.plugin.music.model.notification.i) iBinder).f150652d;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MMMusicNotificationHelper", "onServiceDisconnected");
        this.f150647f.f150649b = false;
        this.f150647f.f150648a = null;
    }
}

package com.tencent.mm.plugin.talkroom.component;

/* loaded from: classes7.dex */
public class TalkRoomService extends android.app.Service {

    /* renamed from: d, reason: collision with root package name */
    public ah4.y f172447d;

    static {
        com.tencent.mars.xlog.Log.i("MicroMsg.TalkRoomService", "" + java.lang.Thread.currentThread().getId());
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        java.util.Objects.toString(java.lang.Thread.currentThread());
        return this.f172447d;
    }

    @Override // android.app.Service
    public void onCreate() {
        java.util.Objects.toString(java.lang.Thread.currentThread());
        super.onCreate();
        if (this.f172447d == null) {
            this.f172447d = new ah4.y();
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        java.util.Objects.toString(java.lang.Thread.currentThread());
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(android.content.Intent intent) {
        java.util.Objects.toString(java.lang.Thread.currentThread());
        super.onRebind(intent);
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent intent) {
        java.util.Objects.toString(java.lang.Thread.currentThread());
        return super.onUnbind(intent);
    }
}

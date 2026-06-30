package com.tencent.mm.remoteservice;

/* loaded from: classes8.dex */
public class RemoteService extends android.app.Service {

    /* renamed from: d, reason: collision with root package name */
    public final k55.g f192209d = new k55.i(this);

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        java.lang.Thread.currentThread().getId();
        return this.f192209d;
    }

    @Override // android.app.Service
    public void onDestroy() {
        java.lang.Thread.currentThread().getId();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(android.content.Intent intent) {
        java.lang.Thread.currentThread().getId();
        super.onRebind(intent);
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent intent) {
        java.lang.Thread.currentThread().getId();
        return super.onUnbind(intent);
    }
}

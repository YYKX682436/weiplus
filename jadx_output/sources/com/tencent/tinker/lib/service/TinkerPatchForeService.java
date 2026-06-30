package com.tencent.tinker.lib.service;

/* loaded from: classes7.dex */
public class TinkerPatchForeService extends android.app.Service {
    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return new sv5.a(this);
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        super.onStartCommand(intent, i17, i18);
        return 2;
    }
}

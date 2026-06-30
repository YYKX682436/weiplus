package com.tencent.mm.plugin.hp.mmdiff;

/* loaded from: classes11.dex */
public abstract class AbstractMMdiffResultService extends android.app.IntentService {
    public AbstractMMdiffResultService() {
        super("TinkerResultService");
    }

    public abstract void a(x73.a aVar);

    @Override // android.app.IntentService
    public void onHandleIntent(android.content.Intent intent) {
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("Tinker.AbstractMMdiffResultService", "AbstractMMdiffResultService received a null intent, ignoring.");
        } else {
            a((x73.a) ak0.a0.a(intent, "result_extra"));
        }
    }
}

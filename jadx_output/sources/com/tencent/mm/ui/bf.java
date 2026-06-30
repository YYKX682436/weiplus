package com.tencent.mm.ui;

/* loaded from: classes12.dex */
public class bf extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.cf f197882a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(com.tencent.mm.ui.cf cfVar, android.os.Looper looper) {
        super(looper);
        this.f197882a = cfVar;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        super.handleMessage(message);
        if (message.what == 255) {
            this.f197882a.b();
            com.tencent.mars.xlog.Log.w("MicroMsg.MainThreadSyncBarrier", "Remove sync barrier from a protection timer. Unexpected.");
        }
    }
}

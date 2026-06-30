package io3;

/* loaded from: classes13.dex */
public class b extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io3.c f293499a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(io3.c cVar, java.lang.String str) {
        super(str);
        this.f293499a = cVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        try {
            this.f293499a.a(message);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NormsgSensorEngine", "NormsgSensorEngineWorker handle msg error:" + th6.getMessage());
        }
    }
}

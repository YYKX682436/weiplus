package dz0;

/* loaded from: classes5.dex */
public final class s2 implements pp0.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.speech.MJSpeechManager f245005a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f245006b;

    public s2(com.tencent.maas.speech.MJSpeechManager mjSpeechManager) {
        kotlin.jvm.internal.o.g(mjSpeechManager, "mjSpeechManager");
        this.f245005a = mjSpeechManager;
    }

    public void a() {
        synchronized (this) {
            if (this.f245006b) {
                return;
            }
            this.f245005a.a();
        }
    }

    public int b(java.lang.String submitTaskID, com.tencent.maas.speech.MJILinkAppRequest iLinkAppRequest, java.lang.String iLinkCmd, java.nio.ByteBuffer contextBuff, com.tencent.maas.speech.b complete) {
        kotlin.jvm.internal.o.g(submitTaskID, "submitTaskID");
        kotlin.jvm.internal.o.g(iLinkAppRequest, "iLinkAppRequest");
        kotlin.jvm.internal.o.g(iLinkCmd, "iLinkCmd");
        kotlin.jvm.internal.o.g(contextBuff, "contextBuff");
        kotlin.jvm.internal.o.g(complete, "complete");
        synchronized (this) {
            if (this.f245006b) {
                return 0;
            }
            return this.f245005a.d(submitTaskID, iLinkAppRequest, iLinkCmd, contextBuff, complete);
        }
    }

    public void c() {
        synchronized (this) {
            if (this.f245006b) {
                return;
            }
            this.f245006b = true;
            this.f245005a.e();
        }
    }

    public int d(com.tencent.maas.speech.MJAsyncTTSSubmitRequestInfo ttsInfo, com.tencent.maas.speech.MJILinkAppRequest iLinkAppRequest, java.lang.String iLinkCmd, com.tencent.maas.speech.c complete) {
        kotlin.jvm.internal.o.g(ttsInfo, "ttsInfo");
        kotlin.jvm.internal.o.g(iLinkAppRequest, "iLinkAppRequest");
        kotlin.jvm.internal.o.g(iLinkCmd, "iLinkCmd");
        kotlin.jvm.internal.o.g(complete, "complete");
        synchronized (this) {
            if (this.f245006b) {
                return 0;
            }
            return this.f245005a.i(ttsInfo, iLinkAppRequest, iLinkCmd, complete);
        }
    }
}

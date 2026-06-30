package po3;

/* loaded from: classes4.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f357338d;

    public n(po3.o oVar, long j17) {
        this.f357338d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17 = this.f357338d;
        com.tencent.mars.xlog.Log.i("MicroMsg.SendSnsFailNotification", "resend snsInfo id:%d", java.lang.Long.valueOf(j17));
        com.tencent.mm.autogen.events.ResendSnsEvent resendSnsEvent = new com.tencent.mm.autogen.events.ResendSnsEvent();
        resendSnsEvent.f54706g.f8211a = (int) j17;
        resendSnsEvent.e();
    }
}

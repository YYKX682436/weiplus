package po3;

/* loaded from: classes9.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f357333d;

    public j(po3.k kVar, long j17, com.tencent.mm.storage.f9 f9Var) {
        this.f357333d = f9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.events.ResendMsgEvent resendMsgEvent = new com.tencent.mm.autogen.events.ResendMsgEvent();
        resendMsgEvent.f54704g.f8032a = this.f357333d;
        resendMsgEvent.e();
    }
}

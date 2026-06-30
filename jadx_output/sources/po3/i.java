package po3;

/* loaded from: classes9.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.SendMsgSuccessEvent f357331d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ po3.k f357332e;

    public i(po3.k kVar, com.tencent.mm.autogen.events.SendMsgSuccessEvent sendMsgSuccessEvent) {
        this.f357332e = kVar;
        this.f357331d = sendMsgSuccessEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.storage.f9 f9Var = this.f357331d.f54755g.f7659a;
        if (po3.k.A(f9Var.Q0())) {
            this.f357332e.r(f9Var);
        }
    }
}

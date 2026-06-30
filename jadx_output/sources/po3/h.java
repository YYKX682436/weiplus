package po3;

/* loaded from: classes9.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.SendMsgFailEvent f357329d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ po3.k f357330e;

    public h(po3.k kVar, com.tencent.mm.autogen.events.SendMsgFailEvent sendMsgFailEvent) {
        this.f357330e = kVar;
        this.f357329d = sendMsgFailEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.storage.f9 f9Var = this.f357329d.f54753g.f7461a;
        if (po3.k.A(f9Var.Q0())) {
            this.f357330e.q(f9Var);
        }
    }
}

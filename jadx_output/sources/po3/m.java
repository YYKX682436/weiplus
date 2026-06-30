package po3;

/* loaded from: classes4.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.SnsPostFailEvent f357336d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ po3.o f357337e;

    public m(po3.o oVar, com.tencent.mm.autogen.events.SnsPostFailEvent snsPostFailEvent) {
        this.f357337e = oVar;
        this.f357336d = snsPostFailEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        c01.d9.b().p().w(589825, java.lang.Boolean.TRUE);
        po3.g gVar = new po3.g();
        com.tencent.mm.autogen.events.SnsPostFailEvent snsPostFailEvent = this.f357336d;
        gVar.f357328a = snsPostFailEvent.f54829g.f7276a;
        this.f357337e.q(gVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.SendSnsFailNotification", "SnsPostFailEventListener receive id:%s", java.lang.String.valueOf(snsPostFailEvent.f54829g.f7276a));
    }
}

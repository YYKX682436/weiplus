package po3;

/* loaded from: classes4.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.SnsPostSuccessEvent f357334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ po3.o f357335e;

    public l(po3.o oVar, com.tencent.mm.autogen.events.SnsPostSuccessEvent snsPostSuccessEvent) {
        this.f357335e = oVar;
        this.f357334d = snsPostSuccessEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        po3.g gVar = new po3.g();
        gVar.f357328a = this.f357334d.f54831g.f7465a;
        this.f357335e.r(gVar);
    }
}

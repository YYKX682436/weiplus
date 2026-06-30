package qt3;

/* loaded from: classes8.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qt3.j f366643d;

    public i(qt3.j jVar) {
        this.f366643d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String a17 = q75.c.a("jpg");
        qt3.j jVar = this.f366643d;
        com.tencent.mm.vfs.w6.c(jVar.f366644d.f366647e.f155662f, a17);
        com.tencent.mm.vfs.w6.h(jVar.f366644d.f366647e.f155662f);
        q75.c.f(a17, com.tencent.mm.sdk.platformtools.x2.f193071a);
    }
}

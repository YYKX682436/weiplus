package wd;

/* loaded from: classes7.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wd.k f444686d;

    public i(wd.k kVar) {
        this.f444686d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        wd.k kVar = this.f444686d;
        kVar.a();
        wd.j jVar = new wd.j(kVar);
        ah.i.f4715a = jVar;
        g8.g.f269409a = new ah.h(jVar);
    }
}

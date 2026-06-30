package mp5;

/* loaded from: classes9.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mp5.j f330485d;

    public i(mp5.j jVar) {
        this.f330485d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        mp5.j jVar = this.f330485d;
        if (jVar.f330486a) {
            return;
        }
        jVar.f330487b.f213814r.setVisibility(0);
        jVar.f330487b.f213820x.setVisibility(4);
    }
}

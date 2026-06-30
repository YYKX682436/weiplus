package t23;

/* loaded from: classes10.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f415283d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t23.x0 f415284e;

    public w0(t23.x0 x0Var, boolean z17) {
        this.f415284e = x0Var;
        this.f415283d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        t23.h hVar = this.f415284e.f415290d;
        t23.j jVar = hVar.f415165n;
        jVar.f415192g.remove(hVar);
        jVar.f415190e++;
        jVar.j();
        if (this.f415283d) {
            jVar.f415186a.d(hVar.f415158d, hVar.f415163i, 12288, null, true, -1, hVar.f415164m);
        }
    }
}

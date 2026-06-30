package ws3;

/* loaded from: classes9.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws3.j f449175d;

    public f(ws3.j jVar) {
        this.f449175d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ws3.j jVar = this.f449175d;
        jVar.f449181a = o25.b.e(jVar.f449183c.getContext());
        ws3.y yVar = jVar.f449184d;
        if (yVar != null) {
            yVar.f449205o = jVar.f449181a;
        }
    }
}

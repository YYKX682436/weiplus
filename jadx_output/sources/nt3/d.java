package nt3;

/* loaded from: classes10.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nt3.f f339758d;

    public d(nt3.f fVar) {
        this.f339758d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        nt3.f fVar = this.f339758d;
        fVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Story.GLThread", "draw");
        nt3.f0 f0Var = fVar.f339777c;
        if (f0Var != null) {
            f0Var.b();
        }
        rs0.g gVar = rs0.i.f399296a;
        rs0.h hVar = fVar.f339778d;
        gVar.x(hVar.f399292a, hVar.f399293b);
    }
}

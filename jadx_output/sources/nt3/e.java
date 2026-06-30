package nt3;

/* loaded from: classes10.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nt3.f f339766d;

    public e(nt3.f fVar) {
        this.f339766d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        nt3.f fVar = this.f339766d;
        fVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Story.GLThread", "destoryGL");
        rs0.i.f399296a.u(fVar.f339778d);
        fVar.f339779e.quit();
        fVar.f339777c.c();
    }
}

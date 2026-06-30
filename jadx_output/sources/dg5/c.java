package dg5;

/* loaded from: classes11.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dg5.d f232357d;

    public c(dg5.d dVar) {
        this.f232357d = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        s01.g aj6 = r01.q3.aj();
        dg5.d dVar = this.f232357d;
        aj6.D0(dVar.f232358d.f232368m);
        if (r01.q3.aj().P0(dVar.f232358d.f232367i) <= 0) {
            ((com.tencent.mm.storage.m4) c01.d9.b().r()).k(dVar.f232358d.f232367i);
        }
    }
}

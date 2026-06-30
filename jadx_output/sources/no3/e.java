package no3;

/* loaded from: classes11.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ no3.f f338752d;

    public e(no3.f fVar) {
        this.f338752d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        no3.f fVar = this.f338752d;
        if (fVar.f338753d >= 0) {
            ((com.tencent.mm.booter.notification.x) c01.d9.f()).getClass();
            com.tencent.mm.booter.notification.l0.f63501a.c(fVar.f338753d, fVar.f338756g);
        }
        no3.i iVar = fVar.f338757h.f338759e.f338760a;
        if (iVar.f338761d) {
            iVar.f338761d = false;
            ((com.tencent.mm.booter.notification.x) c01.d9.f()).getClass();
            com.tencent.mm.booter.notification.h0.c(false);
        }
    }
}

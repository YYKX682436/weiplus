package tu1;

/* loaded from: classes13.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tu1.o f422089d;

    public b(tu1.o oVar) {
        this.f422089d = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xu1.c cVar = xu1.c.f457195i;
        tu1.o oVar = this.f422089d;
        oVar.f422127r = cVar;
        yz5.l lVar = oVar.f422128s;
        if (lVar != null) {
            lVar.invoke(cVar);
        }
    }
}

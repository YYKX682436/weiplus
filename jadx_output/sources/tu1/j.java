package tu1;

/* loaded from: classes13.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tu1.o f422101d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xu1.c f422102e;

    public j(tu1.o oVar, xu1.c cVar) {
        this.f422101d = oVar;
        this.f422102e = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yz5.l lVar = this.f422101d.f422128s;
        if (lVar != null) {
            lVar.invoke(this.f422102e);
        }
    }
}

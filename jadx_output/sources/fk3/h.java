package fk3;

/* loaded from: classes8.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk3.o f263557d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f263558e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f263559f;

    public h(fk3.o oVar, int i17, boolean z17) {
        this.f263557d = oVar;
        this.f263558e = i17;
        this.f263559f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fk3.o oVar = this.f263557d;
        ek3.d dVar = oVar.f263587c;
        android.graphics.Rect rect = dVar != null ? dVar.f253607v : null;
        int i17 = this.f263558e;
        if (rect != null) {
            oVar.d(i17, this.f263559f, oVar.f263589e);
            return;
        }
        kk3.d dVar2 = oVar.f263589e;
        if (dVar2 == null || dVar2 == null) {
            return;
        }
        dVar2.e(i17);
    }
}

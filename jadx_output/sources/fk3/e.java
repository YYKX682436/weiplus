package fk3;

/* loaded from: classes8.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk3.o f263549d;

    public e(fk3.o oVar) {
        this.f263549d = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fk3.o oVar = this.f263549d;
        kk3.d dVar = oVar.f263589e;
        if (dVar != null) {
            ek3.e eVar = oVar.f263588d;
            dVar.b(eVar != null ? eVar.getContentBitmap() : null, 3);
        }
    }
}

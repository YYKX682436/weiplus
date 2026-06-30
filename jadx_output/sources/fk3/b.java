package fk3;

/* loaded from: classes8.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk3.o f263543d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f263544e;

    public b(fk3.o oVar, android.graphics.Bitmap bitmap) {
        this.f263543d = oVar;
        this.f263544e = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kk3.d dVar = this.f263543d.f263589e;
        if (dVar != null) {
            dVar.b(this.f263544e, 3);
        }
    }
}

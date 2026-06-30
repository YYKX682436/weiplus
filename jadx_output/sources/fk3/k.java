package fk3;

/* loaded from: classes8.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk3.o f263572d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kk3.d f263573e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f263574f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f263575g;

    public k(fk3.o oVar, kk3.d dVar, android.graphics.Bitmap bitmap, int i17) {
        this.f263572d = oVar;
        this.f263573e = dVar;
        this.f263574f = bitmap;
        this.f263575g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fk3.o oVar = this.f263572d;
        ek3.e eVar = oVar.f263588d;
        if (eVar != null) {
            eVar.setTranslationX(0.0f);
        }
        ek3.e eVar2 = oVar.f263588d;
        if (eVar2 != null) {
            eVar2.setTranslationY(0.0f);
        }
        ek3.e eVar3 = oVar.f263588d;
        if (eVar3 != null) {
            eVar3.setScaleX(1.0f);
        }
        ek3.e eVar4 = oVar.f263588d;
        if (eVar4 != null) {
            eVar4.setScaleY(1.0f);
        }
        kk3.d dVar = this.f263573e;
        if (dVar != null) {
            dVar.d(this.f263574f, false, this.f263575g);
        }
    }
}

package gk3;

/* loaded from: classes8.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk3.d f272515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f272516e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f272517f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gk3.m f272518g;

    public j(kk3.d dVar, android.graphics.Bitmap bitmap, int i17, gk3.m mVar) {
        this.f272515d = dVar;
        this.f272516e = bitmap;
        this.f272517f = i17;
        this.f272518g = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kk3.d dVar = this.f272515d;
        if (dVar != null) {
            dVar.b(this.f272516e, this.f272517f);
        }
        gk3.m mVar = this.f272518g;
        ek3.e eVar = mVar.f272528d;
        if (eVar != null) {
            if ((eVar != null ? eVar.getParent() : null) != null) {
                ek3.e eVar2 = mVar.f272528d;
                android.view.ViewParent parent = eVar2 != null ? eVar2.getParent() : null;
                kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((android.view.ViewGroup) parent).removeView(mVar.f272528d);
            }
        }
    }
}

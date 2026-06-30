package gk3;

/* loaded from: classes8.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk3.m f272490d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f272491e;

    public b(gk3.m mVar, android.graphics.Bitmap bitmap) {
        this.f272490d = mVar;
        this.f272491e = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gk3.m mVar = this.f272490d;
        kk3.d dVar = mVar.f272529e;
        if (dVar != null) {
            dVar.b(this.f272491e, 3);
        }
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

package gk3;

/* loaded from: classes8.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk3.m f272495d;

    public e(gk3.m mVar) {
        this.f272495d = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gk3.m mVar = this.f272495d;
        kk3.d dVar = mVar.f272529e;
        if (dVar != null) {
            ek3.e eVar = mVar.f272528d;
            dVar.b(eVar != null ? eVar.getContentBitmap() : null, 3);
        }
        ek3.e eVar2 = mVar.f272528d;
        if (eVar2 != null) {
            if ((eVar2 != null ? eVar2.getParent() : null) != null) {
                ek3.e eVar3 = mVar.f272528d;
                android.view.ViewParent parent = eVar3 != null ? eVar3.getParent() : null;
                kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((android.view.ViewGroup) parent).removeView(mVar.f272528d);
            }
        }
    }
}

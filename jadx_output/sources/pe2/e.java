package pe2;

/* loaded from: classes3.dex */
public final class e implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pe2.h f353617d;

    public e(pe2.h hVar) {
        this.f353617d = hVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        mm2.f fVar = (mm2.f) obj;
        com.tencent.mars.xlog.Log.i("FinderLiveCheerAnimationPlugin", "onVideoPlayStateChange: " + fVar);
        int i17 = fVar == null ? -1 : pe2.d.f353616a[fVar.ordinal()];
        pe2.h hVar = this.f353617d;
        if (i17 == 1 || i17 == 2) {
            hVar.f353630p.setAlpha(1.0f);
        } else if (i17 == 3 || i17 == 4) {
            hVar.f353630p.setAlpha(0.0f);
        }
    }
}

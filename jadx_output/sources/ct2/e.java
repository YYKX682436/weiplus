package ct2;

/* loaded from: classes3.dex */
public final class e extends pf5.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f222253d = "LiveReplayCacheSlice";

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.r2 f222254e = new com.tencent.mm.sdk.platformtools.r2(50);

    public final void N6(long j17, int i17) {
        if (j17 == 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f222253d, "cache offset:" + i17 + " for liveId:" + j17);
        com.tencent.mm.sdk.platformtools.r2 r2Var = this.f222254e;
        zs2.g gVar = (zs2.g) r2Var.get(java.lang.Long.valueOf(j17));
        if (gVar != null) {
            gVar.f475257a = i17;
            return;
        }
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        zs2.g gVar2 = new zs2.g();
        gVar2.f475257a = i17;
    }

    @Override // pf5.e, androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
    }
}

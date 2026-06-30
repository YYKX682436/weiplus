package v31;

/* loaded from: classes7.dex */
public final class b implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public static final v31.b f433086d = new v31.b();

    @Override // u81.f
    public final void D(java.lang.String str, u81.b bVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicNewPlayable.JsApiInsertMiniProgramPlayableView", "onRunningStateChanged appId:" + str + " state:" + bVar);
        int i17 = bVar == null ? -1 : v31.a.f433085a[bVar.ordinal()];
        if (i17 == 1) {
            ((a41.k) ((a41.i) i95.n0.c(a41.i.class))).wi();
            return;
        }
        if (i17 != 2) {
            if (i17 != 3) {
                return;
            }
            ((a41.k) ((a41.i) i95.n0.c(a41.i.class))).Ni();
            return;
        }
        a41.k kVar = (a41.k) ((a41.i) i95.n0.c(a41.i.class));
        kVar.getClass();
        com.tencent.mars.xlog.Log.i("MagicNewPlayableFeatureService", "resumeBiz");
        y31.f fVar = kVar.f1189d;
        if (fVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", "resume");
            jc3.j0 j0Var = fVar.f459163d;
            if (j0Var != null) {
                ((rc3.w0) j0Var).A();
            }
        }
    }
}

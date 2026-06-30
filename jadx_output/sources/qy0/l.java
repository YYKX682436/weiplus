package qy0;

/* loaded from: classes5.dex */
public final class l implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qy0.d0 f367609d;

    public l(qy0.d0 d0Var) {
        this.f367609d = d0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        az0.o7 o7Var = (az0.o7) obj;
        com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasAlbumMultiTemplateOverlayUIC", "initView: recommend " + o7Var);
        if (o7Var.f15777b) {
            int Ri = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_finder_maas_recomend_fallback_type, bm5.h0.RepairerConfig_Maas_FinderFallBack_Int, 0);
            com.tencent.mars.xlog.Log.i("FinderMaasXConfigImpl", "finder fallback " + Ri);
            if (Ri == 1) {
                qy0.d0 d0Var = this.f367609d;
                kotlinx.coroutines.l.d(d0Var.getLifecycleScope(), null, null, new qy0.q(d0Var, null), 3, null);
            }
        }
    }
}

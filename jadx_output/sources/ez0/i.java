package ez0;

@j95.b
/* loaded from: classes5.dex */
public final class i extends i95.w implements androidx.lifecycle.m1, uy0.h {

    /* renamed from: d, reason: collision with root package name */
    public pz0.r f257806d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f257807e = kotlinx.coroutines.z0.b();

    /* renamed from: f, reason: collision with root package name */
    public final pf5.q f257808f = new pf5.q();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f257809g = new java.util.concurrent.CopyOnWriteArrayList();

    public void Ai(boolean z17) {
        az0.i5.s(az0.i5.f15557a, false, null, z17, 3, null);
    }

    @Override // androidx.lifecycle.m1
    /* renamed from: getViewModelStore */
    public androidx.lifecycle.l1 getViewModel() {
        return this.f257808f.f353930f;
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            oz0.c.f350201g.e();
            oz0.c.f350202h.e();
        }
        cz0.y yVar = cz0.y.f224969a;
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSdkResMgr", "init: SdkCompatVersion:" + cz0.y.f224970b);
        if (!com.tencent.mm.sdk.platformtools.z.f193115k) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MaasSdkResMgr", "check res only arm64");
            return;
        }
        java.util.List Ai = ((yy.a) ((zy.r) ((jz5.n) cz0.y.f224975g).getValue())).Ai(103);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init: resList ");
        sb6.append(Ai != null ? kz5.n0.g0(Ai, null, null, null, 0, null, cz0.v.f224966d, 31, null) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSdkResMgr", sb6.toString());
        if (Ai != null) {
            java.util.Iterator it = Ai.iterator();
            while (it.hasNext()) {
                int i17 = ((dm.v9) it.next()).field_subType;
                if (!com.tencent.mm.vfs.w6.j(cz0.m.f224956b + '/' + i17)) {
                    cz0.y yVar2 = cz0.y.f224969a;
                    java.lang.String Bi = ((yy.a) ((zy.r) ((jz5.n) cz0.y.f224975g).getValue())).Bi(103, i17);
                    com.tencent.mars.xlog.Log.i("MicroMsg.MaasSdkResMgr", "init: get cached file " + i17 + ", " + Bi);
                    if (Bi != null) {
                        yVar2.j(i17, Bi, 1);
                    }
                }
            }
        }
        ((ku5.t0) ku5.t0.f312615d).k(cz0.w.f224967d, 5000L);
        pm0.v.K(null, cz0.q.f224962d);
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.c0.clicfg_maas_clean_legacy_res, bm5.h0.RepairerConfig_Maas_CleanLegacyRes_Int, 1) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSdkResMgr", "isEnableCleanLegacyRes: " + z17);
        if (z17) {
            pm0.v.K(null, cz0.r.f224963d);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSdkResMgr", "init: end");
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f257808f.c();
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f257808f.b("PluginMaasTemplate");
    }

    public void wi(android.content.Context context, android.content.Intent originIntent, com.tencent.mm.mj_template.api.MaasAlbumMultiTemplateRequestParams params) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(originIntent, "originIntent");
        kotlin.jvm.internal.o.g(params, "params");
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginMJTemplate", "enterMultiTemplatePreviewUI");
        originIntent.setClass(context, com.tencent.mm.mj_template.album_template.multi_template.MaasAlbumMultiTemplatePreviewUI.class);
        originIntent.putExtra("request_params", params);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(originIntent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/mj_template/plugin/PluginMaasTemplate", "enterMultiTemplatePreviewUI", "(Landroid/content/Context;Landroid/content/Intent;Lcom/tencent/mm/mj_template/api/MaasAlbumMultiTemplateRequestParams;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/mj_template/plugin/PluginMaasTemplate", "enterMultiTemplatePreviewUI", "(Landroid/content/Context;Landroid/content/Intent;Lcom/tencent/mm/mj_template/api/MaasAlbumMultiTemplateRequestParams;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}

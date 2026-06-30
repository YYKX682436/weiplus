package ez0;

/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final ez0.o f257835a = new ez0.o();

    public final boolean a() {
        boolean z17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("SnsVideoDefaultTemplatetBgmRecommendEnabled", 1) == 1;
        com.tencent.mars.xlog.Log.i("SnsMaasConfigImpl", "enableDefaultBGMRecommend() called enable: " + z17);
        return z17;
    }

    public final boolean b() {
        boolean d17 = d(bm5.h0.RepairerConfig_Maas_RecommendTempalteBgmRecommendEnable_Int, "SnsVideoNondefaultTemplateBgmRecommendEnabled", true);
        com.tencent.mars.xlog.Log.i("SnsMaasConfigImpl", "enableRecommendBGMRecommend() called enable: " + d17);
        return d17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.mjtemplate.RepairerConfigSnsAlbumTemplateAsyncClip()) == 1) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c() {
        /*
            r5 = this;
            az0.i5 r0 = az0.i5.f15557a
            boolean r0 = r0.m()
            java.lang.String r1 = "SnsMaasConfigImpl"
            r2 = 0
            if (r0 != 0) goto L11
            java.lang.String r0 = "enableUseAsyncExport: false, unable MaasCoreUsageCount"
            com.tencent.mars.xlog.Log.i(r1, r0)
            return r2
        L11:
            bm5.o1 r0 = bm5.o1.f22719a
            com.tencent.mm.repairer.config.mjtemplate.RepairerConfigSnsAlbumTemplateAsyncClip r3 = new com.tencent.mm.repairer.config.mjtemplate.RepairerConfigSnsAlbumTemplateAsyncClip
            r3.<init>()
            int r0 = r0.h(r3)
            r3 = 1
            if (r0 == r3) goto L37
            r4 = 2
            if (r0 == r4) goto L38
            java.lang.Class<e42.e0> r0 = e42.e0.class
            i95.m r0 = i95.n0.c(r0)
            e42.e0 r0 = (e42.e0) r0
            com.tencent.mm.repairer.config.mjtemplate.RepairerConfigSnsAlbumTemplateAsyncClip r4 = new com.tencent.mm.repairer.config.mjtemplate.RepairerConfigSnsAlbumTemplateAsyncClip
            r4.<init>()
            h62.d r0 = (h62.d) r0
            int r0 = r0.nj(r4)
            if (r0 != r3) goto L38
        L37:
            r2 = r3
        L38:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "enableUseAsyncExport="
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r3 = ", enableMaasCoreUsageCount=true"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ez0.o.c():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d(bm5.h0 h0Var, java.lang.String str, boolean z17) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(bm5.o1.f22719a.g(h0Var, -1));
        if ((valueOf.intValue() != -1) == false) {
            valueOf = null;
        }
        return (valueOf != null ? valueOf.intValue() : ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b(str, z17 ? 1 : 0)) == 1;
    }

    public final java.util.List e() {
        java.lang.Object m521constructorimpl;
        java.lang.Object m521constructorimpl2;
        com.tencent.mars.xlog.Log.i("SnsMaasConfigImpl", "getDefaultTemplateIdList");
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SnsVideoDefaultTemplate");
        if (d17 == null) {
            d17 = "";
        }
        com.tencent.mars.xlog.Log.i("SnsMaasConfigImpl", "getDefaultTemplateIdList: ".concat(d17));
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(new org.json.JSONObject(d17));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            m521constructorimpl = null;
        }
        org.json.JSONObject jSONObject = (org.json.JSONObject) m521constructorimpl;
        kz5.p0 p0Var = kz5.p0.f313996d;
        if (jSONObject == null) {
            return p0Var;
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("tpls");
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                java.lang.String string = jSONArray.optJSONObject(i17).getString(dm.i4.COL_ID);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                arrayList.add(string);
            }
            m521constructorimpl2 = kotlin.Result.m521constructorimpl(arrayList);
        } catch (java.lang.Throwable th7) {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            m521constructorimpl2 = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th7));
        }
        java.util.List list = (java.util.List) (kotlin.Result.m527isFailureimpl(m521constructorimpl2) ? null : m521constructorimpl2);
        return list == null ? p0Var : list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0092, code lost:
    
        if (r0 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01c0 A[LOOP:0: B:15:0x018a->B:26:0x01c0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01be A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x015d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x01f9 -> B:10:0x01fa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x01fe -> B:11:0x0201). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ez0.o.f(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public boolean g(long j17) {
        if (j17 <= 2008004) {
            return h() && d(bm5.h0.RepairerConfig_Maas_SnsShowCreateSameEntry_Int, "SnsVideoTemplateUseSameTemplateEnabled", false);
        }
        com.tencent.mars.xlog.Log.i("SnsMaasConfigImpl", "showCutSameEntry: templateMin is " + j17 + ", sdk is 2008004");
        return false;
    }

    public boolean h() {
        com.tencent.mm.repairer.config.mjtemplate.RepairerConfigSnsAlbumTemplateEntrance repairerConfigSnsAlbumTemplateEntrance = new com.tencent.mm.repairer.config.mjtemplate.RepairerConfigSnsAlbumTemplateEntrance();
        boolean z17 = bm5.o1.f22719a.h(repairerConfigSnsAlbumTemplateEntrance) != 2 && 1 == ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(repairerConfigSnsAlbumTemplateEntrance);
        com.tencent.mars.xlog.Log.i("SnsMaasConfigImpl", "enableSnsShowAlbumTemplateEntrance: result:" + z17);
        return z17 && d(bm5.h0.RepairerConfig_Maas_SnsShowPostMainEntry_Int, "SnsVideoTemplateEnabled", false) && py0.b.f358971a.a();
    }
}

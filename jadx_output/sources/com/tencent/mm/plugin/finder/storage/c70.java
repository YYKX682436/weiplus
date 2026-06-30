package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class c70 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.c70 f126568d = new com.tencent.mm.plugin.finder.storage.c70();

    public c70() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Iterator it = kz5.c0.i(e42.d0.clicfg_finder_ftpp_codec_reuse_model_list_0, e42.d0.clicfg_finder_ftpp_codec_reuse_model_list_1, e42.d0.clicfg_finder_ftpp_codec_reuse_model_list_2, e42.d0.clicfg_finder_ftpp_codec_reuse_model_list_3, e42.d0.clicfg_finder_ftpp_codec_reuse_model_list_4, e42.d0.clicfg_finder_ftpp_codec_reuse_model_list_5, e42.d0.clicfg_finder_ftpp_codec_reuse_model_list_6, e42.d0.clicfg_finder_ftpp_codec_reuse_model_list_7, e42.d0.clicfg_finder_ftpp_codec_reuse_model_list_8, e42.d0.clicfg_finder_ftpp_codec_reuse_model_list_9).iterator();
        boolean z17 = false;
        while (it.hasNext()) {
            java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi((e42.d0) it.next(), (java.lang.String) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.E).getValue(), true);
            if (!android.text.TextUtils.isEmpty(Zi)) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(Zi);
                    if (jSONObject.getInt("mode") == 1) {
                        org.json.JSONArray jSONArray = jSONObject.getJSONArray("whitelist");
                        int length = jSONArray.length();
                        int i17 = 0;
                        while (true) {
                            if (i17 >= length) {
                                break;
                            }
                            if (r26.i0.p(wo.w0.m(), jSONArray.getString(i17), true)) {
                                z17 = true;
                                break;
                            }
                            i17++;
                        }
                        if (z17) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("FinderConfig", th6, "", new java.lang.Object[0]);
                }
            }
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1505L, 9L, z17 ? 1L : 0L);
        com.tencent.mars.xlog.Log.i("FinderConfig", "checkEnableCodecReuse enableCodecReuse:" + z17 + " duration:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        return java.lang.Boolean.valueOf(z17);
    }
}

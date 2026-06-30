package ql0;

@j95.b
/* loaded from: classes13.dex */
public final class l extends i95.w implements at.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f364493d = "MicroMsg.KaraLiveHomeRedDotApiImpl";

    public final void wi(java.lang.String str, boolean z17) {
        dm.n7 n7Var;
        boolean isEmpty = android.text.TextUtils.isEmpty(str);
        java.lang.String str2 = this.f364493d;
        if (isEmpty) {
            com.tencent.mars.xlog.Log.e(str2, "trainDataReport reddotId null");
            return;
        }
        ul0.c cVar = tl0.b.f420196c;
        if (cVar == null) {
            com.tencent.mars.xlog.Log.e(str2, "trainDataReport db null?");
            return;
        }
        android.database.Cursor B = cVar.f428559d.B("SELECT * FROM (select * from LiveHomeRedDotEvent where reddotId = '" + str + "' and action = 1)", new java.lang.String[0]);
        try {
            if (B.moveToFirst()) {
                n7Var = new dm.n7();
                n7Var.convertFrom(B);
            } else {
                n7Var = null;
            }
            B.close();
            if (n7Var == null) {
                com.tencent.mars.xlog.Log.e(str2, str + " bean null");
                return;
            }
            com.tencent.mm.kara.feature.feature.business.LiveHomeReddotClickFeatureGroup liveHomeReddotClickFeatureGroup = new com.tencent.mm.kara.feature.feature.business.LiveHomeReddotClickFeatureGroup(n7Var.field_reddotId, n7Var.field_reddotScore, n7Var.field_isReddotScoreValid > 0, n7Var.field_title, n7Var.field_anchorId);
            dm.u6 y07 = nl0.c.a().y0("LiveHomeRedDot", str);
            if (y07 == null) {
                y07 = new dm.u6();
                y07.field_type = "LiveHomeRedDot";
                y07.field_id = str;
                y07.field_version = java.lang.Integer.parseInt(com.tencent.mm.sdk.platformtools.z.f193111g.replace("0x", ""), 16);
            }
            hl0.e eVar = new hl0.e(y07.field_type, y07.field_id);
            eVar.f282059g = y07.field_extract_time;
            eVar.f282056d = y07.field_happen_time;
            eVar.f282057e = y07.field_predict_time;
            eVar.f282060h = y07.field_recall_time;
            eVar.f282058f = y07.field_prepare_time;
            eVar.f282072t = y07.field_desc;
            eVar.f282066n = y07.field_error_on_extract_all_feature;
            eVar.f282071s = y07.field_error_on_predict;
            eVar.f282067o = y07.field_all_heaviest_features;
            eVar.f282069q = y07.field_model_heaviest_features;
            eVar.f282075w = y07.field_predict_type;
            eVar.f282073u = y07.field_is_train_data_upload_finished;
            eVar.f282068p = y07.field_all_null_features;
            eVar.f282070r = y07.field_model_null_features;
            eVar.f282062j = y07.field_positive;
            eVar.f282061i = y07.field_prediction;
            eVar.f282065m = y07.field_time_on_extract_all_feature;
            eVar.f282064l = y07.field_time_on_extract;
            eVar.f282074v = y07.field_is_full_links_data_collector_finished;
            eVar.f282063k = y07.field_time_on_predict;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            liveHomeReddotClickFeatureGroup.build();
            long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
            com.tencent.mars.xlog.Log.i(str2, "build time:" + currentTimeMillis2);
            eVar.f282065m = currentTimeMillis2;
            double d17 = (double) 1000.0f;
            java.lang.String format = java.lang.String.format("%.4f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(eVar.f282056d / d17)}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            java.lang.String format2 = java.lang.String.format("%.4f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(eVar.f282060h / d17)}, 1));
            kotlin.jvm.internal.o.f(format2, "format(...)");
            em0.f.a(liveHomeReddotClickFeatureGroup, "LiveHomeRedDot", z17 ? 1 : 0, format, format2);
            eVar.f282073u = true;
            eVar.a();
            com.tencent.mars.xlog.Log.i(str2, "report " + str + ' ' + z17);
            if (nl0.c.f338160b == null) {
                nl0.c.b();
            }
            nl0.c.f338160b.z0("LiveHomeRedDot", str, liveHomeReddotClickFeatureGroup.h(), z17 ? 1 : 0);
            com.tencent.mm.sdk.platformtools.o4.L().putString("kara_live_home_last_reddot", str);
        } catch (java.lang.Throwable th6) {
            if (B != null) {
                B.close();
            }
            throw th6;
        }
    }
}

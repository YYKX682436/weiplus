package ml0;

/* loaded from: classes13.dex */
public class d extends ml0.b {

    /* renamed from: b, reason: collision with root package name */
    public static final ml0.d f327187b = new ml0.d();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ml0.b
    public boolean a() {
        if ((com.tencent.mm.sdk.platformtools.t8.P(j62.e.g().j("clicfg_plugin_kara_prophet_collect_open", "1", false, true), 1) != 0) != true) {
            com.tencent.mars.xlog.Log.i("Kara.FullLinkDataCollector", "no working");
            return false;
        }
        nl0.d a17 = nl0.c.a();
        long currentTimeMillis = java.lang.System.currentTimeMillis() - 86400000;
        a17.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor B = a17.f338163d.B("select * from KeyNodeInfo where is_full_links_data_collector_finished=false and happen_time<=?", new java.lang.String[]{java.lang.String.valueOf(currentTimeMillis)});
        while (B.moveToNext()) {
            try {
                dm.u6 u6Var = new dm.u6();
                u6Var.convertFrom(B);
                arrayList.add(u6Var);
            } catch (java.lang.Throwable th6) {
                if (B != null) {
                    B.close();
                }
                throw th6;
            }
        }
        B.close();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            dm.u6 u6Var2 = (dm.u6) it.next();
            if (u6Var2.field_type.equals("MomentVideo")) {
                com.tencent.mars.xlog.Log.i("Kara.FullLinkDataCollector", "begin: %s %s", u6Var2.field_type, u6Var2.field_id);
                u6Var2.field_is_full_links_data_collector_finished = true;
                a17.z0(u6Var2);
            }
            if (u6Var2.field_happen_time <= 0) {
                com.tencent.mars.xlog.Log.i("Kara.FullLinkDataCollector", "no happened");
            } else if (u6Var2.field_predict_time <= 0) {
                com.tencent.mars.xlog.Log.i("Kara.FullLinkDataCollector", "no predict");
            } else {
                em0.c cVar = new em0.c();
                cVar.f254992a = u6Var2.field_type;
                cVar.f254993b = !com.tencent.mm.sdk.platformtools.a0.c() ? 1 : 0;
                double doubleValue = java.lang.Double.valueOf(u6Var2.field_happen_time).doubleValue() / 1000.0d;
                cVar.f254994c = doubleValue == 0.0d ? "" : java.lang.String.format("%.4f", java.lang.Double.valueOf(doubleValue));
                double doubleValue2 = java.lang.Double.valueOf(u6Var2.field_predict_time).doubleValue() / 1000.0d;
                cVar.f254995d = doubleValue2 == 0.0d ? "" : java.lang.String.format("%.4f", java.lang.Double.valueOf(doubleValue2));
                double doubleValue3 = java.lang.Double.valueOf(u6Var2.field_prepare_time).doubleValue() / 1000.0d;
                cVar.f254996e = doubleValue3 == 0.0d ? "" : java.lang.String.format("%.4f", java.lang.Double.valueOf(doubleValue3));
                double doubleValue4 = java.lang.Double.valueOf(u6Var2.field_extract_time).doubleValue() / 1000.0d;
                cVar.f254997f = doubleValue4 == 0.0d ? "" : java.lang.String.format("%.4f", java.lang.Double.valueOf(doubleValue4));
                double doubleValue5 = java.lang.Double.valueOf(u6Var2.field_recall_time).doubleValue() / 1000.0d;
                cVar.f254998g = doubleValue5 == 0.0d ? "" : java.lang.String.format("%.4f", java.lang.Double.valueOf(doubleValue5));
                float f17 = u6Var2.field_prediction;
                cVar.f254999h = ((double) f17) == 0.0d ? "" : java.lang.String.format("%.4f", java.lang.Float.valueOf(f17));
                cVar.f255000i = java.lang.String.valueOf(u6Var2.field_positive);
                java.lang.String str = u6Var2.field_desc;
                if (str == null) {
                    str = "";
                }
                cVar.f255001j = str;
                double doubleValue6 = java.lang.Double.valueOf(u6Var2.field_time_on_predict).doubleValue() / 1000.0d;
                cVar.f255002k = doubleValue6 == 0.0d ? "" : java.lang.String.format("%.4f", java.lang.Double.valueOf(doubleValue6));
                java.lang.String str2 = u6Var2.field_error_on_predict;
                if (str2 == null) {
                    str2 = "";
                }
                cVar.f255003l = str2;
                double doubleValue7 = java.lang.Double.valueOf(u6Var2.field_time_on_extract).doubleValue() / 1000.0d;
                cVar.f255004m = doubleValue7 == 0.0d ? "" : java.lang.String.format("%.4f", java.lang.Double.valueOf(doubleValue7));
                double doubleValue8 = java.lang.Double.valueOf(u6Var2.field_time_on_extract_all_feature).doubleValue() / 1000.0d;
                cVar.f255007p = doubleValue8 == 0.0d ? "" : java.lang.String.format("%.4f", java.lang.Double.valueOf(doubleValue8));
                java.lang.String str3 = u6Var2.field_model_heaviest_features;
                if (str3 == null) {
                    str3 = "";
                }
                cVar.f255005n = str3;
                java.lang.String str4 = u6Var2.field_model_null_features;
                if (str4 == null) {
                    str4 = "";
                }
                cVar.f255006o = str4;
                java.lang.String str5 = u6Var2.field_error_on_extract_all_feature;
                if (str5 == null) {
                    str5 = "";
                }
                cVar.f255008q = str5;
                java.lang.String str6 = u6Var2.field_all_heaviest_features;
                if (str6 == null) {
                    str6 = "";
                }
                cVar.f255009r = str6;
                java.lang.String str7 = u6Var2.field_all_null_features;
                if (str7 == null) {
                    str7 = "";
                }
                cVar.f255010s = str7;
                cVar.f255011t = java.lang.String.valueOf(u6Var2.field_version);
                if (cVar.f254992a.equals("MomentVideo") && doubleValue2 > 0.0d) {
                    boolean z17 = u6Var2.field_recall_time > 0;
                    boolean z18 = u6Var2.field_positive == 1;
                    boolean z19 = u6Var2.field_predict_type == 1;
                    if (z17 && z18) {
                        em0.e.a(z19 ? 248L : 255L);
                    }
                    if (z17 && !z18) {
                        em0.e.a(z19 ? 245L : 252L);
                    }
                    if (!z17 && z18) {
                        em0.e.a(z19 ? 247L : 254L);
                    }
                    if (!z17 && !z18) {
                        em0.e.a(z19 ? 246L : 253L);
                    }
                    if (z18) {
                        em0.e.a(z19 ? 244L : 251L);
                    } else {
                        em0.e.a(z19 ? 243L : 250L);
                    }
                    em0.d.a(cVar.f254992a, cVar);
                }
                if (cVar.f254992a.equals("LiveHomeRedDot") && doubleValue2 > 0.0d && u6Var2.field_is_train_data_upload_finished) {
                    u6Var2.field_is_full_links_data_collector_finished = true;
                    a17.z0(u6Var2);
                    boolean z27 = u6Var2.field_recall_time > 0;
                    boolean z28 = u6Var2.field_positive == 1;
                    if (z27 && z28) {
                        em0.e.a(241L);
                    }
                    if (z27 && !z28) {
                        em0.e.a(238L);
                    }
                    if (!z27 && z28) {
                        em0.e.a(240L);
                    }
                    if (!z27 && !z28) {
                        em0.e.a(239L);
                    }
                    if (z28) {
                        em0.e.a(237L);
                    } else {
                        em0.e.a(236L);
                    }
                    em0.d.a(cVar.f254992a, cVar);
                }
                com.tencent.mars.xlog.Log.i("Kara.FullLinkDataCollector", "finish: %s %s", u6Var2.field_type, u6Var2.field_id);
            }
        }
        return true;
    }

    @Override // ml0.b
    public long b() {
        return 1800000L;
    }

    @Override // ml0.b
    public java.lang.String c() {
        return "ProphetCollector";
    }
}

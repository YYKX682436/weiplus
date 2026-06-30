package ml0;

/* loaded from: classes13.dex */
public class e extends ml0.b {

    /* renamed from: b, reason: collision with root package name */
    public static final ml0.e f327188b = new ml0.e();

    @Override // ml0.b
    public boolean a() {
        pl0.e eVar;
        if (!(com.tencent.mm.sdk.platformtools.t8.P(j62.e.g().a("clicfg_plugin_kara_label_collect_open", "1", false, true), 1) != 0)) {
            com.tencent.mars.xlog.Log.i("Kara.TrainDataCollector", "no working");
            return false;
        }
        com.tencent.mars.xlog.Log.i("Kara.TrainDataCollector", "run");
        nl0.d a17 = nl0.c.a();
        long currentTimeMillis = java.lang.System.currentTimeMillis() - 86400000;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.P(j62.e.g().a("clicfg_plugin_kara_is_save_data_local", "1", false, true), 1) != 0;
        a17.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor B = a17.f338163d.B("select * from KeyNodeInfo where is_train_data_upload_finished=false and happen_time<=?", new java.lang.String[]{java.lang.String.valueOf(currentTimeMillis)});
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
            if (com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.isBackground()) {
                com.tencent.mars.xlog.Log.i("Kara.TrainDataCollector", "background, skip");
                return true;
            }
            if (u6Var2.field_type.equals("MomentVideo")) {
                com.tencent.mars.xlog.Log.i("Kara.TrainDataCollector", "begin: %s %s", u6Var2.field_type, u6Var2.field_id);
                java.lang.String str = u6Var2.field_type;
                java.lang.String str2 = u6Var2.field_id;
                if (str.equals("MomentVideo")) {
                    com.tencent.mm.autogen.events.GetSnsVideoFeatureGroupEvent getSnsVideoFeatureGroupEvent = new com.tencent.mm.autogen.events.GetSnsVideoFeatureGroupEvent();
                    am.sg sgVar = getSnsVideoFeatureGroupEvent.f54417g;
                    sgVar.f7896a = str2;
                    getSnsVideoFeatureGroupEvent.e();
                    eVar = sgVar.f7897b;
                } else {
                    eVar = null;
                }
                if (eVar == null || u6Var2.field_happen_time <= 0) {
                    u6Var2.field_is_train_data_upload_finished = true;
                    a17.z0(u6Var2);
                    com.tencent.mars.xlog.Log.e("Kara.TrainDataCollector", "GetSnsVideoFeatureGroupEvent %s null", u6Var2.field_id);
                } else {
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                    eVar.build();
                    long currentTimeMillis3 = java.lang.System.currentTimeMillis() - currentTimeMillis2;
                    com.tencent.mars.xlog.Log.i("Kara.TrainDataCollector", "build time:" + currentTimeMillis3);
                    hl0.e eVar2 = new hl0.e(u6Var2.field_type, u6Var2.field_id);
                    eVar2.f282065m = currentTimeMillis3;
                    eVar2.a();
                    int i17 = u6Var2.field_recall_time > 0 ? 1 : 0;
                    em0.f.a(eVar, u6Var2.field_type, i17, java.lang.String.format("%.4f", java.lang.Double.valueOf(java.lang.Double.valueOf(u6Var2.field_happen_time).doubleValue() / 1000.0d)), java.lang.String.format("%.4f", java.lang.Double.valueOf(java.lang.Double.valueOf(u6Var2.field_recall_time).doubleValue() / 1000.0d)));
                    u6Var2.field_is_train_data_upload_finished = true;
                    a17.z0(u6Var2);
                    com.tencent.mars.xlog.Log.i("Kara.TrainDataCollector", "update succ: %s %s", u6Var2.field_type, u6Var2.field_id);
                    if (z17) {
                        java.lang.String str3 = u6Var2.field_type;
                        java.lang.String str4 = u6Var2.field_id;
                        java.lang.String h17 = eVar.h();
                        if (nl0.c.f338160b == null) {
                            nl0.c.b();
                        }
                        nl0.c.f338160b.z0(str3, str4, h17, i17);
                    }
                }
            }
        }
        return true;
    }

    @Override // ml0.b
    public long b() {
        return 3600000L;
    }

    @Override // ml0.b
    public java.lang.String c() {
        return "TrainData";
    }
}

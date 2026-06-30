package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class s3 extends com.tencent.mm.pluginsdk.model.j3 {

    /* renamed from: c, reason: collision with root package name */
    public final android.content.SharedPreferences f164665c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f164666d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f164667e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.pointers.PInt f164668f = new com.tencent.mm.pointers.PInt();

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.pointers.PInt f164669g = new com.tencent.mm.pointers.PInt();

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f164670h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f164671i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.t3 f164672j;

    public s3(com.tencent.mm.plugin.sns.model.t3 t3Var) {
        this.f164672j = t3Var;
        this.f164665c = null;
        this.f164666d = "";
        this.f164667e = "";
        this.f164665c = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("preferences_remove_task", 0);
        gm0.j1.i();
        if (gm0.j1.b().m()) {
            java.lang.String r17 = c01.z1.r();
            this.f164671i = r17;
            this.f164666d = "remove_key_base" + r17;
            this.f164667e = "remove_key" + r17;
            gm0.j1.i();
            if (!gm0.j1.b().m() || com.tencent.mm.plugin.sns.model.l4.Xj() || com.tencent.mm.plugin.sns.model.l4.aj() == null || com.tencent.mm.plugin.sns.model.l4.Ej() == null) {
                return;
            }
            this.f164670h = com.tencent.mm.plugin.sns.model.l4.Ej().J0(r17).field_bgId;
            boolean z17 = com.tencent.mm.plugin.sns.model.t3.f164686e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
            t3Var.f164688a = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
        }
    }

    @Override // com.tencent.mm.pluginsdk.model.j3
    public java.lang.Object a(java.lang.Object[] objArr) {
        java.lang.Boolean bool;
        java.lang.StringBuilder sb6;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$simpleClean");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$simpleClean");
        if (com.tencent.mm.plugin.sns.model.t3.f164686e) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
            boolean z17 = this.f164672j.f164688a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
            if (!z17) {
                bool = java.lang.Boolean.FALSE;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$simpleClean");
            } else if (com.tencent.mm.plugin.sns.model.l4.Xj()) {
                com.tencent.mm.plugin.sns.model.t3.f164686e = false;
                bool = java.lang.Boolean.FALSE;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$simpleClean");
            } else {
                java.lang.String str = this.f164666d;
                android.content.SharedPreferences sharedPreferences = this.f164665c;
                int i17 = sharedPreferences.getInt(str, 0);
                com.tencent.mm.pointers.PInt pInt = this.f164668f;
                pInt.value = i17;
                int i18 = sharedPreferences.getInt(this.f164667e, 0);
                com.tencent.mm.pointers.PInt pInt2 = this.f164669g;
                pInt2.value = i18;
                java.lang.String Di = com.tencent.mm.plugin.sns.model.l4.Di();
                try {
                    java.lang.System.currentTimeMillis();
                    sb6 = new java.lang.StringBuilder();
                    sb6.append(Di);
                    char[] cArr = com.tencent.mm.plugin.sns.model.t3.f164687f;
                    sb6.append(cArr[pInt.value % 36]);
                    sb6.append("/");
                    sb6.append(cArr[pInt2.value % 36]);
                } catch (java.lang.Exception unused) {
                }
                if (com.tencent.mm.plugin.sns.model.t3.a(sb6.toString(), this.f164670h, this.f164671i)) {
                    java.lang.System.currentTimeMillis();
                    bool = java.lang.Boolean.TRUE;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$simpleClean");
                } else {
                    bool = java.lang.Boolean.FALSE;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$simpleClean");
                }
            }
        } else {
            bool = java.lang.Boolean.FALSE;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$simpleClean");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$simpleClean");
        return bool;
    }

    @Override // com.tencent.mm.pluginsdk.model.j3
    public java.util.concurrent.ExecutorService b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExecutor", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$simpleClean");
        java.util.concurrent.ExecutorService cj6 = com.tencent.mm.plugin.sns.model.l4.cj();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExecutor", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$simpleClean");
        return cj6;
    }

    @Override // com.tencent.mm.pluginsdk.model.j3
    public void c(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$simpleClean");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$simpleClean");
        boolean z17 = com.tencent.mm.plugin.sns.model.t3.f164686e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$008", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
        com.tencent.mm.plugin.sns.model.t3 t3Var = this.f164672j;
        t3Var.f164690c++;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$008", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
        if (((java.lang.Boolean) obj).booleanValue()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNextFile", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
            com.tencent.mm.pointers.PInt pInt = this.f164669g;
            int i17 = pInt.value + 1;
            com.tencent.mm.pointers.PInt pInt2 = this.f164668f;
            if (i17 >= 36) {
                pInt.value = 0;
                pInt2.value = (pInt2.value + 1) % 36;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNextFile", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
            } else {
                pInt.value = i17 % 36;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNextFile", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
            }
            android.content.SharedPreferences sharedPreferences = this.f164665c;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putInt(this.f164666d, pInt2.value).apply();
                sharedPreferences.edit().putInt(this.f164667e, pInt.value).apply();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
            com.tencent.mm.sdk.platformtools.n3 n3Var = t3Var.f164691d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
            n3Var.sendEmptyMessageDelayed(0, 20000L);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
        t3Var.f164688a = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$simpleClean");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$simpleClean");
    }
}

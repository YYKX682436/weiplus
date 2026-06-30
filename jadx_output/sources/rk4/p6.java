package rk4;

@j95.b
/* loaded from: classes11.dex */
public final class p6 extends i95.w implements qk.e9 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f396897d = jz5.h.b(rk4.h6.f396693d);

    /* renamed from: e, reason: collision with root package name */
    public rk4.l f396898e = rk4.l.f396806e;

    /* renamed from: f, reason: collision with root package name */
    public final int f396899f = 1;

    public final boolean Ai() {
        return ((java.lang.Boolean) ((jz5.n) this.f396897d).getValue()).booleanValue();
    }

    public void Bi(bw5.yq0 action, bw5.xb0 xb0Var, java.lang.String str) {
        kotlin.jvm.internal.o.g(action, "action");
        action.toString();
        if (Ai()) {
            Zi(new rk4.d6(this, action, xb0Var, str));
        }
    }

    public void Di(int i17) {
        if (Ai()) {
            Zi(new rk4.f6(this, i17));
        }
    }

    public void Ni(int i17, bw5.o50 o50Var) {
        if (Ai()) {
            Zi(new rk4.g6(this, i17, o50Var));
        }
    }

    public void Ri(bw5.lp0 lp0Var, bw5.ar0 enterScene) {
        kotlin.jvm.internal.o.g(enterScene, "enterScene");
        enterScene.toString();
        if (lp0Var == null) {
            return;
        }
        Zi(new rk4.l6(lp0Var, enterScene));
    }

    public void Ui(bw5.yq0 action, bw5.xb0 xb0Var, java.lang.String str) {
        kotlin.jvm.internal.o.g(action, "action");
        action.toString();
        if (Ai()) {
            Zi(new rk4.m6(this, action, xb0Var, str));
        }
    }

    public void Vi(android.view.View view, long j17, java.lang.String json) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(json, "json");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(json);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("view_id", "tyt_service_notifications");
            bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
            hashMap.put("currscene", 2901);
            java.lang.String optString = jSONObject.optString("category_id");
            kotlin.jvm.internal.o.f(optString, "optString(...)");
            hashMap.put("actioncategoryid", optString);
            hashMap.put("actioncategorytype", java.lang.Integer.valueOf(jSONObject.optInt("type")));
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(view, "tyt_service_notifications");
            aVar.tk(view, "tyt_service_notifications_" + j17);
            aVar.Tj(view, 32, 5, true);
            aVar.gk(view, hashMap);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TingReportService", th6, "reportTingNotifyMessageCategoryItemExpose exception", new java.lang.Object[0]);
        }
    }

    public final void Zi(java.lang.Runnable runnable) {
        ((ku5.t0) ku5.t0.f312615d).g(new rk4.o6(runnable));
    }

    public void aj(rk4.l taskBarVersion) {
        kotlin.jvm.internal.o.g(taskBarVersion, "taskBarVersion");
        com.tencent.mars.xlog.Log.i("MicroMsg.TingReportService", "setTaskBarVersion: " + taskBarVersion);
        this.f396898e = taskBarVersion;
    }

    public final void wi(int i17, bw5.xb0 xb0Var, java.lang.String str, bw5.o50 o50Var) {
        bw5.lp0 c17;
        bw5.dr0 c18;
        bw5.dr0 c19;
        bw5.cp0 b17;
        java.lang.String str2;
        bw5.v70 d17;
        bw5.v70 d18;
        qk.g9 g9Var = (qk.g9) i95.n0.c(qk.g9.class);
        if (this.f396898e == rk4.l.f396808g) {
            c17 = null;
        } else {
            b66.j cj6 = ((rk4.z8) g9Var).cj();
            bw5.fr0 d19 = cj6 != null ? ((b66.k) cj6).d() : null;
            if (d19 == null || (c17 = d19.b()) == null) {
                c17 = (d19 == null || (c18 = d19.c()) == null) ? null : c18.c();
            }
            o50Var = (d19 == null || (c19 = d19.c()) == null || (b17 = c19.b()) == null) ? null : b17.b();
        }
        if (i17 == 1119 || i17 == 1120 || i17 == 1124 || i17 == 1125) {
            rk4.k8 k8Var = (rk4.k8) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
            com.tencent.mars.xlog.Log.i("MicroMsg.TingRouter", "report on 29145, currentSessionId:" + k8Var.f396796e);
            str2 = k8Var.f396796e;
        } else {
            str2 = "";
        }
        ((ov.b) ((pv.z) i95.n0.c(pv.z.class))).getClass();
        java.lang.String str3 = ip1.q.f293600e;
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[15];
        objArr[0] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
        objArr[1] = 5;
        objArr[2] = java.lang.Integer.valueOf(i17);
        objArr[3] = java.lang.Integer.valueOf(o50Var != null ? o50Var.f30964n : 0);
        java.lang.String c27 = o50Var != null ? o50Var.c() : null;
        if (c27 == null) {
            c27 = "";
        }
        objArr[4] = c27;
        objArr[5] = java.lang.Integer.valueOf((c17 == null || (d18 = c17.d()) == null) ? 0 : d18.f34189e);
        java.lang.String listenId = (c17 == null || (d17 = c17.d()) == null) ? null : d17.getListenId();
        if (listenId == null) {
            listenId = "";
        }
        objArr[6] = listenId;
        java.lang.String title = xb0Var != null ? xb0Var.getTitle() : null;
        if (title == null) {
            title = "";
        }
        objArr[7] = fp.s0.a(title);
        java.lang.String str4 = xb0Var != null ? xb0Var.f35053p[4] ? xb0Var.f35047g : "" : null;
        if (str4 == null) {
            str4 = "";
        }
        objArr[8] = fp.s0.a(str4);
        objArr[9] = "";
        if (str == null) {
            str = "";
        }
        objArr[10] = str;
        objArr[11] = str3;
        objArr[12] = str2;
        objArr[13] = java.lang.Integer.valueOf(this.f396898e.f396810d);
        rk4.l lVar = this.f396898e;
        rk4.l lVar2 = rk4.l.f396807f;
        int i18 = this.f396899f;
        objArr[14] = java.lang.Integer.valueOf(lVar == lVar2 ? i18 : 0);
        g0Var.d(29145, objArr);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("report on 29145, action:");
        sb6.append(i17);
        sb6.append(", dropDownUniqueSessionId:");
        sb6.append(str3);
        sb6.append(", appSessionId:");
        sb6.append(str2);
        sb6.append(", categoryItem?.categoryId:");
        sb6.append(o50Var != null ? o50Var.c() : null);
        sb6.append(", categoryItem?.categoryId:");
        sb6.append(o50Var != null ? o50Var.c() : null);
        sb6.append(", taskBarVersion: ");
        sb6.append(this.f396898e.f396810d);
        sb6.append(", taskBarUIVersion: ");
        sb6.append(i18);
        com.tencent.mars.xlog.Log.i("MicroMsg.TingReportService", sb6.toString());
    }
}

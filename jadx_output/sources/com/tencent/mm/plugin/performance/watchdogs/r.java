package com.tencent.mm.plugin.performance.watchdogs;

/* loaded from: classes12.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static int f153118a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f153119b;

    public static final void a(ob0.s3 info) {
        kotlin.jvm.internal.o.g(info, "info");
        if (info.A + info.B > 2097152 && com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.isBackground()) {
            f153118a++;
        }
        if (f153118a < 3 || f153119b || !ih.a.f(e42.d0.clicfg_matrix_m_oldbg_ams_pss_with_isolated_xweb_2g_enable, true)) {
            return;
        }
        ri.i0 i0Var = ri.k0.f395920a;
        long j17 = info.f343966w;
        int i17 = info.A + info.B;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            jSONObject.put("count", info.C.length);
            jSONObject.put("detail", jSONArray);
            ob0.s3[] allProcessMemInfos = info.C;
            kotlin.jvm.internal.o.f(allProcessMemInfos, "allProcessMemInfos");
            java.util.ArrayList arrayList = new java.util.ArrayList(allProcessMemInfos.length);
            for (ob0.s3 s3Var : allProcessMemInfos) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("process", s3Var.f343945b);
                jSONObject2.put("pid", s3Var.f343944a);
                jSONObject2.put("amsPss", s3Var.f343968y);
                arrayList.add(jSONObject2);
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                jSONArray.put((org.json.JSONObject) it.next());
            }
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("process", "IsolatedXWeb");
            jSONObject3.put("pid", -1);
            jSONObject3.put("amsPss", info.B);
            jSONArray.put(jSONObject3);
        } catch (java.lang.Throwable th6) {
            oj.j.d("MicroMsg.Common", th6, "", new java.lang.Object[0]);
        }
        java.lang.String b17 = ri.l0.b(jSONObject);
        android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
        android.app.ActivityManager activityManager = oj.p.f345712a;
        oj.p.f345712a.getMemoryInfo(memoryInfo);
        i0Var.a(new ri.j0(1000, null, 0, 0, 0L, 0L, 0L, 0, null, 0, null, i17, b17, 0L, 0L, 0L, null, null, 0, 0, 0, 0, 0, j17, ri.l0.b(new com.tencent.matrix.util.SystemInfo(memoryInfo.totalMem, memoryInfo.availMem, memoryInfo.lowMemory, memoryInfo.threshold).a()), null, null, 0, 0, null, null, 0, 0, -25171970, 1, null));
        f153119b = true;
    }
}

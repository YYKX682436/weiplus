package com.tencent.mm.ui.tools;

/* loaded from: classes9.dex */
public abstract class n1 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f210589a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.ref.WeakReference f210590b;

    public static void a(qk.o oVar, android.app.Activity activity, com.tencent.mm.storage.z3 z3Var, boolean z17, int i17) {
        if (oVar == null || activity == null || z3Var == null) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Boolean.valueOf(oVar == null);
            objArr[1] = java.lang.Boolean.valueOf(activity == null);
            objArr[2] = java.lang.Boolean.valueOf(z3Var == null);
            com.tencent.mars.xlog.Log.e("MicroMsg.BizContactDeleteUtil", "error args, %b, %b, %b", objArr);
            return;
        }
        f210589a = false;
        f210590b = new java.lang.ref.WeakReference(db5.e1.Q(activity, activity.getString(com.tencent.mm.R.string.f490573yv), activity.getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.ui.tools.k1()));
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(activity);
        java.lang.String d17 = z3Var.d1();
        z3Var.s3();
        aq1.n nVar = (aq1.n) ((i35.g) gm0.j1.s(i35.g.class));
        nVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.DeleteContactService", "delete contact %s", d17);
        nVar.a(d17, true);
        ((java.util.ArrayList) ((aq1.n) ((i35.g) gm0.j1.s(i35.g.class))).f13070d).add(new com.tencent.mm.ui.tools.l1(z3Var, oVar, weakReference, z17));
    }

    public static void b(qk.o oVar, android.app.Activity activity, com.tencent.mm.storage.z3 z3Var, boolean z17, java.lang.Runnable runnable, int i17) {
        if (oVar != null && activity != null && z3Var != null) {
            db5.e1.B(activity, oVar.G0() ? activity.getString(com.tencent.mm.R.string.f490771ap5) : activity.getString(com.tencent.mm.R.string.ap6, z3Var.g2()), "", activity.getString(com.tencent.mm.R.string.bgp), activity.getString(com.tencent.mm.R.string.bgo), new com.tencent.mm.ui.tools.j1(oVar, activity, z3Var, z17, i17, runnable), null, com.tencent.mm.R.color.a2y);
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Boolean.valueOf(oVar == null);
        objArr[1] = java.lang.Boolean.valueOf(activity == null);
        objArr[2] = java.lang.Boolean.valueOf(z3Var == null);
        com.tencent.mars.xlog.Log.e("MicroMsg.BizContactDeleteUtil", "bizInfo null : %s, context null : %s, ct null : %s", objArr);
    }
}

package hg2;

/* loaded from: classes3.dex */
public abstract class s {
    public static final void a(android.content.Context context, com.tencent.mm.plugin.finder.live.view.k0 k0Var, kotlinx.coroutines.y0 scope, dk2.zf zfVar) {
        gk2.e buContext;
        java.lang.String a17;
        java.lang.String k17;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(scope, "scope");
        if (k0Var == null || (buContext = k0Var.getBuContext()) == null) {
            return;
        }
        java.lang.String str = (zfVar == null || (k17 = zfVar.k()) == null) ? "" : k17;
        java.lang.String str2 = (zfVar == null || (a17 = zfVar.a()) == null) ? "" : a17;
        r45.eu0 eu0Var = ((mm2.f6) buContext.a(mm2.f6.class)).V;
        if (eu0Var != null) {
            kotlinx.coroutines.l.d(scope, null, null, new hg2.o(buContext, context, k0Var, eu0Var, str2, str, null), 3, null);
        }
    }

    public static final void b(dk2.vf vfVar, android.content.Context context, com.tencent.mm.plugin.finder.live.view.k0 k0Var) {
        kotlin.jvm.internal.o.g(vfVar, "<this>");
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("FlashSaleInfoLocal", "open flash sale dialog");
        int e17 = c01.id.e();
        int i17 = vfVar.f234251b;
        if (e17 > i17) {
            com.tencent.mars.xlog.Log.e("FlashSaleInfoLocal", "try open flash sale after expiration, currentTime = " + e17 + ", expireTime = " + i17);
            return;
        }
        if (k0Var == null) {
            com.tencent.mars.xlog.Log.i("FlashSaleInfoLocal", "plugin layout is null");
            return;
        }
        r45.av1 av1Var = new r45.av1();
        av1Var.set(1, db2.t4.f228171a.a(6211));
        av1Var.set(2, java.lang.Long.valueOf(((mm2.e1) k0Var.business(mm2.e1.class)).f328983m));
        av1Var.set(3, java.lang.Long.valueOf(((mm2.e1) k0Var.business(mm2.e1.class)).f328988r.getLong(0)));
        av1Var.set(4, ((mm2.e1) k0Var.business(mm2.e1.class)).f328992v);
        r45.mq1 mq1Var = vfVar.f234253d;
        av1Var.set(5, java.lang.Long.valueOf(mq1Var != null ? mq1Var.getLong(0) : 0L));
        av1Var.set(11, 1);
        av1Var.set(7, ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Mj());
        av1Var.d().l().K(new hg2.r(context, vfVar, k0Var));
    }
}

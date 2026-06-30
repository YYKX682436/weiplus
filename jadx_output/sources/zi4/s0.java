package zi4;

/* loaded from: classes11.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zi4.u0 f473257d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.ob f473258e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(zi4.u0 u0Var, bw5.ob obVar) {
        super(0);
        this.f473257d = u0Var;
        this.f473258e = obVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context;
        zi4.u0 u0Var = this.f473257d;
        u0Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jumpToCardListPage >> ");
        bw5.ob obVar = this.f473258e;
        sb6.append(obVar.c());
        sb6.append(' ');
        sb6.append(obVar.getStatusId());
        sb6.append(' ');
        sb6.append(obVar.f31032f);
        sb6.append(' ');
        sb6.append(obVar.b());
        com.tencent.mars.xlog.Log.i("MicroMsg.FLTStatusMessagePageOpenCardListPageHandler", sb6.toString());
        obVar.f31033g = obVar.f31032f == 2 ? obVar.b() : null;
        obVar.f31034h[4] = true;
        java.lang.String c17 = obVar.c();
        if (c17 == null ? false : kotlin.jvm.internal.o.b(c17, en1.a.a())) {
            si4.a G = ai4.m0.f5173a.G();
            java.lang.String statusId = obVar.getStatusId();
            kotlin.jvm.internal.o.f(statusId, "getStatusId(...)");
            mj4.h t17 = G.t(statusId);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("item onClick self, ");
            sb7.append(obVar.getStatusId());
            sb7.append(", exist=");
            sb7.append(t17 != null);
            com.tencent.mars.xlog.Log.i("MicroMsg.FLTStatusMessagePageOpenCardListPageHandler", sb7.toString());
            if (t17 != null) {
                java.lang.String c18 = obVar.c();
                kotlin.jvm.internal.o.f(c18, "getStatusUserName(...)");
                u0Var.b(c18, t17, obVar.b());
            } else {
                java.lang.ref.WeakReference weakReference = u0Var.f473181e;
                if (weakReference != null && (context = (android.content.Context) weakReference.get()) != null) {
                    java.lang.String statusId2 = obVar.getStatusId();
                    kotlin.jvm.internal.o.f(statusId2, "getStatusId(...)");
                    java.lang.String b17 = obVar.b();
                    ej4.f fVar = new ej4.f(null, 4L, 0L, 1L, null, 16, null);
                    fVar.f253356i = b17;
                    pj4.f1 f1Var = fVar.f253355h;
                    if (f1Var != null) {
                        java.util.LinkedList linkedList = new java.util.LinkedList();
                        linkedList.add(statusId2);
                        f1Var.f355043h = linkedList;
                    }
                    gm0.j1.d().a(4245, u0Var);
                    gm0.j1.d().g(fVar);
                    if (u0Var.f473266g == null || (!r2.isShowing())) {
                        u0Var.f473266g = db5.e1.P(context, context.getString(com.tencent.mm.R.string.f490468vx), 3, context.getString(com.tencent.mm.R.string.f490468vx), false, true, new zi4.t0(fVar, u0Var));
                    }
                }
            }
        } else {
            si4.a G2 = ai4.m0.f5173a.G();
            java.lang.String statusId3 = obVar.getStatusId();
            kotlin.jvm.internal.o.f(statusId3, "getStatusId(...)");
            mj4.h t18 = G2.t(statusId3);
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("item onClick owner=");
            sb8.append(obVar.c());
            sb8.append(", ");
            sb8.append(obVar);
            sb8.append(".statusId, exist=");
            sb8.append(t18 != null);
            com.tencent.mars.xlog.Log.i("MicroMsg.FLTStatusMessagePageOpenCardListPageHandler", sb8.toString());
            if (t18 == null) {
                u0Var.c();
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("textstatus_expire_cannot_view_toast", "view_exp", new java.util.HashMap(), 28809);
            } else {
                java.lang.String c19 = obVar.c();
                kotlin.jvm.internal.o.f(c19, "getStatusUserName(...)");
                u0Var.b(c19, t18, obVar.b());
            }
        }
        return jz5.f0.f302826a;
    }
}

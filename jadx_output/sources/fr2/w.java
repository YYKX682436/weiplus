package fr2;

/* loaded from: classes9.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f265761d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fr2.x f265762e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.ui.widget.dialog.k0 k0Var, fr2.x xVar) {
        super(1);
        this.f265761d = k0Var;
        this.f265762e = xVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String username = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(username, "username");
        this.f265761d.u();
        fr2.x xVar = this.f265762e;
        r45.zz2 zz2Var = xVar.f265771o;
        if (zz2Var == null) {
            com.tencent.mars.xlog.Log.i(pf5.o.TAG, "addQuickShare: share info is null");
        } else {
            o25.q1 q1Var = (o25.q1) i95.n0.c(o25.q1.class);
            android.app.Activity context = xVar.getContext();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(xVar.getString(com.tencent.mm.R.string.f490589za));
            java.lang.String str = zz2Var.f392480d;
            if (str == null) {
                str = "";
            }
            sb6.append(str);
            java.lang.String sb7 = sb6.toString();
            java.lang.String string = xVar.getString(com.tencent.mm.R.string.f490551ya);
            fr2.v vVar = new fr2.v(xVar, zz2Var, username);
            ((r35.k1) q1Var).getClass();
            r35.i1 i1Var = new r35.i1(context);
            i1Var.l(username);
            i1Var.i(sb7);
            i1Var.g(java.lang.Boolean.TRUE);
            i1Var.f369137d = string;
            i1Var.a(vVar);
            i1Var.f369136c.show();
        }
        return jz5.f0.f302826a;
    }
}

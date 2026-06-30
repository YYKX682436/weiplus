package on2;

/* loaded from: classes.dex */
public final class k3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.qp1 f346956d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f346957e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f346958f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(r45.qp1 qp1Var, java.lang.String str, yz5.l lVar) {
        super(0);
        this.f346956d = qp1Var;
        this.f346957e = str;
        this.f346958f = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        r45.qp1 qp1Var = this.f346956d;
        int integer = qp1Var.getInteger(0);
        java.lang.String str2 = this.f346957e;
        if (integer == 1) {
            java.lang.String string = qp1Var.getString(1);
            str = (string == null || string.length() == 0) ^ true ? string : null;
            if (str != null) {
                str2 = str;
            }
            kotlin.jvm.internal.o.d(str2);
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).ll());
            u1Var.g(str2);
            u1Var.m(com.tencent.mm.R.string.l_e);
            u1Var.a(true);
            u1Var.l(hz2.b.f286310a);
            u1Var.q(false);
        } else if (integer == 2) {
            yz5.l lVar = this.f346958f;
            if (lVar != null) {
                lVar.invoke(qp1Var);
            }
        } else if (integer == 3) {
            java.lang.String string2 = qp1Var.getString(1);
            str = (string2 == null || string2.length() == 0) ^ true ? string2 : null;
            if (str != null) {
                str2 = str;
            }
            kotlin.jvm.internal.o.d(str2);
            db5.t7.m(com.tencent.mm.sdk.platformtools.x2.f193071a, str2);
        }
        return jz5.f0.f302826a;
    }
}

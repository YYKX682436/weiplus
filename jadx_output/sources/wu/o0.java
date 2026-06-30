package wu;

/* loaded from: classes9.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wu.w0 f449606d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(wu.w0 w0Var) {
        super(2);
        this.f449606d = w0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.view.View v17 = (android.view.View) obj;
        hu.b item = (hu.b) obj2;
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(item, "item");
        s15.k z17 = item.f284997e.z();
        if (z17 != null) {
            java.lang.String talker = this.f449606d.f449610e.q();
            r45.aw2 aw2Var = new r45.aw2();
            aw2Var.set(0, z17.getFinderUsername());
            aw2Var.set(1, z17.k());
            aw2Var.set(2, z17.getNickname());
            aw2Var.set(3, z17.o());
            aw2Var.set(4, z17.getAppId());
            aw2Var.set(5, z17.getPath());
            aw2Var.set(6, z17.j());
            aw2Var.set(7, z17.B());
            aw2Var.set(8, z17.r());
            aw2Var.set(9, z17.s());
            aw2Var.set(10, z17.t());
            wu.n0 n0Var = new wu.n0(v17);
            kotlin.jvm.internal.o.g(talker, "talker");
            java.lang.String string = aw2Var.getString(0);
            if (string != null) {
                if (!(string.length() == 0)) {
                    ((ku5.t0) ku5.t0.f312615d).q(new yu.l(talker, string, aw2Var, n0Var));
                }
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.RecordOtherItemHelper", "share item finderUserName not set");
            n0Var.invoke(aw2Var);
        }
        return jz5.f0.f302826a;
    }
}

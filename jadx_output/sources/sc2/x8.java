package sc2;

/* loaded from: classes2.dex */
public final class x8 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.a9 f406370d;

    public x8(sc2.a9 a9Var) {
        this.f406370d = a9Var;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        yz5.p pVar;
        r45.mi2 req = (r45.mi2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        sc2.a9 a9Var = this.f406370d;
        a9Var.f405771d = false;
        android.app.Dialog dialog = a9Var.f405770c;
        if (dialog != null) {
            dialog.dismiss();
        }
        int integer = ret.getInteger(1);
        java.lang.String string = ret.getString(2);
        if (integer == -4051) {
            string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492092f61);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            db5.t7.f(com.tencent.mm.sdk.platformtools.x2.f193071a, string, sc2.w8.f406344a);
        }
        if (ret.getInteger(1) != 0 || (pVar = a9Var.f405769b) == null) {
            return;
        }
        pVar.invoke(req, ret);
    }
}

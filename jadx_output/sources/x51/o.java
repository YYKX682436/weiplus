package x51;

/* loaded from: classes11.dex */
public class o extends x51.g {
    @Override // x51.g
    public boolean a(x51.r1 r1Var) {
        android.app.Activity activity = this.f452007e;
        db5.e1.A(activity, r1Var.f452079c, "", activity.getString(com.tencent.mm.R.string.f490939bb1), this.f452007e.getString(com.tencent.mm.R.string.baz), new x51.n(this, activity), null);
        return true;
    }

    @Override // x51.g
    public boolean b(x51.r1 r1Var) {
        dp.a.makeText(this.f452007e, r1Var.f452079c, 0).show();
        return true;
    }

    @Override // x51.g
    public boolean c(x51.r1 r1Var) {
        dp.a.makeText(this.f452007e, r1Var.f452079c, 0).show();
        return true;
    }

    @Override // x51.g
    public boolean d(x51.r1 r1Var) {
        dp.a.makeText(this.f452007e, r1Var.f452079c, 0).show();
        return true;
    }

    @Override // x51.g
    public boolean e(x51.r1 r1Var) {
        android.app.Activity activity = this.f452007e;
        db5.e1.A(activity, r1Var.f452079c, "", activity.getString(com.tencent.mm.R.string.f490939bb1), this.f452007e.getString(com.tencent.mm.R.string.baz), new x51.m(this, r1Var, activity), null);
        return true;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ErrorConfirmProcessor", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
    }
}

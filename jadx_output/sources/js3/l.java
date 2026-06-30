package js3;

/* loaded from: classes.dex */
public class l implements com.tencent.mm.ipcinvoker.j, com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f301533d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ipcinvoker.r f301534e;

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        this.f301533d = bundle.getString("mail_id");
        int i17 = bundle.getInt("mail_status");
        this.f301534e = rVar;
        gm0.j1.d().g(new ms3.g(this.f301533d, i17));
        gm0.j1.d().a(11480, this);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.UpdateMailStatusTask", "read mail, errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (!((ms3.g) m1Var).f330994f.equals(this.f301533d)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.UpdateMailStatusTask", "not my scene, ignore");
            return;
        }
        gm0.j1.d().q(11480, this);
        if (this.f301534e != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("err_type", i17);
            bundle.putInt("err_code", i18);
            bundle.putString("err_msg", str);
            bundle.putString("mail_id", this.f301533d);
            this.f301534e.a(bundle);
        }
    }
}

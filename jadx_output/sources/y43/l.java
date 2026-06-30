package y43;

/* loaded from: classes8.dex */
public final class l implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m33.f1 f459354d;

    public l(m33.f1 f1Var) {
        this.f459354d = f1Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        m33.f1 f1Var = this.f459354d;
        if (bundle == null) {
            if (f1Var != null) {
                f1Var.a(null);
                return;
            }
            return;
        }
        java.lang.String string = bundle.getString("appid");
        java.lang.String string2 = bundle.getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
        bundle.getString("wepkg_id");
        if (f1Var != null) {
            m33.e1 e1Var = new m33.e1();
            e1Var.f323282a = string;
            e1Var.f323283b = string2;
            f1Var.a(e1Var);
        }
    }
}

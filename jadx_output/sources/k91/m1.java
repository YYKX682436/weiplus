package k91;

/* loaded from: classes4.dex */
public class m1 implements k91.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k91.q1 f305675a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f305676b;

    public m1(k91.q1 q1Var, java.lang.String str) {
        this.f305675a = q1Var;
        this.f305676b = str;
    }

    @Override // k91.p1
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        k91.q1 q1Var = this.f305675a;
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CommonConfigManager", "getConfig syncConfigFromServer, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            if (q1Var != null) {
                q1Var.a("");
                return;
            }
            return;
        }
        r45.u93 u93Var = (r45.u93) oVar.f70711b.f70700a;
        java.util.LinkedList linkedList = u93Var.f387153d;
        if (linkedList == null || linkedList.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CommonConfigManager", "getConfig syncConfigFromServer, AppConfigList is empty");
            if (q1Var != null) {
                q1Var.a("");
                return;
            }
            return;
        }
        r45.s8 s8Var = (r45.s8) u93Var.f387153d.get(0);
        com.tencent.mars.xlog.Log.i("MicroMsg.CommonConfigManager", "getConfig syncConfigFromServer, the config is %s, the configVersion is %d", s8Var.f385543g, java.lang.Integer.valueOf(s8Var.f385542f));
        if (com.tencent.mm.sdk.platformtools.t8.K0(s8Var.f385543g)) {
            if (q1Var != null) {
                q1Var.a("");
                return;
            }
            return;
        }
        int i19 = s8Var.f385541e;
        int i27 = s8Var.f385542f;
        java.lang.String str2 = this.f305676b;
        k91.o1.c(str2, i19, i27);
        k91.o1.d(str2, s8Var.f385541e, s8Var.f385542f);
        int i28 = s8Var.f385541e;
        java.lang.String str3 = s8Var.f385543g;
        if (com.tencent.mm.plugin.appbrand.app.r9.Ui() != null) {
            com.tencent.mm.plugin.appbrand.app.r9.Ui().P2(java.lang.String.format("%s_%s_config", str2, java.lang.Integer.valueOf(i28)), str3);
        }
        if (q1Var != null) {
            q1Var.a(s8Var.f385543g);
        }
    }
}

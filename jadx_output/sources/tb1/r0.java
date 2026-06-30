package tb1;

/* loaded from: classes7.dex */
public class r0 implements tb1.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tb1.q0 f416933a;

    public r0(tb1.q0 q0Var) {
        this.f416933a = q0Var;
    }

    public void a(java.lang.String str, int i17, int i18, int i19) {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        tb1.q0 q0Var = this.f416933a;
        if (K0) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("bufferId", java.lang.Integer.valueOf(i17));
            hashMap.put("width", java.lang.Integer.valueOf(i18));
            hashMap.put("height", java.lang.Integer.valueOf(i19));
            q0Var.f416927e.a(q0Var.f416928f, q0Var.f416929g.p("ok", hashMap));
            return;
        }
        q0Var.f416927e.a(q0Var.f416928f, q0Var.f416929g.o("fail:" + str));
    }
}

package sm2;

/* loaded from: classes3.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409347d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f409348e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f409349f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f409350g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(sm2.o4 o4Var, java.lang.String str, int i17, int i18) {
        super(0);
        this.f409347d = o4Var;
        this.f409348e = str;
        this.f409349f = i17;
        this.f409350g = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        sm2.o4 o4Var = this.f409347d;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = o4Var.f19594b;
        java.lang.String str2 = this.f409348e;
        if (str2 == null) {
            str = appCompatActivity.getResources().getString(com.tencent.mm.R.string.cla);
            kotlin.jvm.internal.o.f(str, "getString(...)");
        } else {
            str = str2;
        }
        db5.t7.makeText(appCompatActivity, str, 0).show();
        dk2.xf g17 = o4Var.g();
        if (g17 != null) {
            dk2.xf.f(g17, 0, new sm2.z(o4Var), 1, null);
        }
        sm2.o4 o4Var2 = this.f409347d;
        int i17 = this.f409349f;
        int i18 = this.f409350g;
        if (str2 == null) {
            str2 = "";
        }
        o4Var2.z(i17, i18, str2, null, null);
        com.tencent.mm.plugin.finder.assist.p8.c(com.tencent.mm.plugin.finder.assist.p8.f102460a, com.tencent.mm.plugin.finder.assist.t8.B.f102540b, null, false, true, 6, null);
        return jz5.f0.f302826a;
    }
}

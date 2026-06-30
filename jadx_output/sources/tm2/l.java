package tm2;

/* loaded from: classes3.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tm2.s2 f420540d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f420541e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f420542f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(tm2.s2 s2Var, java.lang.String str, int i17) {
        super(0);
        this.f420540d = s2Var;
        this.f420541e = str;
        this.f420542f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        tm2.s2 s2Var = this.f420540d;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = s2Var.f19600b;
        java.lang.String str = this.f420541e;
        if (str == null) {
            str = appCompatActivity.getResources().getString(com.tencent.mm.R.string.cla);
            kotlin.jvm.internal.o.f(str, "getString(...)");
        }
        db5.t7.makeText(appCompatActivity, str, 0).show();
        fm2.b bVar = s2Var.f19601c;
        if (bVar != null) {
            qo0.c.a(bVar, qo0.b.f365363i, null, 2, null);
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("live_user_exit_reason", this.f420542f);
        fm2.b bVar2 = s2Var.f19601c;
        if (bVar2 != null) {
            bVar2.statusChange(qo0.b.D1, bundle);
        }
        return jz5.f0.f302826a;
    }
}

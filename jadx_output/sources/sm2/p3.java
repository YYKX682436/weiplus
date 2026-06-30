package sm2;

/* loaded from: classes3.dex */
public final class p3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f409653d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409654e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(java.lang.String str, sm2.o4 o4Var) {
        super(1);
        this.f409653d = str;
        this.f409654e = o4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        km2.q qVar = (km2.q) obj;
        java.lang.String str = qVar.f309170a;
        java.lang.String str2 = this.f409653d;
        if (kotlin.jvm.internal.o.b(str, str2)) {
            androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f409654e.f19594b;
            db5.t7.makeText(appCompatActivity, appCompatActivity.getResources().getString(com.tencent.mm.R.string.f491616do2, qVar.f309173d), 0).show();
        }
        return java.lang.Boolean.valueOf(kotlin.jvm.internal.o.b(qVar.f309170a, str2));
    }
}

package sm2;

/* loaded from: classes3.dex */
public final class a3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409353d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(sm2.o4 o4Var) {
        super(1);
        this.f409353d = o4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ((java.lang.Boolean) obj).booleanValue();
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f409353d.f19594b;
        db5.t7.makeText(appCompatActivity, appCompatActivity.getString(com.tencent.mm.R.string.dms), 0).show();
        return jz5.f0.f302826a;
    }
}

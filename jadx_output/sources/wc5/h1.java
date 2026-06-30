package wc5;

/* loaded from: classes10.dex */
public final class h1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wc5.k1 f444576d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(wc5.k1 k1Var) {
        super(1);
        this.f444576d = k1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        kn5.e create = (kn5.e) obj;
        kotlin.jvm.internal.o.g(create, "$this$create");
        wc5.k1 k1Var = this.f444576d;
        create.f309790g = k1Var.f444591d.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479658bv);
        androidx.appcompat.app.AppCompatActivity appCompatActivity = k1Var.f444591d;
        int dimensionPixelSize = appCompatActivity.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479670c7);
        create.f309791h = -dimensionPixelSize;
        create.f309792i = dimensionPixelSize;
        appCompatActivity.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479671c8);
        return jz5.f0.f302826a;
    }
}

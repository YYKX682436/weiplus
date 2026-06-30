package sm2;

/* loaded from: classes3.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409450d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(sm2.o4 o4Var) {
        super(0);
        this.f409450d = o4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.o4 o4Var = this.f409450d;
        fm2.a aVar = o4Var.f19595c;
        if (aVar != null) {
            androidx.appcompat.app.AppCompatActivity appCompatActivity = o4Var.f19594b;
            kotlin.jvm.internal.o.e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            aVar.goGetLuckMoney((com.tencent.mm.ui.MMActivity) appCompatActivity, ((mm2.c1) o4Var.c(mm2.c1.class)).f328804f5, true);
        }
        ((mm2.c1) o4Var.c(mm2.c1.class)).f328804f5 = null;
        return jz5.f0.f302826a;
    }
}

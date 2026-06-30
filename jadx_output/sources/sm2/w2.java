package sm2;

/* loaded from: classes3.dex */
public final class w2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409765d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(sm2.o4 o4Var) {
        super(0);
        this.f409765d = o4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.o4 o4Var = this.f409765d;
        fm2.a aVar = o4Var.f19595c;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = o4Var.f19594b;
        if (aVar != null) {
            kotlin.jvm.internal.o.e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            aVar.goGetLuckMoney((com.tencent.mm.ui.MMActivity) appCompatActivity, ((mm2.c1) o4Var.c(mm2.c1.class)).f328804f5, true);
        }
        ((mm2.c1) o4Var.c(mm2.c1.class)).f328804f5 = null;
        zl2.r4.f473950a.u(appCompatActivity, o4Var.f19609a, o4Var.f19595c);
        return jz5.f0.f302826a;
    }
}

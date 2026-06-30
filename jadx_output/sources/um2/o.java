package um2;

/* loaded from: classes3.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428903d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(um2.x5 x5Var) {
        super(0);
        this.f428903d = x5Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        um2.x5 x5Var = this.f428903d;
        fm2.c cVar = x5Var.f19606c;
        if (cVar != null) {
            androidx.appcompat.app.AppCompatActivity appCompatActivity = x5Var.f19605b;
            kotlin.jvm.internal.o.e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            cVar.goGetLuckMoney((com.tencent.mm.ui.MMActivity) appCompatActivity, ((mm2.c1) x5Var.c(mm2.c1.class)).f328804f5, !((mm2.c1) x5Var.c(mm2.c1.class)).e8());
        }
        ((mm2.c1) x5Var.c(mm2.c1.class)).f328804f5 = null;
        return jz5.f0.f302826a;
    }
}

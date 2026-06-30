package im2;

/* loaded from: classes3.dex */
public final class j6 extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.o6 f292406d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(im2.o6 o6Var) {
        super(4);
        this.f292406d = o6Var;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int intValue = ((java.lang.Number) obj).intValue();
        android.view.View child = (android.view.View) obj2;
        ((java.lang.Boolean) obj3).booleanValue();
        kotlin.jvm.internal.o.g(child, "child");
        im2.o6 o6Var = this.f292406d;
        com.tencent.mm.plugin.finder.live.plugin.no0 no0Var = o6Var.f292472h;
        if (no0Var != null) {
            no0Var.e();
        }
        com.tencent.mm.plugin.finder.live.viewmodel.c4 c4Var = (com.tencent.mm.plugin.finder.live.viewmodel.c4) kz5.n0.a0(o6Var.f292470f.f117076d, intValue);
        com.tencent.mm.plugin.finder.live.plugin.no0 no0Var2 = c4Var != null ? c4Var.f116970b : null;
        o6Var.f292472h = no0Var2;
        if (no0Var2 != null) {
            no0Var2.a();
        }
        return jz5.f0.f302826a;
    }
}

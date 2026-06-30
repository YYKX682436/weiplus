package sp2;

/* loaded from: classes2.dex */
public final class t1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f411217d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(sp2.o2 o2Var) {
        super(2);
        this.f411217d = o2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        androidx.fragment.app.Fragment fragment = this.f411217d.f411123b;
        kotlin.jvm.internal.o.g(fragment, "fragment");
        sp2.x3 x3Var = (sp2.x3) pf5.z.f353948a.b(fragment).a(sp2.x3.class);
        com.tencent.mars.xlog.Log.i("Finder.LiveEntranceFragmentViewCallback", "startRequestCgi");
        x3Var.V6(intValue, intValue2);
        x3Var.W6(intValue, intValue2);
        return jz5.f0.f302826a;
    }
}

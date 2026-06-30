package sr2;

/* loaded from: classes10.dex */
public final class b1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.o1 f411517d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(sr2.o1 o1Var) {
        super(0);
        this.f411517d = o1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sr2.o1 o1Var = this.f411517d;
        androidx.appcompat.app.AppCompatActivity activity = o1Var.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        V6.set(5, 74);
        com.tencent.mm.plugin.finder.report.b6.d(com.tencent.mm.plugin.finder.report.b6.f124969a, V6, "button_post_choose_emoji", 1, null, false, null, 56, null);
        o1Var.S6(6);
        return jz5.f0.f302826a;
    }
}

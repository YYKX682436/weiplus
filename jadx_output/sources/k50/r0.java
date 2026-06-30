package k50;

/* loaded from: classes.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k50.y0 f304255d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(k50.y0 y0Var) {
        super(0);
        this.f304255d = y0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        k50.y0 y0Var = this.f304255d;
        y0Var.getClass();
        qd0.q0 q0Var = (qd0.q0) i95.n0.c(qd0.q0.class);
        androidx.appcompat.app.AppCompatActivity activity = y0Var.getActivity();
        java.lang.String string = y0Var.getContext().getString(com.tencent.mm.R.string.o_4);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.util.List clawBotUsernames = y0Var.f304274h;
        q0Var.getClass();
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(clawBotUsernames, "clawBotUsernames");
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.ui.mvvm.MvvmContactListUI.class);
        intent.putExtra("titile", string);
        intent.putExtra("already_select_contact", com.tencent.mm.sdk.platformtools.t8.c1(clawBotUsernames, ","));
        com.tencent.mm.ui.contact.i5.e();
        intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.f206780a);
        intent.putExtra("KEY_NEED_SEAR_HEADER", false);
        pf5.j0.a(intent, fj5.b.class);
        pf5.j0.a(intent, fj5.e.class);
        pf5.j0.a(intent, cj5.w2.class);
        pf5.j0.a(intent, cj5.l2.class);
        y0Var.getActivity().startActivityForResult(intent, 1001);
        return jz5.f0.f302826a;
    }
}

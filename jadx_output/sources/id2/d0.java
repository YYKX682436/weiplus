package id2;

/* loaded from: classes3.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.v1 f290525d;

    public d0(id2.v1 v1Var) {
        this.f290525d = v1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        id2.v1 v1Var = this.f290525d;
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) v1Var.f290838h).getValue();
        kotlin.jvm.internal.o.f(textView, "access$getGiftTotalPrice(...)");
        int i17 = pm0.v.t(textView)[1];
        com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView T6 = v1Var.T6();
        kotlin.jvm.internal.o.f(T6, "access$getGiftRv(...)");
        v1Var.T6().setMaxHeight((i17 - i65.a.h(v1Var.getContext(), com.tencent.mm.R.dimen.f479693cs)) - pm0.v.t(T6)[1]);
        v1Var.T6().invalidate();
        pq5.g l17 = new ek2.z(id2.v1.R, id2.v1.Q, id2.v1.T, xy2.c.e(v1Var.getContext()), 0, id2.v1.P, id2.v1.S, 1, null, null, null, 1792, null).l();
        l17.K(new id2.g1(v1Var));
        if (v1Var.getActivity() == null || !(v1Var.getActivity() instanceof com.tencent.mm.ui.MMActivity)) {
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity = v1Var.getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        l17.f((com.tencent.mm.ui.MMActivity) activity);
    }
}

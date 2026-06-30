package un;

/* loaded from: classes.dex */
public final class f1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un.g1 f429253d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(un.g1 g1Var) {
        super(0);
        this.f429253d = g1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        un.g1 g1Var = this.f429253d;
        if (g1Var.f429258f == 0) {
            g1Var.V6().q().setVisibility(8);
            g1Var.V6().s().setVisibility(8);
            g1Var.V6().g().setVisibility(8);
            g1Var.V6().p().setVisibility(0);
            g1Var.V6().r().setTextColor(g1Var.getActivity().getResources().getColor(com.tencent.mm.R.color.a4h));
            g1Var.V6().r().setText(com.tencent.mm.R.string.igk);
            g1Var.V6().n().setBackground(g1Var.getActivity().getResources().getDrawable(com.tencent.mm.R.drawable.ayn));
        } else if (g1Var.f429262m || g1Var.f429266q) {
            g1Var.V6().q().setVisibility(8);
            g1Var.V6().s().setVisibility(0);
            g1Var.V6().g().setVisibility(8);
            g1Var.V6().p().setVisibility(8);
            g1Var.V6().r().setTextColor(g1Var.getActivity().getResources().getColor(com.tencent.mm.R.color.Brand_100));
            g1Var.V6().r().setText(g1Var.getActivity().getString(com.tencent.mm.R.string.igt, java.lang.String.valueOf(g1Var.f429258f)));
            g1Var.V6().n().setBackground(g1Var.getActivity().getResources().getDrawable(com.tencent.mm.R.drawable.ayo));
        } else if (g1Var.f429261i || g1Var.f429265p) {
            g1Var.V6().q().setVisibility(8);
            g1Var.V6().s().setVisibility(8);
            g1Var.V6().g().setVisibility(0);
            g1Var.V6().p().setVisibility(8);
            g1Var.V6().r().setTextColor(g1Var.getActivity().getResources().getColor(com.tencent.mm.R.color.Brand_100));
            g1Var.V6().r().setText(g1Var.getActivity().getString(com.tencent.mm.R.string.igt, java.lang.String.valueOf(g1Var.f429258f)));
            g1Var.V6().n().setBackground(g1Var.getActivity().getResources().getDrawable(com.tencent.mm.R.drawable.ayo));
        } else {
            g1Var.V6().q().setVisibility(0);
            g1Var.V6().s().setVisibility(8);
            g1Var.V6().g().setVisibility(8);
            g1Var.V6().p().setVisibility(8);
            g1Var.V6().r().setTextColor(g1Var.getActivity().getResources().getColor(com.tencent.mm.R.color.Brand_100));
            g1Var.V6().r().setText(g1Var.getActivity().getString(com.tencent.mm.R.string.igt, java.lang.String.valueOf(g1Var.f429258f)));
            g1Var.V6().n().setBackground(g1Var.getActivity().getResources().getDrawable(com.tencent.mm.R.drawable.ayo));
        }
        return jz5.f0.f302826a;
    }
}

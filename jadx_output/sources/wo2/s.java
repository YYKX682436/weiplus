package wo2;

/* loaded from: classes2.dex */
public final class s implements oa.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo2.m0 f448124d;

    public s(wo2.m0 m0Var) {
        this.f448124d = m0Var;
    }

    @Override // oa.c
    public void h0(oa.i t17) {
        kotlin.jvm.internal.o.g(t17, "t");
    }

    @Override // oa.c
    public void l4(oa.i t17) {
        kotlin.jvm.internal.o.g(t17, "t");
        java.lang.Object obj = t17.f343778a;
        if (obj instanceof wo2.q) {
            wo2.q qVar = (wo2.q) obj;
            android.widget.TextView textView = qVar.f448117c;
            if (textView != null) {
                android.view.View view = qVar.f448115a.f343783f;
                kotlin.jvm.internal.o.d(view);
                textView.setTextColor(view.getContext().getResources().getColor(com.tencent.mm.R.color.f478873jj));
            }
            qVar.a(false);
            if (qVar.f448116b == 1003) {
                this.f448124d.Q6();
            }
        }
    }

    @Override // oa.c
    public void u1(oa.i t17) {
        kotlin.jvm.internal.o.g(t17, "t");
        java.lang.Object obj = t17.f343778a;
        if (obj instanceof wo2.q) {
            wo2.q qVar = (wo2.q) obj;
            android.widget.TextView textView = qVar.f448117c;
            if (textView != null) {
                android.view.View view = qVar.f448115a.f343783f;
                kotlin.jvm.internal.o.d(view);
                textView.setTextColor(view.getContext().getResources().getColor(com.tencent.mm.R.color.a0c));
            }
            qVar.a(true);
            wo2.m0 m0Var = this.f448124d;
            androidx.appcompat.app.AppCompatActivity activity = m0Var.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            com.tencent.mm.plugin.finder.nearby.NearbyHomeUIC nearbyHomeUIC = (com.tencent.mm.plugin.finder.nearby.NearbyHomeUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.nearby.NearbyHomeUIC.class);
            int i17 = qVar.f448116b;
            nearbyHomeUIC.R6(i17);
            if (i17 != 1006) {
                switch (i17) {
                    case 1001:
                        wo2.m0.P6(m0Var, 1);
                        return;
                    case 1002:
                        break;
                    case 1003:
                        wo2.m0.P6(m0Var, 3);
                        m0Var.Q6();
                        return;
                    default:
                        return;
                }
            }
            wo2.m0.P6(m0Var, 2);
        }
    }
}

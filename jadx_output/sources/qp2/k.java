package qp2;

/* loaded from: classes2.dex */
public final class k implements oa.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qp2.y f365790d;

    public k(qp2.y yVar) {
        this.f365790d = yVar;
    }

    @Override // oa.c
    public void h0(oa.i t17) {
        kotlin.jvm.internal.o.g(t17, "t");
    }

    @Override // oa.c
    public void l4(oa.i t17) {
        kotlin.jvm.internal.o.g(t17, "t");
        java.lang.Object obj = t17.f343778a;
        boolean z17 = obj instanceof qp2.i;
        qp2.y yVar = this.f365790d;
        if (z17) {
            qp2.i iVar = (qp2.i) obj;
            int i17 = yVar.f365814n ? com.tencent.mm.R.color.BW_0_Alpha_0_5_Night_Mode : com.tencent.mm.R.color.f478873jj;
            android.widget.TextView textView = iVar.f365787d;
            if (textView != null) {
                android.view.View view = iVar.f365784a.f343783f;
                kotlin.jvm.internal.o.d(view);
                textView.setTextColor(view.getContext().getResources().getColor(i17));
            }
            iVar.a(false);
        }
        yVar.R6().announceForAccessibility(yVar.getContext().getString(com.tencent.mm.R.string.ech, java.lang.String.valueOf(t17.f343780c)));
    }

    @Override // oa.c
    public void u1(oa.i t17) {
        kotlin.jvm.internal.o.g(t17, "t");
        java.lang.Object obj = t17.f343778a;
        if (obj instanceof qp2.i) {
            qp2.i iVar = (qp2.i) obj;
            qp2.y yVar = this.f365790d;
            int i17 = yVar.f365814n ? com.tencent.mm.R.color.BW_0_Alpha_0_9_Night_Mode : com.tencent.mm.R.color.a0c;
            android.widget.TextView textView = iVar.f365787d;
            if (textView != null) {
                android.view.View view = iVar.f365784a.f343783f;
                kotlin.jvm.internal.o.d(view);
                textView.setTextColor(view.getContext().getResources().getColor(i17));
            }
            iVar.a(true);
            androidx.fragment.app.Fragment fragment = yVar.getFragment();
            kotlin.jvm.internal.o.d(fragment);
            androidx.lifecycle.c1 a17 = pf5.z.f353948a.b(fragment).a(com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC.T6((com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC) a17, iVar.f365785b, false, null, 6, null);
        }
    }
}

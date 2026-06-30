package wx0;

/* loaded from: classes5.dex */
public final class i0 implements android.widget.RadioGroup.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wx0.k0 f450498a;

    public i0(wx0.k0 k0Var) {
        this.f450498a = k0Var;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.RadioGroup radioGroup, int i17) {
        int i18;
        java.lang.String str;
        kotlin.jvm.internal.o.g(radioGroup, "radioGroup");
        radioGroup.performHapticFeedback(6);
        wx0.h0 h0Var = i17 == com.tencent.mm.R.id.rpa ? wx0.h0.f450493d : i17 == com.tencent.mm.R.id.f486780s46 ? wx0.h0.f450494e : i17 == com.tencent.mm.R.id.s8e ? wx0.h0.f450495f : wx0.h0.f450493d;
        wx0.k0 k0Var = this.f450498a;
        k0Var.f450502g = h0Var;
        int ordinal = h0Var.ordinal();
        if (ordinal == 0) {
            i18 = com.tencent.mm.R.drawable.cwt;
        } else if (ordinal == 1) {
            i18 = com.tencent.mm.R.drawable.cwv;
        } else {
            if (ordinal != 2) {
                throw new jz5.j();
            }
            i18 = com.tencent.mm.R.drawable.cwu;
        }
        android.view.View view = k0Var.f331814d;
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.shoot_composing.sidebar.SideBarItemView");
        ((com.tencent.mm.mj_publisher.finder.shoot_composing.sidebar.SideBarItemView) view).setImageResource(i18);
        int ordinal2 = h0Var.ordinal();
        if (ordinal2 == 0) {
            str = "Off";
        } else if (ordinal2 == 1) {
            str = "3s";
        } else {
            if (ordinal2 != 2) {
                throw new jz5.j();
            }
            str = "10s";
        }
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        m7Var.getClass();
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.t6(m7Var, str, null), 3, null);
    }
}

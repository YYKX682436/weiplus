package wx0;

/* loaded from: classes5.dex */
public final class y0 implements android.widget.RadioGroup.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wx0.z0 f450570a;

    public y0(wx0.z0 z0Var) {
        this.f450570a = z0Var;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.RadioGroup radioGroup, int i17) {
        int i18;
        java.lang.String str;
        kotlin.jvm.internal.o.g(radioGroup, "radioGroup");
        radioGroup.performHapticFeedback(6);
        wx0.x0 x0Var = i17 == com.tencent.mm.R.id.rpa ? wx0.x0.f450565d : i17 == com.tencent.mm.R.id.f486780s46 ? wx0.x0.f450566e : i17 == com.tencent.mm.R.id.s8e ? wx0.x0.f450567f : wx0.x0.f450565d;
        wx0.z0 z0Var = this.f450570a;
        z0Var.getClass();
        z0Var.f450574g = x0Var;
        int ordinal = x0Var.ordinal();
        if (ordinal == 0) {
            i18 = com.tencent.mm.R.drawable.boj;
        } else if (ordinal == 1) {
            i18 = com.tencent.mm.R.drawable.bol;
        } else {
            if (ordinal != 2) {
                throw new jz5.j();
            }
            i18 = com.tencent.mm.R.drawable.bok;
        }
        android.view.View view = z0Var.f331814d;
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.shoot_composing.sidebar.SideBarItemView");
        ((com.tencent.mm.mj_publisher.finder.shoot_composing.sidebar.SideBarItemView) view).setImageResource(i18);
        int ordinal2 = x0Var.ordinal();
        if (ordinal2 == 0) {
            str = "15s";
        } else if (ordinal2 == 1) {
            str = "60s";
        } else {
            if (ordinal2 != 2) {
                throw new jz5.j();
            }
            str = "180s";
        }
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        m7Var.getClass();
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.y6(m7Var, str, null), 3, null);
    }
}

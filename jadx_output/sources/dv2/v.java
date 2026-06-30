package dv2;

/* loaded from: classes2.dex */
public final class v extends zx2.h {

    /* renamed from: w, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f243959w;

    /* renamed from: x, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f243960x;

    /* renamed from: y, reason: collision with root package name */
    public final dv2.k f243961y;

    /* renamed from: z, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f243962z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f243959w = kotlinx.coroutines.flow.i3.a(dv2.i.f243865e);
        this.f243960x = kotlinx.coroutines.flow.i3.a(java.lang.Boolean.FALSE);
        this.f243961y = new dv2.k(this);
        this.f243962z = kotlinx.coroutines.flow.i3.a(x7());
    }

    public static final void w7(dv2.v vVar) {
        dv2.n x76 = vVar.x7();
        kotlinx.coroutines.flow.h3 h3Var = (kotlinx.coroutines.flow.h3) vVar.f243962z;
        if (kotlin.jvm.internal.o.b(h3Var.getValue(), x76)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.FollowAggregationTabUIC", "uiState: " + h3Var.getValue() + " -> " + x76);
        h3Var.k(x76);
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC
    public com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider W6() {
        return new dv2.j(this);
    }

    @Override // zx2.h, com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        androidx.appcompat.app.b supportActionBar = getActivity().getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
        androidx.viewpager.widget.ViewPager viewPager = this.f133659h;
        this.f133656e = false;
        if (viewPager != null) {
            viewPager.addOnPageChangeListener(new dv2.o(this));
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.viewmodel.component.h00 h00Var = (com.tencent.mm.plugin.finder.viewmodel.component.h00) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.h00.class);
        if (h00Var != null) {
            h00Var.R6(com.tencent.mm.plugin.finder.viewmodel.component.oz.f135491e);
        }
        com.tencent.mm.plugin.finder.viewmodel.component.bh bhVar = com.tencent.mm.plugin.finder.viewmodel.component.bh.f133877a;
        kotlinx.coroutines.flow.f3 f3Var = com.tencent.mm.plugin.finder.viewmodel.component.bh.f133884h;
        kotlinx.coroutines.flow.l.p(new kotlinx.coroutines.flow.y1(f3Var, new dv2.p(this, null)), v65.m.b(getActivity()));
        kotlinx.coroutines.flow.l.p(new kotlinx.coroutines.flow.y1(com.tencent.mm.plugin.finder.viewmodel.component.bh.f133878b, new dv2.q(this, null)), v65.m.b(getActivity()));
        kotlinx.coroutines.flow.l.p(new kotlinx.coroutines.flow.y1(com.tencent.mm.plugin.finder.viewmodel.component.bh.f133880d, new dv2.r(this, null)), v65.m.b(getActivity()));
        kotlinx.coroutines.flow.l.p(new kotlinx.coroutines.flow.y1(f3Var, new dv2.s(this, null)), v65.m.b(getActivity()));
        kotlinx.coroutines.flow.l.p(new kotlinx.coroutines.flow.y1(kotlinx.coroutines.flow.l.i(new kotlinx.coroutines.flow.c2(new kotlinx.coroutines.flow.j[]{f3Var, this.f243960x, this.f243959w}, new dv2.t(null))), new dv2.u(this, new kotlin.jvm.internal.h0(), null)), v65.m.b(getActivity()));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        ((kotlinx.coroutines.flow.h3) this.f243960x).k(java.lang.Boolean.FALSE);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        ((kotlinx.coroutines.flow.h3) this.f243960x).k(java.lang.Boolean.TRUE);
    }

    public final dv2.n x7() {
        com.tencent.mm.plugin.finder.viewmodel.component.bh bhVar = com.tencent.mm.plugin.finder.viewmodel.component.bh.f133877a;
        boolean booleanValue = ((java.lang.Boolean) ((kotlinx.coroutines.flow.l2) com.tencent.mm.plugin.finder.viewmodel.component.bh.f133884h).getValue()).booleanValue();
        int intValue = ((java.lang.Number) ((kotlinx.coroutines.flow.h3) com.tencent.mm.plugin.finder.viewmodel.component.bh.f133878b).getValue()).intValue();
        int size = ((java.util.List) ((kotlinx.coroutines.flow.h3) com.tencent.mm.plugin.finder.viewmodel.component.bh.f133880d).getValue()).size();
        boolean isTeenMode = ((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode();
        java.lang.String string = getActivity().getString(com.tencent.mm.R.string.m8z, java.lang.Integer.valueOf(intValue));
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return new dv2.n(booleanValue, string, isTeenMode ? getActivity().getString(com.tencent.mm.R.string.f6s) : intValue > 0 ? getActivity().getString(com.tencent.mm.R.string.p3p, java.lang.Integer.valueOf(intValue)) : null, size > 0 ? getActivity().getString(com.tencent.mm.R.string.f493803p50, java.lang.Integer.valueOf(size)) : null);
    }
}

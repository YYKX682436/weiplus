package sm2;

/* loaded from: classes3.dex */
public final class z3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f409810d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409811e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f409812f;

    public z3(android.os.Bundle bundle, sm2.o4 o4Var, com.tencent.mm.plugin.finder.live.plugin.mg mgVar) {
        this.f409810d = bundle;
        this.f409811e = o4Var;
        this.f409812f = mgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup viewGroup;
        boolean z17 = false;
        android.os.Bundle bundle = this.f409810d;
        if (bundle != null && bundle.getBoolean("PARAM_IS_ENTERING_COMMENT")) {
            z17 = true;
        }
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar = this.f409812f;
        sm2.o4 o4Var = this.f409811e;
        if (!z17) {
            com.tencent.mm.plugin.finder.live.plugin.et etVar = o4Var.A;
            if (etVar != null) {
                etVar.N = null;
            }
            android.view.ViewGroup.LayoutParams layoutParams = mgVar.f365323d.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.removeRule(12);
            layoutParams2.addRule(2, com.tencent.mm.R.id.fin);
            android.view.ViewGroup.LayoutParams layoutParams3 = mgVar.f365323d.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = o4Var.f409619j0;
            mgVar.f365323d.requestLayout();
            return;
        }
        com.tencent.mm.plugin.finder.live.plugin.et etVar2 = o4Var.A;
        if ((etVar2 != null ? etVar2.N : null) == null) {
            android.view.ViewGroup.LayoutParams layoutParams4 = mgVar.f365323d.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            o4Var.f409619j0 = ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin;
        }
        com.tencent.mm.plugin.finder.live.plugin.et etVar3 = o4Var.A;
        if (etVar3 != null) {
            etVar3.N = o4Var.f409628o;
        }
        android.view.ViewGroup.LayoutParams layoutParams5 = mgVar.f365323d.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams5, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams6 = (android.widget.RelativeLayout.LayoutParams) layoutParams5;
        layoutParams6.addRule(12);
        layoutParams6.removeRule(2);
        com.tencent.mm.plugin.finder.live.plugin.et etVar4 = o4Var.A;
        if (etVar4 == null || (viewGroup = etVar4.f365323d) == null) {
            return;
        }
        viewGroup.post(new sm2.y3(o4Var));
    }
}

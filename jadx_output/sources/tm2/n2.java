package tm2;

/* loaded from: classes3.dex */
public final class n2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f420555d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tm2.s2 f420556e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f420557f;

    public n2(android.os.Bundle bundle, tm2.s2 s2Var, com.tencent.mm.plugin.finder.live.plugin.mg mgVar) {
        this.f420555d = bundle;
        this.f420556e = s2Var;
        this.f420557f = mgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = false;
        android.os.Bundle bundle = this.f420555d;
        if (bundle != null && bundle.getBoolean("PARAM_IS_ENTERING_COMMENT")) {
            z17 = true;
        }
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar = this.f420557f;
        tm2.s2 s2Var = this.f420556e;
        if (!z17) {
            com.tencent.mm.plugin.finder.live.plugin.et etVar = s2Var.f420615z;
            if (etVar != null) {
                etVar.N = null;
            }
            android.view.ViewGroup.LayoutParams layoutParams = mgVar.f365323d.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.removeRule(12);
            layoutParams2.addRule(2, s2Var.f420602n0);
            android.view.ViewGroup.LayoutParams layoutParams3 = mgVar.f365323d.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = s2Var.f420585e0;
            mgVar.f365323d.requestLayout();
            return;
        }
        com.tencent.mm.plugin.finder.live.plugin.et etVar2 = s2Var.f420615z;
        if ((etVar2 != null ? etVar2.N : null) == null) {
            android.view.ViewGroup.LayoutParams layoutParams4 = mgVar.f365323d.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            s2Var.f420585e0 = ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin;
        }
        com.tencent.mm.plugin.finder.live.plugin.et etVar3 = s2Var.f420615z;
        if (etVar3 != null) {
            etVar3.N = s2Var.f420603o;
        }
        android.view.ViewGroup.LayoutParams layoutParams5 = mgVar.f365323d.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams5, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams6 = (android.widget.RelativeLayout.LayoutParams) layoutParams5;
        layoutParams6.addRule(12);
        layoutParams6.removeRule(2);
    }
}

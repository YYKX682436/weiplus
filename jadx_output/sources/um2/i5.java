package um2;

/* loaded from: classes3.dex */
public final class i5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f428833d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428834e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f428835f;

    public i5(android.os.Bundle bundle, um2.x5 x5Var, com.tencent.mm.plugin.finder.live.plugin.mg mgVar) {
        this.f428833d = bundle;
        this.f428834e = x5Var;
        this.f428835f = mgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.RelativeLayout.LayoutParams layoutParams;
        com.tencent.mm.plugin.finder.live.widget.dk dkVar;
        android.view.ViewGroup viewGroup;
        boolean z17 = false;
        android.os.Bundle bundle = this.f428833d;
        if (bundle != null && bundle.getBoolean("PARAM_IS_ENTERING_COMMENT")) {
            z17 = true;
        }
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar = this.f428835f;
        um2.x5 x5Var = this.f428834e;
        if (z17) {
            com.tencent.mm.plugin.finder.live.plugin.et etVar = x5Var.f429086x;
            if ((etVar != null ? etVar.N : null) == null) {
                android.view.ViewGroup.LayoutParams layoutParams2 = mgVar.f365323d.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                x5Var.f429027c1 = ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                com.tencent.mars.xlog.Log.i(x5Var.f429032f, "lxltest2 22 originCommentBottomMargin:" + x5Var.f429027c1);
            }
            com.tencent.mm.plugin.finder.live.plugin.et etVar2 = x5Var.f429086x;
            if (etVar2 != null) {
                etVar2.N = x5Var.f429071s;
            }
            android.view.ViewGroup.LayoutParams layoutParams3 = mgVar.f365323d.getLayoutParams();
            layoutParams = layoutParams3 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams != null) {
                layoutParams.addRule(12);
            }
            if (layoutParams != null) {
                layoutParams.removeRule(2);
            }
            com.tencent.mm.plugin.finder.live.plugin.et etVar3 = x5Var.f429086x;
            if (etVar3 == null || (viewGroup = etVar3.f365323d) == null) {
                return;
            }
            viewGroup.post(new um2.h5(x5Var));
            return;
        }
        com.tencent.mm.plugin.finder.live.plugin.ui uiVar = x5Var.f429078u0;
        if (uiVar != null) {
            java.lang.Boolean valueOf = (uiVar == null || (dkVar = uiVar.f114568p) == null) ? null : java.lang.Boolean.valueOf(dkVar.b());
            kotlin.jvm.internal.o.e(valueOf, "null cannot be cast to non-null type kotlin.Boolean");
            if (valueOf.booleanValue()) {
                com.tencent.mm.plugin.finder.live.plugin.et etVar4 = x5Var.f429086x;
                if (etVar4 != null) {
                    etVar4.N = null;
                }
                android.view.ViewGroup.LayoutParams layoutParams4 = mgVar.f365323d.getLayoutParams();
                layoutParams = layoutParams4 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams4 : null;
                if (layoutParams != null) {
                    layoutParams.removeRule(12);
                }
                if (layoutParams != null) {
                    layoutParams.addRule(2, x5Var.f429074t);
                }
                android.view.ViewGroup.LayoutParams layoutParams5 = mgVar.f365323d.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams5, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = x5Var.f429027c1;
                return;
            }
        }
        com.tencent.mm.plugin.finder.live.plugin.et etVar5 = x5Var.f429086x;
        if (etVar5 != null) {
            etVar5.N = null;
        }
        android.view.ViewGroup.LayoutParams layoutParams6 = mgVar.f365323d.getLayoutParams();
        layoutParams = layoutParams6 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams6 : null;
        if (layoutParams != null) {
            layoutParams.removeRule(12);
        }
        if (layoutParams != null) {
            layoutParams.addRule(2, x5Var.f429074t);
        }
        android.view.ViewGroup.LayoutParams layoutParams7 = mgVar.f365323d.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams7, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams7).bottomMargin = x5Var.f429027c1;
        mgVar.f365323d.requestLayout();
    }
}

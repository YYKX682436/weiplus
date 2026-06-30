package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class bk extends com.tencent.mm.plugin.finder.extension.reddot.rb {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.bl f133889d;

    public bk(com.tencent.mm.plugin.finder.viewmodel.component.bl blVar) {
        this.f133889d = blVar;
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.rb
    public void a(com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var) {
        r45.vs2 vs2Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[MENU_ID_PROFILE] red=");
        sb6.append(z9Var != null ? z9Var.f105329c : null);
        com.tencent.mars.xlog.Log.i("Finder.HomeActionBarUIC", sb6.toString());
        com.tencent.mm.plugin.finder.viewmodel.component.bl blVar = this.f133889d;
        android.widget.ImageView imageView = (android.widget.ImageView) blVar.findViewById(com.tencent.mm.R.id.ktu);
        android.widget.TextView textView = (android.widget.TextView) blVar.findViewById(com.tencent.mm.R.id.ktt);
        if (!(z9Var != null && z9Var.f105327a)) {
            com.tencent.mm.plugin.finder.viewmodel.component.bl.p7(this.f133889d, false, null, false, 6, null);
            if (imageView != null) {
                imageView.setVisibility(4);
            }
            if (textView == null) {
                return;
            }
            textView.setVisibility(4);
            return;
        }
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = z9Var.f105329c;
        java.lang.Integer valueOf = (jbVar == null || (vs2Var = jbVar.field_ctrInfo) == null) ? null : java.lang.Integer.valueOf(vs2Var.f388487e);
        if ((valueOf == null || valueOf.intValue() != 2) && ((valueOf == null || valueOf.intValue() != 1) && (valueOf == null || valueOf.intValue() != 1028))) {
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            if (textView != null) {
                textView.setVisibility(4);
            }
            blVar.R6(1);
            return;
        }
        r45.f03 f03Var = z9Var.f105328b;
        int i17 = f03Var != null ? f03Var.f373888e : 0;
        r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("TLPersonalCenter");
        int i18 = I0 != null ? I0.f373888e : i17;
        if (!(f03Var != null && f03Var.f373887d == 2) || i18 <= 0) {
            if (f03Var != null && f03Var.f373887d == 1) {
                if (!(imageView != null && imageView.getVisibility() == 0)) {
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                    blVar.R6(1);
                }
                if (textView != null) {
                    textView.setVisibility(4);
                }
            } else {
                if (imageView != null) {
                    imageView.setVisibility(4);
                }
                if (textView != null) {
                    textView.setVisibility(4);
                }
            }
        } else {
            if (imageView != null) {
                imageView.setVisibility(4);
            }
            if (textView != null) {
                com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
                textView.setTextSize(1, 10.0f);
                textView.setVisibility(0);
                textView.setText(com.tencent.mm.plugin.finder.assist.w2.a(i18));
                blVar.getClass();
                android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
                if (i18 < 10) {
                    layoutParams2.setMarginStart(0);
                    layoutParams2.setMarginEnd((int) blVar.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479646bl));
                    layoutParams2.gravity = 8388613;
                } else {
                    layoutParams2.gravity = 8388611;
                    layoutParams2.setMarginStart((int) blVar.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479688cn));
                    layoutParams2.setMarginEnd(0);
                }
                textView.setLayoutParams(layoutParams2);
                android.app.Activity context = blVar.getContext();
                kotlin.jvm.internal.o.g(context, "context");
                textView.setBackgroundResource(java.lang.Float.compare(i65.a.q(context), i65.a.z(context)) > 0 ? i18 < 10 ? com.tencent.mm.R.drawable.b5b : com.tencent.mm.R.drawable.b5e : i18 < 10 ? com.tencent.mm.R.drawable.b5c : com.tencent.mm.R.drawable.b5d);
            }
            blVar.R6(1);
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("resultCount:");
        sb7.append(i17);
        sb7.append(" count:");
        sb7.append(i18);
        sb7.append(" show_type:");
        sb7.append(f03Var != null ? java.lang.Integer.valueOf(f03Var.f373887d) : null);
        sb7.append(" redDotCountView=");
        sb7.append(textView != null ? java.lang.Integer.valueOf(textView.getVisibility()) : null);
        sb7.append(" redDotNormalView=");
        sb7.append(imageView != null ? java.lang.Integer.valueOf(imageView.getVisibility()) : null);
        com.tencent.mars.xlog.Log.i("Finder.HomeActionBarUIC", sb7.toString());
    }
}

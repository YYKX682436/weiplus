package sp2;

/* loaded from: classes2.dex */
public final class y implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.b0 f411283d;

    public y(sp2.b0 b0Var) {
        this.f411283d = b0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        r45.vs2 vs2Var;
        com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var = (com.tencent.mm.plugin.finder.extension.reddot.z9) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[personalCenterLiveRedDot] red=");
        sb6.append(z9Var != null ? z9Var.f105329c : null);
        com.tencent.mars.xlog.Log.i("LiveEntranceFragmentUICMoreIcon", sb6.toString());
        sp2.b0 b0Var = this.f411283d;
        android.widget.ImageView imageView = (android.widget.ImageView) b0Var.findViewById(com.tencent.mm.R.id.ub_);
        android.widget.TextView textView = (android.widget.TextView) b0Var.findViewById(com.tencent.mm.R.id.ub9);
        if (!(z9Var != null && z9Var.f105327a)) {
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
        if (valueOf == null || valueOf.intValue() != 44) {
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            if (textView != null) {
                textView.setVisibility(4);
            }
            b0Var.O6(ll2.a.f319124e);
            return;
        }
        r45.f03 f03Var = z9Var.f105328b;
        int i17 = f03Var != null ? f03Var.f373888e : 0;
        r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("LivePersonalCenter");
        int i18 = I0 != null ? I0.f373888e : i17;
        if (!(f03Var != null && f03Var.f373887d == 2) || i18 <= 0) {
            if (f03Var != null && f03Var.f373887d == 1) {
                if (!(imageView != null && imageView.getVisibility() == 0)) {
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                    b0Var.O6(ll2.a.f319124e);
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
                android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
                if (i18 < 10) {
                    layoutParams2.setMarginStart(0);
                    layoutParams2.setMarginEnd((int) b0Var.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479646bl));
                    layoutParams2.gravity = 8388613;
                } else {
                    layoutParams2.gravity = 8388611;
                    layoutParams2.setMarginStart((int) b0Var.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479688cn));
                    layoutParams2.setMarginEnd(0);
                }
                textView.setLayoutParams(layoutParams2);
                android.app.Activity context = b0Var.getContext();
                kotlin.jvm.internal.o.g(context, "context");
                textView.setBackgroundResource(java.lang.Float.compare(i65.a.q(context), i65.a.z(context)) > 0 ? i18 < 10 ? com.tencent.mm.R.drawable.b5b : com.tencent.mm.R.drawable.b5e : i18 < 10 ? com.tencent.mm.R.drawable.b5c : com.tencent.mm.R.drawable.b5d);
            }
            com.tencent.mars.xlog.Log.i("LiveEntranceFragmentUICMoreIcon", "redDotCountView = " + textView.getVisibility());
            b0Var.O6(ll2.a.f319124e);
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
        com.tencent.mars.xlog.Log.i("LiveEntranceFragmentUICMoreIcon", sb7.toString());
    }
}

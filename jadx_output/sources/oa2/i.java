package oa2;

/* loaded from: classes2.dex */
public final class i extends x92.e {
    public final jz5.g B;
    public final jz5.g C;
    public final jz5.g D;
    public final jz5.g E;
    public final jz5.g F;
    public final jz5.g G;
    public float H;
    public final jz5.g I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.B = jz5.h.b(new oa2.g(activity));
        this.C = jz5.h.b(new oa2.b(activity));
        this.D = jz5.h.b(new oa2.a(this));
        jz5.i iVar = jz5.i.f302831f;
        this.E = jz5.h.a(iVar, new oa2.c(this));
        this.F = jz5.h.a(iVar, new oa2.d(this));
        this.G = jz5.h.a(iVar, new oa2.e(this));
        this.H = -1.0f;
        this.I = jz5.h.b(oa2.h.f343819d);
    }

    @Override // x92.e, x92.r
    public void R6() {
        super.R6();
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) getActivity().findViewById(com.tencent.mm.R.id.r6w);
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new oa2.f(this));
        }
        android.widget.TextView textView = (android.widget.TextView) this.G.getValue();
        kotlin.jvm.internal.o.f(textView, "<get-designerTextView>(...)");
        com.tencent.mm.ui.fk.b(textView);
        a7();
    }

    @Override // x92.e, x92.r
    public void T6(com.tencent.mm.protobuf.f fVar) {
        r45.r03 r03Var = (r45.r03) fVar;
        super.T6(r03Var);
        if (r03Var != null) {
            v92.g gVar = this.f452685u;
            pa2.g gVar2 = gVar instanceof pa2.g ? (pa2.g) gVar : null;
            if (gVar2 != null) {
                gVar2.f352976c = r03Var;
            }
            a7();
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) this.E.getValue();
            if (linearLayout == null) {
                return;
            }
            linearLayout.setVisibility(0);
        }
    }

    @Override // x92.e
    public void W6(com.google.android.material.appbar.AppBarLayout view, float f17) {
        kotlin.jvm.internal.o.g(view, "view");
        super.W6(view, f17);
        float abs = java.lang.Math.abs(f17) / ((java.lang.Number) ((jz5.n) this.B).getValue()).intValue();
        if (abs > 1.0f) {
            abs = 1.0f;
        }
        if (abs < 0.0f) {
            abs = 0.0f;
        }
        if (this.H == abs) {
            return;
        }
        this.H = abs;
        ((android.view.View) ((jz5.n) this.D).getValue()).setTranslationY((1.0f - abs) * ((java.lang.Number) ((jz5.n) this.C).getValue()).intValue());
    }

    @Override // x92.e
    public v92.g X6() {
        return new pa2.g(getActivity(), (r45.r03) this.f452719d);
    }

    @Override // x92.e
    public java.lang.String Y6() {
        r45.r23 r23Var;
        r45.rz6 rz6Var;
        r45.b70 b70Var;
        r45.r03 r03Var = (r45.r03) this.f452719d;
        java.lang.String str = (r03Var == null || (r23Var = (r45.r23) r03Var.getCustom(23)) == null || (rz6Var = (r45.rz6) r23Var.getCustom(1)) == null || (b70Var = rz6Var.f385323g) == null) ? null : b70Var.f370582d;
        return str == null ? "" : str;
    }

    public final void a7() {
        java.lang.String str;
        java.lang.String str2;
        r45.r23 r23Var;
        r45.r03 r03Var = (r45.r03) this.f452719d;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (r03Var == null || (r23Var = (r45.r23) r03Var.getCustom(23)) == null) ? null : (com.tencent.mm.protocal.protobuf.FinderJumpInfo) r23Var.getCustom(6);
        if (finderJumpInfo == null || (str = finderJumpInfo.getWording()) == null) {
            str = "";
        }
        if (finderJumpInfo == null || (str2 = finderJumpInfo.getIcon_url()) == null) {
            str2 = "";
        }
        boolean z17 = true;
        boolean z18 = str.length() == 0;
        jz5.g gVar = this.I;
        if (z18) {
            bw5.a00 a00Var = ((ey2.c0) ((xy2.g) ((jz5.n) gVar).getValue())).f257329e;
            str = a00Var != null ? a00Var.f24961g[3] ? a00Var.f24960f : "" : null;
        }
        if (!(str == null || str.length() == 0)) {
            ((android.widget.TextView) this.G.getValue()).setText(str);
        }
        if (str2.length() == 0) {
            bw5.a00 a00Var2 = ((ey2.c0) ((xy2.g) ((jz5.n) gVar).getValue())).f257329e;
            str2 = a00Var2 != null ? a00Var2.f24961g[2] ? a00Var2.f24959e : "" : null;
        }
        if (str2 != null && str2.length() != 0) {
            z17 = false;
        }
        jz5.g gVar2 = this.F;
        if (z17) {
            ((com.tencent.mm.ui.widget.imageview.WeImageView) gVar2.getValue()).setIconColor(b3.l.getColor(getContext(), com.tencent.mm.R.color.Brand_100));
            return;
        }
        ((com.tencent.mm.ui.widget.imageview.WeImageView) gVar2.getValue()).setEnableColorFilter(false);
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d e17 = g1Var.e();
        mn2.q3 q3Var = new mn2.q3(str2, com.tencent.mm.plugin.finder.storage.y90.f128356f);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) gVar2.getValue();
        kotlin.jvm.internal.o.f(weImageView, "<get-designerIconView>(...)");
        e17.c(q3Var, weImageView, g1Var.h(mn2.f1.B));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        jz5.g gVar = this.D;
        android.view.View view = (android.view.View) ((jz5.n) gVar).getValue();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/activity/template/FinderTemplateTopicActionBarUIC", "onCreateAfter", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/activity/template/FinderTemplateTopicActionBarUIC", "onCreateAfter", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((android.view.View) ((jz5.n) gVar).getValue()).setTranslationY(((java.lang.Number) ((jz5.n) this.C).getValue()).intValue());
    }
}

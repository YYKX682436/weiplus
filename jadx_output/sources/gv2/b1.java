package gv2;

/* loaded from: classes10.dex */
public final class b1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f275989d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gv2.c1 f275990e;

    public b1(in5.s0 s0Var, gv2.c1 c1Var) {
        this.f275989d = s0Var;
        this.f275990e = c1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert$refreshAwesomeIv$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view;
        in5.s0 s0Var = this.f275989d;
        jv2.i iVar = (jv2.i) s0Var.f293125i;
        ev2.n nVar = ev2.n.f256921f;
        ev2.n nVar2 = ev2.n.f256921f;
        gv2.c1 c1Var = this.f275990e;
        boolean b17 = nVar2.b(((com.tencent.mm.plugin.finder.uniComments.q3) c1Var.f275996e).m().a(), iVar.f302223d, ((com.tencent.mm.plugin.finder.uniComments.q3) c1Var.f275996e).f130372i);
        if (((com.tencent.mm.plugin.finder.uniComments.q3) c1Var.f275996e).f130386z) {
            if (b17) {
                db5.t7.makeText(s0Var.f293121e, com.tencent.mm.R.string.m7l, 0).show();
            } else {
                db5.t7.makeText(s0Var.f293121e, com.tencent.mm.R.string.m7j, 0).show();
            }
            yj0.a.h(this, "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert$refreshAwesomeIv$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        boolean z17 = !b17;
        if (z17) {
            weImageView.setImageResource(com.tencent.mm.R.raw.icon_filled_awesome);
            weImageView.setIconColor(s0Var.f293121e.getResources().getColor(com.tencent.mm.R.color.Red_90));
        } else {
            weImageView.setImageResource(com.tencent.mm.R.raw.icon_outlined_awesome);
            weImageView.setIconColor(s0Var.f293121e.getResources().getColor(com.tencent.mm.R.color.f478714f5));
        }
        ((com.tencent.mm.plugin.finder.uniComments.q3) c1Var.f275996e).R(weImageView, s0Var.getAdapterPosition());
        int a17 = nVar2.a(((com.tencent.mm.plugin.finder.uniComments.q3) c1Var.f275996e).m().a(), iVar.f302223d, ((com.tencent.mm.plugin.finder.uniComments.q3) c1Var.f275996e).f130372i);
        if (a17 > 0) {
            s0Var.w(com.tencent.mm.R.id.f483312aa0, 0);
            s0Var.s(com.tencent.mm.R.id.f483312aa0, java.lang.String.valueOf(a17));
        } else {
            s0Var.w(com.tencent.mm.R.id.f483312aa0, 8);
            s0Var.s(com.tencent.mm.R.id.f483312aa0, "");
        }
        if (z17) {
            ((android.widget.TextView) s0Var.p(com.tencent.mm.R.id.f483312aa0)).setTextColor(s0Var.f293121e.getResources().getColor(com.tencent.mm.R.color.Red_100));
        } else {
            ((android.widget.TextView) s0Var.p(com.tencent.mm.R.id.f483312aa0)).setTextColor(s0Var.f293121e.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_3));
        }
        if (z17) {
            uw2.h0.o(uw2.h0.f431674a, weImageView, 0L, 2, null);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(s0Var.p(com.tencent.mm.R.id.a_z), "finder_feed_second_comment_awesome_iv");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert$refreshAwesomeIv$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

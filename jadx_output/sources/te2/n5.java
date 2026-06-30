package te2;

/* loaded from: classes3.dex */
public final class n5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f418250d;

    public n5(te2.p8 p8Var) {
        this.f418250d = p8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String string;
        r45.m94 m94Var;
        r45.m94 m94Var2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$initBottomArea$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        te2.p8 p8Var = this.f418250d;
        r45.l32 l32Var = p8Var.Z;
        if ((l32Var == null || (m94Var2 = (r45.m94) l32Var.getCustom(12)) == null) ? false : m94Var2.getBoolean(0)) {
            android.app.Activity context = p8Var.getContext();
            r45.l32 l32Var2 = p8Var.Z;
            if (l32Var2 == null || (m94Var = (r45.m94) l32Var2.getCustom(12)) == null || (string = m94Var.getString(1)) == null) {
                string = p8Var.getActivity().getResources().getString(com.tencent.mm.R.string.osz);
            }
            db5.t7.g(context, string);
        } else {
            p8Var.getClass();
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) p8Var.getContext(), 0, true);
            k0Var.X1 = false;
            k0Var.U1 = true;
            k0Var.f211855d2 = false;
            ((com.tencent.mm.pluginsdk.forward.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
            new com.tencent.mm.pluginsdk.forward.m().Di(p8Var.getActivity(), k0Var, 2, null, new te2.v4(k0Var, p8Var));
            k0Var.f211872n = new te2.p4(k0Var, p8Var);
            k0Var.f211874o = new te2.q4(p8Var);
            k0Var.f211881s = new te2.r4(p8Var, k0Var);
            k0Var.f211884v = new te2.s4(k0Var, p8Var);
            k0Var.v();
            if (p8Var.A1.f418390a) {
                ml2.c3[] c3VarArr = ml2.c3.f327331d;
                p8Var.o7(6);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$initBottomArea$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

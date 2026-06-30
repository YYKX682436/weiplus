package id2;

/* loaded from: classes3.dex */
public final class e1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.v1 f290546d;

    public e1(id2.v1 v1Var) {
        this.f290546d = v1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$refreshEditLevelView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        id2.v1 v1Var = this.f290546d;
        com.tencent.mm.ui.widget.picker.c0 c0Var = new com.tencent.mm.ui.widget.picker.c0(v1Var.getActivity(), new java.util.ArrayList(v1Var.U6().keySet()));
        java.util.ArrayList arrayList2 = v1Var.C;
        c0Var.i(arrayList2.indexOf(java.lang.Integer.valueOf(v1Var.L)));
        c0Var.B = new id2.s1(v1Var);
        c0Var.f212259t = new id2.t1(v1Var, c0Var);
        android.view.View inflate = android.view.LayoutInflater.from(v1Var.getActivity()).inflate(com.tencent.mm.R.layout.ary, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        int color = v1Var.getActivity().getResources().getColor(com.tencent.mm.R.color.f479063oq);
        android.widget.Button button = c0Var.f212252m;
        if (button != null) {
            button.setTextColor(color);
        }
        c0Var.h(2);
        android.widget.Button button2 = c0Var.f212251i;
        if (button2 != null) {
            button2.setBackgroundResource(com.tencent.mm.R.drawable.f481701a12);
        }
        java.lang.String string = v1Var.getActivity().getResources().getString(com.tencent.mm.R.string.diq);
        android.widget.Button button3 = c0Var.f212251i;
        if (button3 != null) {
            button3.setText(string);
        }
        c0Var.g(inflate);
        y9.i iVar = c0Var.f212246d;
        if (iVar != null) {
            iVar.getWindow().setDimAmount(0.0f);
        }
        c0Var.l();
        zl2.r4.f473950a.T2(2);
        android.view.View view2 = (android.view.View) ((jz5.n) v1Var.f290844q).getValue();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC", "showChooseTargetLevelDialog", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC", "showChooseTargetLevelDialog", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View S6 = v1Var.S6();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(4);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(S6, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC", "showChooseTargetLevelDialog", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        S6.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(S6, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC", "showChooseTargetLevelDialog", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        v1Var.W6((java.lang.Integer) arrayList2.get(c0Var.b()));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$refreshEditLevelView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package pk2;

/* loaded from: classes3.dex */
public final class da extends qk2.d {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f355681i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f355682j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f355681i = "audience.more.morefunction.rewardlimit";
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f355681i;
    }

    @Override // qk2.d, qk2.f
    public boolean o() {
        r45.f82 f82Var = ((mm2.v5) this.f364427a.c(mm2.v5.class)).f329486i;
        return f82Var != null && f82Var.getInteger(0) == 1;
    }

    @Override // qk2.d
    public void t(pk2.o9 o9Var, com.tencent.mm.plugin.finder.view.e3 bottomSheet, java.lang.Integer num) {
        pk2.g8 g8Var;
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        android.view.View view = bottomSheet.f131959f;
        r45.f82 f82Var = ((mm2.v5) o9Var.c(mm2.v5.class)).f329486i;
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        c0Var.f310112d = true;
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.m1j);
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.m1k);
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.oah);
        if (o()) {
            pk2.f8.d(pk2.f8.f355747a, 4, 0, 3, 1, null, 16, null);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/VisitorConsumeOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/VisitorConsumeOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/VisitorConsumeOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/moreaction/VisitorConsumeOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/VisitorConsumeOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/moreaction/VisitorConsumeOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            pk2.d9 d9Var = o9Var.f356082f;
            il2.r rVar = (d9Var == null || (g8Var = d9Var.f355658a) == null) ? null : (il2.r) ((pk2.k9) g8Var).f355924a.R6(il2.r.class);
            r45.f82 f82Var2 = f82Var == null ? ((mm2.v5) o9Var.c(mm2.v5.class)).f329486i : f82Var;
            com.tencent.mars.xlog.Log.i(o9Var.f356072a, "showConsumeManagerWidget restrictConsumeDialogData: " + f82Var2);
            if (rVar != null && f82Var2 != null && d9Var != null) {
                d9Var.f355664g = new kl2.e0(o9Var.f356078d, rVar, view, f82Var2, new pk2.z9(c0Var, bottomSheet), new pk2.aa(c0Var, o9Var), new pk2.ba(o9Var));
            }
        } else {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/VisitorConsumeOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/VisitorConsumeOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(findViewById2, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/VisitorConsumeOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/moreaction/VisitorConsumeOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(findViewById3, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/VisitorConsumeOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/moreaction/VisitorConsumeOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        bottomSheet.f131968r = new pk2.ca(c0Var, this, o9Var);
    }

    @Override // qk2.d
    public java.lang.Integer u() {
        return java.lang.Integer.valueOf(com.tencent.mm.R.id.oau);
    }
}

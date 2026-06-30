package pj5;

/* loaded from: classes10.dex */
public final class f extends androidx.recyclerview.widget.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.schedulemsg.ScheduleMsgDetailUI f355372a;

    public f(com.tencent.mm.ui.schedulemsg.ScheduleMsgDetailUI scheduleMsgDetailUI) {
        this.f355372a = scheduleMsgDetailUI;
    }

    @Override // androidx.recyclerview.widget.h2
    public void g(int i17, int i18) {
        int i19 = com.tencent.mm.ui.schedulemsg.ScheduleMsgDetailUI.f209784e;
        com.tencent.mm.ui.schedulemsg.ScheduleMsgDetailUI scheduleMsgDetailUI = this.f355372a;
        androidx.recyclerview.widget.f2 adapter = scheduleMsgDetailUI.T6().b().getAdapter();
        boolean z17 = (adapter != null ? adapter.getItemCount() : 0) > 0;
        com.tencent.mm.view.recyclerview.WxRecyclerView b17 = scheduleMsgDetailUI.T6().b();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(b17, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(b17, arrayList2.toArray(), "com/tencent/mm/ui/schedulemsg/ScheduleMsgDetailUI$onCreate$2$1$3$1", "onItemRangeRemoved", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(b17, "com/tencent/mm/ui/schedulemsg/ScheduleMsgDetailUI$onCreate$2$1$3$1", "onItemRangeRemoved", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(b17, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (((android.view.View) pm0.v.E(valueOf, b17)) == null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(b17, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Integer.valueOf(intValue2));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(b17, arrayList4.toArray(), "com/tencent/mm/ui/schedulemsg/ScheduleMsgDetailUI$onCreate$2$1$3$1", "onItemRangeRemoved", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b17.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(b17, "com/tencent/mm/ui/schedulemsg/ScheduleMsgDetailUI$onCreate$2$1$3$1", "onItemRangeRemoved", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(b17, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.ui.widget.MMTextView a17 = scheduleMsgDetailUI.T6().a();
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(!z17);
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(a17, arrayList5.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue3 = ((java.lang.Integer) arrayList5.get(0)).intValue();
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(java.lang.Integer.valueOf(intValue3));
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(a17, arrayList6.toArray(), "com/tencent/mm/ui/schedulemsg/ScheduleMsgDetailUI$onCreate$2$1$3$1", "onItemRangeRemoved", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        a17.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(a17, "com/tencent/mm/ui/schedulemsg/ScheduleMsgDetailUI$onCreate$2$1$3$1", "onItemRangeRemoved", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(a17, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (((android.view.View) pm0.v.E(valueOf2, a17)) == null) {
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(a17, arrayList7.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue4 = ((java.lang.Integer) arrayList7.get(0)).intValue();
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(java.lang.Integer.valueOf(intValue4));
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(a17, arrayList8.toArray(), "com/tencent/mm/ui/schedulemsg/ScheduleMsgDetailUI$onCreate$2$1$3$1", "onItemRangeRemoved", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            a17.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(a17, "com/tencent/mm/ui/schedulemsg/ScheduleMsgDetailUI$onCreate$2$1$3$1", "onItemRangeRemoved", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(a17, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}

package pj5;

/* loaded from: classes10.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.schedulemsg.ScheduleMsgDetailUI f355373d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.ui.schedulemsg.ScheduleMsgDetailUI scheduleMsgDetailUI) {
        super(4);
        this.f355373d = scheduleMsgDetailUI;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        java.util.LinkedList linkedList = (java.util.LinkedList) obj4;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SetMsgRemindCgi callback, errType: ");
        sb6.append(intValue);
        sb6.append(", errCode: ");
        sb6.append(intValue2);
        sb6.append(", errMsg: ");
        sb6.append((java.lang.String) obj3);
        sb6.append(", remindList: ");
        sb6.append(linkedList != null ? java.lang.Integer.valueOf(linkedList.size()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ScheduleMsgDetailUI", sb6.toString());
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (linkedList != null) {
            linkedList.removeIf(new pj5.e(currentTimeMillis));
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("SetMsgRemindCgi callback, removed outdated remind, remindList: ");
        sb7.append(linkedList != null ? java.lang.Integer.valueOf(linkedList.size()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ScheduleMsgDetailUI", sb7.toString());
        int i17 = com.tencent.mm.ui.schedulemsg.ScheduleMsgDetailUI.f209784e;
        com.tencent.mm.ui.schedulemsg.ScheduleMsgDetailUI scheduleMsgDetailUI = this.f355373d;
        em.u3 T6 = scheduleMsgDetailUI.T6();
        if (T6.f254850b == null) {
            T6.f254850b = (android.widget.ProgressBar) T6.f254849a.findViewById(com.tencent.mm.R.id.v0q);
        }
        T6.f254850b.setVisibility(8);
        if (intValue == 0 && intValue2 == 0) {
            scheduleMsgDetailUI.T6().a().setText(scheduleMsgDetailUI.getContext().getString(com.tencent.mm.R.string.p6v));
        } else {
            androidx.appcompat.app.AppCompatActivity context = scheduleMsgDetailUI.getContext();
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            context.getText(com.tencent.mm.R.string.p7a);
            scheduleMsgDetailUI.T6().a().setText(scheduleMsgDetailUI.getContext().getString(com.tencent.mm.R.string.p7a));
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView b17 = scheduleMsgDetailUI.T6().b();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(!(linkedList == null || linkedList.isEmpty()));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(b17, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue3 = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue3));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(b17, arrayList2.toArray(), "com/tencent/mm/ui/schedulemsg/ScheduleMsgDetailUI$onCreate$2$1", "invoke", "(IILjava/lang/String;Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(b17, "com/tencent/mm/ui/schedulemsg/ScheduleMsgDetailUI$onCreate$2$1", "invoke", "(IILjava/lang/String;Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(b17, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (((android.view.View) pm0.v.E(valueOf, b17)) == null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(b17, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue4 = ((java.lang.Integer) arrayList3.get(0)).intValue();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Integer.valueOf(intValue4));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(b17, arrayList4.toArray(), "com/tencent/mm/ui/schedulemsg/ScheduleMsgDetailUI$onCreate$2$1", "invoke", "(IILjava/lang/String;Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b17.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(b17, "com/tencent/mm/ui/schedulemsg/ScheduleMsgDetailUI$onCreate$2$1", "invoke", "(IILjava/lang/String;Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(b17, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.ui.widget.MMTextView a17 = scheduleMsgDetailUI.T6().a();
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(linkedList == null || linkedList.isEmpty());
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(a17, arrayList5.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue5 = ((java.lang.Integer) arrayList5.get(0)).intValue();
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(java.lang.Integer.valueOf(intValue5));
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(a17, arrayList6.toArray(), "com/tencent/mm/ui/schedulemsg/ScheduleMsgDetailUI$onCreate$2$1", "invoke", "(IILjava/lang/String;Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        a17.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(a17, "com/tencent/mm/ui/schedulemsg/ScheduleMsgDetailUI$onCreate$2$1", "invoke", "(IILjava/lang/String;Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(a17, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (((android.view.View) pm0.v.E(valueOf2, a17)) == null) {
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(a17, arrayList7.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue6 = ((java.lang.Integer) arrayList7.get(0)).intValue();
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(java.lang.Integer.valueOf(intValue6));
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(a17, arrayList8.toArray(), "com/tencent/mm/ui/schedulemsg/ScheduleMsgDetailUI$onCreate$2$1", "invoke", "(IILjava/lang/String;Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            a17.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(a17, "com/tencent/mm/ui/schedulemsg/ScheduleMsgDetailUI$onCreate$2$1", "invoke", "(IILjava/lang/String;Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(a17, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (!(linkedList == null || linkedList.isEmpty())) {
            com.tencent.mm.view.recyclerview.WxRecyclerView b18 = scheduleMsgDetailUI.T6().b();
            xm3.t0 t0Var = new xm3.t0(new pj5.b(linkedList), scheduleMsgDetailUI, new in5.s() { // from class: com.tencent.mm.ui.schedulemsg.ScheduleMsgDetailUI$onCreate$2$1$2
                @Override // in5.s
                public pj5.t getItemConvert(int type) {
                    return new pj5.t();
                }
            }, false);
            t0Var.f455380J = false;
            t0Var.registerAdapterDataObserver(new pj5.f(scheduleMsgDetailUI));
            b18.setAdapter(t0Var);
        }
        return jz5.f0.f302826a;
    }
}

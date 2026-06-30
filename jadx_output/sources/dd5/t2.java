package dd5;

/* loaded from: classes9.dex */
public final class t2 extends uc5.b0 {

    /* renamed from: p, reason: collision with root package name */
    public static final dd5.t2 f229294p = new dd5.t2();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2() {
        super(dd5.w2.f229326c);
        dd5.w2.f229325b.getClass();
    }

    @Override // uc5.n
    public void s(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.a2 binding = (em.a2) obj;
        dd5.v2 v2Var = (dd5.v2) r0Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(binding, "binding");
        if (v2Var == null) {
            return;
        }
        android.widget.TextView d17 = binding.d();
        kotlin.jvm.internal.o.f(d17, "getTitleTv(...)");
        z(d17, context, v2Var.f229316a);
        android.widget.TextView b17 = binding.b();
        kotlin.jvm.internal.o.f(b17, "getDescTv(...)");
        java.lang.CharSequence charSequence = v2Var.f229317b;
        z(b17, context, charSequence);
        android.widget.TextView b18 = binding.b();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(r26.n0.N(charSequence));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(b18, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "invisibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(b18, arrayList2.toArray(), "com/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeTrade$Convert", "onBindView", "(Landroid/content/Context;Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryListItemViewVB;Lcom/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeTrade$ViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(b18, "com/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeTrade$Convert", "onBindView", "(Landroid/content/Context;Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryListItemViewVB;Lcom/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeTrade$ViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(b18, "com/tencent/mm/kt/CommonKt", "invisibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (((android.view.View) pm0.v.E(valueOf, b18)) == null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(b18, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "invisibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Integer.valueOf(intValue2));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(b18, arrayList4.toArray(), "com/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeTrade$Convert", "onBindView", "(Landroid/content/Context;Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryListItemViewVB;Lcom/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeTrade$ViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b18.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(b18, "com/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeTrade$Convert", "onBindView", "(Landroid/content/Context;Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryListItemViewVB;Lcom/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeTrade$ViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(b18, "com/tencent/mm/kt/CommonKt", "invisibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        int b19 = i65.a.b(context, 6);
        binding.c().setPadding(b19, b19, b19, b19);
        binding.c().setImageResource(v2Var.f229318c);
        binding.c().setBackgroundColor(v2Var.f229319d);
    }

    @Override // uc5.n
    public void u(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.a2 binding = (em.a2) obj;
        dd5.v2 v2Var = (dd5.v2) r0Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(binding, "binding");
        if (v2Var == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent().putExtra("Chat_User", v2Var.f229321f).putExtra("msg_local_id", v2Var.f229320e).putExtra("finish_direct", true).putExtra("from_global_search", true).setClass(context, com.tencent.mm.ui.chatting.ChattingUI.class);
        kotlin.jvm.internal.o.f(intent, "setClass(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeTrade$Convert", "onItemBodyClick", "(Landroid/content/Context;Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryListItemViewVB;Lcom/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeTrade$ViewModel;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeTrade$Convert", "onItemBodyClick", "(Landroid/content/Context;Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryListItemViewVB;Lcom/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeTrade$ViewModel;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0298 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    @Override // uc5.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object w(android.content.Context r32, com.tencent.mm.storage.f9 r33, kotlin.coroutines.Continuation r34) {
        /*
            Method dump skipped, instructions count: 1068
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dd5.t2.w(android.content.Context, com.tencent.mm.storage.f9, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

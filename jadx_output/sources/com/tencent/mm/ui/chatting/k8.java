package com.tencent.mm.ui.chatting;

/* loaded from: classes.dex */
public class k8 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.ChatFooterCustom f201896a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.LinearLayout f201897b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.FrameLayout f201898c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View.OnClickListener f201899d = new com.tencent.mm.ui.chatting.j8(this);

    public k8(com.tencent.mm.ui.chatting.ChatFooterCustom chatFooterCustom) {
        this.f201896a = chatFooterCustom;
    }

    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Sport.ChattingSportFooterHandler", "initFooter");
        com.tencent.mm.ui.chatting.ChatFooterCustom chatFooterCustom = this.f201896a;
        android.view.View findViewById = chatFooterCustom.findViewById(com.tencent.mm.R.id.blq);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/chatting/ChattingSportFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/ui/chatting/ChattingSportFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = chatFooterCustom.findViewById(com.tencent.mm.R.id.blk);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/ChattingSportFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/ui/chatting/ChattingSportFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) chatFooterCustom.findViewById(com.tencent.mm.R.id.bll);
        this.f201897b = linearLayout;
        linearLayout.setWeightSum(1.0f);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) this.f201897b.getChildAt(0);
        this.f201898c = frameLayout;
        frameLayout.setVisibility(0);
        this.f201898c.setOnClickListener(this.f201899d);
        ((android.widget.TextView) this.f201898c.findViewById(com.tencent.mm.R.id.bln)).setText(com.tencent.mm.R.string.c5_);
        android.view.View findViewById3 = this.f201898c.findViewById(com.tencent.mm.R.id.blm);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/ui/chatting/ChattingSportFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/ui/chatting/ChattingSportFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        for (int i17 = 1; i17 < 6; i17++) {
            android.view.View childAt = this.f201897b.getChildAt(i17);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(childAt, arrayList4.toArray(), "com/tencent/mm/ui/chatting/ChattingSportFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            childAt.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(childAt, "com/tencent/mm/ui/chatting/ChattingSportFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}

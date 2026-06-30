package com.tencent.mm.ui.chatting;

/* loaded from: classes5.dex */
public class g2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ChatFooterCustom f200517d;

    public g2(com.tencent.mm.ui.chatting.ChatFooterCustom chatFooterCustom) {
        this.f200517d = chatFooterCustom;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChatFooterCustom$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.ChatFooterCustom chatFooterCustom = this.f200517d;
        chatFooterCustom.f198171h.a();
        android.widget.ImageView imageView = (android.widget.ImageView) view;
        if (imageView.getTag() == null) {
            imageView.setTag(new java.lang.Object());
            imageView.setImageResource(com.tencent.mm.R.drawable.ap_);
            int i17 = 0;
            while (i17 < chatFooterCustom.f198178r) {
                android.view.View childAt = chatFooterCustom.f198167d.getChildAt(i17);
                int i18 = i17 >= 3 ? 0 : 8;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(childAt, arrayList2.toArray(), "com/tencent/mm/ui/chatting/ChatFooterCustom$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(childAt, "com/tencent/mm/ui/chatting/ChatFooterCustom$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                i17++;
            }
        } else {
            imageView.setTag(null);
            imageView.setImageResource(com.tencent.mm.R.drawable.ap9);
            int i19 = 0;
            while (i19 < chatFooterCustom.f198178r) {
                android.view.View childAt2 = chatFooterCustom.f198167d.getChildAt(i19);
                int i27 = i19 < 3 ? 0 : 8;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(java.lang.Integer.valueOf(i27));
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(childAt2, arrayList3.toArray(), "com/tencent/mm/ui/chatting/ChatFooterCustom$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(childAt2, "com/tencent/mm/ui/chatting/ChatFooterCustom$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                i19++;
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChatFooterCustom$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

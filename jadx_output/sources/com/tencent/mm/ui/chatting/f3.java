package com.tencent.mm.ui.chatting;

/* loaded from: classes.dex */
public class f3 implements android.view.View.OnClickListener {
    public f3(com.tencent.mm.ui.chatting.g3 g3Var) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChattingDownloaderFooterHandler$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).Ri(view.getContext(), null, null);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingDownloaderFooterHandler$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

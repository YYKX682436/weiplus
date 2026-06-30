package com.tencent.mm.ui.chatting;

/* loaded from: classes.dex */
public class j8 implements android.view.View.OnClickListener {
    public j8(com.tencent.mm.ui.chatting.k8 k8Var) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChattingSportFooterHandler$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ve4.g.a(1);
        c01.e2.n0("gh_43f2581f6fd6");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_is_latest", true);
        intent.putExtra("rank_id", "#");
        intent.putExtra("key_only_show_latest_rank", true);
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        intent.putExtra("app_username", c01.a2.e("gh_43f2581f6fd6"));
        intent.putExtra("device_type", 1);
        j45.l.j(view.getContext(), "exdevice", ".ui.ExdeviceRankInfoUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingSportFooterHandler$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

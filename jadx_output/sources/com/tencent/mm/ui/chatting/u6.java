package com.tencent.mm.ui.chatting;

/* loaded from: classes.dex */
public class u6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.f7 f202736d;

    public u6(com.tencent.mm.ui.chatting.f7 f7Var) {
        this.f202736d = f7Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChattingQQMailFooterHandler$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("composeType", 1);
        j45.l.j(this.f202736d.f200489b, "qqmail", ".ui.ComposeUI", intent, null);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11288, 8);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingQQMailFooterHandler$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

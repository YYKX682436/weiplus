package com.tencent.mm.ui.chatting.component;

/* loaded from: classes8.dex */
public class g5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.b5 f199079d;

    public g5(com.tencent.mm.ui.chatting.component.b5 b5Var) {
        this.f199079d = b5Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/ChattingMoreComponent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.component.b5 b5Var = this.f199079d;
        com.tencent.mm.ui.chatting.adapter.k kVar = (com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) b5Var.f198580d.f460708c.a(sb5.z.class));
        if (kVar.L0() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingMoreBtnBarHelper", "ignore click del btn, selected items count is 0");
            yj0.a.h(this, "com/tencent/mm/ui/chatting/component/ChattingMoreComponent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            android.app.Activity g17 = b5Var.f198580d.g();
            db5.e1.B(g17, g17.getString(com.tencent.mm.R.string.bav), "", g17.getString(com.tencent.mm.R.string.boo), g17.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.ui.chatting.component.f5(this, kVar, g17), null, com.tencent.mm.R.color.f478622ch);
            tb5.i0.f417055a.c(b5Var.p0(), "del", b5Var.f198580d.x(), b5Var.f198703q);
            yj0.a.h(this, "com/tencent/mm/ui/chatting/component/ChattingMoreComponent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}

package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class d5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.b5 f198924d;

    public d5(com.tencent.mm.ui.chatting.component.b5 b5Var) {
        this.f198924d = b5Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/ChattingMoreComponent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.component.b5 b5Var = this.f198924d;
        sb5.z zVar = (sb5.z) b5Var.f198580d.f460708c.a(sb5.z.class);
        com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = (com.tencent.mm.plugin.msg.MsgIdTalker) view.getTag();
        com.tencent.mm.ui.chatting.adapter.k kVar = (com.tencent.mm.ui.chatting.adapter.k) zVar;
        if (kVar.W0(msgIdTalker)) {
            int L0 = kVar.L0();
            ((com.tencent.mm.ui.chatting.component.jk) ((sb5.u1) b5Var.f198580d.f460708c.a(sb5.u1.class))).p0();
            b5Var.f198695f.b();
            b5Var.f198694e.setVisibility(0);
            b5Var.f198694e.c(L0);
        }
        b5Var.f198580d.f460710e.U(msgIdTalker.f149480d, msgIdTalker.a());
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/ChattingMoreComponent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

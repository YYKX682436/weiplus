package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class eg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.msg.MsgIdTalker f198969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.rf f198970e;

    public eg(com.tencent.mm.ui.chatting.component.rf rfVar, com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker) {
        this.f198970e = rfVar;
        this.f198969d = msgIdTalker;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.component.rf rfVar = this.f198970e;
        rfVar.f199832h = 2;
        rfVar.f199839r = false;
        sb5.t0 t0Var = (sb5.t0) rfVar.f198580d.f460708c.a(sb5.t0.class);
        rfVar.f198580d.x();
        t0Var.getClass();
        com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = this.f198969d;
        com.tencent.mm.ui.chatting.component.rf.o0(rfVar, msgIdTalker);
        if (rfVar.f199841t.contains(msgIdTalker)) {
            rfVar.f199841t.remove(msgIdTalker);
            rfVar.s0(true, false);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

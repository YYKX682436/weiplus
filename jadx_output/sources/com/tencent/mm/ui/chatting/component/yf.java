package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class yf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.rf f200314d;

    public yf(com.tencent.mm.ui.chatting.component.rf rfVar) {
        this.f200314d = rfVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.component.rf rfVar = this.f200314d;
        rfVar.f199832h = 2;
        rfVar.f199840s = false;
        sc5.a.f406561a.a(rfVar.f198580d.x(), rfVar.D, rfVar.f199847z.f252842b);
        rfVar.f199847z.e(rfVar.D.l());
        if (rfVar.D.k() == 0) {
            rfVar.f199845x = -1;
            com.tencent.mm.ui.chatting.component.rf.n0(rfVar, rfVar.A);
        } else {
            com.tencent.mm.ui.chatting.component.rf.o0(rfVar, new com.tencent.mm.plugin.msg.MsgIdTalker(rfVar.D.l(), rfVar.f198580d.x()));
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

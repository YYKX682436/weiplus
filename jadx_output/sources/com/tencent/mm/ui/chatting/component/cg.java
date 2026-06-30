package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class cg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g15.a f198889d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.rf f198890e;

    public cg(com.tencent.mm.ui.chatting.component.rf rfVar, g15.a aVar) {
        this.f198890e = rfVar;
        this.f198889d = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.component.rf rfVar = this.f198890e;
        rfVar.f199832h = 2;
        rfVar.f199840s = false;
        sc5.a aVar = sc5.a.f406561a;
        java.lang.String x17 = rfVar.f198580d.x();
        com.tencent.mm.storage.f9 f9Var = rfVar.f199847z.f252842b;
        g15.a aVar2 = this.f198889d;
        aVar.a(x17, aVar2, f9Var);
        rfVar.f199847z.e(aVar2.l());
        com.tencent.mm.ui.chatting.component.rf.o0(rfVar, new com.tencent.mm.plugin.msg.MsgIdTalker(aVar2.l(), rfVar.f198580d.x()));
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

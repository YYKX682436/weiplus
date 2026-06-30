package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class bg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g15.a f198735d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.rf f198736e;

    public bg(com.tencent.mm.ui.chatting.component.rf rfVar, g15.a aVar) {
        this.f198736e = rfVar;
        this.f198735d = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.component.rf rfVar = this.f198736e;
        rfVar.f199832h = 2;
        int i17 = rfVar.A;
        if (i17 >= 0) {
            rfVar.f199845x = -1;
            rfVar.f199840s = false;
            com.tencent.mm.ui.chatting.component.rf.n0(rfVar, i17);
            sc5.a aVar = sc5.a.f406561a;
            java.lang.String x17 = rfVar.f198580d.x();
            com.tencent.mm.storage.f9 f9Var = rfVar.f199847z.f252842b;
            g15.a aVar2 = this.f198735d;
            aVar.a(x17, aVar2, f9Var);
            rfVar.f199847z.e(aVar2.l());
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.HistoryMsgTongueComponent", "error unreadTopPos: %s", java.lang.Integer.valueOf(i17));
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class dg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f198937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.rf f198938e;

    public dg(com.tencent.mm.ui.chatting.component.rf rfVar, int i17) {
        this.f198938e = rfVar;
        this.f198937d = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.component.rf rfVar = this.f198938e;
        rfVar.f199832h = 2;
        rfVar.f199839r = false;
        sb5.t0 t0Var = (sb5.t0) rfVar.f198580d.f460708c.a(sb5.t0.class);
        rfVar.f198580d.x();
        t0Var.getClass();
        com.tencent.mm.ui.chatting.component.rf.n0(rfVar, this.f198937d);
        rfVar.B0();
        rfVar.x0();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

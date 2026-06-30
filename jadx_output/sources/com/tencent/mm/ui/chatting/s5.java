package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class s5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ot0.s0 f202661d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f202662e;

    public s5(ot0.s0 s0Var, java.lang.String str) {
        this.f202661d = s0Var;
        this.f202662e = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChattingItemHelper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) view.getTag();
        ot0.s0 s0Var = this.f202661d;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemHelper", "on app brand(%s) button1 click", s0Var.f348775r);
        com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
        java.lang.String str = s0Var.f348775r;
        am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
        nxVar.f7466a = str;
        nxVar.f7467b = s0Var.f348776s;
        nxVar.f7468c = s0Var.f348778u;
        nxVar.f7474i = s0Var.f348777t;
        nxVar.f7478m = true;
        nxVar.f7469d = 1076;
        nxVar.f7470e = this.f202662e + ":" + erVar.c().I0() + ":" + erVar.B;
        startAppBrandUIFromOuterEvent.e();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingItemHelper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

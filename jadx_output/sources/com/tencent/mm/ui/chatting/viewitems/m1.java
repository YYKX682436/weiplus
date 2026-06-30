package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class m1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.c3 f204543d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f204544e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk5.l7 f204545f;

    public m1(com.tencent.mm.ui.chatting.viewitems.c3 c3Var, com.tencent.mm.ui.widget.dialog.k0 k0Var, dk5.l7 l7Var) {
        this.f204543d = c3Var;
        this.f204544e = k0Var;
        this.f204545f = l7Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsg$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsg", "introduce View click confirm!");
        this.f204543d.f203687a = true;
        this.f204544e.u();
        dk5.l7 l7Var = this.f204545f;
        if (l7Var != null) {
            l7Var.a();
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsg$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

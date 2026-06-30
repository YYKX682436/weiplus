package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class un implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ho f200093d;

    public un(com.tencent.mm.ui.chatting.component.ho hoVar) {
        this.f200093d = hoVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/TranslateWhileWriteComponent$initControllerView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.component.ho hoVar = this.f200093d;
        androidx.recyclerview.widget.f2 adapter = ((com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) hoVar.f199184n).getValue()).getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        if (hoVar.f199192v > 0) {
            ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) hoVar.f198580d.f460708c.a(sb5.s0.class))).f199263e.A0();
            hoVar.f199193w.add(new com.tencent.mm.ui.chatting.component.co(hoVar));
        } else {
            ((com.tencent.mm.ui.widget.dialog.z2) ((jz5.n) hoVar.f199186p).getValue()).C();
        }
        java.lang.String x17 = hoVar.f198580d.x();
        com.tencent.mm.autogen.mmdata.rpt.TranslateMsgStruct translateMsgStruct = new com.tencent.mm.autogen.mmdata.rpt.TranslateMsgStruct();
        if (pn4.f1.f357105a.length() == 0) {
            str = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.o.f(str, "toString(...)");
            pn4.f1.f357105a = str;
        } else {
            str = pn4.f1.f357105a;
        }
        translateMsgStruct.r(str);
        translateMsgStruct.f61351f = 2;
        translateMsgStruct.p("4");
        translateMsgStruct.q(x17);
        translateMsgStruct.k();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/TranslateWhileWriteComponent$initControllerView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

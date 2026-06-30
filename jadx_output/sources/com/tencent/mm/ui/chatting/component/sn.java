package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class sn implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ho f199954d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.mg f199955e;

    public sn(com.tencent.mm.ui.chatting.component.ho hoVar, com.tencent.mm.ui.chatting.component.mg mgVar) {
        this.f199954d = hoVar;
        this.f199955e = mgVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/TranslateWhileWriteComponent$createChooseLanRecyclerView$1$1$getItemConvert$1$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = this.f199955e.f199506d;
        java.util.Map map = com.tencent.mm.ui.chatting.component.ho.E;
        com.tencent.mm.ui.chatting.component.ho hoVar = this.f199954d;
        hoVar.v0(i17);
        java.lang.String x17 = hoVar.f198580d.x();
        java.lang.String m07 = hoVar.m0();
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
        translateMsgStruct.p(m07);
        translateMsgStruct.q(x17);
        translateMsgStruct.k();
        ((com.tencent.mm.ui.widget.dialog.z2) ((jz5.n) hoVar.f199186p).getValue()).B();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/TranslateWhileWriteComponent$createChooseLanRecyclerView$1$1$getItemConvert$1$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class rn implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ho f199864d;

    public rn(com.tencent.mm.ui.chatting.component.ho hoVar) {
        this.f199864d = hoVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/TranslateWhileWriteComponent$createChooseLanHalfDialog$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.component.ho hoVar = this.f199864d;
        ((com.tencent.mm.ui.widget.dialog.z2) ((jz5.n) hoVar.f199186p).getValue()).B();
        hoVar.v0(-1);
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
        translateMsgStruct.p("100");
        translateMsgStruct.q(x17);
        translateMsgStruct.k();
        hoVar.w0(true);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/TranslateWhileWriteComponent$createChooseLanHalfDialog$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

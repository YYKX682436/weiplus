package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class on extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ho f199653d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on(com.tencent.mm.ui.chatting.component.ho hoVar) {
        super(0);
        this.f199653d = hoVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.chatting.component.ho hoVar = this.f199653d;
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(hoVar.f198580d.g(), 0, 2, true);
        z2Var.q(hoVar.f198580d.g().getString(com.tencent.mm.R.string.b6i));
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(hoVar.f198580d.g());
        linearLayout.setOrientation(1);
        linearLayout.addView((com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) hoVar.f199184n).getValue());
        jz5.g gVar = hoVar.f199185o;
        java.lang.Object value = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        linearLayout.addView((android.view.View) value);
        z2Var.k(linearLayout, 0, 0);
        java.lang.Object value2 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        ((android.view.View) value2).setOnClickListener(new com.tencent.mm.ui.chatting.component.rn(hoVar));
        z2Var.f212063o = true;
        return z2Var;
    }
}

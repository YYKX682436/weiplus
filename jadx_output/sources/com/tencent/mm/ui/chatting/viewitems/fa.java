package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class fa implements al5.v1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.q9 f203950a;

    public fa(com.tencent.mm.ui.chatting.viewitems.ga gaVar, com.tencent.mm.ui.chatting.viewitems.q9 q9Var) {
        this.f203950a = q9Var;
    }

    @Override // al5.v1
    public void a(java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType) {
        com.tencent.mm.ui.chatting.viewitems.q9 q9Var = this.f203950a;
        if (((java.lang.Boolean) q9Var.f205329b.getTag(com.tencent.mm.R.id.bom)).booleanValue()) {
            ge5.d.a().getClass();
            ge5.a.TEXT_CALLBACK.a(charSequence, bufferType, ((java.lang.Long) q9Var.f205329b.getTag(com.tencent.mm.R.id.bon)).longValue(), (java.lang.String) q9Var.f205329b.getTag(com.tencent.mm.R.id.rfh));
        }
    }
}

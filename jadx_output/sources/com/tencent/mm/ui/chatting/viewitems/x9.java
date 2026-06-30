package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class x9 implements al5.v1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.q9 f205976a;

    public x9(com.tencent.mm.ui.chatting.viewitems.y9 y9Var, com.tencent.mm.ui.chatting.viewitems.q9 q9Var) {
        this.f205976a = q9Var;
    }

    @Override // al5.v1
    public void a(java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType) {
        com.tencent.mm.ui.chatting.viewitems.q9 q9Var = this.f205976a;
        if (((java.lang.Boolean) q9Var.f205329b.getTag(com.tencent.mm.R.id.bom)).booleanValue()) {
            ge5.d.a().getClass();
            ge5.a.TEXT_CALLBACK.a(charSequence, bufferType, ((java.lang.Long) q9Var.f205329b.getTag(com.tencent.mm.R.id.bon)).longValue(), (java.lang.String) q9Var.f205329b.getTag(com.tencent.mm.R.id.rfh));
        }
    }
}

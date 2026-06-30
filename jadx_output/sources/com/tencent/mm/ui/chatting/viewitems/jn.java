package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class jn implements al5.v1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ao f204278a;

    public jn(com.tencent.mm.ui.chatting.viewitems.gn gnVar, com.tencent.mm.ui.chatting.viewitems.ao aoVar) {
        this.f204278a = aoVar;
    }

    @Override // al5.v1
    public void a(java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType) {
        com.tencent.mm.ui.chatting.viewitems.ao aoVar = this.f204278a;
        if (((java.lang.Boolean) aoVar.f203379b.getTag(com.tencent.mm.R.id.bom)).booleanValue()) {
            ge5.d.a().getClass();
            ge5.a.TEXT_CALLBACK.a(charSequence, bufferType, ((java.lang.Long) aoVar.f203379b.getTag(com.tencent.mm.R.id.bon)).longValue(), (java.lang.String) aoVar.f203379b.getTag(com.tencent.mm.R.id.rfh));
        }
    }
}

package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class vb implements al5.v1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ya f205845a;

    public vb(com.tencent.mm.ui.chatting.viewitems.lb lbVar, com.tencent.mm.ui.chatting.viewitems.ya yaVar) {
        this.f205845a = yaVar;
    }

    @Override // al5.v1
    public void a(java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType) {
        com.tencent.mm.ui.chatting.viewitems.ya yaVar = this.f205845a;
        if (((java.lang.Boolean) yaVar.f206051b.getTag(com.tencent.mm.R.id.bom)).booleanValue()) {
            ge5.d.a().getClass();
            ge5.a.TEXT_CALLBACK.a(charSequence, bufferType, ((java.lang.Long) yaVar.f206051b.getTag(com.tencent.mm.R.id.bon)).longValue(), (java.lang.String) yaVar.f206051b.getTag(com.tencent.mm.R.id.rfh));
        }
    }
}

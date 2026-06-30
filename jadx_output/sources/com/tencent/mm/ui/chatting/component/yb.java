package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class yb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.zb f200309d;

    public yb(com.tencent.mm.ui.chatting.component.zb zbVar) {
        this.f200309d = zbVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.component.zb zbVar = this.f200309d;
        zbVar.f200366c.t0(zbVar.f200364a, zbVar.f200365b, new java.util.ArrayList());
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.chatting.component.xb(this));
    }

    public java.lang.String toString() {
        return super.toString() + "|getContactCallBack";
    }
}

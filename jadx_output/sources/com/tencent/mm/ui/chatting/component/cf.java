package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class cf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.df f198888d;

    public cf(com.tencent.mm.ui.chatting.component.df dfVar) {
        this.f198888d = dfVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean d17 = c01.d9.b().m().d(e01.c.Chatting);
        com.tencent.mm.ui.chatting.component.df dfVar = this.f198888d;
        if (d17) {
            dfVar.f198936a.o0();
        } else {
            dfVar.f198936a.w0();
        }
    }
}

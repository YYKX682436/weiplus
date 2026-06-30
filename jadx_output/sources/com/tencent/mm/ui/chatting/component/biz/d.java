package com.tencent.mm.ui.chatting.component.biz;

/* loaded from: classes9.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.biz.a f198773d;

    public d(com.tencent.mm.ui.chatting.component.biz.a aVar) {
        this.f198773d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.component.biz.a aVar = this.f198773d;
        yb5.d dVar = aVar.f198580d;
        if (dVar == null) {
            return;
        }
        boolean z17 = ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar.f460708c.a(sb5.z.class))).T;
        if (!aVar.f198753r || z17) {
            return;
        }
        s01.r.j(aVar.f198744f);
    }
}

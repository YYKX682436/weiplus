package com.tencent.mm.ui.chatting.component.biz;

/* loaded from: classes8.dex */
public class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.biz.a f198788d;

    public i0(com.tencent.mm.ui.chatting.component.biz.a aVar) {
        this.f198788d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.component.biz.a aVar = this.f198788d;
        if (aVar.f198580d.u().r2() || !aVar.f198580d.u().k2() || com.tencent.mm.storage.z3.r4(aVar.f198580d.u().d1())) {
            return;
        }
        aVar.f198580d.f460717l.setMMSubTitle(com.tencent.mm.R.string.b17);
    }
}

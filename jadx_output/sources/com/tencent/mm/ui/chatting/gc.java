package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public final class gc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.hc f201620d;

    public gc(com.tencent.mm.ui.chatting.hc hcVar) {
        this.f201620d = hcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.chatting.hc hcVar = this.f201620d;
        if (hcVar.f201672d) {
            hcVar.b();
        }
    }
}

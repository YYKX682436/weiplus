package com.tencent.mm.ui.chatting.adapter;

/* loaded from: classes5.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.adapter.k f198399d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f198400e;

    public e(com.tencent.mm.ui.chatting.adapter.k kVar, com.tencent.mm.storage.f9 f9Var) {
        this.f198399d = kVar;
        this.f198400e = f9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yb5.d dVar = this.f198399d.K;
        if (dVar == null) {
            return;
        }
        ((com.tencent.mm.ui.chatting.component.ck) ((sb5.s1) dVar.f460708c.a(sb5.s1.class))).m0(this.f198400e, "", false, false);
    }
}

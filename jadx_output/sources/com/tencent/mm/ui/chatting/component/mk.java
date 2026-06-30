package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class mk implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f199514d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.lk f199515e;

    public mk(com.tencent.mm.ui.chatting.component.lk lkVar, android.content.Intent intent) {
        this.f199515e = lkVar;
        this.f199514d = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        int intExtra = this.f199514d.getIntExtra("key_quote_msg_target", 0);
        if (intExtra == 1 || intExtra == 2) {
            ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) this.f199515e.f198580d.f460708c.a(sb5.s0.class))).f199263e.v1(false, true);
        }
    }
}

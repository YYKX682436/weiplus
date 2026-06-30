package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class yo implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ro f200349d;

    public yo(com.tencent.mm.ui.chatting.component.ro roVar) {
        this.f200349d = roVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.component.ro roVar = this.f200349d;
        if (roVar.f199874q.get()) {
            return;
        }
        roVar.x0();
        roVar.f199876s = false;
    }
}

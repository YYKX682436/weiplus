package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class ao implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ho f198660d;

    public ao(com.tencent.mm.ui.chatting.component.ho hoVar) {
        this.f198660d = hoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.chatting.component.ho hoVar = this.f198660d;
        hoVar.f199194x = false;
        ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) hoVar.f198580d.f460708c.a(sb5.s0.class))).f199263e.setIgnoreScroll(java.lang.Boolean.FALSE);
    }
}

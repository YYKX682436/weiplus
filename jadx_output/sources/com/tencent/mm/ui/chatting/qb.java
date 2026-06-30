package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public final class qb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.tb f202623d;

    public qb(com.tencent.mm.ui.chatting.tb tbVar) {
        this.f202623d = tbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.chatting.tb tbVar = this.f202623d;
        if (tbVar.getActivity().isFinishing() || tbVar.getActivity().isDestroyed()) {
            return;
        }
        tbVar.T6();
    }
}

package com.tencent.mm.ui.conversation;

/* loaded from: classes9.dex */
public class eb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.fb f207656d;

    public eb(com.tencent.mm.ui.conversation.fb fbVar) {
        this.f207656d = fbVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.conversation.fb fbVar = this.f207656d;
        fbVar.f207685f.f207709d.f207424e.remove(fbVar.f207683d);
        fbVar.f207685f.f207709d.f207425f.notifyDataSetChanged();
    }
}

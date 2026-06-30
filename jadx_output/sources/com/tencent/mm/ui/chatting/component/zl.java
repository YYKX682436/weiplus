package com.tencent.mm.ui.chatting.component;

/* loaded from: classes14.dex */
public final class zl implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.fm f200391d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f200392e;

    public zl(com.tencent.mm.ui.chatting.component.fm fmVar, yb5.d dVar) {
        this.f200391d = fmVar;
        this.f200392e = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.tools.b1.a();
        this.f200391d.f199059e = 0L;
        this.f200392e.J();
    }
}

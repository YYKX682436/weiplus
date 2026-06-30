package com.tencent.mm.ui.chatting.component;

/* loaded from: classes13.dex */
public class wc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn.c f200167d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f200168e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.bd f200169f;

    public wc(com.tencent.mm.ui.chatting.component.bd bdVar, rn.c cVar, int i17) {
        this.f200169f = bdVar;
        this.f200167d = cVar;
        this.f200168e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f200169f.f198732a.f199772q.add(new com.tencent.mm.ui.chatting.component.md(this.f200167d, 1, 0, this.f200168e + 1));
    }
}

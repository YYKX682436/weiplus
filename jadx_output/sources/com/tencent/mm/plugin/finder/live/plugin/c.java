package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.g f112088d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f112089e;

    public c(com.tencent.mm.plugin.finder.live.plugin.g gVar, int i17) {
        this.f112088d = gVar;
        this.f112089e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f112088d.z1(this.f112089e);
    }
}

package com.tencent.mm.plugin.gif;

/* loaded from: classes15.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gif.u f142187d;

    public s(com.tencent.mm.plugin.gif.u uVar) {
        this.f142187d = uVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.gif.u uVar = this.f142187d;
        uVar.f142208y = -1;
        synchronized (uVar.f142193g) {
            ((com.tencent.mm.feature.emoji.api.IWXGFJNIService) i95.n0.c(com.tencent.mm.feature.emoji.api.IWXGFJNIService.class)).nativeRewindBuffer(this.f142187d.f142192f);
        }
        com.tencent.mm.plugin.gif.u uVar2 = this.f142187d;
        uVar2.f(uVar2.L, 0L);
    }
}

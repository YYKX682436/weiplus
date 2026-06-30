package com.tencent.mm.plugin.gif;

/* loaded from: classes15.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gif.k f142132d;

    public g(com.tencent.mm.plugin.gif.k kVar) {
        this.f142132d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f142132d.f142139f != 0) {
            ((com.tencent.mm.feature.emoji.api.IGIFJNIService) i95.n0.c(com.tencent.mm.feature.emoji.api.IGIFJNIService.class)).restoreRemainder(this.f142132d.f142139f);
            com.tencent.mm.plugin.gif.k kVar = this.f142132d;
            kVar.g(kVar.L, kVar.f142154x);
        }
    }
}

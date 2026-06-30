package com.tencent.mm.plugin.gif;

/* loaded from: classes15.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gif.k f142133d;

    public h(com.tencent.mm.plugin.gif.k kVar) {
        this.f142133d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f142133d.f142139f != 0) {
            ((com.tencent.mm.feature.emoji.api.IGIFJNIService) i95.n0.c(com.tencent.mm.feature.emoji.api.IGIFJNIService.class)).reset(this.f142133d.f142139f);
            com.tencent.mm.plugin.gif.k kVar = this.f142133d;
            kVar.f142150t = -1;
            kVar.g(kVar.L, 0L);
        }
    }
}

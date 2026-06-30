package com.tencent.mm.plugin.gif;

/* loaded from: classes15.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gif.k f142134d;

    public i(com.tencent.mm.plugin.gif.k kVar) {
        this.f142134d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f142134d.f142139f != 0) {
            ((com.tencent.mm.feature.emoji.api.IGIFJNIService) i95.n0.c(com.tencent.mm.feature.emoji.api.IGIFJNIService.class)).saveRemainder(this.f142134d.f142139f);
        }
    }
}

package com.tencent.mm.plugin.sight.decode.model;

/* loaded from: classes10.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f162421d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sight.decode.model.s f162422e;

    public d(com.tencent.mm.plugin.sight.decode.model.s sVar, int i17) {
        this.f162422e = sVar;
        this.f162421d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.System.currentTimeMillis();
        ((com.tencent.mm.feature.sight.api.ISightJNIService) i95.n0.c(com.tencent.mm.feature.sight.api.ISightJNIService.class)).freeObj(this.f162421d);
        this.f162422e.hashCode();
        java.lang.System.currentTimeMillis();
    }
}

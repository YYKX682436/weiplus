package com.tencent.mm.plugin.lite;

/* loaded from: classes8.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f144142d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.w f144143e;

    public n0(com.tencent.mm.plugin.lite.w wVar, java.lang.String str) {
        this.f144143e = wVar;
        this.f144142d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.lite.w wVar = this.f144143e;
        com.tencent.mm.plugin.handoff.model.HandOff handOff = wVar.f144530j;
        if (handOff == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMWxaLiteAppCenter", "onClearCurrentHandOff but mCurrentHandOff == null");
            return;
        }
        java.lang.String key = handOff.getKey();
        java.lang.String str = this.f144142d;
        if (!key.equals(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMWxaLiteAppCenter", "onClearCurrentHandOff but mCurrentHandOff key:%s != id:%s", wVar.f144530j.getKey(), str);
            ((d73.i) i95.n0.c(d73.i.class)).A8(str);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMWxaLiteAppCenter", "onClearCurrentHandOff mCurrentHandOff:%s", wVar.f144530j.toString());
            ((d73.i) i95.n0.c(d73.i.class)).A8(wVar.f144530j.getKey());
            wVar.f144530j = null;
        }
    }
}

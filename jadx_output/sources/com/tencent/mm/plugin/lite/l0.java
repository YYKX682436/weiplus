package com.tencent.mm.plugin.lite;

/* loaded from: classes15.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143872d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.w f143873e;

    public l0(com.tencent.mm.plugin.lite.w wVar, java.lang.String str) {
        this.f143873e = wVar;
        this.f143872d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.lite.w wVar = this.f143873e;
        com.tencent.mm.plugin.lite.LiteAppCenter.LiteAppHandOffInfo i17 = wVar.i(this.f143872d);
        com.tencent.mm.plugin.handoff.model.HandOff Bi = ((a70.e) ((b70.e) i95.n0.c(b70.e.class))).Bi(i17.type, i17.icon, i17.title, i17.appId, i17.page, i17.query, i17.url, i17.extraData, i17.f143404id);
        com.tencent.mm.plugin.handoff.model.HandOff handOff = wVar.f144530j;
        if (handOff != null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMWxaLiteAppCenter", "onSetCurrentHandOff but mCurrentHandOff != null! currentHandOff key:%s newHandOff key:%s", handOff.getKey(), Bi.getKey());
        }
        wVar.f144530j = Bi;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWxaLiteAppCenter", "onSetCurrentHandOff mCurrentHandOff:%s", Bi.toString());
        ((d73.i) i95.n0.c(d73.i.class)).Jc(wVar.f144530j);
    }
}

package com.tencent.mm.plugin.lite;

/* loaded from: classes15.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f144097d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.w f144098e;

    public m0(com.tencent.mm.plugin.lite.w wVar, java.lang.String str) {
        this.f144098e = wVar;
        this.f144097d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.lite.w wVar = this.f144098e;
        com.tencent.mm.plugin.lite.LiteAppCenter.LiteAppHandOffInfo i17 = wVar.i(this.f144097d);
        com.tencent.mm.plugin.handoff.model.HandOff Bi = ((a70.e) ((b70.e) i95.n0.c(b70.e.class))).Bi(i17.type, i17.icon, i17.title, i17.appId, i17.page, i17.query, i17.url, i17.extraData, i17.f143404id);
        if (wVar.f144530j == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMWxaLiteAppCenter", "onUpdateCurrentHandOff but mCurrentHandOff == null!");
        } else if (!Bi.getKey().equals(wVar.f144530j.getKey())) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMWxaLiteAppCenter", "onUpdateCurrentHandOff but mCurrentHandOff key:%s != newHandOff key:%s", wVar.f144530j.getKey(), Bi.getKey());
            Bi.setKey(wVar.f144530j.getKey());
        }
        wVar.f144530j = Bi;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWxaLiteAppCenter", "onUpdateCurrentHandOff mCurrentHandOff:%s", Bi.toString());
        ((d73.i) i95.n0.c(d73.i.class)).Jc(wVar.f144530j);
    }
}

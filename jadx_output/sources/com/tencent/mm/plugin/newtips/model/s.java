package com.tencent.mm.plugin.newtips.model;

/* loaded from: classes12.dex */
public class s implements java.lang.Runnable {
    public s(com.tencent.mm.plugin.newtips.model.t tVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NewTipsXMLConsumer", "consumeNewXml() batch delete expire data!!");
        vn3.b Bi = rn3.i.Bi();
        long a17 = c01.id.a() / 1000;
        l75.k0 k0Var = Bi.f438430d;
        try {
            k0Var.delete("NewTipsInfo2", "disappearTime!=0 and disappearTime<?", new java.lang.String[]{a17 + ""});
            k0Var.delete("NewTipsInfo2", "disappearTime=0 and exposureTime!=0 and exposureDisappearTime<?", new java.lang.String[]{a17 + ""});
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NewTips.NewTipsInfoStorage", "deleteExpireData NewTipsInfo by dissappearTime [%s]", e17.toString());
        }
    }
}

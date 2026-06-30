package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class x3 implements com.tencent.mm.plugin.multitalk.ilinkservice.b {
    public x3(com.tencent.mm.plugin.multitalk.ilinkservice.y3 y3Var) {
    }

    @Override // com.tencent.mm.plugin.multitalk.ilinkservice.b
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "steve: talk success! tryTriggerJoinSucc %d, %d, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 == 0 && i18 == 0) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.Multitalk.ILinkService", "steve: talk failed errtype %d errcode %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }
}

package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes8.dex */
public class j0 extends com.tencent.mm.network.r0 {
    @Override // com.tencent.mm.network.s0
    public void onNetworkChange(int i17) {
        java.lang.String formatedNetType = com.tencent.mars.comm.NetStatusUtil.getFormatedNetType(com.tencent.mm.sdk.platformtools.x2.f193071a);
        java.lang.String a17 = bm5.f1.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkNetworkMgr", "hy: %s on network changed: %d, changed to %s, %s", a17, java.lang.Integer.valueOf(i17), formatedNetType, com.tencent.mm.plugin.multitalk.ilinkservice.k0.f149670d);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("from_process", a17);
        bundle.putInt("newState", i17);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.plugin.multitalk.ilinkservice.k0.f149670d, bundle, com.tencent.mm.plugin.multitalk.ilinkservice.k0.a.class, new com.tencent.mm.plugin.multitalk.ilinkservice.i0(this, a17));
    }
}

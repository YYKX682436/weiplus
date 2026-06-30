package com.tencent.mm.plugin.ilink.net_change;

/* loaded from: classes8.dex */
public final class e extends com.tencent.mm.network.r0 {
    @Override // com.tencent.mm.network.s0
    public void onNetworkChange(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetworkChangeSubProcessImpl", "onNetworkChange() called with: st = " + i17);
        for (java.lang.String str : com.tencent.mm.plugin.ilink.net_change.f.f142430d) {
            kotlin.jvm.internal.o.d(str);
            java.lang.String formatedNetType = com.tencent.mars.comm.NetStatusUtil.getFormatedNetType(com.tencent.mm.sdk.platformtools.x2.f193071a);
            java.lang.String a17 = bm5.f1.a();
            com.tencent.mars.xlog.Log.i("MicroMsg.NetworkChangeSubProcessImpl", "hy: %s on network changed: %d, changed to %s, %s", a17, java.lang.Integer.valueOf(i17), formatedNetType, str);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("from_process", a17);
            bundle.putInt("newState", i17);
            com.tencent.mm.ipcinvoker.d0.d(str, bundle, com.tencent.mm.plugin.ilink.net_change.f.a.class, new com.tencent.mm.plugin.ilink.net_change.d(a17));
        }
    }
}

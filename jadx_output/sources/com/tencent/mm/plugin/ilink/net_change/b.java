package com.tencent.mm.plugin.ilink.net_change;

/* loaded from: classes8.dex */
public final class b extends com.tencent.mm.network.r0 {
    @Override // com.tencent.mm.network.s0
    public void onNetworkChange(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetworkChangeMainProcessImpl", "iLink onNetworkChange:" + i17);
        com.tencent.ilink.IlinkContext.getInstance().networkChanged();
    }
}

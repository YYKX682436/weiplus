package com.tencent.mm.plugin.normsg;

/* loaded from: classes13.dex */
public class i implements com.tencent.mm.ipcinvoker.s {
    public i(com.tencent.mm.plugin.normsg.u uVar) {
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public /* bridge */ /* synthetic */ void a(java.lang.Object obj) {
    }

    @Override // com.tencent.mm.ipcinvoker.s
    public void c(java.lang.Exception exc) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NormsgSourceImpl", "wkat rpc failed %s", exc.toString());
    }

    @Override // com.tencent.mm.ipcinvoker.s
    public void d() {
    }
}

package com.tencent.mm.plugin.performance.diagnostic;

/* loaded from: classes12.dex */
public class m implements ni.h {
    public m(com.tencent.mm.plugin.performance.diagnostic.n nVar) {
    }

    @Override // ni.h
    public void a(oi.e eVar) {
        com.tencent.mars.xlog.Log.e("onLeak", eVar + "");
    }
}

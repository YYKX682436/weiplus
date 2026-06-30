package com.tencent.mm.plugin.fts;

/* loaded from: classes12.dex */
public class e0 implements c01.jd {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.d0 f137403a;

    public e0(com.tencent.mm.plugin.fts.d0 d0Var) {
        this.f137403a = d0Var;
    }

    @Override // c01.jd
    public boolean a() {
        com.tencent.mars.xlog.Log.w("MicroMsg.FTS.PluginFTS", "HERE UninitForUEH is called! stg:%s ", this.f137403a.f137381f);
        com.tencent.mm.plugin.fts.d0.E = true;
        this.f137403a.Ri();
        return true;
    }
}

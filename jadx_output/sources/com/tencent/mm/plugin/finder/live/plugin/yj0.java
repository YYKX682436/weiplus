package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class yj0 implements hn0.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.dk0 f115205a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f115206b;

    public yj0(com.tencent.mm.plugin.finder.live.plugin.dk0 dk0Var, yz5.l lVar) {
        this.f115205a = dk0Var;
        this.f115206b = lVar;
    }

    @Override // hn0.i
    public void callback(int i17, android.os.Bundle bundle) {
        yz5.l lVar = this.f115206b;
        com.tencent.mm.plugin.finder.live.plugin.dk0 dk0Var = this.f115205a;
        if (i17 >= 0) {
            dk0Var.getClass();
            lVar.invoke(java.lang.Boolean.TRUE);
        } else {
            dk0Var.getClass();
            lVar.invoke(java.lang.Boolean.FALSE);
        }
    }
}

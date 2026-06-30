package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes8.dex */
public class h0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f149596d;

    public h0(com.tencent.mm.plugin.multitalk.ilinkservice.l0 l0Var, java.lang.String str) {
        this.f149596d = str;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkNetworkMgr", "hy: %s invokeAsync result: %s", this.f149596d, ((android.os.Bundle) obj).toString());
    }
}

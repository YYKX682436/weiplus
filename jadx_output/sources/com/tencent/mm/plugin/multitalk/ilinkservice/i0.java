package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes8.dex */
public class i0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f149604d;

    public i0(com.tencent.mm.plugin.multitalk.ilinkservice.j0 j0Var, java.lang.String str) {
        this.f149604d = str;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkNetworkMgr", "hy: %s invokeAsync result: %s", this.f149604d, ((android.os.Bundle) obj).toString());
    }
}

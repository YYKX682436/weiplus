package com.tencent.mm.plugin.ilink.net_change;

/* loaded from: classes8.dex */
public final class g implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f142432d;

    public g(java.lang.String str) {
        this.f142432d = str;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetworkChangeSubProcessImpl", "hy: %s invokeAsync result: %s", this.f142432d, java.lang.String.valueOf((android.os.Bundle) obj));
    }
}

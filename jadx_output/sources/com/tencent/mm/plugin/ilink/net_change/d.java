package com.tencent.mm.plugin.ilink.net_change;

/* loaded from: classes8.dex */
public final class d implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f142429d;

    public d(java.lang.String str) {
        this.f142429d = str;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetworkChangeSubProcessImpl", "hy: %s invokeAsync result: %s", this.f142429d, java.lang.String.valueOf((android.os.Bundle) obj));
    }
}

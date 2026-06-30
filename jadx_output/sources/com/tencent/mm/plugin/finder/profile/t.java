package com.tencent.mm.plugin.finder.profile;

/* loaded from: classes2.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f123407d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f123408e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.w f123409f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f123410g;

    public t(java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.finder.profile.w wVar, long j17) {
        this.f123407d = str;
        this.f123408e = str2;
        this.f123409f = wVar;
        this.f123410g = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        new db2.n2(this.f123407d, this.f123408e).l().K(new com.tencent.mm.plugin.finder.profile.s(this.f123409f, this.f123410g));
    }
}

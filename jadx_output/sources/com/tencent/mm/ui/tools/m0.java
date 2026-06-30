package com.tencent.mm.ui.tools;

/* loaded from: classes13.dex */
public final class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f210559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f210560e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.k0 f210561f;

    public m0(android.content.Context context, long j17, com.tencent.mm.ui.tools.k0 k0Var) {
        this.f210559d = context;
        this.f210560e = j17;
        this.f210561f = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String a17 = com.tencent.mm.ui.tools.r0.a(this.f210559d, com.tencent.mm.sdk.platformtools.v6.b(this.f210559d, this.f210560e, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI), null);
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.ui.tools.l0(this.f210561f, a17));
    }
}

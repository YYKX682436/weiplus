package com.tencent.mm.plugin.profile;

/* loaded from: classes11.dex */
public class y0 implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f154739a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.z0 f154740b;

    public y0(com.tencent.mm.plugin.profile.z0 z0Var, java.lang.String str) {
        this.f154740b = z0Var;
        this.f154739a = str;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.profile.z0 z0Var = this.f154740b;
        com.tencent.mars.xlog.Log.i("MicroMsg.NewContactWidgetNormal", "username:%s mRoomId:%s succ:%s", str, z0Var.f154746e.f153380d.f153432s, java.lang.Boolean.valueOf(z17));
        if (z17) {
            java.lang.String f27 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str, true).f2();
            com.tencent.mm.plugin.profile.e0 e0Var = z0Var.f154746e.f153380d;
            e0Var.r(e0Var.f153422f, e0Var.f153420d, this.f154739a, f27, e0Var.f153421e, e0Var.f153431r);
        }
    }
}

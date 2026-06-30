package com.tencent.mm.plugin.profile;

/* loaded from: classes11.dex */
public class x0 implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.r f154736a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.e0 f154737b;

    public x0(com.tencent.mm.plugin.profile.e0 e0Var, com.tencent.mm.ui.base.preference.r rVar) {
        this.f154737b = e0Var;
        this.f154736a = rVar;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NewContactWidgetNormal", "username:%s mRoomId:%s succ:%s", str, this.f154737b.f153432s, java.lang.Boolean.valueOf(z17));
        if (z17) {
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str, true);
            java.lang.String f27 = n17.f2();
            com.tencent.mm.plugin.profile.e0 e0Var = this.f154737b;
            e0Var.r(this.f154736a, e0Var.f153420d, e0Var.f153439z, f27, n17, e0Var.f153431r);
        }
    }
}

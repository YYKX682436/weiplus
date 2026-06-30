package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes10.dex */
public final class g0 implements zo0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f179377a;

    public g0(yz5.l lVar) {
        this.f179377a = lVar;
    }

    @Override // zo0.c
    public void a() {
        com.tencent.mars.xlog.Log.e("MicroMsg.RealnameVerifySelectGuardianUI", "failed to load icon, send without thumb");
        this.f179377a.invoke(null);
    }

    @Override // zo0.c
    public void b(hp0.i resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        jp0.f a17 = resp.a();
        this.f179377a.invoke(a17 != null ? a17.a() : null);
        a17.close();
    }
}

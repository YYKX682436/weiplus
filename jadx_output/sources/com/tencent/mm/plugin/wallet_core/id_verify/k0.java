package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes10.dex */
public final class k0 implements zo0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f179403a;

    public k0(yz5.l lVar) {
        this.f179403a = lVar;
    }

    @Override // zo0.c
    public void a() {
        com.tencent.mars.xlog.Log.e("MicroMsg.RealnameVerifySelectGuardianUI", "failed to load icon, send without thumb");
        this.f179403a.invoke(null);
    }

    @Override // zo0.c
    public void b(hp0.i resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        jp0.f a17 = resp.a();
        this.f179403a.invoke(a17 != null ? a17.a() : null);
        a17.close();
    }
}

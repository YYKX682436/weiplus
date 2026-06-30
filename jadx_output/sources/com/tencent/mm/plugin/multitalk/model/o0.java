package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public final class o0 implements android.graphics.SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.model.s0 f150057d;

    public o0(com.tencent.mm.plugin.multitalk.model.s0 s0Var) {
        this.f150057d = s0Var;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        java.lang.Object m521constructorimpl;
        com.tencent.mm.plugin.multitalk.model.r2 r2Var;
        com.tencent.mm.plugin.multitalk.model.a2 n17;
        java.lang.String r17;
        boolean z17;
        int width;
        int height;
        int i17;
        gj3.h hVar;
        fj3.k a17;
        com.tencent.mm.plugin.multitalk.model.s0 s0Var = this.f150057d;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        s0Var.f150117i = android.os.SystemClock.elapsedRealtime();
        if (this.f150057d.f150122q.getWidth() == 0 || this.f150057d.f150122q.getHeight() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MultiTalkCameraManager", "size is zero, drop frame");
        } else {
            com.tencent.mm.plugin.multitalk.model.s0 s0Var2 = this.f150057d;
            is0.c cVar = s0Var2.f150121p;
            if (cVar != null && (r2Var = s0Var2.f150118m) != null) {
                boolean z19 = true;
                if (!com.tencent.mm.plugin.multitalk.model.e3.Ri().y()) {
                    s0Var2.i(true);
                } else if (s0Var2.f150123r) {
                    if (!com.tencent.mm.plugin.multitalk.model.e3.Ri().B()) {
                        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.multitalk.model.l0());
                    }
                    if (z19 && (n17 = com.tencent.mm.plugin.multitalk.model.e3.Ri().n()) != null) {
                        r17 = c01.z1.r();
                        kotlin.jvm.internal.o.f(r17, "getUsernameFromUserInfo(...)");
                        z17 = r2Var.f150087a;
                        width = s0Var2.f150122q.getWidth();
                        height = s0Var2.f150122q.getHeight();
                        i17 = r2Var.f150105s;
                        hVar = n17.f149875a;
                        if (hVar != null && (a17 = hVar.a()) != null) {
                            a17.a(new hj3.p(cVar, z17, n17.f149877c, r17, new mj3.g(width, height, i17, z17, false, 16, null)));
                        }
                    }
                }
                z19 = false;
                if (z19) {
                    r17 = c01.z1.r();
                    kotlin.jvm.internal.o.f(r17, "getUsernameFromUserInfo(...)");
                    z17 = r2Var.f150087a;
                    width = s0Var2.f150122q.getWidth();
                    height = s0Var2.f150122q.getHeight();
                    i17 = r2Var.f150105s;
                    hVar = n17.f149875a;
                    if (hVar != null) {
                        a17.a(new hj3.p(cVar, z17, n17.f149877c, r17, new mj3.g(width, height, i17, z17, false, 16, null)));
                    }
                }
            }
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            surfaceTexture.updateTexImage();
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MultiTalkCameraManager", "updateTexImage error", m524exceptionOrNullimpl);
        }
    }
}

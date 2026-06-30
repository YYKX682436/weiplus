package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public final class a2 {

    /* renamed from: a, reason: collision with root package name */
    public gj3.h f149875a;

    /* renamed from: b, reason: collision with root package name */
    public cj3.n f149876b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f149877c;

    /* renamed from: d, reason: collision with root package name */
    public kotlinx.coroutines.y0 f149878d;

    /* renamed from: e, reason: collision with root package name */
    public jz5.l f149879e;
    private jj3.b mImageReaderWrapper;

    public final void a(com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView view, java.lang.String userName) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(userName, "userName");
        jj3.j jVar = e().f272397i;
        synchronized (jVar) {
            if (jVar.f300022g) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MTR.RenderTargetHolder", "already closed");
                return;
            }
            jj3.c cVar = (jj3.c) jVar.f300020e.get(userName);
            if (cVar != null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MTR.RenderTargetHolder", "arrayMap already has " + userName + " key");
                if (kotlin.jvm.internal.o.b(cVar.a(), view)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MTR.RenderTargetHolder", "already has same targetHolder register");
                    return;
                }
                jVar.a(cVar);
            }
            jj3.c cVar2 = new jj3.c(userName, new java.lang.ref.WeakReference(view), null, null, false, 28, null);
            view.setOnSurfaceTextureAvailable(new jj3.e(userName, cVar2));
            view.setOnSurfaceTextureDestroyedCallback(new jj3.f(userName, cVar2, jVar));
            view.setOnSurfaceTextureUpdate(new jj3.h(userName, jVar, view));
            jVar.f300020e.put(userName, cVar2);
        }
    }

    public final void b() {
        android.graphics.SurfaceTexture surfaceTexture;
        com.tencent.mars.xlog.Log.i("MicroMsg.MTR.MultiTalkRenderLogic", "close");
        this.mImageReaderWrapper = null;
        jz5.l lVar = this.f149879e;
        if (lVar != null && (surfaceTexture = (android.graphics.SurfaceTexture) lVar.f302834e) != null) {
            surfaceTexture.release();
        }
        this.f149879e = null;
        cj3.n nVar = this.f149876b;
        if (nVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MTR.MultiTalkEngineOp", "stopDecodeVideo");
            com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.R(null);
            nVar.f41899c = false;
        }
        this.f149876b = null;
        gj3.h hVar = this.f149875a;
        if (hVar != null) {
            hVar.close();
        }
        this.f149875a = null;
    }

    public final void c() {
        jj3.j jVar;
        gj3.h hVar = this.f149875a;
        if (hVar != null && (jVar = hVar.f272397i) != null) {
            android.util.ArrayMap arrayMap = jVar.f300020e;
            jj3.c cVar = (jj3.c) arrayMap.get("MTR_ENCODER_TARGET");
            if (cVar != null) {
                jVar.a(cVar);
            }
            jj3.d a17 = cVar != null ? cVar.a() : null;
            jj3.b bVar = a17 instanceof jj3.b ? (jj3.b) a17 : null;
            if (bVar != null) {
                bVar.close();
            }
            arrayMap.remove("MTR_ENCODER_TARGET");
        }
        this.mImageReaderWrapper = null;
        kotlinx.coroutines.y0 y0Var = this.f149878d;
        if (y0Var != null) {
            kotlinx.coroutines.z0.c(y0Var, null);
        }
        this.f149878d = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.tencent.mm.plugin.multitalk.model.u1
            if (r0 == 0) goto L13
            r0 = r7
            com.tencent.mm.plugin.multitalk.model.u1 r0 = (com.tencent.mm.plugin.multitalk.model.u1) r0
            int r1 = r0.f150153g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f150153g = r1
            goto L18
        L13:
            com.tencent.mm.plugin.multitalk.model.u1 r0 = new com.tencent.mm.plugin.multitalk.model.u1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f150151e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f150153g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f150150d
            com.tencent.mm.plugin.multitalk.model.a2 r0 = (com.tencent.mm.plugin.multitalk.model.a2) r0
            kotlin.ResultKt.throwOnFailure(r7)
            goto L61
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            kotlin.ResultKt.throwOnFailure(r7)
            gj3.h r7 = r6.e()
            jz5.l r2 = r6.f149879e
            if (r2 != 0) goto L66
            java.lang.String r2 = "MicroMsg.MTR.MultiTalkRenderLogic"
            java.lang.String r4 = "getCameraSurfaceTexture: create camera texture"
            com.tencent.mars.xlog.Log.i(r2, r4)
            ij3.l r2 = ij3.m.f291712e
            ij3.m r2 = ij3.m.f291713f
            ij3.f r4 = r7.f272394f
            oz5.l r2 = r4.plus(r2)
            com.tencent.mm.plugin.multitalk.model.v1 r4 = new com.tencent.mm.plugin.multitalk.model.v1
            r5 = 0
            r4.<init>(r7, r5)
            r0.f150150d = r6
            r0.f150153g = r3
            java.lang.Object r7 = kotlinx.coroutines.l.g(r2, r4, r0)
            if (r7 != r1) goto L60
            return r1
        L60:
            r0 = r6
        L61:
            r2 = r7
            jz5.l r2 = (jz5.l) r2
            r0.f149879e = r2
        L66:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.multitalk.model.a2.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final gj3.h e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MTR.MultiTalkRenderLogic", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        gj3.h hVar = this.f149875a;
        if (hVar != null && hVar.f272393e) {
            return hVar;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MTR.MultiTalkRenderLogic", "real init");
        gj3.h hVar2 = new gj3.h();
        this.f149875a = hVar2;
        return hVar2;
    }

    public final void f() {
        gj3.h e17 = e();
        if (this.f149876b == null) {
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.MTR.MultiTalkRenderLogic", java.lang.String.valueOf(com.tencent.mm.plugin.multitalk.model.e3.Ri().v()), new java.lang.Object[0]);
            this.f149876b = new cj3.n(new com.tencent.mm.plugin.multitalk.model.w1(e17), e17.f272396h);
        }
    }

    public final void g(int i17, int i18) {
        gj3.h e17 = e();
        jj3.b bVar = new jj3.b();
        if (bVar.f300002d != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MTR.ImageReaderWrapper", "already has an instance, release first");
            bVar.close();
        }
        android.media.ImageReader newInstance = android.media.ImageReader.newInstance(i18, i18, 1, 2);
        bVar.f300002d = newInstance;
        if (newInstance != null) {
            newInstance.setOnImageAvailableListener(new jj3.a(bVar), null);
        }
        jj3.j jVar = e17.f272397i;
        jVar.getClass();
        android.util.ArrayMap arrayMap = jVar.f300020e;
        if (arrayMap.get("MTR_ENCODER_TARGET") != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MTR.RenderTargetHolder", "arrayMap already has encoder target");
        }
        arrayMap.put("MTR_ENCODER_TARGET", new jj3.c("MTR_ENCODER_TARGET", new java.lang.ref.WeakReference(bVar), null, null, false, 28, null));
        this.mImageReaderWrapper = bVar;
        this.f149878d = kotlinx.coroutines.z0.a(((fj3.n) ((jz5.n) e17.f272400o).getValue()).plus(kotlinx.coroutines.t3.a(null, 1, null)));
        f();
    }

    public final void h(java.lang.String userName) {
        fj3.k a17;
        kotlin.jvm.internal.o.g(userName, "userName");
        com.tencent.mars.xlog.Log.i("MicroMsg.MTR.MultiTalkRenderLogic", "refreshWindow ".concat(userName));
        gj3.h hVar = this.f149875a;
        if (hVar == null || (a17 = hVar.a()) == null) {
            return;
        }
        a17.a(new hj3.n(userName, new mj3.g(-1, -1, -1, false, false, 24, null)));
    }

    public final void i(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MTR.MultiTalkRenderLogic", "setVirtualBackgroundState: curState " + this.f149877c + ", newState " + z17);
        this.f149877c = z17;
        rq4.u.f399109a.b(z17 ? 1 : 2, com.tencent.mm.plugin.multitalk.model.e3.wi().d());
    }

    public final void j(java.lang.String wxUserName) {
        kotlin.jvm.internal.o.g(wxUserName, "wxUserName");
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.MTR.MultiTalkRenderLogic", "startDecodeScreen", new java.lang.Object[0]);
        f();
        cj3.n nVar = this.f149876b;
        if (nVar != null) {
            int c17 = zj3.j.c(wxUserName);
            com.tencent.mm.plugin.multitalk.model.y1 y1Var = new com.tencent.mm.plugin.multitalk.model.y1(this);
            com.tencent.mars.xlog.Log.i("MicroMsg.MTR.MultiTalkEngineOp", "startDecodeScreen");
            if (com.tencent.mm.plugin.multitalk.model.e3.Ri().v()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MTR.MultiTalkEngineOp", "startDecodeScreen: ilink callbcak mode");
                com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.R(nVar.f41902f);
            } else if (nVar.f41900d) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MTR.MultiTalkEngineOp", "screen decode runner is working");
            } else {
                nVar.f41900d = true;
                y1Var.invoke(new cj3.l(new cj3.f(nVar, c17, y1Var)));
            }
        }
    }

    public final void k() {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.MTR.MultiTalkRenderLogic", "stopDecodeScreen", new java.lang.Object[0]);
        cj3.n nVar = this.f149876b;
        if (nVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MTR.MultiTalkEngineOp", "stopDecodeScreen");
            nVar.f41900d = false;
        }
    }

    public final void l(com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView view, java.lang.String userName) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(userName, "userName");
        jj3.j jVar = e().f272397i;
        synchronized (jVar) {
            jj3.c cVar = (jj3.c) jVar.f300020e.get(userName);
            jj3.c cVar2 = null;
            if (cVar != null) {
                if (!kotlin.jvm.internal.o.b(cVar.a(), view)) {
                    cVar = null;
                }
                if (cVar != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MTR.RenderTargetHolder", "unbindOutputView " + view + ", " + userName);
                    cVar.f300008e = false;
                    jVar.a(cVar);
                    cVar2 = (jj3.c) jVar.f300020e.remove(userName);
                }
            }
            if (cVar2 == null) {
                com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.MTR.RenderTargetHolder", "unbindOutputView not match current", new java.lang.Object[0]);
            }
        }
    }
}

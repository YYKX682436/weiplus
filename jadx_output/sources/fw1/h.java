package fw1;

/* loaded from: classes14.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public jw1.h f267080a;

    /* renamed from: b, reason: collision with root package name */
    public gw1.e f267081b;

    /* renamed from: c, reason: collision with root package name */
    public jz5.l f267082c;
    private mw1.a mImageReaderWrapper;

    public final void a(mw1.c view, java.lang.String userName) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(userName, "userName");
        com.tencent.mars.xlog.Log.i("MicroMsg.MTR.OpenVoiceRenderLogic", "weiranli: bind texture view name ".concat(userName));
        mw1.e eVar = c().f302307i;
        synchronized (eVar) {
            if (eVar.f331699g) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MTR.RenderTargetHolder", "already closed");
                return;
            }
            mw1.b bVar = (mw1.b) eVar.f331697e.get(userName);
            if (bVar != null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MTR.RenderTargetHolder", "arrayMap already has " + userName + " key");
                if (kotlin.jvm.internal.o.b(bVar.a(), view)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MTR.RenderTargetHolder", "already has same targetHolder register");
                    return;
                }
                eVar.b(bVar);
            }
            mw1.b bVar2 = new mw1.b(userName, new java.lang.ref.WeakReference(view), null, null, false, 28, null);
            bVar2.f331694e = true;
            eVar.f331697e.put(userName, bVar2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof fw1.e
            if (r0 == 0) goto L13
            r0 = r8
            fw1.e r0 = (fw1.e) r0
            int r1 = r0.f267075g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f267075g = r1
            goto L18
        L13:
            fw1.e r0 = new fw1.e
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f267073e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f267075g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r7 = r0.f267072d
            fw1.h r7 = (fw1.h) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L61
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            kotlin.ResultKt.throwOnFailure(r8)
            jw1.h r8 = r6.c()
            jz5.l r2 = r6.f267082c
            if (r2 != 0) goto L66
            java.lang.String r2 = "MicroMsg.MTR.OpenVoiceRenderLogic"
            java.lang.String r4 = "getCameraSurfaceTexture: create camera texture"
            com.tencent.mars.xlog.Log.i(r2, r4)
            lw1.l r2 = lw1.m.f321560e
            lw1.m r2 = lw1.m.f321561f
            lw1.f r4 = r8.f302304f
            oz5.l r2 = r4.plus(r2)
            fw1.f r4 = new fw1.f
            r5 = 0
            r4.<init>(r8, r7, r5)
            r0.f267072d = r6
            r0.f267075g = r3
            java.lang.Object r8 = kotlinx.coroutines.l.g(r2, r4, r0)
            if (r8 != r1) goto L60
            return r1
        L60:
            r7 = r6
        L61:
            r2 = r8
            jz5.l r2 = (jz5.l) r2
            r7.f267082c = r2
        L66:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: fw1.h.b(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final jw1.h c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MTR.OpenVoiceRenderLogic", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        jw1.h hVar = this.f267080a;
        if (hVar != null && hVar.f302303e) {
            return hVar;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MTR.OpenVoiceRenderLogic", "real init");
        jw1.h hVar2 = new jw1.h();
        this.f267080a = hVar2;
        return hVar2;
    }

    public final void d(int i17, java.lang.String callbackName) {
        kotlin.jvm.internal.o.g(callbackName, "callbackName");
        gw1.e eVar = this.f267081b;
        if (eVar != null) {
            java.util.HashMap hashMap = eVar.f276151c;
            java.util.HashMap hashMap2 = (java.util.HashMap) hashMap.get(java.lang.Integer.valueOf(i17));
            if (hashMap2 == null) {
                hashMap.remove(java.lang.Integer.valueOf(i17));
                return;
            }
            hashMap2.containsKey(callbackName);
            hashMap2.remove(callbackName);
            if (hashMap2.isEmpty()) {
                hashMap.remove(java.lang.Integer.valueOf(i17));
            }
        }
    }

    public final void e(int i17, java.lang.String callbackName, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.j callback) {
        kotlin.jvm.internal.o.g(callbackName, "callbackName");
        kotlin.jvm.internal.o.g(callback, "callback");
        gw1.e eVar = this.f267081b;
        if (eVar != null) {
            java.util.HashMap hashMap = eVar.f276151c;
            java.util.HashMap hashMap2 = (java.util.HashMap) hashMap.get(java.lang.Integer.valueOf(i17));
            if (hashMap2 == null) {
                hashMap.put(java.lang.Integer.valueOf(i17), kz5.c1.i(new jz5.l(callbackName, callback)));
            } else {
                hashMap2.containsKey(callbackName);
                hashMap2.put(callbackName, callback);
            }
        }
    }

    public final void f(mw1.c view, java.lang.String userName) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(userName, "userName");
        com.tencent.mars.xlog.Log.i("MicroMsg.MTR.OpenVoiceRenderLogic", "weiranli: unbind texture view name ".concat(userName));
        mw1.e eVar = c().f302307i;
        synchronized (eVar) {
            mw1.b bVar = (mw1.b) eVar.f331697e.get(userName);
            mw1.b bVar2 = null;
            if (bVar != null) {
                if (!kotlin.jvm.internal.o.b(bVar.a(), view)) {
                    bVar = null;
                }
                if (bVar != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MTR.RenderTargetHolder", "unbindOutputView " + view + ", " + userName);
                    bVar.f331694e = false;
                    eVar.b(bVar);
                    bVar2 = (mw1.b) eVar.f331697e.remove(userName);
                }
            }
            if (bVar2 == null) {
                com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.MTR.RenderTargetHolder", "unbindOutputView not match current", new java.lang.Object[0]);
            }
        }
    }
}

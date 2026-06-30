package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes8.dex */
public final class h0 {
    public h0(kotlin.jvm.internal.i iVar) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        if (r4.d(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.tencent.mm.plugin.webview.webcompt.h0 r4, kotlin.coroutines.Continuation r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof com.tencent.mm.plugin.webview.webcompt.o
            if (r0 == 0) goto L16
            r0 = r5
            com.tencent.mm.plugin.webview.webcompt.o r0 = (com.tencent.mm.plugin.webview.webcompt.o) r0
            int r1 = r0.f187870f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f187870f = r1
            goto L1b
        L16:
            com.tencent.mm.plugin.webview.webcompt.o r0 = new com.tencent.mm.plugin.webview.webcompt.o
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f187868d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f187870f
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r5)
            goto L3e
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            kotlin.ResultKt.throwOnFailure(r5)
            r0.f187870f = r3
            java.lang.Object r4 = r4.d(r0)
            if (r4 != r1) goto L3e
            goto L5a
        L3e:
            java.lang.String r4 = com.tencent.mm.plugin.webview.webcompt.f1.f187806n
            boolean r4 = r26.n0.N(r4)
            r4 = r4 ^ r3
            jz5.f0 r1 = jz5.f0.f302826a
            if (r4 == 0) goto L4a
            goto L5a
        L4a:
            java.lang.String r4 = com.tencent.mm.sdk.platformtools.w9.f193053a
            java.lang.String r5 = "PROCESS_MAIN"
            kotlin.jvm.internal.o.f(r4, r5)
            com.tencent.mm.ipcinvoker.type.IPCVoid r5 = com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d
            com.tencent.mm.plugin.webview.webcompt.p r0 = com.tencent.mm.plugin.webview.webcompt.p.f187875d
            com.tencent.mm.plugin.webview.webcompt.q r2 = com.tencent.mm.plugin.webview.webcompt.q.f187879d
            com.tencent.mm.ipcinvoker.f.a(r4, r5, r0, r2)
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.webcompt.h0.a(com.tencent.mm.plugin.webview.webcompt.h0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final com.tencent.mm.plugin.webview.webcompt.z b(com.tencent.mm.plugin.webview.webcompt.h0 h0Var) {
        h0Var.getClass();
        return (com.tencent.mm.plugin.webview.webcompt.z) ((jz5.n) com.tencent.mm.plugin.webview.webcompt.f1.f187805m).getValue();
    }

    public static final java.lang.String c(com.tencent.mm.plugin.webview.webcompt.h0 h0Var, r45.d24 d24Var) {
        h0Var.getClass();
        return lp0.b.e() + "webcompt/" + d24Var.f372006d + '/' + d24Var.f372008f;
    }

    public static void e(com.tencent.mm.plugin.webview.webcompt.h0 h0Var, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        if ((i17 & 2) != 0) {
            z18 = true;
        }
        h0Var.getClass();
        com.tencent.mm.plugin.webview.webcompt.m mVar = com.tencent.mm.plugin.webview.webcompt.m.f187860a;
        if (z17) {
            com.tencent.mm.vfs.r6[] H = new com.tencent.mm.vfs.r6(com.tencent.mm.plugin.webview.webcompt.f1.f187809q + "jsapi/").H(mVar);
            kotlin.jvm.internal.o.d(H);
            int length = H.length;
            for (int i18 = 0; i18 < length; i18++) {
                H[i18].l();
            }
        }
        if (z18) {
            com.tencent.mm.vfs.r6[] H2 = new com.tencent.mm.vfs.r6(com.tencent.mm.plugin.webview.webcompt.f1.f187809q).H(mVar);
            kotlin.jvm.internal.o.d(H2);
            for (com.tencent.mm.vfs.r6 r6Var : H2) {
                r6Var.l();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.tencent.mm.plugin.webview.webcompt.l
            if (r0 == 0) goto L13
            r0 = r7
            com.tencent.mm.plugin.webview.webcompt.l r0 = (com.tencent.mm.plugin.webview.webcompt.l) r0
            int r1 = r0.f187855g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f187855g = r1
            goto L18
        L13:
            com.tencent.mm.plugin.webview.webcompt.l r0 = new com.tencent.mm.plugin.webview.webcompt.l
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f187853e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f187855g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f187852d
            com.tencent.mm.plugin.webview.webcompt.h0 r0 = (com.tencent.mm.plugin.webview.webcompt.h0) r0
            kotlin.ResultKt.throwOnFailure(r7)
            goto L5e
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            kotlin.ResultKt.throwOnFailure(r7)
            r0.f187852d = r6
            r0.f187855g = r3
            oz5.n r7 = new oz5.n
            kotlin.coroutines.Continuation r0 = pz5.f.b(r0)
            r7.<init>(r0)
            java.lang.String r0 = com.tencent.mm.sdk.platformtools.w9.f193053a
            java.lang.String r2 = "PROCESS_MAIN"
            kotlin.jvm.internal.o.f(r0, r2)
            com.tencent.mm.ipcinvoker.type.IPCVoid r2 = com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d
            com.tencent.mm.plugin.webview.webcompt.r r3 = com.tencent.mm.plugin.webview.webcompt.r.f187887d
            com.tencent.mm.plugin.webview.webcompt.s r4 = new com.tencent.mm.plugin.webview.webcompt.s
            r4.<init>(r7)
            com.tencent.mm.ipcinvoker.f.a(r0, r2, r3, r4)
            java.lang.Object r7 = r7.a()
            if (r7 != r1) goto L5d
            return r1
        L5d:
            r0 = r6
        L5e:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r0.getClass()
            java.lang.String r0 = "webcompt_mmkv"
            com.tencent.mm.sdk.platformtools.o4 r1 = com.tencent.mm.sdk.platformtools.o4.M(r0)
            java.lang.String r2 = "getMMKV(...)"
            kotlin.jvm.internal.o.f(r1, r2)
            java.lang.String r3 = "lastSavePkgVersion"
            r4 = 0
            int r1 = r1.o(r3, r4)
            if (r1 == r7) goto Lac
            com.tencent.mm.plugin.webview.webcompt.h0 r4 = com.tencent.mm.plugin.webview.webcompt.f1.f187797e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "checkPkgVersion lastSaveVersion="
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r5 = ", currentVersion="
            r4.append(r5)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "MicroMsg.WebComponent"
            com.tencent.mars.xlog.Log.i(r5, r4)
            if (r1 <= 0) goto La2
            r1 = 0
            com.tencent.mm.plugin.webview.webcompt.f1.f187808p = r1
            java.lang.String r1 = ""
            com.tencent.mm.plugin.webview.webcompt.f1.f187806n = r1
        La2:
            com.tencent.mm.sdk.platformtools.o4 r0 = com.tencent.mm.sdk.platformtools.o4.M(r0)
            kotlin.jvm.internal.o.f(r0, r2)
            r0.A(r3, r7)
        Lac:
            jz5.f0 r7 = jz5.f0.f302826a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.webcompt.h0.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.String f() {
        com.tencent.mm.plugin.webview.webcompt.e h17 = h();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\n            [debug]\n            debug: ");
        boolean z17 = false;
        if (com.tencent.mm.plugin.webview.webcompt.l1.a().f("debug")) {
            z17 = com.tencent.mm.plugin.webview.webcompt.l1.a().getBoolean("debug", false);
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
        sb6.append(z17);
        sb6.append("\n\n            [lib]\n            version: ");
        sb6.append(h17.f187788e);
        sb6.append("\n            res: ");
        sb6.append(h17.f187786c);
        sb6.append("\n\n            ");
        sb6.append(kz5.n0.g0(h17.f187785b, "\n\n", null, null, 0, null, null, 62, null));
        sb6.append("\n\n            ");
        sb6.append(kz5.n0.g0(h17.f187784a, "\n\n", null, null, 0, null, null, 62, null));
        sb6.append("\n            ");
        return r26.b0.b(sb6.toString());
    }

    public final java.lang.String g(java.lang.String str) {
        return com.tencent.mm.plugin.webview.webcompt.f1.f187809q + str;
    }

    public final com.tencent.mm.plugin.webview.webcompt.e h() {
        return (com.tencent.mm.plugin.webview.webcompt.e) ((jz5.n) com.tencent.mm.plugin.webview.webcompt.f1.f187810r).getValue();
    }

    public final java.lang.String i(java.lang.String path, java.util.LinkedList linkedList) {
        boolean z17;
        com.tencent.mm.plugin.webview.webcompt.h0 h0Var = com.tencent.mm.plugin.webview.webcompt.f1.f187797e;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebComponent", "getLocalScript: %s", path);
        boolean z18 = false;
        if (com.tencent.mm.plugin.webview.webcompt.l1.a().f("debug")) {
            z17 = com.tencent.mm.plugin.webview.webcompt.l1.a().getBoolean("debug", false);
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (z17) {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(g("jsapi" + path));
            if (r6Var.m()) {
                if (linkedList != null) {
                    linkedList.add(new com.tencent.mm.plugin.webview.webcompt.g(path, null, com.tencent.mm.plugin.webview.webcompt.d.f187774f, 2, null));
                }
                return com.tencent.mm.vfs.s6.b(r6Var, null, 1, null);
            }
            com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(g("jsapi/webcompt.wcpkg"));
            if (r6Var2.m()) {
                if (linkedList != null) {
                    linkedList.add(new com.tencent.mm.plugin.webview.webcompt.g(path, null, com.tencent.mm.plugin.webview.webcompt.d.f187775g, 2, null));
                }
                com.tencent.mm.plugin.appbrand.appcache.y8 y8Var = new com.tencent.mm.plugin.appbrand.appcache.y8(r6Var2);
                try {
                    y8Var.a();
                    java.lang.String m17 = com.tencent.mm.plugin.webview.webcompt.f1.f187797e.m(y8Var, path);
                    vz5.b.a(y8Var, null);
                    return m17;
                } finally {
                }
            }
        }
        com.tencent.mm.plugin.webview.webcompt.i j17 = j();
        kotlin.jvm.internal.o.g(path, "path");
        java.lang.String key = "WebComp_Script_".concat(path);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.pluginsdk.model.f4.f189303a;
        kotlin.jvm.internal.o.g(key, "key");
        if (com.tencent.mm.pluginsdk.model.g4.b()) {
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.t(1009, 220);
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) com.tencent.mm.pluginsdk.model.f4.f189303a.get(key);
            r3 = weakReference != null ? (java.lang.String) weakReference.get() : null;
            if (r3 != null) {
                fVar.t(1009, com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_VIDEO_ENABLE_MEDIA_CODEC_RELEASE_OUTPUT_BUFFER_WITH_TIMESTAMP);
            }
        }
        if (r3 != null) {
            if (r3.length() > 0) {
                z18 = true;
            }
        }
        if (!z18) {
            r3 = com.tencent.mm.plugin.webview.webcompt.f1.f187797e.m(j17.f187822a, path);
            if (com.tencent.mm.pluginsdk.model.g4.b()) {
                com.tencent.mm.pluginsdk.model.f4.f189303a.put(key, new java.lang.ref.WeakReference(r3));
            }
        }
        if (linkedList != null) {
            linkedList.add(new com.tencent.mm.plugin.webview.webcompt.g(path, com.tencent.mm.plugin.webview.webcompt.f1.f187797e.h().f187786c, null, 4, null));
        }
        return r3;
    }

    public final com.tencent.mm.plugin.webview.webcompt.i j() {
        com.tencent.mm.plugin.webview.webcompt.h0 h0Var;
        int k17;
        com.tencent.mm.plugin.webview.webcompt.i iVar = com.tencent.mm.plugin.webview.webcompt.f1.f187808p;
        if (iVar != null) {
            return iVar;
        }
        com.tencent.mm.plugin.appbrand.appcache.u3 rVar = new com.tencent.mm.plugin.appbrand.appcache.r(com.tencent.mm.sdk.platformtools.x2.f193071a, "jsapi/webcompt.wcpkg");
        rVar.a();
        try {
            h0Var = com.tencent.mm.plugin.webview.webcompt.f1.f187797e;
            k17 = h0Var.k(rVar);
        } catch (java.lang.Exception e17) {
            com.tencent.mm.plugin.webview.webcompt.h0 h0Var2 = com.tencent.mm.plugin.webview.webcompt.f1.f187797e;
            com.tencent.mars.xlog.Log.e("MicroMsg.WebComponent", "pkg handle error: " + e17.getMessage());
            new com.tencent.mm.plugin.webview.webcompt.s1().a(com.tencent.mm.plugin.webview.webcompt.b.P);
        }
        if ((!r26.n0.N(com.tencent.mm.plugin.webview.webcompt.f1.f187806n)) && com.tencent.mm.vfs.w6.j(com.tencent.mm.plugin.webview.webcompt.f1.f187806n)) {
            com.tencent.mm.plugin.appbrand.appcache.u3 y8Var = new com.tencent.mm.plugin.appbrand.appcache.y8(com.tencent.mm.plugin.webview.webcompt.f1.f187806n);
            y8Var.a();
            int k18 = h0Var.k(y8Var);
            if (k18 > k17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebComponent", "ScriptManager use pkg res:" + k18);
                com.tencent.mm.plugin.webview.webcompt.e h17 = h0Var.h();
                com.tencent.mm.plugin.webview.webcompt.f fVar = com.tencent.mm.plugin.webview.webcompt.f.f187793f;
                h17.getClass();
                h17.f187786c = fVar;
                h0Var.h().f187788e = k18;
                rVar = y8Var;
                com.tencent.mm.plugin.webview.webcompt.i iVar2 = new com.tencent.mm.plugin.webview.webcompt.i(rVar);
                com.tencent.mm.plugin.webview.webcompt.f1.f187808p = iVar2;
                return iVar2;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebComponent", "ScriptManager use assets res" + k17);
        com.tencent.mm.plugin.webview.webcompt.e h18 = h0Var.h();
        com.tencent.mm.plugin.webview.webcompt.f fVar2 = com.tencent.mm.plugin.webview.webcompt.f.f187794g;
        h18.getClass();
        h18.f187786c = fVar2;
        h0Var.h().f187788e = k17;
        com.tencent.mm.plugin.webview.webcompt.i iVar22 = new com.tencent.mm.plugin.webview.webcompt.i(rVar);
        com.tencent.mm.plugin.webview.webcompt.f1.f187808p = iVar22;
        return iVar22;
    }

    public final int k(com.tencent.mm.plugin.appbrand.appcache.u3 u3Var) {
        try {
            java.lang.String m17 = m(u3Var, "/meta.json");
            if (m17.length() == 0) {
                return 0;
            }
            return new cl0.g(m17).optInt("version");
        } catch (java.lang.Exception e17) {
            com.tencent.mm.plugin.webview.webcompt.h0 h0Var = com.tencent.mm.plugin.webview.webcompt.f1.f187797e;
            com.tencent.mars.xlog.Log.e("MicroMsg.WebComponent", "parse IWxaPkg.version Error:" + e17.getMessage());
            return 0;
        }
    }

    public final void l(boolean z17) {
        if (com.tencent.mm.plugin.webview.webcompt.f1.f187807o.size() < 3) {
            if (z17 || !(!r0.isEmpty())) {
                kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.plugin.webview.webcompt.f0(null), 2, null);
            }
        }
    }

    public final java.lang.String m(com.tencent.mm.plugin.appbrand.appcache.u3 u3Var, java.lang.String str) {
        java.io.InputStream c17 = u3Var.c(str);
        if (c17 == null) {
            return "";
        }
        try {
            java.lang.String str2 = new java.lang.String(vz5.a.c(c17), r26.c.f368865a);
            vz5.b.a(c17, null);
            return str2;
        } catch (java.lang.Throwable th6) {
            try {
                throw th6;
            } catch (java.lang.Throwable th7) {
                vz5.b.a(c17, th6);
                throw th7;
            }
        }
    }
}

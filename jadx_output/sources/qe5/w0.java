package qe5;

/* loaded from: classes12.dex */
public final class w0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.tools.y3 f362202d;

    /* renamed from: e, reason: collision with root package name */
    public zh1.z0 f362203e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f362204f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f362205g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f362206h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f362207i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f362205g = kz5.c0.i(new qe5.q0("fts_template", ".zip", com.tencent.mm.R.string.bqr, 25, false, false, 48, null), new qe5.q0("fts_template", ".7z", com.tencent.mm.R.string.bqr, 25, false, false, 48, null), new qe5.q0("was_template", ".zip", com.tencent.mm.R.string.br6, 26, false, false, 48, null), new qe5.q0("fts_feature", ".zip", com.tencent.mm.R.string.bqq, 27, false, false, 48, null), new qe5.q0("wrd_template", ".zip", com.tencent.mm.R.string.bqo, 28, false, false, 48, null), new qe5.q0("pardus", ".zip", com.tencent.mm.R.string.bqy, 212, false, false, 48, null), new qe5.q0("box_template", ".zip", com.tencent.mm.R.string.bqm, 210, false, false, 48, null), new qe5.q0("box_flight_number", ".txt", com.tencent.mm.R.string.bqn, 211, false, false, 48, null), new qe5.q0("popup_scan", ".zip", com.tencent.mm.R.string.bqz, 213, false, false, 48, null), new qe5.q0("fs_kw_main", ".zip", com.tencent.mm.R.string.bqt, 215, false, false, 48, null), new qe5.q0("73.1.data", "", com.tencent.mm.R.string.bqt, 215, false, false, 48, null), new qe5.q0("tsc", ".zip", com.tencent.mm.R.string.f491062br1, 216, false, false, 48, null), new qe5.q0("ocr", ".zip", com.tencent.mm.R.string.bqu, 218, false, false, 48, null), new qe5.q0("mv_default_video", ".zip", com.tencent.mm.R.string.bqv, 219, false, false, 48, null), new qe5.q0("mv_transition", ".zip", com.tencent.mm.R.string.bqx, com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_VIDEO_ENABLE_MEDIA_CODEC_RELEASE_OUTPUT_BUFFER_WITH_TIMESTAMP, false, false, 48, null), new qe5.q0("mv_app_icon", ".zip", com.tencent.mm.R.string.bqw, com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_VERIFY_LOCAL_TIME_OUT, false, false, 48, null), new qe5.q0("TextState", ".zip", com.tencent.mm.R.string.f491065br4, 220, false, false, 48, null), new qe5.q0("ftshotsearch", ".zip", com.tencent.mm.R.string.bqs, 223, false, false, 48, null), new qe5.q0("webcompt", ".wcpkg", com.tencent.mm.R.string.f491066br5, 230, false, false, 48, null), new qe5.q0("esc", ".zip", com.tencent.mm.R.string.bqp, 228, false, false, 48, null), new qe5.q0("biztestcase", ".zip", com.tencent.mm.R.string.bql, com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR, false, false, 48, null), new qe5.q0("selecttext", ".zip", com.tencent.mm.R.string.f491061br0, 234, false, false, 48, null), new qe5.q0("runtime_package", ".zip", com.tencent.mm.R.string.br7, 239, false, false, 48, null), new qe5.q0("pinusruntime", ".zip", com.tencent.mm.R.string.br7, 239, false, false, 48, null), new qe5.q0("xwebruntime", ".zip", com.tencent.mm.R.string.br7, 239, false, false, 48, null));
        this.f362206h = kz5.c0.i(new qe5.q0("webtimeline", ".wspkg", com.tencent.mm.R.string.bqj, 224, false, true, 16, null), new qe5.q0(ya.b.INDEX, ".wspkg", com.tencent.mm.R.string.bqk, 225, false, true, 16, null), new qe5.q0("basic", ".wspkg", com.tencent.mm.R.string.bqj, com.tencent.mm.plugin.appbrand.jsapi.contact.j.CTRL_INDEX, false, true, 16, null), new qe5.q0("wx9e221f7828fa7482", ".wspkg", com.tencent.mm.R.string.bqk, 227, false, true, 16, null), new qe5.q0("wx2f3fb5db9f226462", ".wspkg", com.tencent.mm.R.string.bqj, 231, false, true, 16, null), new qe5.q0("wxe208ce76dfa39515", ".wspkg", com.tencent.mm.R.string.bqk, 232, false, true, 16, null), new qe5.q0("wxf337cbaa27790mb2", ".wspkg", com.tencent.mm.R.string.f491064br3, 235, false, true, 16, null));
        this.f362207i = kz5.c0.i(new qe5.q0("MagicBrandService", ".wspkg", com.tencent.mm.R.string.bqk, 237, true, true), new qe5.q0("MagicEcsTimeline", ".wspkg", com.tencent.mm.R.string.f491058ne2, 248, true, true), new qe5.q0("MagicEcsShop", ".wspkg", com.tencent.mm.R.string.nmt, 252, true, true), new qe5.q0("MagicAdPublicService", ".wspkg", com.tencent.mm.R.string.f491063br2, com.tencent.mm.plugin.appbrand.jsapi.j6.CTRL_INDEX, true, true), new qe5.q0("MagicEcsPublicService", ".wspkg", com.tencent.mm.R.string.f491057ne1, com.tencent.mm.plugin.appbrand.jsapi.cd.CTRL_INDEX, true, true), new qe5.q0("MagicAdBrandService", ".wspkg", com.tencent.mm.R.string.bqk, 238, true, true), new qe5.q0("MagicFinderCard", ".wspkg", com.tencent.mm.R.string.bqk, 240, true, true), new qe5.q0("MagicEmojiCocos", ".wspkg", com.tencent.mm.R.string.bqk, 245, true, true), new qe5.q0("MagicSclNativeDemo", ".wspkg", com.tencent.mm.R.string.ldf, 241, true, true), new qe5.q0("MagicAdPlayableBasic", ".wspkg", com.tencent.mm.R.string.lde, 242, true, true), new qe5.q0("MagicNewAdPlayableBasic", ".wspkg", com.tencent.mm.R.string.mft, 246, true, true), new qe5.q0("MagicGameLoading", ".wspkg", com.tencent.mm.R.string.ldd, 243, true, true), new qe5.q0("MagicBrushDemo", ".wspkg", com.tencent.mm.R.string.f491060ne4, 250, true, true));
    }

    public final void T6() {
        java.lang.String str;
        boolean z17;
        kd5.e Y6 = Y6();
        if (Y6 == null || (str = Y6.F) == null) {
            return;
        }
        java.lang.String targetDir = lp0.b.D() + "biztest/";
        kotlin.jvm.internal.o.g(targetDir, "targetDir");
        try {
            if (!com.tencent.mm.vfs.w6.j(targetDir)) {
                com.tencent.mm.vfs.w6.u(targetDir);
            }
            com.tencent.mm.vfs.w6.h(targetDir + "");
            com.tencent.mm.vfs.w6.Q(str, targetDir);
            z17 = true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.File.AppAttachApplyToUIC", "performFileOperation error: " + e17.getMessage());
            z17 = false;
        }
        if (z17) {
            Z6("Done");
        }
    }

    public final void U6(boolean z17) {
        java.lang.String str;
        boolean z18;
        kd5.e Y6 = Y6();
        if (Y6 == null || (str = Y6.F) == null) {
            return;
        }
        java.lang.String targetDir = lp0.b.D() + "jsengine/pkg/";
        java.lang.String str2 = z17 ? "webtimeline.wspkg" : "index.wspkg";
        kotlin.jvm.internal.o.g(targetDir, "targetDir");
        try {
            if (!com.tencent.mm.vfs.w6.j(targetDir)) {
                com.tencent.mm.vfs.w6.u(targetDir);
            }
            java.lang.String concat = targetDir.concat(str2);
            com.tencent.mm.vfs.w6.h(concat);
            com.tencent.mm.vfs.w6.c(str, concat);
            z18 = true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.File.AppAttachApplyToUIC", "performFileOperation error: " + e17.getMessage());
            z18 = false;
        }
        if (z18) {
            Z6("Done");
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.File.AppAttachApplyToUIC", "applyToCanvas failed");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void V6(int i17, int i18) {
        com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent;
        kd5.e Y6 = Y6();
        java.lang.String str = (8 & 4) == 0 ? Y6 != null ? Y6.F : null : null;
        if ((8 & 8) != 0) {
            com.tencent.mm.autogen.events.LocalCheckResUpdateCacheFileEvent localCheckResUpdateCacheFileEvent = new com.tencent.mm.autogen.events.LocalCheckResUpdateCacheFileEvent();
            am.dj djVar = localCheckResUpdateCacheFileEvent.f54480g;
            djVar.f6471a = i17;
            djVar.f6472b = i18;
            djVar.f6473c = str;
            checkResUpdateCacheFileEvent = localCheckResUpdateCacheFileEvent;
        } else {
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent2 = new com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent();
            am.r2 r2Var = checkResUpdateCacheFileEvent2.f54053g;
            r2Var.f7759a = i17;
            r2Var.f7760b = i18;
            r2Var.f7761c = str;
            checkResUpdateCacheFileEvent = checkResUpdateCacheFileEvent2;
        }
        checkResUpdateCacheFileEvent.e();
        Z6("apply to mv");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (r10 != null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W6(java.lang.String r10) {
        /*
            r9 = this;
            kd5.e r0 = r9.Y6()
            r1 = 0
            java.lang.String r2 = "MicroMsg.File.AppAttachApplyToUIC"
            if (r0 == 0) goto Ld9
            java.lang.String r0 = r0.F
            if (r0 == 0) goto Ld9
            java.lang.Class<com.tencent.mm.plugin.magicbrush.s4> r3 = com.tencent.mm.plugin.magicbrush.s4.class
            i95.m r3 = i95.n0.c(r3)
            com.tencent.mm.plugin.magicbrush.s4 r3 = (com.tencent.mm.plugin.magicbrush.s4) r3
            com.tencent.mm.plugin.magicbrush.s7 r3 = (com.tencent.mm.plugin.magicbrush.s7) r3
            java.lang.String r3 = r3.Di()
            java.lang.String r4 = "mbpkgs/"
            java.lang.String r3 = r3.concat(r4)
            r4 = 1
            if (r10 == 0) goto L37
            boolean r5 = r26.n0.N(r10)
            r5 = r5 ^ r4
            if (r5 == 0) goto L2c
            goto L2d
        L2c:
            r10 = r1
        L2d:
            if (r10 == 0) goto L37
            java.lang.String r5 = ".wspkg"
            java.lang.String r10 = r10.concat(r5)
            if (r10 != 0) goto L7b
        L37:
            kd5.e r10 = r9.Y6()
            if (r10 == 0) goto L49
            java.lang.String r10 = r10.f306892w
            if (r10 == 0) goto L49
            boolean r5 = r26.n0.N(r10)
            r5 = r5 ^ r4
            if (r5 == 0) goto L49
            goto L4a
        L49:
            r10 = r1
        L4a:
            if (r10 != 0) goto L7b
        */
        //  java.lang.String r10 = ".*/"
        /*
            java.util.regex.Pattern r10 = java.util.regex.Pattern.compile(r10)
            java.lang.String r5 = "compile(...)"
            kotlin.jvm.internal.o.f(r10, r5)
            java.util.regex.Matcher r10 = r10.matcher(r0)
            java.lang.String r6 = ""
            java.lang.String r10 = r10.replaceAll(r6)
            java.lang.String r7 = "replaceAll(...)"
            kotlin.jvm.internal.o.f(r10, r7)
            java.lang.String r8 = ".*_"
            java.util.regex.Pattern r8 = java.util.regex.Pattern.compile(r8)
            kotlin.jvm.internal.o.f(r8, r5)
            java.util.regex.Matcher r10 = r8.matcher(r10)
            java.lang.String r10 = r10.replaceAll(r6)
            kotlin.jvm.internal.o.f(r10, r7)
        L7b:
            java.lang.String r5 = "targetDir"
            kotlin.jvm.internal.o.g(r3, r5)
            r5 = 0
            boolean r6 = com.tencent.mm.vfs.w6.j(r3)     // Catch: java.lang.Exception -> L96
            if (r6 != 0) goto L8b
            com.tencent.mm.vfs.w6.u(r3)     // Catch: java.lang.Exception -> L96
        L8b:
            java.lang.String r3 = r3.concat(r10)     // Catch: java.lang.Exception -> L96
            com.tencent.mm.vfs.w6.h(r3)     // Catch: java.lang.Exception -> L96
            com.tencent.mm.vfs.w6.c(r0, r3)     // Catch: java.lang.Exception -> L96
            goto Lae
        L96:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "performFileOperation error: "
            r3.<init>(r4)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.mars.xlog.Log.e(r2, r0)
            r4 = r5
        Lae:
            if (r4 == 0) goto Lca
            r0 = 46
            r3 = 2
            boolean r5 = r26.n0.C(r10, r0, r5, r3, r1)
            if (r5 == 0) goto Lca
            java.lang.Class<ie3.i> r5 = ie3.i.class
            i95.m r5 = i95.n0.c(r5)
            ie3.i r5 = (ie3.i) r5
            java.lang.String r10 = r26.n0.r0(r10, r0, r1, r3, r1)
            he3.e r5 = (he3.e) r5
            r5.nj(r10)
        Lca:
            if (r4 == 0) goto Ld2
            java.lang.String r10 = "Done"
            r9.Z6(r10)
            goto Ld7
        Ld2:
            java.lang.String r10 = "applyToWXACanvas failed"
            com.tencent.mars.xlog.Log.e(r2, r10)
        Ld7:
            jz5.f0 r1 = jz5.f0.f302826a
        Ld9:
            if (r1 != 0) goto Le0
            java.lang.String r10 = "getAppAttachInfo is null"
            com.tencent.mars.xlog.Log.e(r2, r10)
        Le0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qe5.w0.W6(java.lang.String):void");
    }

    public final void X6() {
        java.lang.String str;
        boolean z17;
        kd5.e Y6 = Y6();
        if (Y6 == null || (str = Y6.F) == null) {
            return;
        }
        java.lang.String targetDir = lp0.b.D() + "webcompt_debug/jsapi/";
        kotlin.jvm.internal.o.g(targetDir, "targetDir");
        try {
            if (!com.tencent.mm.vfs.w6.j(targetDir)) {
                com.tencent.mm.vfs.w6.u(targetDir);
            }
            java.lang.String str2 = targetDir + "webcompt.wcpkg";
            com.tencent.mm.vfs.w6.h(str2);
            com.tencent.mm.vfs.w6.c(str, str2);
            z17 = true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.File.AppAttachApplyToUIC", "performFileOperation error: " + e17.getMessage());
            z17 = false;
        }
        if (z17) {
            Z6("Done");
        }
    }

    public final kd5.e Y6() {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            return (kd5.e) Q6.getState();
        }
        return null;
    }

    public final void Z6(java.lang.String str) {
        db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, str, 1).show();
    }
}

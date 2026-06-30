package com.tencent.mm.plugin.multitask;

@j95.b
/* loaded from: classes8.dex */
public final class p1 extends i95.w implements com.tencent.mm.plugin.multitask.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f150479d = "MicroMsg.MultiTask.PluginMultiTaskService";

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.app.s2 f150480e = new com.tencent.mm.plugin.multitask.m1(this);

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.multitask.PluginMultiTaskService$multiTaskLatestDeleteListener$1 f150481f;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.multitask.PluginMultiTaskService$multiTaskLatestDeleteListener$1] */
    public p1() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f150481f = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MulitTaskEvent>(a0Var) { // from class: com.tencent.mm.plugin.multitask.PluginMultiTaskService$multiTaskLatestDeleteListener$1
            {
                this.__eventId = -1085760746;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MulitTaskEvent mulitTaskEvent) {
                com.tencent.mm.autogen.events.MulitTaskEvent event = mulitTaskEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.ak akVar = event.f54503g;
                if (akVar == null || akVar.f6161c != 6) {
                    return true;
                }
                com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.multitask.p1.this.f150479d, "NotifyLatestMultiTaskDeleteEvent callback");
                tk3.t.f419947o.a().m(0);
                return true;
            }
        };
    }

    public boolean Ai() {
        return ((com.tencent.mm.plugin.multitask.i1) i95.n0.c(com.tencent.mm.plugin.multitask.i1.class)).Di();
    }

    public android.graphics.Point Bi() {
        ((com.tencent.mm.plugin.multitask.i1) ((com.tencent.mm.plugin.multitask.j0) i95.n0.c(com.tencent.mm.plugin.multitask.j0.class))).getClass();
        return new android.graphics.Point(0, com.tencent.mm.plugin.multitask.q0.f150494k);
    }

    public int Di(java.lang.String id6, int i17) {
        kotlin.jvm.internal.o.g(id6, "id");
        java.util.Iterator it = ((com.tencent.mm.plugin.multitask.i1) i95.n0.c(com.tencent.mm.plugin.multitask.i1.class)).f150448g.iterator();
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                i18 = -1;
                break;
            }
            ik3.r rVar = (ik3.r) it.next();
            if (rVar.f291912b == i17 && kotlin.jvm.internal.o.b(rVar.f291911a, id6)) {
                break;
            }
            i18++;
        }
        if (i18 == -1) {
            return 0;
        }
        return i18;
    }

    public com.tencent.mm.plugin.multitask.m0 Ni() {
        if (((km0.c) gm0.j1.p().a()).a()) {
            return com.tencent.mm.plugin.multitask.s1.f150502d.a();
        }
        com.tencent.mm.plugin.multitask.t1 t1Var = com.tencent.mm.plugin.multitask.h2.f150438d;
        com.tencent.mm.plugin.multitask.h2 h2Var = com.tencent.mm.plugin.multitask.h2.f150439e;
        if (h2Var == null) {
            synchronized (t1Var) {
                h2Var = com.tencent.mm.plugin.multitask.h2.f150439e;
                if (h2Var == null) {
                    h2Var = new com.tencent.mm.plugin.multitask.h2();
                    com.tencent.mm.plugin.multitask.h2.f150439e = h2Var;
                }
            }
        }
        return h2Var;
    }

    public boolean Ri(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
        kotlin.jvm.internal.o.g(multiTaskInfo, "multiTaskInfo");
        return ((com.tencent.mm.plugin.multitask.i1) ((com.tencent.mm.plugin.multitask.j0) i95.n0.c(com.tencent.mm.plugin.multitask.j0.class))).cj(multiTaskInfo);
    }

    public void Ui(android.os.Bundle bundle, r45.k97 webMultiTaskData) {
        kotlin.jvm.internal.o.g(bundle, "bundle");
        kotlin.jvm.internal.o.g(webMultiTaskData, "webMultiTaskData");
        webMultiTaskData.set(4, bundle.getString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE));
        webMultiTaskData.set(5, bundle.getString("webpageTitle"));
        webMultiTaskData.set(6, java.lang.Boolean.valueOf(bundle.getBoolean("hide_option_menu")));
        webMultiTaskData.set(7, java.lang.Boolean.valueOf(bundle.getBoolean("translate_webview")));
        webMultiTaskData.set(8, bundle.getString("srcUsername"));
        webMultiTaskData.set(9, bundle.getString("srcDisplayname"));
        webMultiTaskData.set(10, java.lang.Integer.valueOf(bundle.getInt("mode")));
        webMultiTaskData.set(11, bundle.getString("KTemplateId"));
        webMultiTaskData.set(12, bundle.getString("KPublisherId"));
        webMultiTaskData.set(13, java.lang.Integer.valueOf(bundle.getInt("KOpenArticleSceneFromScene")));
        webMultiTaskData.set(14, java.lang.Integer.valueOf(bundle.getInt(com.tencent.mm.ui.w2.f211194g)));
        webMultiTaskData.set(15, java.lang.Integer.valueOf(bundle.getInt("pay_channel")));
        webMultiTaskData.set(16, java.lang.Integer.valueOf(bundle.getInt("key_download_restrict")));
        webMultiTaskData.set(17, java.lang.Integer.valueOf(bundle.getInt("key_wallet_region")));
        webMultiTaskData.set(18, bundle.getString("key_function_id"));
        webMultiTaskData.set(19, java.lang.Integer.valueOf(bundle.getInt(com.tencent.mm.ui.w2.f211197j, -1)));
        webMultiTaskData.set(20, java.lang.Integer.valueOf(bundle.getInt("geta8key_scene")));
        webMultiTaskData.set(25, bundle.getString("ad_ux_info_for_jsapi_pay"));
        webMultiTaskData.set(26, java.lang.Boolean.valueOf(bundle.getBoolean("key_menu_hide_expose")));
        webMultiTaskData.set(27, bundle.getString("webviewCurrentProcess"));
        webMultiTaskData.set(1, bundle.getString("rawUrl"));
    }

    public void Vi(int i17, java.lang.String id6, int i18, java.lang.String processName) {
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(processName, "processName");
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            if ((processName.length() == 0) || kotlin.jvm.internal.o.b(processName, bm5.f1.a())) {
                com.tencent.mm.autogen.events.MulitTaskEvent mulitTaskEvent = new com.tencent.mm.autogen.events.MulitTaskEvent();
                am.ak akVar = mulitTaskEvent.f54503g;
                akVar.f6161c = i17;
                akVar.f6160b = i18;
                akVar.f6159a = id6;
                mulitTaskEvent.b(android.os.Looper.getMainLooper());
                return;
            }
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(dm.i4.COL_ID, id6);
        bundle.putInt("type", i18);
        bundle.putInt("event_type", i17);
        if (processName.length() == 0) {
            processName = com.tencent.mm.sdk.platformtools.w9.f193053a;
        }
        com.tencent.mm.ipcinvoker.d0.d(processName, bundle, com.tencent.mm.plugin.multitask.p0.class, new com.tencent.mm.plugin.multitask.o1(this));
    }

    public void Zi(java.lang.String id6, int i17, r45.lr4 showData, android.graphics.Bitmap bitmap, byte[] bArr) {
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(showData, "showData");
        com.tencent.mm.plugin.multitask.i1 i1Var = (com.tencent.mm.plugin.multitask.i1) ((com.tencent.mm.plugin.multitask.j0) i95.n0.c(com.tencent.mm.plugin.multitask.j0.class));
        i1Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateTaskInfoByBitmap id:");
        sb6.append(id6);
        sb6.append(" type:");
        sb6.append(i17);
        sb6.append(" bitmap:");
        jz5.f0 f0Var = null;
        sb6.append(bitmap != null ? java.lang.Integer.valueOf(bitmap.getByteCount()) : null);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = i1Var.f150445d;
        com.tencent.mars.xlog.Log.i(str, sb7);
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            showData.set(7, java.lang.Boolean.FALSE);
            com.tencent.mm.plugin.multitask.u0 u0Var = com.tencent.mm.plugin.multitask.u0.f150506a;
            java.lang.String b17 = u0Var.b(id6);
            if (bitmap != null) {
                if (com.tencent.mm.vfs.w6.j(b17)) {
                    com.tencent.mm.vfs.w6.h(b17);
                }
                n11.a.b().p(com.tencent.mm.plugin.multitask.s0.f150501a.a(b17, com.tencent.mm.plugin.multitask.u0.f150507b));
                if (!u0Var.a(bitmap, "", b17)) {
                    try {
                        com.tencent.mm.sdk.platformtools.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.JPEG, b17, false);
                    } catch (java.io.IOException e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace(str, e17, "", new java.lang.Object[0]);
                        showData.set(7, java.lang.Boolean.TRUE);
                    }
                }
            } else {
                showData.set(7, java.lang.Boolean.valueOf(!com.tencent.mm.vfs.w6.j(b17)));
                com.tencent.mars.xlog.Log.i(str, "updateTaskInfoByBitmap showData defaultBg mainProcess");
            }
            i1Var.rj(id6, i17, showData, bArr);
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        showData.set(7, java.lang.Boolean.FALSE);
        if (bitmap != null) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
            sb8.append(lp0.b.h0("multitask").o());
            sb8.append('/');
            sb8.append(id6);
            java.lang.String sb9 = sb8.toString();
            if (com.tencent.mm.vfs.w6.j(sb9)) {
                com.tencent.mm.vfs.w6.h(sb9);
            }
            try {
                com.tencent.mm.sdk.platformtools.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.JPEG, sb9, false);
            } catch (java.io.IOException e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace(str, e18, "", new java.lang.Object[0]);
                showData.set(7, java.lang.Boolean.TRUE);
            }
            bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, sb9);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i(str, "updateTaskInfoByBitmap showData defaultBg");
        }
        bundle.putString(dm.i4.COL_ID, id6);
        bundle.putInt("type", i17);
        bundle.putByteArray("showData", showData.toByteArray());
        bundle.putByteArray(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, bArr);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.multitask.l2.class, new com.tencent.mm.plugin.multitask.g1(i1Var));
    }

    public void aj(java.lang.String id6, int i17, r45.lr4 showData, byte[] bArr) {
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(showData, "showData");
        com.tencent.mm.plugin.multitask.i1 i1Var = (com.tencent.mm.plugin.multitask.i1) ((com.tencent.mm.plugin.multitask.j0) i95.n0.c(com.tencent.mm.plugin.multitask.j0.class));
        i1Var.getClass();
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            i1Var.rj(id6, i17, showData, bArr);
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(dm.i4.COL_ID, id6);
        bundle.putInt("type", i17);
        bundle.putByteArray("showData", showData.toByteArray());
        bundle.putByteArray(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, bArr);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.multitask.k2.class, new com.tencent.mm.plugin.multitask.h1(i1Var));
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f150480e.alive();
        if (((km0.c) gm0.j1.p().a()).a()) {
            alive();
            if (bm5.o1.f22719a.i(new com.tencent.mm.repairer.config.multitask.RepairerConfigMultiTaskEducationAnim(), 0) == 1) {
                com.tencent.mm.sdk.platformtools.o4.M("multitask_tips_config").putBoolean(((com.tencent.mm.plugin.multitask.i1) i95.n0.c(com.tencent.mm.plugin.multitask.i1.class)).Di() ? "multitask_new_tips_show" : "multitask_tips_show", false);
            }
        }
        com.tencent.mars.xlog.Log.i(this.f150479d, "onAccountInitialized");
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f150480e.dead();
        if (((km0.c) gm0.j1.p().a()).a()) {
            dead();
            tk3.t.f419947o.a().m(0);
        }
        com.tencent.mars.xlog.Log.i(this.f150479d, "onAccountReleased");
    }

    public void wi(java.lang.String id6, int i17, r45.lr4 showData, android.graphics.Bitmap bitmap, byte[] bArr, r45.kr4 kr4Var) {
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(showData, "showData");
        ((com.tencent.mm.plugin.multitask.i1) ((com.tencent.mm.plugin.multitask.j0) i95.n0.c(com.tencent.mm.plugin.multitask.j0.class))).Ai(id6, i17, showData, bitmap, bArr, new mk3.a(kr4Var, false, false, 6, null));
    }
}

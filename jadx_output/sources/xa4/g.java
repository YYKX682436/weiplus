package xa4;

/* loaded from: classes4.dex */
public final class g implements com.tencent.mm.app.h4 {

    /* renamed from: d, reason: collision with root package name */
    public static final xa4.g f452830d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f452831e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f452832f;

    /* renamed from: g, reason: collision with root package name */
    public static r45.gd6 f452833g;

    /* renamed from: h, reason: collision with root package name */
    public static int f452834h;

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.String f452835i;

    /* renamed from: m, reason: collision with root package name */
    public static final boolean f452836m;

    static {
        xa4.g gVar = new xa4.g();
        f452830d = gVar;
        java.lang.String str = c50.l0.f38610a;
        f452831e = c50.l0.f38611b;
        com.tencent.mm.sdk.platformtools.o4 L = com.tencent.mm.sdk.platformtools.o4.L();
        f452832f = L;
        f452833g = new r45.gd6();
        f452835i = "sns_normal_mode";
        try {
            byte[] j17 = L.j("SnsSpring2024Config_V0");
            if (j17 != null) {
                f452833g.parseFrom(j17);
            }
            boolean z17 = java.lang.System.currentTimeMillis() - L.q("sns_spring_ui_crash_time_ms", 0L) <= 3600000;
            f452836m = z17;
            f452835i = I() ? "sns_spring_mode" : "sns_normal_mode";
            com.tencent.mm.app.i4.a(gVar);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsSpringLogic", "init config=" + gVar.J(f452833g) + " snsProtectForUICrash:" + z17);
            if (z65.c.a()) {
                int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_CRASH_PROTECT_INT_SYNC, 0);
                if (r17 == 1) {
                    f452836m = false;
                } else {
                    if (r17 != 3) {
                        return;
                    }
                    f452836m = false;
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsSpringLogic", e17, "SnsSpringLogic init Error", new java.lang.Object[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f0 A[Catch: all -> 0x00f7, TryCatch #0 {all -> 0x00f7, blocks: (B:117:0x004c, B:119:0x0050, B:121:0x0054, B:11:0x005c, B:15:0x0065, B:18:0x0070, B:21:0x007a, B:24:0x00bb, B:26:0x00da, B:28:0x00e2, B:33:0x00f0, B:34:0x00fb), top: B:116:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0214  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void D(android.content.Context r37, com.tencent.mm.protocal.protobuf.TimeLineObject r38, boolean r39) {
        /*
            Method dump skipped, instructions count: 844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xa4.g.D(android.content.Context, com.tencent.mm.protocal.protobuf.TimeLineObject, boolean):void");
    }

    public static final void E(android.app.Activity activity) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("launchUploadSnsSpring", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        kotlin.jvm.internal.o.g(activity, "activity");
        xa4.h[] hVarArr = xa4.h.f452837d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildIntentForLaunchUploadSnsSpring$default", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        android.content.Intent intent = new android.content.Intent();
        d(activity, intent, 1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildIntentForLaunchUploadSnsSpring$default", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(1006);
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/sns/spring/SnsSpringLogic", "launchUploadSnsSpring", "(Landroid/app/Activity;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        if (activity instanceof com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI) {
            com.tencent.mm.plugin.sns.statistics.i0 i0Var = com.tencent.mm.plugin.sns.statistics.j0.f164861a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fromSpringSheetOnTimeline", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
            dx1.f fVar = dx1.g.f244489a;
            fVar.i("SnsPublishProcess", "fromPage", 1);
            fVar.i("SnsPublishProcess", "source_", 10L);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fromSpringSheetOnTimeline", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        } else if (activity instanceof com.tencent.mm.plugin.sns.ui.SnsUserUI) {
            com.tencent.mm.plugin.sns.statistics.i0 i0Var2 = com.tencent.mm.plugin.sns.statistics.j0.f164861a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fromSpringSheetOnUserPage", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
            dx1.f fVar2 = dx1.g.f244489a;
            fVar2.i("SnsPublishProcess", "fromPage", 2);
            fVar2.i("SnsPublishProcess", "source_", 10L);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fromSpringSheetOnUserPage", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        }
        xa4.a aVar = xa4.a.f452819a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markClickActivityPostEntrance", "com.tencent.mm.plugin.sns.spring.SnsActivityPostAction31314Reporter");
        if (xa4.a.f452820b) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markClickActivityPostEntranceAfterConsume", "com.tencent.mm.plugin.sns.spring.SnsActivityPostAction31314Reporter");
            aVar.a(3);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markClickActivityPostEntranceAfterConsume", "com.tencent.mm.plugin.sns.spring.SnsActivityPostAction31314Reporter");
            xa4.a.f452820b = false;
        }
        aVar.a(5);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markClickActivityPostEntrance", "com.tencent.mm.plugin.sns.spring.SnsActivityPostAction31314Reporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("launchUploadSnsSpring", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0048, code lost:
    
        if ((r1 instanceof android.view.View) != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void H(android.content.Context r18, android.view.View r19, int r20, boolean r21, java.lang.Integer r22, java.lang.Integer r23, android.view.View.OnClickListener r24) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xa4.g.H(android.content.Context, android.view.View, int, boolean, java.lang.Integer, java.lang.Integer, android.view.View$OnClickListener):void");
    }

    public static final boolean I() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("snsSpringStyleEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        if (f452836m) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("snsSpringStyleEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_SPRING_2024_STYLE_STATUS_INT_SYNC, -1);
        if (r17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsSpringLogic", "local set not show spring style");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("snsSpringStyleEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        if (r17 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsSpringLogic", "local set show spring style");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("snsSpringStyleEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return true;
        }
        if (!f452830d.B()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsSpringLogic", "snsSpringStyleEnable: xconfig failed");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("snsSpringStyleEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        int b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("SnsSpringFestivalYear", 0);
        if (b17 != f452834h) {
            f452834h = b17;
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsSpringLogic", "AV_Item_Key_SnsSpringFestivalYear:" + f452834h);
        }
        boolean z17 = b17 == 2025 || f452833g.f375145g == 2025;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("snsSpringStyleEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return z17;
    }

    public static final void K(r45.ga6 ga6Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateSnsServerConfig", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        r45.gd6 gd6Var = ga6Var != null ? ga6Var.f375058t : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsSpringLogic", "updateSnsServerConfig: " + f452830d.J(gd6Var));
        if (gd6Var != null) {
            f452833g = gd6Var;
        } else {
            f452833g = new r45.gd6();
        }
        f452835i = I() ? "sns_spring_mode" : "sns_normal_mode";
        f452832f.H("SnsSpring2024Config_V0", f452833g.toByteArray());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateSnsServerConfig", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
    }

    public static final android.content.Intent c(android.content.Context context, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildIntentForLaunchUploadSnsNormal", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsSpringLogic", "buildIntentForLaunchUploadSnsNormal: from " + context);
        intent.setClass(context, com.tencent.mm.plugin.sns.ui.SnsUploadUI.class);
        intent.putExtra("KSnsPostManu", true);
        intent.putExtra("KTouchCameraTime", com.tencent.mm.sdk.platformtools.t8.i1());
        intent.putExtra("sns_comment_type", 1);
        intent.putExtra("is_spring", false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildIntentForLaunchUploadSnsNormal", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return intent;
    }

    public static final android.content.Intent d(android.content.Context context, android.content.Intent intent, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildIntentForLaunchUploadSnsSpring", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsSpringLogic", "buildIntentForLaunchUploadSnsSpring: from " + context + ", feedType=" + i17);
        intent.setClass(context, com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI.class);
        intent.putExtra("KSnsPostManu", true);
        intent.putExtra("KTouchCameraTime", com.tencent.mm.sdk.platformtools.t8.i1());
        intent.putExtra("sns_comment_type", 1);
        intent.putExtra("is_spring", true);
        intent.putExtra("spring_feed_type", i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildIntentForLaunchUploadSnsSpring", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return intent;
    }

    public static final boolean f() {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("canNowShowRedDotForTimeLinePost", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        if (v()) {
            xa4.g gVar = f452830d;
            if (!gVar.u() && gVar.j()) {
                z17 = true;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canNowShowRedDotForTimeLinePost", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
                return z17;
            }
        }
        z17 = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canNowShowRedDotForTimeLinePost", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return z17;
    }

    public static final boolean i(java.lang.Integer num) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkYearValid", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        boolean z17 = false;
        if (num == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkYearValid", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isLocalDebugConfigOpen", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        boolean z18 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_SPRING_2024_STYLE_STATUS_INT_SYNC, -1) == 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLocalDebugConfigOpen", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        if (z18 && num.intValue() == 2025) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkYearValid", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return true;
        }
        int i17 = f452833g.f375145g;
        if (i17 != 0 && i17 == num.intValue()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkYearValid", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return true;
        }
        int b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("SnsSpringFestivalYear", 0);
        if (b17 != 0 && b17 == num.intValue()) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkYearValid", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return z17;
    }

    public static final db5.h4 k(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createPostSheetSpringMenuItem", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsSpringLogic", "createPostSheetSpringMenuItem: ");
        db5.h4 h4Var = new db5.h4(context, 8, 0);
        h4Var.f228368i = f452830d.m(context);
        h4Var.f228373q = context.getString(com.tencent.mm.R.string.m6q);
        h4Var.K = new xa4.e(context);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createPostSheetSpringMenuItem", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return h4Var;
    }

    public static final void l(com.tencent.mm.ui.widget.imageview.WeImageView weImageView, android.widget.TextView textView, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doSpringUnLike", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        if (textView != null) {
            textView.setImportantForAccessibility(2);
            textView.setText(com.tencent.mm.R.string.m6s);
            textView.announceForAccessibility(i65.a.r(textView.getContext(), com.tencent.mm.R.string.f493159ma0));
            textView.setImportantForAccessibility(1);
        }
        if (weImageView == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsSpringLogic", "doSpringLikeAnim: failed");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doSpringUnLike", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        } else {
            android.graphics.drawable.Drawable i17 = i65.a.i(weImageView.getContext(), com.tencent.mm.R.drawable.icon_soring_2024_firecracker_outlined);
            i17.setAlpha(255);
            weImageView.setImageDrawable(i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doSpringUnLike", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        }
    }

    public static final r45.g92 r() {
        byte[] j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSharedFinderLive", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        r45.g92 g92Var = null;
        try {
            j17 = f452832f.j(f452831e);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsSpringLogic", e17, "unable to parse saved finder live", new java.lang.Object[0]);
        }
        if (j17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSharedFinderLive", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return null;
        }
        r45.g92 g92Var2 = new r45.g92();
        g92Var2.parseFrom(j17);
        g92Var = g92Var2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSharedFinderLive", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return g92Var;
    }

    public static final android.graphics.drawable.Drawable s(int i17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSpringLikeDrawable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        android.graphics.drawable.Drawable e17 = m95.a.e(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources(), com.tencent.mm.R.raw.icon_spring_2024_firecracker_outlined, (i18 * 1.0f) / i65.a.i(r2, com.tencent.mm.R.raw.icon_spring_2024_firecracker_outlined).getIntrinsicWidth());
        e17.setColorFilter(new android.graphics.PorterDuffColorFilter(i17, android.graphics.PorterDuff.Mode.SRC_ATOP));
        e17.setBounds(0, 0, i18, i19);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSpringLikeDrawable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return e17;
    }

    public static final int t() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSpringThemeMainColorId", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSpringThemeMainColorId", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return com.tencent.mm.R.color.af9;
    }

    public static final boolean v() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isEntryOptionVisible", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_SPRING_2024_POST_STATUS_INT_SYNC, -1);
        if (r17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsSpringLogic", "local set disable entry");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isEntryOptionVisible", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        xa4.g gVar = f452830d;
        if (r17 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsSpringLogic", "local set show entry if u had enter live room,and feed with live tail");
            boolean h17 = gVar.h();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isEntryOptionVisible", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return h17;
        }
        if (r17 == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsSpringLogic", "local set show entry,show live tail if u had enter live room");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isEntryOptionVisible", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return true;
        }
        if (r17 == 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsSpringLogic", "local set show entry,without live tail");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isEntryOptionVisible", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isXConfigSnsSpringPostSheetEntranceEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        boolean z17 = gVar.B() && gVar.A(e42.c0.clicfg_sns_cny_post_sheet_entrance_enable);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isXConfigSnsSpringPostSheetEntranceEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsSpringLogic", "isEntryOptionVisible: xconfig failed");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isEntryOptionVisible", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        int i17 = f452833g.f375142d;
        boolean h18 = i17 != 0 ? i17 != 1 ? true : gVar.h() : false;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsSpringLogic", "isEntryOptionVisible: result:" + h18 + ", postStatus:" + f452833g.f375142d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isEntryOptionVisible", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return h18;
    }

    public static final boolean w(com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, boolean z17, boolean z18) {
        r45.a90 a90Var;
        r45.fd6 fd6Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFeedShouldShowSpringLink", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        if (z18) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isFeedShouldShowSpringLink: FoldFeed failed, ");
            sb6.append(timeLineObject != null ? timeLineObject.Id : null);
            sb6.append(", ");
            sb6.append(timeLineObject != null ? java.lang.Integer.valueOf(timeLineObject.CreateTime) : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsSpringLogic", sb6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFeedShouldShowSpringLink", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        xa4.g gVar = f452830d;
        if (!gVar.y(timeLineObject)) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("isFeedShouldShowSpringLink: not spring, ");
            sb7.append(timeLineObject != null ? timeLineObject.Id : null);
            sb7.append(", ");
            sb7.append(timeLineObject != null ? java.lang.Integer.valueOf(timeLineObject.CreateTime) : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsSpringLogic", sb7.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFeedShouldShowSpringLink", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        if (((timeLineObject == null || (a90Var = timeLineObject.ContentObj) == null || (fd6Var = a90Var.B) == null) ? null : fd6Var.f374243d) == null) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("isFeedShouldShowSpringLink: SpringFinderLive null, ");
            sb8.append(timeLineObject != null ? timeLineObject.Id : null);
            sb8.append(", ");
            sb8.append(timeLineObject != null ? java.lang.Integer.valueOf(timeLineObject.CreateTime) : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsSpringLogic", sb8.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFeedShouldShowSpringLink", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_SPRING_2024_LINK_STATUS_INT_SYNC, -1);
        if (r17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsSpringLogic", "isFeedShouldShowSpringLink: debug hide");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFeedShouldShowSpringLink", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        if (r17 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsSpringLogic", "isFeedShouldShowSpringLink: debug show");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFeedShouldShowSpringLink", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isXConfigSnsSpringFeedLiveLinkEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        boolean z19 = gVar.B() && gVar.A(e42.c0.clicfg_sns_cny_feed_live_link_enable);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isXConfigSnsSpringFeedLiveLinkEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        if (!z19) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsSpringLogic", "isFeedShouldShowSpringLink: xConfig hide");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFeedShouldShowSpringLink", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        if (f452833g.f375143e == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFeedShouldShowSpringLink", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        int n17 = gVar.n();
        boolean g17 = gVar.g(n17, timeLineObject, z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsSpringLogic", "isFeedShouldShowSpringLink: enable=" + g17 + ", jumpType=" + n17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFeedShouldShowSpringLink", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return g17;
    }

    public static final boolean x(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFeedSpringVisible", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFeedSpringVisible", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        if (snsInfo.isAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFeedSpringVisible", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        boolean y17 = f452830d.y(snsInfo.getTimeLine());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFeedSpringVisible", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return y17;
    }

    public final boolean A(e42.c0 c0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isXConfigOpen", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(c0Var, "", true);
        kotlin.jvm.internal.o.d(Zi);
        if (r26.n0.B(Zi, "CloseCny", false)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isXConfigOpen", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        if (android.text.TextUtils.isEmpty(Zi)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isXConfigOpen", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return true;
        }
        java.util.Set d07 = kz5.n0.d0(r26.n0.f0(Zi, new java.lang.String[]{";"}, false, 0, 6, null), com.tencent.mm.app.l0.b());
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsSpringLogic", "xconfig:" + Zi + " crash list:" + com.tencent.mm.app.l0.b() + " intersect:" + d07);
        boolean isEmpty = d07.isEmpty();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isXConfigOpen", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return isEmpty;
    }

    public final boolean B() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isXConfigSnsSpringGlobalEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        boolean A = A(e42.c0.clicfg_sns_cny_global_enable);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isXConfigSnsSpringGlobalEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return A;
    }

    public final boolean C(android.content.Context context, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpFinderLiveUIWithUserName", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsSpringLogic", "jumpFinderLiveUIWithUserName finderUserName:" + str);
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpFinderLiveUIWithUserName", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        ss5.e0 e0Var = (ss5.e0) i95.n0.c(ss5.e0.class);
        android.content.Intent q17 = q();
        kotlin.jvm.internal.o.d(str);
        ((vd2.f1) e0Var).Di(context, q17, str, null, b(), null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpFinderLiveUIWithUserName", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return true;
    }

    public final void F(com.tencent.mm.ui.widget.imageview.WeImageView weImageView, android.widget.TextView textView, android.view.animation.Animation.AnimationListener lastAnimListener, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshSpringLikedView", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        kotlin.jvm.internal.o.g(lastAnimListener, "lastAnimListener");
        if (textView != null) {
            textView.setImportantForAccessibility(2);
            textView.setText(com.tencent.mm.R.string.ok_);
            textView.announceForAccessibility(i65.a.r(textView.getContext(), com.tencent.mm.R.string.f493160ma1));
            textView.setImportantForAccessibility(1);
        }
        if (weImageView == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsSpringLogic", "doSpringLikeAnim: failed");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshSpringLikedView", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return;
        }
        weImageView.setImageDrawable(null);
        weImageView.setEnableColorFilter(false);
        weImageView.setImageDrawable(i65.a.i(weImageView.getContext(), com.tencent.mm.R.drawable.icon_spring_2024_firecracker_filled));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doSpringLikeAnim", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(1.0f, 1.5f, 1.0f, 1.5f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(j17);
        scaleAnimation.setFillAfter(true);
        android.view.animation.AnimationSet animationSet = new android.view.animation.AnimationSet(true);
        animationSet.addAnimation(scaleAnimation);
        android.view.animation.ScaleAnimation scaleAnimation2 = new android.view.animation.ScaleAnimation(1.5f, 1.0f, 1.5f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(100L);
        scaleAnimation2.setFillAfter(true);
        animationSet.setAnimationListener(new xa4.f(weImageView, scaleAnimation2));
        scaleAnimation2.setAnimationListener(lastAnimListener);
        weImageView.clearAnimation();
        weImageView.startAnimation(animationSet);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doSpringLikeAnim", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshSpringLikedView", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
    }

    public final void G(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("saveSnsCrashInfo", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        java.lang.String h17 = com.tencent.mm.app.w.INSTANCE.h();
        if ((h17 != null && r26.n0.B(h17, "SnsTimelineUI", false)) && kotlin.jvm.internal.o.b(f452835i, "sns_spring_mode")) {
            com.tencent.mm.sdk.platformtools.o4 o4Var = f452832f;
            int o17 = o4Var.o("sns_spring_mode", 0) + 1;
            if (o17 >= 3) {
                o4Var.B("sns_spring_ui_crash_time_ms", java.lang.System.currentTimeMillis());
                o4Var.A("sns_spring_mode", 0);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveSnsCrashInfo", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
                return;
            }
            o4Var.A("sns_spring_mode", o17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveSnsCrashInfo", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
    }

    public final java.lang.String J(r45.gd6 gd6Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("springServerConfigToString", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        if (gd6Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("springServerConfigToString", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return "null";
        }
        r45.r86 r86Var = gd6Var.f375144f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SpringServerConfig(Year:");
        sb6.append(gd6Var.f375145g);
        sb6.append(", PostStatus:");
        sb6.append(gd6Var.f375142d);
        sb6.append(", LinkVisible:");
        sb6.append(gd6Var.f375143e);
        sb6.append(",DisableLikeBack:");
        sb6.append(gd6Var.f375147i);
        sb6.append(" ForceFinderUserName:");
        sb6.append(r86Var != null ? r86Var.f384638f : null);
        sb6.append(" ObjId:");
        sb6.append(r86Var != null ? r86Var.f384636d : null);
        sb6.append(" FinderNonceID:");
        sb6.append(r86Var != null ? r86Var.f384637e : null);
        sb6.append(" ForceLiveId:");
        sb6.append(r86Var != null ? r86Var.f384641i : null);
        sb6.append("  JoinLiveMode:");
        sb6.append(gd6Var.f375146h);
        sb6.append(')');
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("springServerConfigToString", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return sb7;
    }

    @Override // com.tencent.mm.app.h4
    public void a(java.lang.Thread crashThread, java.lang.String str, java.lang.Throwable thr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onJavaCrash", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        kotlin.jvm.internal.o.g(crashThread, "crashThread");
        kotlin.jvm.internal.o.g(thr, "thr");
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        java.io.PrintWriter printWriter = new java.io.PrintWriter(stringWriter);
        thr.printStackTrace(printWriter);
        printWriter.close();
        G(str + '\n' + stringWriter);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onJavaCrash", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
    }

    public final r45.wk0 b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildFinderEnterLiveParam", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        java.lang.String Gj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(4, 2, 65);
        r45.wk0 wk0Var = new r45.wk0();
        wk0Var.set(0, Gj);
        wk0Var.set(1, "");
        wk0Var.set(3, -1);
        wk0Var.set(4, -1);
        wk0Var.set(5, 1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildFinderEnterLiveParam", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return wk0Var;
    }

    @Override // com.tencent.mm.app.h4
    public void e(int i17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onNativeCrash", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        G(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNativeCrash", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
    }

    public final boolean g(int i17, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, boolean z17) {
        r45.a90 a90Var;
        r45.fd6 fd6Var;
        r45.a90 a90Var2;
        r45.fd6 fd6Var2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkFinderLiveJumpEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        r45.g92 g92Var = null;
        boolean z18 = false;
        if (i17 == 0) {
            if (timeLineObject != null && (a90Var = timeLineObject.ContentObj) != null && (fd6Var = a90Var.B) != null) {
                g92Var = fd6Var.f374243d;
            }
            if (g92Var == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkFinderLiveJumpEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
                return false;
            }
            if (!android.text.TextUtils.isEmpty(g92Var.getString(1)) && !android.text.TextUtils.isEmpty(g92Var.getString(2)) && !android.text.TextUtils.isEmpty(g92Var.getString(0)) && !android.text.TextUtils.isEmpty(g92Var.getString(12))) {
                z18 = true;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkFinderLiveJumpEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return z18;
        }
        if (i17 == 1) {
            if (timeLineObject != null && (a90Var2 = timeLineObject.ContentObj) != null && (fd6Var2 = a90Var2.B) != null) {
                g92Var = fd6Var2.f374243d;
            }
            if (g92Var == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkFinderLiveJumpEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
                return false;
            }
            boolean z19 = !android.text.TextUtils.isEmpty(g92Var.getString(1));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkFinderLiveJumpEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return z19;
        }
        if (i17 == 2) {
            r45.r86 r86Var = f452833g.f375144f;
            if (r86Var != null && !android.text.TextUtils.isEmpty(r86Var.f384638f) && !android.text.TextUtils.isEmpty(r86Var.f384636d) && !android.text.TextUtils.isEmpty(r86Var.f384637e) && !android.text.TextUtils.isEmpty(r86Var.f384641i)) {
                z18 = true;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkFinderLiveJumpEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return z18;
        }
        if (i17 != 3) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkFinderLiveJumpEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        r45.r86 r86Var2 = f452833g.f375144f;
        if (r86Var2 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkFinderLiveJumpEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        boolean z27 = !android.text.TextUtils.isEmpty(r86Var2.f384638f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkFinderLiveJumpEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return z27;
    }

    public final boolean h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkHadEnterSpringLive", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        boolean z17 = r() != null;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsSpringLogic", "checkHadEnterSpringLive:" + z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkHadEnterSpringLive", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return z17;
    }

    public final boolean j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("configEnableNowShowRedDotForTimeLinePost", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        java.lang.Object d17 = bm5.o1.f22719a.d(new com.tencent.mm.plugin.sns.config.RCSnsSpring2024RedDotVisibility());
        if (kotlin.jvm.internal.o.b(d17, 2)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("configEnableNowShowRedDotForTimeLinePost", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return true;
        }
        if (kotlin.jvm.internal.o.b(d17, 3)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("configEnableNowShowRedDotForTimeLinePost", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        int b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("SnsSpringFestivalPostRedDot", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsSpringLogic", "SnsSpringFestivalPostRedDot: " + b17);
        boolean z17 = b17 == 2025;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("configEnableNowShowRedDotForTimeLinePost", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return z17;
    }

    public final java.lang.String m(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getActionSheetTitle", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.String string = context.getString(com.tencent.mm.R.string.m6r);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        try {
            if (!android.text.TextUtils.isEmpty(f452833g.f375148m)) {
                cl0.g gVar = new cl0.g(f452833g.f375148m);
                java.lang.String d17 = com.tencent.mm.sdk.platformtools.m2.d();
                if (d17 != null) {
                    int hashCode = d17.hashCode();
                    if (hashCode != 115861276) {
                        if (hashCode != 115861428) {
                            if (hashCode == 115861812 && d17.equals("zh_TW")) {
                                java.lang.String o17 = o(gVar, "zh_TW", string);
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActionSheetTitle", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
                                return o17;
                            }
                        } else if (d17.equals("zh_HK")) {
                            java.lang.String o18 = o(gVar, "zh_HK", string);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActionSheetTitle", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
                            return o18;
                        }
                    } else if (d17.equals("zh_CN")) {
                        java.lang.String o19 = o(gVar, "zh_CN", string);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActionSheetTitle", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
                        return o19;
                    }
                }
                java.lang.String o27 = o(gVar, "en", string);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActionSheetTitle", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
                return o27;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsSpringLogic", e17, "getActionSheetTitle error:" + f452833g.f375148m, new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActionSheetTitle", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return string;
    }

    public final int n() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFinderLiveJumpMode", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        int i17 = 0;
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_SPRING_2024_LINK_JUMP_INT_SYNC, 0);
        int i18 = f452833g.f375146h;
        if (r17 == 1) {
            i17 = 2;
        } else if (r17 == 2) {
            i17 = 3;
        } else if (r17 != 3) {
            i17 = r17 != 4 ? i18 : 1;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFinderLiveJumpMode", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return i17;
    }

    public final java.lang.String o(cl0.g gVar, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getJsonValue", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        if (gVar.has(str)) {
            java.lang.String string = gVar.getString(str);
            if (!android.text.TextUtils.isEmpty(string)) {
                kotlin.jvm.internal.o.d(string);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getJsonValue", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
                return string;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getJsonValue", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return str2;
    }

    public final java.lang.String p(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLiveLinkTitle", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.String string = context.getString(com.tencent.mm.R.string.m6t);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        try {
            if (!android.text.TextUtils.isEmpty(f452833g.f375149n)) {
                cl0.g gVar = new cl0.g(f452833g.f375149n);
                java.lang.String d17 = com.tencent.mm.sdk.platformtools.m2.d();
                if (d17 != null) {
                    int hashCode = d17.hashCode();
                    if (hashCode != 115861276) {
                        if (hashCode != 115861428) {
                            if (hashCode == 115861812 && d17.equals("zh_TW")) {
                                java.lang.String o17 = o(gVar, "zh_TW", string);
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLiveLinkTitle", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
                                return o17;
                            }
                        } else if (d17.equals("zh_HK")) {
                            java.lang.String o18 = o(gVar, "zh_HK", string);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLiveLinkTitle", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
                            return o18;
                        }
                    } else if (d17.equals("zh_CN")) {
                        java.lang.String o19 = o(gVar, "zh_CN", string);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLiveLinkTitle", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
                        return o19;
                    }
                }
                java.lang.String o27 = o(gVar, "en", string);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLiveLinkTitle", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
                return o27;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsSpringLogic", e17, "getLiveLinkTitle error:" + f452833g.f375149n, new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLiveLinkTitle", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return string;
    }

    public final android.content.Intent q() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getReportIntent", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        android.content.Intent intent = new android.content.Intent();
        cl0.g gVar = new cl0.g();
        gVar.h("is_temporary", "1");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("is_temporary", "1");
        intent.putExtra("KEY_PARAMS_ENTRANCE_REPORT_INFO", bundle);
        intent.putExtra("key_chnl_extra", gVar.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReportIntent", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return intent;
    }

    public final boolean u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hadShowSpringRedDotForTimeLinePost", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        boolean i17 = f452832f.i("SnsSpring2025_ShowPostRedDot", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsSpringLogic", "hadShowRedDotOnPost: " + i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hadShowSpringRedDotForTimeLinePost", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return i17;
    }

    public final boolean y(com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        r45.fd6 fd6Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFeedSpringVisible", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        if (timeLineObject == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFeedSpringVisible", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        if (!I()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFeedSpringVisible", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isXConfigSnsSpringFeedStyleEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        boolean z17 = B() && A(e42.c0.clicfg_sns_cny_feed_style_enable);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isXConfigSnsSpringFeedStyleEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        if (!z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFeedSpringVisible", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        r45.a90 a90Var = timeLineObject.ContentObj;
        if (a90Var == null || (fd6Var = a90Var.B) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFeedSpringVisible", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        boolean i17 = i(java.lang.Integer.valueOf(fd6Var.f374245f));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFeedSpringVisible", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return i17;
    }

    public final boolean z() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isMsgBlessOpen", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_SPRING_2024_STYLE_BLESS_INT_SYNC, -1);
        boolean z17 = false;
        if (r17 == 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isMsgBlessOpen", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        if (r17 == 2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isMsgBlessOpen", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isXConfigSnsSpringBlessEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        boolean z18 = B() && A(e42.c0.clicfg_sns_cny_bless_enable);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isXConfigSnsSpringBlessEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        if (!z18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsSpringLogic", "x config not support");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isMsgBlessOpen", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        if (f452833g.f375147i != 1 && I()) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isMsgBlessOpen", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return z17;
    }
}

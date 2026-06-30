package oh5;

/* loaded from: classes12.dex */
public final class o extends oh5.d {

    /* renamed from: d, reason: collision with root package name */
    public static final oh5.o f345511d = new oh5.o();

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f345512e;

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f345513f;

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f345514g;

    /* renamed from: h, reason: collision with root package name */
    public static final oh5.q[] f345515h;

    static {
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("MatrixResPluginManualDump");
        f345512e = M;
        f345513f = jz5.h.b(oh5.n.f345510d);
        java.lang.String t17 = M.t("build_rev");
        if (!kotlin.jvm.internal.o.b(com.tencent.mm.sdk.platformtools.z.f193109e, t17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MatrixResPluginManualDu", "revision changed: " + t17 + " -> " + com.tencent.mm.sdk.platformtools.z.f193109e);
            M.D("build_rev", com.tencent.mm.sdk.platformtools.z.f193109e);
            com.tencent.mars.xlog.Log.i("MicroMsg.MatrixResPluginManualDu", "reset");
            M.d();
        }
        f345514g = jz5.h.b(oh5.m.f345509d);
        f345515h = new oh5.q[]{oh5.r.b("MiuiDecorCaptionView"), oh5.r.b("InputMethodManager"), oh5.r.b("mCastProjectionCallbacks"), oh5.r.b("OppoGestureAreaDetection"), oh5.r.b("com.huawei.android.hwaps.EventAnalyzed"), oh5.r.b("android.view.WindowManagerGlobal"), oh5.r.b("android.view.accessibility.AccessibilityManager"), oh5.r.b("com.android.internal.widget.FtMainPanelLayout"), oh5.r.b("Longshot"), oh5.r.b("com.huawei.imax.intercept.cfg.WebViewDumperCfg"), oh5.r.b("com.huawei.contentsensor.agent.ContentSensorManager"), oh5.r.b("com.huawei.imax.intercept.dumper.WeChatDumper"), oh5.r.b("com.huawei.imax.intercept.ContentInterceptor"), oh5.r.b("MiuiPhoneWindow"), oh5.r.b("com.huawei.uifirst.smartslide.HighFreqSmartSlideModel"), oh5.r.b("com.mediatek.boostfwk.identify.scroll.ScrollIdentify"), oh5.r.b("com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin"), oh5.r.b("ActivityClientRecord"), oh5.r.b("Oplus"), oh5.r.b("HwViewRootImpl$ViewGestureListener"), oh5.r.b("ViewPostImeInputStage"), oh5.r.b("DisplayManagerGlobal")};
    }

    @Override // oh5.d
    public java.lang.String c() {
        return com.tencent.mm.ui.matrix.ManualDumpActivity.class.getName();
    }

    public final void d(java.lang.String activityName, java.lang.String refKey, java.lang.String hprofPath, java.lang.String refChain) {
        boolean z17;
        android.app.Notification.Builder builder;
        java.lang.String str;
        kotlin.jvm.internal.o.g(activityName, "activityName");
        kotlin.jvm.internal.o.g(refKey, "refKey");
        kotlin.jvm.internal.o.g(hprofPath, "hprofPath");
        kotlin.jvm.internal.o.g(refChain, "refChain");
        if (android.text.TextUtils.isEmpty(refChain)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MatrixResPluginManualDu", "refChain is empty");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        oh5.q[] qVarArr = f345515h;
        int length = qVarArr.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                break;
            }
            oh5.q qVar = qVarArr[i17];
            if (java.lang.System.currentTimeMillis() < qVar.f345519b) {
                arrayList.add(qVar);
            }
            i17++;
        }
        if (!arrayList.isEmpty()) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (r26.n0.D(refChain, (java.lang.CharSequence) ((oh5.q) it.next()).f345518a, false, 2, null)) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        if (z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MatrixResPluginManualDu", "match white list, skip show Activity");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, activityName);
        intent.putExtra("ref_key", refKey);
        intent.putExtra("leak_process", bm5.f1.a());
        intent.putExtra("hprof_path", hprofPath);
        intent.putExtra("leak_detail", refChain);
        boolean a17 = z65.c.a();
        oh5.o oVar = f345511d;
        if (a17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("leak activity: ");
            sb6.append(activityName);
            sb6.append("\nhprof path: ");
            sb6.append(hprofPath);
            sb6.append("\nleak reference: ");
            sb6.append(r26.i0.t(refChain, ";", "\n", false));
            sb6.append("\n");
            oVar.getClass();
            java.lang.String format = ((java.text.SimpleDateFormat) ((jz5.n) f345514g).getValue()).format(java.util.Calendar.getInstance().getTime());
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.sdk.platformtools.x2.f193071a.getExternalCacheDir(), "leak_" + activityName + '_' + format + ".txt");
            java.lang.String o17 = r6Var.o();
            java.lang.String sb7 = sb6.toString();
            kotlin.jvm.internal.o.f(sb7, "toString(...)");
            byte[] bytes = sb7.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            com.tencent.mm.vfs.w6.S(o17, bytes, 0, bytes.length);
            com.tencent.mars.xlog.Log.i("MicroMsg.MatrixResPluginManualDu", "write leak info to file " + r6Var.n());
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mm.sdk.platformtools.o4 o4Var = f345512e;
        long q17 = o4Var.q(activityName, 0L);
        if (q17 < 0) {
            if (java.lang.System.currentTimeMillis() - (-q17) > java.util.concurrent.TimeUnit.DAYS.toMillis(1L)) {
                q17 = 0;
            }
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("leaking ");
        sb8.append(activityName);
        sb8.append(" occurred ");
        long j17 = 1 + q17;
        sb8.append(j17);
        sb8.append(" times");
        com.tencent.mars.xlog.Log.i("MicroMsg.MatrixResPluginManualDu", sb8.toString());
        o4Var.B(activityName, j17);
        if (q17 == 0) {
            oVar.b(intent);
            return;
        }
        if (q17 > 0) {
            intent.putExtra("issue_tapd", true);
            oVar.b(intent);
            return;
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        intent.setClassName(context, oVar.c());
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        int i18 = android.os.Build.VERSION.SDK_INT;
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(context2, 0, intent, i18 >= 31 ? 201326592 : 134217728);
        java.lang.String concat = r26.n0.o0(activityName, '.', activityName).concat(" 泄漏，请注意 ⚠️");
        if (i18 >= 26) {
            kotlin.jvm.internal.o.d(context);
            if (i18 >= 26) {
                java.lang.Object systemService = context.getSystemService("notification");
                kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                android.app.NotificationManager notificationManager = (android.app.NotificationManager) systemService;
                if (notificationManager.getNotificationChannel("com.tencent.matrix.resource.processor.ManualDumpProcessor") == null) {
                    oj.j.e("MicroMsg.MatrixResPluginManualDu", "create channel", new java.lang.Object[0]);
                    notificationManager.createNotificationChannel(new android.app.NotificationChannel("com.tencent.matrix.resource.processor.ManualDumpProcessor", "com.tencent.matrix.resource.processor.ManualDumpProcessor", 4));
                }
                str = "com.tencent.matrix.resource.processor.ManualDumpProcessor";
            } else {
                str = null;
            }
            builder = new android.app.Notification.Builder(context, str);
        } else {
            builder = new android.app.Notification.Builder(context);
        }
        builder.setContentTitle(concat).setPriority(0).setStyle(new android.app.Notification.BigTextStyle().bigText("点击查看详情")).setAutoCancel(true).setContentIntent(activity).setSmallIcon(com.tencent.mm.R.drawable.f481880ah2).setWhen(java.lang.System.currentTimeMillis());
        android.app.Notification build = builder.build();
        kotlin.jvm.internal.o.f(build, "build(...)");
        ((android.app.NotificationManager) ((jz5.n) f345513f).getValue()).notify(activityName.hashCode() + 272, build);
    }
}

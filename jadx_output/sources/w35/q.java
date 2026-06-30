package w35;

/* loaded from: classes8.dex */
public final class q extends w35.b {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f442760e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f442761f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f442762g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.pluginsdk.model.g2 params, w35.a aVar) {
        super(params, aVar);
        kotlin.jvm.internal.o.g(params, "params");
        this.f442760e = "MicroMsg.OpenWayControllerLocalApp";
        com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
        com.tencent.mm.vfs.r6 h07 = lp0.b.h0("share_file_temp");
        this.f442762g = "";
        h07.l();
        h07.J();
        if (kz5.c0.i(3, 1, 2, 4).contains(java.lang.Integer.valueOf(params.f189315h))) {
            java.lang.String n17 = com.tencent.mm.vfs.w6.n(this.f442726d);
            if (n17 == null || n17.length() == 0) {
                java.lang.String str = params.f189311d;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    int i17 = params.f189315h;
                    if (i17 == 1) {
                        str = "jpg";
                    } else if (i17 == 2) {
                        str = "mp4";
                    }
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.String str2 = this.f442726d;
                com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str2 != null ? str2 : "");
                java.lang.String str3 = a17.f213279f;
                if (str3 != null) {
                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
                    if (!str3.equals(l17)) {
                        a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                    }
                }
                java.lang.String str4 = a17.f213279f;
                int lastIndexOf = str4.lastIndexOf("/");
                sb6.append(lastIndexOf >= 0 ? str4.substring(lastIndexOf + 1) : str4);
                sb6.append('.');
                sb6.append(str);
                java.lang.String o17 = new com.tencent.mm.vfs.r6(h07, sb6.toString()).o();
                kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
                this.f442762g = o17;
                return;
            }
        }
        this.f442761f = true;
    }

    @Override // w35.b
    public void a() {
        java.lang.Iterable<java.lang.String> appList;
        android.graphics.drawable.Drawable drawable;
        java.lang.Object m521constructorimpl;
        java.lang.CharSequence loadLabel;
        w35.a aVar = this.f442724b;
        if (aVar != null) {
            com.tencent.mm.pluginsdk.ui.otherway.h0 h0Var = com.tencent.mm.pluginsdk.ui.otherway.h0.f190945a;
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            java.lang.String str = this.f442723a.f189310c;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String str2 = this.f442725c;
            if (!(str2 == null || str2.length() == 0)) {
                com.tencent.mm.sdk.platformtools.o4 N = com.tencent.mm.sdk.platformtools.o4.N("recent_use_app_mmkv", 2, null);
                if (N == null) {
                    appList = kz5.p0.f313996d;
                } else {
                    r45.j56 j56Var = new r45.j56();
                    byte[] j17 = N.j("shortcut:" + str2);
                    if (j17 != null) {
                        j56Var.parseFrom(j17);
                    }
                    appList = j56Var.f377596d;
                    kotlin.jvm.internal.o.f(appList, "appList");
                }
                android.content.pm.PackageManager packageManager = context.getPackageManager();
                java.lang.String str3 = this.f442726d;
                android.content.Intent e17 = h0Var.e(context, str2, str3, str);
                android.content.Intent c17 = h0Var.c(context, str2, str3, str);
                for (java.lang.String str4 : appList) {
                    if (r26.n0.D(str4, ".", false, 2, null)) {
                        try {
                            android.content.pm.PackageInfo packageInfo = packageManager.getPackageInfo(str4, 0);
                            if (packageInfo != null) {
                                com.tencent.mm.pluginsdk.ui.otherway.w wVar = new com.tencent.mm.pluginsdk.ui.otherway.w();
                                com.tencent.mm.pluginsdk.ui.otherway.x xVar = new com.tencent.mm.pluginsdk.ui.otherway.x();
                                android.content.pm.ResolveInfo resolveInfo = new android.content.pm.ResolveInfo();
                                android.content.pm.ActivityInfo activityInfo = new android.content.pm.ActivityInfo();
                                activityInfo.packageName = str4;
                                resolveInfo.activityInfo = activityInfo;
                                xVar.f191028d = resolveInfo;
                                android.content.pm.ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                                xVar.f191029e = (applicationInfo == null || (loadLabel = applicationInfo.loadLabel(packageManager)) == null) ? null : loadLabel.toString();
                                if (packageInfo.applicationInfo != null) {
                                    try {
                                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                                        android.graphics.drawable.Drawable applicationLogo = packageManager.getApplicationLogo(str4);
                                        if (applicationLogo == null) {
                                            android.content.pm.ApplicationInfo applicationInfo2 = packageInfo.applicationInfo;
                                            applicationLogo = applicationInfo2 != null ? applicationInfo2.loadIcon(packageManager) : null;
                                        }
                                        m521constructorimpl = kotlin.Result.m521constructorimpl(applicationLogo);
                                    } catch (java.lang.Throwable th6) {
                                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                                        m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                                    }
                                    if (kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl) != null) {
                                        android.content.pm.ApplicationInfo applicationInfo3 = packageInfo.applicationInfo;
                                        m521constructorimpl = applicationInfo3 != null ? applicationInfo3.loadIcon(packageManager) : null;
                                    }
                                    drawable = (android.graphics.drawable.Drawable) m521constructorimpl;
                                } else {
                                    drawable = null;
                                }
                                xVar.f191030f = drawable;
                                xVar.f191036o = e17;
                                xVar.f191037p = c17;
                                wVar.f191014d = xVar;
                                arrayList.add(wVar);
                            }
                        } catch (java.lang.Exception e18) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.OpenByOtherAppHelper", "getShortCutAppList: " + e18);
                        }
                    }
                }
            }
            aVar.a(arrayList);
        }
    }

    @Override // w35.b
    public void b(android.content.Context context, com.tencent.mm.pluginsdk.ui.otherway.w info) {
        com.tencent.mm.pluginsdk.model.k0 k0Var;
        android.content.pm.ResolveInfo resolveInfo;
        android.content.pm.ActivityInfo activityInfo;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mm.pluginsdk.ui.otherway.x xVar = info.f191014d;
        java.lang.String str = (xVar == null || (resolveInfo = xVar.f191028d) == null || (activityInfo = resolveInfo.activityInfo) == null) ? null : activityInfo.packageName;
        if (str == null) {
            str = "";
        }
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
        com.tencent.mm.pluginsdk.ui.otherway.x xVar2 = info.f191014d;
        u1Var.g(context.getString(com.tencent.mm.R.string.g_7, xVar2 != null ? xVar2.f191029e : null));
        u1Var.a(true);
        u1Var.m(com.tencent.mm.R.string.f490002i4);
        u1Var.l(new w35.m(this, context, info, str));
        u1Var.i(new w35.n(this, info));
        u1Var.q(false);
        com.tencent.mm.pluginsdk.model.p3 p3Var = this.f442723a.f189319l;
        if (p3Var == null || (k0Var = p3Var.f189406c) == null) {
            return;
        }
        ((kb0.f) k0Var).b(info);
    }

    public final boolean c(android.content.Context context, android.content.Intent intent) {
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            return ((ht.a) ((jt.v) i95.n0.c(jt.v.class))).Ni(context, intent);
        }
        com.tencent.mars.xlog.Log.e(this.f442760e, "no resolveActivity, action: " + intent.getAction() + ", package: " + intent.getPackage() + " filePath: " + this.f442726d);
        return false;
    }
}

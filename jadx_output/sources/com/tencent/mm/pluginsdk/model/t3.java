package com.tencent.mm.pluginsdk.model;

/* loaded from: classes8.dex */
public class t3 extends com.tencent.mm.pluginsdk.model.y3 implements jt.y {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String[] f189442a = {"application/msword", "application/vnd.ms-powerpoint", "application/vnd.ms-excel", "application/pdf", "application/epub+zip", "text/plain", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", "application/vnd.openxmlformats-officedocument.presentationml.presentation", "application/zip", "application/rar", "*/ofd"};

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f189443b = java.util.Arrays.asList("application/pdf", "application/msword", "application/vnd.ms-powerpoint", "application/vnd.ms-excel", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", "application/vnd.openxmlformats-officedocument.presentationml.presentation");

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f189444c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f189445d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f189446e;

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f189447f;

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f189448g;

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f189449h;

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f189450i;

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f189451j;

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f189452k;

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f189453l;

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f189454m;

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f189455n;

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add("application/pdf");
        hashSet.add("application/msword");
        hashSet.add("application/vnd.openxmlformats-officedocument.wordprocessingml.document");
        hashSet.add("application/vnd.ms-excel");
        hashSet.add("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        hashSet.add("application/vnd.ms-powerpoint");
        hashSet.add("application/vnd.openxmlformats-officedocument.presentationml.presentation");
        java.util.HashSet hashSet2 = new java.util.HashSet();
        f189444c = hashSet2;
        hashSet2.add("application/pdf");
        hashSet2.add("application/msword");
        hashSet2.add("application/vnd.openxmlformats-officedocument.wordprocessingml.document");
        hashSet2.add("application/vnd.ms-excel");
        hashSet2.add("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        hashSet2.add("application/vnd.ms-powerpoint");
        hashSet2.add("application/vnd.openxmlformats-officedocument.presentationml.presentation");
        hashSet2.add(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_MPEG);
        hashSet2.add("text/plain");
        java.util.HashMap hashMap = new java.util.HashMap();
        f189445d = hashMap;
        hashMap.put("FROM_SCENE_BOTTOM_BAR", 10210);
        hashMap.put("FROM_SCENE_HALF_DIALOG", 10251);
        hashMap.put("FROM_SCENE_OPEN_NO_OFFICE_FILE", 10261);
        hashMap.put("OTHER_APP_OPEN", 10254);
        hashMap.put("SEARCH_IN_FILE", 10253);
        hashMap.put("FROM_SCENE_OPEN_BY_QB", 10269);
        hashMap.put("FROM_SCENE_OPEN_FILE_NO_SUPPORT_DOWNLOAD_UI", 10270);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        f189446e = hashMap2;
        hashMap2.put("FROM_SCENE_BOTTOM_BAR", "https://upage.imtt.qq.com/m_imtt/download-middle-page/plugin/20220318/wechat_plugin.html?channel=1100124136");
        hashMap2.put("FROM_SCENE_HALF_DIALOG", "https://upage.imtt.qq.com/m_imtt/download-middle-page/plugin/20220318/wechat_plugin.html?channel=1100124150");
        hashMap2.put("FROM_SCENE_OPEN_NO_OFFICE_FILE", "https://upage.imtt.qq.com/m_imtt/download-middle-page/plugin/20220318/wechat_plugin.html?channel=1100124190");
        f189447f = new int[]{com.tencent.mm.R.raw.word_default, com.tencent.mm.R.raw.ppt_default, com.tencent.mm.R.raw.excel_default, com.tencent.mm.R.raw.pdf_default, com.tencent.mm.R.raw.epub_default, com.tencent.mm.R.raw.txt_default_light, com.tencent.mm.R.raw.word_default, com.tencent.mm.R.raw.excel_default, com.tencent.mm.R.raw.ppt_default, com.tencent.mm.R.raw.zip_default, com.tencent.mm.R.raw.zip_default, com.tencent.mm.R.raw.ofd_default};
        f189448g = new int[]{com.tencent.mm.R.raw.word_unfinished, com.tencent.mm.R.raw.ppt_unfinished, com.tencent.mm.R.raw.excel_unfinished, com.tencent.mm.R.raw.pdf_unfinished, com.tencent.mm.R.raw.epub_unfinished, com.tencent.mm.R.raw.txt_unfinished_light, com.tencent.mm.R.raw.word_unfinished, com.tencent.mm.R.raw.excel_unfinished, com.tencent.mm.R.raw.ppt_unfinished, com.tencent.mm.R.raw.zip_unfinished, com.tencent.mm.R.raw.zip_unfinished, com.tencent.mm.R.raw.ofd_unfinished};
        f189449h = new int[]{com.tencent.mm.R.raw.word_unfinished, com.tencent.mm.R.raw.ppt_unfinished, com.tencent.mm.R.raw.excel_unfinished, com.tencent.mm.R.raw.pdf_unfinished, com.tencent.mm.R.raw.epub_unfinished, com.tencent.mm.R.raw.txt_unfinished_dark, com.tencent.mm.R.raw.word_unfinished, com.tencent.mm.R.raw.excel_unfinished, com.tencent.mm.R.raw.ppt_unfinished, com.tencent.mm.R.raw.zip_unfinished, com.tencent.mm.R.raw.zip_unfinished, com.tencent.mm.R.raw.ofd_unfinished};
        f189450i = new int[]{com.tencent.mm.R.raw.word_expired, com.tencent.mm.R.raw.ppt_expired, com.tencent.mm.R.raw.excel_expired, com.tencent.mm.R.raw.pdf_expired, com.tencent.mm.R.raw.epub_expired, com.tencent.mm.R.raw.txt_expired_light, com.tencent.mm.R.raw.word_expired, com.tencent.mm.R.raw.excel_expired, com.tencent.mm.R.raw.ppt_expired, com.tencent.mm.R.raw.zip_expired, com.tencent.mm.R.raw.zip_expired, com.tencent.mm.R.raw.ofd_expired};
        f189451j = new int[]{com.tencent.mm.R.raw.word_expired_dark, com.tencent.mm.R.raw.ppt_expired_dark, com.tencent.mm.R.raw.excel_expired_dark, com.tencent.mm.R.raw.pdf_expired_dark, com.tencent.mm.R.raw.epub_expired_dark, com.tencent.mm.R.raw.txt_expired_dark, com.tencent.mm.R.raw.word_expired_dark, com.tencent.mm.R.raw.excel_expired_dark, com.tencent.mm.R.raw.ppt_expired_dark, com.tencent.mm.R.raw.zip_expired_dark, com.tencent.mm.R.raw.zip_expired_dark, com.tencent.mm.R.raw.ofd_expired_dark};
        f189452k = new int[]{com.tencent.mm.R.raw.word_default, com.tencent.mm.R.raw.ppt_default, com.tencent.mm.R.raw.excel_default, com.tencent.mm.R.raw.pdf_default, com.tencent.mm.R.raw.epub_default, com.tencent.mm.R.raw.txt_default_light, com.tencent.mm.R.raw.word_default, com.tencent.mm.R.raw.excel_default, com.tencent.mm.R.raw.ppt_default, com.tencent.mm.R.raw.zip_default, com.tencent.mm.R.raw.zip_default, com.tencent.mm.R.raw.ofd_default};
        f189453l = new int[]{com.tencent.mm.R.raw.word_default, com.tencent.mm.R.raw.ppt_default, com.tencent.mm.R.raw.excel_default, com.tencent.mm.R.raw.pdf_default, com.tencent.mm.R.raw.epub_default, com.tencent.mm.R.raw.txt_default_dark, com.tencent.mm.R.raw.word_default, com.tencent.mm.R.raw.excel_default, com.tencent.mm.R.raw.ppt_default, com.tencent.mm.R.raw.zip_default, com.tencent.mm.R.raw.zip_default, com.tencent.mm.R.raw.ofd_default};
        f189454m = new int[]{com.tencent.mm.R.raw.word_nologo, com.tencent.mm.R.raw.ppt_nologo, com.tencent.mm.R.raw.excel_nologo, com.tencent.mm.R.raw.pdf_nologo, com.tencent.mm.R.raw.epub_nologo, com.tencent.mm.R.raw.nologo_light, com.tencent.mm.R.raw.word_nologo, com.tencent.mm.R.raw.excel_nologo, com.tencent.mm.R.raw.ppt_nologo, com.tencent.mm.R.raw.zip_nologo, com.tencent.mm.R.raw.zip_nologo, com.tencent.mm.R.raw.ofd_nologo};
        f189455n = new int[]{com.tencent.mm.R.raw.word_nologo, com.tencent.mm.R.raw.ppt_nologo, com.tencent.mm.R.raw.excel_nologo, com.tencent.mm.R.raw.pdf_nologo, com.tencent.mm.R.raw.epub_nologo, com.tencent.mm.R.raw.nologo_dark, com.tencent.mm.R.raw.word_nologo, com.tencent.mm.R.raw.excel_nologo, com.tencent.mm.R.raw.ppt_nologo, com.tencent.mm.R.raw.zip_nologo, com.tencent.mm.R.raw.zip_nologo, com.tencent.mm.R.raw.ofd_nologo};
    }

    public static com.tencent.mm.pluginsdk.model.w3 j(android.content.Context context, android.net.Uri uri) {
        android.content.Intent intent = new android.content.Intent("com.tencent.QQBrowser.action.VIEW");
        intent.setData(uri);
        java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (queryIntentActivities.size() <= 0) {
            return null;
        }
        com.tencent.mm.pluginsdk.model.w3 w3Var = new com.tencent.mm.pluginsdk.model.w3(null);
        for (android.content.pm.ResolveInfo resolveInfo : queryIntentActivities) {
            java.lang.String str = resolveInfo.activityInfo.packageName;
            if (str.contains("com.tencent.mtt")) {
                android.content.pm.ActivityInfo activityInfo = resolveInfo.activityInfo;
                w3Var.f189493a = activityInfo.name;
                w3Var.f189494b = activityInfo.packageName;
                return w3Var;
            }
            if (str.contains("com.tencent.qbx")) {
                android.content.pm.ActivityInfo activityInfo2 = resolveInfo.activityInfo;
                w3Var.f189493a = activityInfo2.name;
                w3Var.f189494b = activityInfo2.packageName;
            }
        }
        return w3Var;
    }

    public static boolean k(java.lang.String str, java.lang.String str2) {
        return (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2) || (!l(str) && !((java.util.HashSet) f189444c).contains(str2))) ? false : true;
    }

    public static boolean l(java.lang.String str) {
        uh0.r rVar = (uh0.r) i95.n0.c(uh0.r.class);
        if (rVar == null) {
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        ((th0.u) rVar).getClass();
        boolean z17 = com.tencent.xweb.n.h(str, true, intent) == com.tencent.xweb.k.XWEB;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fileCanOpenByXWeb fileExt = ");
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append(", ret = ");
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.QQBrowserHelper", sb6.toString());
        return z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0091 A[Catch: Exception -> 0x00ae, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x00ae, blocks: (B:3:0x000d, B:6:0x0014, B:8:0x001e, B:10:0x0025, B:15:0x0041, B:17:0x004e, B:22:0x005c, B:19:0x0091), top: B:2:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.tencent.mm.pluginsdk.model.v3 m(android.content.Context r11) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "\\."
            java.lang.String r2 = "com.tencent.mtt"
            java.lang.String r3 = "ADRQB_"
            com.tencent.mm.pluginsdk.model.v3 r4 = new com.tencent.mm.pluginsdk.model.v3
            r4.<init>()
            android.content.pm.PackageManager r5 = r11.getPackageManager()     // Catch: java.lang.Exception -> Lae
            r6 = 2
            r7 = 0
            r8 = 0
            android.content.pm.PackageInfo r8 = r5.getPackageInfo(r2, r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41 java.lang.Exception -> Lae
            r4.f189483a = r6     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41 java.lang.Exception -> Lae
            r4.f189485c = r3     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41 java.lang.Exception -> Lae
            if (r8 == 0) goto L41
            int r9 = r8.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41 java.lang.Exception -> Lae
            r10 = 420000(0x668a0, float:5.88545E-40)
            if (r9 <= r10) goto L41
            r4.f189484b = r9     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41 java.lang.Exception -> Lae
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41 java.lang.Exception -> Lae
            r9.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41 java.lang.Exception -> Lae
            java.lang.String r10 = r4.f189485c     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41 java.lang.Exception -> Lae
            r9.append(r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41 java.lang.Exception -> Lae
            java.lang.String r10 = r8.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41 java.lang.Exception -> Lae
            java.lang.String r10 = r10.replaceAll(r1, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41 java.lang.Exception -> Lae
            r9.append(r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41 java.lang.Exception -> Lae
            java.lang.String r9 = r9.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41 java.lang.Exception -> Lae
            r4.f189485c = r9     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41 java.lang.Exception -> Lae
            return r4
        L41:
            java.lang.String r9 = "com.tencent.qbx"
            android.content.pm.PackageInfo r8 = r5.getPackageInfo(r9, r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e java.lang.Exception -> Lae
            r4.f189483a = r7     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e java.lang.Exception -> Lae
            java.lang.String r9 = "ADRQBX_"
            r4.f189485c = r9     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e java.lang.Exception -> Lae
            goto L8f
        L4e:
            java.lang.String r9 = "com.tencent.qbx5"
            android.content.pm.PackageInfo r8 = r5.getPackageInfo(r9, r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5c java.lang.Exception -> Lae
            r9 = 1
            r4.f189483a = r9     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5c java.lang.Exception -> Lae
            java.lang.String r9 = "ADRQBX5_"
            r4.f189485c = r9     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5c java.lang.Exception -> Lae
            goto L8f
        L5c:
            android.content.pm.PackageInfo r8 = r5.getPackageInfo(r2, r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L65 java.lang.Exception -> Lae
            r4.f189483a = r6     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L65 java.lang.Exception -> Lae
            r4.f189485c = r3     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L65 java.lang.Exception -> Lae
            goto L8f
        L65:
            java.lang.String r2 = "com.tencent.mtt.x86"
            android.content.pm.PackageInfo r8 = r5.getPackageInfo(r2, r7)     // Catch: java.lang.Exception -> L70
            r4.f189483a = r6     // Catch: java.lang.Exception -> L70
            r4.f189485c = r3     // Catch: java.lang.Exception -> L70
            goto L8f
        L70:
            java.lang.String r2 = "http://appchannel.html5.qq.com/directdown?app=qqbrowser&channel=10375"
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.Exception -> L8f
            com.tencent.mm.pluginsdk.model.w3 r11 = j(r11, r2)     // Catch: java.lang.Exception -> L8f
            if (r11 == 0) goto L8f
            java.lang.String r2 = r11.f189494b     // Catch: java.lang.Exception -> L8f
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L8f
            if (r2 != 0) goto L8f
            java.lang.String r11 = r11.f189494b     // Catch: java.lang.Exception -> L8f
            android.content.pm.PackageInfo r11 = r5.getPackageInfo(r11, r7)     // Catch: java.lang.Exception -> L8f
            r4.f189483a = r6     // Catch: java.lang.Exception -> L8e
            r4.f189485c = r3     // Catch: java.lang.Exception -> L8e
        L8e:
            r8 = r11
        L8f:
            if (r8 == 0) goto Lae
            int r11 = r8.versionCode     // Catch: java.lang.Exception -> Lae
            r4.f189484b = r11     // Catch: java.lang.Exception -> Lae
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lae
            r11.<init>()     // Catch: java.lang.Exception -> Lae
            java.lang.String r2 = r4.f189485c     // Catch: java.lang.Exception -> Lae
            r11.append(r2)     // Catch: java.lang.Exception -> Lae
            java.lang.String r2 = r8.versionName     // Catch: java.lang.Exception -> Lae
            java.lang.String r0 = r2.replaceAll(r1, r0)     // Catch: java.lang.Exception -> Lae
            r11.append(r0)     // Catch: java.lang.Exception -> Lae
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Exception -> Lae
            r4.f189485c = r11     // Catch: java.lang.Exception -> Lae
        Lae:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.model.t3.m(android.content.Context):com.tencent.mm.pluginsdk.model.v3");
    }

    public static int n(java.lang.String str, boolean z17) {
        java.lang.String p17 = p(str);
        int i17 = -1;
        for (int i18 = 0; i18 < 12; i18++) {
            if (f189442a[i18].equals(p17)) {
                i17 = i18;
            }
        }
        return i17 != -1 ? z17 ? f189452k[i17] : f189447f[i17] : com.tencent.mm.R.raw.unknown_default_light;
    }

    public static int o(java.lang.String str) {
        if (!com.tencent.mm.ui.bk.C()) {
            return n(str, false);
        }
        java.lang.String p17 = p(str);
        int i17 = -1;
        for (int i18 = 0; i18 < 12; i18++) {
            if (f189442a[i18].equals(p17)) {
                i17 = i18;
            }
        }
        return i17 != -1 ? f189453l[i17] : com.tencent.mm.R.raw.unknown_default_dark;
    }

    public static java.lang.String p(java.lang.String str) {
        java.lang.String mimeTypeFromExtension = (str == null || str.length() <= 0) ? null : android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
        if (mimeTypeFromExtension != null && mimeTypeFromExtension.length() != 0) {
            return mimeTypeFromExtension;
        }
        return "*/" + str;
    }

    public static boolean q(android.content.Context context) {
        return m(context).f189483a != -1;
    }

    public static void r(final android.content.Context context, final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, java.lang.String str5, final java.lang.String str6) {
        final int i17;
        java.lang.Integer num;
        final jt.z zVar = null;
        java.lang.String f17 = com.tencent.mm.pluginsdk.model.z3.a().b(0, null).f();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
            i17 = 0;
        } else {
            java.util.HashMap hashMap = (java.util.HashMap) f189446e;
            if (hashMap.containsKey(str5)) {
                f17 = (java.lang.String) hashMap.get(str5);
            }
            java.util.HashMap hashMap2 = (java.util.HashMap) f189445d;
            int intValue = (!hashMap2.containsKey(str5) || (num = (java.lang.Integer) hashMap2.get(str5)) == null) ? 0 : num.intValue();
            com.tencent.mars.xlog.Log.i("MicroMsg.QQBrowserHelper", "launchOrInstallQQBrowser: %s,%s,%s", str5, java.lang.Integer.valueOf(intValue), f17);
            i17 = intValue;
        }
        if (!q(context)) {
            java.lang.String postId = java.lang.String.valueOf(i17);
            kotlin.jvm.internal.o.g(postId, "postId");
            uk0.a.c(new com.tencent.mm.ipcinvoker.type.IPCString(postId), com.tencent.mm.pluginsdk.model.s3.f189434d, null, 4, null);
            gw4.f fVar = new gw4.f(context);
            fVar.f276157b = "mmdownloadapp_teNYsTpJ8ofO09hqmb";
            ((fw4.l) ((gw4.g) i95.n0.c(gw4.g.class))).wi(fVar, null);
            return;
        }
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
        u1Var.g(context.getString(com.tencent.mm.R.string.g_7, context.getString(com.tencent.mm.R.string.lc9)));
        u1Var.a(true);
        u1Var.m(com.tencent.mm.R.string.f490002i4);
        final jt.z zVar2 = null;
        u1Var.l(new com.tencent.mm.ui.widget.dialog.w1(str, str2, str3, zVar2, str4, str6, context, i17) { // from class: com.tencent.mm.pluginsdk.model.t3$$a

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ java.lang.String f189456a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ java.lang.String f189457b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ java.lang.String f189458c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ java.lang.String f189459d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ java.lang.String f189460e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ android.content.Context f189461f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ int f189462g;

            {
                this.f189459d = str4;
                this.f189460e = str6;
                this.f189461f = context;
                this.f189462g = i17;
            }

            @Override // com.tencent.mm.ui.widget.dialog.w1
            public final void a(boolean z17, java.lang.String str7) {
                java.lang.String str8 = this.f189458c;
                java.lang.String str9 = this.f189459d;
                java.lang.String str10 = this.f189460e;
                android.content.Context context2 = this.f189461f;
                if (z17) {
                    java.lang.String str11 = this.f189456a;
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str11)) {
                        java.lang.String str12 = this.f189457b;
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(str12) && !com.tencent.mm.sdk.platformtools.t8.K0(str8)) {
                            com.tencent.mm.pluginsdk.model.r3.b(str9, str8, str10, 152L, context2);
                            com.tencent.mm.pluginsdk.ui.otherway.i0.f190963a.a("com.tencent.mtt", com.tencent.mm.pluginsdk.ui.tools.f.e(str8));
                            android.content.Intent c17 = com.tencent.mm.pluginsdk.ui.tools.f.c(context2, com.tencent.mm.pluginsdk.ui.tools.f.e(str8), str11, str12, this.f189462g);
                            if (com.tencent.mm.sdk.platformtools.t8.I0(context2, c17, false, false)) {
                                android.content.Context context3 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                arrayList.add(c17);
                                java.util.Collections.reverse(arrayList);
                                yj0.a.d(context3, arrayList.toArray(), "com/tencent/mm/pluginsdk/model/QQBrowserHelper", "lambda$launchOrInstallQQBrowser$0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/feature/appchooser/api/IQQBrowserHelperService$OnDismissListener;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;IZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                context3.startActivity((android.content.Intent) arrayList.get(0));
                                yj0.a.f(context3, "com/tencent/mm/pluginsdk/model/QQBrowserHelper", "lambda$launchOrInstallQQBrowser$0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/feature/appchooser/api/IQQBrowserHelperService$OnDismissListener;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;IZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                return;
                            }
                            return;
                        }
                    }
                    com.tencent.mars.xlog.Log.e("MicroMsg.QQBrowserHelper", "launchOrInstallQQBrowser: fail by NPE");
                }
            }
        });
        u1Var.i(new com.tencent.mm.ui.widget.dialog.w1() { // from class: com.tencent.mm.pluginsdk.model.t3$$b
            @Override // com.tencent.mm.ui.widget.dialog.w1
            public final void a(boolean z17, java.lang.String str7) {
                com.tencent.mm.pluginsdk.model.r3.b(str4, str3, str6, 153L, context);
            }
        });
        u1Var.e(new android.content.DialogInterface.OnDismissListener(zVar) { // from class: com.tencent.mm.pluginsdk.model.t3$$c
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                java.lang.String[] strArr = com.tencent.mm.pluginsdk.model.t3.f189442a;
            }
        });
        u1Var.q(false);
        com.tencent.mm.pluginsdk.model.r3.b(str4, str3, str6, 151L, context);
    }

    @Override // com.tencent.mm.pluginsdk.model.y3
    public java.lang.String a(android.content.Context context, android.content.pm.ResolveInfo resolveInfo) {
        android.content.pm.ActivityInfo activityInfo;
        java.lang.String str;
        if (context == null || resolveInfo == null || (activityInfo = resolveInfo.activityInfo) == null || (str = activityInfo.packageName) == null) {
            return null;
        }
        if ("com.qihoo.browser".equals(str)) {
            return "360浏览器";
        }
        if ("com.mx.browser".equals(str)) {
            return "傲游云浏览器";
        }
        if ("com.dolphin.browser.xf".equals(str)) {
            return "海豚浏览器";
        }
        if ("com.UCMobile".equals(str)) {
            return "UC浏览器";
        }
        if ("com.baidu.browser.apps".equals(str)) {
            return "百度浏览器";
        }
        if ("sogou.mobile.explorer".equals(str)) {
            return "搜狗浏览器";
        }
        if ("com.ijinshan.browser".equals(str)) {
            return "猎豹浏览器";
        }
        if ("com.mediawoz.xbrowser".equals(str)) {
            return "GO浏览器";
        }
        if ("com.oupeng.browser".equals(str)) {
            return "欧朋浏览器";
        }
        if ("com.tiantianmini.android.browser".equals(str)) {
            return "天天浏览器";
        }
        java.lang.CharSequence loadLabel = resolveInfo.activityInfo.loadLabel(context.getPackageManager());
        if (loadLabel != null) {
            java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("\\(.*推荐.*\\)", 2).matcher(loadLabel.toString());
            if (matcher.find()) {
                return matcher.replaceAll("");
            }
        }
        return resolveInfo.activityInfo.loadLabel(context.getPackageManager()).toString();
    }

    @Override // com.tencent.mm.pluginsdk.model.y3
    public jt.u b() {
        jt.u uVar = new jt.u();
        uVar.f301589b = com.tencent.mm.R.string.hok;
        uVar.f301591d = com.tencent.mm.R.string.hop;
        uVar.f301588a = com.tencent.mm.R.drawable.icon_qqbrowser;
        return uVar;
    }

    @Override // com.tencent.mm.pluginsdk.model.y3
    public java.lang.String c() {
        return "qq_browser.apk";
    }

    @Override // com.tencent.mm.pluginsdk.model.y3
    public java.lang.String d() {
        return "http://appchannel.html5.qq.com/directdown?app=qqbrowser&channel=10318";
    }

    @Override // com.tencent.mm.pluginsdk.model.y3
    public java.lang.String e() {
        return "com.tencent.mtt";
    }

    @Override // com.tencent.mm.pluginsdk.model.y3
    public java.lang.String f() {
        return "https://upage.imtt.qq.com/m_imtt/download-middle-page/plugin/wechat_plugin.html";
    }

    @Override // com.tencent.mm.pluginsdk.model.y3
    public boolean g(android.content.Context context) {
        com.tencent.mm.pluginsdk.model.v3 m17 = m(context);
        int i17 = m17.f189483a;
        if (i17 == -1) {
            return false;
        }
        return i17 != 2 || m17.f189484b >= 33;
    }

    @Override // com.tencent.mm.pluginsdk.model.y3
    public boolean h(java.lang.String str) {
        return "com.tencent.mtt".equals(str) || "com.tencent.qbx".equals(str) || "com.tencent.mtt.x86".equals(str) || "com.tencent.qbx5".equals(str);
    }

    @Override // com.tencent.mm.pluginsdk.model.y3
    public boolean i(android.content.Context context, android.content.Intent intent) {
        java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (queryIntentActivities != null && queryIntentActivities.size() > 0) {
            java.util.Iterator<android.content.pm.ResolveInfo> it = queryIntentActivities.iterator();
            while (it.hasNext()) {
                java.lang.String str = it.next().activityInfo.packageName;
                if (str.contains("com.tencent.mtt") || str.contains("com.tencent.qbx")) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053 A[Catch: Exception -> 0x01ce, TryCatch #0 {Exception -> 0x01ce, blocks: (B:18:0x004c, B:21:0x0053, B:23:0x0065, B:27:0x007b, B:30:0x0071), top: B:17:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b A[Catch: Exception -> 0x01ce, TRY_LEAVE, TryCatch #0 {Exception -> 0x01ce, blocks: (B:18:0x004c, B:21:0x0053, B:23:0x0065, B:27:0x007b, B:30:0x0071), top: B:17:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int s(android.content.Context r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.model.t3.s(android.content.Context, java.lang.String):int");
    }
}

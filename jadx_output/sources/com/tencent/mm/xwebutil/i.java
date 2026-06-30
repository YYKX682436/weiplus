package com.tencent.mm.xwebutil;

/* loaded from: classes13.dex */
public abstract class i extends com.tencent.mm.xwebutil.j {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f214839a;

    /* renamed from: b, reason: collision with root package name */
    public static uh0.q f214840b;

    public static void a(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.lang.String b17 = b(str2);
        com.tencent.mm.xwebutil.q.a(str, b17);
        com.tencent.xweb.r1.a(str, b17);
    }

    public static java.lang.String b(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("XFilesReaderLogic", "getSafeRealPath filePath is empty");
            return str;
        }
        try {
            java.lang.String i17 = com.tencent.mm.vfs.w6.i(str, false);
            if (com.tencent.mm.sdk.platformtools.t8.K0(i17)) {
                com.tencent.mars.xlog.Log.e("XFilesReaderLogic", "getSafeRealPath real path is empty, use old path %s", str);
                return str;
            }
            if (i17.equals(str)) {
                com.tencent.mars.xlog.Log.i("XFilesReaderLogic", "getSafeRealPath real path is the same %s", i17);
                return i17;
            }
            com.tencent.mars.xlog.Log.i("XFilesReaderLogic", "getSafeRealPath from %s to %s", str, i17);
            return i17;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("XFilesReaderLogic", "getSafeRealPath error: %s", e17.getMessage());
            return str;
        }
    }

    public static android.view.ViewGroup c(com.tencent.mm.ui.MMActivity mMActivity, java.lang.String str, android.webkit.ValueCallback valueCallback, boolean z17, boolean z18) {
        uh0.q qVar;
        java.lang.ref.WeakReference weakReference;
        android.view.View view;
        android.view.View inflate = com.tencent.mm.ui.id.b(mMActivity.getContext()).inflate(com.tencent.mm.R.layout.f489645da2, (android.view.ViewGroup) new android.widget.LinearLayout(mMActivity.getContext()), false);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487776pt3);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.f487777pt5);
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.pt6);
        android.widget.ImageButton imageButton = (android.widget.ImageButton) inflate.findViewById(com.tencent.mm.R.id.pt7);
        android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.f487774pt1);
        android.widget.ImageButton imageButton2 = (android.widget.ImageButton) inflate.findViewById(com.tencent.mm.R.id.f487773pt0);
        if (textView == null || linearLayout == null || linearLayout2 == null || imageButton == null || linearLayout3 == null || imageButton2 == null) {
            com.tencent.mars.xlog.Log.e("XFilesReaderLogic", "initView can not find view");
            return null;
        }
        linearLayout2.setVisibility(0);
        imageButton.setVisibility(0);
        imageButton.setOnClickListener(new com.tencent.mm.xwebutil.e(valueCallback));
        linearLayout3.setVisibility(0);
        if (z17) {
            imageButton2.setVisibility(0);
            imageButton2.setOnClickListener(new com.tencent.mm.xwebutil.f(valueCallback));
        } else {
            imageButton2.setVisibility(8);
        }
        linearLayout.setVisibility(0);
        textView.setVisibility(0);
        textView.setText(str);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(mMActivity);
        frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(mMActivity);
        relativeLayout.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        relativeLayout.setTag("view_tag_relative_layout");
        frameLayout.addView(relativeLayout);
        androidx.appcompat.widget.Toolbar toolbar = new androidx.appcompat.widget.Toolbar(mMActivity, null);
        toolbar.setLayoutParams(new androidx.appcompat.widget.Toolbar.LayoutParams(-1, -2));
        if (toolbar.f9497z == null) {
            toolbar.f9497z = new androidx.appcompat.widget.q1();
        }
        androidx.appcompat.widget.q1 q1Var = toolbar.f9497z;
        q1Var.f9691h = false;
        q1Var.f9688e = 0;
        q1Var.f9684a = 0;
        q1Var.f9689f = 0;
        q1Var.f9685b = 0;
        toolbar.setTag("view_tag_toolbar");
        frameLayout.addView(toolbar);
        int color = mMActivity.getResources().getColor(com.tencent.mm.R.color.a07);
        if (z18) {
            linearLayout.setVisibility(8);
            textView.setVisibility(8);
            frameLayout.setBackgroundColor(-13421773);
            toolbar.setBackgroundColor(3355443);
            h(mMActivity, -13421773);
            imageButton.setImageResource(com.tencent.mm.R.drawable.bub);
            imageButton2.setImageResource(com.tencent.mm.R.drawable.bud);
        } else if (com.tencent.mm.ui.bk.C()) {
            frameLayout.setBackgroundColor(-15132391);
            toolbar.setBackgroundColor(color);
            h(mMActivity, color);
            imageButton.setImageResource(com.tencent.mm.R.drawable.bub);
            imageButton2.setImageResource(com.tencent.mm.R.drawable.bud);
        } else {
            frameLayout.setBackgroundColor(-3355444);
            toolbar.setBackgroundColor(color);
            imageButton.setImageResource(com.tencent.mm.R.drawable.bu7);
            imageButton2.setImageResource(com.tencent.mm.R.drawable.bu_);
        }
        if (!z18 && (qVar = f214840b) != null && (weakReference = qVar.f427735a) != null && (view = (android.view.View) weakReference.get()) != null) {
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 81;
            view.setLayoutParams(layoutParams);
            view.setTag("view_tag_bottom_bar");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/xwebutil/FileReaderLogic", "initView", "(Lcom/tencent/mm/ui/MMActivity;Ljava/lang/String;Landroid/webkit/ValueCallback;ZZ)Landroid/view/ViewGroup;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/xwebutil/FileReaderLogic", "initView", "(Lcom/tencent/mm/ui/MMActivity;Ljava/lang/String;Landroid/webkit/ValueCallback;ZZ)Landroid/view/ViewGroup;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            frameLayout.addView(view);
        }
        try {
            mMActivity.setSupportActionBar(toolbar);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("XFilesReaderLogic", e17, "setSupportActionBar", new java.lang.Object[0]);
        }
        mMActivity.setContentView(frameLayout);
        androidx.appcompat.app.b N = al5.p0.N(mMActivity.getSupportActionBar());
        if (N == null) {
            return null;
        }
        N.F(false);
        N.B(false);
        N.E(false);
        N.D(true);
        N.y(inflate);
        return frameLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x0434  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(android.content.Context r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, boolean r38, java.util.HashMap r39, android.webkit.ValueCallback r40, android.webkit.ValueCallback r41, boolean r42) {
        /*
            Method dump skipped, instructions count: 1138
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.xwebutil.i.d(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.HashMap, android.webkit.ValueCallback, android.webkit.ValueCallback, boolean):void");
    }

    public static void e(int i17, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, boolean z18, java.util.HashMap hashMap, android.webkit.ValueCallback valueCallback, android.webkit.ValueCallback valueCallback2, boolean z19) {
        by5.c4.f("FileReaderX5", "readFile by x5, fileExt: ".concat(str3 != null ? str3 : "null"));
        long m17 = com.tencent.xweb.n.m(str, str3);
        com.tencent.xweb.n.q(str3, "X5");
        if (str3 == null || str3.isEmpty()) {
            by5.c4.c("XFilesReaderHelper", "reportReadByX5Scene param is null");
        } else {
            java.lang.String lowerCase = str3.toLowerCase();
            com.tencent.xweb.l i18 = com.tencent.xweb.n.i(lowerCase);
            if (i18 == null) {
                by5.c4.b("XFilesReaderHelper", "reportReadByX5Scene idkey skip " + lowerCase);
            } else {
                java.lang.String str5 = lowerCase + "," + i17;
                by5.c4.b("XFilesReaderHelper", "reportReadByX5Scene kv key:17563, val:" + str5);
                by5.s0.t(17563, str5);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportReadByX5Scene idkey id:");
                int i19 = i18.f220326a;
                sb6.append(i19);
                sb6.append(", key:");
                sb6.append(i17);
                by5.c4.b("XFilesReaderHelper", sb6.toString());
                by5.s0.e(i19, i17, 1L);
            }
        }
        com.tencent.xweb.j jVar = new com.tencent.xweb.j(com.tencent.xweb.n.f(hashMap), str3, m17, "miniqb", -1, com.tencent.xweb.n.b(i17));
        long d17 = com.tencent.xweb.n.d(context);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        jVar.f220309h = d17;
        jVar.f220316o = currentTimeMillis;
        com.tencent.xweb.n.o(jVar);
        by5.c4.f("FileReaderX5", "readFile by x5, disable x5, fileExt: ".concat(str3 != null ? str3 : "null"));
        jVar.a(com.tencent.xweb.n.d(context), java.lang.System.currentTimeMillis(), -100005, "miniqb_init_error_disable");
        com.tencent.xweb.n.p(jVar);
        if (str3 == null || str3.isEmpty()) {
            by5.c4.c("XFilesReaderHelper", "reportX5ErrorCode param is null");
        } else {
            java.lang.String lowerCase2 = str3.toLowerCase();
            com.tencent.xweb.l i27 = com.tencent.xweb.n.i(lowerCase2);
            if (i27 == null) {
                by5.c4.b("XFilesReaderHelper", "reportX5ErrorCode skip " + lowerCase2);
            } else {
                java.lang.String str6 = "-1," + lowerCase2 + ",-100005,x5init";
                by5.c4.b("XFilesReaderHelper", "reportX5ErrorCode kv key:17566, val:" + str6);
                by5.s0.t(17566, str6);
                boolean z27 = i27.f220327b;
                int i28 = z27 ? 15 : 14;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("reportX5ErrorCode idkey id:");
                int i29 = i27.f220326a;
                sb7.append(i29);
                sb7.append(", key:");
                sb7.append(i28);
                by5.c4.b("XFilesReaderHelper", sb7.toString());
                long j17 = i29;
                by5.s0.e(j17, i28, 1L);
                if (i17 == 49) {
                    int i37 = z27 ? 39 : 38;
                    by5.c4.b("XFilesReaderHelper", "reportX5ErrorCode XWeb and X5 All failed id:" + i29 + ", key:" + i37);
                    by5.s0.e(j17, (long) i37, 1L);
                }
            }
        }
        com.tencent.mars.xlog.Log.i("XFilesReaderLogic", "readFileByX5 onReceiveValue: " + ((java.lang.Object) (-102)));
        valueCallback2.onReceiveValue(-102);
    }

    public static void f(android.app.Activity activity, java.lang.String filePath, java.lang.String str, java.lang.String str2, long j17, java.lang.String str3, boolean z17) {
        long k17;
        com.tencent.mars.xlog.Log.i("XFilesReaderLogic", "sendFileToFriend, start filePath: " + filePath);
        com.tencent.mm.xwebutil.h hVar = new com.tencent.mm.xwebutil.h(j17, str3, filePath, str, str2, activity);
        ec5.a aVar = new ec5.a();
        aVar.l(filePath);
        int i17 = aVar.f43702d;
        aVar.set(i17 + 0, java.lang.Long.valueOf(j17));
        aVar.set(i17 + 1, str3 != null ? str3 : "");
        kotlin.jvm.internal.o.g(filePath, "filePath");
        if (z17) {
            com.tencent.mm.storage.f9 k18 = pt0.f0.f358209b1.k(str3, j17);
            v05.b bVar = new v05.b();
            java.lang.String j18 = k18 != null ? k18.j() : null;
            bVar.fromXml(j18 != null ? j18 : "");
            k17 = com.tencent.mm.vfs.w6.k(filePath);
            if (k17 <= 0) {
                v05.a aVar2 = (v05.a) bVar.getCustom(bVar.f432315e + 8);
                k17 = aVar2 != null ? aVar2.getLong(aVar2.f368364d + 0) : 0L;
            }
        } else {
            k17 = com.tencent.mm.vfs.w6.k(filePath);
        }
        aVar.k(n13.v.f334140a.b(str, str2, k17));
        n13.r a17 = n13.r.a(1);
        a17.f334119c = hVar;
        ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(activity, aVar, a17);
    }

    public static void g(android.content.Context context, java.lang.String str, java.lang.String str2, int i17) {
        if (context == null || str == null || str.isEmpty() || str2 == null || str2.isEmpty()) {
            com.tencent.mars.xlog.Log.e("XFilesReaderLogic", "sendResult wrong param");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("MINIQB_OPEN_RET");
        intent.putExtra("op_type", "NOTIFY_RET");
        intent.putExtra("file_path", str);
        intent.putExtra("file_ext", str2);
        intent.putExtra("MINIQB_OPEN_RET_VAL", i17);
        intent.setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
        context.sendBroadcast(intent, com.tencent.mm.sdk.platformtools.v9.a());
    }

    public static void h(com.tencent.mm.ui.MMActivity mMActivity, int i17) {
        try {
            android.view.Window window = mMActivity.getWindow();
            if (window == null) {
                return;
            }
            window.clearFlags(201326592);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(i17);
            android.view.View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("XFilesReaderLogic", "updateStatusBarToDarkMode error ", e17);
        }
    }
}

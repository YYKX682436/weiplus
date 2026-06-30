package sc5;

/* loaded from: classes12.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f406573b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f406574c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f406575d;

    /* renamed from: a, reason: collision with root package name */
    public static final sc5.g f406572a = new sc5.g();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Set f406576e = new java.util.LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Set f406577f = new java.util.LinkedHashSet();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Set f406578g = kz5.z.D0(new java.lang.String[]{"md", "markdown"});

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.Set f406579h = kz5.z.D0(new java.lang.String[]{"html", "htm"});

    static {
        java.util.Set set;
        java.util.Set set2;
        java.lang.String f17 = j62.e.g().f(new com.tencent.mm.repairer.config.file.RepairerConfigPreviewFile());
        if (!(f17 == null || f17.length() == 0) && !kotlin.jvm.internal.o.b(f17, "0")) {
            f406573b = true;
            kotlin.jvm.internal.o.d(f17);
            java.util.Iterator it = r26.n0.f0(f17, new java.lang.String[]{"/"}, false, 0, 6, null).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                set2 = f406576e;
                if (!hasNext) {
                    break;
                }
                java.lang.String str = (java.lang.String) it.next();
                java.util.Locale locale = java.util.Locale.getDefault();
                kotlin.jvm.internal.o.f(locale, "getDefault(...)");
                java.lang.String lowerCase = str.toLowerCase(locale);
                kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
                set2.add(lowerCase);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FilePreviewHelper", "initSupportFileExt: " + f17 + ", isFilePreviewSwitchOpen: " + f406573b + ", supportedFileExts: " + set2.size());
        }
        sc5.g gVar = f406572a;
        gVar.getClass();
        f406574c = j62.e.g().c(new com.tencent.mm.repairer.config.file.RepairerConfigWeWorkFilePreview()) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.FilePreviewHelper", "initWeWorkFilePreviewSwitch: " + f406574c);
        gVar.getClass();
        java.lang.String f18 = j62.e.g().f(new com.tencent.mm.repairer.config.file.RepairerConfigLocalPreviewFile());
        if (!(f18 == null || f18.length() == 0) && !kotlin.jvm.internal.o.b(f18, "0")) {
            kotlin.jvm.internal.o.d(f18);
            java.util.Iterator it6 = r26.n0.f0(f18, new java.lang.String[]{"/"}, false, 0, 6, null).iterator();
            while (true) {
                boolean hasNext2 = it6.hasNext();
                set = f406577f;
                if (!hasNext2) {
                    break;
                }
                java.lang.String str2 = (java.lang.String) it6.next();
                java.util.Locale locale2 = java.util.Locale.getDefault();
                kotlin.jvm.internal.o.f(locale2, "getDefault(...)");
                java.lang.String lowerCase2 = str2.toLowerCase(locale2);
                kotlin.jvm.internal.o.f(lowerCase2, "toLowerCase(...)");
                set.add(lowerCase2);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FilePreviewHelper", "initSupportLocalFileExt: " + f18 + ", supportedLocalFileExts: " + set.size());
        }
        f406572a.getClass();
        f406575d = j62.e.g().c(new com.tencent.mm.repairer.config.file.RepairerConfigMarkDownFilePreview()) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.FilePreviewHelper", "isMarkDownFilePreviewSwitchOpen: " + f406575d);
    }

    public static void g(sc5.g gVar, android.content.Context context, com.tencent.mm.storage.f9 msg, boolean z17, boolean z18, java.lang.String str, int i17, java.lang.Object obj) {
        boolean z19 = (i17 & 4) != 0 ? false : z17;
        boolean z27 = (i17 & 8) != 0 ? true : z18;
        java.lang.String str2 = (i17 & 16) != 0 ? null : str;
        gVar.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(msg, "msg");
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(context, "com.tencent.mm.ui.chatting.AppAttachNewDownloadUI");
        intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 2);
        intent.putExtra("app_msg_id", msg.getMsgId());
        intent.putExtra("msg_talker", msg.Q0());
        intent.putExtra("download_file", z19);
        intent.putExtra("enter_from_preview", z27);
        if (str2 == null) {
            str2 = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.o.f(str2, "toString(...)");
        }
        intent.putExtra("msg_conv_sesssionid", str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.FilePreviewHelper", "open AppAttachNewDownloadUI, msgId:" + msg.getMsgId() + ", talker:" + msg.Q0() + ", isDownloadFile:" + z19);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/chatting/helper/FilePreviewHelper", "startFileDownLoadUI", "(Landroid/content/Context;Lcom/tencent/mm/storage/MsgInfo;ZZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/ui/chatting/helper/FilePreviewHelper", "startFileDownLoadUI", "(Landroid/content/Context;Lcom/tencent/mm/storage/MsgInfo;ZZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.lang.String r5) {
        /*
            r4 = this;
            boolean r0 = sc5.g.f406573b
            r1 = 0
            java.lang.String r2 = "MicroMsg.FilePreviewHelper"
            if (r0 != 0) goto Le
            java.lang.String r0 = "enableLocalPreview: false"
            com.tencent.mars.xlog.Log.i(r2, r0)
        Lc:
            r0 = r1
            goto L3c
        Le:
            boolean r0 = r4.c(r5)
            if (r0 != 0) goto L26
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "fileExt not support, fileExt: "
            r0.<init>(r3)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r2, r0)
            goto Lc
        L26:
            java.util.Set r0 = sc5.g.f406577f
            if (r5 == 0) goto L37
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r2 = r5.toLowerCase(r2)
            java.lang.String r3 = "toLowerCase(...)"
            kotlin.jvm.internal.o.f(r2, r3)
            goto L38
        L37:
            r2 = 0
        L38:
            boolean r0 = kz5.n0.O(r0, r2)
        L3c:
            r2 = 1
            if (r0 != 0) goto L4e
            boolean r0 = sc5.g.f406575d
            if (r0 == 0) goto L4b
            boolean r5 = r4.e(r5)
            if (r5 == 0) goto L4b
            r5 = r2
            goto L4c
        L4b:
            r5 = r1
        L4c:
            if (r5 == 0) goto L4f
        L4e:
            r1 = r2
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sc5.g.a(java.lang.String):boolean");
    }

    public final java.lang.String b(com.tencent.mm.storage.f9 msg) {
        java.lang.String j17;
        java.lang.String str;
        kotlin.jvm.internal.o.g(msg, "msg");
        if (com.tencent.mm.storage.z3.R4(msg.Q0()) && msg.Z1() == 0) {
            j17 = msg.j();
            if (j17 != null) {
                j17 = c01.w9.u(j17);
            }
            if (j17 == null) {
                j17 = "";
            }
        } else {
            j17 = msg.j();
            kotlin.jvm.internal.o.d(j17);
        }
        ot0.q v17 = ot0.q.v(j17);
        if (v17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FilePreviewHelper", "summerapp parse msgContent error, ".concat(j17));
        }
        return (v17 == null || (str = v17.f348690o) == null) ? "" : str;
    }

    public final boolean c(java.lang.String str) {
        if (str == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FilePreviewHelper", "isEnablePreviewFileInner fileExt is null");
            return false;
        }
        java.util.Set set = f406576e;
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        return set.contains(lowerCase);
    }

    public final boolean d() {
        return f406573b;
    }

    public final boolean e(java.lang.String str) {
        java.lang.String str2;
        if (str != null) {
            str2 = str.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.o.f(str2, "toLowerCase(...)");
        } else {
            str2 = null;
        }
        return kz5.n0.O(f406578g, str2);
    }

    public final void f(android.content.Context context, com.tencent.mm.storage.f9 f9Var, sc5.h previewParams) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(previewParams, "previewParams");
        if (f9Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FilePreviewHelper", "startFileDownLoadOrPreviewUI msg is null");
            return;
        }
        if (!f406573b) {
            ez.v0 v0Var = ez.v0.f257777a;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(f9Var.getType());
            if (!((valueOf != null && valueOf.intValue() == 130) || (valueOf != null && valueOf.intValue() == 131))) {
                g(this, context, f9Var, false, false, previewParams.f406580a, 4, null);
                com.tencent.mm.ui.report.b.f209619a.e(f9Var, null, null, false);
            }
        }
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.ui.container.MMCommonActivity.class);
        intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 2);
        intent.putExtra("app_msg_id", f9Var.getMsgId());
        intent.putExtra("msg_talker", f9Var.Q0());
        java.lang.String str = previewParams.f406580a;
        str.getClass();
        intent.putExtra("msg_conv_sesssionid", str);
        java.lang.Class[] clsArr = {qe5.m0.class, qe5.w0.class, qe5.b.class, qe5.e.class, qe5.n1.class, qe5.z.class, qe5.h.class, qe5.b0.class, com.tencent.mm.ui.chatting.uic.file.FilePreviewUIC.class, qe5.p0.class, com.tencent.mm.ui.chatting.uic.file.FileQBUIC.class, qe5.z1.class, qe5.c0.class, qe5.f2.class, qe5.o.class};
        for (int i17 = 0; i17 < 15; i17++) {
            pf5.j0.a(intent, clsArr[i17]);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FilePreviewHelper", "startFilePreviewUI, msgId:" + f9Var.getMsgId() + ", talker:" + f9Var.Q0());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/chatting/helper/FilePreviewHelper", "startFilePreviewUI", "(Landroid/content/Context;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/helper/FilePreviewParams;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/ui/chatting/helper/FilePreviewHelper", "startFilePreviewUI", "(Landroid/content/Context;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/helper/FilePreviewParams;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.tencent.mm.ui.report.b.f209619a.e(f9Var, null, null, false);
    }
}

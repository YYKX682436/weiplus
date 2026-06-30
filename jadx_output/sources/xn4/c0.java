package xn4;

/* loaded from: classes11.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final xn4.c0 f455604a = new xn4.c0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f455605b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mm.vfs.r6 f455606c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f455607d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f455608e;

    /* renamed from: f, reason: collision with root package name */
    public static final xn4.r f455609f;

    /* renamed from: g, reason: collision with root package name */
    public static final xn4.y f455610g;

    /* renamed from: h, reason: collision with root package name */
    public static final xn4.x f455611h;

    static {
        com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
        f455606c = lp0.b.h0("patchapk");
        f455608e = "";
        f455609f = new xn4.r();
        f455610g = new xn4.y();
        f455611h = new xn4.x();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0047, code lost:
    
        if ((!r2.isEmpty()) == true) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(xn4.c0 r2, java.lang.String r3, yz5.l r4) {
        /*
            java.util.Map r0 = xn4.c0.f455605b
            r2.b(r3, r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r1 = "notifyCallback "
            r2.<init>(r1)
            r2.append(r3)
            r1 = 32
            r2.append(r1)
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r1 = r0.get(r3)
            java.util.Set r1 = (java.util.Set) r1
            if (r1 == 0) goto L27
            int r1 = r1.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L28
        L27:
            r1 = 0
        L28:
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r1 = "MicroMsg.XUpdate.XUpdateHelper"
            com.tencent.mars.xlog.Log.i(r1, r2)
            xn4.y r2 = xn4.c0.f455610g
            r4.invoke(r2)
            java.lang.Object r2 = r0.get(r3)
            java.util.Set r2 = (java.util.Set) r2
            if (r2 == 0) goto L4a
            boolean r2 = r2.isEmpty()
            r1 = 1
            r2 = r2 ^ r1
            if (r2 != r1) goto L4a
            goto L4b
        L4a:
            r1 = 0
        L4b:
            if (r1 != 0) goto L53
            xn4.r r2 = xn4.c0.f455609f
            r4.invoke(r2)
            goto L77
        L53:
            java.lang.Object r2 = r0.get(r3)
            java.util.Set r2 = (java.util.Set) r2
            if (r2 == 0) goto L77
            java.util.Iterator r2 = r2.iterator()
        L5f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L77
            java.lang.Object r3 = r2.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r3 = r3.get()
            xn4.q r3 = (xn4.q) r3
            if (r3 == 0) goto L5f
            r4.invoke(r3)
            goto L5f
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xn4.c0.a(xn4.c0, java.lang.String, yz5.l):void");
    }

    public final void b(java.lang.String str, java.util.Map map) {
        java.util.Iterator it;
        java.util.Set set = (java.util.Set) map.get(str);
        if (set == null || (it = set.iterator()) == null) {
            return;
        }
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            if ((weakReference != null ? (xn4.q) weakReference.get() : null) == null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clearEmptyCallbacks clear ");
                sb6.append(weakReference != null ? java.lang.Integer.valueOf(weakReference.hashCode()) : null);
                com.tencent.mars.xlog.Log.i("MicroMsg.XUpdate.XUpdateHelper", sb6.toString());
                it.remove();
            }
        }
    }

    public final java.lang.String c() {
        if (f455608e.length() > 0) {
            return f455608e;
        }
        java.lang.String p17 = com.tencent.mm.vfs.w6.p(d());
        kotlin.jvm.internal.o.d(p17);
        f455608e = p17;
        return p17;
    }

    public final java.lang.String d() {
        java.lang.String string = com.tencent.mm.sdk.platformtools.o4.M("xupdate_repairer").getString("x_repairer_mockapkpath", "");
        java.lang.String str = string != null ? string : "";
        if (str.length() > 0) {
            return str;
        }
        java.lang.String sourceDir = com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationInfo().sourceDir;
        kotlin.jvm.internal.o.f(sourceDir, "sourceDir");
        return sourceDir;
    }

    public final int e(java.lang.String cdnUrl) {
        kotlin.jvm.internal.o.g(cdnUrl, "cdnUrl");
        int i17 = com.tencent.mm.sdk.platformtools.o4.M("MMKV_NAME_XUPDATE_STATUS").getInt(g(cdnUrl), 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.XUpdate.XUpdateHelper", "getCurStatus: " + i17);
        return i17;
    }

    public final java.lang.String f(java.lang.String cdnUrl) {
        kotlin.jvm.internal.o.g(cdnUrl, "cdnUrl");
        java.lang.String string = com.tencent.mm.sdk.platformtools.o4.M("MMKV_NAME_FILE_NAME").getString(cdnUrl, null);
        if (string == null) {
            string = java.lang.System.currentTimeMillis() + "_patch.apk";
            com.tencent.mm.sdk.platformtools.o4.M("MMKV_NAME_FILE_NAME").putString(cdnUrl, string);
        }
        kotlin.jvm.internal.o.d(string);
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(f455606c.n(), string);
        if (!r6Var.m()) {
            r6Var.k();
        }
        java.lang.String o17 = r6Var.o();
        kotlin.jvm.internal.o.f(o17, "let(...)");
        return o17;
    }

    public final java.lang.String g(java.lang.String cdnUrl) {
        kotlin.jvm.internal.o.g(cdnUrl, "cdnUrl");
        java.lang.String string = com.tencent.mm.sdk.platformtools.o4.M("MMKV_NAME_MEDIA_ID").getString(cdnUrl, null);
        if (string == null) {
            string = java.lang.System.currentTimeMillis() + "_patch.apk";
            com.tencent.mm.sdk.platformtools.o4.M("MMKV_NAME_MEDIA_ID").putString(cdnUrl, string);
        }
        kotlin.jvm.internal.o.d(string);
        return string;
    }

    public final boolean h() {
        xn4.e0 e0Var = xn4.e0.f455614d;
        if (e0Var.f(e0Var.b().f380671g)) {
            return false;
        }
        try {
            java.lang.String oldApkMd5 = e0Var.b().f380672h;
            kotlin.jvm.internal.o.f(oldApkMd5, "oldApkMd5");
            java.lang.String l07 = r26.n0.l0(oldApkMd5, new e06.k(0, 5));
            java.lang.String l08 = r26.n0.l0(c(), new e06.k(0, 5));
            com.tencent.mars.xlog.Log.i("MicroMsg.XUpdate.XUpdateHelper", "hasUpdateVersion oldApkMd5=" + e0Var.b().f380671g + " baseMd5=" + f455604a.c());
            return kotlin.jvm.internal.o.b(l07, l08);
        } catch (java.lang.ArrayIndexOutOfBoundsException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.XUpdate.XUpdateHelper", e17, "hasUpdateVersion error:", new java.lang.Object[0]);
            return false;
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.XUpdate.XUpdateHelper", e18, "hasUpdateVersion error:", new java.lang.Object[0]);
            return false;
        }
    }

    public final void i(java.lang.String cdnUrl, int i17) {
        kotlin.jvm.internal.o.g(cdnUrl, "cdnUrl");
        com.tencent.mars.xlog.Log.i("MicroMsg.XUpdate.XUpdateHelper", "saveCurStatus: status");
        com.tencent.mm.sdk.platformtools.o4.M("MMKV_NAME_XUPDATE_STATUS").putInt(g(cdnUrl), i17);
    }

    public final void j(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        un4.e eVar = (un4.e) i95.n0.c(un4.e.class);
        xn4.e0 e0Var = xn4.e0.f455614d;
        boolean wi6 = ((tn4.o) eVar).wi(context, e0Var.b().f380671g);
        com.tencent.mars.xlog.Log.i("MicroMsg.XUpdate.XUpdateHelper", "startXUpdate, checkAndShowInstallPatchDialogm success = %s, response.newApkMd5 = %s, ", java.lang.Boolean.valueOf(wi6), e0Var.b().f380671g);
        if (wi6) {
            return;
        }
        if (e0Var.f(e0Var.b().f380671g)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.XUpdate.XUpdateHelper", "startXUpdate but ignore");
            return;
        }
        r45.mm6 b17 = e0Var.b();
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.updater.xlabupdater.XUpdateDownloadUI.class);
        intent.putExtra("x_dialoginfo", b17.toJSON().toString());
        intent.setFlags(268435456);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/updater/xlabupdater/XUpdateHelper", "startDownload", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/TinkerInstallDialog;Ljava/lang/Class;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/updater/xlabupdater/XUpdateHelper", "startDownload", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/TinkerInstallDialog;Ljava/lang/Class;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void k(final android.content.Context context, final r45.mm6 info) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(info, "info");
        java.lang.String cdnUrl = info.f380677p;
        kotlin.jvm.internal.o.f(cdnUrl, "cdnUrl");
        if (com.tencent.mm.sdk.platformtools.o4.M("MMKV_NAME_XUPDATE_MERGE_TRYTIME").getInt(cdnUrl, 0) >= 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.XUpdate.XUpdateHelper", "tryMergeApk ignore, fail too many time");
            xn4.e0 e0Var = xn4.e0.f455614d;
            java.lang.String newApkMd5 = info.f380671g;
            kotlin.jvm.internal.o.f(newApkMd5, "newApkMd5");
            e0Var.c(newApkMd5);
            return;
        }
        ym5.a1.f(new xn4.z(context));
        java.lang.String cdnUrl2 = info.f380677p;
        kotlin.jvm.internal.o.f(cdnUrl2, "cdnUrl");
        if (e(cdnUrl2) == 3 && !f455607d) {
            java.lang.String cdnUrl3 = info.f380677p;
            kotlin.jvm.internal.o.f(cdnUrl3, "cdnUrl");
            i(cdnUrl3, 2);
        }
        if (f455607d) {
            return;
        }
        java.lang.String cdnUrl4 = info.f380677p;
        kotlin.jvm.internal.o.f(cdnUrl4, "cdnUrl");
        i(cdnUrl4, 3);
        f455607d = true;
        java.lang.String cdnUrl5 = info.f380677p;
        kotlin.jvm.internal.o.f(cdnUrl5, "cdnUrl");
        final java.lang.String f17 = f(cdnUrl5);
        final xn4.b0 b0Var = new xn4.b0(info);
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = w73.a.f443492b;
        ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: w73.a$$a
            /* JADX WARN: Removed duplicated region for block: B:15:0x00cb  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0140  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 417
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: w73.a$$a.run():void");
            }
        });
    }
}

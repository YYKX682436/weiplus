package p05;

/* loaded from: classes5.dex */
public final class p3 {

    /* renamed from: a, reason: collision with root package name */
    public static final p05.p3 f350639a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.LinkedList f350640b;

    /* renamed from: c, reason: collision with root package name */
    public static final r45.v87 f350641c;

    /* renamed from: d, reason: collision with root package name */
    public static r45.v87 f350642d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.LinkedList f350643e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.LinkedHashSet f350644f;

    static {
        p05.p3 p3Var = new p05.p3();
        f350639a = p3Var;
        f350640b = new java.util.LinkedList();
        f350641c = new r45.v87();
        f350642d = new r45.v87();
        f350643e = new java.util.LinkedList();
        f350644f = new java.util.LinkedHashSet();
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            return;
        }
        p3Var.c();
        int i17 = com.tencent.mm.plugin.xlabeffect.WeVisUpdateReceiver.f188595a;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            throw new java.lang.RuntimeException("WeVisUpdateReceiver can only register from non main process!");
        }
        if (fp.h.a(33)) {
            com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(new com.tencent.mm.plugin.xlabeffect.WeVisUpdateReceiver(), new android.content.IntentFilter("com.tencent.mm.WeVisUpdate"));
        } else {
            com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(new com.tencent.mm.plugin.xlabeffect.WeVisUpdateReceiver(), new android.content.IntentFilter("com.tencent.mm.WeVisUpdate"), 4);
        }
    }

    public final void a(int i17, int i18, java.lang.String path) {
        boolean z17;
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(path, "path");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        p05.a3 a3Var = p05.a3.f350439a;
        sb6.append(p05.a3.f350443e);
        sb6.append('/');
        sb6.append(i17);
        sb6.append('.');
        sb6.append(i18);
        java.lang.String sb7 = sb6.toString();
        java.util.LinkedList NewConfigList = f350642d.f387993d;
        kotlin.jvm.internal.o.f(NewConfigList, "NewConfigList");
        java.util.Iterator it = NewConfigList.iterator();
        while (true) {
            z17 = true;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            r45.w87 w87Var = (r45.w87) obj;
            if (w87Var.f388971d == i17 && w87Var.f388972e == i18) {
                break;
            }
        }
        r45.w87 w87Var2 = (r45.w87) obj;
        if (w87Var2 == null || !kotlin.jvm.internal.o.b(((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Ni(i17, i18), w87Var2.f388973f)) {
            return;
        }
        java.lang.String str = w87Var2.f388974g;
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            return;
        }
        com.tencent.mm.vfs.w6.f(sb7);
        com.tencent.mm.vfs.w6.h(sb7);
        com.tencent.mm.vfs.w6.u(sb7);
        com.tencent.mm.vfs.w6.c(path, sb7 + '/' + w87Var2.f388974g);
        p05.m4.f350622a.b(5, i17, i18);
    }

    public final com.tencent.mm.sdk.platformtools.o4 b() {
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("WeVision_ModelInfo");
        kotlin.jvm.internal.o.f(M, "getMMKV(...)");
        return M;
    }

    public final void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WeVisModelMgr", "initOtherProcess: ");
        byte[] j17 = b().j("local_info");
        r45.v87 v87Var = f350641c;
        if (j17 != null) {
            try {
                v87Var.parseFrom(j17);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
        }
        g();
    }

    public final void d(long j17) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j18 = b().getLong("cgi_time", 0L);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadRemoteInfoAfterLast: last:");
        sb6.append(j18);
        sb6.append(" diff:");
        long j19 = currentTimeMillis - j18;
        sb6.append(j19);
        sb6.append(", ");
        sb6.append(j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.WeVisModelMgr", sb6.toString());
        ((ku5.t0) ku5.t0.f312615d).A("WeVisModelMgr_cgi");
        if (j19 >= j17) {
            ((ku5.t0) ku5.t0.f312615d).h(p05.n3.f350627d, "WeVisModelMgr_cgi");
        } else {
            ((ku5.t0) ku5.t0.f312615d).l(p05.o3.f350632d, (j18 + j17) - currentTimeMillis, "WeVisModelMgr_cgi");
        }
    }

    public final void e() {
        java.util.LinkedList linkedList = f350643e;
        linkedList.clear();
        java.util.LinkedList NewConfigList = f350642d.f387993d;
        kotlin.jvm.internal.o.f(NewConfigList, "NewConfigList");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(NewConfigList, 10));
        java.util.Iterator it = NewConfigList.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((r45.w87) it.next()).f388971d));
        }
        linkedList.addAll(kz5.n0.Q(arrayList));
    }

    public final void f() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WeVisModelMgr", "updateLocalModelInfo: ");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList<r45.w87> NewConfigList = f350642d.f387993d;
        kotlin.jvm.internal.o.f(NewConfigList, "NewConfigList");
        for (r45.w87 w87Var : NewConfigList) {
            p05.r3 r3Var = p05.r3.f350674a;
            if (((java.lang.String) p05.r3.f350677d.get(java.lang.Integer.valueOf(w87Var.f388971d))) != null) {
                java.lang.String Ni = ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Ni(w87Var.f388971d, w87Var.f388972e);
                boolean z17 = false;
                if (!(Ni == null || Ni.length() == 0) && kotlin.jvm.internal.o.b(Ni, w87Var.f388973f)) {
                    if (!linkedList.isEmpty()) {
                        java.util.Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            if (((r45.w87) it.next()).f388971d == w87Var.f388971d) {
                                break;
                            }
                        }
                    }
                    z17 = true;
                    if (z17) {
                        linkedList.add(w87Var);
                    }
                }
            }
        }
        r45.v87 v87Var = f350641c;
        v87Var.f387993d = linkedList;
        b().H("local_info", pm0.v.D(v87Var));
        com.tencent.mm.sdk.platformtools.o4 b17 = b();
        if (tq5.i.f421269a == 0) {
            tq5.i.f421269a = 2014500;
        }
        b17.putInt("sdk_version", tq5.i.f421269a);
        g();
        int i17 = com.tencent.mm.plugin.xlabeffect.WeVisUpdateReceiver.f188595a;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            android.content.Intent intent = new android.content.Intent("com.tencent.mm.WeVisUpdate");
            intent.putExtra("type", "wevis_model");
            intent.setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
            com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(intent);
        }
    }

    public final void g() {
        java.util.LinkedList linkedList = f350640b;
        synchronized (linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WeVisModelMgr", "updateLocalModelList: ");
            linkedList.clear();
            java.util.LinkedList<r45.w87> NewConfigList = f350641c.f387993d;
            kotlin.jvm.internal.o.f(NewConfigList, "NewConfigList");
            for (r45.w87 w87Var : NewConfigList) {
                p05.r3 r3Var = p05.r3.f350674a;
                java.lang.String str = (java.lang.String) p05.r3.f350677d.get(java.lang.Integer.valueOf(w87Var.f388971d));
                if (str != null && w87Var.f388973f != null && w87Var.f388974g != null) {
                    p05.q3 q3Var = new p05.q3();
                    q3Var.f350656a = str;
                    java.lang.String md52 = w87Var.f388973f;
                    kotlin.jvm.internal.o.f(md52, "md5");
                    q3Var.f350659d = md52;
                    q3Var.f350657b = w87Var.f388971d;
                    q3Var.f350658c = w87Var.f388972e;
                    java.lang.String filename = w87Var.f388974g;
                    kotlin.jvm.internal.o.f(filename, "filename");
                    q3Var.f350660e = filename;
                    com.tencent.mars.xlog.Log.i("MicroMsg.WeVisModelMgr", "updateLocalModelList: " + str + ", " + w87Var.f388971d + '.' + w87Var.f388972e + ", " + w87Var.f388973f + ", " + w87Var.f388974g);
                    f350640b.add(q3Var);
                }
            }
        }
    }
}

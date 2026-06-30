package s52;

/* loaded from: classes15.dex */
public final class b {

    /* renamed from: h, reason: collision with root package name */
    public static volatile s52.b f403159h;

    /* renamed from: b, reason: collision with root package name */
    public e42.i0 f403161b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f403164e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f403165f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f403166g = true;

    /* renamed from: a, reason: collision with root package name */
    public final s52.a f403160a = new s52.a();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f403162c = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f403163d = new java.util.concurrent.CopyOnWriteArrayList();

    public static s52.b d() {
        if (f403159h == null) {
            synchronized (s52.b.class) {
                if (f403159h == null) {
                    f403159h = new s52.b();
                }
            }
        }
        return f403159h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x01de, code lost:
    
        if ("com.tencent.mm.plugin.sns.ui.SnsUploadUI".equals(r1) != false) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(int r19, java.lang.String r20, int r21, long r22) {
        /*
            Method dump skipped, instructions count: 1316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s52.b.f(int, java.lang.String, int, long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a9, code lost:
    
        if (r12 == r3.intValue()) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.lang.String r11, int r12) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s52.b.a(java.lang.String, int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.String r24, int r25, long r26) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s52.b.b(java.lang.String, int, long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d7, code lost:
    
        if (r13 == false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.String r17, int r18, long r19) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s52.b.c(java.lang.String, int, long):void");
    }

    public final nm5.c e(java.lang.String str, int i17) {
        r45.b2 e17;
        f52.c b17 = f52.c.b();
        try {
            nm5.b d17 = b17.d();
            nm5.b c17 = b17.c();
            if (str == null) {
                com.tencent.mars.xlog.Log.e("HABBYGE-MALI.HellFrontBackMonitor", "isFront2BackOnStop: illeagal Event");
                return null;
            }
            java.lang.String str2 = (java.lang.String) d17.a(0);
            if ("com.tencent.mm.plugin.setting.ui.setting.FakeSwitchAccountUI".equals(str2)) {
                com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellFrontBackMonitor", "isFakeSwitchAccountUI true");
                return null;
            }
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellFrontBackMonitor", "isFront2BackOnStop: Resume: %s, Pause: %s, Stop: %s", d17, c17, str);
            java.lang.Integer num = (java.lang.Integer) d17.a(1);
            java.lang.Integer num2 = (java.lang.Integer) c17.a(1);
            boolean z17 = (str.equals(str2) && str.equals(c17.a(0))) && (num != null && num2 != null && i17 == num.intValue() && i17 == num2.intValue());
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellFrontBackMonitor", "isFront2BackOnStop, case-1：%b", java.lang.Boolean.valueOf(z17));
            if (z17 && !"com.tencent.mm.plugin.voip.ui.VideoActivity".equals(str) && !"com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity".equals(str) && (e17 = b17.e()) != null) {
                r45.bn6 bn6Var = e17.f370434d;
                com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellFrontBackMonitor", "isFront2BackOnStop isEvent8: %s, %s", bn6Var.f370900d, java.lang.Integer.valueOf(bn6Var.f370901e));
                if (e17.f370434d.f370900d.startsWith("com.tencent.mm")) {
                    r45.bn6 bn6Var2 = e17.f370434d;
                    if (bn6Var2.f370901e <= 0 && !bn6Var2.f370900d.equals(str)) {
                        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellFrontBackMonitor", "isFront2BackOnStop isEvent8-1: false");
                        z17 = false;
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellFrontBackMonitor", "isFront2BackOnStop: NOT wx activity");
                }
            }
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellFrontBackMonitor", "isFront2BackOnStop case1 && case2：%b", java.lang.Boolean.valueOf(z17));
            return nm5.j.d(str, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.HellFrontBackMonitor", e18, "isFront2BackOnStop", new java.lang.Object[0]);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(932L, 43L, 1L, false);
            return null;
        }
    }

    public void g(int i17) {
        s52.a aVar = this.f403160a;
        r45.i53 a17 = aVar.a();
        if (a17 == null) {
            a17 = new r45.i53();
        }
        a17.f376740d = i17;
        aVar.b(a17);
    }
}

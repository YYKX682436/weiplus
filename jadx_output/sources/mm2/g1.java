package mm2;

/* loaded from: classes3.dex */
public final class g1 extends mm2.e {
    public java.lang.String A;
    public long A6;
    public boolean B;
    public r45.n73 C;
    public final java.lang.String D;

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f329068f;

    /* renamed from: g, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f329069g;

    /* renamed from: h, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f329070h;

    /* renamed from: i, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f329071i;

    /* renamed from: m, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f329072m;

    /* renamed from: n, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f329073n;

    /* renamed from: o, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f329074o;

    /* renamed from: p, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f329075p;

    /* renamed from: q, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f329076q;

    /* renamed from: r, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f329077r;

    /* renamed from: s, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f329078s;

    /* renamed from: t, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f329079t;

    /* renamed from: u, reason: collision with root package name */
    public r45.a45 f329080u;

    /* renamed from: v, reason: collision with root package name */
    public byte[] f329081v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.Integer f329082w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.Long f329083x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f329084y;

    /* renamed from: z, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f329085z;

    /* renamed from: z6, reason: collision with root package name */
    public int f329086z6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f329068f = kotlinx.coroutines.flow.i3.a(null);
        this.f329069g = kotlinx.coroutines.flow.i3.a(java.lang.Boolean.FALSE);
        this.f329070h = kotlinx.coroutines.flow.i3.a(null);
        this.f329071i = kotlinx.coroutines.flow.i3.a(null);
        this.f329072m = kotlinx.coroutines.flow.i3.a(null);
        this.f329073n = kotlinx.coroutines.flow.i3.a(null);
        this.f329074o = kotlinx.coroutines.flow.i3.a(null);
        this.f329075p = kotlinx.coroutines.flow.i3.a(null);
        this.f329076q = kotlinx.coroutines.flow.i3.a(null);
        this.f329077r = kotlinx.coroutines.flow.i3.a(null);
        this.f329078s = kotlinx.coroutines.flow.i3.a(new mm2.y6(liveContext));
        this.f329079t = kotlinx.coroutines.flow.i3.a(null);
        this.f329085z = kotlinx.coroutines.flow.i3.a(null);
        this.A = "";
        this.D = "|";
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0028 A[Catch: Exception -> 0x00a7, TryCatch #0 {Exception -> 0x00a7, blocks: (B:3:0x0002, B:5:0x0016, B:9:0x0020, B:13:0x0028, B:14:0x0048, B:16:0x004e, B:18:0x0060, B:19:0x006b, B:23:0x0066), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[Catch: Exception -> 0x00a7, TryCatch #0 {Exception -> 0x00a7, blocks: (B:3:0x0002, B:5:0x0016, B:9:0x0020, B:13:0x0028, B:14:0x0048, B:16:0x004e, B:18:0x0060, B:19:0x006b, B:23:0x0066), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N6() {
        /*
            r11 = this;
            java.lang.String r0 = "StrengthenPoi"
            gm0.b0 r1 = gm0.j1.u()     // Catch: java.lang.Exception -> La7
            com.tencent.mm.storage.n3 r1 = r1.c()     // Catch: java.lang.Exception -> La7
            com.tencent.mm.storage.u3 r2 = com.tencent.mm.storage.u3.FINDER_LIVE_POST_POI_STRENGTHEN_SHOW_TIME_STRING_SYNC     // Catch: java.lang.Exception -> La7
            java.lang.String r3 = ""
            java.lang.String r4 = r1.v(r2, r3)     // Catch: java.lang.Exception -> La7
            r1 = 0
            r2 = 1
            if (r4 == 0) goto L1f
            int r3 = r4.length()     // Catch: java.lang.Exception -> La7
            if (r3 != 0) goto L1d
            goto L1f
        L1d:
            r3 = r1
            goto L20
        L1f:
            r3 = r2
        L20:
            r3 = r3 ^ r2
            if (r3 == 0) goto L25
            r3 = r4
            goto L26
        L25:
            r3 = 0
        L26:
            if (r3 == 0) goto L66
            kotlin.jvm.internal.o.d(r4)     // Catch: java.lang.Exception -> La7
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch: java.lang.Exception -> La7
            java.lang.String r2 = r11.D     // Catch: java.lang.Exception -> La7
            r5[r1] = r2     // Catch: java.lang.Exception -> La7
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            java.util.List r1 = r26.n0.f0(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> La7
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Exception -> La7
            r3 = 10
            int r3 = kz5.d0.q(r1, r3)     // Catch: java.lang.Exception -> La7
            r2.<init>(r3)     // Catch: java.lang.Exception -> La7
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> La7
        L48:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Exception -> La7
            if (r3 == 0) goto L60
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Exception -> La7
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> La7
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Exception -> La7
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> La7
            r2.add(r3)     // Catch: java.lang.Exception -> La7
            goto L48
        L60:
            java.util.LinkedList r1 = new java.util.LinkedList     // Catch: java.lang.Exception -> La7
            r1.<init>(r2)     // Catch: java.lang.Exception -> La7
            goto L6b
        L66:
            java.util.LinkedList r1 = new java.util.LinkedList     // Catch: java.lang.Exception -> La7
            r1.<init>()     // Catch: java.lang.Exception -> La7
        L6b:
            r2 = r1
            int r1 = c01.id.e()     // Catch: java.lang.Exception -> La7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> La7
            r2.add(r1)     // Catch: java.lang.Exception -> La7
            java.lang.String r3 = r11.D     // Catch: java.lang.Exception -> La7
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 62
            r10 = 0
            java.lang.String r1 = kz5.n0.g0(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> La7
            gm0.b0 r2 = gm0.j1.u()     // Catch: java.lang.Exception -> La7
            com.tencent.mm.storage.n3 r2 = r2.c()     // Catch: java.lang.Exception -> La7
            com.tencent.mm.storage.u3 r3 = com.tencent.mm.storage.u3.FINDER_LIVE_POST_POI_STRENGTHEN_SHOW_TIME_STRING_SYNC     // Catch: java.lang.Exception -> La7
            r2.x(r3, r1)     // Catch: java.lang.Exception -> La7
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La7
            r2.<init>()     // Catch: java.lang.Exception -> La7
            java.lang.String r3 = "[addPoiShowRecord] recordArray = "
            r2.append(r3)     // Catch: java.lang.Exception -> La7
            r2.append(r1)     // Catch: java.lang.Exception -> La7
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> La7
            com.tencent.mars.xlog.Log.i(r0, r1)     // Catch: java.lang.Exception -> La7
            goto Lbd
        La7:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "[addPoiShowRecord], e = "
            r2.<init>(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.mars.xlog.Log.i(r0, r1)
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mm2.g1.N6():void");
    }

    public final java.lang.String O6() {
        return this.f329084y;
    }

    public final java.lang.Long P6() {
        return this.f329083x;
    }

    public final java.lang.Integer Q6() {
        return this.f329082w;
    }

    public final kotlinx.coroutines.flow.j2 R6() {
        return this.f329078s;
    }

    public final boolean S6() {
        r45.q12 q12Var = (r45.q12) ((kotlinx.coroutines.flow.h3) this.f329068f).getValue();
        return (q12Var != null ? q12Var.getInteger(0) : 0) == 2 && (q12Var != null ? q12Var.getInteger(1) : 0) == 16;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dd A[Catch: Exception -> 0x01c7, TryCatch #0 {Exception -> 0x01c7, blocks: (B:3:0x0007, B:5:0x0010, B:7:0x0018, B:9:0x003e, B:10:0x004b, B:12:0x0051, B:19:0x0065, B:21:0x0069, B:23:0x0075, B:25:0x007d, B:28:0x008a, B:30:0x008e, B:32:0x0096, B:33:0x009c, B:35:0x00a0, B:37:0x00a8, B:38:0x00ae, B:42:0x00cb, B:46:0x00d5, B:50:0x00dd, B:51:0x00fe, B:53:0x0104, B:55:0x0116, B:56:0x0121, B:59:0x018c, B:71:0x0164, B:72:0x0169, B:74:0x016f, B:79:0x0183, B:85:0x0188, B:86:0x018b, B:90:0x011c), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0164 A[Catch: Exception -> 0x01c7, TryCatch #0 {Exception -> 0x01c7, blocks: (B:3:0x0007, B:5:0x0010, B:7:0x0018, B:9:0x003e, B:10:0x004b, B:12:0x0051, B:19:0x0065, B:21:0x0069, B:23:0x0075, B:25:0x007d, B:28:0x008a, B:30:0x008e, B:32:0x0096, B:33:0x009c, B:35:0x00a0, B:37:0x00a8, B:38:0x00ae, B:42:0x00cb, B:46:0x00d5, B:50:0x00dd, B:51:0x00fe, B:53:0x0104, B:55:0x0116, B:56:0x0121, B:59:0x018c, B:71:0x0164, B:72:0x0169, B:74:0x016f, B:79:0x0183, B:85:0x0188, B:86:0x018b, B:90:0x011c), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011c A[Catch: Exception -> 0x01c7, TryCatch #0 {Exception -> 0x01c7, blocks: (B:3:0x0007, B:5:0x0010, B:7:0x0018, B:9:0x003e, B:10:0x004b, B:12:0x0051, B:19:0x0065, B:21:0x0069, B:23:0x0075, B:25:0x007d, B:28:0x008a, B:30:0x008e, B:32:0x0096, B:33:0x009c, B:35:0x00a0, B:37:0x00a8, B:38:0x00ae, B:42:0x00cb, B:46:0x00d5, B:50:0x00dd, B:51:0x00fe, B:53:0x0104, B:55:0x0116, B:56:0x0121, B:59:0x018c, B:71:0x0164, B:72:0x0169, B:74:0x016f, B:79:0x0183, B:85:0x0188, B:86:0x018b, B:90:0x011c), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean T6() {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mm2.g1.T6():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean U6() {
        /*
            r7 = this;
            java.lang.Class<mm2.e1> r0 = mm2.e1.class
            gk2.e r1 = r7.f328963d
            androidx.lifecycle.c1 r0 = r1.a(r0)
            mm2.e1 r0 = (mm2.e1) r0
            kotlinx.coroutines.flow.j2 r0 = r0.E
            kotlinx.coroutines.flow.h3 r0 = (kotlinx.coroutines.flow.h3) r0
            java.lang.Object r0 = r0.getValue()
            r45.aa0 r0 = (r45.aa0) r0
            int r0 = r0.f369868d
            r45.a45 r1 = r7.f329080u
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L58
            java.util.LinkedList r1 = r1.getList(r3)
            java.lang.String r4 = "getPopup_reminder_control_info(...)"
            kotlin.jvm.internal.o.f(r1, r4)
            java.util.Iterator r1 = r1.iterator()
        L29:
            boolean r4 = r1.hasNext()
            r5 = 0
            if (r4 == 0) goto L43
            java.lang.Object r4 = r1.next()
            r6 = r4
            r45.sa5 r6 = (r45.sa5) r6
            int r6 = r6.getInteger(r3)
            if (r6 != r0) goto L3f
            r6 = r2
            goto L40
        L3f:
            r6 = r3
        L40:
            if (r6 == 0) goto L29
            goto L44
        L43:
            r4 = r5
        L44:
            r45.sa5 r4 = (r45.sa5) r4
            if (r4 == 0) goto L51
            r0 = 2
            boolean r0 = r4.getBoolean(r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
        L51:
            if (r5 == 0) goto L58
            boolean r0 = r5.booleanValue()
            goto L59
        L58:
            r0 = r3
        L59:
            if (r0 == 0) goto L74
            kotlinx.coroutines.flow.j2 r0 = r7.f329076q
            kotlinx.coroutines.flow.h3 r0 = (kotlinx.coroutines.flow.h3) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L70
            int r0 = r0.length()
            if (r0 != 0) goto L6e
            goto L70
        L6e:
            r0 = r3
            goto L71
        L70:
            r0 = r2
        L71:
            if (r0 == 0) goto L74
            goto L75
        L74:
            r2 = r3
        L75:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: mm2.g1.U6():boolean");
    }

    public final void V6(r45.n73 n73Var) {
        java.lang.String str;
        r45.z53 z53Var;
        this.C = n73Var;
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_LAST_POST_GAME_SUB_MODE_STRING_SYNC;
        if (n73Var == null || (z53Var = (r45.z53) n73Var.getCustom(1)) == null || (str = z53Var.getString(0)) == null) {
            str = "";
        }
        c17.x(u3Var, str);
    }

    public final void W6(int i17) {
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_VIDEO_LIVE_ENABLE_AUDIENCE_NICKNAME_INT_SYNC, java.lang.Integer.valueOf(i17));
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
    }
}

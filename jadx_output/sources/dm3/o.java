package dm3;

/* loaded from: classes11.dex */
public class o extends al5.a0 {

    /* renamed from: e, reason: collision with root package name */
    public final pj4.j0 f241715e;

    /* renamed from: f, reason: collision with root package name */
    public final pj4.t f241716f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f241717g;

    /* renamed from: h, reason: collision with root package name */
    public b66.n f241718h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.mv.ui.open.text_status.TingMusicLyricsView f241719i;

    /* renamed from: m, reason: collision with root package name */
    public final qk.g9 f241720m;

    /* renamed from: n, reason: collision with root package name */
    public r45.xs4 f241721n;

    /* renamed from: o, reason: collision with root package name */
    public r45.hf2 f241722o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f241723p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f241724q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f241725r;

    /* renamed from: s, reason: collision with root package name */
    public qk.a9 f241726s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f241727t;

    /* renamed from: u, reason: collision with root package name */
    public java.util.concurrent.Future f241728u;

    /* renamed from: v, reason: collision with root package name */
    public final b66.t f241729v;

    public o(java.lang.String str, android.widget.FrameLayout container, pj4.j0 j0Var, pj4.t tVar, int i17) {
        java.lang.String string;
        com.tencent.mm.plugin.mv.ui.open.text_status.TingMusicLyricsView tingMusicLyricsView;
        kotlin.jvm.internal.o.g(container, "container");
        this.f241715e = j0Var;
        this.f241716f = tVar;
        this.f241717g = "MicroMsg.MusicPullDownViewNew" + hashCode();
        this.f241720m = (qk.g9) i95.n0.c(qk.g9.class);
        this.f241723p = "";
        android.content.Context context = container.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.mv.ui.open.text_status.TingMusicLyricsView tingMusicLyricsView2 = new com.tencent.mm.plugin.mv.ui.open.text_status.TingMusicLyricsView(context);
        container.addView(tingMusicLyricsView2);
        this.f241719i = tingMusicLyricsView2;
        try {
            n();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(m(), " exp: " + e17.getMessage());
        }
        r45.xs4 xs4Var = this.f241721n;
        if (xs4Var == null || (string = xs4Var.getString(15)) == null) {
            r45.hf2 hf2Var = this.f241722o;
            string = hf2Var != null ? hf2Var.getString(6) : null;
        }
        if (string != null && (tingMusicLyricsView = this.f241719i) != null) {
            tingMusicLyricsView.setupLyricContent(string);
        }
        this.f241729v = new dm3.m(this);
    }

    @Override // al5.a0
    public void b() {
        com.tencent.mars.xlog.Log.i(m(), "beforeJumpDetail: " + this.f241725r);
        this.f241725r = false;
    }

    @Override // al5.a0
    public void c() {
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    @Override // al5.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g() {
        /*
            r4 = this;
            r0 = 0
            r4.f5862d = r0
            r4.f241727t = r0
            java.util.concurrent.Future r1 = r4.f241728u
            r2 = 0
            if (r1 == 0) goto L13
            boolean r0 = r1.cancel(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L14
        L13:
            r0 = r2
        L14:
            b66.n r1 = r4.f241718h
            if (r1 == 0) goto L1f
            b66.q r1 = (b66.q) r1
            java.lang.String r1 = r1.d()
            goto L20
        L1f:
            r1 = r2
        L20:
            if (r1 == 0) goto L5a
            qk.g9 r1 = r4.f241720m
            rk4.z8 r1 = (rk4.z8) r1
            r1.getClass()
            jm4.g3 r1 = zk4.l.f473540c
            if (r1 == 0) goto L34
            b66.q r1 = (b66.q) r1
            java.lang.String r1 = r1.d()
            goto L35
        L34:
            r1 = r2
        L35:
            b66.n r3 = r4.f241718h
            if (r3 == 0) goto L40
            b66.q r3 = (b66.q) r3
            java.lang.String r3 = r3.d()
            goto L41
        L40:
            r3 = r2
        L41:
            boolean r1 = kotlin.jvm.internal.o.b(r1, r3)
            if (r1 != 0) goto L5a
            java.lang.String r1 = r4.m()
            java.lang.String r3 = "onPostClose stop current task"
            com.tencent.mars.xlog.Log.i(r1, r3)
            b66.n r1 = r4.f241718h
            if (r1 == 0) goto L63
            b66.q r1 = (b66.q) r1
            r1.stop()
            goto L63
        L5a:
            java.lang.String r1 = r4.m()
            java.lang.String r3 = "onPostClose task not change"
            com.tencent.mars.xlog.Log.i(r1, r3)
        L63:
            b66.n r1 = r4.f241718h
            if (r1 == 0) goto L6e
            b66.t r3 = r4.f241729v
            b66.q r1 = (b66.q) r1
            r1.j(r3)
        L6e:
            r4.f241718h = r2
            java.lang.String r1 = r4.m()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "onPostClose cancelRet: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.mars.xlog.Log.i(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dm3.o.g():void");
    }

    @Override // bm5.s0
    public java.lang.String getTag() {
        return "MusicPullDownViewNew";
    }

    @Override // al5.a0
    public void h() {
        java.lang.String str;
        b66.n nVar;
        this.f5862d = true;
        com.tencent.mm.plugin.mv.ui.open.text_status.TingMusicLyricsView tingMusicLyricsView = this.f241719i;
        if (tingMusicLyricsView != null) {
            tingMusicLyricsView.a();
        }
        ((rk4.z8) this.f241720m).nj();
        this.f241724q = true;
        r45.hf2 hf2Var = this.f241722o;
        if (hf2Var == null) {
            com.tencent.mars.xlog.Log.e(m(), "musicShareObject is  null ");
            return;
        }
        bw5.lp0 b17 = com.tencent.mm.plugin.finder.storage.oa0.f127302a.b(hf2Var, dm3.k.b(this.f241715e, hf2Var), this.f241721n);
        if (this.f241718h != null) {
            com.tencent.mars.xlog.Log.i(m(), "onPostOpenInner do not createPlayer");
            return;
        }
        b66.g o17 = o();
        b66.n nVar2 = null;
        if (o17 != null && (nVar = (b66.n) urgen.ur_2BA9.UR_882D.UR_2B77(((b66.i) o17).getCppPointer())) != null) {
            if (nVar instanceof jm4.g3) {
                ((ef0.l4) ((qk.i9) i95.n0.c(qk.i9.class))).getClass();
                ul4.i iVar = new ul4.i(bw5.eq0.StandAlone, null, new com.tencent.unit_rc.WeakPtr(nVar));
                this.f241726s = iVar;
                urgen.ur_0025.UR_C8FE.UR_4F23(((jm4.h3) ((jm4.g3) nVar)).getCppPointer(), iVar);
            }
            nVar2 = nVar;
        }
        if (nVar2 != null) {
            bw5.hq0 hq0Var = new bw5.hq0();
            hq0Var.f28326d = true;
            hq0Var.f28330h[1] = true;
            byte[] byteArray = hq0Var.toByteArray();
            long cppPointer = ((b66.q) nVar2).getCppPointer();
            kotlin.jvm.internal.o.d(byteArray);
            urgen.ur_2BA9.UR_C8FE.UR_69B0(cppPointer, byteArray);
        }
        this.f241718h = nVar2;
        com.tencent.mars.xlog.Log.i(m(), "onPostOpenInner createPlayer");
        bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
        il4.e eVar = new il4.e(null, 0, 2001, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554427, null);
        pj4.t tVar = this.f241716f;
        if (tVar != null && (str = tVar.f355292h) != null) {
            eVar.f292122s.f292132d.put("textstatus", str);
        }
        il4.l.q(eVar, false, null, b17, 4, null);
        if (nVar2 != null) {
            ((b66.q) nVar2).a(this.f241729v);
        }
        int i17 = jm4.m3.f300398e;
        bw5.lp0[] item = (bw5.lp0[]) kz5.b0.c(b17).toArray(new bw5.lp0[0]);
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.unit_rc.BaseObjectDef baseObjectDef = (jm4.k3) urgen.ur_0025.UR_65C4.UR_0E93(jm4.r5.a(item));
        kotlin.jvm.internal.o.e(baseObjectDef, "null cannot be cast to non-null type com.tencent.mm.plugin.ting.ur.PlayTaskService");
        ((b66.c) baseObjectDef).e(2001);
        if (nVar2 != null) {
            urgen.ur_2BA9.UR_C8FE.UR_EC42(((b66.q) nVar2).getCppPointer(), baseObjectDef, 0);
        }
    }

    @Override // al5.a0
    public void i() {
        this.f241724q = false;
        com.tencent.mars.xlog.Log.i(m(), "onPreClose needShowFloatBallWhenClose: " + this.f241725r);
        if (this.f241725r) {
            ((com.tencent.mm.feature.textstatus.StatusThirdShareFeatureService) ((xe0.g0) i95.n0.c(xe0.g0.class))).getClass();
            bk4.d1.f21452a.a(true);
        }
    }

    @Override // al5.a0
    public void j() {
        this.f241725r = ((rk4.y4) ((qk.s8) i95.n0.c(qk.s8.class))).wi();
        com.tencent.mars.xlog.Log.i(m(), "onPreOpen hasTingFloatBallBefore: " + this.f241725r);
        ((com.tencent.mm.feature.textstatus.StatusThirdShareFeatureService) ((xe0.g0) i95.n0.c(xe0.g0.class))).getClass();
        bk4.d1.f21452a.a(false);
    }

    @Override // al5.a0
    public void k(float f17) {
    }

    public java.lang.String m() {
        return this.f241717g;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048 A[Catch: all -> 0x00d4, Exception -> 0x00d6, TryCatch #1 {Exception -> 0x00d6, blocks: (B:7:0x001a, B:9:0x0023, B:11:0x003c, B:16:0x0048, B:18:0x004c, B:19:0x0052, B:20:0x0065, B:22:0x0074, B:23:0x007c, B:25:0x0082, B:26:0x0089, B:28:0x008f, B:29:0x0097, B:31:0x009d, B:32:0x00a3, B:38:0x0057, B:40:0x005b), top: B:6:0x001a, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074 A[Catch: all -> 0x00d4, Exception -> 0x00d6, TryCatch #1 {Exception -> 0x00d6, blocks: (B:7:0x001a, B:9:0x0023, B:11:0x003c, B:16:0x0048, B:18:0x004c, B:19:0x0052, B:20:0x0065, B:22:0x0074, B:23:0x007c, B:25:0x0082, B:26:0x0089, B:28:0x008f, B:29:0x0097, B:31:0x009d, B:32:0x00a3, B:38:0x0057, B:40:0x005b), top: B:6:0x001a, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0082 A[Catch: all -> 0x00d4, Exception -> 0x00d6, TryCatch #1 {Exception -> 0x00d6, blocks: (B:7:0x001a, B:9:0x0023, B:11:0x003c, B:16:0x0048, B:18:0x004c, B:19:0x0052, B:20:0x0065, B:22:0x0074, B:23:0x007c, B:25:0x0082, B:26:0x0089, B:28:0x008f, B:29:0x0097, B:31:0x009d, B:32:0x00a3, B:38:0x0057, B:40:0x005b), top: B:6:0x001a, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f A[Catch: all -> 0x00d4, Exception -> 0x00d6, TryCatch #1 {Exception -> 0x00d6, blocks: (B:7:0x001a, B:9:0x0023, B:11:0x003c, B:16:0x0048, B:18:0x004c, B:19:0x0052, B:20:0x0065, B:22:0x0074, B:23:0x007c, B:25:0x0082, B:26:0x0089, B:28:0x008f, B:29:0x0097, B:31:0x009d, B:32:0x00a3, B:38:0x0057, B:40:0x005b), top: B:6:0x001a, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d A[Catch: all -> 0x00d4, Exception -> 0x00d6, TryCatch #1 {Exception -> 0x00d6, blocks: (B:7:0x001a, B:9:0x0023, B:11:0x003c, B:16:0x0048, B:18:0x004c, B:19:0x0052, B:20:0x0065, B:22:0x0074, B:23:0x007c, B:25:0x0082, B:26:0x0089, B:28:0x008f, B:29:0x0097, B:31:0x009d, B:32:0x00a3, B:38:0x0057, B:40:0x005b), top: B:6:0x001a, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0057 A[Catch: all -> 0x00d4, Exception -> 0x00d6, TryCatch #1 {Exception -> 0x00d6, blocks: (B:7:0x001a, B:9:0x0023, B:11:0x003c, B:16:0x0048, B:18:0x004c, B:19:0x0052, B:20:0x0065, B:22:0x0074, B:23:0x007c, B:25:0x0082, B:26:0x0089, B:28:0x008f, B:29:0x0097, B:31:0x009d, B:32:0x00a3, B:38:0x0057, B:40:0x005b), top: B:6:0x001a, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n() {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dm3.o.n():void");
    }

    public final jm4.n2 o() {
        jm4.u2 a17 = jm4.w2.f300435d.a();
        if (a17 == null) {
            return null;
        }
        return ((jm4.w2) a17).a(bw5.eq0.TingMusic);
    }
}

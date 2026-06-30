package i53;

/* loaded from: classes8.dex */
public class t {

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String f288713n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String f288714o;

    /* renamed from: p, reason: collision with root package name */
    public static i53.t f288715p;

    /* renamed from: c, reason: collision with root package name */
    public p33.q f288718c;

    /* renamed from: j, reason: collision with root package name */
    public int f288725j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f288726k;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f288716a = new java.lang.Object();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f288717b = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f288719d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f288720e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f288721f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public boolean f288722g = false;

    /* renamed from: l, reason: collision with root package name */
    public i53.s f288727l = null;

    /* renamed from: m, reason: collision with root package name */
    public int f288728m = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f288723h = com.tencent.mm.sdk.platformtools.o4.M(b("game_haowan_mmkv_key")).getString("game_remote_ticket", null);

    /* renamed from: i, reason: collision with root package name */
    public long f288724i = com.tencent.mm.sdk.platformtools.o4.M(b("game_haowan_mmkv_key")).getLong("game_local_ticket", 0);

    static {
        java.lang.String str = com.tencent.mm.plugin.game.commlib.util.m.e(com.tencent.mm.plugin.game.commlib.util.l.PERMANENT) + "haowan/";
        f288713n = str;
        f288714o = str + "haowan_gallery_cache";
    }

    public t() {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(f288713n);
        if (r6Var.m() && r6Var.y()) {
            return;
        }
        r6Var.J();
    }

    public static java.lang.String b(java.lang.String str) {
        int i17 = gm0.m.i();
        if (i17 == 0) {
            return str;
        }
        return str + "_" + new kk.v(i17).toString();
    }

    public static void g(int i17) {
        com.tencent.mm.sdk.platformtools.o4.M(b("game_haowan_mmkv_key")).putInt("game_last_choose_gallery", i17);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            r5 = this;
            p33.m r0 = new p33.m
            r0.<init>()
            java.util.LinkedList r1 = r5.f288719d
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            r3 = -1
            if (r2 == 0) goto L26
            java.lang.Object r2 = r1.next()
            p33.l r2 = (p33.l) r2
            boolean r2 = r2.f351604f
            if (r2 == 0) goto Lb
            java.util.LinkedList r1 = r5.f288719d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            int r3 = r1.indexOf(r2)
        L26:
            if (r3 <= 0) goto L2d
            java.util.LinkedList r1 = r5.f288719d
            r1.remove(r3)
        L2d:
            java.util.LinkedList r1 = r5.f288719d
            r0.f351622d = r1
            com.tencent.mm.vfs.r6 r1 = new com.tencent.mm.vfs.r6
            java.lang.String r2 = i53.t.f288713n
            r1.<init>(r2)
            boolean r2 = r1.m()
            if (r2 == 0) goto L44
            boolean r2 = r1.y()
            if (r2 != 0) goto L47
        L44:
            r1.J()
        L47:
            r1 = 0
            byte[] r0 = r0.toByteArray()     // Catch: java.io.IOException -> L59
            java.lang.String r2 = i53.t.f288714o     // Catch: java.io.IOException -> L59
            r3 = 0
            java.io.OutputStream r2 = com.tencent.mm.vfs.w6.K(r2, r3)     // Catch: java.io.IOException -> L59
            r2.write(r0)     // Catch: java.io.IOException -> L57
            goto L72
        L57:
            r0 = move-exception
            goto L5b
        L59:
            r0 = move-exception
            r2 = r1
        L5b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "cacheData: "
            r3.<init>(r4)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "MicroMsg.GameHaowanDataCenter"
            com.tencent.mars.xlog.Log.e(r3, r0)
        L72:
            if (r2 == 0) goto L77
            r2.close()     // Catch: java.io.IOException -> L77
        L77:
            i53.t.f288715p = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i53.t.a():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:11|12|(8:46|16|17|18|19|(3:21|(4:24|(3:29|30|31)|32|22)|37)|38|39)|15|16|17|18|19|(0)|38|39) */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063 A[Catch: Exception -> 0x0057, TryCatch #2 {Exception -> 0x0057, blocks: (B:12:0x0029, B:16:0x0045, B:18:0x0053, B:19:0x0059, B:21:0x0063, B:22:0x0069, B:24:0x006f, B:27:0x0079, B:30:0x007e, B:38:0x0084, B:44:0x0036, B:46:0x0043), top: B:11:0x0029 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.LinkedList c() {
        /*
            r11 = this;
            r0 = 0
            java.lang.String r1 = i53.t.f288714o     // Catch: java.lang.Exception -> L87
            com.tencent.mm.vfs.z7 r2 = com.tencent.mm.vfs.z7.a(r1)     // Catch: java.lang.Exception -> L87
            java.lang.String r3 = r2.f213279f
            if (r3 == 0) goto L25
            r4 = 0
            java.lang.String r8 = com.tencent.mm.vfs.e8.l(r3, r4, r4)     // Catch: java.lang.Exception -> L87
            boolean r3 = r3.equals(r8)     // Catch: java.lang.Exception -> L87
            if (r3 != 0) goto L25
            com.tencent.mm.vfs.z7 r3 = new com.tencent.mm.vfs.z7     // Catch: java.lang.Exception -> L87
            java.lang.String r6 = r2.f213277d     // Catch: java.lang.Exception -> L87
            java.lang.String r7 = r2.f213278e     // Catch: java.lang.Exception -> L87
            java.lang.String r9 = r2.f213280g     // Catch: java.lang.Exception -> L87
            java.lang.String r10 = r2.f213281h     // Catch: java.lang.Exception -> L87
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L87
            r2 = r3
        L25:
            java.io.InputStream r1 = com.tencent.mm.vfs.w6.E(r1)     // Catch: java.lang.Exception -> L87
            com.tencent.mm.vfs.b3 r3 = com.tencent.mm.vfs.a3.f212781a     // Catch: java.lang.Exception -> L57
            com.tencent.mm.vfs.z2 r2 = r3.m(r2, r0)     // Catch: java.lang.Exception -> L57
            boolean r3 = r2.a()     // Catch: java.lang.Exception -> L57
            if (r3 != 0) goto L36
            goto L40
        L36:
            com.tencent.mm.vfs.q2 r3 = r2.f213266a     // Catch: java.lang.Exception -> L57
            java.lang.String r2 = r2.f213267b     // Catch: java.lang.Exception -> L57
            com.tencent.mm.vfs.x1 r2 = r3.m(r2)     // Catch: java.lang.Exception -> L57
            if (r2 != 0) goto L43
        L40:
            r2 = 0
            goto L45
        L43:
            long r2 = r2.f213233c     // Catch: java.lang.Exception -> L57
        L45:
            int r2 = (int) r2     // Catch: java.lang.Exception -> L57
            byte[] r2 = new byte[r2]     // Catch: java.lang.Exception -> L57
            r1.read(r2)     // Catch: java.lang.Exception -> L57
            p33.m r3 = new p33.m     // Catch: java.lang.Exception -> L57
            r3.<init>()     // Catch: java.lang.Exception -> L57
            r3.parseFrom(r2)     // Catch: java.lang.Exception -> L57
            r1.close()     // Catch: java.lang.Exception -> L57 java.io.IOException -> L59
            goto L59
        L57:
            r2 = move-exception
            goto L8a
        L59:
            java.util.LinkedList r2 = r3.f351622d     // Catch: java.lang.Exception -> L57
            r11.f288719d = r2     // Catch: java.lang.Exception -> L57
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.L0(r2)     // Catch: java.lang.Exception -> L57
            if (r2 != 0) goto L84
            java.util.LinkedList r2 = r11.f288719d     // Catch: java.lang.Exception -> L57
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> L57
        L69:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Exception -> L57
            if (r4 == 0) goto L84
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Exception -> L57
            p33.l r4 = (p33.l) r4     // Catch: java.lang.Exception -> L57
            boolean r5 = r4.f351603e     // Catch: java.lang.Exception -> L57
            if (r5 != 0) goto L69
            boolean r5 = r4.f351604f     // Catch: java.lang.Exception -> L57
            if (r5 == 0) goto L7e
            goto L69
        L7e:
            java.util.LinkedList r5 = r11.f288720e     // Catch: java.lang.Exception -> L57
            r5.add(r4)     // Catch: java.lang.Exception -> L57
            goto L69
        L84:
            java.util.LinkedList r0 = r3.f351622d     // Catch: java.lang.Exception -> L57
            return r0
        L87:
            r1 = move-exception
            r2 = r1
            r1 = r0
        L8a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "parseGlobalConfig: "
            r3.<init>(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "MicroMsg.GameHaowanDataCenter"
            com.tencent.mars.xlog.Log.e(r3, r2)
            if (r1 == 0) goto La6
            r1.close()     // Catch: java.io.IOException -> La6
        La6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i53.t.c():java.util.LinkedList");
    }

    public void d(i53.q qVar) {
        if (this.f288722g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameHaowanDataCenter", "gettingDataFromNet, return");
            return;
        }
        this.f288722g = true;
        p33.p pVar = new p33.p();
        p33.q qVar2 = this.f288718c;
        long j17 = qVar2 != null ? qVar2.f351635h : 0L;
        pVar.f351628d = j17;
        if (j17 == 0) {
            pVar.f351630f = this.f288723h;
        }
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(qVar);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70666c = "/cgi-bin/mmgame-bin/getuservideolist";
        lVar.f70667d = 3549;
        lVar.f70664a = pVar;
        lVar.f70665b = new p33.q();
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(lVar.a(), new i53.n(this, pVar, weakReference));
    }

    public final java.util.LinkedList e() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = this.f288717b.values().iterator();
        while (it.hasNext()) {
            linkedList.add(((i53.r) it.next()).f288701c);
        }
        return linkedList;
    }

    public final int f() {
        if (this.f288724i == 0) {
            return 0;
        }
        return i53.k1.b().a(e(), java.lang.System.currentTimeMillis(), this.f288724i + 1);
    }

    public void h(org.json.JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i17);
            i53.r rVar = new i53.r(null);
            rVar.f288699a = optJSONObject.optString("appId");
            rVar.f288700b = optJSONObject.optString("gameName");
            rVar.f288701c = optJSONObject.optString("albumName");
            rVar.f288702d = optJSONObject.optString("defaultTitle");
            this.f288717b.put(rVar.f288701c, rVar);
        }
    }
}

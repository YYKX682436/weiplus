package rn2;

/* loaded from: classes15.dex */
public final class e {

    /* renamed from: r, reason: collision with root package name */
    public static final rn2.a f397695r = new rn2.a(null);

    /* renamed from: s, reason: collision with root package name */
    public static final int f397696s;

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f397697t;

    /* renamed from: u, reason: collision with root package name */
    public static final java.util.ArrayList f397698u;

    /* renamed from: a, reason: collision with root package name */
    public final r45.gz1 f397699a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.gz1 f397700b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.gz1 f397701c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f397702d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f397703e;

    /* renamed from: f, reason: collision with root package name */
    public r45.vc5 f397704f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f397705g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f397706h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f397707i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.LinkedList f397708j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.LinkedList f397709k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f397710l;

    /* renamed from: m, reason: collision with root package name */
    public int f397711m;

    /* renamed from: n, reason: collision with root package name */
    public int f397712n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f397713o;

    /* renamed from: p, reason: collision with root package name */
    public int f397714p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f397715q;

    static {
        ae2.in inVar = ae2.in.f3688a;
        f397696s = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_live_lottery_duration, 15);
        f397697t = new int[]{2, 1, 3, 4, 6};
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dpi);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dpf);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        rn2.b bVar = new rn2.b(string, string2, 0, true, true, 0, 0, null, 224, null);
        java.lang.String string3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dpj);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        java.lang.String string4 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dpg);
        kotlin.jvm.internal.o.f(string4, "getString(...)");
        rn2.b bVar2 = new rn2.b(string3, string4, 1, true, false, 0, 0, null, 224, null);
        java.lang.String string5 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dpk);
        kotlin.jvm.internal.o.f(string5, "getString(...)");
        java.lang.String string6 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dph);
        kotlin.jvm.internal.o.f(string6, "getString(...)");
        f397698u = kz5.c0.d(bVar, bVar2, new rn2.b(string5, string6, 2, true, false, 0, 0, null, 224, null));
    }

    public e() {
        r45.kz0 kz0Var;
        r45.a94 a94Var;
        r45.kz0 kz0Var2;
        r45.a94 a94Var2;
        r45.gz1 gz1Var = new r45.gz1();
        gz1Var.set(0, 0);
        this.f397699a = gz1Var;
        r45.gz1 gz1Var2 = new r45.gz1();
        gz1Var2.set(0, 1);
        gz1Var2.set(1, new r45.yd4());
        this.f397700b = gz1Var2;
        r45.gz1 gz1Var3 = new r45.gz1();
        gz1Var3.set(0, 2);
        r45.vd4 vd4Var = new r45.vd4();
        vd4Var.set(0, -1);
        gz1Var3.set(2, vd4Var);
        this.f397701c = gz1Var3;
        this.f397702d = kz5.z.x0(f397697t);
        kz5.p0 p0Var = kz5.p0.f313996d;
        this.f397703e = p0Var;
        this.f397707i = new java.util.LinkedList();
        this.f397708j = new java.util.LinkedList();
        this.f397709k = new java.util.LinkedList();
        this.f397710l = jz5.h.b(rn2.c.f397658d);
        this.f397711m = 1;
        this.f397712n = 0;
        this.f397713o = p0Var;
        gk2.e eVar = gk2.e.f272471n;
        boolean z17 = !pm0.v.z(eVar != null ? (int) ((mm2.c1) eVar.a(mm2.c1.class)).f328866q : 0, 512);
        this.f397705g = z17;
        gk2.e eVar2 = gk2.e.f272471n;
        boolean z18 = !pm0.v.z(eVar2 != null ? (int) ((mm2.c1) eVar2.a(mm2.c1.class)).f328866q : 0, 8);
        this.f397706h = z18;
        g92.b bVar = g92.b.f269769e;
        m92.b I1 = g92.a.I1(bVar, false, 1, null);
        int i17 = (I1 == null || (kz0Var2 = I1.field_liveInfo) == null || (a94Var2 = (r45.a94) kz0Var2.getCustom(4)) == null) ? 0 : a94Var2.f369858e;
        this.f397711m = i17 == 0 ? 1 : i17;
        m92.b I12 = g92.a.I1(bVar, false, 1, null);
        long j17 = (I12 == null || (kz0Var = I12.field_liveInfo) == null || (a94Var = (r45.a94) kz0Var.getCustom(4)) == null) ? 0L : a94Var.f369857d;
        boolean z19 = pm0.v.z((int) j17, 1);
        com.tencent.mars.xlog.Log.i("FinderLiveLotteryCreateConfig", "setEnableRepeatLottery enableRepeatLottery:" + z19);
        this.f397715q = z19;
        com.tencent.mars.xlog.Log.i("FinderLiveLotteryCreateConfig", "initLiveLotterySetting lotteryType:" + i17 + ", setting_flag:" + j17);
        e();
        this.f397712n = 0;
        f(0);
        com.tencent.mars.xlog.Log.i("FinderLiveLotteryCreateConfig", "init enableLike:" + z17 + ",enableComment:" + z18 + ",enableRepeatLottery:" + this.f397715q + ",currentLotteryType:" + this.f397711m);
    }

    public final rn2.b a() {
        java.util.LinkedList<rn2.b> linkedList = this.f397707i;
        if (linkedList.isEmpty()) {
            e();
        }
        java.lang.Object obj = null;
        for (rn2.b bVar : linkedList) {
            if (bVar.f397646c == this.f397711m) {
                obj = bVar;
            }
        }
        if (obj == null && (!linkedList.isEmpty())) {
            obj = linkedList.get(0);
            this.f397711m = ((rn2.b) linkedList.get(0)).f397646c;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveLotteryCreateConfig", "getLastLotteryType currentLotteryTypeItem:" + obj);
        return (rn2.b) obj;
    }

    public final int b() {
        java.lang.Object obj;
        java.util.Iterator it = this.f397703e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((rn2.b) obj).f397646c == this.f397714p) {
                break;
            }
        }
        if (obj != null) {
            return this.f397714p;
        }
        rn2.b bVar = (rn2.b) kz5.n0.Z(this.f397703e);
        if (bVar != null) {
            return bVar.f397646c;
        }
        return 0;
    }

    public final int c() {
        java.lang.Object obj;
        java.util.Iterator it = this.f397703e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((rn2.b) obj).f397646c == b()) {
                break;
            }
        }
        rn2.b bVar = (rn2.b) obj;
        int i17 = bVar != null ? bVar.f397650g : 0;
        if (i17 > 0) {
            return i17 / 60;
        }
        return 3;
    }

    public final int d() {
        int i17;
        jz5.f0 f0Var;
        r45.a94 a94Var;
        gk2.e eVar = gk2.e.f272471n;
        if (eVar == null || (a94Var = ((on2.z2) eVar.a(on2.z2.class)).f347097r) == null) {
            i17 = 0;
            f0Var = null;
        } else {
            if (this.f397715q) {
                int i18 = (int) a94Var.f369857d;
                java.util.regex.Pattern pattern = pm0.v.f356802a;
                i17 = i18 | 1;
            } else {
                int i19 = (int) a94Var.f369857d;
                java.util.regex.Pattern pattern2 = pm0.v.f356802a;
                i17 = i19 & (-2);
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var != null) {
            return i17;
        }
        if (this.f397715q) {
            java.util.regex.Pattern pattern3 = pm0.v.f356802a;
            return i17 | 1;
        }
        java.util.regex.Pattern pattern4 = pm0.v.f356802a;
        return i17 & (-2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rn2.e.e():void");
    }

    public final void f(int i17) {
        this.f397712n = i17;
        for (rn2.b bVar : (java.util.ArrayList) ((jz5.n) this.f397710l).getValue()) {
            bVar.f397648e = bVar.f397646c == i17;
        }
    }

    public final void g(int i17) {
        this.f397714p = i17;
        for (rn2.b bVar : this.f397703e) {
            bVar.f397648e = bVar.f397646c == i17;
        }
    }
}

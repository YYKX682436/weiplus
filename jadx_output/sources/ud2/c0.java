package ud2;

/* loaded from: classes10.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f426590a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.protocal.protobuf.FinderObject f426591b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.Surface f426592c;

    /* renamed from: d, reason: collision with root package name */
    public int f426593d;

    /* renamed from: e, reason: collision with root package name */
    public int f426594e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f426595f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.storage.FinderItem f426596g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.coroutines.LifecycleScope f426597h;

    /* renamed from: i, reason: collision with root package name */
    public mn0.b0 f426598i;

    /* renamed from: j, reason: collision with root package name */
    public int f426599j;

    /* renamed from: k, reason: collision with root package name */
    public int f426600k;

    /* renamed from: l, reason: collision with root package name */
    public float f426601l;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.uf f426602m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f426603n;

    /* renamed from: o, reason: collision with root package name */
    public ig2.r f426604o;

    /* renamed from: p, reason: collision with root package name */
    public final yz5.a f426605p;

    /* renamed from: q, reason: collision with root package name */
    public final yz5.a f426606q;

    /* renamed from: r, reason: collision with root package name */
    public final yz5.p f426607r;

    /* renamed from: s, reason: collision with root package name */
    public final yz5.l f426608s;

    /* renamed from: t, reason: collision with root package name */
    public yz5.p f426609t;

    /* JADX WARN: Multi-variable type inference failed */
    public c0(android.content.Context context, com.tencent.mm.protocal.protobuf.FinderObject finderObject, android.view.Surface surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f426590a = context;
        this.f426591b = finderObject;
        this.f426592c = surface;
        this.f426593d = i17;
        this.f426594e = i18;
        this.f426595f = "ShowWindowPreviewManagerForWeApp";
        this.f426597h = new com.tencent.mm.sdk.coroutines.LifecycleScope("ShowWindowPreviewManagerForWeApp", context instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context : null, 0, 4, null);
        this.f426602m = new com.tencent.mm.plugin.finder.feed.uf(new android.view.View(context), 1, null, null, null, null, false, null, 240, null);
        this.f426603n = true;
        this.f426605p = new ud2.a0(this);
        this.f426606q = new ud2.y(this);
        this.f426607r = new ud2.z(this);
        this.f426608s = new ud2.x(this);
    }

    public static final void a(ud2.c0 c0Var, android.content.Intent intent) {
        java.lang.String str;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = c0Var.f426596g;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = finderItem != null ? finderItem.getFinderObject() : null;
        java.lang.String str2 = c0Var.f426595f;
        if (finderObject == null) {
            com.tencent.mars.xlog.Log.e(str2, "try enter live when finder object is null");
            return;
        }
        long id6 = finderObject.getId();
        java.lang.String objectNonceId = finderObject.getObjectNonceId();
        r45.nw1 liveInfo = finderObject.getLiveInfo();
        long j17 = liveInfo != null ? liveInfo.getLong(0) : 0L;
        java.lang.String username = finderObject.getUsername();
        if (username == null) {
            username = "";
        }
        com.tencent.mars.xlog.Log.i(str2, "enter live with feedId:" + pm0.v.u(id6) + ", nonceId:" + objectNonceId + ", contextId:" + c0Var.f426590a);
        intent.putExtra("key_enter_live_param_visitor_enter_scene", 1);
        intent.putExtra("LAUNCH_WITH_ANIM", true);
        r45.m84 m84Var = new r45.m84();
        m84Var.set(0, java.lang.Long.valueOf(id6));
        m84Var.set(1, java.lang.Long.valueOf(j17));
        m84Var.set(2, objectNonceId);
        m84Var.set(3, username);
        m84Var.set(4, finderObject.getSessionBuffer());
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
        if (objectDesc == null || (str = objectDesc.getDescription()) == null) {
            str = "";
        }
        m84Var.set(5, str);
        m84Var.set(6, null);
        r45.wk0 wk0Var = new r45.wk0();
        wk0Var.set(0, "");
        wk0Var.set(1, "");
        wk0Var.set(3, -1);
        wk0Var.set(4, -1);
        wk0Var.set(5, 1);
        ss5.e0 e0Var = (ss5.e0) i95.n0.c(ss5.e0.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((vd2.f1) e0Var).Ri(context, intent, m84Var, true, wk0Var, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(ud2.c0 r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ud2.c0.b(ud2.c0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void c(java.lang.String str, java.util.Map map) {
        com.tencent.mars.xlog.Log.i(this.f426595f, "notify event " + str + ", params = " + map);
        map.put("event", str);
        yz5.p pVar = this.f426609t;
        if (pVar != null) {
            java.lang.String gVar = new cl0.g(map).toString();
            kotlin.jvm.internal.o.f(gVar, "toString(...)");
            pVar.invoke("playEvent", gVar);
        }
    }

    public final void d() {
        r45.nw1 liveInfo;
        java.lang.String string;
        r45.ka4 ka4Var;
        java.lang.String str;
        r45.ka4 ka4Var2;
        r45.nw1 liveInfo2;
        r45.ka4 ka4Var3;
        com.tencent.mm.protobuf.g gVar;
        r45.nw1 liveInfo3;
        r45.nw1 liveInfo4;
        r45.ma4 ma4Var;
        com.tencent.mm.protobuf.g gVar2;
        boolean z17 = this.f426603n;
        java.lang.String str2 = this.f426595f;
        if (!z17) {
            com.tencent.mars.xlog.Log.e(str2, this + " try start play when platformview is inActive");
            return;
        }
        mn0.b0 b0Var = this.f426598i;
        if (b0Var != null && ((mn0.y) b0Var).b(false)) {
            com.tencent.mars.xlog.Log.e(str2, this + " try start play when playing");
            return;
        }
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f426596g;
        if (finderItem == null || (liveInfo = finderItem.getFeedObject().getLiveInfo()) == null || (string = liveInfo.getString(3)) == null) {
            return;
        }
        so2.h1 h1Var = new so2.h1(finderItem);
        if (this.f426598i == null) {
            int X = nn0.c.X(false);
            nn0.c cVar = new nn0.c(this.f426590a, (X == 5 || X == 6) ? 2 : 0, false);
            cVar.f(true);
            cVar.J(new ud2.p(this));
            com.tencent.mm.plugin.finder.live.util.n2 n2Var = com.tencent.mm.plugin.finder.live.util.n2.f115640a;
            java.lang.String str3 = this.f426595f;
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem2 = this.f426596g;
            cVar.F(com.tencent.mm.plugin.finder.live.util.n2.b(n2Var, str3, true, finderItem2 != null ? finderItem2.getLiveInfo() : null, null, 0, 0, 56, null));
            cVar.Q(0);
            cVar.K(mn0.d0.f329721t, 19);
            this.f426602m.B = this.f426608s;
            cVar.f329807f.f321128h = new ud2.q(this);
            com.tencent.mars.xlog.Log.i(str2, this + " create new player " + cVar);
            this.f426598i = cVar;
        }
        com.tencent.mars.xlog.Log.i(str2, this + " player " + this.f426598i + " start play, url = " + string);
        mn0.b0 b0Var2 = this.f426598i;
        if (b0Var2 != null) {
            android.view.Surface surface = this.f426592c;
            if (surface != null) {
                b0Var2.v(surface, this.f426593d, this.f426594e);
            }
            qg2.e eVar = qg2.e.f362799a;
            com.tencent.mm.plugin.finder.storage.FinderItem feedObject = h1Var.getFeedObject();
            if (feedObject == null || (liveInfo4 = feedObject.getLiveInfo()) == null || (ma4Var = (r45.ma4) liveInfo4.getCustom(23)) == null || (gVar2 = ma4Var.f380300m) == null) {
                ka4Var = null;
            } else {
                r45.na4 na4Var = new r45.na4();
                na4Var.parseFrom(gVar2.g());
                ka4Var = na4Var.f381197f;
            }
            java.lang.String a17 = eVar.a(string, ka4Var);
            java.lang.String d17 = ko0.t.f309903a.d(a17);
            java.lang.String str4 = d17 == null ? "" : d17;
            com.tencent.mm.plugin.finder.storage.FinderItem feedObject2 = h1Var.getFeedObject();
            if (feedObject2 == null || (str = feedObject2.getNickName()) == null) {
                str = "NULL";
            }
            java.lang.String str5 = str;
            com.tencent.mm.plugin.finder.storage.FinderItem feedObject3 = h1Var.getFeedObject();
            long j17 = (feedObject3 == null || (liveInfo3 = feedObject3.getLiveInfo()) == null) ? 0L : liveInfo3.getLong(0);
            long itemId = h1Var.getItemId();
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            com.tencent.mm.plugin.finder.storage.FinderItem feedObject4 = h1Var.getFeedObject();
            mn0.l0 l0Var = new mn0.l0(str4, str5, j17, itemId, elapsedRealtime, feedObject4 != null ? feedObject4.getLiveInfo() : null);
            mn0.y yVar = (mn0.y) b0Var2;
            yVar.N(l0Var);
            yVar.G(true);
            int i17 = this.f426593d;
            int i18 = this.f426594e;
            this.f426593d = i17;
            this.f426594e = i18;
            mn0.b0 b0Var3 = this.f426598i;
            if (b0Var3 != null) {
                b0Var3.A(i17, i18);
            }
            com.tencent.mm.plugin.finder.storage.FinderItem feedObject5 = h1Var.getFeedObject();
            if (feedObject5 == null || (liveInfo2 = feedObject5.getLiveInfo()) == null) {
                ka4Var2 = null;
            } else {
                r45.ma4 ma4Var2 = (r45.ma4) liveInfo2.getCustom(23);
                if (ma4Var2 == null || (gVar = ma4Var2.f380300m) == null) {
                    ka4Var3 = null;
                } else {
                    r45.na4 na4Var2 = new r45.na4();
                    na4Var2.parseFrom(gVar.g());
                    ka4Var3 = na4Var2.f381197f;
                }
                ka4Var2 = ka4Var3;
            }
            long itemId2 = h1Var.getItemId();
            r45.nw1 liveInfo5 = h1Var.getFeedObject().getLiveInfo();
            long j18 = liveInfo5 != null ? liveInfo5.getLong(0) : 0L;
            r45.p72 p72Var = new r45.p72();
            p72Var.set(0, "");
            p72Var.set(3, java.lang.Long.valueOf(itemId2));
            p72Var.set(4, java.lang.Long.valueOf(j18));
            p72Var.set(1, "WeApp_" + c01.id.c());
            p72Var.set(5, 0);
            mn0.b0.D(b0Var2, a17, 1, ka4Var2, p72Var, false, false, 48, null);
        }
    }
}

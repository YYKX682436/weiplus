package i13;

/* loaded from: classes10.dex */
public final class o extends i13.c implements i50.p {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f287301h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f287302i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f287303m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f287304n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f287305o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f287306p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f287307q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f287308r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f287309s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f287310t;

    /* renamed from: u, reason: collision with root package name */
    public final int f287311u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f287312v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.lang.String forcePushId, java.lang.String avatarUrl, java.lang.String nickname, java.lang.String wording, java.lang.String feedId, java.lang.String liveId, java.lang.String nonceId, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i17, java.lang.String str7) {
        super(forcePushId, 0L, 2, null);
        kotlin.jvm.internal.o.g(forcePushId, "forcePushId");
        kotlin.jvm.internal.o.g(avatarUrl, "avatarUrl");
        kotlin.jvm.internal.o.g(nickname, "nickname");
        kotlin.jvm.internal.o.g(wording, "wording");
        kotlin.jvm.internal.o.g(feedId, "feedId");
        kotlin.jvm.internal.o.g(liveId, "liveId");
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        this.f287301h = nickname;
        this.f287302i = feedId;
        this.f287303m = liveId;
        this.f287304n = nonceId;
        this.f287305o = str;
        this.f287306p = str2;
        this.f287307q = str3;
        this.f287308r = str4;
        this.f287309s = str5;
        this.f287310t = str6;
        this.f287311u = i17;
        this.f287312v = str7;
    }

    @Override // i13.c
    public java.lang.String c() {
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.fep);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // i13.c
    public boolean e() {
        return true;
    }

    @Override // i13.c
    public boolean f() {
        return true;
    }

    @Override // i13.c
    public void g() {
        int i17;
        super.g();
        java.lang.String str = this.f287302i;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String str2 = this.f287310t;
        if (str2 != null) {
            jSONObject.put("push_type", str2);
        }
        java.lang.String str3 = this.f287309s;
        if (str3 != null) {
            jSONObject.put("notice_id", str3);
        }
        i50.q qVar = (i50.q) i95.n0.c(i50.q.class);
        i95.m c17 = i95.n0.c(h13.l0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        if (h13.l0.Ui((h13.l0) c17, null, 1, null)) {
            i95.m c18 = i95.n0.c(h13.l0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            i17 = h13.l0.Vi((h13.l0) c18, null, 1, null) ? 1 : 4;
        } else {
            i95.m c19 = i95.n0.c(h13.l0.class);
            kotlin.jvm.internal.o.f(c19, "getService(...)");
            i17 = h13.l0.Vi((h13.l0) c19, null, 1, null) ? 3 : 2;
        }
        ((h13.c0) qVar).Di(str, i17, 2, this.f287275d, false, jSONObject.toString());
    }

    @Override // in5.c
    public long getItemId() {
        return 0L;
    }

    @Override // in5.c
    public int h() {
        return 1;
    }

    @Override // i13.c
    public void i() {
        int size = k13.l1.I.a().f303239q.size();
        ((h13.c0) ((i50.q) i95.n0.c(i50.q.class))).Ni(3, 2, this.f287302i, size, this.f287275d);
    }

    @Override // i13.c
    public void j() {
        super.j();
        java.lang.String str = this.f287302i;
        if (str == null || str.length() == 0) {
            return;
        }
        r45.jn0 jn0Var = new r45.jn0();
        jn0Var.set(0, java.lang.Long.valueOf(pm0.v.Z(str)));
        jn0Var.set(1, this.f287308r);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("feedActionType", 38);
        jSONObject.put("strValue", this.f287309s);
        jn0Var.set(3, jSONObject.toString());
        jn0Var.set(2, this.f287312v);
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z65.c.a()) {
            db5.t7.m(com.tencent.mm.sdk.platformtools.x2.f193071a, "开始直播liveinfo预加载");
        }
        i95.m c17 = i95.n0.c(s40.w0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        s40.w0 w0Var = (s40.w0) c17;
        long Z = pm0.v.Z(this.f287303m);
        qs5.d dVar = qs5.d.f366426e;
        r45.m71 m71Var = new r45.m71();
        m71Var.set(0, java.lang.Integer.valueOf(this.f287311u));
        m71Var.set(1, 1);
        s40.w0.u9(w0Var, Z, true, null, null, 5, null, null, m71Var, 96, null);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).al(null, 18054, jn0Var);
    }

    @Override // i13.c
    public void k(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        m13.d dVar = m13.d.f322865a;
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        dVar.a(context, this, i13.n.f287297c.a().f287299a.size());
    }

    @Override // i13.c
    public void l(boolean z17) {
        super.l(z17);
        if (z17) {
            int size = k13.l1.I.a().f303239q.size();
            ((h13.c0) ((i50.q) i95.n0.c(i50.q.class))).Ni(2, 2, this.f287302i, size, this.f287275d);
        }
    }

    @Override // i13.c
    public void n(in5.s0 holder, android.view.View view, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(view, "view");
        int size = k13.l1.I.a().f303239q.size();
        m13.d dVar = m13.d.f322865a;
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        dVar.a(context, this, size);
    }

    @Override // i13.c
    public void o() {
        super.o();
        i13.n a17 = i13.n.f287297c.a();
        a17.getClass();
        java.lang.String forcePushId = this.f287275d;
        kotlin.jvm.internal.o.g(forcePushId, "forcePushId");
        a17.f287300b.remove(forcePushId);
        j13.a.f297177d.d(forcePushId);
    }
}

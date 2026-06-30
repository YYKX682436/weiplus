package vx3;

/* loaded from: classes10.dex */
public class i {
    public static final vx3.h D = new vx3.h(null);
    public java.lang.String A;
    public java.lang.String B;
    public boolean C;

    /* renamed from: a, reason: collision with root package name */
    public dk4.a f441284a;

    /* renamed from: b, reason: collision with root package name */
    public long f441285b;

    /* renamed from: c, reason: collision with root package name */
    public long f441286c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderObject f441287d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f441288e;

    /* renamed from: f, reason: collision with root package name */
    public t45.n0 f441289f;

    /* renamed from: g, reason: collision with root package name */
    public long f441290g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f441291h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f441292i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f441293j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f441294k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f441295l;

    /* renamed from: m, reason: collision with root package name */
    public vx3.g f441296m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f441297n;

    /* renamed from: o, reason: collision with root package name */
    public long f441298o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f441299p;

    /* renamed from: q, reason: collision with root package name */
    public int f441300q;

    /* renamed from: r, reason: collision with root package name */
    public t45.e1 f441301r;

    /* renamed from: s, reason: collision with root package name */
    public long f441302s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f441303t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f441304u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f441305v;

    /* renamed from: w, reason: collision with root package name */
    public int f441306w;

    /* renamed from: x, reason: collision with root package name */
    public int f441307x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f441308y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f441309z;

    public i() {
        this.f441291h = "";
        this.f441292i = "";
        this.f441293j = "";
        this.f441294k = "";
        this.f441295l = "";
        this.f441296m = vx3.g.f441279f;
        this.f441299p = "";
        this.f441303t = "";
        this.f441304u = "";
        this.f441305v = "";
        this.f441309z = "";
        this.A = "";
        this.B = "";
    }

    public final boolean a() {
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("notification");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        android.app.NotificationManager notificationManager = (android.app.NotificationManager) systemService;
        if (android.os.Build.VERSION.SDK_INT < 26) {
            return true;
        }
        try {
            return notificationManager.getNotificationChannel(this.f441295l) != null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TPMediaInfoDesc", "checkIfChannelValid fail:" + e17.getLocalizedMessage());
            return false;
        }
    }

    public final java.lang.String b(java.lang.Object obj) {
        java.lang.String str;
        if (obj == null || (str = obj.toString()) == null) {
            str = "";
        }
        java.lang.String p17 = com.tencent.mm.sdk.platformtools.t8.p(str);
        kotlin.jvm.internal.o.f(p17, "escapeStringForXml(...)");
        return p17;
    }

    public final long c() {
        if (k()) {
            return 1L;
        }
        return j() ? 2L : 3L;
    }

    public final java.lang.String d() {
        java.lang.String r07 = com.tencent.mm.sdk.platformtools.t8.r0(this.f441298o);
        kotlin.jvm.internal.o.f(r07, "getUnsignedLongString(...)");
        return r07;
    }

    public final java.lang.String e() {
        long j17 = this.f441298o;
        if (j17 != 0) {
            java.lang.String r07 = com.tencent.mm.sdk.platformtools.t8.r0(j17);
            kotlin.jvm.internal.o.f(r07, "getUnsignedLongString(...)");
            return r07;
        }
        int i17 = this.f441300q;
        if (i17 != 0) {
            return java.lang.String.valueOf(i17);
        }
        java.lang.String str = this.f441288e;
        return str == null ? "" : str;
    }

    public final java.lang.String f() {
        return this.f441291h;
    }

    public final java.lang.String g() {
        dk4.a aVar = this.f441284a;
        java.lang.String str = aVar != null ? aVar.f234482s : null;
        return str == null ? "" : str;
    }

    public final java.lang.String h() {
        dk4.a aVar = this.f441284a;
        java.lang.String str = aVar != null ? aVar.f234483t : null;
        return str == null ? "" : str;
    }

    public final ey3.a i() {
        ey3.a aVar = new ey3.a();
        dk4.a aVar2 = this.f441284a;
        aVar.f257604b = aVar2 != null ? aVar2.f234482s : null;
        t45.e1 e1Var = this.f441301r;
        aVar.f257603a = e1Var != null ? e1Var.f415548d : null;
        return aVar;
    }

    public final boolean j() {
        if (this.f441298o != 0) {
            return this.f441299p.length() > 0;
        }
        return false;
    }

    public final boolean k() {
        return this.f441300q != 0;
    }

    public final void l(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.f441291h = str;
    }

    public final void m(boolean z17) {
        java.lang.String str;
        this.C = z17;
        dk4.a aVar = this.f441284a;
        if (aVar == null) {
            return;
        }
        if (z17) {
            bm5.o1 o1Var = bm5.o1.f22719a;
            bm5.h0 h0Var = bm5.h0.RepairerConfig_VOIP_RingBackAudio_Int;
            boolean z18 = false;
            if (o1Var.g(h0Var, 0) != 0 && o1Var.g(h0Var, 0) == 1) {
                z18 = true;
            }
            if (z18) {
                str = "A2";
            } else {
                str = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("FinderRingBackAudioFlag");
                if (str == null) {
                    str = "A0";
                }
            }
        } else {
            str = "";
        }
        aVar.f234481r = str;
    }

    public final java.lang.String n() {
        cl0.g gVar = new cl0.g();
        dk4.a aVar = this.f441284a;
        gVar.h("mInfo", aVar != null ? D.b(aVar) : "{}");
        gVar.p("mStartTime", this.f441285b);
        gVar.p("mEndTime", this.f441286c);
        gVar.h("mHashCode", this.f441288e);
        gVar.p("mDuration", this.f441290g);
        gVar.h("mShortSongName", this.f441292i);
        gVar.h("mSongName", this.f441291h);
        gVar.h("mSingerName", this.f441293j);
        gVar.h("cover", this.f441294k);
        gVar.h(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.CHANNELID, this.f441295l);
        gVar.o("ringtoneSource", this.f441296m.ordinal());
        gVar.p("finderObjectId", this.f441298o);
        gVar.h("finderNonceId", this.f441299p);
        gVar.o("musicSid", this.f441300q);
        gVar.r("unAvailable", this.f441297n);
        gVar.h("finderAuthorHeadUrl", this.f441303t);
        gVar.h("finderAuthIconUrl", this.f441304u);
        gVar.h("finderAuthProfession", this.f441305v);
        gVar.o("finderAuthProfessionType", this.f441306w);
        gVar.o("authProfessionType", this.f441307x);
        t45.e1 e1Var = this.f441301r;
        gVar.h("mVibrateInfo", e1Var != null ? e1Var.f415548d : null);
        gVar.p("createTime", this.f441302s);
        gVar.h("singerFinderUserName", this.A);
        gVar.h("singerBaikeURL", this.B);
        gVar.h("finderUserName", this.f441309z);
        gVar.r("hasBgm", this.f441308y);
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        return gVar2;
    }

    public i(dk4.a info, long j17, long j18) {
        kotlin.jvm.internal.o.g(info, "info");
        this.f441291h = "";
        this.f441292i = "";
        this.f441293j = "";
        this.f441294k = "";
        this.f441295l = "";
        this.f441296m = vx3.g.f441279f;
        this.f441299p = "";
        this.f441303t = "";
        this.f441304u = "";
        this.f441305v = "";
        this.f441309z = "";
        this.A = "";
        this.B = "";
        this.f441284a = info;
        this.f441285b = j17;
        this.f441286c = j18;
    }
}

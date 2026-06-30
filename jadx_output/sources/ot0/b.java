package ot0;

/* loaded from: classes9.dex */
public class b extends ot0.h {
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f348376b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f348377c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f348378d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f348379e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f348380f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f348381g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f348382h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f348383i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f348384j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f348385k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f348386l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f348387m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f348388n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f348389o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f348390p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f348391q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f348392r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f348393s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f348394t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f348395u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f348396v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f348397w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f348398x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f348399y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f348400z;

    @Override // ot0.h
    public ot0.h a() {
        return new ot0.b();
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        int i17 = qVar.f348666i;
        if (i17 == 2002 || i17 == 2003) {
            f(map, "templateid");
            f(map, "senderurl");
            this.f348376b = f(map, "sendernativeurl");
            f(map, "receiverurl");
            this.f348377c = f(map, "receivernativeurl");
            this.f348378d = f(map, "iconurl");
            this.f348379e = f(map, "darkiconurl");
            f(map, "miniiconurl");
            f(map, "backgroundurl");
            f(map, "backgroundname");
            f(map, "backgroundcolor");
            this.f348380f = f(map, "receivertitle");
            this.f348381g = f(map, "sendertitle");
            this.f348385k = f(map, "senderdes");
            this.f348386l = f(map, "receiverdes");
            f(map, "sceneid");
            this.f348388n = f(map, "paymsgid");
            this.f348382h = f(map, "titlecolor");
            this.f348395u = f(map, "titlecolordark");
            this.f348396v = f(map, "realtitlecolordark");
            this.f348387m = f(map, "descolor");
            this.f348397w = f(map, "descolordark");
            this.f348398x = f(map, "realdescolordark");
            this.f348383i = f(map, "senderscenetext");
            this.f348384j = f(map, "receiverscenetext");
            this.f348400z = f(map, "scenetextcolor");
            this.f348399y = f(map, "scenetextcolordark");
            this.f348389o = f(map, "senderbackgroundname");
            this.f348390p = f(map, "senderbackgroundurl");
            this.f348391q = f(map, "senderbackgroundurldark");
            this.f348392r = f(map, "receiverbackgroundname");
            this.f348393s = f(map, "receiverbackgroundurl");
            this.f348394t = f(map, "receiverbackgroundurldark");
            f(map, "seperatorcolor");
            f(map, "seperatorcolordark");
            this.A = f(map, "thirdc2crouteinfo");
            this.B = f(map, "senderrouteinfo");
            this.C = f(map, "receiverrouteinfo");
        }
    }

    public final java.lang.String f(java.util.Map map, java.lang.String str) {
        java.lang.String str2 = (java.lang.String) map.get(".msg.appmsg.wcpaythirdinfo." + str);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return str2 == null ? "" : str2;
    }
}

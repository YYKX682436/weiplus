package tx2;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public int f422645a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f422646b;

    /* renamed from: c, reason: collision with root package name */
    public android.app.Activity f422647c;

    /* renamed from: d, reason: collision with root package name */
    public r45.qt2 f422648d;

    /* renamed from: e, reason: collision with root package name */
    public r45.h32 f422649e;

    /* renamed from: f, reason: collision with root package name */
    public long f422650f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f422651g;

    /* renamed from: h, reason: collision with root package name */
    public int f422652h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.p f422653i;

    /* renamed from: j, reason: collision with root package name */
    public cl0.g f422654j;

    public s(int i17, java.lang.String username, android.app.Activity context, r45.qt2 contextObj, r45.h32 liveNoticeInfo, long j17, java.lang.String enterScene, int i18, yz5.p pVar) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        kotlin.jvm.internal.o.g(liveNoticeInfo, "liveNoticeInfo");
        kotlin.jvm.internal.o.g(enterScene, "enterScene");
        this.f422645a = i17;
        this.f422646b = username;
        this.f422647c = context;
        this.f422648d = contextObj;
        this.f422649e = liveNoticeInfo;
        this.f422650f = j17;
        this.f422651g = enterScene;
        this.f422652h = i18;
        this.f422653i = pVar;
    }

    public static final void a(tx2.s sVar, int i17) {
        sVar.getClass();
        i95.m c17 = i95.n0.c(c61.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c61.zb zbVar = (c61.zb) c17;
        java.lang.String str = sVar.f422646b;
        java.lang.String string = sVar.f422649e.getString(4);
        gm0.j1.d().g(c61.zb.x3(zbVar, str, string == null ? "" : string, i17, sVar.f422648d, sVar.f422647c.getIntent().getStringExtra("key_promotion_token"), java.lang.Integer.valueOf(sVar.f422652h), null, null, null, null, null, null, null, 8128, null));
        c61.zb zbVar2 = (c61.zb) i95.n0.c(c61.zb.class);
        java.lang.String str2 = sVar.f422646b;
        java.lang.String string2 = sVar.f422649e.getString(4);
        if (string2 == null) {
            string2 = "";
        }
        if (((b92.d1) zbVar2).bj(str2, string2) == null) {
            c61.zb zbVar3 = (c61.zb) i95.n0.c(c61.zb.class);
            java.lang.String str3 = sVar.f422646b;
            java.lang.String string3 = sVar.f422649e.getString(4);
            if (string3 == null) {
                string3 = "";
            }
            ((b92.d1) zbVar3).Ai(str3, string3, sVar.f422649e);
        } else {
            c61.zb zbVar4 = (c61.zb) i95.n0.c(c61.zb.class);
            java.lang.String str4 = sVar.f422646b;
            java.lang.String string4 = sVar.f422649e.getString(4);
            if (string4 == null) {
                string4 = "";
            }
            r45.h32 bj6 = ((b92.d1) zbVar4).bj(str4, string4);
            if (bj6 != null) {
                bj6.set(1, java.lang.Integer.valueOf(sVar.f422649e.getInteger(1)));
            }
        }
        android.app.Activity context = sVar.f422647c;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((te2.e4) ((zy2.g8) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.g8.class))).f417974d.M0(sVar.f422646b);
    }
}

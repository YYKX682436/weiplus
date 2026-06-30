package vd2;

/* loaded from: classes3.dex */
public final class v5 {

    /* renamed from: a, reason: collision with root package name */
    public int f435955a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f435956b;

    /* renamed from: c, reason: collision with root package name */
    public android.app.Activity f435957c;

    /* renamed from: d, reason: collision with root package name */
    public r45.qt2 f435958d;

    /* renamed from: e, reason: collision with root package name */
    public r45.h32 f435959e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f435960f;

    /* renamed from: g, reason: collision with root package name */
    public int f435961g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f435962h;

    public v5(int i17, java.lang.String username, android.app.Activity context, r45.qt2 contextObj, r45.h32 liveNoticeInfo, java.lang.String enterScene, int i18, yz5.l lVar) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        kotlin.jvm.internal.o.g(liveNoticeInfo, "liveNoticeInfo");
        kotlin.jvm.internal.o.g(enterScene, "enterScene");
        this.f435955a = i17;
        this.f435956b = username;
        this.f435957c = context;
        this.f435958d = contextObj;
        this.f435959e = liveNoticeInfo;
        this.f435960f = enterScene;
        this.f435961g = i18;
        this.f435962h = lVar;
    }

    public static final void a(vd2.v5 v5Var, int i17) {
        v5Var.getClass();
        i95.m c17 = i95.n0.c(c61.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c61.zb zbVar = (c61.zb) c17;
        java.lang.String str = v5Var.f435956b;
        java.lang.String string = v5Var.f435959e.getString(4);
        gm0.j1.d().g(c61.zb.x3(zbVar, str, string == null ? "" : string, i17, v5Var.f435958d, v5Var.f435957c.getIntent().getStringExtra("key_promotion_token"), java.lang.Integer.valueOf(v5Var.f435961g), null, null, null, null, null, null, null, 8128, null));
        c61.zb zbVar2 = (c61.zb) i95.n0.c(c61.zb.class);
        java.lang.String str2 = v5Var.f435956b;
        java.lang.String string2 = v5Var.f435959e.getString(4);
        if (string2 == null) {
            string2 = "";
        }
        if (((b92.d1) zbVar2).bj(str2, string2) == null) {
            c61.zb zbVar3 = (c61.zb) i95.n0.c(c61.zb.class);
            java.lang.String str3 = v5Var.f435956b;
            java.lang.String string3 = v5Var.f435959e.getString(4);
            if (string3 == null) {
                string3 = "";
            }
            ((b92.d1) zbVar3).Ai(str3, string3, v5Var.f435959e);
        } else {
            c61.zb zbVar4 = (c61.zb) i95.n0.c(c61.zb.class);
            java.lang.String str4 = v5Var.f435956b;
            java.lang.String string4 = v5Var.f435959e.getString(4);
            if (string4 == null) {
                string4 = "";
            }
            r45.h32 bj6 = ((b92.d1) zbVar4).bj(str4, string4);
            if (bj6 != null) {
                bj6.set(1, java.lang.Integer.valueOf(v5Var.f435959e.getInteger(1)));
            }
        }
        android.app.Activity context = v5Var.f435957c;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((te2.e4) ((zy2.g8) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.g8.class))).f417974d.M0(v5Var.f435956b);
    }
}

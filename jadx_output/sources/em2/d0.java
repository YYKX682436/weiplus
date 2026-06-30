package em2;

/* loaded from: classes3.dex */
public final class d0 {
    public static int A;
    public static org.json.JSONObject B;
    public static org.json.JSONObject C;
    public static org.json.JSONObject D;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f255091a;

    /* renamed from: b, reason: collision with root package name */
    public final int f255092b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f255093c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f255094d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f255095e;

    /* renamed from: f, reason: collision with root package name */
    public km2.q f255096f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f255097g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f255098h;

    /* renamed from: i, reason: collision with root package name */
    public org.json.JSONArray f255099i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f255100j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f255101k;

    /* renamed from: l, reason: collision with root package name */
    public android.graphics.Point f255102l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f255103m;

    /* renamed from: n, reason: collision with root package name */
    public int f255104n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.ArrayList f255105o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Boolean f255106p;

    /* renamed from: q, reason: collision with root package name */
    public xh2.d f255107q;

    /* renamed from: r, reason: collision with root package name */
    public gk2.e f255108r;

    /* renamed from: s, reason: collision with root package name */
    public int f255109s;

    /* renamed from: t, reason: collision with root package name */
    public int f255110t;

    /* renamed from: u, reason: collision with root package name */
    public int f255111u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f255112v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.view.ratio.RatioLayout f255113w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f255114x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView f255115y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.ViewGroup f255116z;

    public d0(android.content.Context context, int i17, int i18, kotlin.jvm.internal.i iVar) {
        i17 = (i18 & 2) != 0 ? 1 : i17;
        kotlin.jvm.internal.o.g(context, "context");
        this.f255091a = context;
        this.f255092b = i17;
        this.f255093c = "Finder.FinderMiniWindowFloatLayoutAdapter";
        this.f255094d = jz5.h.b(new em2.x(this));
        this.f255095e = jz5.h.b(new em2.c0(this));
        this.f255097g = new java.util.ArrayList();
        this.f255098h = new java.util.LinkedList();
        this.f255102l = new android.graphics.Point(0, 0);
        this.f255103m = "";
        this.f255105o = new java.util.ArrayList();
    }

    public final android.graphics.Point a(gk2.e eVar) {
        dk2.ef efVar = dk2.ef.f233372a;
        tn0.w0 w0Var = dk2.ef.f233378d;
        if (w0Var != null) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            android.graphics.Point z17 = w0Var.z(context, ((mm2.c1) eVar.a(mm2.c1.class)).O7());
            if (z17 != null) {
                return z17;
            }
        }
        return ko0.t.f309903a.a(((mm2.c1) eVar.a(mm2.c1.class)).f328879s2, ((mm2.c1) eVar.a(mm2.c1.class)).f328885t2);
    }

    public final void b(android.view.View view, int i17, int i18, int i19, int i27) {
        if (i27 == 4) {
            view.setBackground(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(com.tencent.mm.R.drawable.cnf));
            return;
        }
        if (i27 == 5 || i27 == 6) {
            view.setBackground(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(com.tencent.mm.R.drawable.cpw));
            return;
        }
        boolean z17 = true;
        if ((i17 != 0 || (i19 != 2 && i19 != 1 && i19 != 2 && i19 != 4)) && i17 != 2) {
            z17 = false;
        }
        if (!z17) {
            if (this.f255092b != 2) {
                view.setBackground(null);
            }
        } else {
            ya2.g gVar = ya2.h.f460484a;
            gk2.e eVar = this.f255108r;
            ya2.b2 b17 = gVar.b(eVar != null ? ((mm2.c1) eVar.a(mm2.c1.class)).f328852o : null);
            if (b17 != null) {
                zl2.r4.f473950a.k(view, b17.y0());
            }
        }
    }
}

package gp2;

/* loaded from: classes10.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f274339a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f274340b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f274341c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f274342d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f274343e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f274344f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f274345g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f274346h;

    public w0(android.view.View view, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        this.f274339a = z17;
        this.f274340b = view.findViewById(com.tencent.mm.R.id.a7s);
        this.f274341c = view.findViewById(com.tencent.mm.R.id.f485532i02);
        this.f274342d = view.findViewById(com.tencent.mm.R.id.f485533i03);
        this.f274343e = view.findViewById(com.tencent.mm.R.id.f485534i04);
        this.f274344f = view.findViewById(com.tencent.mm.R.id.m3f);
        this.f274345g = view.findViewById(com.tencent.mm.R.id.m3g);
        this.f274346h = view.findViewById(com.tencent.mm.R.id.m3h);
    }

    public final boolean a() {
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_SQUARE_AUDIO_TIPS_COUNT_INT_SYNC;
        int r17 = c17.r(u3Var, 10);
        gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(r17 - 1));
        return r17 >= 0;
    }
}

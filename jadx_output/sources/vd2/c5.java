package vd2;

/* loaded from: classes3.dex */
public final class c5 implements s40.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vd2.d5 f435684a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435685b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435686c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f435687d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f435688e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f435689f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435690g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435691h;

    public c5(vd2.d5 d5Var, java.lang.String str, java.lang.String str2, android.content.Intent intent, android.content.Context context, long j17, java.lang.String str3, java.lang.String str4) {
        this.f435684a = d5Var;
        this.f435685b = str;
        this.f435686c = str2;
        this.f435687d = intent;
        this.f435688e = context;
        this.f435689f = j17;
        this.f435690g = str3;
        this.f435691h = str4;
    }

    @Override // s40.t0
    public void onLiveStatusCallback(long j17, int i17, java.lang.Object obj) {
        r45.l71 l71Var = obj instanceof r45.l71 ? (r45.l71) obj : null;
        r45.nw1 nw1Var = l71Var != null ? (r45.nw1) l71Var.getCustom(1) : null;
        java.lang.String str = this.f435685b;
        vd2.d5 d5Var = this.f435684a;
        if (!d5Var.bj(str, nw1Var)) {
            if (!(nw1Var != null && nw1Var.getInteger(2) == 2) || !d5Var.Bi(3, nw1Var)) {
                com.tencent.mars.xlog.Log.e(d5Var.f435705d, "enterFinderLiveReplayUI liveInfo:" + cm2.a.f43328a.y(nw1Var));
                return;
            }
        }
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).Bi(this.f435686c);
        this.f435684a.Ai(nw1Var, this.f435687d, this.f435688e, this.f435689f, j17, this.f435685b, this.f435690g, this.f435691h);
    }
}

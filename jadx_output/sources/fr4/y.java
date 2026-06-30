package fr4;

/* loaded from: classes8.dex */
public final class y implements gr4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fr4.g0 f265878a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265879b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265880c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265881d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f265882e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265883f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265884g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265885h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265886i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265887j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f265888k;

    public y(fr4.g0 g0Var, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, android.content.Context context) {
        this.f265878a = g0Var;
        this.f265879b = str;
        this.f265880c = str2;
        this.f265881d = str3;
        this.f265882e = z17;
        this.f265883f = str4;
        this.f265884g = str5;
        this.f265885h = str6;
        this.f265886i = str7;
        this.f265887j = str8;
        this.f265888k = context;
    }

    @Override // gr4.e
    public final void a(r45.ij3 ij3Var) {
        com.tencent.mars.xlog.Log.i("W1w.W1wPersonalMsgService", "[launchChatting] session info response received: sessionId=" + ij3Var.f377097d.f390335f + ", canRecvMsg=" + ij3Var.f377097d.f390338i);
        int Ri = ((fr4.g0) ((gr4.f) i95.n0.c(gr4.f.class))).Ri(ij3Var.f377097d.f390335f);
        fr4.g0 g0Var = this.f265878a;
        java.lang.String msg_session_id = ij3Var.f377097d.f390335f;
        kotlin.jvm.internal.o.f(msg_session_id, "msg_session_id");
        java.lang.String str = this.f265879b;
        java.lang.String str2 = this.f265880c;
        r45.xq4 xq4Var = ij3Var.f377097d;
        g0Var.ij(msg_session_id, str, str2, xq4Var.f390336g, xq4Var.f390338i, Ri);
        ((ku5.t0) ku5.t0.f312615d).B(new fr4.x(this.f265880c, this.f265881d, ij3Var, this.f265882e, this.f265883f, this.f265884g, this.f265885h, this.f265886i, this.f265887j, this.f265888k, this.f265878a, this.f265879b));
    }
}

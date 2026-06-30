package com.tencent.mm.plugin.profile;

/* loaded from: classes11.dex */
public final class g2 implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.wl f153470a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f153471b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f153472c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f153473d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f153474e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f153475f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.t1 f153476g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f153477h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f153478i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f153479j;

    public g2(r45.wl wlVar, kotlin.jvm.internal.f0 f0Var, boolean z17, long j17, int i17, int i18, com.tencent.mm.plugin.profile.t1 t1Var, android.app.Activity activity, java.lang.String str, int i19) {
        this.f153470a = wlVar;
        this.f153471b = f0Var;
        this.f153472c = z17;
        this.f153473d = j17;
        this.f153474e = i17;
        this.f153475f = i18;
        this.f153476g = t1Var;
        this.f153477h = activity;
        this.f153478i = str;
        this.f153479j = i19;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ProfileUtilsKt", "handleFinderBlock errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
        com.tencent.mm.plugin.profile.t1 t1Var = this.f153476g;
        if (i17 != 0 || i18 != 0) {
            if (t1Var != null) {
                t1Var.a();
                return;
            }
            return;
        }
        r45.wl wlVar = this.f153470a;
        if (wlVar.f389249w == null) {
            wlVar.f389249w = new r45.td5();
        }
        r45.td5 td5Var = wlVar.f389249w;
        kotlin.jvm.internal.f0 f0Var = this.f153471b;
        td5Var.f386327d = f0Var.f310116d;
        qr3.c0.c(wlVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.ProfileUtilsKt", "handleFinderBlock: update Setting.BlockFinder=" + f0Var.f310116d + " and saved");
        if (this.f153472c) {
            d75.b.g(new com.tencent.mm.plugin.profile.f2(this.f153477h, this.f153478i, this.f153479j));
        }
        r45.pi piVar = wlVar.f389233d;
        java.lang.String str2 = piVar != null ? piVar.f383065d : null;
        r45.an anVar = wlVar.f389245s;
        java.lang.String b17 = x51.j1.b(anVar != null ? anVar.f370126d : null);
        com.tencent.mm.autogen.events.BizProfileBlockFinderNotifyEvent bizProfileBlockFinderNotifyEvent = new com.tencent.mm.autogen.events.BizProfileBlockFinderNotifyEvent();
        am.x0 x0Var = bizProfileBlockFinderNotifyEvent.f54007g;
        x0Var.getClass();
        x0Var.getClass();
        int i19 = f0Var.f310116d;
        x0Var.getClass();
        bizProfileBlockFinderNotifyEvent.e();
        if (f0Var.f310116d == 1) {
            r01.e Bi = r01.q3.Bi();
            if (Bi != null && str2 != null && b17 != null) {
                c01.x xVar = new c01.x();
                xVar.field_bizUsername = str2;
                xVar.field_finderUsername = b17;
                c01.x xVar2 = Bi.get(xVar, new java.lang.String[0]) ? xVar : null;
                if (xVar2 != null) {
                    Bi.update(xVar2, new java.lang.String[0]);
                } else {
                    Bi.insert(xVar);
                }
            }
        } else {
            r01.e Bi2 = r01.q3.Bi();
            if (Bi2 != null) {
                Bi2.d(str2);
            }
        }
        int i27 = f0Var.f310116d == 1 ? 602 : 603;
        if (str2 == null) {
            str2 = "";
        }
        gr3.e.d(str2, i27, this.f153473d, null, this.f153474e, this.f153475f, 0, null, null, null, 0, 0, 4032, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ProfileUtilsKt", "handleFinderBlock: sync blockStatus=" + f0Var.f310116d + " success");
        if (t1Var != null) {
            t1Var.onSuccess(f0Var.f310116d);
        }
    }
}

package cy3;

/* loaded from: classes10.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f224814d;

    /* renamed from: e, reason: collision with root package name */
    public int f224815e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f224816f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f224817g;

    /* renamed from: h, reason: collision with root package name */
    public int f224818h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224819i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f224820m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ vx3.i f224821n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f224822o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f224823p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ yz5.p f224824q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f224825r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f224826s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.y1 f224827t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224828u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f224829v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f224830w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.lang.String str, android.content.Context context, vx3.i iVar, boolean z17, com.tencent.mm.ui.widget.dialog.z2 z2Var, yz5.p pVar, long j17, int i17, com.tencent.mm.plugin.ringtone.uic.y1 y1Var, java.lang.String str2, boolean z18, int i18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f224819i = str;
        this.f224820m = context;
        this.f224821n = iVar;
        this.f224822o = z17;
        this.f224823p = z2Var;
        this.f224824q = pVar;
        this.f224825r = j17;
        this.f224826s = i17;
        this.f224827t = y1Var;
        this.f224828u = str2;
        this.f224829v = z18;
        this.f224830w = i18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cy3.o(this.f224819i, this.f224820m, this.f224821n, this.f224822o, this.f224823p, this.f224824q, this.f224825r, this.f224826s, this.f224827t, this.f224828u, this.f224829v, this.f224830w, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((cy3.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i17;
        java.lang.Object e17;
        int i18;
        boolean z17;
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        pz5.a aVar = pz5.a.f359186d;
        int i19 = this.f224818h;
        boolean z18 = this.f224822o;
        android.content.Context context = this.f224820m;
        if (i19 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String r17 = c01.z1.r();
            java.lang.String str = this.f224819i;
            int i27 = kotlin.jvm.internal.o.b(str, r17) ? 1 : 2;
            boolean b17 = kotlin.jvm.internal.o.b(str, c01.z1.r());
            i17 = mx3.i0.i(str) != null ? 1 : 0;
            com.tencent.mm.ui.widget.dialog.u3 f17 = com.tencent.mm.ui.widget.dialog.u3.f(context, context.getResources().getString(com.tencent.mm.R.string.f492985ik1), false, 3, null);
            f17.show();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", i17 == 0 ? 1 : 2);
            jSONObject.put("channel", this.f224826s);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f224825r);
            jSONObject.put("choose_scene", this.f224830w);
            jSONObject.put("rec_request_id", this.f224828u);
            jSONObject.put("is_video_stream", this.f224829v ? 2 : 1);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
            mx3.s sVar = mx3.u.f332620f;
            vx3.i iVar = this.f224821n;
            java.lang.String str2 = this.f224819i;
            boolean z19 = i27 == 1 ? z18 : false;
            this.f224817g = f17;
            this.f224814d = i27;
            this.f224816f = b17;
            this.f224815e = i17;
            this.f224818h = 1;
            e17 = sVar.e(iVar, str2, z19, t17, this);
            if (e17 == aVar) {
                return aVar;
            }
            i18 = i27;
            z17 = b17;
            u3Var = f17;
        } else {
            if (i19 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i28 = this.f224815e;
            boolean z27 = this.f224816f;
            i18 = this.f224814d;
            u3Var = (com.tencent.mm.ui.widget.dialog.u3) this.f224817g;
            kotlin.ResultKt.throwOnFailure(obj);
            i17 = i28;
            z17 = z27;
            e17 = obj;
        }
        boolean booleanValue = ((java.lang.Boolean) e17).booleanValue();
        yz5.p pVar = this.f224824q;
        if (booleanValue) {
            this.f224823p.B();
            if (u3Var != null) {
                u3Var.dismiss();
            }
            db5.t7.h(com.tencent.mm.sdk.platformtools.x2.f193071a, context.getResources().getString((i18 == 1 && z18) ? com.tencent.mm.R.string.i2l : com.tencent.mm.R.string.f492842i34));
            if (pVar != null) {
                pVar.invoke(java.lang.Boolean.TRUE, new java.lang.Integer(i18));
            }
        } else {
            if (u3Var != null) {
                u3Var.dismiss();
            }
            db5.t7.g(com.tencent.mm.sdk.platformtools.x2.f193071a, context.getResources().getString(com.tencent.mm.R.string.in9));
            if (pVar != null) {
                pVar.invoke(java.lang.Boolean.FALSE, new java.lang.Integer(i18));
            }
        }
        vx3.i iVar2 = this.f224821n;
        java.lang.String d17 = iVar2.d();
        long c17 = iVar2.c();
        long j17 = this.f224825r;
        int i29 = this.f224826s;
        java.lang.String str3 = this.f224819i;
        boolean z28 = this.f224822o;
        boolean z29 = i17 != 0;
        com.tencent.mm.plugin.ringtone.uic.y1 y1Var = this.f224827t;
        wx3.a.d(d17, c17, j17, 2L, i29, str3, z17, z28, str3, z29, y1Var != null && y1Var.f158549b.f367386s, this.f224828u, this.f224829v);
        return jz5.f0.f302826a;
    }
}

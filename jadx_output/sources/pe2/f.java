package pe2;

/* loaded from: classes3.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f353618d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wh2.i f353619e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.i30 f353620f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353621g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pe2.h f353622h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353623i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ mm2.j0 f353624m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(wh2.i iVar, r45.i30 i30Var, java.lang.String str, pe2.h hVar, java.lang.String str2, mm2.j0 j0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f353619e = iVar;
        this.f353620f = i30Var;
        this.f353621g = str;
        this.f353622h = hVar;
        this.f353623i = str2;
        this.f353624m = j0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pe2.f(this.f353619e, this.f353620f, this.f353621g, this.f353622h, this.f353623i, this.f353624m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pe2.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pe2.h hVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f353618d;
        mm2.j0 j0Var = this.f353624m;
        pe2.h hVar2 = this.f353622h;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            wh2.i iVar = this.f353619e;
            if (iVar instanceof wh2.h) {
                if (kotlin.jvm.internal.o.b(this.f353620f.getString(1), this.f353621g)) {
                    hVar2.f353630p.setScaleMode(1);
                    boolean a17 = ae2.in.f3688a.a(ym5.f6.Y1);
                    com.tencent.mm.view.MMPAGView mMPAGView = hVar2.f353630p;
                    java.lang.String str = this.f353623i;
                    if (a17) {
                        com.tencent.mm.rfx.RfxPagFile Load = com.tencent.mm.rfx.RfxPagFile.Load(str);
                        Load.setTimeStretchMode(1);
                        hVar = hVar2;
                        double d17 = 1000;
                        long j17 = (long) (r7.getLong(2) * j0Var.f329153c * d17 * d17);
                        Load.setDuration(j17);
                        com.tencent.mars.xlog.Log.i("FinderLiveCheerAnimationPlugin", "showCheerAnimation playing data.speed: " + j0Var.f329153c + " duration: " + j17);
                        mMPAGView.setComposition(Load);
                    } else {
                        hVar = hVar2;
                        org.libpag.PAGFile Load2 = org.libpag.PAGFile.Load(str);
                        Load2.setTimeStretchMode(1);
                        double d18 = r7.getLong(2) * j0Var.f329153c;
                        double d19 = 1000;
                        long j18 = (long) (d18 * d19 * d19);
                        Load2.setDuration(j18);
                        com.tencent.mars.xlog.Log.i("FinderLiveCheerAnimationPlugin", "showCheerAnimation playing data.speed: " + j0Var.f329153c + " duration: " + j18);
                        mMPAGView.setComposition(Load2);
                    }
                    mMPAGView.setRepeatCount(-1);
                    mMPAGView.g();
                    hVar2 = hVar;
                    boolean z17 = mMPAGView.getVisibility() == 8;
                    hVar2.K0(0);
                    mMPAGView.setVisibility(0);
                    if (((mm2.w) hVar2.P0(mm2.w.class)).O6()) {
                        mMPAGView.setAlpha(0.0f);
                    } else if (z17) {
                        mMPAGView.setAlpha(0.0f);
                        mMPAGView.animate().alpha(1.0f).setDuration(1000L).setListener(null).start();
                    } else {
                        mMPAGView.setAlpha(1.0f);
                    }
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("type", 1);
                    jSONObject.put("fluorescent_sea_id", j0Var.f329154d);
                    java.lang.String jSONObject2 = jSONObject.toString();
                    kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                    java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
                    com.tencent.mars.xlog.Log.i("FinderLiveCheerAnimationPlugin", "reportExpose json: " + jSONObject);
                    i95.m c17 = i95.n0.c(ml2.r0.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    ml2.r0.hj((ml2.r0) c17, ml2.b4.G1, t17, 0L, null, null, null, null, null, 252, null);
                    if (!zl2.r4.f473950a.w1()) {
                        mm2.l0 l0Var = (mm2.l0) hVar2.P0(mm2.l0.class);
                        com.tencent.mars.xlog.Log.i("LiveCheerAnimationSlice", "notifyCheerBtnAnimationShow");
                        l0Var.f329212n.postValue(l0Var.f329210i.getValue());
                        return jz5.f0.f302826a;
                    }
                    ((mm2.l0) hVar2.P0(mm2.l0.class)).f329214p.postValue(new mm2.j0(j0Var.f329151a, true, j0Var.f329153c, j0Var.f329154d));
                    long j19 = j0Var.f329151a.getLong(7) * 1000;
                    this.f353618d = 1;
                    if (kotlinx.coroutines.k1.b(j19, this) == aVar) {
                        return aVar;
                    }
                }
            }
            j0Var.f329152b = false;
            hVar2.t1(true);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showCheerAnimation load pag error, errCode:");
            wh2.g gVar = iVar instanceof wh2.g ? (wh2.g) iVar : null;
            sb6.append(gVar != null ? new java.lang.Integer(gVar.f445951a) : null);
            com.tencent.mars.xlog.Log.e("FinderLiveCheerAnimationPlugin", sb6.toString());
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        ((mm2.l0) hVar2.P0(mm2.l0.class)).f329214p.postValue(new mm2.j0(j0Var.f329151a, false, j0Var.f329153c, j0Var.f329154d));
        hVar2.t1(true);
        return jz5.f0.f302826a;
    }
}

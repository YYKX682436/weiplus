package ct2;

/* loaded from: classes3.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public boolean f222258d;

    /* renamed from: e, reason: collision with root package name */
    public int f222259e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ct2.j f222260f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f222261g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f222262h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ct2.f f222263i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ct2.j jVar, int i17, long j17, ct2.f fVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f222260f = jVar;
        this.f222261g = i17;
        this.f222262h = j17;
        this.f222263i = fVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ct2.h(this.f222260f, this.f222261g, this.f222262h, this.f222263i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ct2.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.l71 l71Var;
        java.lang.Object obj2;
        boolean Ui;
        boolean z17;
        r45.nw1 nw1Var;
        r45.l71 l71Var2;
        r45.l71 l71Var3;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f222259e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        ct2.f fVar = this.f222263i;
        ct2.j jVar = this.f222260f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
            long O6 = jVar.O6();
            qs5.d dVar = qs5.d.f366426e;
            this.f222259e = 1;
            com.tencent.mm.feature.finder.live.v4 v4Var = (com.tencent.mm.feature.finder.live.v4) w0Var;
            v4Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", "requestLiveInfo liveId " + pm0.v.u(O6) + ",scene:4");
            if (O6 == 0) {
                obj2 = null;
            } else {
                jz5.o oVar = (jz5.o) v4Var.f66986g.get(new java.lang.Long(O6));
                if (((oVar == null || (l71Var = (r45.l71) oVar.f302843f) == null) ? null : (r45.nw1) l71Var.getCustom(1)) != null) {
                    r45.zm1 zm1Var = new r45.zm1();
                    zm1Var.set(0, java.lang.Long.valueOf(((java.lang.Number) oVar.f302842e).longValue()));
                    zm1Var.set(1, (r45.l71) oVar.f302843f);
                    obj2 = zm1Var;
                } else {
                    kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
                    rVar.k();
                    i95.m c17 = i95.n0.c(s40.w0.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    s40.w0.u9((s40.w0) c17, O6, true, null, new com.tencent.mm.feature.finder.live.o4(O6, v4Var, 4, rVar), 4, null, null, null, 224, null);
                    obj2 = rVar.j();
                }
            }
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    if (i17 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    ((ws2.n2) fVar).a(false);
                    return f0Var;
                }
                z17 = this.f222258d;
                kotlin.ResultKt.throwOnFailure(obj);
                Ui = z17;
                ((ws2.n2) fVar).a(Ui);
                return f0Var;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            obj2 = obj;
        }
        r45.zm1 zm1Var2 = (r45.zm1) obj2;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = currentTimeMillis - (zm1Var2 != null ? zm1Var2.getLong(0) : currentTimeMillis);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ReplayTransition1.1:checkReplayStatus liveId:");
        sb6.append(jVar.O6());
        sb6.append(",defaultRefreshDuration:");
        int i18 = this.f222261g;
        sb6.append(i18);
        sb6.append(", curTime:");
        sb6.append(currentTimeMillis);
        sb6.append(", updateTime:");
        sb6.append(zm1Var2 != null ? new java.lang.Long(zm1Var2.getLong(0)) : null);
        sb6.append(", passTime:");
        sb6.append(j17);
        sb6.append(", resp interval:");
        sb6.append((zm1Var2 == null || (l71Var3 = (r45.l71) zm1Var2.getCustom(1)) == null) ? null : new java.lang.Integer(l71Var3.getInteger(3)));
        sb6.append(",new Result is null:");
        sb6.append(((zm1Var2 == null || (l71Var2 = (r45.l71) zm1Var2.getCustom(1)) == null) ? null : (r45.nw1) l71Var2.getCustom(1)) == null);
        com.tencent.mars.xlog.Log.i("MMFinder.LiveReplaySlice", sb6.toString());
        if (jVar.O6() == 0) {
            return f0Var;
        }
        if (zm1Var2 == null) {
            com.tencent.mars.xlog.Log.i("MMFinder.LiveReplaySlice", "checkReplayStatus result is null!");
            this.f222259e = 3;
            if (kotlinx.coroutines.k1.b(i18, this) == aVar) {
                return aVar;
            }
            ((ws2.n2) fVar).a(false);
            return f0Var;
        }
        ss5.i0 i0Var = (ss5.i0) i95.n0.c(ss5.i0.class);
        r45.l71 l71Var4 = (r45.l71) zm1Var2.getCustom(1);
        Ui = ((vd2.d5) i0Var).Ui(l71Var4 != null ? (r45.nw1) l71Var4.getCustom(1) : null);
        if (Ui) {
            r45.l71 l71Var5 = (r45.l71) zm1Var2.getCustom(1);
            if (l71Var5 != null && (nw1Var = (r45.nw1) l71Var5.getCustom(1)) != null) {
                ((mm2.e1) jVar.business(mm2.e1.class)).m7(nw1Var);
            }
            ((ws2.n2) fVar).a(Ui);
            return f0Var;
        }
        long integer = ((((r45.l71) zm1Var2.getCustom(1)) != null ? r2.getInteger(3) : 0L) * 1000) - j17;
        long j18 = this.f222262h;
        if (integer > 0) {
            if (integer < j18) {
                integer = j18;
            }
            j18 = integer;
        } else {
            ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Bk(jVar.O6());
        }
        if (zl2.q4.f473933a.E()) {
            com.tencent.mars.xlog.Log.i("MMFinder.LiveReplaySlice", "checkReplayStatus delay:" + j18);
        }
        this.f222258d = Ui;
        this.f222259e = 2;
        if (kotlinx.coroutines.k1.b(j18, this) == aVar) {
            return aVar;
        }
        z17 = Ui;
        Ui = z17;
        ((ws2.n2) fVar).a(Ui);
        return f0Var;
    }
}

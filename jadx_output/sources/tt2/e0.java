package tt2;

/* loaded from: classes3.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f421874d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f421875e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f421876f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tt2.e1 f421877g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f421878h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ byte[] f421879i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(ut2.s3 s3Var, so2.j5 j5Var, tt2.e1 e1Var, int i17, byte[] bArr, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f421875e = s3Var;
        this.f421876f = j5Var;
        this.f421877g = e1Var;
        this.f421878h = i17;
        this.f421879i = bArr;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new tt2.e0(this.f421875e, this.f421876f, this.f421877g, this.f421878h, this.f421879i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((tt2.e0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.nw1 nw1Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f421874d;
        ut2.s3 holder = this.f421875e;
        so2.j5 j5Var = this.f421876f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            s40.a1 a1Var = (s40.a1) i95.n0.c(s40.a1.class);
            android.content.Context context = holder.itemView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            r45.y23 y23Var = ((cm2.m0) j5Var).f43368v;
            this.f421874d = 1;
            if (((com.tencent.mm.feature.finder.live.z5) a1Var).aj(context, y23Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        cc2.e eVar = cc2.e.f40479a;
        tt2.e1 e1Var = this.f421877g;
        boolean z17 = e1Var.f421881i;
        cm2.m0 data = (cm2.m0) j5Var;
        int i18 = e1Var.f421883n;
        gk2.e eVar2 = gk2.e.f272471n;
        boolean z18 = eVar2 != null ? ((mm2.c1) eVar2.a(mm2.c1.class)).T : false;
        byte[] clickId = this.f421879i;
        kotlin.jvm.internal.o.f(clickId, "$clickId");
        java.lang.String str = new java.lang.String(clickId, r26.c.f368865a);
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(holder, "holder");
        gk2.e liveData = e1Var.f421882m;
        kotlin.jvm.internal.o.g(liveData, "liveData");
        if (z17) {
            if (zl2.r4.f473950a.w1()) {
                p52.h.f352029n = str;
            }
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            ml2.y4 y4Var = ml2.j0.f327583i;
            y4Var.Y = true;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            ml2.t2[] t2VarArr = ml2.t2.f328014d;
            jSONObject.put("type", 3);
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            jSONObject.put("sessionid", y4Var.f328306n);
            jSONObject.put("shopwindowid", "");
            jSONObject.put("productid", data.f43369w);
            gk2.e eVar3 = gk2.e.f272471n;
            if (eVar3 != null && ((mm2.c1) eVar3.a(mm2.c1.class)).T7()) {
                i95.m c17 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.zb zbVar = (zy2.zb) c17;
                ml2.c1 c1Var = ml2.c1.f327325e;
                zy2.zb.j5(zbVar, 6L, jSONObject.toString(), null, 4, null);
            } else {
                gk2.e eVar4 = gk2.e.f272471n;
                if (eVar4 != null && ((mm2.c1) eVar4.a(mm2.c1.class)).a8()) {
                    gk2.e eVar5 = gk2.e.f272471n;
                    jSONObject.put("appid", eVar5 != null ? ((mm2.f6) eVar5.a(mm2.f6.class)).A : null);
                    gk2.e eVar6 = gk2.e.f272471n;
                    long j17 = (eVar6 == null || (nw1Var = ((mm2.e1) eVar6.a(mm2.e1.class)).f328988r) == null) ? -1L : nw1Var.getLong(0);
                    if (j17 < 0) {
                        jSONObject.put("liveid", "");
                    } else {
                        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                        jSONObject.put("liveid", b52.b.q(j17));
                    }
                    jSONObject.put("clickid", p52.h.f352029n);
                    p52.h.f352029n = "";
                    i95.m c18 = i95.n0.c(ml2.j0.class);
                    kotlin.jvm.internal.o.f(c18, "getService(...)");
                    zy2.zb.y6((zy2.zb) c18, ml2.z4.f328366o, jSONObject.toString(), null, 4, null);
                }
            }
        } else if (z18) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).sj(2, 2, this.f421878h);
        } else {
            eVar.b(ml2.f4.f327435i, data, 0, cc2.d.f40478a.a(liveData, "live_list_buy", str), holder, i18, kz5.q0.f314001d);
        }
        yz5.l lVar = e1Var.f421895z;
        if (lVar != null) {
            lVar.invoke(new java.lang.Long(data.f43369w));
        }
        return jz5.f0.f302826a;
    }
}

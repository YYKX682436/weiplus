package qf2;

/* loaded from: classes3.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f362611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qf2.v0 f362612e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ km2.q f362613f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(xg2.h hVar, kotlin.coroutines.Continuation continuation, qf2.v0 v0Var, km2.q qVar) {
        super(2, continuation);
        this.f362611d = hVar;
        this.f362612e = v0Var;
        this.f362613f = qVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.v(this.f362611d, continuation, this.f362612e, this.f362613f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qf2.v vVar = (qf2.v) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        vVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object remove;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("AnchorMicTRTCController", "accept pk response success sessionId: " + ((r45.m22) ((xg2.i) this.f362611d).f454393b).getString(1));
        java.util.List list = ((mm2.o4) this.f362612e.business(mm2.o4.class)).f329322q;
        kotlin.jvm.internal.o.f(list, "<get-newLinkMicUserList>(...)");
        pm0.v.I(list, new qf2.p(this.f362613f));
        mm2.y2 y2Var = (mm2.y2) this.f362612e.business(mm2.y2.class);
        km2.q qVar = this.f362613f;
        if (qVar != null) {
            java.util.List list2 = y2Var.f329570w;
            kotlin.jvm.internal.o.d(list2);
            pm0.v.G(list2, new mm2.v2(qVar));
            list2.add(qVar);
        } else {
            y2Var.getClass();
        }
        com.tencent.mars.xlog.Log.i("LiveLinkMicLogicSlice", "safeAddReportAnchorMicUserList , user = " + qVar);
        fj2.s sVar = fj2.s.f263183a;
        java.lang.String str = this.f362613f.f309170a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.putOpt("type", new java.lang.Integer(2));
        sVar.f(1, str, jSONObject.toString());
        mm2.o4 o4Var = (mm2.o4) this.f362612e.business(mm2.o4.class);
        km2.q qVar2 = this.f362613f;
        o4Var.getClass();
        if (qVar2 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("safeAddAnchorCarryPkMicUser sdkUserId: ");
            sb6.append(qVar2.f309170a);
            sb6.append(" nickName: ");
            r45.xn1 xn1Var = qVar2.f309187r;
            sb6.append((xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact.getNickname());
            sb6.append(" roomId: ");
            sb6.append(qVar2.f309178i);
            com.tencent.mars.xlog.Log.i("MMFinder.LiveLinkMicSlice", sb6.toString());
            java.util.Map map = o4Var.f329326u;
            kotlin.jvm.internal.o.d(map);
            java.lang.String str2 = qVar2.f309170a;
            synchronized (map) {
                obj2 = map.get(str2);
            }
            java.util.ArrayList arrayList = (java.util.ArrayList) obj2;
            if (arrayList != null) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    o4Var.M7((km2.q) it.next());
                }
            }
            java.util.Map map2 = o4Var.f329326u;
            kotlin.jvm.internal.o.d(map2);
            java.lang.String str3 = qVar2.f309170a;
            synchronized (map2) {
                remove = map2.remove(str3);
            }
        }
        return jz5.f0.f302826a;
    }
}

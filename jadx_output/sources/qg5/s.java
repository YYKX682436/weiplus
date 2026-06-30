package qg5;

/* loaded from: classes5.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f363167d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f363168e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qg5.l0 f363169f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f363170g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f363171h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(qg5.l0 l0Var, java.util.List list, java.util.List list2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f363169f = l0Var;
        this.f363170g = list;
        this.f363171h = list2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        qg5.s sVar = new qg5.s(this.f363169f, this.f363170g, this.f363171h, continuation);
        sVar.f363168e = obj;
        return sVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qg5.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.z zVar;
        kotlinx.coroutines.z zVar2;
        kotlinx.coroutines.z zVar3;
        kotlinx.coroutines.z zVar4;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f363167d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f363168e;
            qg5.l0 service = this.f363169f;
            kotlin.jvm.internal.o.g(service, "service");
            if (!jm0.g.class.isAssignableFrom(sy.g.class)) {
                throw new java.lang.IllegalArgumentException(qg5.l0.class.getName().concat(" must extends FeatureServiceComponent"));
            }
            androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(service.getViewModel(), new jm0.e(service)).a(sy.g.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            this.f363168e = y0Var;
            this.f363167d = 1;
            obj = ((sy.g) ((jm0.g) a17)).T6(this.f363170g, 15000L, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.util.List list = (java.util.List) obj;
        boolean isEmpty = list.isEmpty();
        jz5.f0 f0Var = jz5.f0.f302826a;
        java.util.List list2 = this.f363171h;
        if (isEmpty) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChatRecordsStagingFeatureService", "no cdnLocators, likely due to network issue");
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                c01.nb nbVar = ((c01.ob) it.next()).f37374b;
                if (nbVar != null && (zVar4 = nbVar.f37352b) != null) {
                    kotlinx.coroutines.p2.a(zVar4, null, 1, null);
                }
            }
            return f0Var;
        }
        if (list2.size() != list.size()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatRecordsStagingFeatureService", "cdnLocators size mismatch, cdnLocatorsSize=" + list.size() + ", recordsSize=" + list2.size());
        }
        java.util.Iterator it6 = ((java.util.ArrayList) kz5.n0.a1(list2, list)).iterator();
        while (it6.hasNext()) {
            jz5.l lVar = (jz5.l) it6.next();
            c01.ob obVar = (c01.ob) lVar.f302833d;
            sy.a aVar2 = (sy.a) lVar.f302834e;
            com.tencent.mm.storage.f9 f9Var = obVar.f37373a;
            boolean z17 = f9Var != null && te5.y0.b(f9Var, true);
            c01.nb nbVar2 = obVar.f37374b;
            com.tencent.mm.storage.f9 f9Var2 = obVar.f37373a;
            if (z17) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("message is expired, skip, msgId=");
                sb6.append(f9Var2 != null ? f9Var2.getMsgId() : 0L);
                com.tencent.mars.xlog.Log.i("MicroMsg.ChatRecordsStagingFeatureService", sb6.toString());
                if (nbVar2 != null && (zVar = nbVar2.f37352b) != null) {
                    kotlinx.coroutines.p2.a(zVar, null, 1, null);
                }
            } else {
                if (aVar2 != null) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("cdnLocator is not null, msgId=");
                    sb7.append(f9Var2 != null ? f9Var2.getMsgId() : 0L);
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChatRecordsStagingFeatureService", sb7.toString());
                    if (((nbVar2 == null || (zVar3 = nbVar2.f37352b) == null) ? null : java.lang.Boolean.valueOf(((kotlinx.coroutines.a0) zVar3).U(new c01.mb(aVar2.f413775a, aVar2.f413776b)))) == null) {
                    }
                }
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("cdnLocator is null, msgId=");
                sb8.append(f9Var2 != null ? f9Var2.getMsgId() : 0L);
                com.tencent.mars.xlog.Log.w("MicroMsg.ChatRecordsStagingFeatureService", sb8.toString());
                if (nbVar2 != null && (zVar2 = nbVar2.f37352b) != null) {
                    kotlinx.coroutines.p2.a(zVar2, null, 1, null);
                }
            }
        }
        return f0Var;
    }
}

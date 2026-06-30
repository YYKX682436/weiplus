package s72;

/* loaded from: classes12.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f404019d;

    /* renamed from: e, reason: collision with root package name */
    public int f404020e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f404021f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s72.j0 f404022g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f404023h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(java.util.List list, s72.j0 j0Var, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f404021f = list;
        this.f404022g = j0Var;
        this.f404023h = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new s72.e0(this.f404021f, this.f404022g, this.f404023h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((s72.e0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long currentTimeMillis;
        java.lang.Object Z6;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f404020e;
        int i18 = 1;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            o72.d2.m(8);
            currentTimeMillis = java.lang.System.currentTimeMillis();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(this.f404021f);
            o72.d3 d3Var = o72.d3.f343321a;
            if (o72.d3.f343325e) {
                java.util.HashSet hashSet = s72.j0.f404069i;
                if (hashSet.size() > 0) {
                    java.util.HashSet hashSet2 = new java.util.HashSet(arrayList);
                    hashSet2.removeAll(hashSet);
                    com.tencent.mars.xlog.Log.w("MicroMsg.FavSyncService", "[syncFavByIdsWithCallback] disable batch get, size=" + hashSet.size() + ", favIds=[" + kz5.n0.g0(hashSet, ",", null, null, 0, null, null, 62, null) + ']');
                    arrayList.clear();
                    arrayList.addAll(hashSet2);
                }
            }
            this.f404019d = currentTimeMillis;
            i18 = 1;
            this.f404020e = 1;
            java.util.HashSet hashSet3 = s72.j0.f404069i;
            Z6 = this.f404022g.Z6(arrayList, this);
            if (Z6 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j17 = this.f404019d;
            kotlin.ResultKt.throwOnFailure(obj);
            currentTimeMillis = j17;
            Z6 = obj;
        }
        s72.h hVar = (s72.h) Z6;
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        int i19 = hVar.f404048c;
        int i27 = hVar.f404049d;
        if (i19 == 0 && i27 == 0) {
            i18 = 0;
        }
        int i28 = i18;
        if (i28 != 0) {
            o72.d2.j(0, i28, i19, i27, currentTimeMillis2, false);
        } else {
            o72.d2.k(0, 0, hVar.f404047b, hVar.f404046a, currentTimeMillis2, 0, false);
        }
        o72.d2.c();
        this.f404023h.invoke();
        return jz5.f0.f302826a;
    }
}

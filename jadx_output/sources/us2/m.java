package us2;

/* loaded from: classes5.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f430508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f430509e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vt3.r f430510f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f430511g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f430512h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f430513i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ us2.d f430514m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(boolean z17, vt3.r rVar, int i17, int i18, int i19, us2.d dVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f430509e = z17;
        this.f430510f = rVar;
        this.f430511g = i17;
        this.f430512h = i18;
        this.f430513i = i19;
        this.f430514m = dVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new us2.m(this.f430509e, this.f430510f, this.f430511g, this.f430512h, this.f430513i, this.f430514m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((us2.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object g17;
        java.lang.Object g18;
        rt3.a aVar;
        long j17;
        long intValue;
        pz5.a aVar2 = pz5.a.f359186d;
        int i17 = this.f430508d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (!this.f430509e) {
                vt3.r rVar = this.f430510f;
                if (rVar != null && rVar.f440042d) {
                    rt3.e eVar = us2.u.f430559l;
                    this.f430508d = 2;
                    eVar.getClass();
                    g18 = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new rt3.c(eVar, null, null), this);
                    if (g18 == aVar2) {
                        return aVar2;
                    }
                    aVar = (rt3.a) g18;
                }
            }
            rt3.e eVar2 = us2.u.f430559l;
            int i18 = this.f430511g;
            int i19 = this.f430512h;
            int i27 = this.f430513i;
            us2.d dVar = this.f430514m;
            vt3.n nVar = dVar.f430477b;
            java.lang.Long l17 = new java.lang.Long(dVar.f430476a);
            this.f430508d = 1;
            eVar2.getClass();
            g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new rt3.b(i18, i19, i27, nVar, eVar2, l17, null, null), this);
            if (g17 == aVar2) {
                return aVar2;
            }
            aVar = (rt3.a) g17;
        } else if (i17 == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            g17 = obj;
            aVar = (rt3.a) g17;
        } else {
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            g18 = obj;
            aVar = (rt3.a) g18;
        }
        if (aVar == null) {
            com.tencent.mars.xlog.Log.i("ShootComposingTemplateManager", "getOrCreateRequestJob:load data failed");
            return jz5.f0.f302826a;
        }
        com.tencent.mars.xlog.Log.i("ShootComposingTemplateManager", "getOrCreateRequestJob: maxAge: " + aVar.f399509b + " continue_flag: " + aVar.f399510c);
        java.lang.Object obj2 = us2.u.f430554g;
        boolean z17 = this.f430509e;
        us2.d dVar2 = this.f430514m;
        vt3.r rVar2 = this.f430510f;
        int i28 = this.f430511g;
        synchronized (obj2) {
            if (z17) {
                r45.s46 s46Var = aVar.f399513f;
                j17 = s46Var != null ? s46Var.f385502d : 0L;
            } else {
                j17 = dVar2.f430476a;
            }
            if (j17 != dVar2.f430476a) {
                com.tencent.mars.xlog.Log.i("ShootComposingTemplateManager", "getOrCreateRequestJob: realTabId: " + j17 + ", cacheKey.tabId: " + dVar2.f430476a);
            }
            if (z17) {
                r45.s46 s46Var2 = aVar.f399513f;
                java.lang.String str = s46Var2 != null ? s46Var2.f385503e : null;
                if (str == null) {
                    str = "";
                }
                rVar2 = new vt3.r(j17, str, dVar2.f430477b, s46Var2 != null && s46Var2.f385505g == 3);
            } else {
                kotlin.jvm.internal.o.d(rVar2);
            }
            us2.d dVar3 = new us2.d(j17, dVar2.f430477b);
            java.util.ArrayList arrayList = aVar.f399508a;
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj3 : arrayList) {
                if (hashSet.add(((vt3.p) obj3).f440020b)) {
                    arrayList2.add(obj3);
                }
            }
            java.util.Map map = us2.u.f430555h;
            if (((java.util.HashMap) map).get(new java.lang.Integer(i28)) == null) {
                ((java.util.HashMap) map).put(new java.lang.Integer(i28), new java.util.HashMap());
            }
            boolean z18 = aVar.f399510c == 0;
            if (rVar2.f440042d) {
                intValue = java.lang.System.currentTimeMillis();
            } else {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                java.lang.Integer num = new java.lang.Integer(aVar.f399509b);
                intValue = currentTimeMillis + (((num.intValue() != 0 ? num : null) != null ? r6.intValue() : 300) * 1000);
            }
            us2.a aVar3 = new us2.a(intValue, new us2.b(rVar2, z17, kz5.n0.V0(arrayList2), aVar.f399511d, z18));
            java.util.Map map2 = (java.util.Map) ((java.util.HashMap) map).get(new java.lang.Integer(i28));
            if (map2 != null) {
            }
            if (z17) {
                us2.u.f430561n = aVar.f399514g;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("getOrCreateRequestJob: tabItem: ");
            sb6.append(rVar2);
            sb6.append(", reachEnd: ");
            sb6.append(z18);
            sb6.append(' ');
            com.tencent.mars.xlog.Log.i("ShootComposingTemplateManager", sb6.toString());
        }
        return jz5.f0.f302826a;
    }
}

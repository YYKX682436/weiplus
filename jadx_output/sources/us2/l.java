package us2;

/* loaded from: classes5.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f430502d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vt3.r f430503e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.g f430504f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f430505g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f430506h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ us2.d f430507i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(vt3.r rVar, com.tencent.mm.protobuf.g gVar, int i17, int i18, us2.d dVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f430503e = rVar;
        this.f430504f = gVar;
        this.f430505g = i17;
        this.f430506h = i18;
        this.f430507i = dVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new us2.l(this.f430503e, this.f430504f, this.f430505g, this.f430506h, this.f430507i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((us2.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object g17;
        java.lang.Object g18;
        rt3.a aVar;
        us2.a aVar2;
        us2.b bVar;
        pz5.a aVar3 = pz5.a.f359186d;
        int i17 = this.f430502d;
        boolean z17 = true;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.f430503e.f440042d) {
                rt3.e eVar = us2.u.f430559l;
                com.tencent.mm.protobuf.g gVar = this.f430504f;
                this.f430502d = 1;
                eVar.getClass();
                g18 = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new rt3.c(eVar, gVar, null), this);
                if (g18 == aVar3) {
                    return aVar3;
                }
                aVar = (rt3.a) g18;
            } else {
                rt3.e eVar2 = us2.u.f430559l;
                int i18 = this.f430505g;
                int i19 = this.f430506h;
                vt3.n nVar = new vt3.n(null, null, null, null, 8, null);
                java.lang.Long l17 = new java.lang.Long(this.f430507i.f430476a);
                com.tencent.mm.protobuf.g gVar2 = this.f430504f;
                this.f430502d = 2;
                eVar2.getClass();
                g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new rt3.b(i18, 0, i19, nVar, eVar2, l17, gVar2, null), this);
                if (g17 == aVar3) {
                    return aVar3;
                }
                aVar = (rt3.a) g17;
            }
        } else if (i17 == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            g18 = obj;
            aVar = (rt3.a) g18;
        } else {
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            g17 = obj;
            aVar = (rt3.a) g17;
        }
        if (aVar == null) {
            com.tencent.mars.xlog.Log.i("ShootComposingTemplateManager", "load more data failed");
            return null;
        }
        java.lang.Object obj2 = us2.u.f430554g;
        int i27 = this.f430505g;
        us2.d dVar = this.f430507i;
        synchronized (obj2) {
            java.util.Map map = (java.util.Map) ((java.util.HashMap) us2.u.f430555h).get(new java.lang.Integer(i27));
            if (map != null && (aVar2 = (us2.a) map.get(dVar)) != null && (bVar = aVar2.f430468b) != null) {
                java.util.ArrayList arrayList = aVar.f399508a;
                java.util.HashSet hashSet = new java.util.HashSet();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj3 : arrayList) {
                    if (hashSet.add(((vt3.p) obj3).f440020b)) {
                        arrayList2.add(obj3);
                    }
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.Iterator it = arrayList2.iterator();
                while (true) {
                    boolean z18 = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    vt3.p pVar = (vt3.p) next;
                    java.util.List list = bVar.f430471c;
                    if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                        java.util.Iterator it6 = list.iterator();
                        while (it6.hasNext()) {
                            if (kotlin.jvm.internal.o.b(((vt3.p) it6.next()).f440020b, pVar.f440020b)) {
                                break;
                            }
                        }
                    }
                    z18 = true;
                    if (z18) {
                        arrayList3.add(next);
                    }
                }
                int size = bVar.f430471c.size();
                int size2 = arrayList3.size();
                boolean z19 = aVar.f399510c == 0;
                bVar.f430472d = aVar.f399511d;
                bVar.f430473e = z19;
                bVar.f430471c.addAll(arrayList3);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append("getOrCreateLoadMoreJob: reachEnd: ");
                if (!z19) {
                    z17 = false;
                }
                sb6.append(z17);
                sb6.append(", currentSize: ");
                sb6.append(size);
                sb6.append(", newPageSize: ");
                sb6.append(size2);
                com.tencent.mars.xlog.Log.i("ShootComposingTemplateManager", sb6.toString());
                return arrayList3;
            }
            return null;
        }
    }
}

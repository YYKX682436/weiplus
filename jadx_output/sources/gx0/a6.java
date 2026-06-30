package gx0;

/* loaded from: classes5.dex */
public final class a6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f276186d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f276187e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(gx0.w8 w8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276187e = w8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.a6(this.f276187e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.a6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.maas.moviecomposing.c cVar;
        int i17;
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f359186d;
        int i18 = this.f276186d;
        gx0.w8 w8Var = this.f276187e;
        if (i18 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f276186d = 1;
            if (gx0.w8.i7(w8Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        float Ni = ((yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class))).Ni();
        java.util.ArrayList<zu0.a> arrayList = w8Var.f277123y;
        kotlin.jvm.internal.o.g(arrayList, "<this>");
        boolean isEmpty = arrayList.isEmpty();
        com.tencent.maas.moviecomposing.c cVar2 = com.tencent.maas.moviecomposing.c.ASPECT_RATIO_9x16;
        if (!isEmpty) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            for (zu0.a aVar2 : arrayList) {
                kotlin.jvm.internal.o.g(aVar2, "<this>");
                int i19 = aVar2.f475662b;
                if (i19 <= 0 || (i17 = aVar2.f475663c) <= 0) {
                    cVar = cVar2;
                } else {
                    float f17 = (i19 * 1.0f) / i17;
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    java.util.Iterator it = ((kz5.h) by0.a.f36322a).iterator();
                    while (it.hasNext()) {
                        com.tencent.maas.moviecomposing.c cVar3 = (com.tencent.maas.moviecomposing.c) it.next();
                        java.lang.Float a17 = by0.b.a(cVar3);
                        if (a17 != null) {
                            linkedHashMap.put(a17, cVar3);
                        }
                    }
                    java.util.Iterator it6 = linkedHashMap.keySet().iterator();
                    if (it6.hasNext()) {
                        java.lang.Object next = it6.next();
                        if (it6.hasNext()) {
                            float abs = java.lang.Math.abs(f17 - ((java.lang.Number) next).floatValue());
                            do {
                                java.lang.Object next2 = it6.next();
                                float abs2 = java.lang.Math.abs(f17 - ((java.lang.Number) next2).floatValue());
                                if (java.lang.Float.compare(abs, abs2) > 0) {
                                    next = next2;
                                    abs = abs2;
                                }
                            } while (it6.hasNext());
                        }
                        obj2 = next;
                    } else {
                        obj2 = null;
                    }
                    cVar = (com.tencent.maas.moviecomposing.c) linkedHashMap.getOrDefault((java.lang.Float) obj2, cVar2);
                }
                arrayList2.add(cVar);
            }
            java.util.Iterator it7 = arrayList2.iterator();
            if (!it7.hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            com.tencent.maas.moviecomposing.c next3 = it7.next();
            if (it7.hasNext()) {
                java.lang.Float a18 = by0.b.a((com.tencent.maas.moviecomposing.c) next3);
                float floatValue = a18 != null ? a18.floatValue() : Ni;
                do {
                    java.lang.Object next4 = it7.next();
                    java.lang.Float a19 = by0.b.a((com.tencent.maas.moviecomposing.c) next4);
                    float floatValue2 = a19 != null ? a19.floatValue() : Ni;
                    next3 = next3;
                    if (java.lang.Float.compare(floatValue, floatValue2) > 0) {
                        next3 = next4;
                        floatValue = floatValue2;
                    }
                } while (it7.hasNext());
            }
            cVar2 = next3;
        }
        w8Var.A7().getViewTreeObserver().addOnGlobalLayoutListener(new gx0.z5(w8Var, cVar2));
        return cVar2;
    }
}

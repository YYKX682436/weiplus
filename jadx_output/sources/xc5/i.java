package xc5;

/* loaded from: classes12.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f453478d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xc5.l f453479e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(xc5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f453479e = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xc5.i(this.f453479e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xc5.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f453478d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        xc5.l lVar = this.f453479e;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                qf3.a aVar2 = lVar.f453523e;
                if (aVar2 == null) {
                    lVar.f453529n = false;
                    return f0Var;
                }
                int i18 = lVar.f453527i;
                int i19 = i18 + 8;
                int length = lVar.f453525g.length;
                if (i19 > length) {
                    i19 = length;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (i18 < i19) {
                    com.tencent.mm.storage.f9 k17 = pt0.f0.f358209b1.k(lVar.f453524f, lVar.f453525g[i18]);
                    if (k17 != null) {
                        arrayList.add(lVar.W6(k17));
                    }
                    i18++;
                }
                lVar.f453527i = i19;
                if (!arrayList.isEmpty()) {
                    lVar.f453522d.addAll(arrayList);
                    kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                    kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
                    xc5.h hVar = new xc5.h(aVar2, lVar, arrayList, null);
                    this.f453478d = 1;
                    if (kotlinx.coroutines.l.g(g3Var, hVar, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            lVar.f453529n = false;
            return f0Var;
        } catch (java.lang.Throwable th6) {
            lVar.f453529n = false;
            throw th6;
        }
    }
}

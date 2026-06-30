package ew0;

/* loaded from: classes5.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f257012d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ew0.l f257013e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ew0.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f257013e = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ew0.e(this.f257013e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ew0.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String f17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f257012d;
        ew0.l lVar = this.f257013e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            xw0.r u76 = lVar.u7();
            sw0.b bVar = lVar.f349118q;
            java.lang.String str = bVar != null ? bVar.f413415b : null;
            if (bVar == null || (f17 = bVar.f413416c) == null) {
                f17 = lVar.u7().f(ug.m.Narration);
            }
            java.lang.String str2 = lVar.u7().f457644h.f48224b;
            this.f257012d = 1;
            if (u76.g(str, f17, str2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        xw0.r u77 = lVar.u7();
        sw0.b bVar2 = lVar.f349118q;
        java.lang.String str3 = bVar2 != null ? bVar2.f413417d : null;
        this.f257012d = 2;
        if (u77.n(str3, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}

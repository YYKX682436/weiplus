package sp2;

/* loaded from: classes2.dex */
public final class u3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f411233d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f411234e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f411235f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sp2.x3 f411236g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, sp2.x3 x3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f411234e = arrayList;
        this.f411235f = arrayList2;
        this.f411236g = x3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sp2.u3(this.f411234e, this.f411235f, this.f411236g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sp2.u3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f411233d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.ArrayList arrayList = this.f411234e;
            if (arrayList.size() > 0) {
                java.util.ArrayList arrayList2 = this.f411235f;
                if (arrayList2.size() > 0) {
                    this.f411233d = 1;
                    if (sp2.x3.P6(this.f411236g, arrayList2, arrayList, this) == aVar) {
                        return aVar;
                    }
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}

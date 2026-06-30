package df2;

/* loaded from: classes10.dex */
public final class fy extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f230173d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ja0 f230174e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.wy f230175f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fy(r45.ja0 ja0Var, df2.wy wyVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230174e = ja0Var;
        this.f230175f = wyVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.fy(this.f230174e, this.f230175f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.fy) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f230173d;
        r45.ja0 ja0Var = this.f230174e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            long integer = ja0Var.getInteger(9) * 1000;
            this.f230173d = 1;
            if (kotlinx.coroutines.k1.b(integer, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        ja0Var.set(9, 0);
        df2.wy wyVar = this.f230175f;
        com.tencent.mars.xlog.Log.i(wyVar.f231736m, "onCritQuestInfoChanged STAGE_QUEST_ANNOUNCING stage_time_left countDown, emit");
        wyVar.b7(wyVar.f231741r);
        return jz5.f0.f302826a;
    }
}

package df2;

/* loaded from: classes.dex */
public final class lh extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f230666d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.oh f230667e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lh(xg2.h hVar, kotlin.coroutines.Continuation continuation, df2.oh ohVar) {
        super(2, continuation);
        this.f230666d = hVar;
        this.f230667e = ohVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.lh(this.f230666d, continuation, this.f230667e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.lh lhVar = (df2.lh) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        lhVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f230666d).f454381b;
        java.lang.String str = this.f230667e.f230967m;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestDelete fail! errType=");
        rm0.j jVar = aVar2.f454379a;
        sb6.append(jVar != null ? new java.lang.Integer(jVar.f397424e) : null);
        sb6.append(", errCode=");
        rm0.j jVar2 = aVar2.f454379a;
        sb6.append(jVar2 != null ? new java.lang.Integer(jVar2.f397425f) : null);
        sb6.append(", errMsg=");
        sb6.append(jVar2 != null ? jVar2.f397426g : null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        return jz5.f0.f302826a;
    }
}

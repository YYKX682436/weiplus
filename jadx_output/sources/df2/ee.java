package df2;

/* loaded from: classes3.dex */
public final class ee extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.qe f230054d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.vm1 f230055e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f230056f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee(df2.qe qeVar, r45.vm1 vm1Var, java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230054d = qeVar;
        this.f230055e = vm1Var;
        this.f230056f = obj;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.ee(this.f230054d, this.f230055e, this.f230056f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.ee) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.live.plugin.g b76 = this.f230054d.b7();
        if (b76 == null) {
            return null;
        }
        b76.A1(this.f230055e, this.f230056f, true);
        return jz5.f0.f302826a;
    }
}

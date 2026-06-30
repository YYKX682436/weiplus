package vt2;

/* loaded from: classes3.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f439936d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f439937e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ld2 f439938f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vt2.c f439939g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String str, int i17, r45.ld2 ld2Var, vt2.c cVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f439936d = str;
        this.f439937e = i17;
        this.f439938f = ld2Var;
        this.f439939g = cVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vt2.b(this.f439936d, this.f439937e, this.f439938f, this.f439939g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        vt2.b bVar = (vt2.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        bVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.String str = this.f439936d;
        int i17 = this.f439937e;
        bw5.vk vkVar = new bw5.vk();
        vt2.c cVar = this.f439939g;
        vkVar.f34385d = cVar.f439941b;
        vkVar.f34386e[1] = true;
        new ke2.o0(str, i17, vkVar, this.f439938f, null).l().K(new vt2.a(cVar));
        return jz5.f0.f302826a;
    }
}

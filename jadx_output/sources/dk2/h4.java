package dk2;

/* loaded from: classes3.dex */
public final class h4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233560a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gk2.e f233561b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f233562c;

    public h4(java.lang.String str, gk2.e eVar, kotlin.coroutines.Continuation continuation) {
        this.f233560a = str;
        this.f233561b = eVar;
        this.f233562c = continuation;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        kotlin.coroutines.Continuation continuation = this.f233562c;
        if (i17 == 0 && fVar.f70616b == 0) {
            st2.g3 g3Var = st2.g3.f412326a;
            com.tencent.mm.protobuf.f resp = fVar.f70618d;
            kotlin.jvm.internal.o.f(resp, "resp");
            if (g3Var.s(this.f233560a, this.f233561b, (r45.dv1) resp)) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                continuation.resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(java.lang.Boolean.TRUE, fVar.f70618d)));
            } else {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                continuation.resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(java.lang.Boolean.FALSE, fVar.f70618d)));
            }
        } else {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(java.lang.Boolean.FALSE, fVar.f70618d)));
        }
        return jz5.f0.f302826a;
    }
}

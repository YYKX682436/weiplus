package rm0;

/* loaded from: classes4.dex */
public final class b implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f397400a;

    public b(kotlinx.coroutines.q qVar) {
        this.f397400a = qVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        kotlinx.coroutines.q qVar = this.f397400a;
        if (i17 == 0 && fVar.f70616b == 0 && fVar.f70618d != null) {
            fVar.f70620f.dead();
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(fVar.f70618d));
        } else {
            java.lang.String str = fVar.f70620f.f70646f.f70712c;
            kotlin.jvm.internal.o.f(str, "getUri(...)");
            int i18 = fVar.f70615a;
            int i19 = fVar.f70616b;
            java.lang.String str2 = fVar.f70617c;
            com.tencent.mm.protobuf.f resp = fVar.f70618d;
            kotlin.jvm.internal.o.f(resp, "resp");
            rm0.j jVar = new rm0.j(str, i18, i19, str2, resp);
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(jVar)));
            fVar.f70620f.dead();
        }
        return jz5.f0.f302826a;
    }
}

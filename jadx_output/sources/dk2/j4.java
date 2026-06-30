package dk2;

/* loaded from: classes.dex */
public final class j4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f233637a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f233638b;

    public j4(kotlin.jvm.internal.h0 h0Var, kotlinx.coroutines.q qVar) {
        this.f233637a = h0Var;
        this.f233638b = qVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        az2.f fVar2 = (az2.f) this.f233637a.f310123d;
        if (fVar2 != null) {
            fVar2.b();
        }
        int i17 = fVar.f70615a;
        kotlinx.coroutines.q qVar = this.f233638b;
        if (i17 == 0 && fVar.f70616b == 0) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(java.lang.Long.valueOf(((r45.rr1) fVar.f70618d).getLong(1))));
        } else {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(-1L));
        }
        return jz5.f0.f302826a;
    }
}

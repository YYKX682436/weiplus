package ut2;

/* loaded from: classes.dex */
public final class m1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f431001a;

    public m1(kotlinx.coroutines.q qVar) {
        this.f431001a = qVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.du5 du5Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        boolean z17 = fVar != null && fVar.f70615a == 0;
        kotlinx.coroutines.q qVar = this.f431001a;
        if (z17 && fVar.f70616b == 0) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(java.lang.Boolean.TRUE, "")));
        } else {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            r45.ie ieVar = (r45.ie) ((r45.nd2) fVar.f70618d).getCustom(0);
            java.lang.String str = (ieVar == null || (du5Var = ieVar.f376960e) == null) ? null : du5Var.f372756d;
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(bool, str != null ? str : "")));
        }
        return jz5.f0.f302826a;
    }
}

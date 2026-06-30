package w71;

/* loaded from: classes11.dex */
public final class j implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w71.k f443408a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f443409b;

    public j(w71.k kVar, kotlinx.coroutines.q qVar) {
        this.f443408a = kVar;
        this.f443409b = qVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        bw5.a0 a0Var = new bw5.a0();
        a0Var.c(this.f443408a.f443413m);
        a0Var.b(fVar.f70616b);
        a0Var.f24952d = fVar.f70615a;
        boolean[] zArr = a0Var.f24957i;
        zArr[1] = true;
        a0Var.f24955g = com.tencent.mm.protobuf.g.b(((r45.js5) fVar.f70618d).toByteArray());
        zArr[4] = true;
        fVar.f70620f.dead();
        ((kotlinx.coroutines.r) this.f443409b).resumeWith(kotlin.Result.m521constructorimpl(a0Var));
        return jz5.f0.f302826a;
    }
}

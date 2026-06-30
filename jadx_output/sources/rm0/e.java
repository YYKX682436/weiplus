package rm0;

/* loaded from: classes4.dex */
public final class e implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.f f397410a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.i f397411b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f397412c;

    public e(int i17, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.i iVar, kotlinx.coroutines.q qVar) {
        this.f397410a = fVar;
        this.f397411b = iVar;
        this.f397412c = qVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        java.util.Objects.toString(fVar);
        if (fVar.f70618d == null) {
            fVar.f70618d = this.f397410a;
        }
        this.f397411b.dead();
        ((kotlinx.coroutines.r) this.f397412c).resumeWith(kotlin.Result.m521constructorimpl(fVar));
        return jz5.f0.f302826a;
    }
}

package nv2;

/* loaded from: classes2.dex */
public final class k implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nv2.l f340514a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nv2.o1 f340515b;

    public k(nv2.l lVar, nv2.o1 o1Var) {
        this.f340514a = lVar;
        this.f340515b = o1Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        kotlin.jvm.internal.o.d(fVar);
        this.f340514a.d(this.f340515b, fVar);
        return jz5.f0.f302826a;
    }
}

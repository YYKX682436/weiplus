package g31;

/* loaded from: classes9.dex */
public final class c implements e31.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g31.l f268067a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f268068b;

    public c(g31.l lVar, java.lang.String str) {
        this.f268067a = lVar;
        this.f268068b = str;
    }

    @Override // e31.i
    public void a() {
        g31.e eVar = g31.e.f268074d;
        g31.l lVar = this.f268067a;
        lVar.k(this.f268068b, eVar);
        lVar.r(g31.f.f268075d);
    }

    @Override // e31.i
    public void b(java.lang.String templateId, e31.j result) {
        kotlin.jvm.internal.o.g(templateId, "templateId");
        kotlin.jvm.internal.o.g(result, "result");
        g31.l.j(this.f268067a, templateId, result);
    }
}

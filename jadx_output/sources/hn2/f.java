package hn2;

/* loaded from: classes10.dex */
public final class f implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hn2.h f282522d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f282523e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f282524f;

    public f(hn2.h hVar, yz5.p pVar, yz5.l lVar) {
        this.f282522d = hVar;
        this.f282523e = pVar;
        this.f282524f = lVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.lang.Integer num;
        nm2.a aVar = (nm2.a) obj;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (aVar == null) {
            com.tencent.mars.xlog.Log.i("FinderLiveSongAuditionHelper", "auditionState changed, but state is null, ignore");
        } else {
            com.tencent.mars.xlog.Log.i("FinderLiveSongAuditionHelper", "auditionState changed: state=".concat(aVar.getClass().getSimpleName()));
            java.lang.String b17 = aVar.b();
            boolean d17 = aVar.d();
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            hn2.h hVar = this.f282522d;
            nm2.a aVar2 = hVar.f282530b;
            yz5.p pVar = this.f282523e;
            if (aVar2 != null && (num = (java.lang.Integer) pVar.invoke(aVar2.b(), java.lang.Boolean.valueOf(aVar2.d()))) != null) {
                linkedHashSet.add(new java.lang.Integer(num.intValue()));
            }
            java.lang.Integer num2 = (java.lang.Integer) pVar.invoke(b17, java.lang.Boolean.valueOf(d17));
            if (num2 != null) {
                linkedHashSet.add(new java.lang.Integer(num2.intValue()));
            }
            hVar.f282530b = aVar;
            if (!linkedHashSet.isEmpty()) {
                this.f282524f.invoke(linkedHashSet);
            }
        }
        return f0Var;
    }
}

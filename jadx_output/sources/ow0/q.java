package ow0;

/* loaded from: classes5.dex */
public final class q implements com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ow0.a0 f349346a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.segments.Segment f349347b;

    public q(ow0.a0 a0Var, com.tencent.maas.moviecomposing.segments.Segment segment) {
        this.f349346a = a0Var;
        this.f349347b = segment;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.o
    public void onResult(java.lang.Object result) {
        kotlin.jvm.internal.o.g(result, "result");
        if (kotlin.jvm.internal.o.b(result instanceof java.lang.Boolean ? (java.lang.Boolean) result : null, java.lang.Boolean.TRUE)) {
            this.f349346a.E7(this.f349347b);
        }
    }
}

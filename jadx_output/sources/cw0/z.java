package cw0;

/* loaded from: classes5.dex */
public final class z implements com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cw0.l0 f222708a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.base.MJID f222709b;

    public z(cw0.l0 l0Var, com.tencent.maas.base.MJID mjid) {
        this.f222708a = l0Var;
        this.f222709b = mjid;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.o
    public void onResult(java.lang.Object result) {
        kotlin.jvm.internal.o.g(result, "result");
        boolean b17 = kotlin.jvm.internal.o.b(result instanceof java.lang.Boolean ? (java.lang.Boolean) result : null, java.lang.Boolean.TRUE);
        cw0.l0 l0Var = this.f222708a;
        l0Var.getClass();
        com.tencent.maas.base.MJID narrationSegmentID = this.f222709b;
        kotlin.jvm.internal.o.g(narrationSegmentID, "narrationSegmentID");
        if (l0Var.X6() && b17) {
            l0Var.I7(narrationSegmentID);
        }
    }
}

package gx0;

/* loaded from: classes5.dex */
public final class o implements com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gx0.w f276780a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.base.MJID f276781b;

    public o(gx0.w wVar, com.tencent.maas.base.MJID mjid) {
        this.f276780a = wVar;
        this.f276781b = mjid;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.o
    public void onResult(java.lang.Object result) {
        kotlin.jvm.internal.o.g(result, "result");
        if (kotlin.jvm.internal.o.b(result instanceof java.lang.Boolean ? (java.lang.Boolean) result : null, java.lang.Boolean.TRUE)) {
            this.f276780a.A7(this.f276781b);
        }
    }
}

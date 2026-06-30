package gx0;

/* loaded from: classes5.dex */
public final class qc implements jx0.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gx0.sc f276886a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.segments.Segment f276887b;

    public qc(gx0.sc scVar, com.tencent.maas.moviecomposing.segments.Segment segment) {
        this.f276886a = scVar;
        this.f276887b = segment;
    }

    @Override // jx0.h0
    public void a(com.tencent.maas.model.time.MJTime seekTime) {
        kotlin.jvm.internal.o.g(seekTime, "seekTime");
    }

    @Override // jx0.h0
    public java.lang.Object b(kotlin.coroutines.Continuation continuation) {
        return jz5.f0.f302826a;
    }

    @Override // jx0.h0
    public java.lang.Object c(boolean z17, com.tencent.maas.model.time.MJTime mJTime, kotlin.coroutines.Continuation continuation) {
        if (!z17) {
            return java.lang.Boolean.FALSE;
        }
        gx0.w8 w8Var = (gx0.w8) ((jz5.n) this.f276886a.f276953t).getValue();
        com.tencent.maas.model.time.MJTime A = this.f276887b.A();
        kotlin.jvm.internal.o.f(A, "getPresentationStartTime(...)");
        w8Var.getClass();
        kotlinx.coroutines.l.d(w8Var.getMainScope(), null, null, new gx0.j5(true, w8Var, A, null), 3, null);
        return java.lang.Boolean.TRUE;
    }
}

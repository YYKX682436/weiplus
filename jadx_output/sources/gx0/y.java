package gx0;

/* loaded from: classes5.dex */
public final class y implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.h0 f277187d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uw0.a f277188e;

    public y(gx0.h0 h0Var, uw0.a aVar) {
        this.f277187d = h0Var;
        this.f277188e = aVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment;
        com.tencent.maas.moviecomposing.segments.ContentDescSegment h07;
        com.tencent.maas.base.MJID mjid;
        com.tencent.maas.model.time.MJTime mJTime = (com.tencent.maas.model.time.MJTime) obj;
        gx0.h0 h0Var = this.f277187d;
        gx0.kh W7 = h0Var.W7();
        kotlin.jvm.internal.o.d(mJTime);
        ex0.c g76 = W7.g7(mJTime);
        java.lang.Object obj2 = g76 != null ? g76.f257167a : null;
        com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment2 = obj2 instanceof com.tencent.maas.moviecomposing.segments.ClipSegment ? (com.tencent.maas.moviecomposing.segments.ClipSegment) obj2 : null;
        if (!kotlin.jvm.internal.o.b(clipSegment2, h0Var.f431589y) && clipSegment2 != null) {
            h0Var.R7();
            h0Var.G7(this.f277188e, clipSegment2);
        }
        if (h0Var.V7().isPlaying() || (clipSegment = h0Var.f431589y) == null || (h07 = clipSegment.h0()) == null || (mjid = h07.f48532a) == null) {
            return;
        }
        du0.o.o7((gx0.x4) ((jz5.n) h0Var.f431587w).getValue(), mjid, false, false, 4, null);
    }
}

package gx0;

/* loaded from: classes5.dex */
public final class b2 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ow0.g f276218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.u2 f276219e;

    public b2(ow0.g gVar, gx0.u2 u2Var) {
        this.f276218d = gVar;
        this.f276219e = u2Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.maas.model.time.MJTime mJTime = (com.tencent.maas.model.time.MJTime) obj;
        ow0.g gVar = this.f276218d;
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.p f69205e = gVar.getF69205e();
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.p pVar = com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.p.f69246h;
        gx0.u2 u2Var = this.f276219e;
        if (f69205e == pVar) {
            int ordinal = gVar.getCurrentPage().ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    kotlin.jvm.internal.o.d(mJTime);
                    u2Var.U7(mJTime);
                }
            } else if (!u2Var.R7().isPlaying()) {
                u2Var.Y7();
            }
        }
        if (u2Var.R7().isPlaying()) {
            kotlin.jvm.internal.o.d(mJTime);
            ow0.q0.e(u2Var, mJTime);
        }
    }
}

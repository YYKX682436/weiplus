package wk4;

/* loaded from: classes10.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wk4.f f446970d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(wk4.f fVar) {
        super(0);
        this.f446970d = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
        wk4.f fVar = this.f446970d;
        int i17 = fVar.f446977g;
        ((c61.l7) b6Var).getClass();
        fVar.f446977g = i17 == 2 ? 1 : 2;
        m40.k0 k0Var = (m40.k0) i95.n0.c(m40.k0.class);
        int i18 = fVar.f446977g;
        ((c61.p7) k0Var).getClass();
        com.tencent.mm.plugin.finder.storage.t70.f127590a.b3(i18);
        com.tencent.mars.xlog.Log.i("MicroMsg.TingCommentController", "switchCommentScene: " + fVar.f446977g);
        return jz5.f0.f302826a;
    }
}

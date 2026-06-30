package qm1;

/* loaded from: classes10.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qm1.f f364692d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(qm1.f fVar) {
        super(0);
        this.f364692d = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
        qm1.f fVar = this.f364692d;
        int i17 = fVar.f364699g;
        ((c61.l7) b6Var).getClass();
        fVar.f364699g = i17 == 2 ? 1 : 2;
        m40.k0 k0Var = (m40.k0) i95.n0.c(m40.k0.class);
        int i18 = fVar.f364699g;
        ((c61.p7) k0Var).getClass();
        com.tencent.mm.plugin.finder.storage.t70.f127590a.b3(i18);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizCommentController", "switchCommentScene: " + fVar.f364699g);
        return jz5.f0.f302826a;
    }
}

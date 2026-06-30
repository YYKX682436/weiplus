package mv2;

/* loaded from: classes10.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mv2.l f331572d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.yj0 f331573e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(mv2.l lVar, com.tencent.mm.plugin.finder.storage.yj0 yj0Var) {
        super(1);
        this.f331572d = lVar;
        this.f331573e = yj0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        mv2.l lVar = mv2.l.f331597d;
        this.f331572d.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPostCommentContentProgress ");
        com.tencent.mm.plugin.finder.storage.yj0 yj0Var = this.f331573e;
        sb6.append(yj0Var.field_localCommentId);
        sb6.append(' ');
        sb6.append(intValue);
        com.tencent.mars.xlog.Log.i("Finder.FinderActionManager", sb6.toString());
        if (yj0Var.field_state == 3) {
            yj0Var.f128399y1 = intValue;
            ((c61.l7) i95.n0.c(c61.l7.class)).Ij().D0(yj0Var.field_feedId, yj0Var.t0(), yj0Var.field_localCommentId, com.tencent.mm.plugin.finder.storage.wj0.W, yj0Var);
        }
        return jz5.f0.f302826a;
    }
}

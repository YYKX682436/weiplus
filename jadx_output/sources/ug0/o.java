package ug0;

/* loaded from: classes8.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ug0.q f427468d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ug0.q qVar) {
        super(0);
        this.f427468d = qVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jz5.f0 f0Var;
        ug0.q qVar = this.f427468d;
        qVar.getClass();
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N0().add(new ug0.m(qVar));
        ug0.n nVar = new ug0.n(qVar);
        c61.t8 t8Var = (c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class));
        androidx.lifecycle.j0 Di = t8Var.Di("Search.Entrance");
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        jz5.f0 f0Var3 = null;
        if (Di != null) {
            Di.observeForever(nVar);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearchCommonSyncRedDotFSC", "onObserveRedDotPathDB, failed: path(WebSearch_Entrance) not found");
        }
        androidx.lifecycle.j0 Di2 = t8Var.Di("Search.MentionEntrance");
        if (Di2 != null) {
            Di2.observeForever(nVar);
            f0Var3 = f0Var2;
        }
        if (f0Var3 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearchCommonSyncRedDotFSC", "onObserveRedDotPathDB, failed: path(WebSearch_Mention_Entrance) not found");
        }
        return f0Var2;
    }
}

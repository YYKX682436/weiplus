package mj2;

/* loaded from: classes10.dex */
public final class h implements si2.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zh2.c f327030a;

    public h(zh2.c cVar) {
        this.f327030a = cVar;
    }

    @Override // si2.b
    public com.tencent.mm.plugin.finder.live.plugin.l a() {
        return this.f327030a.a();
    }

    @Override // si2.b
    public void c(dk2.pf battleData, yz5.l lVar) {
        kotlin.jvm.internal.o.g(battleData, "battleData");
        qf2.c3 c3Var = (qf2.c3) this.f327030a.getController(qf2.c3.class);
        if (c3Var != null) {
            c3Var.c7(1, battleData, lVar);
        }
    }
}

package df2;

/* loaded from: classes10.dex */
public final class tr extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lt f231467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.h f231468e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f231469f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tr(df2.lt ltVar, dk2.h hVar, java.lang.String str) {
        super(0);
        this.f231467d = ltVar;
        this.f231468e = hVar;
        this.f231469f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        df2.lt ltVar = this.f231467d;
        com.tencent.mm.plugin.finder.live.view.ub ubVar = ltVar.f291099e;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = ubVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) ubVar : null;
        if (k0Var != null) {
            com.tencent.mm.plugin.finder.live.util.y.n(k0Var, null, null, new df2.sr(ltVar, this.f231468e, this.f231469f, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}

package dk2;

/* loaded from: classes.dex */
public final class af extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final dk2.af f233210d = new dk2.af();

    public af() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        jz5.f0 f0Var = null;
        com.tencent.mm.plugin.finder.live.view.v1 v1Var = k0Var instanceof com.tencent.mm.plugin.finder.live.view.v1 ? (com.tencent.mm.plugin.finder.live.view.v1) k0Var : null;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (v1Var != null) {
            qo0.c.a(v1Var, qo0.b.f365342d5, null, 2, null);
            f0Var = f0Var2;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w("Finder.FinderLiveService", "updateAnchorLinkList, curLiveLayout is null!");
        }
        return f0Var2;
    }
}

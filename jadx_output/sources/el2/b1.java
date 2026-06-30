package el2;

/* loaded from: classes3.dex */
public final class b1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.i1 f253750d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(el2.i1 i1Var) {
        super(0);
        this.f253750d = i1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.tp1 tp1Var;
        el2.i1 i1Var = this.f253750d;
        com.tencent.mm.plugin.finder.live.plugin.ag0 ag0Var = (com.tencent.mm.plugin.finder.live.plugin.ag0) i1Var.f253814f.X0(com.tencent.mm.plugin.finder.live.plugin.ag0.class);
        int I1 = ag0Var != null ? ag0Var.I1(i1Var.f253812d) : 0;
        if (i1Var.f253823r != I1) {
            com.tencent.mars.xlog.Log.i(i1Var.f253815g, "newVisibleSize:" + I1 + ", visibleSize:" + i1Var.f253823r);
            com.tencent.mm.plugin.finder.live.plugin.l lVar = i1Var.f253814f;
            r45.tp1 tp1Var2 = (r45.tp1) ((je2.t) lVar.P0(je2.t.class)).f299268n.getValue();
            if (tp1Var2 != null) {
                tp1Var = new r45.tp1();
                byte[] byteArray = tp1Var2.toByteArray();
                if (byteArray != null) {
                    try {
                        tp1Var.parseFrom(byteArray);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                    }
                }
            } else {
                tp1Var = null;
            }
            ((je2.t) lVar.P0(je2.t.class)).f299268n.postValue(tp1Var);
        }
        return jz5.f0.f302826a;
    }
}

package ew0;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ew0.l f257019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ew0.a f257020e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.base.MJID f257021f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ew0.l lVar, ew0.a aVar, com.tencent.maas.base.MJID mjid) {
        super(0);
        this.f257019d = lVar;
        this.f257020e = aVar;
        this.f257021f = mjid;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        cw0.l0 l0Var = (cw0.l0) ((jz5.n) this.f257019d.f257026u).getValue();
        if (l0Var != null && l0Var.X6() && this.f257020e.getSelectedTabPage() == ov0.e.f349125e) {
            pf5.e.launchUI$default(this.f257019d, null, null, new ew0.h(l0Var, this.f257021f, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}

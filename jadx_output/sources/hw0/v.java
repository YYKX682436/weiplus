package hw0;

/* loaded from: classes5.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hw0.z f285485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.base.MJID f285486e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(hw0.z zVar, com.tencent.maas.base.MJID mjid) {
        super(0);
        this.f285485d = zVar;
        this.f285486e = mjid;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        hw0.z zVar = this.f285485d;
        if (((ow0.a0) ((jz5.n) zVar.f285495r).getValue()).X6()) {
            hw0.p pVar = (hw0.p) zVar.f69240i;
            if ((pVar != null ? pVar.getSelectedTabPage() : null) == ov0.e.f349125e) {
                hw0.z zVar2 = this.f285485d;
                pf5.e.launchUI$default(zVar2, null, null, new hw0.u(zVar2, this.f285486e, null), 3, null);
            }
        }
        return jz5.f0.f302826a;
    }
}

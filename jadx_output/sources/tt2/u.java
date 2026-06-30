package tt2;

/* loaded from: classes3.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tt2.e1 f422000d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.hx0 f422001e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(tt2.e1 e1Var, r45.hx0 hx0Var) {
        super(3);
        this.f422000d = e1Var;
        this.f422001e = hx0Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String string;
        com.tencent.mm.plugin.finder.live.plugin.l lVar;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String errmsg = (java.lang.String) obj2;
        r45.o12 resp = (r45.o12) obj3;
        kotlin.jvm.internal.o.g(errmsg, "errmsg");
        kotlin.jvm.internal.o.g(resp, "resp");
        tt2.e1 e1Var = this.f422000d;
        e1Var.getClass();
        r45.hx0 hx0Var = this.f422001e;
        if (hx0Var.getByteString(1) != null) {
            r45.ix0 ix0Var = (r45.ix0) resp.getCustom(1);
            if (booleanValue && ix0Var != null && ix0Var.getInteger(1) == 0) {
                st2.h1 h1Var = e1Var.f421891v;
                if (h1Var != null && (lVar = h1Var.f412337h) != null) {
                    qo0.b bVar = qo0.b.f365359h2;
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putBoolean("PARAM_FINDER_LIVE_SHOPPING_SOURCE_CLICK", true);
                    lVar.M0(bVar, bundle);
                }
            } else {
                java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.e7a);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                switch (hx0Var.getInteger(0)) {
                    case 101:
                        string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.eeh);
                        kotlin.jvm.internal.o.f(string, "getString(...)");
                        break;
                    case 102:
                        string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.edq);
                        kotlin.jvm.internal.o.f(string, "getString(...)");
                        break;
                    case 103:
                        string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.ees);
                        kotlin.jvm.internal.o.f(string, "getString(...)");
                        break;
                    default:
                        string = "";
                        break;
                }
                db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, string2.concat(string), 0).show();
            }
        }
        return jz5.f0.f302826a;
    }
}

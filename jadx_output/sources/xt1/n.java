package xt1;

/* loaded from: classes4.dex */
public class n extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f456528e = {l75.n0.getCreateSQLs(xt1.m.f456522z, "CardQrCodeConfi")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f456529d;

    public n(l75.k0 k0Var) {
        super(k0Var, xt1.m.f456522z, "CardQrCodeConfi", null);
        this.f456529d = k0Var;
    }

    public xt1.m y0(java.lang.String str) {
        xt1.m mVar = new xt1.m();
        mVar.field_card_id = str;
        if (get(mVar, new java.lang.String[0])) {
            return mVar;
        }
        return null;
    }
}

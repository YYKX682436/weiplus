package dt4;

/* loaded from: classes4.dex */
public class f extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f243238e = {l75.n0.getCreateSQLs(at4.d1.f13822z, "WalletFunciontList")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f243239d;

    public f(l75.k0 k0Var) {
        super(k0Var, at4.d1.f13822z, "WalletFunciontList", null);
        this.f243239d = k0Var;
    }

    public void y0(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18) {
        at4.d1 d1Var = new at4.d1();
        d1Var.field_wallet_region = i17;
        d1Var.field_function_list = str;
        d1Var.field_new_list = str2;
        d1Var.field_banner_list = str3;
        d1Var.field_type_name_list = str4;
        d1Var.field_isShowSetting = i18;
        super.replace(d1Var);
    }
}

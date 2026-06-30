package k91;

/* loaded from: classes4.dex */
public class v extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f305787e = {l75.n0.getCreateSQLs(k91.u.f305774p, "AppBrandCommonKVData")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f305788d;

    public v(l75.k0 k0Var) {
        super(k0Var, k91.u.f305774p, "AppBrandCommonKVData", null);
        this.f305788d = k0Var;
    }

    public boolean P2(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        k91.u uVar = new k91.u();
        uVar.field_key = str;
        uVar.field_value = str2;
        return com.tencent.mm.sdk.platformtools.t8.K0(str2) ? !super.delete(uVar, new java.lang.String[0]) : super.replace(uVar);
    }

    public boolean d(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        k91.u uVar = new k91.u();
        uVar.field_key = str;
        java.lang.String z07 = z0(str, "");
        uVar.field_value = z07;
        return android.text.TextUtils.isEmpty(z07) || super.delete(uVar, new java.lang.String[0]);
    }

    public void y0(java.lang.String str) {
        super.execSQL("AppBrandCommonKVData", java.lang.String.format("delete from %s where %s like '%s%%'", "AppBrandCommonKVData", "key", str));
    }

    public java.lang.String z0(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return str2;
        }
        k91.u uVar = new k91.u();
        uVar.field_key = str;
        return super.get(uVar, new java.lang.String[0]) ? uVar.field_value : str2;
    }
}

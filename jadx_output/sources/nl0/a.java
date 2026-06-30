package nl0;

/* loaded from: classes4.dex */
public class a extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f338157e;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f338158d;

    static {
        p75.n0 n0Var = dm.s3.f239799m;
        f338157e = new java.lang.String[]{l75.n0.getCreateSQLs(dm.s3.f239808v, "FewShotLearning")};
    }

    public a(l75.k0 k0Var) {
        super(k0Var, dm.s3.f239808v, "FewShotLearning", f338157e);
        this.f338158d = k0Var;
        k0Var.A("FewShotLearning", "Alter table FewShotLearning add tag INT");
    }

    public final int y0(java.lang.String str, int i17) {
        android.database.Cursor B = this.f338158d.B("select * from FewShotLearning where model='" + str + "' and label=" + i17, new java.lang.String[0]);
        int count = B.getCount();
        B.close();
        return count;
    }

    public boolean z0(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        if (android.text.TextUtils.isEmpty(str3) || android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        byte[] a17 = fm0.a.a(str3.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1));
        dm.s3 s3Var = new dm.s3();
        s3Var.field_feature_str = new java.lang.String(a17, java.nio.charset.StandardCharsets.ISO_8859_1);
        s3Var.field_label = i17;
        s3Var.field_sample_uid = str2;
        s3Var.field_time = java.lang.System.currentTimeMillis();
        s3Var.field_model = str;
        return insert(s3Var);
    }
}

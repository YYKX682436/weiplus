package s32;

/* loaded from: classes7.dex */
public class e extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f402466e = {l75.n0.getCreateSQLs(r32.e.f368962v, "HardDeviceLikeUser")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f402467d;

    public e(l75.k0 k0Var) {
        super(k0Var, r32.e.f368962v, "HardDeviceLikeUser", null);
        this.f402467d = k0Var;
        k0Var.A("HardDeviceLikeUser", "CREATE INDEX IF NOT EXISTS ExdeviceRankLikeInfoRankIdAppNameIndex ON HardDeviceLikeUser ( rankID, appusername )");
    }
}

package zz3;

/* loaded from: classes12.dex */
public class b extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f477707e = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.scanner.model.o2.D, "ScanTranslationResult")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f477708d;

    public b(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.plugin.scanner.model.o2.D, "ScanTranslationResult", null);
        this.f477708d = k0Var;
    }

    public dm.aa y0(java.lang.String str) {
        com.tencent.mm.plugin.scanner.model.o2 o2Var = new com.tencent.mm.plugin.scanner.model.o2();
        o2Var.field_originMD5 = str;
        if (get(o2Var, new java.lang.String[0])) {
            return o2Var;
        }
        return null;
    }

    public boolean z0(com.tencent.mm.plugin.scanner.model.o2 o2Var) {
        return y0(o2Var.field_originMD5) != null ? replace(o2Var) : super.insert(o2Var);
    }
}

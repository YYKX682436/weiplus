package v32;

/* loaded from: classes7.dex */
public class g extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f433097e = {l75.n0.getCreateSQLs(v32.f.f433096x, "HardIotDeviceInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f433098d;

    public g(l75.k0 k0Var) {
        super(k0Var, v32.f.f433096x, "HardIotDeviceInfo", null);
        this.f433098d = k0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r1.moveToFirst() != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        r2 = new v32.f();
        r2.convertFrom(r1);
        r0.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r1.moveToNext() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List y0() {
        /*
            r3 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            android.database.Cursor r1 = r3.getAll()
            if (r1 == 0) goto L22
            boolean r2 = r1.moveToFirst()
            if (r2 == 0) goto L22
        L11:
            v32.f r2 = new v32.f
            r2.<init>()
            r2.convertFrom(r1)
            r0.add(r2)
            boolean r2 = r1.moveToNext()
            if (r2 != 0) goto L11
        L22:
            if (r1 == 0) goto L27
            r1.close()
        L27:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v32.g.y0():java.util.List");
    }
}

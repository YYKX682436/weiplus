package m75;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final l75.f0 f324522a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f324523b;

    /* renamed from: c, reason: collision with root package name */
    public final o75.c f324524c;

    /* renamed from: d, reason: collision with root package name */
    public final o75.e f324525d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f324526e;

    public c(l75.f0 item, boolean z17, o75.c cVar, o75.e eVar, java.lang.String str) {
        kotlin.jvm.internal.o.g(item, "item");
        this.f324522a = item;
        this.f324523b = z17;
        this.f324524c = cVar;
        this.f324525d = eVar;
        this.f324526e = str;
    }

    public final long a(l75.k0 k0Var) {
        o75.c cVar;
        l75.f0 f0Var = this.f324522a;
        l75.e0 dBInfo = f0Var.getDBInfo();
        android.content.ContentValues convertTo = f0Var.convertTo();
        boolean z17 = true;
        if (!(convertTo.size() > 0)) {
            convertTo = null;
        }
        java.lang.Object obj = convertTo != null ? convertTo.get(dBInfo.f316953b) : null;
        java.lang.String str = this.f324526e;
        if (k0Var == null || convertTo == null) {
            com.tencent.mars.xlog.Log.i(str != null ? str : "MicroMsg.Mvvm.InsertExecutor", "insert table:" + f0Var.getTableName() + " fail primaryKey:" + dBInfo.f316953b + " value:" + obj);
            return -1L;
        }
        long v17 = this.f324523b ? k0Var.v(f0Var.getTableName(), dBInfo.f316953b, convertTo) : k0Var.l(f0Var.getTableName(), dBInfo.f316953b, convertTo);
        if (v17 > 0) {
            f0Var.systemRowid = v17;
            o75.e eVar = this.f324525d;
            if (eVar != null && (cVar = this.f324524c) != null) {
                eVar.notifyAny(cVar);
            }
        }
        if (v17 > 0) {
            if (str != null && !r26.n0.N(str)) {
                z17 = false;
            }
            if (!z17) {
                com.tencent.mars.xlog.Log.i(str, "insert table:" + f0Var.getTableName() + " success primaryKey:" + dBInfo.f316953b + " value:" + obj);
            }
        }
        if (v17 <= 0) {
            com.tencent.mars.xlog.Log.e(str != null ? str : "MicroMsg.Mvvm.InsertExecutor", "insert resultRowId" + v17 + " table:" + f0Var.getTableName() + " fail primaryKey:" + dBInfo.f316953b + " value:" + obj);
        }
        return v17;
    }
}

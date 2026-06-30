package m75;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final l75.f0 f324527a;

    /* renamed from: b, reason: collision with root package name */
    public final o75.c f324528b;

    /* renamed from: c, reason: collision with root package name */
    public final o75.e f324529c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f324530d;

    public d(l75.f0 item, o75.c cVar, o75.e eVar, java.lang.String str) {
        kotlin.jvm.internal.o.g(item, "item");
        this.f324527a = item;
        this.f324528b = cVar;
        this.f324529c = eVar;
        this.f324530d = str;
    }

    public final long a(l75.k0 k0Var) {
        o75.e eVar;
        o75.c cVar;
        l75.f0 f0Var = this.f324527a;
        l75.e0 dBInfo = f0Var.getDBInfo();
        android.content.ContentValues convertTo = f0Var.convertTo();
        boolean z17 = true;
        if (!(convertTo.size() > 0)) {
            convertTo = null;
        }
        java.lang.Object obj = convertTo != null ? convertTo.get(dBInfo.f316953b) : null;
        java.lang.String str = this.f324530d;
        if (k0Var == null || convertTo == null || obj == null) {
            com.tencent.mars.xlog.Log.i(str != null ? str : "MicroMsg.Mvvm.ReplaceExecutor", "replace table:" + f0Var.getTableName() + " fail primaryKey:" + dBInfo.f316953b + " value:" + obj);
            return -1L;
        }
        long m17 = k0Var.m(f0Var.getTableName(), dBInfo.f316953b, convertTo);
        if (m17 > 0 && (eVar = this.f324529c) != null && (cVar = this.f324528b) != null) {
            eVar.notifyAny(cVar);
        }
        if (m17 > 0) {
            if (str != null && !r26.n0.N(str)) {
                z17 = false;
            }
            if (!z17) {
                com.tencent.mars.xlog.Log.i(str, "replace table:" + f0Var.getTableName() + " success primaryKey:" + dBInfo.f316953b + " value:" + obj);
            }
        }
        if (m17 <= 0) {
            com.tencent.mars.xlog.Log.e(str != null ? str : "MicroMsg.Mvvm.ReplaceExecutor", "replace effectRow:" + m17 + " table:" + f0Var.getTableName() + " fail primaryKey:" + dBInfo.f316953b + " value:" + obj);
        }
        return m17;
    }
}

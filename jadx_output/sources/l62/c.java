package l62;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static l62.c f316764a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashSet f316765b;

    static {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        f316765b = new java.util.HashSet();
        for (e42.d0 d0Var : e42.d0.values()) {
            f316765b.add(d0Var.name());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ExptMMKV", "get mulit expt enum cost time [%d]", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    public static l62.c b() {
        if (f316764a == null) {
            f316764a = new l62.c();
        }
        return f316764a;
    }

    public final boolean a() {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            return true;
        }
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.ExptMMKV", "%s only mm process can write expt info", d());
        return false;
    }

    public java.lang.String c(e42.d0 d0Var, java.lang.String str, boolean z17) {
        return j62.e.g().a(d0Var.name(), str, z17, true);
    }

    public final java.lang.String d() {
        return hashCode() + "";
    }
}

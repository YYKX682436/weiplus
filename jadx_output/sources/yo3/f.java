package yo3;

/* loaded from: classes9.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final yo3.f f464145a;

    /* renamed from: b, reason: collision with root package name */
    public static yo3.d f464146b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.ArrayList f464147c;

    static {
        yo3.f fVar = new yo3.f();
        f464145a = fVar;
        f464147c = new java.util.ArrayList();
        fVar.b();
    }

    public final com.tencent.mm.plugin.wallet_core.model.Bankcard a(boolean z17) {
        yo3.d dVar = f464146b;
        if (dVar == null) {
            kotlin.jvm.internal.o.o("sImpl");
            throw null;
        }
        com.tencent.mm.plugin.wallet_core.model.Bankcard c17 = dVar.c(z17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getPriorBankcard: ");
        sb6.append(c17 != null ? c17.field_bankcardType : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflinePriorBankcardLogic", sb6.toString());
        return c17;
    }

    public final void b() {
        yo3.d aVar;
        boolean z17 = yo3.m.f() == 2;
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflinePriorBankcardLogic", "isOnlineToken: " + z17);
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflinePriorBankcardLogic", "create online store");
            aVar = new yo3.c();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflinePriorBankcardLogic", "create legacy store");
            aVar = new yo3.a();
        }
        f464146b = aVar;
        c();
    }

    public final void c() {
        yo3.d dVar = f464146b;
        if (dVar != null) {
            dVar.reload();
        } else {
            kotlin.jvm.internal.o.o("sImpl");
            throw null;
        }
    }
}

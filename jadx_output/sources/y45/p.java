package y45;

/* loaded from: classes11.dex */
public final class p implements y45.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f459383a;

    /* renamed from: b, reason: collision with root package name */
    public final int f459384b;

    /* renamed from: c, reason: collision with root package name */
    public final m3.a f459385c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f459386d;

    public p(android.content.Context context, int i17, m3.a aVar, boolean z17) {
        this.f459383a = context;
        this.f459384b = i17;
        this.f459385c = aVar == null ? new y45.p$$a() : aVar;
        this.f459386d = z17;
    }

    public void a(r45.f35 f35Var, int i17, com.tencent.mm.plugin.hp.util.TinkerSyncResponse tinkerSyncResponse, java.lang.Throwable th6) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCheckEnd, channel = ");
        int i18 = this.f459384b;
        sb6.append(i18);
        sb6.append(", error = ");
        sb6.append(i17);
        sb6.append(", response = ");
        sb6.append(tinkerSyncResponse);
        d55.u.b("MicroMsg.recovery.operator", sb6.toString(), new java.lang.Object[0]);
        m3.a aVar = this.f459385c;
        if (i17 != 0 && i17 != -5) {
            if (i18 == 1) {
                d55.u.d("MicroMsg.recovery.operator", "fetchTinkerPatch cgi rsp error, try HTTPS channel.", new java.lang.Object[0]);
                z45.a.b(f35Var, new y45.p(this.f459383a, 2, aVar, this.f459386d));
                return;
            } else {
                if (i18 != 2) {
                    d55.u.d("MicroMsg.recovery.operator", "Unknown channel: %s", java.lang.Integer.valueOf(i18));
                    return;
                }
                d55.u.d("MicroMsg.recovery.operator", "fetchTinkerPatch https rsp error.", new java.lang.Object[0]);
                atomicInteger.set(java.lang.Math.abs(i17) + 60);
                aVar.accept(java.lang.Integer.valueOf(atomicInteger.get()));
                return;
            }
        }
        if (i18 == 1) {
            d55.u.b("MicroMsg.recovery.operator", "fetchTinkerPatch cgi rsp successful", new java.lang.Object[0]);
        } else if (i18 == 2) {
            d55.u.b("MicroMsg.recovery.operator", "fetchTinkerPatch https rsp successful", new java.lang.Object[0]);
        }
        if (i17 == -5 || tinkerSyncResponse == null || android.text.TextUtils.isEmpty(tinkerSyncResponse.f142412h)) {
            atomicInteger.set(1);
            aVar.accept(java.lang.Integer.valueOf(atomicInteger.get()));
        } else if (tinkerSyncResponse.f142410f.intValue() != 2) {
            d55.u.d("MicroMsg.recovery.operator", "[!] Unsupported patch type: %s", tinkerSyncResponse.f142410f);
            atomicInteger.set(32);
            aVar.accept(java.lang.Integer.valueOf(atomicInteger.get()));
        } else {
            y45.m.b(this.f459383a, tinkerSyncResponse.f142412h, java.lang.Math.max(tinkerSyncResponse.f142415n, 0), tinkerSyncResponse.f142413i, this.f459385c, this.f459386d);
        }
    }
}

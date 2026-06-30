package com.tencent.mm.plugin.hardcoder;

/* loaded from: classes11.dex */
public class a implements com.tencent.mm.hardcoder.o, com.tencent.mm.hardcoder.r {

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f142252d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.Long f142253e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f142254f;

    /* renamed from: g, reason: collision with root package name */
    public static com.tencent.mm.plugin.hardcoder.a f142255g;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f142256a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f142257b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f142258c;

    public a() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f142258c = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.CoreAccountInitializationNotifiedEvent>(a0Var) { // from class: com.tencent.mm.plugin.hardcoder.HardCoderReporterImpl$1
            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.CoreAccountInitializationNotifiedEvent coreAccountInitializationNotifiedEvent) {
                if (coreAccountInitializationNotifiedEvent instanceof com.tencent.mm.autogen.events.CoreAccountInitializationNotifiedEvent) {
                    dead();
                    com.tencent.mm.plugin.hardcoder.a aVar = com.tencent.mm.plugin.hardcoder.a.this;
                    if (!aVar.f142256a.isEmpty()) {
                        java.util.ArrayList arrayList = aVar.f142256a;
                        java.util.ArrayList arrayList2 = (java.util.ArrayList) arrayList.clone();
                        arrayList.clear();
                        java.util.Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            android.util.Pair pair = (android.util.Pair) it.next();
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(((java.lang.Integer) pair.first).intValue(), (java.lang.Object[]) pair.second);
                        }
                    }
                    java.util.ArrayList arrayList3 = aVar.f142257b;
                    if (!arrayList3.isEmpty()) {
                        java.util.ArrayList arrayList4 = (java.util.ArrayList) arrayList3.clone();
                        arrayList3.clear();
                        java.util.Iterator it6 = arrayList4.iterator();
                        while (it6.hasNext()) {
                            java.lang.Object[] objArr = (java.lang.Object[]) it6.next();
                            if (objArr.length >= 4) {
                                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(((java.lang.Long) objArr[0]).longValue(), ((java.lang.Long) objArr[1]).longValue(), ((java.lang.Long) objArr[2]).longValue(), ((java.lang.Boolean) objArr[3]).booleanValue());
                            }
                        }
                    }
                }
                return false;
            }
        };
    }

    public final void a(int i17, java.lang.Object... objArr) {
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(i17, objArr);
        } else {
            if (gm0.j1.b().f273254q) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(i17, objArr);
                return;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.HardCoderReporterImpl", "kvStat accountNotInitialReady!");
            this.f142258c.alive();
            this.f142256a.add(new android.util.Pair(java.lang.Integer.valueOf(i17), objArr));
        }
    }
}

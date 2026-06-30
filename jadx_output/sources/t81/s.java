package t81;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f416371d = {l75.n0.getCreateSQLs(t81.g.f416360r, "PersistentWxaSyncInvalidCodeCmd"), l75.n0.getCreateSQLs(t81.h.f416361r, "PersistentWxaSyncInvalidContactCmd")};

    /* renamed from: e, reason: collision with root package name */
    public static t81.p f416372e;

    /* renamed from: f, reason: collision with root package name */
    public static t81.o f416373f;

    /* renamed from: a, reason: collision with root package name */
    public final l75.k0 f416374a;

    /* renamed from: b, reason: collision with root package name */
    public final t81.q f416375b;

    /* renamed from: c, reason: collision with root package name */
    public final t81.r f416376c;

    public s(l75.k0 db6) {
        kotlin.jvm.internal.o.g(db6, "db");
        this.f416374a = db6;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.plugin.appbrand.config.WxaAttrStorageNotifyEvent>(a0Var) { // from class: com.tencent.mm.plugin.appbrand.appcache.predownload.storage.WxaSyncCmdPersistentStorage$1
            {
                this.__eventId = -1646206336;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.plugin.appbrand.config.WxaAttrStorageNotifyEvent wxaAttrStorageNotifyEvent) {
                com.tencent.mm.plugin.appbrand.config.WxaAttrStorageNotifyEvent event = wxaAttrStorageNotifyEvent;
                kotlin.jvm.internal.o.g(event, "event");
                if (t81.s.this.f416374a.J()) {
                    dead();
                } else {
                    boolean z17 = true;
                    if (kotlin.jvm.internal.o.b("single", event.f77399g)) {
                        java.lang.Object obj = event.f77401i;
                        java.lang.String obj2 = obj != null ? obj.toString() : null;
                        if (obj2 != null && obj2.length() != 0) {
                            z17 = false;
                        }
                        if (!z17) {
                            ((ku5.t0) ku5.t0.f312615d).h(new t81.m(t81.s.this, obj2), "MicroMsg.WxaSyncCmdPersistentStorage");
                        }
                    } else if (kotlin.jvm.internal.o.b("batch", event.f77399g)) {
                        java.lang.Object obj3 = event.f77401i;
                        java.util.List list = obj3 instanceof java.util.List ? (java.util.List) obj3 : null;
                        if (list != null && !list.isEmpty()) {
                            z17 = false;
                        }
                        if (!z17) {
                            ((ku5.t0) ku5.t0.f312615d).h(new t81.n(list, t81.s.this), "MicroMsg.WxaSyncCmdPersistentStorage");
                        }
                    }
                }
                return false;
            }
        }.alive();
        this.f416375b = new t81.q(db6, t81.g.f416360r, dm.d9.f236413h);
        this.f416376c = new t81.r(db6, t81.h.f416361r, dm.e9.f236666h);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0018, code lost:
    
        if (r1.moveToFirst() != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x001a, code lost:
    
        r3 = new t81.g();
        r3.convertFrom(r1);
        r0.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0029, code lost:
    
        if (r1.moveToNext() != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x002b, code lost:
    
        vz5.b.a(r1, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.tencent.mm.plugin.appbrand.appcache.qa r14) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t81.s.a(com.tencent.mm.plugin.appbrand.appcache.qa):void");
    }

    public int b(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return -1;
        }
        t81.h hVar = new t81.h();
        hVar.field_username = str;
        if (this.f416376c.get(hVar, new java.lang.String[0])) {
            return hVar.field_reportId;
        }
        return -1;
    }

    public boolean c(java.lang.String str) {
        t81.q qVar = this.f416375b;
        boolean z17 = true;
        if (str == null || str.length() == 0) {
            return false;
        }
        t81.g gVar = new t81.g();
        gVar.field_appId = str;
        try {
            if (qVar.get(gVar, new java.lang.String[0])) {
                int i17 = gVar.field_reportId;
                boolean delete = qVar.delete(gVar, new java.lang.String[0]);
                if (delete && f416373f != null) {
                    r81.f.INSTANCE.b(i17, 192);
                }
                z17 = delete;
            }
            return z17;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaSyncCmdPersistentStorage", "removeInvalidCodeTimestampForAppId appId:" + str + " exception:" + e17);
            return false;
        }
    }

    public boolean d(java.lang.String str) {
        t81.r rVar = this.f416376c;
        boolean z17 = true;
        if (str == null || str.length() == 0) {
            return false;
        }
        t81.h hVar = new t81.h();
        hVar.field_username = str;
        try {
            if (rVar.get(hVar, new java.lang.String[0])) {
                int i17 = hVar.field_reportId;
                boolean delete = rVar.delete(hVar, new java.lang.String[0]);
                if (delete && f416373f != null) {
                    r81.f.INSTANCE.b(i17, 200);
                }
                z17 = delete;
            }
            return z17;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaSyncCmdPersistentStorage", "removeInvalidContactTimestampForUsername username:" + str + ", exception:" + e17);
            return false;
        }
    }

    public final t81.g e(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        t81.g gVar = new t81.g();
        gVar.field_appId = str;
        int K = r26.n0.K(str, '$', 0, false, 6, null);
        if (K >= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaSyncCmdPersistentStorage", "getInvalidCodeTimestampForAppId get invalid appId(" + str + "), stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
            java.lang.String substring = str.substring(0, K);
            kotlin.jvm.internal.o.f(substring, "substring(...)");
            gVar.field_appId = substring;
            if (substring.length() == 0) {
                return null;
            }
        }
        if (this.f416375b.get(gVar, new java.lang.String[0])) {
            return gVar;
        }
        return null;
    }
}

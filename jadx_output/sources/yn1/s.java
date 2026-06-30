package yn1;

@j95.b
/* loaded from: classes11.dex */
public final class s extends i95.w implements mv.v {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.backup.migration.MigrationAccountService$exptListener$1 f463816d;

    /* renamed from: e, reason: collision with root package name */
    public yn1.c0 f463817e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f463818f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f463819g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f463820h;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.backup.migration.MigrationAccountService$exptListener$1] */
    public s() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f463816d = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ExptChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.backup.migration.MigrationAccountService$exptListener$1
            {
                this.__eventId = -31521245;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ExptChangeEvent exptChangeEvent) {
                com.tencent.mm.autogen.events.ExptChangeEvent event = exptChangeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                ((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).Zi();
                yn1.s sVar = yn1.s.this;
                if (sVar.f463818f) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i("MM.Mig.MigrationAccountService", "Change isPomEnable from " + sVar.f463818f + " to true");
                sVar.f463818f = true;
                kotlin.jvm.internal.o.o("accountInfoUpdater");
                throw null;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object wi(yn1.s r22, kotlin.coroutines.Continuation r23) {
        /*
            Method dump skipped, instructions count: 761
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yn1.s.wi(yn1.s, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public r45.ol4 Ai(java.lang.String usernameHash) {
        kotlin.jvm.internal.o.g(usernameHash, "usernameHash");
        byte[] j17 = Bi().j(Ni(usernameHash));
        if (j17 == null) {
            return null;
        }
        r45.ol4 ol4Var = new r45.ol4();
        ol4Var.parseFrom(j17);
        return ol4Var;
    }

    public final com.tencent.mm.sdk.platformtools.o4 Bi() {
        return com.tencent.mm.sdk.platformtools.o4.N("migration_account", 1, null);
    }

    public void Di() {
        java.lang.String k17 = gm0.j1.b().k();
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationAccountService", "[hideBannerForever] shouldShowBanner=" + this.f463819g + ", hasBannerShown=" + this.f463820h + ", username=" + k17);
        if (this.f463819g) {
            this.f463819g = false;
            new com.tencent.mm.autogen.events.MigrationBannerEntryEvent().b(android.os.Looper.getMainLooper());
        }
        kotlin.jvm.internal.o.d(k17);
        java.lang.String K1 = com.tencent.mm.sdk.platformtools.t8.K1(k17);
        kotlin.jvm.internal.o.f(K1, "sha256(...)");
        r45.ol4 Ai = Ai(K1);
        if (Ai == null) {
            com.tencent.mars.xlog.Log.e("MM.Mig.MigrationAccountService", "Fail to get accountInfo by username=".concat(k17));
            return;
        }
        if (Ai.f382346f != 0) {
            com.tencent.mars.xlog.Log.i("MM.Mig.MigrationAccountService", "Change remainBannerCount from " + Ai.f382346f + " to 0");
            Ai.f382346f = 0;
            com.tencent.mm.sdk.platformtools.o4 Bi = Bi();
            java.lang.String username = Ai.f382344d;
            kotlin.jvm.internal.o.f(username, "username");
            java.lang.String K12 = com.tencent.mm.sdk.platformtools.t8.K1(username);
            kotlin.jvm.internal.o.f(K12, "sha256(...)");
            Bi.H(Ni(K12), Ai.toByteArray());
        }
    }

    public final java.lang.String Ni(java.lang.String str) {
        return "hashUsernamePrefix#" + str;
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        yn1.z0 z0Var = yn1.z0.f463933a;
        java.lang.String k17 = gm0.j1.b().k();
        kotlin.jvm.internal.o.f(k17, "getUserName(...)");
        if (z0Var.o(k17)) {
            com.tencent.mars.xlog.Log.i("MM.Mig.MigrationAccountService", "[MigrationService.onAccountInitialized] Nothing to do.");
            return;
        }
        this.f463820h = false;
        this.f463819g = false;
        yn1.h4 h4Var = (yn1.h4) ((mv.w) i95.n0.c(mv.w.class));
        h4Var.Zi();
        this.f463818f = true;
        h4Var.Ni();
        h4Var.Vi();
        ((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).Ri();
        ((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).aj();
        alive();
        yn1.c0 c0Var = new yn1.c0(new kotlinx.coroutines.g2(((ku5.t0) ku5.t0.f312615d).p("MigrationAccountService")), null, "MM.Mig.MigrationAccountService", 2, null);
        this.f463817e = c0Var;
        c0Var.a(new yn1.r(this, null));
        boolean z17 = j62.e.g().i("clicfg_migration_enable_cdn_android", 0, true, true) > 0;
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationGlobalHolder", "saveCdnMigrateExpt, enable = " + z17);
        com.tencent.mm.sdk.platformtools.o4.L().G("clicfg_migration_enable_cdn_android_mmkv", z17);
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountReleased(context);
        yn1.z0 z0Var = yn1.z0.f463933a;
        java.lang.String k17 = gm0.j1.b().k();
        kotlin.jvm.internal.o.f(k17, "getUserName(...)");
        boolean o17 = z0Var.o(k17);
        boolean z17 = this.f463817e != null;
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationAccountService", "[onAccountReleased] isVirtualLogin=" + o17 + ", isInitialized=" + z17);
        if (z17) {
            yn1.c0 c0Var = this.f463817e;
            if (c0Var == null) {
                kotlin.jvm.internal.o.o("accountScope");
                throw null;
            }
            kotlinx.coroutines.z0.c(c0Var, null);
            kotlinx.coroutines.p0 p0Var = c0Var.f463620d;
            if (p0Var instanceof kotlinx.coroutines.f2) {
                ((kotlinx.coroutines.f2) p0Var).close();
            }
            dead();
        }
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onCreate(context);
        if (gm0.j1.a()) {
            com.tencent.mars.xlog.Log.i("MM.Mig.MigrationAccountService", "[initIfNecessary] Account has ready, skip init");
        } else {
            com.tencent.mm.sdk.platformtools.o4 Bi = Bi();
            if (Bi.i("isInitialized", false)) {
                com.tencent.mars.xlog.Log.i("MM.Mig.MigrationAccountService", "[initIfNecessary] Current device has already initialized");
            } else {
                c01.uc ucVar = c01.uc.f37514c;
                java.util.HashSet hashSet = (java.util.HashSet) ucVar.d();
                java.util.ArrayList arrayList = new java.util.ArrayList(hashSet.size());
                java.util.Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    java.lang.String str = (java.lang.String) it.next();
                    java.lang.String string = ucVar.f37517b.getString(str, "");
                    if (string != null && !string.isEmpty()) {
                        try {
                            org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(android.util.Base64.decode(string, 0)));
                            java.lang.String optString = jSONObject.optString("last_login_uin", "0");
                            java.lang.String optString2 = jSONObject.optString("last_avatar_path", "");
                            int F1 = (int) com.tencent.mm.sdk.platformtools.t8.F1(optString, 0L);
                            if (F1 != 0) {
                                arrayList.add(new c01.tc(str, F1, optString2));
                            }
                        } catch (org.json.JSONException unused) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.SwitchAccountInfo", "Fail to parse jsonObject from str=%s", string);
                        }
                    }
                }
                java.util.Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    c01.tc tcVar = (c01.tc) it6.next();
                    r45.ol4 ol4Var = new r45.ol4();
                    ol4Var.f382344d = tcVar.f37495a;
                    int i17 = tcVar.f37496b;
                    ol4Var.f382345e = i17;
                    ol4Var.f382346f = 0;
                    ol4Var.f382347g = true;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[initIfNecessary] Save account(");
                    java.lang.String username = tcVar.f37495a;
                    sb6.append(username);
                    sb6.append(", ");
                    sb6.append(i17);
                    sb6.append(')');
                    com.tencent.mars.xlog.Log.i("MM.Mig.MigrationAccountService", sb6.toString());
                    kotlin.jvm.internal.o.f(username, "username");
                    java.lang.String K1 = com.tencent.mm.sdk.platformtools.t8.K1(username);
                    kotlin.jvm.internal.o.f(K1, "sha256(...)");
                    Bi.H(Ni(K1), ol4Var.toByteArray());
                }
                Bi.G("isInitialized", true);
                com.tencent.mars.xlog.Log.i("MM.Mig.MigrationAccountService", "[initIfNecessary] init done");
            }
        }
        zn1.i0 i0Var = zn1.i0.f474447a;
        if (!((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).Di()) {
            com.tencent.mars.xlog.Log.w("UsbDeviceManager", "[registerUsbChecker] Aoa is not enable, skip registering usb checker");
            return;
        }
        com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner appUIForegroundOwner = com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE;
        zn1.h0 h0Var = zn1.i0.f474451e;
        appUIForegroundOwner.removeLifecycleCallback(h0Var);
        appUIForegroundOwner.addLifecycleCallback(h0Var);
        if (appUIForegroundOwner.isForeground()) {
            com.tencent.mars.xlog.Log.i("UsbDeviceManager", "[registerUsbChecker] Start connecting device");
            h0Var.onEnterForeground();
        }
    }
}

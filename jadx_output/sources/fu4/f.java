package fu4;

/* loaded from: classes9.dex */
public class f implements fu4.h, com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public fu4.g f266889d = null;

    /* renamed from: e, reason: collision with root package name */
    public fu4.g f266890e = null;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f266891f = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f266892g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f266893h = false;

    public void a(android.content.Context context, fu4.g gVar, android.os.Bundle bundle) {
        if (bundle != null) {
            this.f266891f = bundle.getString("key_pay_passwd");
            boolean z17 = bundle.getBoolean("key_fp_lock_offline_mode");
            this.f266892g = z17;
            com.tencent.mars.xlog.Log.i("MicroMsg.FingerprintLockOpenDelegate", "prepare pwd: %s, isOfflineMode: %b", this.f266891f, java.lang.Boolean.valueOf(z17));
        }
        this.f266889d = gVar;
        this.f266893h = false;
        com.tencent.mm.plugin.walletlock.model.l lVar = com.tencent.mm.plugin.walletlock.model.l.instance;
        lVar.f181370d = null;
        lVar.f181371e = null;
        gm0.j1.d().a(1967, this);
        gm0.j1.d().a(1548, this);
        if (this.f266892g) {
            lVar.f181370d = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
            b(false);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.x2.d() == null) {
            fu4.g gVar2 = this.f266889d;
            if (gVar2 != null) {
                gVar2.h(2, "system error");
                return;
            }
            return;
        }
        re4.v a17 = re4.u.a();
        java.lang.String str = a17.f394553a;
        java.lang.String str2 = a17.f394554b;
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerprintLockOpenDelegate", "cpuId: %s, uid: %s", str, str2);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            gm0.j1.d().g(new fu4.i(str, str2));
        } else {
            je0.i iVar = (je0.i) i95.n0.c(je0.i.class);
            fu4.e eVar = new fu4.e(this);
            ((ie0.m) iVar).getClass();
            se4.h.a(true, true, eVar);
        }
    }

    public final void b(boolean z17) {
        fu4.k kVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerprintLockOpenDelegate", "prepareAuthKey isNeedChangeAuthKey: %b", java.lang.Boolean.valueOf(z17));
        fu4.d dVar = new fu4.d(this);
        if (this.f266892g) {
            kVar = null;
        } else {
            je0.j jVar = (je0.j) i95.n0.c(je0.j.class);
            java.lang.String str = this.f266891f;
            ((ie0.o) jVar).getClass();
            kVar = new fu4.k(str);
        }
        ((ie0.o) ((je0.j) i95.n0.c(je0.j.class))).getClass();
        cu5.b.e(dVar, z17, true, 3, kVar, new oe4.i());
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerprintLockOpenDelegate", "fingerprint wallet lock open delegate errType: %d, errCode: %d, errMsg: %s, cgi type: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(m1Var.getType()));
        if (this.f266893h) {
            return;
        }
        if (m1Var instanceof fu4.i) {
            if (i17 == 0 && i18 == 0) {
                fu4.i iVar = (fu4.i) m1Var;
                com.tencent.mm.plugin.walletlock.model.l.instance.f181370d = iVar.f266896f;
                b(iVar.f266897g);
                return;
            } else {
                fu4.g gVar = this.f266889d;
                if (gVar != null) {
                    gVar.h(7, "get challenge failed");
                    return;
                }
                return;
            }
        }
        if (m1Var instanceof fu4.j) {
            if (i17 == 0 && i18 == 0) {
                com.tencent.mm.plugin.walletlock.model.m.a(true);
                fu4.g gVar2 = this.f266890e;
                if (gVar2 != null) {
                    gVar2.h(0, "open touch lock ok");
                    return;
                }
                return;
            }
            cu5.b.f(3);
            com.tencent.mm.plugin.walletlock.model.m.a(false);
            fu4.g gVar3 = this.f266890e;
            if (gVar3 != null) {
                gVar3.h(6, "open touch lock failed");
            }
        }
    }
}

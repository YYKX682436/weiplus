package yn1;

/* loaded from: classes11.dex */
public final class s3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f463830d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f463831e;

    /* renamed from: f, reason: collision with root package name */
    public int f463832f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f463833g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yn1.a4 f463834h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f463835i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(java.lang.String str, yn1.a4 a4Var, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f463833g = str;
        this.f463834h = a4Var;
        this.f463835i = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yn1.s3(this.f463833g, this.f463834h, this.f463835i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yn1.s3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.ol4 accountInfo;
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f463832f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String K1 = com.tencent.mm.sdk.platformtools.t8.K1(yn1.z0.f463933a.j());
            kotlin.jvm.internal.o.d(K1);
            if ((K1.length() > 0) && !kotlin.jvm.internal.o.b(K1, this.f463833g)) {
                com.tencent.mars.xlog.Log.e(this.f463834h.f463606a, "[RSEWUA] currentHash=" + K1 + ", hashUsername=" + this.f463833g);
                com.tencent.wechat.aff.migration.a aVar2 = this.f463834h.f463609d;
                if (aVar2 != null) {
                    aVar2.M1(this.f463835i, bw5.h0.MATCH_FAIL);
                }
                return jz5.f0.f302826a;
            }
            accountInfo = ((yn1.s) ((mv.v) i95.n0.c(mv.v.class))).Ai(this.f463833g);
            if (accountInfo == null) {
                com.tencent.mars.xlog.Log.w(this.f463834h.f463606a, "[RSEWUA] Target account(sha256=" + this.f463833g + ") doesn't have chat history on the current device.");
                com.tencent.wechat.aff.migration.a aVar3 = this.f463834h.f463609d;
                if (aVar3 != null) {
                    aVar3.M1(this.f463835i, bw5.h0.NO_CHAT_LOG);
                }
                return jz5.f0.f302826a;
            }
            java.lang.String str2 = yn1.z0.f463944l;
            yn1.a4 a4Var = this.f463834h;
            long j17 = this.f463835i;
            if (str2.length() == 0) {
                com.tencent.mars.xlog.Log.w(a4Var.f463606a, "[RSEWUA] qrcode is empty");
                com.tencent.wechat.aff.migration.a aVar4 = a4Var.f463609d;
                if (aVar4 != null) {
                    aVar4.M1(j17, bw5.h0.OTHER_ERROR);
                }
                return jz5.f0.f302826a;
            }
            sn1.z zVar = sn1.z.f410116a;
            bw5.xd0 xd0Var = new bw5.xd0();
            xd0Var.f35070d = str2;
            xd0Var.f35071e[2] = true;
            bw5.yd0 yd0Var = new bw5.yd0();
            yn1.r3 r3Var = yn1.r3.f463815d;
            this.f463830d = accountInfo;
            this.f463831e = str2;
            this.f463832f = 1;
            java.lang.Object a17 = zVar.a(17573, "/cgi-bin/micromsg-bin/migratemsggetbindinfo", xd0Var, yd0Var, r3Var, this);
            if (a17 == aVar) {
                return aVar;
            }
            str = str2;
            obj = a17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) this.f463831e;
            accountInfo = (r45.ol4) this.f463830d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        sn1.j jVar = (sn1.j) obj;
        bw5.yd0 yd0Var2 = (bw5.yd0) jVar.f410031a;
        if (jVar.f410032b != 0 || jVar.f410033c != 0 || yd0Var2 == null) {
            com.tencent.mars.xlog.Log.e(this.f463834h.f463606a, "[RSEWUA] errType=" + jVar.f410032b + ", errCode=" + jVar.f410033c + ", errMsg=" + jVar.f410034d);
            com.tencent.wechat.aff.migration.a aVar5 = this.f463834h.f463609d;
            if (aVar5 != null) {
                aVar5.M1(this.f463835i, bw5.h0.OTHER_ERROR);
            }
            return jz5.f0.f302826a;
        }
        long j18 = yd0Var2.f35449e;
        if (j18 == 1) {
            com.tencent.mars.xlog.Log.w(this.f463834h.f463606a, "[RSEWUA] qrcode=" + str + " is expired");
            com.tencent.wechat.aff.migration.a aVar6 = this.f463834h.f463609d;
            if (aVar6 != null) {
                aVar6.M1(this.f463835i, bw5.h0.QRCODE_EXPIRED);
            }
            return jz5.f0.f302826a;
        }
        if (j18 != 0) {
            com.tencent.mars.xlog.Log.w(this.f463834h.f463606a, "[RSEWUA] flag=" + yd0Var2.f35449e);
            com.tencent.wechat.aff.migration.a aVar7 = this.f463834h.f463609d;
            if (aVar7 != null) {
                aVar7.M1(this.f463835i, bw5.h0.OTHER_ERROR);
            }
            return jz5.f0.f302826a;
        }
        if (!kotlin.jvm.internal.o.b(yd0Var2.f35453i[2] ? yd0Var2.f35448d : "", this.f463833g)) {
            java.lang.String str3 = this.f463834h.f463606a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[RSEWUA] Account mismatch. resp.sha256Username=");
            sb6.append(yd0Var2.f35453i[2] ? yd0Var2.f35448d : "");
            sb6.append(", hashUsername=");
            sb6.append(this.f463833g);
            com.tencent.mars.xlog.Log.e(str3, sb6.toString());
            com.tencent.wechat.aff.migration.a aVar8 = this.f463834h.f463609d;
            if (aVar8 != null) {
                aVar8.M1(this.f463835i, bw5.h0.MATCH_FAIL);
            }
            return jz5.f0.f302826a;
        }
        yn1.z0 z0Var = yn1.z0.f463933a;
        synchronized (z0Var) {
            kotlin.jvm.internal.o.g(accountInfo, "accountInfo");
            com.tencent.mars.xlog.Log.i("MM.Mig.MigrationGlobalHolder", "[reInitWithAccountInfo] Ready to reinit with account=" + accountInfo.f382344d);
            iz5.a.g("Migration must be initialized before", z0Var.n());
            iz5.a.b("Status must be equal.", java.lang.Boolean.valueOf(z0Var.j().length() > 0), java.lang.Boolean.valueOf(gm0.j1.a()));
            if (z0Var.j().length() > 0) {
                java.lang.String str4 = accountInfo.f382344d;
                java.lang.String j19 = z0Var.j();
                if (str4 == null || !str4.equals(j19)) {
                    throw new iz5.d("Account must be equal.", str4, j19);
                }
                com.tencent.mars.xlog.Log.i("MM.Mig.MigrationGlobalHolder", "Account=" + z0Var.j() + " has already logged in.");
            } else {
                java.lang.String username = accountInfo.f382344d;
                kotlin.jvm.internal.o.f(username, "username");
                yn1.z0.f463947o = username;
                yn1.z0.f463949q = true;
                com.tencent.mars.xlog.Log.i("MMKernel.CoreAccount", "[!] markVirtualLogin");
                com.tencent.mm.sdk.platformtools.o4.M("system_config_prefs").G("virtual_login_mark", true);
                gm0.j1.b().f273241d = accountInfo.f382344d;
                gm0.j1.i().k(accountInfo.f382345e);
                java.lang.String g17 = z0Var.g();
                java.lang.String o17 = new com.tencent.mm.vfs.r6(new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.q7.c("roam_backup"), "migration").o(), "cache").o();
                kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
                com.tencent.mars.xlog.Log.i("MM.Mig.RoamMigrationService", "[getCachePath] migrationCache=".concat(o17));
                if (!com.tencent.mm.vfs.w6.j(o17)) {
                    com.tencent.mm.vfs.w6.u(o17);
                }
                yn1.z0.f463946n = o17;
                com.tencent.wechat.aff.migration.f.f217390b.i(accountInfo.f382345e, accountInfo.f382344d, z0Var.g());
                com.tencent.mars.xlog.Log.i("MM.Mig.MigrationGlobalHolder", "Reinit backup storage model with ".concat(z0Var.j()));
                tn1.f.f().b();
                tn1.f.f().c();
                ((ku5.t0) ku5.t0.f312615d).q(new yn1.s0(g17));
            }
        }
        com.tencent.wechat.aff.migration.a aVar9 = this.f463834h.f463609d;
        if (aVar9 != null) {
            aVar9.M1(this.f463835i, bw5.h0.SUCCESS);
        }
        return jz5.f0.f302826a;
    }
}

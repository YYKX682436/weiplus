package yq3;

/* loaded from: classes11.dex */
public final class v implements com.tencent.mm.contact.o {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f464529z = {kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(yq3.v.class, "conRemark", "getConRemark()Ljava/lang/String;", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(yq3.v.class, "remarkDesc", "getRemarkDesc()Ljava/lang/String;", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(yq3.v.class, "contactLabels", "getContactLabels()Ljava/lang/String;", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(yq3.v.class, "phoneListStr", "getPhoneListStr()Ljava/lang/String;", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(yq3.v.class, "remarkImgUrl", "getRemarkImgUrl()Ljava/lang/String;", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(yq3.v.class, "contactExtra", "getContactExtra()Lcom/tencent/mm/protocal/protobuf/ContactExtraInfo;", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(yq3.v.class, "contactLabelIds", "getContactLabelIds()Ljava/lang/String;", 0))};

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f464530a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Intent f464531b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f464532c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.storage.e8 f464533d;

    /* renamed from: e, reason: collision with root package name */
    public final xg3.v0 f464534e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f464535f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.storage.ya f464536g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f464537h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f464538i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f464539j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f464540k;

    /* renamed from: l, reason: collision with root package name */
    public final zn4.b f464541l;

    /* renamed from: m, reason: collision with root package name */
    public final zn4.b f464542m;

    /* renamed from: n, reason: collision with root package name */
    public final zn4.b f464543n;

    /* renamed from: o, reason: collision with root package name */
    public final zn4.b f464544o;

    /* renamed from: p, reason: collision with root package name */
    public final zn4.b f464545p;

    /* renamed from: q, reason: collision with root package name */
    public final zn4.b f464546q;

    /* renamed from: r, reason: collision with root package name */
    public final zn4.b f464547r;

    /* renamed from: s, reason: collision with root package name */
    public final zn4.b f464548s;

    /* renamed from: t, reason: collision with root package name */
    public final zn4.b f464549t;

    /* renamed from: u, reason: collision with root package name */
    public final zn4.b f464550u;

    /* renamed from: v, reason: collision with root package name */
    public final zn4.b f464551v;

    /* renamed from: w, reason: collision with root package name */
    public final zn4.b f464552w;

    /* renamed from: x, reason: collision with root package name */
    public final zn4.b f464553x;

    /* renamed from: y, reason: collision with root package name */
    public final zn4.b f464554y;

    public v(java.lang.String str, android.content.Intent intent, kotlin.jvm.internal.i iVar) {
        this.f464530a = str;
        this.f464531b = intent;
        this.f464532c = j62.e.g().c(new com.tencent.mm.repairer.config.friend.RepairerConfigSetContactPropertySyncEnable()) == 1;
        com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        kotlin.jvm.internal.o.f(Bi, "getContactStg(...)");
        this.f464533d = Bi;
        xg3.v0 mj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj();
        kotlin.jvm.internal.o.f(mj6, "getStrangerStg(...)");
        this.f464534e = mj6;
        zn4.b bVar = new zn4.b(new yq3.f(this), new yq3.g(this));
        this.f464541l = bVar;
        zn4.b bVar2 = new zn4.b(new yq3.p(this), new yq3.q(this));
        this.f464542m = bVar2;
        zn4.b bVar3 = new zn4.b(new yq3.j(this), new yq3.k(this));
        this.f464543n = bVar3;
        zn4.b bVar4 = new zn4.b(new yq3.l(this), new yq3.m(this));
        this.f464544o = bVar4;
        zn4.b bVar5 = new zn4.b(new yq3.n(this), new yq3.o(this));
        this.f464545p = bVar5;
        zn4.b bVar6 = new zn4.b(new yq3.r(this), new yq3.s(this));
        this.f464546q = bVar6;
        zn4.b bVar7 = new zn4.b(new yq3.h(this), new yq3.i(this));
        this.f464547r = bVar7;
        if (!(str == null || r26.n0.N(str))) {
            com.tencent.mm.storage.z3 n17 = Bi.n(str, true);
            if (l(n17)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WxContact", "initializeWithUsername() [" + str + "] not exist in DB");
                if (intent != null) {
                    this.f464535f = b(intent);
                    j();
                } else {
                    boolean E4 = com.tencent.mm.storage.z3.E4(str);
                    com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
                    if (E4) {
                        z3Var.K1(str);
                    } else {
                        z3Var.X1(str);
                    }
                    this.f464535f = z3Var;
                    j();
                }
            } else {
                this.f464538i = true;
                this.f464535f = n17;
                com.tencent.mars.xlog.Log.i("MicroMsg.WxContact", "initializeWithUsername() [" + str + "] exist in DB, isContact: " + n17.r2());
                if (n17.r2()) {
                    this.f464536g = null;
                } else {
                    j();
                }
            }
        } else {
            if (intent == null) {
                throw new java.lang.IllegalArgumentException("inputUsername is null or blank and intent is null!");
            }
            this.f464535f = b(intent);
            j();
        }
        this.f464548s = bVar;
        this.f464549t = bVar2;
        this.f464550u = bVar4;
        this.f464551v = bVar5;
        this.f464552w = bVar6;
        this.f464553x = bVar7;
        this.f464554y = bVar3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0215, code lost:
    
        if (r2 == null) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yq3.v.a(java.lang.String):void");
    }

    public final com.tencent.mm.storage.z3 b(android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra("Contact_User");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.lang.String stringExtra2 = intent.getStringExtra("Contact_Alias");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        java.lang.String stringExtra3 = intent.getStringExtra("Contact_Encryptusername");
        java.lang.String str = stringExtra3 != null ? stringExtra3 : "";
        java.lang.String stringExtra4 = intent.getStringExtra("Contact_Nick");
        int intExtra = intent.getIntExtra("Contact_Sex", 0);
        java.lang.String stringExtra5 = intent.getStringExtra("Contact_Province");
        java.lang.String stringExtra6 = intent.getStringExtra("Contact_City");
        java.lang.String stringExtra7 = intent.getStringExtra("Contact_Signature");
        int intExtra2 = intent.getIntExtra("Contact_VUser_Info_Flag", 0);
        java.lang.String stringExtra8 = intent.getStringExtra("Contact_VUser_Info");
        java.lang.String stringExtra9 = intent.getStringExtra("Contact_Distance");
        int intExtra3 = intent.getIntExtra("Contact_KWeibo_flag", 0);
        java.lang.String stringExtra10 = intent.getStringExtra("Contact_KWeibo");
        java.lang.String stringExtra11 = intent.getStringExtra("Contact_KWeiboNick");
        java.lang.String stringExtra12 = intent.getStringExtra("Contact_KFacebookName");
        long longExtra = intent.getLongExtra("Contact_KFacebookId", 0L);
        java.lang.String stringExtra13 = intent.getStringExtra("Contact_RegionCode");
        int intExtra4 = intent.getIntExtra("Contact_Ext_Flag", 0);
        java.lang.String stringExtra14 = intent.getStringExtra("key_add_contact_openim_appid");
        int intExtra5 = intent.getIntExtra("key_add_contact_custom_detail_visible", 0);
        java.lang.String stringExtra15 = intent.getStringExtra("key_add_contact_custom_detail");
        com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
        z3Var.X1(stringExtra);
        z3Var.K1(str);
        z3Var.k1(stringExtra2);
        z3Var.M1(stringExtra4);
        z3Var.R1(intent.getStringExtra("Contact_PyInitial"));
        z3Var.S1(intent.getStringExtra("Contact_QuanPin"));
        z3Var.g3(intExtra);
        z3Var.D2(intent.getIntExtra("biz_type", 0));
        z3Var.b3(stringExtra5);
        z3Var.L2(stringExtra6);
        z3Var.h3(stringExtra7);
        z3Var.Z1(intExtra2);
        z3Var.o3(stringExtra8);
        z3Var.P2(stringExtra9);
        z3Var.p3(stringExtra10);
        z3Var.a2(intExtra3);
        z3Var.b2(stringExtra11);
        z3Var.S2(longExtra);
        z3Var.T2(stringExtra12);
        z3Var.c3(stringExtra13);
        z3Var.G1 = intExtra4;
        z3Var.J1 = stringExtra15;
        z3Var.I1 = intExtra5;
        z3Var.f236581u = true;
        z3Var.P1(stringExtra14);
        this.f464537h = true;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createContactFromIntent() username: ");
        sb6.append(stringExtra);
        sb6.append(", nickname: ");
        com.tencent.mm.storage.z3 z3Var2 = this.f464535f;
        java.lang.String P0 = z3Var2 != null ? z3Var2.P0() : null;
        sb6.append(P0 != null ? p(P0) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.WxContact", sb6.toString());
        return z3Var;
    }

    public java.lang.String c() {
        return (java.lang.String) this.f464548s.a(this, f464529z[0]);
    }

    public java.lang.String d() {
        java.lang.String f27;
        com.tencent.mm.storage.z3 z3Var = this.f464535f;
        if (z3Var != null && (f27 = z3Var.f2()) != null) {
            return f27;
        }
        com.tencent.mm.storage.ya yaVar = this.f464536g;
        java.lang.String str = yaVar != null ? yaVar.field_conRemark : null;
        return str == null ? "" : str;
    }

    public java.lang.String e() {
        zq3.a aVar = zq3.a.f475033a;
        zq3.b bVar = zq3.b.f475037g;
        java.lang.String[] strArr = new java.lang.String[4];
        com.tencent.mm.storage.z3 z3Var = this.f464535f;
        strArr[0] = z3Var != null ? z3Var.d1() : null;
        strArr[1] = this.f464530a;
        com.tencent.mm.storage.z3 z3Var2 = this.f464535f;
        strArr[2] = z3Var2 != null ? z3Var2.J0() : null;
        com.tencent.mm.storage.ya yaVar = this.f464536g;
        strArr[3] = yaVar != null ? yaVar.field_encryptUsername : null;
        return aVar.a(bVar, strArr);
    }

    public java.lang.String f() {
        return (java.lang.String) this.f464549t.a(this, f464529z[1]);
    }

    public int g() {
        com.tencent.mm.storage.z3 z3Var = this.f464535f;
        if (z3Var != null) {
            return z3Var.f236575p0;
        }
        return 0;
    }

    public java.lang.String h() {
        zq3.a aVar = zq3.a.f475033a;
        zq3.b bVar = zq3.b.f475034d;
        java.lang.String[] strArr = new java.lang.String[5];
        com.tencent.mm.storage.z3 z3Var = this.f464535f;
        strArr[0] = z3Var != null ? z3Var.d1() : null;
        strArr[1] = this.f464530a;
        strArr[2] = this.f464540k;
        com.tencent.mm.storage.z3 z3Var2 = this.f464535f;
        strArr[3] = z3Var2 != null ? z3Var2.J0() : null;
        com.tencent.mm.storage.ya yaVar = this.f464536g;
        strArr[4] = yaVar != null ? yaVar.field_encryptUsername : null;
        return aVar.a(bVar, strArr);
    }

    public java.lang.String i() {
        zq3.a aVar = zq3.a.f475033a;
        zq3.b bVar = zq3.b.f475036f;
        java.lang.String[] strArr = new java.lang.String[5];
        com.tencent.mm.storage.z3 z3Var = this.f464535f;
        strArr[0] = z3Var != null ? z3Var.d1() : null;
        strArr[1] = this.f464530a;
        strArr[2] = this.f464540k;
        com.tencent.mm.storage.z3 z3Var2 = this.f464535f;
        strArr[3] = z3Var2 != null ? z3Var2.J0() : null;
        com.tencent.mm.storage.ya yaVar = this.f464536g;
        strArr[4] = yaVar != null ? yaVar.field_encryptUsername : null;
        return aVar.a(bVar, strArr);
    }

    public final void j() {
        zq3.a aVar = zq3.a.f475033a;
        zq3.b bVar = zq3.b.f475034d;
        java.lang.String[] strArr = new java.lang.String[3];
        com.tencent.mm.storage.z3 z3Var = this.f464535f;
        strArr[0] = z3Var != null ? z3Var.J0() : null;
        com.tencent.mm.storage.z3 z3Var2 = this.f464535f;
        strArr[1] = z3Var2 != null ? z3Var2.d1() : null;
        java.lang.String str = this.f464530a;
        strArr[2] = str;
        java.lang.String a17 = aVar.a(bVar, strArr);
        if (a17 == null || r26.n0.N(a17)) {
            return;
        }
        com.tencent.mm.storage.ya z07 = ((com.tencent.mm.storage.ab) this.f464534e).z0(a17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initializeStrangerForContact() username: ");
        sb6.append(a17);
        sb6.append(", exist: ");
        sb6.append(!m(z07));
        com.tencent.mars.xlog.Log.i("MicroMsg.WxContact", sb6.toString());
        if (m(z07)) {
            com.tencent.mm.storage.ya yaVar = new com.tencent.mm.storage.ya();
            yaVar.field_encryptUsername = a17;
            this.f464536g = yaVar;
        } else {
            this.f464539j = true;
            this.f464536g = z07;
        }
        com.tencent.mm.storage.z3 z3Var3 = this.f464535f;
        java.lang.String J0 = z3Var3 != null ? z3Var3.J0() : null;
        if (J0 == null || r26.n0.N(J0)) {
            zq3.b bVar2 = zq3.b.f475037g;
            java.lang.String[] strArr2 = new java.lang.String[3];
            com.tencent.mm.storage.z3 z3Var4 = this.f464535f;
            strArr2[0] = z3Var4 != null ? z3Var4.J0() : null;
            com.tencent.mm.storage.z3 z3Var5 = this.f464535f;
            strArr2[1] = z3Var5 != null ? z3Var5.d1() : null;
            strArr2[2] = str;
            java.lang.String a18 = aVar.a(bVar2, strArr2);
            com.tencent.mars.xlog.Log.i("MicroMsg.WxContact", "initializeStrangerForContact() set encryptUsername: " + a18);
            com.tencent.mm.storage.z3 z3Var6 = this.f464535f;
            if (z3Var6 == null) {
                return;
            }
            z3Var6.K1(a18);
        }
    }

    public boolean k() {
        com.tencent.mm.storage.z3 z3Var = this.f464535f;
        return z3Var != null && z3Var.r2();
    }

    public final boolean l(com.tencent.mm.storage.z3 z3Var) {
        if (z3Var == null || ((int) z3Var.E2) == 0) {
            return true;
        }
        java.lang.String d17 = z3Var.d1();
        if (d17 == null || r26.n0.N(d17)) {
            java.lang.String J0 = z3Var.J0();
            if (J0 == null || r26.n0.N(J0)) {
                return true;
            }
        }
        return false;
    }

    public final boolean m(com.tencent.mm.storage.ya yaVar) {
        if (yaVar == null) {
            return true;
        }
        java.lang.String str = yaVar.field_encryptUsername;
        return str == null || r26.n0.N(str);
    }

    public final java.lang.String n(java.lang.String str, java.lang.String str2) {
        if (str2 == null) {
            return str;
        }
        return str2.length() == 0 ? str : r26.i0.t(str, str2, p(str2), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        if (r1 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        if (r8 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o() {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yq3.v.o():void");
    }

    public final java.lang.String p(java.lang.String str) {
        java.lang.String G1 = com.tencent.mm.sdk.platformtools.t8.G1(str);
        kotlin.jvm.internal.o.f(G1, "secPrint(...)");
        return G1;
    }

    public void q(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.f464548s.b(this, f464529z[0], str);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object r(android.content.Context r16, kotlin.coroutines.Continuation r17) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yq3.v.r(android.content.Context, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public java.lang.String toString() {
        return "Contact[" + i() + ", " + e() + "]: remark: " + p(c()) + ", ";
    }
}

package com.tencent.mm.storage;

/* loaded from: classes9.dex */
public class f9 extends ot0.n3 implements java.lang.Cloneable {

    /* renamed from: r2, reason: collision with root package name */
    public static final /* synthetic */ int f193926r2 = 0;

    /* renamed from: h2, reason: collision with root package name */
    public com.tencent.mm.storage.z8 f193928h2;

    /* renamed from: i2, reason: collision with root package name */
    public com.tencent.mm.storage.d9 f193929i2;

    /* renamed from: m2, reason: collision with root package name */
    public java.lang.String f193933m2;

    /* renamed from: o2, reason: collision with root package name */
    public java.lang.String f193935o2;

    /* renamed from: g2, reason: collision with root package name */
    public com.tencent.mm.storage.a9 f193927g2 = null;

    /* renamed from: j2, reason: collision with root package name */
    public r45.ee f193930j2 = null;

    /* renamed from: k2, reason: collision with root package name */
    public boolean f193931k2 = false;

    /* renamed from: l2, reason: collision with root package name */
    public long f193932l2 = -1;

    /* renamed from: n2, reason: collision with root package name */
    public java.lang.String f193934n2 = "";

    /* renamed from: p2, reason: collision with root package name */
    public java.lang.String f193936p2 = "";

    /* renamed from: q2, reason: collision with root package name */
    public int f193937q2 = 0;

    public f9() {
    }

    public static void L1(long j17) {
        iz5.a.g("msgId: " + j17 + " not in the reasonable scope", 1500000001 > j17 && -10 < j17);
    }

    public static com.tencent.mm.storage.f9 M1(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null) {
            return null;
        }
        com.tencent.mm.storage.f9 f9Var2 = new com.tencent.mm.storage.f9();
        f9Var2.setMsgId(f9Var.getMsgId());
        f9Var2.o1(f9Var.I0());
        f9Var2.setType(super.getType());
        f9Var2.r1(f9Var.P0());
        f9Var2.j1(f9Var.A0());
        f9Var2.e1(f9Var.getCreateTime());
        f9Var2.u1(f9Var.Q0());
        f9Var2.d1(super.j());
        super.i1(f9Var.z0());
        f9Var2.p1(f9Var.J0());
        f9Var2.k1(f9Var.D0());
        f9Var2.D1(f9Var.W0());
        f9Var2.l1(f9Var.F);
        f9Var2.u3(f9Var.G);
        return f9Var2;
    }

    public boolean A2() {
        return super.getType() == -2097151951;
    }

    public boolean B2() {
        return super.getType() == 1191182385;
    }

    @Override // dm.c8
    public void C1(java.lang.String str) {
        if (pt0.f0.f358209b1.h()) {
            com.tencent.mm.storage.i9 a17 = tg3.p1.f419206a.a(this);
            if (a17.f195031i == null) {
                a17.f195031i = new com.tencent.mm.storage.v8();
            }
            a17.f195031i.f196287d = str;
            tg3.q1.a(a17, this);
        }
        super.C1(str);
    }

    public boolean C2() {
        return super.getType() == 47;
    }

    @Override // dm.c8
    public void D1(java.lang.String str) {
        if (pt0.f0.f358209b1.h()) {
            com.tencent.mm.storage.i9 a17 = tg3.p1.f419206a.a(this);
            if (a17.f195031i == null) {
                a17.f195031i = new com.tencent.mm.storage.v8();
            }
            a17.f195031i.f196288e = str;
            tg3.q1.a(a17, this);
        }
        super.D1(str);
    }

    public boolean D2() {
        return super.getType() == 486539313 && this.f193931k2 && this.f193930j2 != null;
    }

    public boolean E2() {
        return super.getType() == 42 || super.getType() == 66;
    }

    public boolean F2() {
        java.util.Map d17;
        return (com.tencent.mm.sdk.platformtools.t8.K0(this.G) || (d17 = com.tencent.mm.sdk.platformtools.aa.d(this.G, "msgsource", null)) == null || com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) d17.get(".msgsource.watchuser"))) ? false : true;
    }

    public boolean G2() {
        return super.getType() == -2130706383 || super.getType() == -2113929167;
    }

    public boolean H2() {
        return super.getType() == 805306417;
    }

    public boolean I2() {
        int i17 = this.F;
        return ((i17 & 128) == 0 && (i17 & 768) == 0) ? false : true;
    }

    @Override // dm.c8
    public java.lang.String J0() {
        java.lang.String str;
        java.lang.String J0 = super.J0();
        pt0.e0 e0Var = pt0.f0.f358209b1;
        e0Var.getClass();
        ((ez.k1) ((pt0.f0) i95.n0.c(pt0.f0.class))).getClass();
        if (bm5.w.a(this) == bm5.v.f22744g) {
            if (!(J0 == null || J0.length() == 0)) {
                return J0;
            }
            ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
            ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
            t21.v2 g17 = t21.o2.Ui().g(z0());
            str = g17 != null ? g17.g() : null;
            return !(str == null || str.length() == 0) ? str : J0;
        }
        if (!x2()) {
            return J0;
        }
        java.lang.String S1 = S1();
        if (S1 == null || S1.length() == 0) {
            return J0;
        }
        ot0.q v17 = ot0.q.v(S1());
        rt0.d dVar = v17 != null ? (rt0.d) v17.y(rt0.d.class) : null;
        java.lang.String str2 = dVar != null ? dVar.f399375b : null;
        if (!(str2 == null || str2.length() == 0)) {
            return S1();
        }
        com.tencent.mm.storage.f9 k17 = e0Var.k(Q0(), getMsgId());
        ot0.q v18 = ot0.q.v(k17 != null ? k17.S1() : null);
        rt0.d dVar2 = v18 != null ? (rt0.d) v18.y(rt0.d.class) : null;
        str = dVar2 != null ? dVar2.f399375b : null;
        return ((str == null || str.length() == 0) || k17 == null) ? J0 : k17.S1();
    }

    public boolean J2() {
        int type = super.getType();
        return type == 3 || type == 13 || type == 23 || type == 33 || type == 39;
    }

    public boolean K1() {
        return (P0() <= 3 || P0() == 8) && A0() == 1;
    }

    public boolean K2() {
        return super.getType() == 67;
    }

    public boolean L2() {
        return super.getType() == 48;
    }

    public boolean M2() {
        return super.getType() == 486539313;
    }

    public boolean N2() {
        return super.getType() == 64;
    }

    public boolean O2() {
        return super.getType() == 10002 || super.getType() == 268445458 || P2();
    }

    public int P1() {
        c01.ea w17;
        return (!pt0.f0.f358209b1.h() || (w17 = c01.w9.w(this.G)) == null) ? this.W : w17.f37148g;
    }

    public boolean P2() {
        return super.getType() == 285222674;
    }

    @Override // dm.c8
    public int R0() {
        return pt0.f0.f358209b1.h() ? (int) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().u(Q0()) : super.R0();
    }

    public java.lang.String R1() {
        if (pt0.f0.f358209b1.h()) {
            c01.ea w17 = c01.w9.w(this.G);
            java.lang.String str = w17 == null ? null : w17.f37147f;
            if (str != null) {
                return str;
            }
        }
        return this.P;
    }

    public java.lang.String S1() {
        return super.j();
    }

    public boolean S2() {
        return super.getType() == 889192497 || super.getType() == 922746929;
    }

    @Override // dm.c8
    public java.lang.String T0() {
        java.lang.String T0 = super.T0();
        return android.text.TextUtils.isEmpty(T0) ? A0() == 1 ? Q0() : (java.lang.String) gm0.j1.u().c().l(2, "") : T0;
    }

    public long T1() {
        return super.getCreateTime();
    }

    public boolean T2() {
        return super.getType() == 822083633;
    }

    @Override // dm.c8
    public java.lang.String U0() {
        com.tencent.mm.storage.i9 a17 = tg3.p1.f419206a.a(this);
        com.tencent.mm.storage.v8 v8Var = a17.f195031i;
        return (v8Var == null || com.tencent.mm.sdk.platformtools.t8.K0(v8Var.f196287d)) ? super.U0() : a17.f195031i.f196287d;
    }

    public java.lang.String U1() {
        if (A0() != 0 || com.tencent.mm.sdk.platformtools.t8.K0(j()) || !com.tencent.mm.storage.z3.R4(Q0())) {
            return j();
        }
        int indexOf = j().indexOf(58);
        return (indexOf < 0 || indexOf >= j().length()) ? j() : j().substring(0, indexOf).contains("<") ? j() : j().substring(indexOf + 1).trim();
    }

    public boolean U2() {
        java.lang.String j17 = j();
        return j17 != null && j17.contains("tmpl_type_recommend_remark_sys_tip");
    }

    public java.lang.String V1() {
        int indexOf;
        if (A0() != 0 || com.tencent.mm.sdk.platformtools.t8.K0(j()) || !com.tencent.mm.storage.z3.R4(Q0()) || (indexOf = j().indexOf(58)) < 0 || indexOf >= j().length() || j().substring(0, indexOf).contains("<")) {
            return null;
        }
        return j().substring(0, indexOf).trim();
    }

    public boolean V2() {
        return (this.F & 4) == 4;
    }

    @Override // dm.c8
    public java.lang.String W0() {
        com.tencent.mm.storage.i9 a17 = tg3.p1.f419206a.a(this);
        com.tencent.mm.storage.v8 v8Var = a17.f195031i;
        return (v8Var == null || com.tencent.mm.sdk.platformtools.t8.K0(v8Var.f196288e)) ? super.W0() : a17.f195031i.f196288e;
    }

    public java.lang.String W1() {
        com.tencent.mm.storage.i9 a17 = tg3.p1.f419206a.a(this);
        return !com.tencent.mm.sdk.platformtools.t8.K0(a17.f195028f) ? a17.f195028f : this.U;
    }

    public boolean W2() {
        return super.getType() == 268445456 || super.getType() == 268445458 || super.getType() == 285222674;
    }

    public java.lang.String X1() {
        com.tencent.mm.storage.i9 a17 = tg3.p1.f419206a.a(this);
        return !com.tencent.mm.sdk.platformtools.t8.K0(a17.f195027e) ? a17.f195027e : this.V;
    }

    public boolean X2() {
        return super.getType() == 301989937;
    }

    @Override // dm.c8
    public void Y0(long j17) {
        if (pt0.f0.f358209b1.h()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgInfo", "[setBizChatId] not support, bizChatId: %d", java.lang.Long.valueOf(j17));
        }
        super.Y0(j17);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String Y1() {
        /*
            r13 = this;
            pt0.e0 r0 = pt0.f0.f358209b1
            r0.getClass()
            java.lang.Class<vg3.j4> r0 = vg3.j4.class
            i95.m r0 = i95.n0.c(r0)
            vg3.j4 r0 = (vg3.j4) r0
            y04.e r0 = (y04.e) r0
            r0.getClass()
            java.lang.Class<x04.e> r0 = x04.e.class
            i95.m r0 = i95.n0.c(r0)
            x04.e r0 = (x04.e) r0
            c14.b r0 = r0.wi()
            java.lang.String r1 = r13.Q0()
            long r2 = r13.getMsgId()
            l75.k0 r4 = r0.f37939d
            java.lang.String r5 = "SelectRecord"
            l75.e0 r0 = c14.a.f37936t
            java.lang.String[] r6 = r0.f316954c
            java.lang.String r7 = "msgId=? and talker=?"
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String[] r8 = new java.lang.String[]{r0, r1}
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 2
            android.database.Cursor r0 = r4.D(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r0 != 0) goto L43
            goto L79
        L43:
            r1 = 0
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L6c
            r2.<init>()     // Catch: java.lang.Throwable -> L6c
        L49:
            boolean r3 = r0.moveToNext()     // Catch: java.lang.Throwable -> L6c
            if (r3 == 0) goto L5b
            c14.a r3 = new c14.a     // Catch: java.lang.Throwable -> L6c
            r3.<init>()     // Catch: java.lang.Throwable -> L6c
            r3.convertFrom(r0)     // Catch: java.lang.Throwable -> L6c
            r2.add(r3)     // Catch: java.lang.Throwable -> L6c
            goto L49
        L5b:
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L6c
            if (r3 != 0) goto L62
            goto L76
        L62:
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L6c
            c14.a r2 = (c14.a) r2     // Catch: java.lang.Throwable -> L6c
            r0.close()
            goto L7a
        L6c:
            r2 = move-exception
            java.lang.String r3 = "MicroMsg.selectRecord.SelectRecordStorage"
            java.lang.String r4 = "getSelectRecordItem err"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L82
            com.tencent.mars.xlog.Log.printErrStackTrace(r3, r2, r4, r1)     // Catch: java.lang.Throwable -> L82
        L76:
            r0.close()
        L79:
            r2 = 0
        L7a:
            if (r2 == 0) goto L7f
            java.lang.String r0 = r2.field_historyId
            goto L81
        L7f:
            java.lang.String r0 = ""
        L81:
            return r0
        L82:
            r1 = move-exception
            r0.close()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.storage.f9.Y1():java.lang.String");
    }

    public boolean Y2() {
        return super.getType() == 62;
    }

    @Override // dm.c8
    public void Z0(java.lang.String str) {
        if (pt0.f0.f358209b1.h()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgInfo", "[setBizChatUserId] not support, bizChatUserId: %s", str);
        } else {
            super.Z0(str);
        }
    }

    public int Z1() {
        return (A0() != 1 || 3 == P0()) ? 1 : 0;
    }

    public boolean Z2() {
        return super.getType() == 10000;
    }

    @Override // dm.c8
    public void a1(java.lang.String str) {
        if (pt0.f0.f358209b1.h()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgInfo", "[setBizClientMsgId] not support, bizClientMsgId: %s", str);
        }
        super.a1(str);
    }

    public boolean a2() {
        return (this.F & 64) != 0;
    }

    public boolean a3() {
        return super.getType() == 318767153 || B2();
    }

    public boolean b2() {
        return i2() && (this.F & 16) > 0;
    }

    public boolean b3() {
        int type = super.getType();
        return type == 1 || type == 11 || type == 21 || type == 31 || type == 36 || type == 1107296305;
    }

    public int c2() {
        int i17 = tg3.p1.f419206a.a(this).f195030h;
        return i17 != 0 ? i17 : this.M;
    }

    public boolean c3() {
        return super.getType() == 10000 && (w0() & 2097152) != 0;
    }

    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // dm.c8, l75.f0
    public void convertFrom(android.database.Cursor cursor) {
        super.convertFrom(cursor);
        pt0.f0.f358209b1.getClass();
        if (((java.lang.Boolean) ((jz5.n) pt0.e0.f358207o).getValue()).booleanValue()) {
            this.systemRowid = getMsgId();
        }
        java.lang.String j17 = j();
        if (j17 != null && j17.length() > 2097152) {
            long msgId = getMsgId();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(1024);
            sb6.append("Very big message: \nmsgId = ");
            sb6.append(msgId);
            sb6.append("\nmsgSvrId = ");
            sb6.append(I0());
            sb6.append("\ntype = ");
            sb6.append(super.getType());
            sb6.append("\ncreateTime = ");
            sb6.append(getCreateTime());
            sb6.append("\ntalker = ");
            sb6.append(Q0());
            sb6.append("\nflag = ");
            sb6.append(w0());
            sb6.append("\ncontent.length() = ");
            sb6.append(j17.length());
            sb6.append("\ncontent = ");
            sb6.append(j17.substring(0, 256));
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgInfo", sb6.toString());
            setType(1);
            d1("");
            gm0.j1.e().j(new com.tencent.mm.storage.x8(this, msgId, M1(this)));
        }
        L1(getMsgId());
    }

    @Override // dm.c8, l75.f0
    public android.content.ContentValues convertTo() {
        L1(getMsgId());
        return super.convertTo();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018e  */
    @Override // dm.c8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d1(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.storage.f9.d1(java.lang.String):void");
    }

    public java.lang.String d2() {
        try {
            if (this.f193928h2 == null) {
                this.f193928h2 = new com.tencent.mm.storage.z8();
                this.f193928h2.f196406a = (java.lang.String) com.tencent.mm.sdk.platformtools.aa.d(j(), "sysmsg", null).get(".sysmsg.sysmsgtemplate.content_template.link_list.link2.msgcount");
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.storage.z8 z8Var = this.f193928h2;
        return z8Var != null ? z8Var.f196406a : "";
    }

    public boolean d3() {
        return super.getType() == 1426063409;
    }

    public java.lang.String e2() {
        if (!O2()) {
            return "";
        }
        if (this.f193933m2 == null) {
            n3();
        }
        return this.f193933m2;
    }

    public boolean e3() {
        return super.getType() == 1409286193;
    }

    public java.lang.String f2() {
        com.tencent.mm.storage.i9 a17 = tg3.p1.f419206a.a(this);
        return !com.tencent.mm.sdk.platformtools.t8.K0(a17.f195033n) ? a17.f195033n : this.f236185x0;
    }

    public int g2() {
        return this.F & 4;
    }

    public boolean g3() {
        return super.getType() == 34;
    }

    @Override // dm.c8
    public long getCreateTime() {
        java.util.Map d17;
        try {
            if (this.f193929i2 == null) {
                com.tencent.mm.storage.d9 d9Var = new com.tencent.mm.storage.d9();
                this.f193929i2 = d9Var;
                d9Var.f193841a = this.G.contains("<share_msg>");
                com.tencent.mm.storage.d9 d9Var2 = this.f193929i2;
                if (d9Var2.f193841a) {
                    java.lang.String str = this.G;
                    int i17 = c01.ia.f37254a;
                    d9Var2.f193842b = (str == null || com.tencent.mm.sdk.platformtools.t8.K0(str) || (d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "msgsource", null)) == null) ? -1L : com.tencent.mm.sdk.platformtools.t8.E1((java.lang.String) d17.get(".msgsource.share_msg.createtime")) * 1000;
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.storage.d9 d9Var3 = this.f193929i2;
        if (d9Var3 != null && d9Var3.f193841a) {
            long j17 = d9Var3.f193842b;
            if (j17 != -1) {
                return j17;
            }
        }
        return super.getCreateTime();
    }

    @Override // dm.c8
    public int getType() {
        return super.getType();
    }

    @Override // dm.c8
    public void h1(java.lang.String str) {
        super.h1(str);
    }

    public int h2() {
        return (P0() < 3 || P0() > 6) ? 0 : 1;
    }

    public boolean h3() {
        return super.getType() == -1879048189;
    }

    @Override // dm.c8
    public void i1(java.lang.String str) {
        super.i1(str);
    }

    public boolean i2() {
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("TranslateMsgOff");
        return (com.tencent.mm.sdk.platformtools.t8.K0(d17) || com.tencent.mm.sdk.platformtools.t8.D1(d17, 0) == 0) && !com.tencent.mm.sdk.platformtools.t8.K0(W0());
    }

    public boolean i3() {
        return super.getType() == -1879048190;
    }

    public boolean isVideo() {
        return super.getType() == 43;
    }

    @Override // dm.c8
    public java.lang.String j() {
        pt0.f0.f358209b1.getClass();
        boolean z17 = true;
        if (x2()) {
            ((ez.k1) ((pt0.f0) i95.n0.c(pt0.f0.class))).getClass();
            java.lang.String S1 = S1();
            if (!(S1 == null || S1.length() == 0)) {
                ot0.q v17 = ot0.q.v(S1());
                rt0.d dVar = v17 != null ? (rt0.d) v17.y(rt0.d.class) : null;
                java.lang.String str = dVar != null ? dVar.f399375b : null;
                if (str != null && str.length() != 0) {
                    z17 = false;
                }
                if (!z17) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    java.lang.String S12 = S1();
                    kotlin.jvm.internal.o.f(S12, "getDBContent(...)");
                    java.lang.String S13 = S1();
                    kotlin.jvm.internal.o.f(S13, "getDBContent(...)");
                    java.lang.String substring = S12.substring(0, r26.n0.K(S13, '<', 0, false, 6, null));
                    kotlin.jvm.internal.o.f(substring, "substring(...)");
                    sb6.append(substring);
                    sb6.append(dVar != null ? dVar.f399375b : null);
                    return sb6.toString();
                }
            }
            return S1();
        }
        if (g3()) {
            ((ez.k1) ((pt0.f0) i95.n0.c(pt0.f0.class))).getClass();
            java.lang.String S14 = S1();
            if (S14 != null && S14.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                java.lang.String S15 = S1();
                kotlin.jvm.internal.o.f(S15, "getDBContent(...)");
                if (r26.n0.B(S15, "<msg>", false)) {
                    z15.b bVar = new z15.b();
                    java.lang.String r17 = c01.w9.r(S1());
                    kotlin.jvm.internal.o.f(r17, "getGroupChatMsgContent(...)");
                    bVar.fromXml(r17);
                    return w21.u0.c(bVar.getFromUsername(), bVar.k(), bVar.o());
                }
            }
            return S1();
        }
        if (!isVideo()) {
            return S1();
        }
        ((ez.k1) ((pt0.f0) i95.n0.c(pt0.f0.class))).getClass();
        java.lang.String S16 = S1();
        if (S16 != null && S16.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            java.lang.String S17 = S1();
            kotlin.jvm.internal.o.f(S17, "getDBContent(...)");
            if (r26.n0.B(S17, "<msg>", false)) {
                y15.d dVar2 = new y15.d();
                y15.c n17 = dVar2.n();
                java.lang.String S18 = S1();
                kotlin.jvm.internal.o.f(S18, "getDBContent(...)");
                n17.fromXml(S18);
                y15.c n18 = dVar2.n();
                java.lang.String string = n18.getString(n18.f458922d + 17);
                y15.c n19 = dVar2.n();
                return t21.t2.a(string, n19.getInteger(n19.f458922d + 10), false);
            }
        }
        return S1();
    }

    public boolean j2() {
        return super.getType() == 10000 || super.getType() == 10002 || super.getType() == 570425393 || super.getType() == 64 || super.getType() == 603979825 || super.getType() == 889192497 || super.getType() == 922746929 || super.getType() == 268445456 || super.getType() == 268445458 || super.getType() == 285222674 || super.getType() == -1879048191 || super.getType() == 1077936177;
    }

    public boolean j3() {
        return super.getType() == -1879048191;
    }

    public boolean k2() {
        return (super.getType() & 65535) == 49 && super.getType() != 1107296305;
    }

    public boolean k3() {
        return super.getType() == 50 || super.getType() == 53;
    }

    public boolean l2() {
        return super.getType() == 503316529;
    }

    public boolean l3() {
        return super.getType() == 52;
    }

    public boolean m2() {
        return super.getType() == 1048625;
    }

    public boolean m3() {
        return super.getType() == 1627390001;
    }

    public boolean n2() {
        return super.getType() == 1090519089;
    }

    public d21.c n3() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgInfo", "[parseNewXmlSysMsg]");
        java.lang.String j17 = j();
        if (super.getType() == 268445458 || super.getType() == 285222674) {
            j17 = f2();
        }
        d21.c cVar = null;
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(j17, "sysmsg", null);
        java.util.HashMap hashMap = d21.a.f225782a;
        if (d17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseNewXmlMsg", "values is null !!!");
        } else {
            java.lang.String str = (java.lang.String) d17.get(".sysmsg.$type");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            java.util.HashMap hashMap2 = d21.a.f225782a;
            synchronized (hashMap2) {
                d21.a aVar = (d21.a) hashMap2.get(str.toLowerCase());
                if (aVar == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.BaseNewXmlMsg", "TYPE %s is unDefine", str);
                } else {
                    cVar = aVar.a(d17, this);
                }
            }
        }
        if (cVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgInfo", "BaseNewXmlMsg:%s", cVar);
            cVar.a();
            this.f193933m2 = cVar.f225789e;
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgInfo", "[parseNewXmlSysMsg] null == pBaseNewXmlMsg");
        }
        return cVar;
    }

    public boolean o2() {
        return super.getType() == 268435505;
    }

    public void o3(int i17) {
        if (pt0.f0.f358209b1.h()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgInfo", "[setBizKfType] not support, bizKfType: %d", java.lang.Integer.valueOf(i17));
        } else {
            this.W = i17;
            this.f236178r = true;
        }
    }

    @Override // dm.c8
    public void p1(java.lang.String str) {
        pt0.e0 e0Var = pt0.f0.f358209b1;
        e0Var.getClass();
        ((ez.k1) ((pt0.f0) i95.n0.c(pt0.f0.class))).getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgFeatureService", "setReserved, businessType: " + bm5.w.a(this) + ", msgId: " + getMsgId() + ", talker: " + I0() + ", reserved:" + str);
        if (e0Var.h()) {
            if (bm5.w.a(this) != bm5.v.f22744g && x2()) {
                if (!(str == null || str.length() == 0)) {
                    ot0.q v17 = ot0.q.v(str);
                    rt0.d dVar = v17 != null ? (rt0.d) v17.y(rt0.d.class) : null;
                    java.lang.String str2 = dVar != null ? dVar.f399375b : null;
                    if (!(str2 == null || str2.length() == 0)) {
                        d1(str);
                    }
                }
            }
            r1 = true;
        }
        if (r1) {
            return;
        }
        super.p1(str);
    }

    public boolean p2() {
        return super.getType() == 855638065;
    }

    public void p3(java.lang.String str) {
        if (pt0.f0.f358209b1.h()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgInfo", "[setBizKfWorker] not support, bizKfWorker: %s", str);
        } else {
            this.P = str;
            this.f236178r = true;
        }
    }

    public boolean q2() {
        return super.getType() == 16777265;
    }

    public void q3(int i17) {
        if (i17 == 0 || i17 == 1) {
            l1(i17 | this.F);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.MsgInfo", "Illgeal forwardflag !!!");
        }
    }

    @Override // dm.c8
    public void r1(int i17) {
        super.r1(i17);
        if (A0() == 1) {
            if ((b3() || L2() || E2()) ? false : true) {
                if (P0() != 5) {
                    if (P0() == 2) {
                        com.tencent.mm.autogen.events.SendMsgSuccessEvent sendMsgSuccessEvent = new com.tencent.mm.autogen.events.SendMsgSuccessEvent();
                        sendMsgSuccessEvent.f54755g.f7659a = this;
                        sendMsgSuccessEvent.e();
                        return;
                    }
                    return;
                }
                java.lang.Long valueOf = java.lang.Long.valueOf(getMsgId());
                java.lang.Integer valueOf2 = java.lang.Integer.valueOf(super.getType());
                java.lang.String Q0 = Q0();
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.MsgInfo", "set msg status fail, msgId:%d, type:%d, userName:%s %s", valueOf, valueOf2, Q0, new com.tencent.mm.sdk.platformtools.z3());
                com.tencent.mm.autogen.events.SendMsgFailEvent sendMsgFailEvent = new com.tencent.mm.autogen.events.SendMsgFailEvent();
                sendMsgFailEvent.f54753g.f7461a = this;
                sendMsgFailEvent.e();
                return;
            }
        }
        if (A0() == 0) {
            com.tencent.mm.autogen.events.ReceiveMsgEvent receiveMsgEvent = new com.tencent.mm.autogen.events.ReceiveMsgEvent();
            receiveMsgEvent.f54654g.f8209a = this;
            receiveMsgEvent.e();
        }
    }

    public boolean r2() {
        return !com.tencent.mm.sdk.platformtools.t8.K0(this.G) && this.G.contains("notify@all");
    }

    public void r3(java.lang.String str) {
        if (pt0.f0.f358209b1.g()) {
            com.tencent.mm.storage.i9 a17 = tg3.p1.f419206a.a(this);
            a17.f195028f = str;
            tg3.q1.a(a17, this);
        }
        this.U = str;
        this.f236178r = true;
    }

    public boolean s2(java.lang.String str) {
        java.util.Map d17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.G) || com.tencent.mm.sdk.platformtools.t8.K0(str) || !this.G.contains(str) || (d17 = com.tencent.mm.sdk.platformtools.aa.d(this.G, "msgsource", null)) == null) {
            return false;
        }
        java.lang.String str2 = (java.lang.String) d17.get(".msgsource.atuserlist");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            for (java.lang.String str3 : str2.split(",")) {
                if (str3.trim().equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void s3(java.lang.String str) {
        if (pt0.f0.f358209b1.g()) {
            com.tencent.mm.storage.i9 a17 = tg3.p1.f419206a.a(this);
            a17.f195027e = str;
            tg3.q1.a(a17, this);
        }
        this.V = str;
        this.f236178r = true;
    }

    @Override // dm.c8
    public long t0() {
        pt0.f0.f358209b1.h();
        return super.t0();
    }

    public boolean t2() {
        return super.getType() == 285212721;
    }

    public void t3() {
        l1(this.F | 512);
    }

    @Override // dm.c8
    public java.lang.String u0() {
        c01.ea w17;
        return (!pt0.f0.f358209b1.h() || (w17 = c01.w9.w(this.G)) == null || com.tencent.mm.sdk.platformtools.t8.K0(w17.f37156o)) ? super.u0() : w17.f37156o;
    }

    public boolean u2() {
        int type = super.getType();
        return type == 55 || type == 57;
    }

    public void u3(java.lang.String str) {
        this.G = str;
        this.f236178r = true;
        this.f193929i2 = null;
    }

    public void unsetOmittedFailResend() {
        int i17 = this.F;
        if ((i17 & 32) > 0) {
            l1(i17 & (-33));
        }
    }

    @Override // dm.c8
    public java.lang.String v0() {
        c01.ea w17;
        return (!pt0.f0.f358209b1.h() || (w17 = c01.w9.w(this.G)) == null) ? super.v0() : w17.f37146e;
    }

    public boolean v2() {
        java.util.Map d17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.G) || (d17 = com.tencent.mm.sdk.platformtools.aa.d(this.G, "msgsource", null)) == null) {
            return false;
        }
        java.lang.String str = (java.lang.String) d17.get(".msgsource.notify_option.biz_serivce_tmpl_status");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        return str.trim().equals("2");
    }

    public void v3() {
        c1(0);
    }

    public boolean w2() {
        return super.getType() == 436207665;
    }

    public void w3(boolean z17) {
        if (z17) {
            l1(this.F | 524288);
        } else {
            l1(this.F & (-524289));
        }
    }

    public boolean x2() {
        return super.getType() == 1107296305;
    }

    public void x3(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgInfo", "[setRevokeContent] msgId=%d, revokeContent=%s", java.lang.Long.valueOf(getMsgId()), str);
        if (pt0.f0.f358209b1.h()) {
            com.tencent.mm.storage.i9 a17 = tg3.p1.f419206a.a(this);
            a17.f195033n = str;
            tg3.q1.a(a17, this);
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgInfo", "[setRevokeContent] update processingInfo, msgId=%d", java.lang.Long.valueOf(getMsgId()));
        }
        this.f236185x0 = str;
        this.f236178r = true;
    }

    @Override // dm.c8
    public java.lang.String y0() {
        java.lang.String y07 = super.y0();
        return android.text.TextUtils.isEmpty(y07) ? A0() == 1 ? (java.lang.String) gm0.j1.u().c().l(2, "") : Q0() : y07;
    }

    public boolean y2() {
        java.lang.String str = this.G;
        return !com.tencent.mm.sdk.platformtools.t8.K0(str) && str.contains("announcement@all");
    }

    public void y3() {
        l1(this.F | 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dm.c8
    public java.lang.String z0() {
        java.lang.String str;
        pt0.e0 e0Var = pt0.f0.f358209b1;
        java.lang.String z07 = super.z0();
        e0Var.getClass();
        ((ez.k1) ((pt0.f0) i95.n0.c(pt0.f0.class))).getClass();
        if ((z07 == null || z07.length() == 0) != true) {
            return z07;
        }
        java.lang.String str2 = null;
        java.lang.Object obj = null;
        t21.v2 v2Var = null;
        if (bm5.w.a(this) != bm5.v.f22744g) {
            if (bm5.w.a(this) == bm5.v.f22749o) {
                ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).getClass();
                if (!(z07 == null || z07.length() == 0)) {
                    return z07;
                }
                w21.w0 D0 = I0() != 0 ? w21.p0.Di().D0(I0()) : null;
                if (D0 == null) {
                    D0 = w21.p0.Di().J0(Q0(), getMsgId());
                }
                str2 = D0 != null ? D0.f442485b : null;
                if (str2 == null) {
                    if (z07 == null) {
                        z07 = I0() != 0 ? w21.g1.s0(I0()) : w21.g1.n0(Q0(), "");
                    }
                    kotlin.jvm.internal.o.d(z07);
                    return z07;
                }
            } else {
                if (bm5.w.a(this) != bm5.v.f22748n) {
                    return z07;
                }
                ((com.tencent.mm.feature.emoji.b0) ((com.tencent.mm.feature.emoji.api.s5) i95.n0.c(com.tencent.mm.feature.emoji.api.s5.class))).getClass();
                if (!android.text.TextUtils.isEmpty(z07)) {
                    return z07;
                }
                if (getMsgId() == 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.EmojiFeatureService", "getEmoticonMd5 fail, msg is null ");
                } else {
                    ot0.q v17 = ot0.q.v(j());
                    str = (v17 == null || android.text.TextUtils.isEmpty(v17.f348698q)) ? new com.tencent.mm.storage.y4(j()).f196356d : v17.f348698q;
                }
            }
            return str2;
        }
        ((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).getClass();
        ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
        java.util.List h17 = t21.o2.Ui().h(this, z07);
        if (h17 != null) {
            java.util.Iterator it = ((java.util.ArrayList) h17).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                kotlin.jvm.internal.o.f(((t21.v2) next).d(), "getFileName(...)");
                if (!r26.i0.n(r6, ya.b.ORIGIN, false)) {
                    obj = next;
                    break;
                }
            }
            v2Var = (t21.v2) obj;
        }
        if (v2Var == null || (str = v2Var.d()) == null) {
            return z07;
        }
        return str;
    }

    @Override // dm.c8
    public void z1(int i17) {
        if (pt0.f0.f358209b1.h()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgInfo", "[setTalkerId] not support, talkerId: %d", java.lang.Integer.valueOf(i17));
        } else {
            super.z1(i17);
        }
    }

    public boolean z2() {
        return (this.f236165J & 1) > 0;
    }

    public void z3() {
        l1(this.F | 4194304);
    }

    public f9(java.lang.String str) {
        u1(str);
    }
}

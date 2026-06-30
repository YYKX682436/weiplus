package dk2;

/* loaded from: classes3.dex */
public final class a8 implements dk2.zf, dk2.cg, dk2.dg, dk2.fg {

    /* renamed from: a, reason: collision with root package name */
    public final r45.ch1 f233186a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f233187b;

    /* renamed from: c, reason: collision with root package name */
    public int f233188c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f233189d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f233190e;

    /* renamed from: f, reason: collision with root package name */
    public r45.d54 f233191f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f233192g;

    public a8(r45.ch1 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        this.f233186a = msg;
        this.f233191f = r45.d54.SUCCESS;
    }

    @Override // dk2.eg
    public boolean A() {
        return this.f233187b;
    }

    @Override // dk2.cg
    public void B(boolean z17) {
        this.f233190e = z17;
    }

    @Override // dk2.zf
    public r45.xn1 C() {
        return (r45.xn1) this.f233186a.getCustom(0);
    }

    @Override // dk2.zf
    public java.lang.Object D() {
        com.tencent.mm.protobuf.f bj1Var;
        byte[] g17;
        int type = getType();
        r45.ch1 ch1Var = this.f233186a;
        if (type == 20002) {
            r45.xj1 xj1Var = new r45.xj1();
            com.tencent.mm.protobuf.g byteString = ch1Var.getByteString(4);
            xj1Var.parseFrom(byteString != null ? byteString.g() : null);
            return xj1Var;
        }
        if (type == 20034) {
            r45.gi1 gi1Var = new r45.gi1();
            com.tencent.mm.protobuf.g byteString2 = ch1Var.getByteString(4);
            gi1Var.parseFrom(byteString2 != null ? byteString2.g() : null);
            return gi1Var.getList(1);
        }
        if (type == 20041) {
            r45.vh1 vh1Var = new r45.vh1();
            com.tencent.mm.protobuf.g byteString3 = ch1Var.getByteString(4);
            vh1Var.parseFrom(byteString3 != null ? byteString3.g() : null);
            return vh1Var;
        }
        if (type == 20078) {
            bj1Var = new r45.bj1();
            com.tencent.mm.protobuf.g byteString4 = ch1Var.getByteString(4);
            g17 = byteString4 != null ? byteString4.g() : null;
            if (g17 != null) {
                try {
                    bj1Var.parseFrom(g17);
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                }
            }
        } else {
            if (type == 20112) {
                r45.mh1 mh1Var = new r45.mh1();
                com.tencent.mm.protobuf.g byteString5 = ch1Var.getByteString(4);
                byte[] g18 = byteString5 != null ? byteString5.g() : null;
                if (g18 == null) {
                    return null;
                }
                try {
                    mh1Var.parseFrom(g18);
                    return mh1Var;
                } catch (java.lang.Exception e18) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e18);
                    return null;
                }
            }
            if (type == 20122) {
                bj1Var = new r45.yi1();
                com.tencent.mm.protobuf.g byteString6 = ch1Var.getByteString(4);
                g17 = byteString6 != null ? byteString6.g() : null;
                if (g17 != null) {
                    try {
                        bj1Var.parseFrom(g17);
                    } catch (java.lang.Exception e19) {
                        com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e19);
                    }
                }
            } else {
                if (type != 20125) {
                    return null;
                }
                bj1Var = new r45.ej1();
                com.tencent.mm.protobuf.g byteString7 = ch1Var.getByteString(4);
                g17 = byteString7 != null ? byteString7.g() : null;
                if (g17 != null) {
                    try {
                        bj1Var.parseFrom(g17);
                    } catch (java.lang.Exception e27) {
                        com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e27);
                    }
                }
            }
        }
        return bj1Var;
    }

    @Override // dk2.fg
    public void E(java.lang.String str) {
        this.f233192g = str;
    }

    @Override // dk2.zf
    public java.lang.String a() {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        r45.xn1 xn1Var = (r45.xn1) this.f233186a.getCustom(13);
        if (xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) {
            return null;
        }
        return finderContact.getUsername();
    }

    @Override // dk2.fg
    public java.lang.String b() {
        return this.f233192g;
    }

    @Override // dk2.eg
    public void c(boolean z17) {
        this.f233187b = z17;
    }

    @Override // dk2.cg
    public void d(boolean z17) {
        this.f233189d = z17;
    }

    @Override // dk2.zf
    public java.lang.String f() {
        java.lang.String string = this.f233186a.getString(14);
        return string == null ? "" : string;
    }

    @Override // dk2.cg
    public boolean g() {
        return this.f233190e;
    }

    @Override // dk2.dg
    public r45.d54 getStatus() {
        return this.f233191f;
    }

    @Override // dk2.zf
    public int getType() {
        return this.f233186a.getInteger(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    @Override // dk2.zf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String j() {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.a8.j():java.lang.String");
    }

    @Override // dk2.zf
    public java.lang.String k() {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        r45.xn1 xn1Var = (r45.xn1) this.f233186a.getCustom(13);
        if (xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) {
            return null;
        }
        return finderContact.getNickname();
    }

    @Override // dk2.zf
    public boolean l() {
        return this.f233186a.getInteger(9) == 1;
    }

    @Override // dk2.zf
    public long m() {
        return this.f233186a.getLong(12);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    @Override // dk2.zf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean n() {
        /*
            r5 = this;
            int r0 = r5.getType()
            r1 = 20002(0x4e22, float:2.8029E-41)
            r2 = 0
            if (r0 != r1) goto L3a
            r45.xj1 r0 = new r45.xj1
            r0.<init>()
            r1 = 4
            r45.ch1 r3 = r5.f233186a
            com.tencent.mm.protobuf.g r1 = r3.getByteString(r1)
            r3 = 0
            if (r1 == 0) goto L1d
            byte[] r1 = r1.g()
            goto L1e
        L1d:
            r1 = r3
        L1e:
            if (r1 != 0) goto L22
        L20:
            r0 = r3
            goto L33
        L22:
            r0.parseFrom(r1)     // Catch: java.lang.Exception -> L26
            goto L33
        L26:
            r0 = move-exception
            java.lang.String r1 = ""
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r4 = "safeParser"
            com.tencent.mm.sdk.platformtools.Log.a(r4, r1, r0)
            goto L20
        L33:
            if (r0 == 0) goto L3a
            r1 = 3
            boolean r2 = r0.getBoolean(r1)
        L3a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.a8.n():boolean");
    }

    @Override // dk2.cg
    public boolean o() {
        return this.f233189d;
    }

    @Override // dk2.zf
    public int p() {
        return this.f233186a.getInteger(10);
    }

    @Override // dk2.fg
    public jz5.l q() {
        java.lang.Object D = D();
        r45.xj1 xj1Var = D instanceof r45.xj1 ? (r45.xj1) D : null;
        if (xj1Var == null) {
            return null;
        }
        if (!(xj1Var.getInteger(5) == 1)) {
            xj1Var = null;
        }
        if (xj1Var == null) {
            return null;
        }
        java.lang.String string = xj1Var.getString(6);
        com.tencent.mm.protobuf.g byteString = xj1Var.getByteString(7);
        if (string == null || byteString == null) {
            return null;
        }
        return new jz5.l(string, byteString);
    }

    @Override // dk2.zf
    public r45.xn1 r() {
        return (r45.xn1) this.f233186a.getCustom(13);
    }

    @Override // dk2.cg
    public int s() {
        return this.f233188c;
    }

    @Override // dk2.dg
    public void t(r45.d54 d54Var) {
        kotlin.jvm.internal.o.g(d54Var, "<set-?>");
        this.f233191f = d54Var;
    }

    @Override // dk2.zf
    public java.lang.String u() {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        r45.xn1 xn1Var = (r45.xn1) this.f233186a.getCustom(0);
        if (xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) {
            return null;
        }
        return finderContact.getUsername();
    }

    @Override // dk2.zf
    public java.lang.String v() {
        java.lang.String string = this.f233186a.getString(2);
        return string == null ? "" : string;
    }

    @Override // dk2.cg
    public void w(int i17) {
        this.f233188c = i17;
    }

    @Override // dk2.zf
    public java.lang.String y() {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        r45.xn1 xn1Var = (r45.xn1) this.f233186a.getCustom(0);
        if (xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) {
            return null;
        }
        return finderContact.getNickname();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    @Override // dk2.zf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int z() {
        /*
            r6 = this;
            int r0 = r6.getType()
            r1 = 20002(0x4e22, float:2.8029E-41)
            r2 = 0
            if (r0 != r1) goto L39
            r45.xj1 r0 = new r45.xj1
            r0.<init>()
            r45.ch1 r1 = r6.f233186a
            r3 = 4
            com.tencent.mm.protobuf.g r1 = r1.getByteString(r3)
            r4 = 0
            if (r1 == 0) goto L1d
            byte[] r1 = r1.g()
            goto L1e
        L1d:
            r1 = r4
        L1e:
            if (r1 != 0) goto L22
        L20:
            r0 = r4
            goto L33
        L22:
            r0.parseFrom(r1)     // Catch: java.lang.Exception -> L26
            goto L33
        L26:
            r0 = move-exception
            java.lang.String r1 = ""
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r5 = "safeParser"
            com.tencent.mm.sdk.platformtools.Log.a(r5, r1, r0)
            goto L20
        L33:
            if (r0 == 0) goto L39
            int r2 = r0.getInteger(r3)
        L39:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.a8.z():int");
    }
}

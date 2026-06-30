package k91;

/* loaded from: classes4.dex */
public abstract class j4 extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f305625d;

    public j4(l75.k0 k0Var, java.lang.String str, java.lang.String[] strArr) {
        super(k0Var, k91.v5.E1, str, strArr);
        this.f305625d = k0Var;
    }

    public static boolean P0(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str) != android.text.TextUtils.isEmpty(str2)) {
            return false;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            return true;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        int hashCode = str.hashCode();
        if (str2 == null) {
            str2 = "";
        }
        return hashCode == str2.hashCode();
    }

    public static com.tencent.mm.protobuf.g i1(k91.v5 v5Var) {
        byte[] h17;
        if (v5Var == null) {
            h17 = new byte[0];
        } else {
            java.lang.String str = v5Var.field_syncVersion;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            h17 = com.tencent.mm.sdk.platformtools.t8.h(str);
        }
        return new com.tencent.mm.protobuf.g(h17, 0, h17.length);
    }

    public boolean D0() {
        l75.k0 k0Var = this.f305625d;
        return (k0Var == null || k0Var.J()) ? false : true;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public boolean delete(k91.v5 v5Var, boolean z17, java.lang.String... strArr) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(v5Var.field_username)) {
            v5Var.field_usernameHash = v5Var.field_username.hashCode();
        }
        boolean delete = super.delete((l75.f0) v5Var, false, strArr);
        if (delete && z17 && !android.text.TextUtils.isEmpty(v5Var.field_username)) {
            doNotify("single", 5, v5Var.field_username);
        }
        return delete;
    }

    public boolean L0(java.lang.String str, boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaAttrStorage", "delete with invalid username");
            return false;
        }
        k91.v5 v5Var = new k91.v5();
        v5Var.field_username = str;
        return delete(v5Var, z17, new java.lang.String[0]);
    }

    public boolean W0(java.lang.String str, com.tencent.mm.protobuf.g gVar, java.util.List list, boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.L0(list)) {
            return false;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaAttrStorage", "flushAttrs username:%s, list.size:%d", str, java.lang.Integer.valueOf(list.size()));
        }
        k91.v5 v5Var = new k91.v5();
        v5Var.field_username = str;
        boolean z18 = !get(v5Var, dm.i4.COL_USERNAME);
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaAttrStorage", "flushAttrs username:%s, list.size:%d, doInsert:%b", str, java.lang.Integer.valueOf(list.size()), java.lang.Boolean.valueOf(z18));
        }
        java.util.Iterator it = list.iterator();
        boolean z19 = false;
        while (it.hasNext()) {
            r45.yc7 yc7Var = (r45.yc7) it.next();
            if (yc7Var != null) {
                if (!z17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WxaAttrStorage", "flushAttrs username:%s, list.size:%d, doInsert:%b, applyFieldChange(%s):start", str, java.lang.Integer.valueOf(list.size()), java.lang.Boolean.valueOf(z18), yc7Var.f390971d);
                }
                z19 |= y0(v5Var, yc7Var);
                com.tencent.mars.xlog.Log.i("MicroMsg.WxaAttrStorage", "flushAttrs username:%s, list.size:%d, doInsert:%b, applyFieldChange(%s):%b", str, java.lang.Integer.valueOf(list.size()), java.lang.Boolean.valueOf(z18), yc7Var.f390971d, java.lang.Boolean.valueOf(z19));
            }
        }
        v5Var.field_syncTimeSecond = com.tencent.mm.sdk.platformtools.t8.i1();
        v5Var.field_syncVersion = com.tencent.mm.sdk.platformtools.t8.l(gVar == null ? new byte[0] : gVar.f192156a);
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaAttrStorage", "flushAttrs username:%s, list.size:%d, doInsert:%b, apply:%b", str, java.lang.Integer.valueOf(list.size()), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19));
        }
        if (!z19) {
            updateNotify(v5Var, false, dm.i4.COL_USERNAME);
        } else if (z18) {
            insertNotify(v5Var, z17);
        } else {
            updateNotify(v5Var, z17, dm.i4.COL_USERNAME);
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaAttrStorage", "flushAttrs username:%s, list.size:%d, doInsert:%b, apply:%b, complete", str, java.lang.Integer.valueOf(list.size()), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19));
        }
        return z19;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public boolean get(k91.v5 v5Var, java.lang.String... strArr) {
        if (!com.tencent.mm.sdk.platformtools.t8.N0(strArr)) {
            int i17 = 0;
            while (true) {
                if (i17 >= strArr.length) {
                    break;
                }
                if (strArr[i17].equals(dm.i4.COL_USERNAME)) {
                    strArr[i17] = "usernameHash";
                    v5Var.field_usernameHash = v5Var.field_username.hashCode();
                    break;
                }
                i17++;
            }
        }
        return super.get(v5Var, strArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001f, code lost:
    
        if (r10.moveToFirst() != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0021, code lost:
    
        r1 = new k91.v5();
        r1.convertFrom(r10);
        r0.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r10.moveToNext() != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List d1(java.lang.String... r10) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            l75.k0 r1 = r9.f305625d     // Catch: java.lang.Throwable -> L45
            java.lang.String r2 = r9.getTableName()     // Catch: java.lang.Throwable -> L45
            int r3 = r10.length     // Catch: java.lang.Throwable -> L45
            if (r3 != 0) goto Lf
            r10 = 0
        Lf:
            r3 = r10
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r1.E(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L45
            if (r10 == 0) goto L3f
            boolean r1 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L3f
        L21:
            k91.v5 r1 = new k91.v5     // Catch: java.lang.Throwable -> L33
            r1.<init>()     // Catch: java.lang.Throwable -> L33
            r1.convertFrom(r10)     // Catch: java.lang.Throwable -> L33
            r0.add(r1)     // Catch: java.lang.Throwable -> L33
            boolean r1 = r10.moveToNext()     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L21
            goto L3f
        L33:
            r1 = move-exception
            if (r10 == 0) goto L3e
            r10.close()     // Catch: java.lang.Throwable -> L3a
            goto L3e
        L3a:
            r10 = move-exception
            r1.addSuppressed(r10)     // Catch: java.lang.Throwable -> L45
        L3e:
            throw r1     // Catch: java.lang.Throwable -> L45
        L3f:
            if (r10 == 0) goto L51
            r10.close()     // Catch: java.lang.Throwable -> L45
            goto L51
        L45:
            r10 = move-exception
            java.lang.String r1 = "getAllRecords t=%s"
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.String r2 = "MicroMsg.WxaAttrStorage"
            com.tencent.mars.xlog.Log.e(r2, r1, r10)
        L51:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k91.j4.d1(java.lang.String[]):java.util.List");
    }

    @Override // l75.s0
    public void doNotify(java.lang.String str, int i17, java.lang.Object obj) {
        super.doNotify(str, i17, obj);
        new com.tencent.mm.plugin.appbrand.config.WxaAttrStorageNotifyEvent(str, i17, obj).e();
    }

    @Override // l75.n0
    /* renamed from: f1, reason: merged with bridge method [inline-methods] */
    public final boolean insertNotify(k91.v5 v5Var, boolean z17) {
        v5Var.field_usernameHash = v5Var.field_username.hashCode();
        super.insertNotify(v5Var, false);
        boolean z18 = n1(v5Var.field_username, "appId") != null;
        if (z18 && z17 && !android.text.TextUtils.isEmpty(v5Var.field_username)) {
            doNotify("single", 2, v5Var.field_username);
            doNotify("single", 3, v5Var.field_username);
        }
        return z18;
    }

    public k91.v5 k1(java.lang.String str, java.lang.String... strArr) {
        k91.v5 v5Var = null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        android.database.Cursor D = this.f305625d.D(getTableName(), com.tencent.mm.sdk.platformtools.t8.N0(strArr) ? null : strArr, java.lang.String.format(java.util.Locale.US, "%s=?", "appId"), new java.lang.String[]{str}, null, null, null, 2);
        if (D == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaAttrStorage", "queryWithAppId(%s) null==cursor", str);
            return null;
        }
        if (D.moveToFirst()) {
            v5Var = new k91.v5();
            v5Var.convertFrom(D);
            v5Var.field_appId = str;
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaAttrStorage", "queryWithAppId(%s) !cursor.moveToFirst()", str);
        }
        D.close();
        return v5Var;
    }

    public k91.v5 n1(java.lang.String str, java.lang.String... strArr) {
        k91.v5 v5Var;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !str.endsWith("@app")) {
            return null;
        }
        try {
            android.database.Cursor D = this.f305625d.D(getTableName(), com.tencent.mm.sdk.platformtools.t8.N0(strArr) ? null : strArr, java.lang.String.format(java.util.Locale.US, "%s=?", "usernameHash"), new java.lang.String[]{java.lang.String.valueOf(str.hashCode())}, null, null, null, 2);
            if (D == null) {
                if (D != null) {
                    D.close();
                }
                return null;
            }
            try {
                if (D.moveToFirst()) {
                    v5Var = new k91.v5();
                    v5Var.convertFrom(D);
                    v5Var.field_username = str;
                } else {
                    v5Var = null;
                }
                D.close();
                return v5Var;
            } finally {
            }
        } catch (java.lang.RuntimeException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WxaAttrStorage", e17, "queryWithUsername", new java.lang.Object[0]);
            return null;
        }
    }

    public final boolean o1(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        android.content.ContentValues contentValues = new android.content.ContentValues(1);
        contentValues.put("syncTimeSecond", (java.lang.Long) 0L);
        return this.f305625d.p(getTableName(), contentValues, java.lang.String.format(java.util.Locale.US, "%s=?", "appId"), new java.lang.String[]{str}) > 0;
    }

    public boolean p1(java.lang.String str, r45.zc7 zc7Var) {
        k91.v5 k17;
        java.lang.String str2 = null;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && (k17 = k1(str, dm.i4.COL_USERNAME)) != null) {
            str2 = k17.field_username;
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            java.util.Iterator it = zc7Var.f391921e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                r45.yc7 yc7Var = (r45.yc7) it.next();
                if ("UserName".equalsIgnoreCase(yc7Var.f390971d)) {
                    str2 = yc7Var.f390972e;
                    break;
                }
            }
            if (android.text.TextUtils.isEmpty(str2)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WxaAttrStorage", "updateAttrsWithProto appId=%s, username EMPTY", str);
                return false;
            }
        }
        return W0(str2, zc7Var.f391920d, zc7Var.f391921e, true);
    }

    @Override // l75.n0
    /* renamed from: u1, reason: merged with bridge method [inline-methods] */
    public final boolean updateNotify(k91.v5 v5Var, boolean z17, java.lang.String... strArr) {
        if (!com.tencent.mm.sdk.platformtools.t8.N0(strArr)) {
            int i17 = 0;
            while (true) {
                if (i17 >= strArr.length) {
                    break;
                }
                if (strArr[i17].equals(dm.i4.COL_USERNAME)) {
                    strArr[i17] = "usernameHash";
                    v5Var.field_usernameHash = v5Var.field_username.hashCode();
                    break;
                }
                i17++;
            }
        }
        boolean updateNotify = super.updateNotify(v5Var, false, strArr);
        if (updateNotify && z17 && !android.text.TextUtils.isEmpty(v5Var.field_username)) {
            doNotify("single", 3, v5Var.field_username);
        }
        return updateNotify;
    }

    public boolean y0(k91.v5 v5Var, r45.yc7 yc7Var) {
        int P;
        if ("NickName".equals(yc7Var.f390971d) && !P0(yc7Var.f390972e, v5Var.field_nickname)) {
            java.lang.String str = yc7Var.f390972e;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            v5Var.field_nickname = str;
            return true;
        }
        if ("BrandIconURL".equals(yc7Var.f390971d) && !P0(yc7Var.f390972e, v5Var.field_brandIconURL)) {
            v5Var.field_brandIconURL = yc7Var.f390972e;
            return true;
        }
        if ("BigHeadImgUrl".equals(yc7Var.f390971d) && !P0(yc7Var.f390972e, v5Var.field_bigHeadURL)) {
            v5Var.field_bigHeadURL = yc7Var.f390972e;
            return true;
        }
        if ("SmallHeadImgUrl".equals(yc7Var.f390971d) && !P0(yc7Var.f390972e, v5Var.field_smallHeadURL)) {
            v5Var.field_smallHeadURL = yc7Var.f390972e;
            return true;
        }
        if ("Signature".equals(yc7Var.f390971d) && !P0(yc7Var.f390972e, v5Var.field_signature)) {
            v5Var.field_signature = yc7Var.f390972e;
            return true;
        }
        if ("WxAppOpt".equals(yc7Var.f390971d) && (P = com.tencent.mm.sdk.platformtools.t8.P(yc7Var.f390972e, 0)) != v5Var.field_appOpt) {
            v5Var.field_appOpt = P;
            return true;
        }
        if ("RegisterSource".equals(yc7Var.f390971d) && !P0(yc7Var.f390972e, v5Var.field_registerSource)) {
            v5Var.field_registerSource = yc7Var.f390972e;
            return true;
        }
        if ("WxaAppInfo".equals(yc7Var.f390971d) && !P0(yc7Var.f390972e, v5Var.field_appInfo)) {
            v5Var.field_appInfo = yc7Var.f390972e;
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(yc7Var.f390972e);
                v5Var.field_appId = jSONObject.getString("Appid");
                v5Var.field_roundedSquareIconURL = jSONObject.getString("RoundedSquareIconUrl");
                v5Var.field_shortNickname = jSONObject.optString("ShortNickName");
            } catch (java.lang.Exception unused) {
            }
            return true;
        }
        if ("WxaAppVersionInfo".equalsIgnoreCase(yc7Var.f390971d) && !P0(yc7Var.f390972e, v5Var.field_versionInfo)) {
            v5Var.field_versionInfo = yc7Var.f390972e;
            return true;
        }
        if ("BindWxaInfo".equals(yc7Var.f390971d) && !P0(yc7Var.f390972e, v5Var.field_bindWxaInfo)) {
            v5Var.field_bindWxaInfo = yc7Var.f390972e;
            return true;
        }
        if ("WxaAppDynamic".equals(yc7Var.f390971d) && !P0(yc7Var.f390972e, v5Var.field_dynamicInfo)) {
            v5Var.field_dynamicInfo = yc7Var.f390972e;
            return true;
        }
        if ("MMBizMenu".equals(yc7Var.f390971d) && !P0(yc7Var.f390972e, v5Var.field_bizMenu)) {
            v5Var.field_bizMenu = yc7Var.f390972e;
            return true;
        }
        if ("PassThroughInfo".equals(yc7Var.f390971d) && !P0(yc7Var.f390972e, v5Var.field_passThroughInfo)) {
            v5Var.field_passThroughInfo = yc7Var.f390972e;
            return true;
        }
        if (!"StablePassThroughInfo".equals(yc7Var.f390971d) || P0(yc7Var.f390972e, v5Var.field_stablePassThroughInfo)) {
            return false;
        }
        v5Var.field_stablePassThroughInfo = yc7Var.f390972e;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean z0(int r18, r45.gh r19, java.util.List r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r19
            r2 = r20
            java.lang.String r3 = "MicroMsg.WxaAttrStorage"
            java.util.LinkedList r4 = r0.f375243d
            int r4 = r4.size()
            l75.k0 r5 = r1.f305625d
            r8 = 1
            if (r4 > r8) goto L16
            r9 = -1
            goto L28
        L16:
            java.lang.String r4 = com.tencent.mm.sdk.platformtools.z.f193105a
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            long r9 = r4.getId()
            java.lang.Long r4 = java.lang.Long.valueOf(r9)
            long r9 = r5.F(r4)
        L28:
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            r11 = 0
            java.util.LinkedList r0 = r0.f375243d     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            r12 = r11
        L35:
            boolean r13 = r0.hasNext()     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L7f
            if (r13 == 0) goto L6e
            java.lang.Object r13 = r0.next()     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L7f
            r45.bd7 r13 = (r45.bd7) r13     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L7f
            java.lang.String r14 = "batchSyncInGroup, scene(%d), flushAttrs(%s)"
            r15 = 2
            java.lang.Object[] r15 = new java.lang.Object[r15]     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L7f
            java.lang.Integer r16 = java.lang.Integer.valueOf(r18)     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L7f
            r15[r11] = r16     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L7f
            java.lang.String r6 = r13.f370684d     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L7f
            r15[r8] = r6     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L7f
            com.tencent.mars.xlog.Log.i(r3, r14, r15)     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L7f
            java.lang.String r6 = r13.f370684d     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L7f
            com.tencent.mm.protobuf.g r7 = r13.f370685e     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L7f
            java.util.LinkedList r14 = r13.f370686f     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L7f
            boolean r6 = r1.W0(r6, r7, r14, r11)     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L7f
            r12 = r12 | r6
            if (r12 == 0) goto L35
            java.lang.String r6 = r13.f370684d     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L7f
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L7f
            if (r6 != 0) goto L35
            java.lang.String r6 = r13.f370684d     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L7f
            r4.add(r6)     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L7f
            goto L35
        L6e:
            r6 = -1
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 == 0) goto L99
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            r5.w(r0)
            goto L99
        L7c:
            r0 = move-exception
            r11 = r12
            goto L82
        L7f:
            r0 = move-exception
            goto Lab
        L81:
            r0 = move-exception
        L82:
            java.lang.String r6 = "batchUpdateWithProto fail: %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L7f
            com.tencent.mars.xlog.Log.e(r3, r6, r0)     // Catch: java.lang.Throwable -> L7f
            r6 = -1
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 == 0) goto L98
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            r5.w(r0)
        L98:
            r12 = r11
        L99:
            int r0 = r4.size()
            if (r0 <= 0) goto Laa
            if (r2 == 0) goto La4
            r2.addAll(r4)
        La4:
            java.lang.String r0 = "batch"
            r2 = 3
            r1.doNotify(r0, r2, r4)
        Laa:
            return r12
        Lab:
            r2 = -1
            int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r2 == 0) goto Lb8
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            r5.w(r2)
        Lb8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k91.j4.z0(int, r45.gh, java.util.List):boolean");
    }
}

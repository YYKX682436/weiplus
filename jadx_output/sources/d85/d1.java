package d85;

@j95.b
/* loaded from: classes15.dex */
public final class d1 extends i95.w implements d85.m0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f227145f = kz5.c1.l(new jz5.l(d85.g0.LOCAION, new java.lang.String[]{"android.permission.ACCESS_FINE_LOCATION"}), new jz5.l(d85.g0.CONTRACT, new java.lang.String[]{"android.permission.READ_CONTACTS"}), new jz5.l(d85.g0.STORAGE, new java.lang.String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}), new jz5.l(d85.g0.MICRO_PHONE, new java.lang.String[]{"android.permission.RECORD_AUDIO"}), new jz5.l(d85.g0.HEALTHY, new java.lang.String[]{"android.permission.ACTIVITY_RECOGNITION"}), new jz5.l(d85.g0.CAMERA, new java.lang.String[]{"android.permission.CAMERA"}));

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f227146d = "PluginSensitive";

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f227147e = jz5.h.a(jz5.i.f302829d, d85.x0.f227251d);

    public d85.f0 Ai(java.lang.String str) {
        java.lang.Object obj;
        java.util.Iterator<E> it = d85.s0.f227243a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.o.b(((d85.f0) obj).f227176d, str)) {
                break;
            }
        }
        return (d85.f0) obj;
    }

    public boolean Bi(android.app.Activity activity, d85.g0 g0Var, d85.f0 f0Var, d85.k0 k0Var) {
        if (g0Var == null || f0Var == null) {
            return false;
        }
        j85.g.f298251a.c(g0Var, f0Var, null);
        return k85.t.f305439a.c(activity, g0Var, f0Var, new d85.v0(k0Var));
    }

    public boolean Di(d85.g0 permission, d85.f0 business, d85.k0 listener) {
        kotlin.jvm.internal.o.g(permission, "permission");
        kotlin.jvm.internal.o.g(business, "business");
        kotlin.jvm.internal.o.g(listener, "listener");
        j85.g.f298251a.c(permission, business, null);
        return k85.t.f305439a.d(permission, business, new d85.u0(listener));
    }

    public boolean Ni(d85.g0 permission, d85.k0 k0Var) {
        d85.f0 f0Var;
        kotlin.jvm.internal.o.g(permission, "permission");
        java.lang.String c17 = com.tencent.mm.sensitive.business.BusinessStackRecorder.f193183f.c();
        if (c17 != null) {
            try {
                d85.f0[] values = d85.f0.values();
                int length = values.length;
                for (int i17 = 0; i17 < length; i17++) {
                    f0Var = values[i17];
                    if (r26.i0.p(f0Var.f227176d, c17, true)) {
                        break;
                    }
                }
            } catch (java.lang.IllegalArgumentException unused) {
            }
        }
        f0Var = null;
        boolean d17 = f0Var != null ? k0Var != null ? k85.t.f305439a.d(permission, f0Var, new d85.t0(k0Var)) : k85.t.f305439a.d(permission, f0Var, null) : false;
        j85.g.f298251a.c(permission, f0Var, null);
        return d17;
    }

    public boolean Ri(d85.g0 permission, d85.f0 f0Var) {
        java.lang.Boolean bool;
        d85.f0 f0Var2;
        kotlin.jvm.internal.o.g(permission, "permission");
        boolean z17 = false;
        if (f0Var == null) {
            java.lang.String c17 = com.tencent.mm.sensitive.business.BusinessStackRecorder.f193183f.c();
            if (c17 != null) {
                try {
                    d85.f0[] values = d85.f0.values();
                    int length = values.length;
                    for (int i17 = 0; i17 < length; i17++) {
                        f0Var2 = values[i17];
                        if (r26.i0.p(f0Var2.f227176d, c17, true)) {
                            break;
                        }
                    }
                } catch (java.lang.IllegalArgumentException unused) {
                }
                f0Var2 = null;
                f0Var = f0Var2;
            } else {
                f0Var = null;
            }
        }
        j85.g.f298251a.c(permission, f0Var, null);
        java.lang.String value = permission.f227192d;
        kotlin.jvm.internal.o.f(value, "value");
        com.tencent.mm.sdk.platformtools.o4 Zi = Zi(value);
        if (Zi == null) {
            return true;
        }
        java.lang.String str = f0Var != null ? f0Var.f227176d : null;
        if (f0Var != null && (bool = f0Var.f227178f) != null) {
            z17 = bool.booleanValue();
        }
        return Zi.getBoolean(str, !z17);
    }

    public java.lang.String Ui() {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.HashMap hashMap = e85.i.f250315a;
        for (java.util.Map.Entry entry : e85.i.f250315a.entrySet()) {
            d85.g0 g0Var = (d85.g0) entry.getKey();
            java.lang.String[] strArr = (java.lang.String[]) ((java.util.LinkedHashMap) f227145f).get(g0Var);
            if (strArr != null ? j35.u.h(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length)) : false) {
                java.util.Iterator it = ((e85.h) entry.getValue()).f250314c.entrySet().iterator();
                while (it.hasNext()) {
                    d85.f0 f0Var = (d85.f0) ((java.util.Map.Entry) it.next()).getKey();
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("type", g0Var.f227193e);
                    jSONObject.put("biz", f0Var.f227177e);
                    java.lang.String value = g0Var.f227192d;
                    kotlin.jvm.internal.o.f(value, "value");
                    com.tencent.mm.sdk.platformtools.o4 Zi = Zi(value);
                    int i17 = 1;
                    if (!(Zi != null && Zi.getBoolean(f0Var.f227176d, true))) {
                        i17 = 2;
                    }
                    jSONObject.put("status", i17);
                    jSONArray.put(jSONObject);
                }
            }
        }
        java.lang.String jSONArray2 = jSONArray.toString();
        kotlin.jvm.internal.o.f(jSONArray2, "toString(...)");
        return r26.i0.u(jSONArray2, ',', ';', false, 4, null);
    }

    public android.util.Pair Vi(java.lang.String permission, java.lang.String business) {
        d85.f0 f0Var;
        e85.g gVar;
        int i17;
        kotlin.jvm.internal.o.g(permission, "permission");
        kotlin.jvm.internal.o.g(business, "business");
        try {
        } catch (java.lang.IllegalArgumentException unused) {
        }
        try {
            for (d85.g0 g0Var : d85.g0.values()) {
                if (!r26.i0.p(g0Var.f227192d, permission, true)) {
                }
                break;
            }
            break;
            d85.f0[] values = d85.f0.values();
            int length = values.length;
            for (int i18 = 0; i18 < length; i18++) {
                f0Var = values[i18];
                if (r26.i0.p(f0Var.f227176d, business, true)) {
                    break;
                }
            }
        } catch (java.lang.IllegalArgumentException unused2) {
        }
        g0Var = null;
        f0Var = null;
        if (g0Var == null || f0Var == null) {
            return null;
        }
        java.util.HashMap hashMap = e85.i.f250315a;
        e85.h hVar = (e85.h) e85.i.f250315a.get(g0Var);
        if (hVar == null || (gVar = (e85.g) hVar.f250314c.get(f0Var)) == null) {
            return null;
        }
        d85.f0 f0Var2 = d85.f0.f227166q;
        int i19 = gVar.f250309b;
        return (f0Var == f0Var2 && g0Var == d85.g0.MICRO_PHONE && ((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).Vi()) ? new android.util.Pair(java.lang.Integer.valueOf(com.tencent.mm.R.string.m4z), java.lang.Integer.valueOf(i19)) : new android.util.Pair(java.lang.Integer.valueOf(gVar.f250308a), java.lang.Integer.valueOf(i19));
    }

    public com.tencent.mm.sdk.platformtools.o4 Zi(java.lang.String permission) {
        d85.g0 g0Var;
        kotlin.jvm.internal.o.g(permission, "permission");
        try {
            d85.g0[] values = d85.g0.values();
            int length = values.length;
            for (int i17 = 0; i17 < length; i17++) {
                g0Var = values[i17];
                if (r26.i0.p(g0Var.f227192d, permission, true)) {
                    break;
                }
            }
        } catch (java.lang.IllegalArgumentException unused) {
        }
        g0Var = null;
        if (g0Var == null) {
            return null;
        }
        return com.tencent.mm.sdk.platformtools.o4.M(gm0.m.i() + '_' + permission);
    }

    public java.lang.Integer aj(java.lang.String permission) {
        d85.g0 g0Var;
        java.lang.Integer num;
        kotlin.jvm.internal.o.g(permission, "permission");
        try {
            d85.g0[] values = d85.g0.values();
            int length = values.length;
            for (int i17 = 0; i17 < length; i17++) {
                g0Var = values[i17];
                if (r26.i0.p(g0Var.f227192d, permission, true)) {
                    break;
                }
            }
        } catch (java.lang.IllegalArgumentException unused) {
        }
        g0Var = null;
        int i18 = -1;
        if (g0Var != null) {
            java.util.HashMap hashMap = e85.i.f250315a;
            e85.h hVar = (e85.h) e85.i.f250315a.get(g0Var);
            if (hVar != null && (num = hVar.f250312a) != null) {
                i18 = num.intValue();
            }
        }
        return java.lang.Integer.valueOf(i18);
    }

    public java.lang.String bj(java.lang.String permission, java.lang.String str) {
        d85.g0 g0Var;
        d85.f0 f0Var;
        java.lang.String str2;
        java.lang.String string;
        kotlin.jvm.internal.o.g(permission, "permission");
        try {
            d85.g0[] values = d85.g0.values();
            int length = values.length;
            for (int i17 = 0; i17 < length; i17++) {
                g0Var = values[i17];
                if (r26.i0.p(g0Var.f227192d, permission, true)) {
                    break;
                }
            }
        } catch (java.lang.IllegalArgumentException unused) {
        }
        g0Var = null;
        java.lang.String str3 = "";
        if (str == null && (str = com.tencent.mm.sensitive.business.BusinessStackRecorder.f193183f.c()) == null) {
            str = "";
        }
        try {
            d85.f0[] values2 = d85.f0.values();
            int length2 = values2.length;
            for (int i18 = 0; i18 < length2; i18++) {
                f0Var = values2[i18];
                if (r26.i0.p(f0Var.f227176d, str, true)) {
                    break;
                }
            }
        } catch (java.lang.IllegalArgumentException unused2) {
        }
        f0Var = null;
        if (g0Var != null && f0Var != null) {
            java.util.HashMap hashMap = e85.i.f250315a;
            e85.h hVar = (e85.h) e85.i.f250315a.get(g0Var);
            if (hVar != null) {
                e85.g gVar = (e85.g) hVar.f250314c.get(f0Var);
                android.util.Pair pair = gVar != null ? new android.util.Pair(java.lang.Integer.valueOf(gVar.f250308a), java.lang.Integer.valueOf(gVar.f250309b)) : null;
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                java.lang.Integer num = pair != null ? (java.lang.Integer) pair.first : null;
                if (!(num == null || num.intValue() != -1)) {
                    num = null;
                }
                if (num == null || (str2 = context.getString(num.intValue())) == null) {
                    str2 = "";
                }
                java.lang.Integer num2 = pair != null ? (java.lang.Integer) pair.second : null;
                java.lang.Integer num3 = num2 == null || num2.intValue() != -1 ? num2 : null;
                if (num3 != null && (string = context.getString(num3.intValue())) != null) {
                    str3 = string;
                }
                str3 = str2.concat(str3);
            }
        }
        if ((!(str3.length() == 0) && f0Var != null) || g0Var == null) {
            return str3;
        }
        java.lang.String value = g0Var.f227192d;
        kotlin.jvm.internal.o.f(value, "value");
        java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(aj(value).intValue());
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        return string2;
    }

    public java.lang.Integer cj(java.lang.String permission) {
        d85.g0 g0Var;
        java.lang.Integer num;
        kotlin.jvm.internal.o.g(permission, "permission");
        try {
            d85.g0[] values = d85.g0.values();
            int length = values.length;
            for (int i17 = 0; i17 < length; i17++) {
                g0Var = values[i17];
                if (r26.i0.p(g0Var.f227192d, permission, true)) {
                    break;
                }
            }
        } catch (java.lang.IllegalArgumentException unused) {
        }
        g0Var = null;
        int i18 = -1;
        if (g0Var != null) {
            java.util.HashMap hashMap = e85.i.f250315a;
            e85.h hVar = (e85.h) e85.i.f250315a.get(g0Var);
            if (hVar != null && (num = hVar.f250313b) != null) {
                i18 = num.intValue();
            }
        }
        return java.lang.Integer.valueOf(i18);
    }

    public java.lang.String fj(java.lang.String permission) {
        kotlin.jvm.internal.o.g(permission, "permission");
        java.util.HashMap hashMap = e85.i.f250315a;
        java.lang.String str = (java.lang.String) e85.i.f250317c.get(permission);
        if (!(true ^ (str == null || str.length() == 0))) {
            str = null;
        }
        if (str != null) {
            return str;
        }
        return null;
    }

    public boolean hj(d85.g0 permission) {
        android.app.Activity activity;
        kotlin.jvm.internal.o.g(permission, "permission");
        k85.t tVar = k85.t.f305439a;
        java.lang.ref.WeakReference i17 = com.tencent.mm.app.w.INSTANCE.i();
        if (i17 != null && (activity = (android.app.Activity) i17.get()) != null) {
            jz5.l lVar = (jz5.l) k85.t.f305440b.get(activity + '_' + permission.f227192d);
            if (lVar != null) {
                return ((java.lang.Boolean) lVar.f302833d).booleanValue();
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008a, code lost:
    
        if (r9.getBoolean(r6.f227176d, !r6.f227178f.booleanValue()) == true) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d85.h0 ij(android.content.Context r9, java.lang.String r10, int r11) {
        /*
            r8 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.g(r9, r0)
            java.lang.String r0 = "permission"
            kotlin.jvm.internal.o.g(r10, r0)
            java.util.HashMap r0 = e85.i.f250316b
            java.lang.Object r0 = r0.get(r10)
            d85.g0 r0 = (d85.g0) r0
            r1 = 0
            r2 = 0
            d85.f0[] r3 = d85.f0.values()     // Catch: java.lang.IllegalArgumentException -> L26
            int r4 = r3.length     // Catch: java.lang.IllegalArgumentException -> L26
            r5 = r1
        L1a:
            if (r5 >= r4) goto L26
            r6 = r3[r5]     // Catch: java.lang.IllegalArgumentException -> L26
            int r7 = r6.f227177e     // Catch: java.lang.IllegalArgumentException -> L26
            if (r7 != r11) goto L23
            goto L27
        L23:
            int r5 = r5 + 1
            goto L1a
        L26:
            r6 = r2
        L27:
            if (r0 == 0) goto L2e
            j85.g r3 = j85.g.f298251a
            r3.c(r0, r6, r2)
        L2e:
            r3 = 1
            boolean r10 = j35.u.d(r9, r10, r3)
            bm5.o1 r4 = bm5.o1.f22719a
            com.tencent.mm.sensitive.RepairConfigAppBrandPermissionNullBusinessTest r5 = new com.tencent.mm.sensitive.RepairConfigAppBrandPermissionNullBusinessTest
            r5.<init>()
            int r4 = r4.h(r5)
            if (r4 != r3) goto L41
            r6 = r2
        L41:
            if (r10 != 0) goto L46
            d85.h0 r9 = d85.h0.SYSTEM_REFUSE
            return r9
        L46:
            d85.h0 r10 = d85.h0.GRANTED
            if (r6 != 0) goto L6e
            java.lang.String r0 = com.tencent.mm.sdk.platformtools.z.f193105a
            boolean r0 = z65.c.a()
            if (r0 == 0) goto L5a
            d85.w0 r0 = new d85.w0
            r0.<init>(r9)
            pm0.v.X(r0)
        L5a:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "unknown business: "
            r9.<init>(r0)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            java.lang.String r11 = r8.f227146d
            com.tencent.mars.xlog.Log.i(r11, r9)
            return r10
        L6e:
            if (r0 == 0) goto L90
            java.lang.String r9 = r0.f227192d
            java.lang.String r11 = "value"
            kotlin.jvm.internal.o.f(r9, r11)
            com.tencent.mm.sdk.platformtools.o4 r9 = r8.Zi(r9)
            if (r9 == 0) goto L8d
            java.lang.Boolean r11 = r6.f227178f
            boolean r11 = r11.booleanValue()
            r11 = r11 ^ r3
            java.lang.String r0 = r6.f227176d
            boolean r9 = r9.getBoolean(r0, r11)
            if (r9 != r3) goto L8d
            goto L8e
        L8d:
            r3 = r1
        L8e:
            jz5.f0 r2 = jz5.f0.f302826a
        L90:
            if (r2 != 0) goto L93
            goto L94
        L93:
            r1 = r3
        L94:
            if (r1 != 0) goto L98
            d85.h0 r10 = d85.h0.BUSINESS_REFUSE
        L98:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: d85.d1.ij(android.content.Context, java.lang.String, int):d85.h0");
    }

    public boolean mj(d85.g0 permission, d85.f0 business) {
        kotlin.jvm.internal.o.g(permission, "permission");
        kotlin.jvm.internal.o.g(business, "business");
        return c01.e2.a0() && permission == d85.g0.LOCAION && d85.m0.E0.contains(business.f227176d);
    }

    public boolean nj(java.lang.String permission, java.lang.String business) {
        kotlin.jvm.internal.o.g(permission, "permission");
        kotlin.jvm.internal.o.g(business, "business");
        return c01.e2.a0() && kotlin.jvm.internal.o.b(permission, d85.g0.LOCAION.f227192d) && d85.m0.E0.contains(business);
    }

    public void oj(d85.f0 business) {
        kotlin.jvm.internal.o.g(business, "business");
        com.tencent.mm.sensitive.business.BusinessStackRecorder.f193183f.b().a("com.tencent.mm.sensitive.SENSITIVE_PAGE_ENTER", business.name());
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        k85.t tVar = k85.t.f305439a;
        com.tencent.mm.sdk.event.IListener iListener = k85.t.f305444f;
        tVar.g();
        iListener.alive();
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_EXT_USER_STATUS_INT_SYNC, 0);
        boolean z17 = (r17 & 4) == 4;
        com.tencent.mars.xlog.Log.i("MicroMsg.ConfigStorageLogic", "extUserStatus: " + r17 + ", isSensitiveRegion: " + z17);
        if (z17) {
            java.util.List<java.lang.String> wechatBussinessDefaultCloseList = d85.m0.E0;
            kotlin.jvm.internal.o.f(wechatBussinessDefaultCloseList, "wechatBussinessDefaultCloseList");
            for (java.lang.String str : wechatBussinessDefaultCloseList) {
                long j17 = com.tencent.mm.sdk.platformtools.o4.M("MMKV_NAME_SENSITIVE_LOCATION_LAST_RESET_TIME").getLong(str, 0L);
                java.lang.String value = d85.g0.LOCAION.f227192d;
                kotlin.jvm.internal.o.f(value, "value");
                com.tencent.mm.sdk.platformtools.o4 Zi = Zi(value);
                if ((Zi != null ? Zi.getBoolean(str, false) : false) && java.lang.System.currentTimeMillis() - j17 >= 172800000) {
                    sj(value, str, false);
                }
            }
        }
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        k85.t tVar = k85.t.f305439a;
        com.tencent.mm.sdk.event.IListener iListener = k85.t.f305444f;
        k85.t.f305443e.putBoolean(k85.t.f305442d, true);
        iListener.dead();
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onCreate(context);
        kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, null, null, new d85.y0(this, null), 3, null);
    }

    public void pj(d85.f0 business) {
        kotlin.jvm.internal.o.g(business, "business");
        com.tencent.mm.sensitive.business.BusinessStackRecorder.f193183f.b().a("com.tencent.mm.sensitive.SENSITIVE_PAGE_EXIT", business.name());
    }

    public void qj(java.lang.String business) {
        kotlin.jvm.internal.o.g(business, "business");
        com.tencent.mm.sensitive.business.BusinessStackRecorder.f193183f.b().b("com.tencent.mm.sensitive.SENSITIVE_PAGE_ENTER", business, "");
    }

    public void rj(java.lang.String business) {
        kotlin.jvm.internal.o.g(business, "business");
        com.tencent.mm.sensitive.business.BusinessStackRecorder.f193183f.b().b("com.tencent.mm.sensitive.SENSITIVE_PAGE_EXIT", business, "");
    }

    public void sj(java.lang.String str, java.lang.String str2, boolean z17) {
        if (kotlin.jvm.internal.o.b(str, d85.g0.LOCAION.f227192d) && z17) {
            com.tencent.mm.sdk.platformtools.o4.M("MMKV_NAME_SENSITIVE_LOCATION_LAST_RESET_TIME").putLong(str2, java.lang.System.currentTimeMillis());
        }
        if (str == null) {
            str = "";
        }
        com.tencent.mm.sdk.platformtools.o4 Zi = Zi(str);
        if (Zi != null) {
            if (str2 == null) {
                str2 = "";
            }
            Zi.putBoolean(str2, z17);
        }
    }

    public void tj(d85.g0 p17, long j17, java.lang.String str) {
        d85.f0 f0Var;
        java.util.HashMap hashMap;
        kotlin.jvm.internal.o.g(p17, "p");
        if (j17 == 162) {
            java.util.HashMap hashMap2 = e85.i.f250315a;
            e85.h hVar = (e85.h) e85.i.f250315a.get(p17);
            if (hVar != null && (hashMap = hVar.f250314c) != null) {
                for (java.util.Map.Entry entry : hashMap.entrySet()) {
                    ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).sj(p17.f227192d, ((d85.f0) entry.getKey()).f227176d, !r3.mj(p17, (d85.f0) entry.getKey()));
                }
            }
        }
        if (str == null) {
            str = "";
        }
        int i17 = 0;
        d85.f0 f0Var2 = null;
        try {
            d85.f0[] values = d85.f0.values();
            int length = values.length;
            for (int i18 = 0; i18 < length; i18++) {
                f0Var = values[i18];
                if (r26.i0.p(f0Var.f227176d, str, true)) {
                    break;
                }
            }
        } catch (java.lang.IllegalArgumentException unused) {
        }
        f0Var = null;
        if (f0Var == null) {
            java.lang.String c17 = com.tencent.mm.sensitive.business.BusinessStackRecorder.f193183f.c();
            if (c17 != null) {
                try {
                    d85.f0[] values2 = d85.f0.values();
                    int length2 = values2.length;
                    while (true) {
                        if (i17 >= length2) {
                            break;
                        }
                        d85.f0 f0Var3 = values2[i17];
                        if (r26.i0.p(f0Var3.f227176d, c17, true)) {
                            f0Var2 = f0Var3;
                            break;
                        }
                        i17++;
                    }
                } catch (java.lang.IllegalArgumentException unused2) {
                }
            }
        } else {
            f0Var2 = f0Var;
        }
        j85.h.f298258a.a(j17, java.lang.Long.valueOf(p17.f227193e), java.lang.Long.valueOf(f0Var2 != null ? f0Var2.f227177e : -1L), java.lang.Boolean.TRUE);
    }

    public void uj(android.app.Activity activity, java.lang.String appid, java.lang.String permission, int i17, d85.l0 callback) {
        d85.f0 f0Var;
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(appid, "appid");
        kotlin.jvm.internal.o.g(permission, "permission");
        kotlin.jvm.internal.o.g(callback, "callback");
        d85.g0 g0Var = (d85.g0) e85.i.f250316b.get(permission);
        try {
            d85.f0[] values = d85.f0.values();
            int length = values.length;
            for (int i18 = 0; i18 < length; i18++) {
                f0Var = values[i18];
                if (f0Var.f227177e == i17) {
                    break;
                }
            }
        } catch (java.lang.IllegalArgumentException unused) {
        }
        f0Var = null;
        if (g0Var == null) {
            d85.h0 h0Var = d85.h0.ERROR;
            h0Var.f227201d = "unknown permission";
            callback.a(h0Var);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(appid);
        sb6.append('_');
        sb6.append(g0Var != null ? g0Var.f227192d : null);
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("freq_mmkv_key_ver_2");
        if (M != null) {
            M.putLong(sb7, java.lang.System.currentTimeMillis() / 1000);
        }
        d85.f0 f0Var2 = bm5.o1.f22719a.h(new com.tencent.mm.sensitive.RepairConfigAppBrandPermissionNullBusinessTest()) == 1 ? null : f0Var;
        d85.h0 h0Var2 = d85.h0.GRANTED;
        if (g0Var != null && f0Var2 == null) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (z65.c.a()) {
                pm0.v.X(new d85.z0(activity));
            }
            j85.g.f298251a.c(g0Var, null, appid);
            com.tencent.mars.xlog.Log.i(this.f227146d, "unknown business: " + i17);
            if (j35.u.d(activity, permission, true)) {
                callback.a(h0Var2);
                return;
            } else {
                j35.u.j(activity, 0, new d85.a1(callback), new java.lang.String[]{permission}, fj(permission), bj(permission, null));
                return;
            }
        }
        if (g0Var == null || f0Var2 == null) {
            return;
        }
        j85.g.f298251a.c(g0Var, f0Var2, appid);
        int ordinal = ij(activity, permission, i17).ordinal();
        if (ordinal == 0) {
            com.tencent.mm.sensitive.business.BusinessStackRecorder.f193183f.b().a("com.tencent.mm.sensitive.SENSITIVE_PAGE_ENTER", f0Var2.name());
            java.lang.String value = g0Var.f227192d;
            kotlin.jvm.internal.o.f(value, "value");
            j35.u.j(activity, 0, new d85.b1(f0Var2, callback, this, activity, appid, permission, i17), new java.lang.String[]{permission}, fj(value), bj(value, f0Var2.f227176d));
            return;
        }
        if (ordinal != 1) {
            callback.a(h0Var2);
        } else {
            if (k85.t.f305439a.c(activity, g0Var, f0Var2, new d85.c1(callback))) {
                return;
            }
            callback.a(h0Var2);
        }
    }

    public d85.f0 wi(int i17) {
        java.lang.Object obj;
        java.util.Iterator<E> it = d85.s0.f227243a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((d85.f0) obj).f227177e == i17) {
                break;
            }
        }
        return (d85.f0) obj;
    }
}

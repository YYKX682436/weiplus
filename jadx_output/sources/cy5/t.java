package cy5;

/* loaded from: classes13.dex */
public class t extends by5.u0 {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f224902f = new java.lang.Object();

    /* renamed from: g, reason: collision with root package name */
    public final cy5.r f224903g = new cy5.r();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f224904h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public int f224905i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f224906j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f224907k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f224908l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f224909m = 0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f224910n = false;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f224911o = "";

    /* renamed from: p, reason: collision with root package name */
    public cy5.o f224912p = null;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f224913q = "0";

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f224914r = by5.e4.b();

    /* renamed from: s, reason: collision with root package name */
    public final xx5.m f224915s = new xx5.m();

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d4  */
    @Override // by5.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(java.lang.Object[] r19) {
        /*
            Method dump skipped, instructions count: 789
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cy5.t.d(java.lang.Object[]):java.lang.Object");
    }

    @Override // by5.u0
    public void g(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        if (num.intValue() == -3) {
            o(5, num.intValue());
            return;
        }
        int intValue = num.intValue();
        xx5.m mVar = this.f224915s;
        if (intValue == -4) {
            mVar.f458052a = num.intValue();
            xx5.o.a(mVar);
            o(5, num.intValue());
            return;
        }
        if ("6".equals(this.f224913q)) {
            by5.c4.a("XWalkPluginUpdaterChecker", "check type is only install embed plugin, skip download");
            o(5, 0);
            return;
        }
        by5.c4.a("XWalkPluginUpdaterChecker", "doFetchPluginUpdateConfig start");
        if (!by5.y.b()) {
            by5.c4.a("XWalkPluginUpdaterChecker", "doFetchPluginUpdateConfig network not available");
            mVar.f458052a = -2;
            xx5.o.a(mVar);
            o(5, -2);
            return;
        }
        if (!p(2, 1, null)) {
            by5.c4.a("XWalkPluginUpdaterChecker", "status change to fetch config failed");
            mVar.f458052a = -1;
            xx5.o.a(mVar);
            o(5, -1);
            return;
        }
        zx5.r rVar = new zx5.r();
        rVar.f477257a = this.f224914r;
        rVar.f477258b = org.xwalk.core.XWalkEnvironment.f347970c.getDir("xwalkconfig", 0).getAbsolutePath() + java.io.File.separator + "pluginUpdateConfig.xml";
        zx5.u.k(rVar, new cy5.q(this));
    }

    @Override // by5.u0
    public void h() {
        p(1, 1, null);
    }

    public final boolean k() {
        java.lang.String str = this.f224911o;
        return (str == null || str.isEmpty() || this.f224912p == null) ? false : true;
    }

    public void l(java.lang.String str, int i17) {
        by5.c4.a("XWalkPluginUpdaterChecker", "onNotifyResult: " + str + " install retCode: " + i17);
        synchronized (this.f224902f) {
            if (this.f224903g.f224897a == 5) {
                return;
            }
            boolean z17 = true;
            if (i17 == -3) {
                this.f224906j++;
            } else if (i17 == -1) {
                this.f224907k++;
            } else if (i17 == -2) {
                this.f224908l++;
            } else if (i17 == 0) {
                this.f224909m++;
            }
            ((cy5.s) ((java.util.HashMap) this.f224904h).get(str)).f224901c = true;
            java.util.Iterator it = ((java.util.HashMap) this.f224904h).entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                cy5.s sVar = (cy5.s) ((java.util.Map.Entry) it.next()).getValue();
                if (sVar != null && !sVar.f224901c) {
                    z17 = false;
                    break;
                }
            }
            int i18 = this.f224903g.f224897a;
            if (z17) {
                ((java.util.HashMap) this.f224904h).clear();
                cy5.r rVar = this.f224903g;
                rVar.f224897a = 5;
                int i19 = this.f224907k;
                if (i19 > 0 && this.f224908l == 0) {
                    rVar.f224898b = -10;
                } else if (i19 == 0 && this.f224908l > 0) {
                    rVar.f224898b = -11;
                } else if (i19 > 0 || this.f224908l > 0) {
                    rVar.f224898b = -9;
                }
            }
            cy5.r rVar2 = this.f224903g;
            m(i18, rVar2.f224897a, rVar2.f224898b);
        }
    }

    public final void m(int i17, int i18, int i19) {
        if (i18 <= i17) {
            by5.c4.a("XWalkPluginUpdaterChecker", "status not changed, return");
            return;
        }
        by5.c4.a("XWalkPluginUpdaterChecker", "change status from " + i17 + " to " + i18 + ", errcode:" + i19);
        if (k()) {
            if (i17 == 0 && i18 == 1) {
                this.f224912p.a();
            } else if (i17 != 0 && i18 == 5) {
                this.f224912p.c(i19);
            }
        }
        if (i18 == 5) {
            by5.s0.t(15718, this.f224903g.f224898b + "," + this.f224905i + "," + this.f224906j + "," + this.f224907k + "," + this.f224908l + "," + this.f224909m);
            android.content.SharedPreferences g17 = by5.d4.g("xwalk_plugin_update_info");
            if (g17 != null) {
                android.content.SharedPreferences.Editor edit = g17.edit();
                edit.remove("nUpdatingProcessId");
                edit.commit();
                by5.c4.a("XWalkPluginUpdater", "plugin update progress finish");
            }
            this.f224910n = true;
        }
    }

    public void n(java.util.HashMap hashMap, java.lang.String str, cy5.o oVar) {
        if (hashMap != null) {
            java.lang.String str2 = (java.lang.String) hashMap.get("UpdaterCheckType");
            this.f224913q = str2;
            if (str2 == null || str2.isEmpty()) {
                by5.c4.f("XWalkPluginUpdaterChecker", "setParams, not set type, use default type: timer");
                this.f224913q = "0";
            }
        }
        this.f224911o = str;
        this.f224912p = oVar;
        java.lang.String str3 = this.f224913q;
        xx5.m mVar = this.f224915s;
        mVar.f458053b = str3;
        mVar.f458054c = k() ? this.f224911o : "";
        mVar.f458056e = this.f224914r;
        by5.c4.a("XWalkPluginUpdaterChecker", "create XWalkPluginUpdaterChecker, singlePlugin:" + this.f224911o + ", notifyType:" + this.f224913q + " [0:timer/1:notify/2:force/4:embed/5:config/6:embedPlugin/7:auto]");
    }

    public final boolean o(int i17, int i18) {
        return p(i17, i18, null);
    }

    public final boolean p(int i17, int i18, java.util.Map map) {
        int i19;
        int i27;
        int i28;
        synchronized (this.f224902f) {
            cy5.r rVar = this.f224903g;
            i19 = rVar.f224897a;
            if (i17 > i19) {
                rVar.f224897a = i17;
                if (i18 != 1) {
                    rVar.f224898b = i18;
                }
                if (i17 == 4) {
                    if (((java.util.HashMap) this.f224904h).size() == 0) {
                        this.f224903g.f224897a = 5;
                    } else {
                        java.util.Iterator it = ((java.util.HashMap) this.f224904h).entrySet().iterator();
                        while (it.hasNext()) {
                            cy5.s sVar = (cy5.s) ((java.util.Map.Entry) it.next()).getValue();
                            if (sVar != null && !sVar.f224901c) {
                                by5.u0 u0Var = sVar.f224899a;
                                u0Var.f36600d.set(true);
                                u0Var.f36598b.cancel(true);
                            }
                        }
                    }
                } else if (i17 == 3 && map != null) {
                    for (java.util.Map.Entry entry : map.entrySet()) {
                        java.lang.String str = (java.lang.String) entry.getKey();
                        cy5.s sVar2 = (cy5.s) entry.getValue();
                        ((java.util.HashMap) this.f224904h).put(str, sVar2);
                        int i29 = sVar2.f224900b;
                        if (i29 == 1) {
                            ((com.tencent.xweb.d2) sVar2.f224899a).e(new java.lang.Void[0]);
                        } else if (i29 == 2) {
                            ((com.tencent.xweb.e2) sVar2.f224899a).e(new java.lang.Void[0]);
                        } else {
                            ((java.util.HashMap) this.f224904h).remove(str);
                        }
                    }
                    this.f224905i = ((java.util.HashMap) this.f224904h).size();
                }
            }
            cy5.r rVar2 = this.f224903g;
            i27 = rVar2.f224897a;
            i28 = rVar2.f224898b;
        }
        m(i19, i27, i28);
        return i27 > i19;
    }
}

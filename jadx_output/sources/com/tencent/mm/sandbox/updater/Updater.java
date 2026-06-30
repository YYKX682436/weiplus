package com.tencent.mm.sandbox.updater;

/* loaded from: classes11.dex */
public class Updater extends android.widget.LinearLayout implements com.tencent.mm.modelbase.u0, mi3.e {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f192322o = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f192323d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f192324e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f192325f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f192326g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f192327h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f192328i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f192329m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f192330n;

    public Updater(android.content.Context context) {
        super(context);
        this.f192324e = null;
        this.f192326g = false;
        this.f192327h = false;
        this.f192328i = false;
    }

    public static void a(com.tencent.mm.sandbox.updater.Updater updater, android.content.Intent intent, com.tencent.mm.network.s sVar, r65.a aVar) {
        intent.putExtra("intent_short_ips", updater.getShortIps());
        intent.putExtra("intent_client_version", o45.wf.f343029g);
        intent.putExtra("intent_extra_session", sVar.G().r(1));
        intent.putExtra("intent_extra_cookie", sVar.G().o());
        intent.putExtra("intent_extra_ecdhkey", sVar.G().s());
        intent.putExtra("intent_extra_uin", sVar.G().getUin());
        intent.putExtra("intent_update_type", updater.f192323d);
        intent.putExtra("intent_extra_desc", ((r45.wp3) aVar.f393067d.f70711b.f70700a).f389367g);
        com.tencent.mm.modelbase.o oVar = aVar.f393067d;
        intent.putExtra("intent_extra_md5", ((r45.wp3) oVar.f70711b.f70700a).f389365e);
        intent.putExtra("intent_extra_size", ((r45.wp3) oVar.f70711b.f70700a).f389366f);
        r45.wp3 wp3Var = (r45.wp3) oVar.f70711b.f70700a;
        int size = wp3Var.f389369i.size();
        java.lang.String[] strArr = new java.lang.String[size];
        for (int i17 = 0; i17 < size; i17++) {
            strArr[i17] = ((r45.du5) wp3Var.f389369i.get(i17)).f372756d;
        }
        intent.putExtra("intent_extra_download_url", strArr);
        java.lang.String str = ((r45.wp3) oVar.f70711b.f70700a).f389370m;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        intent.putExtra("intent_extra_patchInfo", str);
        intent.putExtra("intent_extra_updateMode", com.tencent.mm.sdk.platformtools.a0.f192438a);
        intent.putExtra("intent_extra_marketUrl", com.tencent.mm.sdk.platformtools.a0.f192444g);
        java.lang.String f17 = x51.j1.f(((r45.wp3) oVar.f70711b.f70700a).f389374q);
        if (f17 == null) {
            f17 = "";
        }
        intent.putExtra("intent_extra_extinfo", f17);
    }

    public static void e(int i17) {
        if (gm0.j1.a()) {
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new e21.v(i17));
        }
    }

    private java.lang.String[] getShortIps() {
        java.lang.String str = x51.o1.f452054g;
        if (str != null && str.length() > 0) {
            return new java.lang.String[]{x51.o1.f452054g};
        }
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("system_config_prefs", 0).getString("builtin_short_ips", "");
        if (string == null || string.length() <= 0) {
            string = "0,112.64.200.240,80|0,180.153.82.27,80|0,117.135.130.177,80";
        }
        java.util.LinkedList linkedList = (java.util.LinkedList) o45.hh.d(string);
        java.lang.String[] strArr = new java.lang.String[linkedList.size()];
        for (int i17 = 0; i17 < linkedList.size(); i17++) {
            strArr[i17] = ((o45.hh) linkedList.get(i17)).f342945c;
        }
        return strArr;
    }

    public void b(android.content.Intent intent, s65.i0 i0Var) {
        java.util.LinkedList linkedList;
        if (i0Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Updater", "tinker sync response is empty.");
            return;
        }
        intent.putExtra("intent_short_ips", getShortIps());
        intent.putExtra("intent_client_version", o45.wf.f343029g);
        intent.putExtra("intent_update_type", 3);
        java.util.HashMap hashMap = i0Var.f403469b;
        java.lang.String str = "";
        if (((hashMap == null || hashMap.isEmpty() || !hashMap.containsKey(4)) ? false : true) && hashMap != null && !hashMap.isEmpty() && (linkedList = (java.util.LinkedList) hashMap.get(4)) != null && !linkedList.isEmpty()) {
            int size = linkedList.size();
            int i17 = 0;
            while (true) {
                if (i17 >= size) {
                    break;
                }
                r45.br4 br4Var = (r45.br4) linkedList.get(i17);
                if (br4Var.f371006d.equalsIgnoreCase("default")) {
                    str = new java.lang.String(android.util.Base64.decode(br4Var.f371007e, 0));
                } else if (br4Var.f371006d.equalsIgnoreCase(com.tencent.mm.sdk.platformtools.m2.d())) {
                    str = new java.lang.String(android.util.Base64.decode(br4Var.f371007e, 0));
                    break;
                }
                i17++;
            }
        }
        intent.putExtra("intent_extra_desc", str);
        intent.putExtra("intent_extra_md5", i0Var.f403473f);
        intent.putExtra("intent_extra_size", i0Var.f403475h);
        java.lang.String str2 = i0Var.f403472e;
        intent.putExtra("intent_extra_download_url", new java.lang.String[]{str2});
        java.lang.String substring = str2.substring(0, str2.lastIndexOf(47) + 1);
        java.lang.String substring2 = str2.substring(str2.lastIndexOf(47) + 1);
        uk.m mVar = new uk.m(substring, java.lang.Integer.valueOf(i0Var.f403478k).intValue());
        java.lang.String str3 = i0Var.f403477j;
        ((java.util.HashMap) mVar.f428507b).put(str3, new uk.l(str3, i0Var.f403476i, i0Var.f403473f, substring2, i0Var.f403475h));
        intent.putExtra("intent_extra_patchInfo", mVar.b());
        intent.putExtra("intent_extra_updateMode", com.tencent.mm.sdk.platformtools.a0.f192438a);
        intent.putExtra("intent_extra_marketUrl", com.tencent.mm.sdk.platformtools.a0.f192444g);
        intent.putExtra("intent_extra_extinfo", "<extinfo></extinfo>");
        intent.putExtra("intent_extra_tinker_patch", true);
        intent.putExtra("intent_extra_download_mode", 1);
    }

    public void c() {
        gm0.j1.n().f273288b.a(11, this);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(405L, 42L, 1L, true);
    }

    public void d() {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(405L, 43L, 1L, true);
        gm0.j1.n().f273288b.q(11, this);
    }

    public void f(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Updater", "summerupdate begin update routine, type=" + i17);
        this.f192323d = i17;
        this.f192328i = false;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(405L, 44L, 1L, true);
        gm0.j1.n().f273288b.g(new r65.a(i17));
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        if (i17 == 0 && i18 == 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(405L, 51L, 1L, true);
            com.tencent.mars.xlog.Log.i("MicroMsg.Updater", "isShow " + this.f192325f);
            if (!this.f192325f && (u3Var = this.f192324e) != null) {
                u3Var.show();
            }
            this.f192326g = true;
            com.tencent.mm.ui.widget.dialog.u3 u3Var2 = this.f192324e;
            if (u3Var2 != null) {
                u3Var2.cancel();
            }
            gm0.j1.n().f273288b.g(new c01.ra(new s65.s0(this, (r65.a) m1Var), null));
            d();
            return;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.idkeyStat(405L, 62L, 1L, true);
        com.tencent.mm.ui.widget.dialog.u3 u3Var3 = this.f192324e;
        if (u3Var3 != null) {
            android.widget.ProgressBar progressBar = u3Var3.f212005e;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            android.widget.TextView textView = (android.widget.TextView) this.f192324e.findViewById(com.tencent.mm.R.id.jma);
            if (i17 == 4 && i18 == -18) {
                new com.tencent.mm.autogen.events.CheckTinkerUpdateEvent().e();
                com.tencent.mm.modelbase.r1 r1Var = gm0.j1.n().f273288b;
                s65.t0 t0Var = new s65.t0(this, textView);
                this.f192330n = t0Var;
                r1Var.a(3899, t0Var);
            } else if (textView != null) {
                g0Var.idkeyStat(405L, 64L, 1L, true);
                textView.setText(com.tencent.mm.R.string.f493417k34);
                ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).oj(textView, 1);
            }
        }
        s65.o0.f();
        gm0.j1.n().f273288b.q(11, this);
    }

    public Updater(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f192324e = null;
        this.f192326g = false;
        this.f192327h = false;
        this.f192328i = false;
    }
}

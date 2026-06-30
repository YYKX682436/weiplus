package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class SettingsCareModeIntro extends com.tencent.mm.ui.MMActivity {
    public static final /* synthetic */ int D = 0;
    public android.widget.TextView A;
    public final int B = 1;
    public final int C = 1;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f160345d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f160346e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f160347f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f160348g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f160349h;

    /* renamed from: i, reason: collision with root package name */
    public long f160350i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMSwitchBtn f160351m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMSwitchBtn f160352n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMSwitchBtn f160353o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.LinearLayout f160354p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.LinearLayout f160355q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f160356r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f160357s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f160358t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f160359u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f160360v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f160361w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f160362x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f160363y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f160364z;

    public static void T6(com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro settingsCareModeIntro) {
        settingsCareModeIntro.getClass();
        l14.a.b(false);
        androidx.appcompat.app.AppCompatActivity activity = settingsCareModeIntro.getContext();
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        ((com.tencent.mm.plugin.setting.ui.setting.p8) zVar.a(activity).a(com.tencent.mm.plugin.setting.ui.setting.p8.class)).f161429f = false;
        androidx.appcompat.app.AppCompatActivity activity2 = settingsCareModeIntro.getContext();
        kotlin.jvm.internal.o.g(activity2, "activity");
        ((com.tencent.mm.plugin.setting.ui.setting.p8) zVar.a(activity2).a(com.tencent.mm.plugin.setting.ui.setting.p8.class)).T6();
    }

    public static void U6(com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro settingsCareModeIntro) {
        settingsCareModeIntro.getClass();
        boolean g17 = j65.e.g();
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsCareModeIntro", "updateMuteStatus, lastExtStatus2:" + settingsCareModeIntro.f160350i + " isLargeFont:" + g17);
        if (g17) {
            settingsCareModeIntro.f160350i |= 16777216;
        } else {
            settingsCareModeIntro.f160350i &= -16777217;
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EXT_STATUS2_LONG_SYNC, java.lang.Long.valueOf(settingsCareModeIntro.f160350i));
        bn0.g.f22779a.g("USERINFO_EXT_STATUS2_LONG_SYNC", settingsCareModeIntro.f160350i);
        int i17 = g17 ? 1 : 2;
        r45.p53 p53Var = new r45.p53();
        p53Var.f382761d = 89;
        p53Var.f382762e = i17;
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsCareModeIntro", "switch ext change : big font open = " + g17 + " item value = " + p53Var.f382762e + " functionId = " + p53Var.f382761d);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_DEFINATION_SWICH, java.lang.Integer.valueOf(g17 ? 1 : 0));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("care_mode_quite_mode_switch", "view_clk", hashMap, 29254);
    }

    public static void V6(com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro settingsCareModeIntro) {
        settingsCareModeIntro.getClass();
        boolean f17 = j65.e.f();
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsCareModeIntro", "updateExtStatus2Values, lastExtStatus2:" + settingsCareModeIntro.f160350i + " isOpen:" + f17);
        if (f17) {
            settingsCareModeIntro.f160350i |= 16;
        } else {
            settingsCareModeIntro.f160350i &= -17;
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EXT_STATUS2_LONG_SYNC, java.lang.Long.valueOf(settingsCareModeIntro.f160350i));
        bn0.g.f22779a.g("USERINFO_EXT_STATUS2_LONG_SYNC", settingsCareModeIntro.f160350i);
        int i17 = f17 ? 1 : 2;
        r45.p53 p53Var = new r45.p53();
        p53Var.f382761d = 76;
        p53Var.f382762e = i17;
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsCareModeIntro", "switch ext change : TTS open = " + f17 + " item value = " + p53Var.f382762e + " functionId = " + p53Var.f382761d);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_DEFINATION_SWICH, java.lang.Integer.valueOf(f17 ? 1 : 0));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("care_mode_tts_switch", "view_clk", hashMap, 29254);
    }

    public final void W6() {
        if (((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ui() != wd0.g1.f444713e) {
            this.f160364z.setVisibility(0);
            this.A.setVisibility(8);
        } else {
            this.f160364z.setVisibility(8);
            this.A.setVisibility(0);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cl8;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        java.lang.String str;
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.heb);
        if (textView != null) {
            com.tencent.mm.ui.bk.s0(textView.getPaint());
        }
        androidx.appcompat.app.AppCompatActivity activity = getContext();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsCareModeIntro", "is care mode open: %s", java.lang.Boolean.valueOf(((com.tencent.mm.plugin.setting.ui.setting.p8) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.setting.ui.setting.p8.class)).f161429f));
        this.f160355q = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.ql7);
        this.f160347f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.heb);
        this.f160348g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.hea);
        this.f160349h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ql6);
        this.f160345d = (android.widget.Button) findViewById(com.tencent.mm.R.id.bcy);
        this.f160346e = (android.widget.Button) findViewById(com.tencent.mm.R.id.bcx);
        this.f160354p = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.qhh);
        this.f160356r = (android.widget.TextView) findViewById(com.tencent.mm.R.id.qkk);
        this.f160357s = (android.widget.TextView) findViewById(com.tencent.mm.R.id.qki);
        this.f160358t = (android.widget.TextView) findViewById(com.tencent.mm.R.id.i3w);
        this.f160359u = (android.widget.TextView) findViewById(com.tencent.mm.R.id.i3q);
        this.f160360v = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486063qm4);
        this.f160361w = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486059qm2);
        this.f160362x = findViewById(com.tencent.mm.R.id.f485237u26);
        this.f160363y = (android.widget.TextView) findViewById(com.tencent.mm.R.id.u28);
        this.f160364z = (android.widget.TextView) findViewById(com.tencent.mm.R.id.u27);
        this.A = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485236u25);
        jz5.g gVar = com.tencent.mm.plugin.setting.ui.setting.bm.f160878a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        long n17 = j62.e.g().n() & io.flutter.embedding.android.KeyboardMap.kValueMask;
        if (n17 == 0) {
            str = "0";
        } else if (n17 > 0) {
            str = java.lang.Long.toString(n17, 10);
        } else {
            char[] cArr = new char[64];
            long j17 = (n17 >>> 1) / 5;
            long j18 = 10;
            int i17 = 63;
            cArr[63] = java.lang.Character.forDigit((int) (n17 - (j17 * j18)), 10);
            while (j17 > 0) {
                i17--;
                cArr[i17] = java.lang.Character.forDigit((int) (j17 % j18), 10);
                j17 /= j18;
            }
            str = new java.lang.String(cArr, i17, 64 - i17);
        }
        sb6.append(str);
        sb6.append("_");
        sb6.append(java.lang.System.currentTimeMillis());
        java.lang.String value = sb6.toString();
        kotlin.jvm.internal.o.g(value, "value");
        com.tencent.mm.plugin.setting.ui.setting.bm.f160879b = value;
        this.f160347f.setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479854h3) * i65.a.m(getContext()));
        this.f160348g.setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479575r) * i65.a.m(getContext()));
        this.f160349h.setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479575r) * i65.a.m(getContext()));
        this.f160346e.setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479882hv) * i65.a.m(getContext()));
        this.f160356r.setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479575r) * i65.a.m(getContext()));
        this.f160357s.setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479628b3) * i65.a.m(getContext()));
        this.f160358t.setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479575r) * i65.a.m(getContext()));
        this.f160359u.setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479628b3) * i65.a.m(getContext()));
        this.f160360v.setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479575r) * i65.a.m(getContext()));
        this.f160361w.setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479628b3) * i65.a.m(getContext()));
        this.f160363y.setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479575r) * i65.a.m(getContext()));
        this.f160364z.setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479575r) * i65.a.m(getContext()));
        this.A.setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479628b3) * i65.a.m(getContext()));
        androidx.appcompat.app.AppCompatActivity activity2 = getContext();
        kotlin.jvm.internal.o.g(activity2, "activity");
        if (!((com.tencent.mm.plugin.setting.ui.setting.p8) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.setting.ui.setting.p8.class)).f161429f) {
            this.f160354p.setVisibility(8);
            this.f160346e.setVisibility(8);
            this.f160355q.setVisibility(0);
            if (((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).cj()) {
                this.f160349h.setText(com.tencent.mm.R.string.n6e);
            } else {
                this.f160349h.setText(com.tencent.mm.R.string.d_g);
            }
            this.f160345d.setVisibility(0);
            this.f160345d.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.o9(this));
            return;
        }
        this.f160354p.setVisibility(0);
        this.f160345d.setVisibility(8);
        this.f160346e.setVisibility(0);
        this.f160355q.setVisibility(8);
        this.f160346e.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.e9(this));
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById(com.tencent.mm.R.id.i3v);
        this.f160352n = mMSwitchBtn;
        mMSwitchBtn.setCheck(j65.e.f());
        this.f160352n.setSwitchListener(new com.tencent.mm.plugin.setting.ui.setting.h9(this));
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn2 = (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById(com.tencent.mm.R.id.qkj);
        this.f160351m = mMSwitchBtn2;
        mMSwitchBtn2.setCheck(j65.e.e());
        this.f160351m.setSwitchListener(new com.tencent.mm.plugin.setting.ui.setting.k9(this));
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn3 = (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById(com.tencent.mm.R.id.f486062qm3);
        this.f160353o = mMSwitchBtn3;
        mMSwitchBtn3.setCheck(j65.e.g());
        this.f160353o.setSwitchListener(new com.tencent.mm.plugin.setting.ui.setting.l9(this));
        this.f160362x.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.m9(this));
        if (((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).cj()) {
            android.view.View view = this.f160362x;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsCareModeIntro", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/setting/ui/setting/SettingsCareModeIntro", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById = getContentView().findViewById(com.tencent.mm.R.id.f485235u24);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsCareModeIntro", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/setting/ui/setting/SettingsCareModeIntro", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view2 = this.f160362x;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsCareModeIntro", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/setting/ui/setting/SettingsCareModeIntro", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById2 = getContentView().findViewById(com.tencent.mm.R.id.f485235u24);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsCareModeIntro", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/setting/ui/setting/SettingsCareModeIntro", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        W6();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == this.f160362x.hashCode() && i18 == -1) {
            new android.os.Handler(getMainLooper()).postDelayed(new com.tencent.mm.plugin.setting.ui.setting.w8(this), 500L);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.SettingsCareModeIntro);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this, 4, 29254);
        if (com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).getBoolean("caremode_setting_succeed", false)) {
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(j65.e.b() ? com.tencent.mm.R.string.awm : com.tencent.mm.R.string.awd);
            androidx.appcompat.app.AppCompatActivity context = getContext();
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = string;
            e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
            e4Var.c();
            com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putBoolean("caremode_setting_succeed", false);
        }
        this.f160350i = c01.z1.i();
        initView();
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.x8(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        W6();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(com.tencent.mm.plugin.setting.ui.setting.p8.class);
    }
}

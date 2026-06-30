package com.tencent.mm.plugin.setting.ui.setting;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/SettingsMusicUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class SettingsMusicUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f160577o = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f160578d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f160579e;

    /* renamed from: f, reason: collision with root package name */
    public long f160580f;

    /* renamed from: g, reason: collision with root package name */
    public long f160581g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f160582h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public int f160583i;

    /* renamed from: m, reason: collision with root package name */
    public int f160584m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.lc0 f160585n;

    public final void V6(java.lang.String str, boolean z17) {
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", kz5.c1.k(new jz5.l("view_id", str), new jz5.l("set_opt", java.lang.Integer.valueOf(z17 ? 1 : 0))), 29375);
    }

    public final void W6(java.lang.String str, boolean z17) {
        com.tencent.mm.ui.base.preference.r rVar = this.f160578d;
        if (rVar != null) {
            ((com.tencent.mm.ui.base.preference.h0) rVar).m(str, !z17);
        }
    }

    public final void X6(boolean z17, long j17, int i17) {
        this.f160581g = z17 ? this.f160581g & (~j17) : this.f160581g | j17;
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsMusicUI", "switchStateChange open: " + z17 + ", value: " + j17 + ", functionId: " + i17 + ", extStatus2: " + this.f160581g);
        this.f160582h.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(z17 ? 1 : 2));
    }

    public final void Y6() {
        java.util.LinkedList linkedList;
        bw5.lc0 Ui = ((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).Ui();
        boolean z17 = false;
        this.f160583i = Ui != null ? Ui.f29743m : 0;
        bw5.lc0 lc0Var = this.f160585n;
        W6("settings_music_ai_cover_model", lc0Var != null ? lc0Var.f29745o : false);
        bw5.lc0 lc0Var2 = this.f160585n;
        if (lc0Var2 != null && lc0Var2.f29745o) {
            z17 = true;
        }
        if (z17) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("tyt_create_page_switch_model", "view_exp", kz5.q0.f314001d, 5, false);
        }
        com.tencent.mm.ui.base.preference.r rVar = this.f160578d;
        com.tencent.mm.ui.base.preference.Preference h17 = rVar != null ? ((com.tencent.mm.ui.base.preference.h0) rVar).h("settings_music_ai_cover_model") : null;
        bw5.lc0 lc0Var3 = this.f160585n;
        if (lc0Var3 != null && (linkedList = lc0Var3.f29744n) != null) {
            kotlin.jvm.internal.o.d(linkedList);
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                bw5.jc0 jc0Var = (bw5.jc0) it.next();
                if (jc0Var.f28924d == this.f160583i && h17 != null) {
                    h17.H(jc0Var.b());
                }
            }
        }
        com.tencent.mm.ui.base.preference.r rVar2 = this.f160578d;
        if (rVar2 != null) {
            ((com.tencent.mm.ui.base.preference.h0) rVar2).notifyDataSetChanged();
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494943cb;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    @Override // com.tencent.mm.ui.MMActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initView() {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.setting.ui.setting.SettingsMusicUI.initView():void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.LinkedList linkedList;
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1001) {
            Y6();
        }
        if (i17 == 1002) {
            bw5.lc0 Ui = ((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).Ui();
            this.f160584m = Ui != null ? Ui.f29746p : 0;
            bw5.lc0 lc0Var = this.f160585n;
            W6("settings_music_ai_create_model", lc0Var != null ? lc0Var.f29748r : false);
            com.tencent.mm.ui.base.preference.r rVar = this.f160578d;
            com.tencent.mm.ui.base.preference.Preference h17 = rVar != null ? ((com.tencent.mm.ui.base.preference.h0) rVar).h("settings_music_ai_create_model") : null;
            bw5.lc0 lc0Var2 = this.f160585n;
            if (lc0Var2 != null && (linkedList = lc0Var2.f29747q) != null) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    bw5.kc0 kc0Var = (bw5.kc0) it.next();
                    if (kc0Var.f29345d == this.f160584m && h17 != null) {
                        h17.H(kc0Var.b());
                    }
                }
            }
            com.tencent.mm.ui.base.preference.r rVar2 = this.f160578d;
            if (rVar2 != null) {
                ((com.tencent.mm.ui.base.preference.h0) rVar2).notifyDataSetChanged();
            }
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        long i17 = c01.z1.i();
        this.f160581g = i17;
        this.f160580f = i17;
        initView();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Mj(this);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.SettingsMusicUI);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this, 4, 29375);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.f160580f == this.f160581g) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsMusicUI", "doUpdateOplog extStatus2: " + this.f160581g + ", origin: " + this.f160580f);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EXT_STATUS2_LONG_SYNC, java.lang.Long.valueOf(this.f160581g));
        java.util.HashMap hashMap = this.f160582h;
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            r45.p53 p53Var = new r45.p53();
            p53Var.f382761d = ((java.lang.Number) entry.getKey()).intValue();
            p53Var.f382762e = ((java.lang.Number) entry.getValue()).intValue();
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        }
        hashMap.clear();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str;
        if (preference != null && (str = preference.f197780q) != null) {
            switch (str.hashCode()) {
                case -1415971929:
                    if (str.equals("settings_music_ai_create_model")) {
                        startActivityForResult(new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsMusicAiCreateModelUI.class), 1002);
                        break;
                    }
                    break;
                case -1176736000:
                    if (str.equals("settings_music_ai_cover_model")) {
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("tyt_create_page_switch_model", "view_clk", kz5.q0.f314001d, 5, false);
                        startActivityForResult(new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsMusicAiCoverModelUI.class), 1001);
                        break;
                    }
                    break;
                case -854607098:
                    if (str.equals("settings_music_recommend")) {
                        boolean N = ((com.tencent.mm.ui.base.preference.CheckBoxPreference) preference).N();
                        ef0.y2 y2Var = (ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class));
                        y2Var.getClass();
                        java.lang.Boolean aj6 = y2Var.aj();
                        com.tencent.mars.xlog.Log.i("MicroMsg.TingEntryConfigService", "setMusicRecommendState state: " + N + ", old: " + aj6);
                        ((rk4.k8) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj()).u(null);
                        ((ov.b) ((pv.z) i95.n0.c(pv.z.class))).Ni();
                        cl4.k.f42952a = true;
                        ((ov.b) ((pv.z) i95.n0.c(pv.z.class))).f349068f = 0L;
                        bw5.lc0 Ui = y2Var.Ui();
                        if (Ui != null) {
                            Ui.f29737d = N;
                            Ui.f29749s[1] = true;
                        }
                        y2Var.wi();
                        pq5.g l17 = new vk4.f(y2Var.Ui()).l();
                        l17.f(this);
                        l17.q(new ef0.v2(y2Var, N, aj6));
                        V6("wx_tyt_personlize_switch", N);
                        break;
                    }
                    break;
                case -150702647:
                    if (str.equals("settings_music_quality")) {
                        boolean N2 = ((com.tencent.mm.ui.base.preference.CheckBoxPreference) preference).N();
                        ef0.y2 y2Var2 = (ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class));
                        y2Var2.getClass();
                        bw5.lc0 Ui2 = y2Var2.Ui();
                        java.lang.Boolean valueOf = Ui2 != null ? java.lang.Boolean.valueOf(Ui2.f29740g) : null;
                        com.tencent.mars.xlog.Log.i("MicroMsg.TingEntryConfigService", "setEnableSqQualityInWwan state: " + N2 + ", old: " + valueOf);
                        bw5.lc0 Ui3 = y2Var2.Ui();
                        if (Ui3 != null) {
                            Ui3.f29740g = N2;
                            Ui3.f29749s[4] = true;
                        }
                        y2Var2.wi();
                        pq5.g l18 = new vk4.f(y2Var2.Ui()).l();
                        l18.f(this);
                        l18.q(new ef0.u2(y2Var2, N2, valueOf));
                        break;
                    }
                    break;
                case 225665241:
                    if (str.equals("settings_music_audio_push")) {
                        boolean N3 = ((com.tencent.mm.ui.base.preference.CheckBoxPreference) preference).N();
                        X6(N3, 2147483648L, 94);
                        V6("wx_tyt_audio_push", N3);
                        break;
                    }
                    break;
                case 1955811640:
                    if (str.equals("settings_music_taskbar")) {
                        boolean N4 = ((com.tencent.mm.ui.base.preference.CheckBoxPreference) preference).N();
                        X6(N4, 268435456L, 92);
                        V6("wx_tyt_recent_entrance", N4);
                        break;
                    }
                    break;
            }
        }
        return false;
    }
}

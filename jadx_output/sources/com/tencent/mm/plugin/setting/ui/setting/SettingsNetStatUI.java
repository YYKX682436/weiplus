package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes12.dex */
public class SettingsNetStatUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f160586f = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f160587d;

    /* renamed from: e, reason: collision with root package name */
    public long f160588e;

    public final void V6() {
        ((u90.t) ((v90.w) i95.n0.c(v90.w.class))).getClass();
        com.tencent.mm.modelstat.a0 Ai = com.tencent.mm.modelstat.t0.Ai();
        int i17 = (int) (this.f160588e / 86400000);
        Ai.f71491f.a(true);
        com.tencent.mm.modelstat.s sVar = null;
        android.database.Cursor f17 = Ai.f71489d.f("SELECT MAX( id), MAX( peroid), SUM( textCountIn), SUM( textBytesIn), SUM( imageCountIn), SUM( imageBytesIn), SUM( voiceCountIn), SUM( voiceBytesIn), SUM( videoCountIn), SUM( videoBytesIn), SUM( mobileBytesIn), SUM( wifiBytesIn), SUM( sysMobileBytesIn), SUM( sysWifiBytesIn), SUM( textCountOut), SUM( textBytesOut), SUM( imageCountOut), SUM( imageBytesOut), SUM( voiceCountOut), SUM( voiceBytesOut), SUM( videoCountOut), SUM( videoBytesOut), SUM( mobileBytesOut), SUM( wifiBytesOut), SUM( sysMobileBytesOut), SUM( sysWifiBytesOut ), SUM( realMobileBytesIn ), SUM( realWifiBytesIn ), SUM( realMobileBytesOut ), SUM( realWifiBytesOut ) FROM netstat WHERE peroid >= " + i17 + "", null, 2);
        if (f17.moveToFirst()) {
            sVar = new com.tencent.mm.modelstat.s();
            sVar.a(f17);
        }
        f17.close();
        if (sVar == null) {
            sVar = new com.tencent.mm.modelstat.s();
        }
        ((u90.t) ((v90.w) i95.n0.c(v90.w.class))).getClass();
        this.f160588e = com.tencent.mm.modelstat.t0.Ai().s0();
        ((com.tencent.mm.ui.base.preference.h0) this.f160587d).h("settings_netstat_info").L(getString(com.tencent.mm.R.string.izy, android.text.format.DateFormat.format(getString(com.tencent.mm.R.string.fcl, ""), this.f160588e).toString()));
        com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) this.f160587d).h("settings_netstat_mobile");
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsNetStatUI", "dknetflow updateFlowStatistic mobile out:%d in:%d", java.lang.Long.valueOf(sVar.f71576x), java.lang.Long.valueOf(sVar.f71564l));
        h17.H(getString(com.tencent.mm.R.string.izx, com.tencent.mm.sdk.platformtools.t8.f0(sVar.f71576x + sVar.f71564l)));
        h17.E(8);
        com.tencent.mm.ui.base.preference.Preference h18 = ((com.tencent.mm.ui.base.preference.h0) this.f160587d).h("settings_netstat_wifi");
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsNetStatUI", "dknetflow updateFlowStatistic wifi out:%d in:%d", java.lang.Long.valueOf(sVar.f71577y), java.lang.Long.valueOf(sVar.f71565m));
        h18.H(getString(com.tencent.mm.R.string.izx, com.tencent.mm.sdk.platformtools.t8.f0(sVar.f71577y + sVar.f71565m)));
        h18.E(8);
        ((com.tencent.mm.plugin.setting.ui.setting.NetStatPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160587d).h("settings_netstat_mobile_detail")).L = false;
        ((com.tencent.mm.plugin.setting.ui.setting.NetStatPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160587d).h("settings_netstat_wifi_detail")).L = true;
        ((com.tencent.mm.ui.base.preference.h0) this.f160587d).notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean autoRefresh() {
        return false;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494944cc;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.f493094j00);
        ((u90.t) ((v90.w) i95.n0.c(v90.w.class))).getClass();
        com.tencent.mm.modelstat.a0 Ai = com.tencent.mm.modelstat.t0.Ai();
        Ai.getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        int currentTimeMillis = (int) (((java.lang.System.currentTimeMillis() / 86400000) * 86400000) / 86400000);
        if (Ai.n0(currentTimeMillis) == null) {
            com.tencent.mm.modelstat.s sVar = new com.tencent.mm.modelstat.s();
            sVar.f71555c = currentTimeMillis;
            sVar.f71554b = -1;
            Ai.u0(sVar);
        }
        this.f160587d = getPreferenceScreen();
        ((u90.t) ((v90.w) i95.n0.c(v90.w.class))).getClass();
        this.f160588e = com.tencent.mm.modelstat.t0.Ai().s0();
        com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) this.f160587d).h("settings_netstat_info");
        java.lang.String format = new java.text.SimpleDateFormat(getString(com.tencent.mm.R.string.fcl), java.util.Locale.US).format(new java.util.Date(this.f160588e));
        h17.L(getString(com.tencent.mm.R.string.izy, format));
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsNetStatUI", "title datatime = " + format);
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.dj(this));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f493095j01), new com.tencent.mm.plugin.setting.ui.setting.ej(this));
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        return false;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        V6();
    }
}

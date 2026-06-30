package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class SettingsActiveTimeUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f160295d;

    /* renamed from: e, reason: collision with root package name */
    public int f160296e;

    /* renamed from: f, reason: collision with root package name */
    public int f160297f;

    /* renamed from: g, reason: collision with root package name */
    public int f160298g;

    /* renamed from: h, reason: collision with root package name */
    public int f160299h;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.Preference f160301m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.Preference f160302n;

    /* renamed from: i, reason: collision with root package name */
    public boolean f160300i = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f160303o = false;

    /* renamed from: p, reason: collision with root package name */
    public final android.app.TimePickerDialog.OnTimeSetListener f160304p = new com.tencent.mm.plugin.setting.ui.setting.q6(this);

    public static java.lang.String V6(android.content.Context context, int i17, int i18) {
        java.lang.String p17 = com.tencent.mm.sdk.platformtools.m2.p(context.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0), context);
        java.lang.String d17 = com.tencent.mm.sdk.platformtools.m2.d();
        if (!p17.equalsIgnoreCase("zh_CN") && (!p17.equalsIgnoreCase("language_default") || !"zh_CN".equalsIgnoreCase(d17))) {
            return java.text.DateFormat.getTimeInstance(3, com.tencent.mm.sdk.platformtools.m2.s(p17)).format((java.util.Date) new java.sql.Time(i17, i18, 0));
        }
        return ((java.lang.Object) k35.m1.c(context, (i17 * 3600000) + (i18 * 60000))) + java.lang.String.format("%02d:%02d", java.lang.Integer.valueOf(i17 > 12 ? i17 - 12 : i17), java.lang.Integer.valueOf(i18));
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494935c3;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        com.tencent.mm.ui.base.preference.r preferenceScreen = getPreferenceScreen();
        this.f160295d = preferenceScreen;
        ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).t();
        ((com.tencent.mm.ui.base.preference.h0) this.f160295d).g(com.tencent.mm.R.xml.f494935c3);
        this.f160303o = !ip.b.r();
        ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160295d).h("settings_active_silence_time")).O(this.f160303o);
        this.f160302n = ((com.tencent.mm.ui.base.preference.h0) this.f160295d).h("settings_active_begin_time");
        this.f160296e = ip.b.v().getInt("settings_active_end_time_hour", 23);
        int i17 = ip.b.v().getInt("settings_active_end_time_min", 0);
        this.f160297f = i17;
        this.f160302n.H(V6(this, this.f160296e, i17));
        this.f160301m = ((com.tencent.mm.ui.base.preference.h0) this.f160295d).h("settings_active_end_time");
        this.f160298g = ip.b.v().getInt("settings_active_begin_time_hour", 8);
        int i18 = ip.b.v().getInt("settings_active_begin_time_min", 0);
        this.f160299h = i18;
        this.f160301m.H(V6(this, this.f160298g, i18));
        if (this.f160303o) {
            this.f160302n.w(true);
            this.f160301m.w(true);
        } else {
            this.f160302n.w(false);
            this.f160301m.w(false);
        }
        if (!this.f160303o) {
            ((com.tencent.mm.ui.base.preference.h0) this.f160295d).v(this.f160302n);
            ((com.tencent.mm.ui.base.preference.h0) this.f160295d).v(this.f160301m);
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f160295d).notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.f493022ip4);
        initView();
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.p6(this));
    }

    @Override // android.app.Activity
    public android.app.Dialog onCreateDialog(int i17) {
        if (i17 != 1) {
            return null;
        }
        boolean z17 = this.f160300i;
        android.app.TimePickerDialog.OnTimeSetListener onTimeSetListener = this.f160304p;
        return z17 ? new android.app.TimePickerDialog(getContext(), onTimeSetListener, this.f160296e, this.f160297f, false) : new android.app.TimePickerDialog(getContext(), onTimeSetListener, this.f160298g, this.f160299h, false);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c01.a9.a(2);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        if (preference.f197780q.equals("settings_active_begin_time")) {
            this.f160300i = true;
            showDialog(1);
            return true;
        }
        if (preference.f197780q.equals("settings_active_end_time")) {
            this.f160300i = false;
            showDialog(1);
            return true;
        }
        if (!preference.f197780q.equals("settings_active_silence_time")) {
            return false;
        }
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160295d).h("settings_active_silence_time");
        boolean z17 = !checkBoxPreference.N();
        ip.b.v().edit().putBoolean("settings_active_time_full", z17).commit();
        com.tencent.mars.xlog.Log.i("MicroMsg.NotificationConfig", "[NOTIFICATION SETTINGS]double write : saveIsActiveTime: %B", java.lang.Boolean.valueOf(z17));
        if (fp.h.c(26)) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            android.app.NotificationManager notificationManager = (android.app.NotificationManager) context.getSystemService(android.app.NotificationManager.class);
            if (notificationManager.getNotificationChannel("message_dnd_mode_channel_id") == null) {
                android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel("message_dnd_mode_channel_id", context.getString(com.tencent.mm.R.string.hb7), 4);
                notificationChannel.setDescription(context.getString(com.tencent.mm.R.string.hb6));
                notificationChannel.enableLights(true);
                notificationChannel.setLightColor(-16711936);
                notificationChannel.enableVibration(false);
                notificationChannel.setSound(null, android.app.Notification.AUDIO_ATTRIBUTES_DEFAULT);
                mo3.g.wi(notificationManager, notificationChannel);
            }
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = 0;
        objArr[1] = java.lang.Integer.valueOf(checkBoxPreference.N() ? 1 : 2);
        g0Var.d(11351, objArr);
        initView();
        return true;
    }

    @Override // android.app.Activity
    public void onPrepareDialog(int i17, android.app.Dialog dialog) {
        if (i17 != 1) {
            return;
        }
        if (this.f160300i) {
            ((android.app.TimePickerDialog) dialog).updateTime(this.f160296e, this.f160297f);
        } else {
            ((android.app.TimePickerDialog) dialog).updateTime(this.f160298g, this.f160299h);
        }
    }
}

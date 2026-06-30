package com.tencent.mm.plugin.setting.ui.setting;

@db5.a(1)
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/SettingMessageRingtoneUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "Lcom/tencent/mm/plugin/setting/ui/setting/z1;", "<init>", "()V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public class SettingMessageRingtoneUI extends com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity implements com.tencent.mm.plugin.setting.ui.setting.z1 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.concurrent.Future f160238d;

    /* renamed from: e, reason: collision with root package name */
    public android.media.SoundPool f160239e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f160240f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f160241g = jz5.h.b(new com.tencent.mm.plugin.setting.ui.setting.y4(this));

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f160242h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Integer f160243i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Integer f160244m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Integer f160245n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.setting.ui.setting.SettingMessageRingtoneUI$ringtoneResUpdateListener$1 f160246o;

    /* renamed from: p, reason: collision with root package name */
    public android.media.Ringtone f160247p;

    /* renamed from: q, reason: collision with root package name */
    public ip.k f160248q;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.setting.ui.setting.SettingMessageRingtoneUI$ringtoneResUpdateListener$1] */
    public SettingMessageRingtoneUI() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f160246o = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RingtoneResUpdateEvent>(a0Var) { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingMessageRingtoneUI$ringtoneResUpdateListener$1
            {
                this.__eventId = 1941428483;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.RingtoneResUpdateEvent ringtoneResUpdateEvent) {
                com.tencent.mm.autogen.events.RingtoneResUpdateEvent event = ringtoneResUpdateEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mars.xlog.Log.i("MicroMsg.SettingMessageRingtoneUI", "ringtone update res");
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.setting.ui.setting.x4(com.tencent.mm.plugin.setting.ui.setting.SettingMessageRingtoneUI.this));
                return true;
            }
        };
    }

    public static final void U6(com.tencent.mm.plugin.setting.ui.setting.SettingMessageRingtoneUI settingMessageRingtoneUI) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finish ");
        ip.k kVar = settingMessageRingtoneUI.f160248q;
        sb6.append(kVar != null ? java.lang.Integer.valueOf(kVar.f293571a) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingMessageRingtoneUI", sb6.toString());
        ip.k kVar2 = settingMessageRingtoneUI.f160248q;
        if (kVar2 != null) {
            com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("setting_notification");
            int i17 = kVar2.f293571a;
            if (M != null) {
                M.putInt("settings.ringtone.wechat", i17);
            }
            java.lang.String n17 = ip.b.n(i17);
            java.lang.Object[] objArr = new java.lang.Object[1];
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            objArr[0] = n17 == null ? "" : n17;
            com.tencent.mars.xlog.Log.i("MicroMsg.NewMsgNotificationHelper", "reCreateNewMsgNotificationChannel ringtonePath:%s", objArr);
            try {
                int i18 = android.os.Build.VERSION.SDK_INT;
                if (i18 >= 26) {
                    android.content.SharedPreferences v17 = gm0.m.v();
                    android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    android.app.NotificationManager notificationManager = (android.app.NotificationManager) context.getSystemService(android.app.NotificationManager.class);
                    android.app.NotificationChannel notificationChannel = notificationManager.getNotificationChannel(n25.a.a());
                    java.lang.String str = "message_channel_" + c01.id.a();
                    android.app.NotificationChannel notificationChannel2 = new android.app.NotificationChannel(str, context.getString(com.tencent.mm.R.string.f492645hb5), notificationChannel.getImportance());
                    notificationChannel2.setDescription(context.getString(com.tencent.mm.R.string.f492644hb4));
                    notificationChannel2.enableLights(true);
                    notificationChannel2.setLightColor(-16711936);
                    notificationChannel2.setVibrationPattern(com.tencent.mm.sdk.platformtools.t8.f192990b);
                    notificationChannel2.enableVibration(notificationChannel.shouldVibrate());
                    if (i18 >= 29) {
                        notificationChannel2.setAllowBubbles(notificationChannel.canBubble());
                    }
                    notificationChannel2.setBypassDnd(notificationChannel.canBypassDnd());
                    notificationChannel2.setLockscreenVisibility(notificationChannel.getLockscreenVisibility());
                    notificationChannel2.setShowBadge(notificationChannel.canShowBadge());
                    if (com.tencent.mm.sdk.platformtools.t8.K0(n17)) {
                        notificationChannel2.setSound(android.provider.Settings.System.DEFAULT_NOTIFICATION_URI, android.app.Notification.AUDIO_ATTRIBUTES_DEFAULT);
                    } else {
                        android.net.Uri b17 = com.tencent.mm.sdk.platformtools.i1.b(context, com.tencent.mm.vfs.r6.j(new java.io.File(n17)));
                        context.grantUriPermission("com.android.systemui", b17, 1);
                        notificationChannel2.setSound(b17, android.app.Notification.AUDIO_ATTRIBUTES_DEFAULT);
                    }
                    notificationManager.deleteNotificationChannel(n25.a.a());
                    notificationManager.createNotificationChannel(notificationChannel2);
                    v17.edit().putString("message_channel_id", str).commit();
                    n25.a.f334317a = str;
                    ip.b.f293546b = str;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NewMsgNotificationHelper", "reCreateNewMsgNotificationChannel %s, %s", e17.getClass().getSimpleName(), e17.getMessage());
            }
        }
        settingMessageRingtoneUI.X6();
        settingMessageRingtoneUI.finish();
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.z1
    public boolean T5(ip.k composition) {
        kotlin.jvm.internal.o.g(composition, "composition");
        java.lang.Integer num = this.f160245n;
        return num != null && num.intValue() == composition.f293571a;
    }

    public final void V6() {
        if (kotlin.jvm.internal.o.b(this.f160245n, this.f160244m)) {
            finish();
            return;
        }
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(getContext());
        u1Var.g(getString(com.tencent.mm.R.string.inc));
        u1Var.n(getString(com.tencent.mm.R.string.f490462vq));
        u1Var.j(getString(com.tencent.mm.R.string.f490347sg));
        u1Var.b(new com.tencent.mm.plugin.setting.ui.setting.q4(this));
        u1Var.q(false);
    }

    public final androidx.recyclerview.widget.RecyclerView W6() {
        java.lang.Object value = ((jz5.n) this.f160241g).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (androidx.recyclerview.widget.RecyclerView) value;
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.z1
    public void X3(ip.k composition) {
        kotlin.jvm.internal.o.g(composition, "composition");
        java.lang.Integer num = this.f160244m;
        int i17 = composition.f293571a;
        if (num == null || num.intValue() != i17) {
            enableOptionMenu(0, true);
        }
        java.lang.String n17 = ip.b.n(i17);
        this.f160248q = composition;
        this.f160245n = java.lang.Integer.valueOf(i17);
        android.media.Ringtone ringtone = this.f160247p;
        if (ringtone != null) {
            ringtone.stop();
        }
        java.lang.Integer num2 = this.f160243i;
        if (num2 != null) {
            int intValue = num2.intValue();
            android.media.SoundPool soundPool = this.f160239e;
            if (soundPool != null) {
                soundPool.stop(intValue);
            }
        }
        if (i17 == 0) {
            android.media.Ringtone ringtone2 = android.media.RingtoneManager.getRingtone(getContext(), android.media.RingtoneManager.getDefaultUri(2));
            this.f160247p = ringtone2;
            if (ringtone2 != null) {
                ringtone2.play();
                return;
            }
            return;
        }
        kotlin.jvm.internal.o.d(n17);
        if (this.f160239e == null) {
            this.f160239e = new android.media.SoundPool.Builder().setMaxStreams(10).setAudioAttributes(new android.media.AudioAttributes.Builder().setLegacyStreamType(5).build()).build();
        }
        android.media.SoundPool soundPool2 = this.f160239e;
        if (soundPool2 != null) {
            soundPool2.load(com.tencent.mm.vfs.w6.i(n17, true), 1);
        }
        android.media.SoundPool soundPool3 = this.f160239e;
        if (soundPool3 != null) {
            soundPool3.setOnLoadCompleteListener(new com.tencent.mm.plugin.setting.ui.setting.w4(this, n17));
        }
    }

    public final void X6() {
        java.lang.Integer num = this.f160245n;
        if (num == null || num.intValue() <= 0) {
            return;
        }
        int intValue = num.intValue();
        java.util.ArrayList arrayList = this.f160240f;
        if (intValue < arrayList.size()) {
            java.lang.Object obj = arrayList.get(num.intValue());
            kotlin.jvm.internal.o.f(obj, "get(...)");
            com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference.f161506e.a(this, "select_view_ringtone_sound", ((ip.k) obj).f293572b, 4);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.clo;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.iuj);
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.r4(this));
        addTextOptionMenu(0, getContext().getString(com.tencent.mm.R.string.f490441v5), new com.tencent.mm.plugin.setting.ui.setting.s4(this), null, com.tencent.mm.ui.fb.GREEN);
        enableOptionMenu(0, false);
        hideActionbarLine();
        W6().setAdapter(new com.tencent.mm.plugin.setting.ui.setting.y1(this.f160240f, this));
        com.tencent.mm.view.recyclerview.WxLinearLayoutManager wxLinearLayoutManager = new com.tencent.mm.view.recyclerview.WxLinearLayoutManager(getContext());
        wxLinearLayoutManager.Q(1);
        W6().setLayoutManager(wxLinearLayoutManager);
        androidx.recyclerview.widget.RecyclerView W6 = W6();
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        in5.t0 t0Var = new in5.t0(context);
        t0Var.f293129c = in5.q.f293113d;
        t0Var.c(com.tencent.mm.R.color.f479307vn);
        t0Var.b(com.tencent.mm.R.color.a9e);
        t0Var.d(com.tencent.mm.R.dimen.f479638bd);
        android.content.res.Resources resources = t0Var.f293128b;
        t0Var.f293131e = resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        t0Var.f293132f = resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        W6.N(t0Var.a());
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingMessageRingtoneUI", "current ringtone:" + ip.b.o());
        if (!com.tencent.mm.vfs.w6.j(ip.b.n(1))) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SettingMessageRingtoneUI", "file no exits");
            alive();
            ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).wi(96);
            this.f160242h = com.tencent.mm.ui.widget.dialog.u3.f(getContext(), getContext().getString(com.tencent.mm.R.string.ggd), true, 3, new com.tencent.mm.plugin.setting.ui.setting.t4(this));
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.plugin.setting.ui.setting.u4 u4Var = new com.tencent.mm.plugin.setting.ui.setting.u4(this);
            ku5.t0 t0Var2 = (ku5.t0) u0Var;
            t0Var2.getClass();
            this.f160238d = t0Var2.z(u4Var, 15000L, false);
            ((ku5.t0) ku5.t0.f312615d).g(com.tencent.mm.plugin.setting.ui.setting.v4.f161630d);
        }
        X6();
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.z1
    public void notifyDataSetChanged() {
        androidx.recyclerview.widget.f2 adapter = W6().getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        V6();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.util.ArrayList arrayList = this.f160240f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(new ip.k(0, getString(com.tencent.mm.R.string.f490464vs)));
        arrayList2.add(new ip.k(1, getString(com.tencent.mm.R.string.f492986ik2)));
        arrayList2.add(new ip.k(2, getString(com.tencent.mm.R.string.ik8)));
        arrayList2.add(new ip.k(3, getString(com.tencent.mm.R.string.ik7)));
        arrayList2.add(new ip.k(4, getString(com.tencent.mm.R.string.f492989ik5)));
        arrayList2.add(new ip.k(5, getString(com.tencent.mm.R.string.f492987ik3)));
        arrayList2.add(new ip.k(6, getString(com.tencent.mm.R.string.f492988ik4)));
        arrayList2.add(new ip.k(7, getString(com.tencent.mm.R.string.ik6)));
        arrayList.addAll(arrayList2);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(ip.b.o());
        this.f160244m = valueOf;
        if (valueOf != null && valueOf.intValue() == -1) {
            this.f160244m = 0;
        }
        this.f160245n = this.f160244m;
        initView();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        android.media.Ringtone ringtone = this.f160247p;
        if (ringtone != null) {
            ringtone.stop();
        }
        android.media.SoundPool soundPool = this.f160239e;
        if (soundPool != null) {
            soundPool.release();
        }
        super.onDestroy();
        dead();
    }

    @Override // com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        t14.r rVar = com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference.f161506e;
        set.addAll(com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference.f161507f);
    }
}

package com.tencent.mm.plugin.setting.ui.setting_new.settings;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/SettingGroupAccountInfo;", "Ls24/e;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class SettingGroupAccountInfo extends s24.e {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f161873p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f161874q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Integer f161875r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.Integer f161876s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.Integer f161877t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingGroupAccountInfo(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f161873p = "account_safe";
        rn3.i.Di().k(this);
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        if (bk0.a.g().c(com.tencent.mm.storage.u3.NEW_BANDAGE_DATASOURCE_DEVICE_PROTECT_STRING_SYNC, 266257)) {
            this.f161877t = java.lang.Integer.valueOf(com.tencent.mm.R.drawable.b8i);
        } else {
            this.f161877t = null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("VoiceprintEntry"), 0) == 1) {
            java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_VOICEPRINT_SETTING_ACCOUNT_INFO_DOT_SHOW_BOOLEAN, java.lang.Boolean.FALSE);
            kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
            if (!((java.lang.Boolean) m17).booleanValue()) {
                this.f161875r = null;
                this.f161876s = null;
            } else if ((gm0.j1.u().c().q(40, 0) & 131072) == 0) {
                this.f161875r = java.lang.Integer.valueOf(com.tencent.mm.R.string.f490501wv);
                this.f161876s = java.lang.Integer.valueOf(com.tencent.mm.R.drawable.asx);
                com.tencent.mars.xlog.Log.i("MicroMsg.BaseSettingItem", "show voiceprint dot");
            }
            w7();
        }
    }

    @Override // s24.f
    /* renamed from: A7, reason: from getter */
    public java.lang.String getF161873p() {
        return this.f161873p;
    }

    @Override // s24.f
    /* renamed from: B7, reason: from getter */
    public android.view.View getF161874q() {
        return this.f161874q;
    }

    @Override // s24.f
    /* renamed from: D7, reason: from getter */
    public java.lang.Integer getF161877t() {
        return this.f161877t;
    }

    @Override // s24.f
    /* renamed from: E7, reason: from getter */
    public java.lang.Integer getF161875r() {
        return this.f161875r;
    }

    @Override // s24.f
    /* renamed from: F7, reason: from getter */
    public java.lang.Integer getF161876s() {
        return this.f161876s;
    }

    @Override // s24.f
    public void G7(android.content.Context context, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        super.G7(context, intent);
        pf5.j0.a(intent, com.tencent.mm.plugin.setting.ui.setting_new.uic.b.class);
    }

    @Override // s24.f
    public void H7(android.view.View view) {
        this.f161874q = view;
    }

    @Override // s24.f
    public void I7(java.lang.Integer num) {
        this.f161877t = num;
    }

    @Override // s24.f
    public void J7(java.lang.Integer num) {
        this.f161875r = num;
    }

    @Override // s24.f
    public void K7(java.lang.Integer num) {
        this.f161876s = num;
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_AccountInfo";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupMain.class, com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupPersonalInfo.class);
    }

    @Override // s24.e, s24.f, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public int d7() {
        return com.tencent.mm.R.string.f493019ip1;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupMain.class;
    }

    @Override // a24.i
    public int m7() {
        return 1;
    }

    @Override // s24.e, a24.i
    public void r7(android.content.Context context, android.view.View itemView, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f161877t = null;
        this.f161876s = null;
        this.f161875r = null;
        if (com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("VoiceprintEntry"), 0) == 1 && (gm0.j1.u().c().q(40, 0) & 131072) == 0) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_VOICEPRINT_SETTING_ACCOUNT_INFO_DOT_SHOW_BOOLEAN, java.lang.Boolean.FALSE);
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseSettingItem", "unset setting account info dot show");
        }
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        bk0.a.g().i(com.tencent.mm.storage.u3.NEW_BANDAGE_DATASOURCE_DEVICE_PROTECT_STRING_SYNC, 266257);
        rn3.i.Di().a(51);
        super.r7(context, itemView, i17);
    }

    @Override // s24.f, com.tencent.mm.plugin.newtips.model.a
    public boolean y(boolean z17) {
        super.y(z17);
        w7();
        return true;
    }
}

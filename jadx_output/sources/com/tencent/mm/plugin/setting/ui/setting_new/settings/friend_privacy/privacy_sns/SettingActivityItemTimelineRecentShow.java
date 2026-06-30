package com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.privacy_sns;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/friend_privacy/privacy_sns/SettingActivityItemTimelineRecentShow;", "Ls24/a;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SettingActivityItemTimelineRecentShow extends s24.a {

    /* renamed from: p, reason: collision with root package name */
    public boolean f161938p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f161939q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f161940r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f161941s;

    /* renamed from: t, reason: collision with root package name */
    public int f161942t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f161943u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingActivityItemTimelineRecentShow(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f161942t = 0;
        java.lang.String r17 = c01.z1.r();
        kotlin.jvm.internal.o.f(r17, "getUsernameFromUserInfo(...)");
        this.f161943u = r17;
    }

    @Override // s24.a
    public java.lang.String L7() {
        return ".ui.SnsTagPartlyUI";
    }

    @Override // s24.a
    public java.lang.String M7() {
        return "sns";
    }

    public final void N7(android.widget.LinearLayout linearLayout, int i17, int i18, boolean z17, android.view.View.OnClickListener onClickListener) {
        android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.cbx, null);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.widget.TextView");
        android.widget.TextView textView = (android.widget.TextView) inflate;
        textView.setText(i17);
        textView.setTag(java.lang.Integer.valueOf(i18));
        linearLayout.addView(textView);
        textView.setOnClickListener(onClickListener);
        if (!z17) {
            textView.setContentDescription(((java.lang.Object) textView.getText()) + textView.getContext().getString(com.tencent.mm.R.string.f489843db));
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(com.tencent.mm.R.raw.radio_on, 0, 0, 0);
        textView.setContentDescription(((java.lang.Object) textView.getText()) + textView.getContext().getString(com.tencent.mm.R.string.d_));
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_FriendPrivacy_PrivacySns_RecentShow";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.SettingActivityItemPrivacySns.class, com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.privacy_sns.SettingSwitchTimelineStrangerShow.class);
    }

    @Override // s24.a, s24.f, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public int d7() {
        return com.tencent.mm.R.string.pby;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.SettingActivityItemPrivacySns.class;
    }

    @Override // a24.i
    public int m7() {
        return 3;
    }

    @Override // a24.i
    /* renamed from: n7 */
    public java.lang.String getF161878p() {
        r45.cb6 cb6Var = new r45.cb6();
        this.f161942t = getIntent().getIntExtra("enter_scene", 0);
        if (p94.w0.c() != null) {
            cb6Var = ((com.tencent.mm.plugin.sns.storage.e2) p94.w0.c()).b1(this.f161943u);
        }
        if (cb6Var == null) {
            return getString(com.tencent.mm.R.string.bdo);
        }
        int i17 = cb6Var.f371431g;
        int i18 = cb6Var.f371432h;
        boolean z17 = i18 == 4320 && (i17 & 4096) > 0;
        this.f161938p = z17;
        boolean z18 = i18 == 72 && (i17 & 4096) > 0;
        this.f161939q = z18;
        boolean z19 = i18 == 720 && (i17 & 4096) > 0;
        this.f161941s = z19;
        this.f161940r = (i17 & 2048) > 0;
        return z17 ? getString(com.tencent.mm.R.string.bdp) : z18 ? getString(com.tencent.mm.R.string.bdr) : z19 ? getString(com.tencent.mm.R.string.bdq) : getString(com.tencent.mm.R.string.bdo);
    }

    @Override // s24.a, a24.i
    public void r7(android.content.Context context, android.view.View itemView, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(itemView, "itemView");
        t7(getActivity().getIntent());
        r45.cb6 cb6Var = new r45.cb6();
        p94.j0 c17 = p94.w0.c();
        java.lang.String str = this.f161943u;
        if (c17 != null) {
            cb6Var = ((com.tencent.mm.plugin.sns.storage.e2) p94.w0.c()).b1(str);
        }
        if (cb6Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SettingActivityItemTimelineRecentShow", "onClick, userinof is null, selfName:" + str);
            return;
        }
        boolean z17 = false;
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_RECENT_RED_DOT_WILL_SHOW_ID_INT, 0);
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) m17).intValue();
        com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_RECENT_RED_DOT_DID_SHOW_ID_INT;
        java.lang.Object m18 = c18.m(u3Var, 0);
        kotlin.jvm.internal.o.e(m18, "null cannot be cast to non-null type kotlin.Int");
        if (intValue > ((java.lang.Integer) m18).intValue()) {
            gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(intValue));
            s7();
        }
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        aVar.f211733w = of5.b.a(context).getString(com.tencent.mm.R.string.f490347sg);
        aVar.f211709a = of5.b.a(context).getString(com.tencent.mm.R.string.bdn);
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.bxx, null);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.nua);
        kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type android.widget.LinearLayout");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById;
        android.view.View.OnClickListener bVar = new i24.b(linearLayout, this);
        N7(linearLayout, com.tencent.mm.R.string.bdp, 1, this.f161938p, bVar);
        N7(linearLayout, com.tencent.mm.R.string.bdq, 3, this.f161941s, bVar);
        N7(linearLayout, com.tencent.mm.R.string.bdr, 0, this.f161939q, bVar);
        if (!this.f161938p && !this.f161939q && !this.f161941s) {
            z17 = true;
        }
        N7(linearLayout, com.tencent.mm.R.string.bdo, 2, z17, bVar);
        aVar.L = inflate;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        linearLayout.setTag(j0Var);
        j0Var.show();
    }
}

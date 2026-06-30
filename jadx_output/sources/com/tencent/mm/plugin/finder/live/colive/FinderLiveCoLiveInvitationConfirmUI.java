package com.tencent.mm.plugin.finder.live.colive;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/colive/FinderLiveCoLiveInvitationConfirmUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveCoLiveInvitationConfirmUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f111530t = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f111531d;

    /* renamed from: h, reason: collision with root package name */
    public int f111535h;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f111537m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f111538n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f111539o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f111540p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f111541q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f111542r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f111543s;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f111532e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f111533f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f111534g = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f111536i = "";

    public static final void T6(com.tencent.mm.plugin.finder.live.colive.FinderLiveCoLiveInvitationConfirmUI finderLiveCoLiveInvitationConfirmUI) {
        com.tencent.mars.xlog.Log.i("Finder.CoLiveInvitationConfirmUI", "onAcceptInvitation: invitationId=" + finderLiveCoLiveInvitationConfirmUI.f111531d + ", initiator=" + finderLiveCoLiveInvitationConfirmUI.f111534g);
        finderLiveCoLiveInvitationConfirmUI.f111543s = true;
        az2.f a17 = az2.c.a(az2.f.f16125d, finderLiveCoLiveInvitationConfirmUI, null, 0L, null, 8, null);
        a17.a();
        long j17 = finderLiveCoLiveInvitationConfirmUI.f111531d;
        java.lang.String str = finderLiveCoLiveInvitationConfirmUI.f111534g;
        re2.o0 o0Var = new re2.o0(finderLiveCoLiveInvitationConfirmUI, a17);
        re2.q0 q0Var = new re2.q0(finderLiveCoLiveInvitationConfirmUI, a17);
        com.tencent.mars.xlog.Log.i("Finder.CoLiveRequestHelper", "acceptInvitation: invitationId=" + j17 + ", initiator=" + str);
        new ek2.q(j17, 1, null, str, new re2.z0(j17, o0Var, q0Var)).l();
    }

    public static final void U6(com.tencent.mm.plugin.finder.live.colive.FinderLiveCoLiveInvitationConfirmUI finderLiveCoLiveInvitationConfirmUI, int i17, java.lang.String str, int i18, java.lang.String str2) {
        finderLiveCoLiveInvitationConfirmUI.getClass();
        com.tencent.mars.xlog.Log.i("Finder.CoLiveInvitationConfirmUI", "pushErrorUI: errCode=" + i17 + ", userFlag=" + i18 + ", spamJumpUrl=" + str2);
        int i19 = com.tencent.mm.plugin.finder.live.colive.FinderLiveCoLiveInvitationErrorUI.f111544n;
        android.content.Intent intent = new android.content.Intent(finderLiveCoLiveInvitationConfirmUI, (java.lang.Class<?>) com.tencent.mm.plugin.finder.live.colive.FinderLiveCoLiveInvitationErrorUI.class);
        if (str == null) {
            str = "";
        }
        intent.putExtra("co_live_error_desc", str);
        intent.putExtra("co_live_error_code", i17);
        intent.putExtra("co_live_use_close_icon", false);
        intent.putExtra("co_live_user_flag", i18);
        if (!(str2 == null || str2.length() == 0)) {
            intent.putExtra("co_live_spam_jump_url", str2);
        }
        com.tencent.mars.xlog.Log.i("Finder.CoLiveInvitationErrorUI", "startForResult: errorCode=" + i17 + ", userFlag=" + i18 + ", spamJumpUrl=" + str2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(32273);
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(finderLiveCoLiveInvitationConfirmUI, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/colive/FinderLiveCoLiveInvitationErrorUI$Companion", "startForResult", "(Landroid/app/Activity;ILjava/lang/String;IILjava/lang/String;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.e9l;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 32273) {
            super.onActivityResult(i17, i18, intent);
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.CoLiveInvitationConfirmUI", "onActivityResult: errorUI returned, resultCode=" + i18);
        if (i18 != -1) {
            finish();
            return;
        }
        android.view.View view = this.f111541q;
        if (view != null) {
            view.post(new re2.r0(this));
        } else {
            kotlin.jvm.internal.o.o("acceptBtn");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f111531d = getIntent().getLongExtra("co_live_invitation_id", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("co_live_initiator_nickname");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f111532e = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("co_live_initiator_head_url");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f111533f = stringExtra2;
        java.lang.String stringExtra3 = getIntent().getStringExtra("co_live_initiator_username");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.f111534g = stringExtra3;
        this.f111535h = getIntent().getIntExtra("co_live_settlement_mode", 0);
        java.lang.String stringExtra4 = getIntent().getStringExtra("co_live_finder_username");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        this.f111536i = stringExtra4;
        com.tencent.mars.xlog.Log.i("Finder.CoLiveInvitationConfirmUI", "initData: invitationId=" + this.f111531d + ", initiatorNickname=" + this.f111532e + ", initiatorHeadUrl=" + this.f111533f + ", initiatorUsername=" + this.f111534g + ", settlementMode=" + this.f111535h + ", finderUsername=" + this.f111536i);
        setMMTitle("");
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478491c));
        setBackGroundColorResource(com.tencent.mm.R.color.f478491c);
        hideActionbarLine();
        setBackBtn(new re2.k0(this), com.tencent.mm.R.raw.icons_filled_close_regular);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.stb);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f111537m = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.stl);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f111538n = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.stp);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.stg);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f111539o = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.sto);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f111540p = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.sta);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f111541q = findViewById6;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.std);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f111542r = findViewById7;
        findViewById7.setOnClickListener(new re2.l0(this));
        android.view.View view = this.f111541q;
        if (view == null) {
            kotlin.jvm.internal.o.o("acceptBtn");
            throw null;
        }
        view.setOnClickListener(new re2.m0(this));
        if (this.f111533f.length() > 0) {
            mn2.g1 g1Var = mn2.g1.f329975a;
            vo0.d a17 = g1Var.a();
            mn2.q3 q3Var = new mn2.q3(this.f111533f, com.tencent.mm.plugin.finder.storage.y90.f128356f);
            android.widget.ImageView imageView = this.f111537m;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("avatarIv");
                throw null;
            }
            a17.c(q3Var, imageView, g1Var.h(mn2.f1.f329962p));
        }
        android.widget.TextView textView = this.f111538n;
        if (textView == null) {
            kotlin.jvm.internal.o.o("nicknameTv");
            throw null;
        }
        textView.setText(this.f111532e);
        java.lang.String string = getString(com.tencent.mm.R.string.onj);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String str = getString(com.tencent.mm.R.string.ong) + ' ' + string;
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        int L = r26.n0.L(str, string, 0, false, 6, null);
        if (L >= 0 && string.length() + L <= str.length()) {
            spannableString.setSpan(new re2.j0(this), L, string.length() + L, 33);
        }
        android.widget.TextView textView2 = this.f111539o;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("descTv");
            throw null;
        }
        textView2.setText(spannableString);
        android.widget.TextView textView3 = this.f111539o;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("descTv");
            throw null;
        }
        textView3.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        int i17 = this.f111535h;
        com.tencent.mm.plugin.finder.live.widget.d80 d80Var = com.tencent.mm.plugin.finder.live.widget.d80.f118087e;
        java.lang.String string2 = i17 == 1 ? getString(com.tencent.mm.R.string.onk) : getString(com.tencent.mm.R.string.onl);
        kotlin.jvm.internal.o.d(string2);
        android.widget.TextView textView4 = this.f111540p;
        if (textView4 != null) {
            textView4.setText(string2);
        } else {
            kotlin.jvm.internal.o.o("settlementTv");
            throw null;
        }
    }
}

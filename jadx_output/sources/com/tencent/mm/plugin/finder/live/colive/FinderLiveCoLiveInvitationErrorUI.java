package com.tencent.mm.plugin.finder.live.colive;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/colive/FinderLiveCoLiveInvitationErrorUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class FinderLiveCoLiveInvitationErrorUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f111544n = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f111545d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.button.WeButton f111546e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.button.WeButton f111547f;

    /* renamed from: g, reason: collision with root package name */
    public int f111548g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f111549h;

    /* renamed from: i, reason: collision with root package name */
    public int f111550i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f111551m;

    static {
        kz5.p1.f(-200224, -200231, -200030, -200446, -200447, -200452, -200453, -200454, -200455, -200456, -200457, -200458, -200459, -200460, -200008, -200461);
    }

    public final void T6(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("Finder.CoLiveInvitationErrorUI", "dismissAsCanceled: from=" + str);
        setResult(0);
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.e9m;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cb  */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r12, int r13, android.content.Intent r14) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.colive.FinderLiveCoLiveInvitationErrorUI.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        T6("backPressed");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String string;
        super.onCreate(bundle);
        this.f111548g = getIntent().getIntExtra("co_live_error_code", 0);
        this.f111549h = getIntent().getBooleanExtra("co_live_use_close_icon", false);
        this.f111550i = getIntent().getIntExtra("co_live_user_flag", 0);
        this.f111551m = getIntent().getStringExtra("co_live_spam_jump_url");
        setMMTitle("");
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478491c));
        setBackGroundColorResource(com.tencent.mm.R.color.f478491c);
        hideActionbarLine();
        if (this.f111549h) {
            setBackBtn(new re2.t0(this), com.tencent.mm.R.raw.icons_filled_close);
        } else {
            setBackBtn(new re2.u0(this));
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.stj);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f111545d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.sti);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f111546e = (com.tencent.mm.ui.widget.button.WeButton) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.sth);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f111547f = (com.tencent.mm.ui.widget.button.WeButton) findViewById3;
        android.widget.TextView textView = this.f111545d;
        if (textView == null) {
            kotlin.jvm.internal.o.o("errorDescTv");
            throw null;
        }
        com.tencent.mm.ui.fk.a(textView);
        com.tencent.mm.ui.widget.button.WeButton weButton = this.f111546e;
        if (weButton == null) {
            kotlin.jvm.internal.o.o("cancelBtn");
            throw null;
        }
        weButton.setOnClickListener(new re2.v0(this));
        java.lang.String stringExtra = getIntent().getStringExtra("co_live_error_desc");
        java.lang.String str = stringExtra != null ? stringExtra : "";
        com.tencent.mars.xlog.Log.i("Finder.CoLiveInvitationErrorUI", "bindData: errorCode=" + this.f111548g + ", userFlag=" + this.f111550i + ", spamJumpUrl=" + this.f111551m);
        android.widget.TextView textView2 = this.f111545d;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("errorDescTv");
            throw null;
        }
        textView2.setText(str);
        int i17 = this.f111548g;
        boolean z17 = true;
        if (i17 != -200460) {
            if (i17 == -200008) {
                java.lang.String str2 = this.f111551m;
                if (!(str2 == null || str2.length() == 0)) {
                    string = getString(com.tencent.mm.R.string.onh);
                }
            }
            string = null;
        } else {
            string = getString(com.tencent.mm.R.string.onh);
        }
        if (string != null && string.length() != 0) {
            z17 = false;
        }
        if (z17) {
            com.tencent.mm.ui.widget.button.WeButton weButton2 = this.f111547f;
            if (weButton2 != null) {
                weButton2.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.o.o("actionBtn");
                throw null;
            }
        }
        com.tencent.mm.ui.widget.button.WeButton weButton3 = this.f111547f;
        if (weButton3 == null) {
            kotlin.jvm.internal.o.o("actionBtn");
            throw null;
        }
        weButton3.setVisibility(0);
        com.tencent.mm.ui.widget.button.WeButton weButton4 = this.f111547f;
        if (weButton4 == null) {
            kotlin.jvm.internal.o.o("actionBtn");
            throw null;
        }
        weButton4.setText(string);
        com.tencent.mm.ui.widget.button.WeButton weButton5 = this.f111547f;
        if (weButton5 != null) {
            weButton5.setOnClickListener(new re2.s0(this, i17));
        } else {
            kotlin.jvm.internal.o.o("actionBtn");
            throw null;
        }
    }
}

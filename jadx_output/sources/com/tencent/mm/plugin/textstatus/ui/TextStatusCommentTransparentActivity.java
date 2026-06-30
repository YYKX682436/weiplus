package com.tencent.mm.plugin.textstatus.ui;

@db5.a(35)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusCommentTransparentActivity;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "com/tencent/mm/plugin/textstatus/ui/i5", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes10.dex */
public final class TextStatusCommentTransparentActivity extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.textstatus.ui.i5 f173501d = new com.tencent.mm.plugin.textstatus.ui.i5(null);

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        setResult(-1);
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).postDelayed(new com.tencent.mm.plugin.textstatus.ui.j5(this), 400L);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).oj(this);
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).postDelayed(new com.tencent.mm.plugin.textstatus.ui.k5(this), 400L);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        o25.n1.f(this);
        super.onCreate(bundle);
        setActionbarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(1792);
        vj5.o.e(getWindow());
        setNavigationbarColor(getResources().getColor(com.tencent.mm.R.color.a9e));
        setMMTitle("");
        hideActionbarLine();
        hideActionBarOperationArea();
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
        getWindow().setSoftInputMode(48);
        ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Zi(this, new o04.e(pj4.p0.class, 9, true));
        pj4.p0 p0Var = (pj4.p0) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(this, 9, pj4.p0.class);
        if (p0Var != null) {
            p0Var.f355242m = getIntent().getIntExtra("KEY_CURRENT_SCENE", 0);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        java.lang.String stringExtra = getIntent().getStringExtra("KEY_USER_NAME");
        java.lang.String str = stringExtra == null ? "" : stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("KEY_STATUS_ID");
        java.lang.String str2 = stringExtra2 == null ? "" : stringExtra2;
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).postUI(new com.tencent.mm.plugin.textstatus.ui.m5(getIntent().getIntExtra("KEY_ACTION", 0), this, str, str2, getIntent().getBooleanExtra("KEY_IS_EXPIRED", false), getIntent().getLongExtra("KEY_REF_COMMENT_ID", 0L)));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, al5.f3
    public void onSwipeBack() {
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).oj(this);
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).postDelayed(new com.tencent.mm.plugin.textstatus.ui.n5(this), 400L);
    }
}

package com.tencent.mm.recovery.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/recovery/ui/RecoveryToolsUI;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "recovery_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class RecoveryToolsUI extends androidx.appcompat.app.AppCompatActivity {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f192186i = 0;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f192187d = jz5.h.b(new c55.h(this));

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f192188e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ProgressBar f192189f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f192190g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f192191h;

    public final void O6() {
        android.widget.ProgressBar progressBar = this.f192189f;
        if (progressBar == null) {
            kotlin.jvm.internal.o.o("saveLogToDownloadDirProgressBar");
            throw null;
        }
        progressBar.setVisibility(0);
        nz5.b.a(false, false, null, "recovery-io", 0, new c55.l(this), 23, null);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.tencent.recovery.wx.R.layout.activity_recovery_tools_ui);
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
        ((android.widget.Button) findViewById(com.tencent.recovery.wx.R.id.btn_forward_logs)).setOnClickListener(new c55.f((android.widget.ProgressBar) findViewById(com.tencent.recovery.wx.R.id.pb_forward_logs_pending), this, (android.widget.TextView) findViewById(com.tencent.recovery.wx.R.id.tv_forward_logs_status), (android.widget.TextView) findViewById(com.tencent.recovery.wx.R.id.tv_forward_logs_error)));
        android.view.View findViewById = findViewById(com.tencent.recovery.wx.R.id.btn_save_logs_to_download_dir);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f192188e = (android.widget.Button) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.recovery.wx.R.id.pb_save_logs_to_download_dir_pending);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f192189f = (android.widget.ProgressBar) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.recovery.wx.R.id.tv_save_logs_to_download_dir_status);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f192190g = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.recovery.wx.R.id.tv_save_logs_to_download_dir_error);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f192191h = (android.widget.TextView) findViewById4;
        android.widget.Button button = this.f192188e;
        if (button != null) {
            button.setOnClickListener(new c55.g(this));
        } else {
            kotlin.jvm.internal.o.o("saveLogToDownloadDirButton");
            throw null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        if (i17 != 1) {
            super.onRequestPermissionsResult(i17, permissions, grantResults);
            return;
        }
        java.lang.Integer M = kz5.z.M(grantResults);
        if (M != null && M.intValue() == 0) {
            O6();
            return;
        }
        android.widget.TextView textView = this.f192190g;
        if (textView != null) {
            textView.setText(getString(com.tencent.recovery.wx.R.string.recovery_msg_no_permission_write_download_dir));
        } else {
            kotlin.jvm.internal.o.o("saveLogToDownloadDirStatus");
            throw null;
        }
    }
}

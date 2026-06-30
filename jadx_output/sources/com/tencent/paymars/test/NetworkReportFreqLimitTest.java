package com.tencent.paymars.test;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b#\u0010$J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0005R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012R\"\u0010\u001d\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u000e\u001a\u0004\b\u001e\u0010\u0010\"\u0004\b\u001f\u0010\u0012R\"\u0010 \u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019¨\u0006%"}, d2 = {"Lcom/tencent/paymars/test/NetworkReportFreqLimitTest;", "Landroid/app/Activity;", "Landroid/view/View$OnClickListener;", "Landroid/os/Bundle;", "savedInstanceState", "Ljz5/f0;", "onCreate", "Landroid/view/View;", "view", "onClick", "onKVReport", "onIDKeyReprot", "Landroid/widget/EditText;", "et_kv_id", "Landroid/widget/EditText;", "getEt_kv_id", "()Landroid/widget/EditText;", "setEt_kv_id", "(Landroid/widget/EditText;)V", "Landroid/widget/Button;", "bt_kv", "Landroid/widget/Button;", "getBt_kv", "()Landroid/widget/Button;", "setBt_kv", "(Landroid/widget/Button;)V", "et_id", "getEt_id", "setEt_id", "et_key", "getEt_key", "setEt_key", "bt_id", "getBt_id", "setBt_id", "<init>", "()V", "plugin-report_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class NetworkReportFreqLimitTest extends com.tencent.mm.hellhoundlib.activities.HellActivity implements android.view.View.OnClickListener {
    public android.widget.Button bt_id;
    public android.widget.Button bt_kv;
    public android.widget.EditText et_id;
    public android.widget.EditText et_key;
    public android.widget.EditText et_kv_id;

    public final android.widget.Button getBt_id() {
        android.widget.Button button = this.bt_id;
        if (button != null) {
            return button;
        }
        kotlin.jvm.internal.o.o("bt_id");
        throw null;
    }

    public final android.widget.Button getBt_kv() {
        android.widget.Button button = this.bt_kv;
        if (button != null) {
            return button;
        }
        kotlin.jvm.internal.o.o("bt_kv");
        throw null;
    }

    public final android.widget.EditText getEt_id() {
        android.widget.EditText editText = this.et_id;
        if (editText != null) {
            return editText;
        }
        kotlin.jvm.internal.o.o("et_id");
        throw null;
    }

    public final android.widget.EditText getEt_key() {
        android.widget.EditText editText = this.et_key;
        if (editText != null) {
            return editText;
        }
        kotlin.jvm.internal.o.o("et_key");
        throw null;
    }

    public final android.widget.EditText getEt_kv_id() {
        android.widget.EditText editText = this.et_kv_id;
        if (editText != null) {
            return editText;
        }
        kotlin.jvm.internal.o.o("et_kv_id");
        throw null;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.u8e) {
            onKVReport();
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.u3_) {
            onIDKeyReprot();
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.tencent.mm.R.layout.emt);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.u8f);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        setEt_kv_id((android.widget.EditText) findViewById);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.u8e);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        setBt_kv((android.widget.Button) findViewById2);
        getBt_kv().setOnClickListener(this);
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.h7x);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        setEt_id((android.widget.EditText) findViewById3);
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.u87);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        setEt_key((android.widget.EditText) findViewById4);
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.u3_);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        setBt_id((android.widget.Button) findViewById5);
        getBt_id().setOnClickListener(this);
    }

    public final void onIDKeyReprot() {
        java.lang.String obj = getEt_id().getText().toString();
        java.lang.String obj2 = getEt_key().getText().toString();
        for (int i17 = 0; i17 < 11; i17++) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(java.lang.Long.parseLong(obj), java.lang.Long.parseLong(obj2), 1L, true);
        }
    }

    public final void onKVReport() {
        java.lang.String obj = getEt_kv_id().getText().toString();
        for (int i17 = 0; i17 < 11; i17++) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.f(java.lang.Integer.parseInt(obj), "1,1", true, true);
        }
    }

    public final void setBt_id(android.widget.Button button) {
        kotlin.jvm.internal.o.g(button, "<set-?>");
        this.bt_id = button;
    }

    public final void setBt_kv(android.widget.Button button) {
        kotlin.jvm.internal.o.g(button, "<set-?>");
        this.bt_kv = button;
    }

    public final void setEt_id(android.widget.EditText editText) {
        kotlin.jvm.internal.o.g(editText, "<set-?>");
        this.et_id = editText;
    }

    public final void setEt_key(android.widget.EditText editText) {
        kotlin.jvm.internal.o.g(editText, "<set-?>");
        this.et_key = editText;
    }

    public final void setEt_kv_id(android.widget.EditText editText) {
        kotlin.jvm.internal.o.g(editText, "<set-?>");
        this.et_kv_id = editText;
    }
}

package com.tencent.mm.plugin.textstatus.ui;

@db5.a(35)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusTransparentActivity;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes11.dex */
public final class TextStatusTransparentActivity extends com.tencent.mm.ui.MMActivity {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f173701g = 0;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f173702d = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.ng(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f173703e = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.og(this));

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f173704f = "ACTION_SHOW_DISABLE_TIPS_DIALOG";

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        android.os.ResultReceiver resultReceiver = (android.os.ResultReceiver) ((jz5.n) this.f173702d).getValue();
        if (resultReceiver != null) {
            resultReceiver.send(0, null);
        }
        if (kotlin.jvm.internal.o.b(this.f173704f, "ACTION_SHOW_DISABLE_TIPS_DIALOG")) {
            qj4.s sVar = qj4.s.f363958a;
            java.lang.Object value = ((jz5.n) this.f173703e).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            sVar.k((bi4.d1) value, 7L);
        }
        overridePendingTransition(0, 0);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        o25.n1.f(this);
        super.onCreate(bundle);
        setActionbarColor(0);
        setMMTitle("");
        hideActionbarLine();
        hideActionBarOperationArea();
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
        java.lang.String stringExtra = getIntent().getStringExtra("INTENT_KEY_ACTION");
        if (stringExtra == null) {
            stringExtra = "ACTION_SHOW_DISABLE_TIPS_DIALOG";
        }
        this.f173704f = stringExtra;
        if (!kotlin.jvm.internal.o.b(stringExtra, "ACTION_SHOW_DISABLE_TIPS_DIALOG")) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TextStatus.TextStatusTransparentActivity", "onCreate: action error :%s", this.f173704f);
            return;
        }
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(this);
        u1Var.g(getString(com.tencent.mm.R.string.jvb));
        u1Var.a(true);
        u1Var.l(new com.tencent.mm.plugin.textstatus.ui.pg(this));
        u1Var.e(new com.tencent.mm.plugin.textstatus.ui.qg(this));
        u1Var.q(false);
    }
}

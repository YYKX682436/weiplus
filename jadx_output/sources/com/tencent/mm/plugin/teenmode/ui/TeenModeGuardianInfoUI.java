package com.tencent.mm.plugin.teenmode.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/teenmode/ui/TeenModeGuardianInfoUI;", "Lcom/tencent/mm/ui/MMWizardActivity;", "<init>", "()V", "plugin-teenmode_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class TeenModeGuardianInfoUI extends com.tencent.mm.ui.MMWizardActivity {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f172897g = 0;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f172898e = jz5.h.b(new com.tencent.mm.plugin.teenmode.ui.u5(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f172899f = jz5.h.b(new com.tencent.mm.plugin.teenmode.ui.t5(this));

    public static final void Z6(com.tencent.mm.plugin.teenmode.ui.TeenModeGuardianInfoUI teenModeGuardianInfoUI, java.lang.String str) {
        android.widget.TextView textView = (android.widget.TextView) teenModeGuardianInfoUI.findViewById(com.tencent.mm.R.id.dhj);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cya;
    }

    @Override // com.tencent.mm.ui.MMWizardActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.kao);
        button.setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.v5(this));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f484050cu2);
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_teenmode_reset_password_optimize, false);
        if (fj6) {
            textView.setText(getResources().getString(com.tencent.mm.R.string.jtd));
        }
        android.widget.ScrollView scrollView = (android.widget.ScrollView) findViewById(com.tencent.mm.R.id.mcm);
        com.tencent.mm.ui.widget.InputPanelLinearLayout inputPanelLinearLayout = (com.tencent.mm.ui.widget.InputPanelLinearLayout) findViewById(com.tencent.mm.R.id.hdf);
        inputPanelLinearLayout.e(new com.tencent.mm.plugin.teenmode.ui.x5(button, this, inputPanelLinearLayout, scrollView));
        jz5.g gVar = this.f172898e;
        com.tencent.mm.ui.widget.MMClearEditText[] mMClearEditTextArr = {(com.tencent.mm.ui.widget.MMClearEditText) ((jz5.n) gVar).getValue(), (com.tencent.mm.ui.widget.MMClearEditText) ((jz5.n) this.f172899f).getValue()};
        for (int i17 = 0; i17 < 2; i17++) {
            mMClearEditTextArr[i17].addTextChangedListener(new com.tencent.mm.plugin.teenmode.ui.y5(button, this));
        }
        if (!fj6) {
            ((com.tencent.mm.ui.widget.MMClearEditText) ((jz5.n) gVar).getValue()).requestFocus();
        }
        setBackBtn(new com.tencent.mm.plugin.teenmode.ui.z5(this));
        ((vh4.t1) i95.n0.c(vh4.t1.class)).T(12);
    }
}

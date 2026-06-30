package com.tencent.mm.plugin.setting.ui.fixtools;

@db5.a(3)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/fixtools/FixToolsFileListUI;", "Lcom/tencent/mm/ui/MMWizardActivity;", "<init>", "()V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class FixToolsFileListUI extends com.tencent.mm.ui.MMWizardActivity {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f160063e = 0;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bal;
    }

    @Override // com.tencent.mm.ui.MMWizardActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.f_v);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.gt6);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.ngc);
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.gt_);
        findViewById.setOnClickListener(new o14.f(this));
        findViewById3.setOnClickListener(new o14.g(this));
        findViewById2.setOnClickListener(new o14.h(this));
        setBackBtn(new o14.i(this));
    }
}

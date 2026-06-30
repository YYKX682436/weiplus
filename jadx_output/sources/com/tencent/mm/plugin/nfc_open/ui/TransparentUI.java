package com.tencent.mm.plugin.nfc_open.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/nfc_open/ui/TransparentUI;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public class TransparentUI extends androidx.appcompat.app.AppCompatActivity {
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        setTheme(com.tencent.mm.R.style.f494400m2);
        super.onCreate(bundle);
        com.tencent.mm.ui.bk.k0(getWindow());
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        overridePendingTransition(0, 0);
    }
}

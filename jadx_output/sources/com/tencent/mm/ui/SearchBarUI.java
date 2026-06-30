package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public abstract class SearchBarUI extends com.tencent.mm.ui.BaseActivity implements com.tencent.mm.ui.hh {

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.ui.ih f197055z;

    @Override // com.tencent.mm.ui.hh
    public void onClickBackBtn(android.view.View view) {
        finish();
    }

    @Override // com.tencent.mm.ui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        O6(0, 0, "", new com.tencent.mm.ui.ch(this), null, com.tencent.mm.ui.r1.SEARCH);
        Q6(new com.tencent.mm.ui.dh(this), 0, com.tencent.mm.ui.p1.BACK);
    }
}

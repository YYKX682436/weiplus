package com.tencent.mm.ui;

/* loaded from: classes12.dex */
public class ClearCacheUI extends com.tencent.mm.ui.MMBaseActivity {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f196631e = 0;

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        db5.e1.C(this, getIntent().getStringExtra("key_message"), getString(com.tencent.mm.R.string.f490923b95), getString(com.tencent.mm.R.string.f490922b94), getString(com.tencent.mm.R.string.f490920b92), false, new com.tencent.mm.ui.d2(this, getIntent().getLongExtra("key_mask", 0L)), new com.tencent.mm.ui.e2(this));
    }
}

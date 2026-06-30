package com.tencent.toybrick.ui;

/* loaded from: classes7.dex */
public abstract class BaseToyUI<T> extends com.tencent.mm.ui.BaseActivity {

    /* renamed from: z, reason: collision with root package name */
    public final java.util.HashMap f215697z = new java.util.HashMap();

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f215697z.clear();
    }
}

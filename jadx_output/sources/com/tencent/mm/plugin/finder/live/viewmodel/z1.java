package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class z1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.e2 f117556d;

    public z1(com.tencent.mm.plugin.finder.live.viewmodel.e2 e2Var) {
        this.f117556d = e2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.viewmodel.e2 e2Var = this.f117556d;
        android.widget.EditText editText = e2Var.f117063n;
        if (editText != null) {
            editText.requestFocus();
        }
        androidx.appcompat.app.AppCompatActivity appCompatActivity = e2Var.f117056d;
        com.tencent.mm.ui.MMActivity mMActivity = appCompatActivity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) appCompatActivity : null;
        if (mMActivity != null) {
            mMActivity.showVKB();
        }
    }
}

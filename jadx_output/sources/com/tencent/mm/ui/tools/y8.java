package com.tencent.mm.ui.tools;

/* loaded from: classes12.dex */
public class y8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.FragmentActivity f210926d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f210927e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.c9 f210928f;

    public y8(com.tencent.mm.ui.tools.c9 c9Var, androidx.fragment.app.FragmentActivity fragmentActivity, boolean z17) {
        this.f210928f = c9Var;
        this.f210926d = fragmentActivity;
        this.f210927e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.fragment.app.FragmentActivity fragmentActivity = this.f210926d;
        if (fragmentActivity == null || fragmentActivity.isFinishing()) {
            com.tencent.mars.xlog.Log.w(this.f210928f.f210316a, "want to expand search view, but activity status error");
        } else if (this.f210927e) {
            fragmentActivity.supportInvalidateOptionsMenu();
        }
    }
}

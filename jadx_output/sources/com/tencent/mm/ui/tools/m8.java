package com.tencent.mm.ui.tools;

/* loaded from: classes12.dex */
public class m8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.FragmentActivity f210578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f210579e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.c9 f210580f;

    public m8(com.tencent.mm.ui.tools.c9 c9Var, androidx.fragment.app.FragmentActivity fragmentActivity, boolean z17) {
        this.f210580f = c9Var;
        this.f210578d = fragmentActivity;
        this.f210579e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.fragment.app.FragmentActivity fragmentActivity = this.f210578d;
        if (fragmentActivity == null || fragmentActivity.isFinishing()) {
            com.tencent.mars.xlog.Log.w(this.f210580f.f210316a, "want to collapse search view, but activity status error");
        } else if (this.f210579e) {
            fragmentActivity.supportInvalidateOptionsMenu();
        }
    }
}

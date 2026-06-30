package com.tencent.mm.ui.tools;

/* loaded from: classes12.dex */
public class r8 implements com.tencent.mm.ui.tools.z8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.FragmentActivity f210671a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.Menu f210672b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.c9 f210673c;

    public r8(com.tencent.mm.ui.tools.c9 c9Var, androidx.fragment.app.FragmentActivity fragmentActivity, android.view.Menu menu) {
        this.f210673c = c9Var;
        this.f210671a = fragmentActivity;
        this.f210672b = menu;
    }

    @Override // com.tencent.mm.ui.tools.z8
    public void collapseActionView() {
        android.view.Menu menu = this.f210672b;
        com.tencent.mm.ui.tools.c9 c9Var = this.f210673c;
        androidx.fragment.app.FragmentActivity fragmentActivity = this.f210671a;
        c9Var.d(fragmentActivity, true, c9Var.f(menu, fragmentActivity));
    }

    @Override // com.tencent.mm.ui.tools.z8
    public void expandActionView() {
        android.view.Menu menu = this.f210672b;
        com.tencent.mm.ui.tools.c9 c9Var = this.f210673c;
        androidx.fragment.app.FragmentActivity fragmentActivity = this.f210671a;
        c9Var.e(fragmentActivity, true, c9Var.f(menu, fragmentActivity));
    }
}

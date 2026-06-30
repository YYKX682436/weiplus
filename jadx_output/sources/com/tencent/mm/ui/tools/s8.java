package com.tencent.mm.ui.tools;

/* loaded from: classes12.dex */
public class s8 implements com.tencent.mm.ui.tools.z8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.FragmentActivity f210730a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.Menu f210731b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.c9 f210732c;

    public s8(com.tencent.mm.ui.tools.c9 c9Var, androidx.fragment.app.FragmentActivity fragmentActivity, android.view.Menu menu) {
        this.f210732c = c9Var;
        this.f210730a = fragmentActivity;
        this.f210731b = menu;
    }

    @Override // com.tencent.mm.ui.tools.z8
    public void collapseActionView() {
        android.view.Menu menu = this.f210731b;
        com.tencent.mm.ui.tools.c9 c9Var = this.f210732c;
        androidx.fragment.app.FragmentActivity fragmentActivity = this.f210730a;
        c9Var.d(fragmentActivity, true, c9Var.f(menu, fragmentActivity));
    }

    @Override // com.tencent.mm.ui.tools.z8
    public void expandActionView() {
        android.view.Menu menu = this.f210731b;
        com.tencent.mm.ui.tools.c9 c9Var = this.f210732c;
        androidx.fragment.app.FragmentActivity fragmentActivity = this.f210730a;
        c9Var.e(fragmentActivity, true, c9Var.f(menu, fragmentActivity));
    }
}

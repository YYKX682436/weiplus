package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class o3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.q3 f174141d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f174142e;

    public o3(com.tencent.mm.plugin.textstatus.ui.q3 q3Var, android.view.ViewGroup viewGroup) {
        this.f174141d = q3Var;
        this.f174142e = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.textstatus.ui.q3 q3Var = this.f174141d;
        com.tencent.mm.plugin.textstatus.ui.LongTextView longTextView = q3Var.f174198o;
        if (longTextView == null) {
            return;
        }
        longTextView.setPaddingTopAfterExpand(this.f174142e.getHeight() + ym5.x.a(q3Var.f174197n, 16.0f));
    }
}

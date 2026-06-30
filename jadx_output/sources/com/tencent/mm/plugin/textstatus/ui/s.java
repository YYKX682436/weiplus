package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class s implements bk4.l1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.LongTextView f174253a;

    public s(com.tencent.mm.plugin.textstatus.ui.LongTextView longTextView) {
        this.f174253a = longTextView;
    }

    @Override // bk4.l1
    public void onChange(int i17) {
        bk4.l1 l1Var = this.f174253a.f173446r;
        if (l1Var != null) {
            l1Var.onChange(i17);
        }
    }
}

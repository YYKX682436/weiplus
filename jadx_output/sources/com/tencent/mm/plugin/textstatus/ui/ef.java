package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class ef extends androidx.fragment.app.e2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.tf f173850d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef(com.tencent.mm.plugin.textstatus.ui.tf tfVar, androidx.fragment.app.FragmentManager fm6) {
        super(fm6, 0);
        kotlin.jvm.internal.o.g(fm6, "fm");
        this.f173850d = tfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.mm.plugin.textstatus.ui.ff a(int r14) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.textstatus.ui.ef.a(int):com.tencent.mm.plugin.textstatus.ui.ff");
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return ((java.lang.Number) ((jz5.n) this.f173850d.f174332n).getValue()).intValue();
    }

    @Override // androidx.fragment.app.e2
    public androidx.fragment.app.Fragment getItem(int i17) {
        com.tencent.mm.plugin.textstatus.ui.tf tfVar = this.f173850d;
        return i17 == 0 ? (androidx.fragment.app.Fragment) ((jz5.n) tfVar.f174326e).getValue() : (androidx.fragment.app.Fragment) ((jz5.n) tfVar.f174327f).getValue();
    }

    @Override // androidx.viewpager.widget.a
    public java.lang.CharSequence getPageTitle(int i17) {
        com.tencent.mm.plugin.textstatus.ui.tf tfVar = this.f173850d;
        return i17 != 0 ? i17 != 1 ? java.lang.String.valueOf(i17) : tfVar.getString(com.tencent.mm.R.string.jwo) : tfVar.getString(com.tencent.mm.R.string.f493372jx3);
    }
}

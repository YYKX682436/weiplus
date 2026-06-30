package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes3.dex */
public final class k4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f154381d;

    public k4(java.lang.CharSequence charSequence) {
        this.f154381d = charSequence;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (i17 == 0) {
            com.tencent.mm.sdk.platformtools.b0.e(this.f154381d);
        }
    }
}

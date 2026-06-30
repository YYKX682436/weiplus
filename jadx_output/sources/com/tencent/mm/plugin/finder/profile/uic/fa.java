package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class fa implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f123708d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f123709e;

    public fa(com.tencent.mm.plugin.finder.profile.uic.ob obVar, boolean z17) {
        this.f123708d = obVar;
        this.f123709e = z17;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 10011) {
            this.f123708d.R6(!this.f123709e, true);
        }
    }
}

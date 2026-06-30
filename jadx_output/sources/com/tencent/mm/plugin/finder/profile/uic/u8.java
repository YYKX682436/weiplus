package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class u8 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f124260d;

    public u8(com.tencent.mm.plugin.finder.profile.uic.ob obVar) {
        this.f124260d = obVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (i17 == 0) {
            com.tencent.mm.sdk.platformtools.b0.e(this.f124260d.f7().getText());
        }
    }
}

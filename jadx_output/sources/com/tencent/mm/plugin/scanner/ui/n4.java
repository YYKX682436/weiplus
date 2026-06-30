package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes9.dex */
public class n4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.VcardContactUI f159597d;

    public n4(com.tencent.mm.plugin.scanner.ui.VcardContactUI vcardContactUI) {
        this.f159597d = vcardContactUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f159597d.finish();
        return true;
    }
}

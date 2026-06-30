package com.tencent.mm.ui.contact;

/* loaded from: classes4.dex */
public class f4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.GroupCardSelectUI f206703d;

    public f4(com.tencent.mm.ui.contact.GroupCardSelectUI groupCardSelectUI) {
        this.f206703d = groupCardSelectUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f206703d.finish();
        return true;
    }
}

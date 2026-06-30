package com.tencent.mm.ui.contact;

/* loaded from: classes4.dex */
public class g4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.GroupCardSelectUI f206719d;

    public g4(com.tencent.mm.ui.contact.GroupCardSelectUI groupCardSelectUI) {
        this.f206719d = groupCardSelectUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.ui.contact.GroupCardSelectUI groupCardSelectUI = this.f206719d;
        intent.putExtra("Select_Conv_User", com.tencent.mm.sdk.platformtools.t8.c1(groupCardSelectUI.f206431o, ","));
        groupCardSelectUI.setResult(-1, intent);
        groupCardSelectUI.finish();
        return true;
    }
}

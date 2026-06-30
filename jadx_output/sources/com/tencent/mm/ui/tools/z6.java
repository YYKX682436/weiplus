package com.tencent.mm.ui.tools;

/* loaded from: classes9.dex */
public class z6 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.MMTextInputUI f210944d;

    public z6(com.tencent.mm.ui.tools.MMTextInputUI mMTextInputUI) {
        this.f210944d = mMTextInputUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.tools.MMTextInputUI mMTextInputUI = this.f210944d;
        mMTextInputUI.U6(mMTextInputUI.f210077d.getText());
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_result", mMTextInputUI.f210077d.getText());
        mMTextInputUI.setResult(-1, intent);
        mMTextInputUI.finish();
        return true;
    }
}

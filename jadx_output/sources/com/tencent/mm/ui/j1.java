package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class j1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.BaseActivity f208989d;

    public j1(com.tencent.mm.ui.BaseActivity baseActivity) {
        this.f208989d = baseActivity;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f208989d.finish();
        return true;
    }
}

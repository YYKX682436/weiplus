package com.tencent.mm.plugin.webwx.ui;

/* loaded from: classes.dex */
public class p0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webwx.ui.WebWeiXinIntroductionUI f188057d;

    public p0(com.tencent.mm.plugin.webwx.ui.WebWeiXinIntroductionUI webWeiXinIntroductionUI) {
        this.f188057d = webWeiXinIntroductionUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f188057d.finish();
        return true;
    }
}

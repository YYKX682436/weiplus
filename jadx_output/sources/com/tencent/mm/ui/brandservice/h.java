package com.tencent.mm.ui.brandservice;

/* loaded from: classes8.dex */
public class h implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.brandservice.BrandServiceNotifyUI f198048d;

    public h(com.tencent.mm.ui.brandservice.BrandServiceNotifyUI brandServiceNotifyUI) {
        this.f198048d = brandServiceNotifyUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f198048d.finish();
        return true;
    }
}

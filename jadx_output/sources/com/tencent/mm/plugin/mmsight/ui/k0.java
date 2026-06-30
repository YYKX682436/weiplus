package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes7.dex */
public class k0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.MMSightRecordViewTestUI f149354d;

    public k0(com.tencent.mm.plugin.mmsight.ui.MMSightRecordViewTestUI mMSightRecordViewTestUI) {
        this.f149354d = mMSightRecordViewTestUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f149354d.finish();
        return false;
    }
}

package com.tencent.mm.plugin.voip.ui;

/* loaded from: classes.dex */
public final class z implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.ui.RepairerVoipFaceBeautyUI f177027d;

    public z(com.tencent.mm.plugin.voip.ui.RepairerVoipFaceBeautyUI repairerVoipFaceBeautyUI) {
        this.f177027d = repairerVoipFaceBeautyUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f177027d.finish();
        return true;
    }
}

package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class r4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderCropAvatarUI f129765d;

    public r4(com.tencent.mm.plugin.finder.ui.FinderCropAvatarUI finderCropAvatarUI) {
        this.f129765d = finderCropAvatarUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f129765d.finish();
        return true;
    }
}

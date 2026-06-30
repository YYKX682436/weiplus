package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class t2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.StatusAlbumUI f174307d;

    public t2(com.tencent.mm.plugin.textstatus.ui.StatusAlbumUI statusAlbumUI) {
        this.f174307d = statusAlbumUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        androidx.fragment.app.FragmentActivity activity = this.f174307d.getActivity();
        if (activity == null) {
            return true;
        }
        activity.finish();
        return true;
    }
}

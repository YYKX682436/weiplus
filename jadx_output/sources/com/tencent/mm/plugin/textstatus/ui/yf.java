package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes.dex */
public final class yf implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusPreviewFinderActivity f174463d;

    public yf(com.tencent.mm.plugin.textstatus.ui.TextStatusPreviewFinderActivity textStatusPreviewFinderActivity) {
        this.f174463d = textStatusPreviewFinderActivity;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f174463d.finish();
        return false;
    }
}

package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class n4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f129534d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderCropAvatarUI f129535e;

    public n4(android.view.View view, com.tencent.mm.plugin.finder.ui.FinderCropAvatarUI finderCropAvatarUI) {
        this.f129534d = view;
        this.f129535e = finderCropAvatarUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f129534d.setPadding(0, 0, 0, com.tencent.mm.ui.bl.c(this.f129535e.getContext()));
    }
}

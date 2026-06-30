package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class w4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderCropAvatarUI f129974d;

    public w4(com.tencent.mm.plugin.finder.ui.FinderCropAvatarUI finderCropAvatarUI) {
        this.f129974d = finderCropAvatarUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jz5.f0 f0Var;
        android.app.Dialog dialog = this.f129974d.F;
        if (dialog != null) {
            dialog.show();
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mm.plugin.finder.ui.FinderCropAvatarUI finderCropAvatarUI = this.f129974d;
            finderCropAvatarUI.F = db5.e1.Q(finderCropAvatarUI, finderCropAvatarUI.getString(com.tencent.mm.R.string.f490573yv), finderCropAvatarUI.getString(com.tencent.mm.R.string.f490604zq), true, false, com.tencent.mm.plugin.finder.ui.v4.f129941d);
        }
    }
}

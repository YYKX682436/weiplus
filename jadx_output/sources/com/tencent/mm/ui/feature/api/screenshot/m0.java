package com.tencent.mm.ui.feature.api.screenshot;

/* loaded from: classes.dex */
public final class m0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f208525d;

    public m0(android.app.Activity activity) {
        this.f208525d = activity;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        android.app.Activity activity = this.f208525d;
        g4Var.g(910524420, activity.getString(com.tencent.mm.R.string.o6s), com.tencent.mm.R.raw.icons_outlined_pencil);
        g4Var.g(910524424, activity.getString(com.tencent.mm.R.string.o6u), com.tencent.mm.R.raw.icons_outlined_download);
    }
}

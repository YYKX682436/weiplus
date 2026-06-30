package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class wd implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMNewPhotoEditUI f211222d;

    public wd(com.tencent.mm.ui.MMNewPhotoEditUI mMNewPhotoEditUI) {
        this.f211222d = mMNewPhotoEditUI;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.ui.MMNewPhotoEditUI mMNewPhotoEditUI = this.f211222d;
        g4Var.f(0, mMNewPhotoEditUI.getString(com.tencent.mm.R.string.i29));
        g4Var.f(1, mMNewPhotoEditUI.getString(com.tencent.mm.R.string.hjg));
        g4Var.f(2, mMNewPhotoEditUI.getString(com.tencent.mm.R.string.i89));
    }
}

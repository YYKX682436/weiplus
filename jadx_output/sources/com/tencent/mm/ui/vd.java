package com.tencent.mm.ui;

/* loaded from: classes10.dex */
public class vd implements qk.y7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMNewPhotoEditUI f211153a;

    public vd(com.tencent.mm.ui.MMNewPhotoEditUI mMNewPhotoEditUI) {
        this.f211153a = mMNewPhotoEditUI;
    }

    @Override // qk.y7
    public void a(qk.g6 g6Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMNewPhotoEditUI", "[onSelectedFeature] features:%s", g6Var.name());
    }

    @Override // qk.y7
    public void b(qk.g6 g6Var, int i17, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMNewPhotoEditUI", "[onSelectedDetailFeature] features:%s index:%s", g6Var.name(), java.lang.Integer.valueOf(i17));
    }

    @Override // qk.y7
    public void c(boolean z17) {
        com.tencent.mm.ui.MMNewPhotoEditUI mMNewPhotoEditUI = this.f211153a;
        if (z17) {
            mMNewPhotoEditUI.showVKB();
        } else {
            mMNewPhotoEditUI.hideVKB(mMNewPhotoEditUI.getContentView());
        }
    }
}

package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class j2 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.CropImageNewUI f210507a;

    public j2(com.tencent.mm.ui.tools.CropImageNewUI cropImageNewUI) {
        this.f210507a = cropImageNewUI;
    }

    @Override // db5.c1
    public void e(int i17) {
        if (i17 != 0) {
            return;
        }
        com.tencent.mm.ui.tools.CropImageNewUI cropImageNewUI = this.f210507a;
        db5.e1.u(cropImageNewUI, cropImageNewUI.getString(com.tencent.mm.R.string.f491021bm1, java.lang.Long.toString(com.tencent.mm.vfs.w6.k(cropImageNewUI.f210006o) / 1024)), cropImageNewUI.getString(com.tencent.mm.R.string.f490573yv), new com.tencent.mm.ui.tools.k2(cropImageNewUI), new com.tencent.mm.ui.tools.l2(cropImageNewUI));
    }
}

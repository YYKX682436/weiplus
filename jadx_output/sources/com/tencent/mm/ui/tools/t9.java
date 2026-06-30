package com.tencent.mm.ui.tools;

/* loaded from: classes11.dex */
public class t9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.y9 f210775d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f210776e;

    public t9(com.tencent.mm.ui.tools.ShareImgUI shareImgUI, com.tencent.mm.ui.tools.y9 y9Var, java.util.ArrayList arrayList) {
        this.f210775d = y9Var;
        this.f210776e = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.tools.ShareImgUI shareImgUI = ((com.tencent.mm.ui.tools.n9) this.f210775d).f210605a;
        java.util.ArrayList arrayList = this.f210776e;
        shareImgUI.f210160o = arrayList;
        if (arrayList == null || arrayList.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareImgUI", "launch : fail, filePathList is null");
            shareImgUI.e7(1);
            shareImgUI.finish();
            return;
        }
        java.util.Iterator it = shareImgUI.f210160o.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (com.tencent.mm.sdk.platformtools.y1.c(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ShareImgUI", "%s is not image", str);
                shareImgUI.e7(1);
                shareImgUI.finish();
                return;
            }
        }
        java.lang.String resolveType = shareImgUI.getIntent().resolveType(shareImgUI);
        if (resolveType == null || !resolveType.contains("image")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShareImgUI", "mime type is not image, try to set it");
            shareImgUI.getIntent().setDataAndType(shareImgUI.getIntent().getData(), "image/*");
        }
        com.tencent.mm.ui.tools.ShareImgUI.a7(shareImgUI, false);
    }
}

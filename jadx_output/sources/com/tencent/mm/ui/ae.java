package com.tencent.mm.ui;

/* loaded from: classes10.dex */
public class ae implements qk.p7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f197131a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMNewPhotoEditUI f197132b;

    public ae(com.tencent.mm.ui.MMNewPhotoEditUI mMNewPhotoEditUI, int i17) {
        this.f197132b = mMNewPhotoEditUI;
        this.f197131a = i17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0107, code lost:
    
        com.tencent.mm.ui.MMNewPhotoEditUI.T6(r0, r2);
        r0.W6(false);
        com.tencent.mm.ui.MMNewPhotoEditUI.U6(r0, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return;
     */
    @Override // qk.p7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.graphics.Bitmap r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.ae.a(android.graphics.Bitmap, boolean):void");
    }

    @Override // qk.p7
    public void onError(java.lang.Exception exc) {
        int i17 = com.tencent.mm.ui.MMNewPhotoEditUI.f196899t;
        com.tencent.mm.ui.MMNewPhotoEditUI mMNewPhotoEditUI = this.f197132b;
        mMNewPhotoEditUI.W6(false);
        com.tencent.mars.xlog.Log.e("MicroMsg.MMNewPhotoEditUI", "[onRefreshed] %s", exc);
        dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, mMNewPhotoEditUI.getResources().getString(com.tencent.mm.R.string.c1s), 1).show();
        mMNewPhotoEditUI.setResult(0);
        mMNewPhotoEditUI.finish();
    }
}

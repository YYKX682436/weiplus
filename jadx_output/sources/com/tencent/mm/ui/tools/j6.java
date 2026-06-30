package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public class j6 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f210512a;

    /* renamed from: b, reason: collision with root package name */
    public long f210513b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f210514c;

    public j6(java.lang.ref.WeakReference weakReference) {
        this.f210512a = weakReference;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery;
        removeMessages(message.what);
        java.lang.ref.WeakReference weakReference = this.f210512a;
        if (weakReference == null || (mMGestureGallery = (com.tencent.mm.ui.tools.MMGestureGallery) weakReference.get()) == null) {
            return;
        }
        int i17 = message.what;
        com.tencent.mm.sdk.platformtools.n3 n3Var = mMGestureGallery.L;
        if (i17 == 0) {
            if ((mMGestureGallery.B == 1 || this.f210514c) && mMGestureGallery.M != null) {
                n3Var.post(new com.tencent.mm.ui.tools.h6(this, mMGestureGallery));
            }
            mMGestureGallery.B = 0;
            return;
        }
        if (i17 != 1) {
            removeMessages(2);
            if (mMGestureGallery.N != null) {
                n3Var.post(new com.tencent.mm.ui.tools.i6(this, mMGestureGallery));
                return;
            }
            return;
        }
        com.tencent.mm.ui.tools.n5 n5Var = mMGestureGallery.K;
        if (n5Var == null || n5Var.f210600a) {
            mMGestureGallery.f210059h.removeMessages(1);
        } else {
            n5Var.a();
            sendEmptyMessageDelayed(message.what, this.f210513b);
        }
    }
}

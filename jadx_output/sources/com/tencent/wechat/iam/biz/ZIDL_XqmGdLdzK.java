package com.tencent.wechat.iam.biz;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class ZIDL_XqmGdLdzK {
    static {
        new java.util.concurrent.atomic.AtomicLong(0L);
    }

    private void ZIDL_AX(java.lang.Object obj, boolean z17) {
        ((com.tencent.wechat.iam.biz.e) obj).complete(z17);
    }

    private void ZIDL_BX(java.lang.Object obj, byte[] bArr) {
        ((com.tencent.wechat.iam.biz.d) obj).a(com.tencent.wechat.zidl2.ZidlUtil.mmpbMessageJniToJavaOptional(com.tencent.wechat.iam.biz.w1.f217801g, bArr));
    }

    private void ZIDL_CX(java.lang.Object obj, int i17) {
        ((com.tencent.wechat.iam.biz.b) obj).a(i17 != 0 ? i17 != 1 ? i17 != 2 ? null : com.tencent.wechat.iam.biz.h.CURRENT_INTERACTIVE_IDENTITY_PHOTO : com.tencent.wechat.iam.biz.h.CURRENT_INTERACTIVE_IDENTITY_BRAND : com.tencent.wechat.iam.biz.h.CURRENT_INTERACTIVE_IDENTITY_WX);
    }

    private void ZIDL_DX(java.lang.Object obj, boolean z17) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    private void ZIDL_EX(java.lang.Object obj, boolean z17) {
        ((com.tencent.wechat.iam.biz.c) obj).complete(z17);
    }

    private void ZIDL_FX(java.lang.Object obj, boolean z17) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    private void ZIDL_GX(java.lang.Object obj, boolean z17) {
        com.tencent.mm.plugin.profile.ui.tab.w6 w6Var = (com.tencent.mm.plugin.profile.ui.tab.w6) ((com.tencent.wechat.iam.biz.f) obj);
        com.tencent.mm.plugin.appbrand.utils.d5.b(new com.tencent.mm.plugin.profile.ui.tab.v6(w6Var.f154686a, w6Var.f154687b, z17));
    }

    public native void ZIDL_AV(long j17, java.lang.Object obj, int i17);

    public native void ZIDL_BV(long j17, java.lang.Object obj, int i17);

    public native void ZIDL_CV(long j17, java.lang.Object obj);

    public native void ZIDL_DV(long j17, java.lang.Object obj);

    public native void ZIDL_EV(long j17, java.lang.Object obj);

    public native void ZIDL_FV(long j17, java.lang.Object obj, int i17);

    public native void ZIDL_GV(long j17, java.lang.Object obj, int i17);

    public native void ZIDL_H(long j17, int i17, byte[] bArr);

    public native void ZIDL_XqmGdLdzC(java.lang.Object obj, java.lang.Object obj2, java.lang.String str, java.lang.String str2);
}

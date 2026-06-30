package com.tencent.wechat.mm.brand_service;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes11.dex */
public class ZIDL_q1bTCHfwK {
    static {
        new java.util.concurrent.atomic.AtomicLong(0L);
    }

    private void ZIDL_AX(java.lang.Object obj) {
        java.lang.Object m521constructorimpl;
        java.lang.Integer h17;
        java.lang.String str;
        ow.j jVar = (ow.j) ((com.tencent.wechat.mm.brand_service.c0) obj);
        jVar.getClass();
        e31.k a17 = e31.n.f247087a.a("name_biz");
        if (a17 != null) {
            g31.l lVar = (g31.l) a17;
            if (lVar.f268094g) {
                boolean z17 = false;
                k31.a aVar = lVar.f268088a;
                if (aVar != null ? com.tencent.mm.sdk.platformtools.o4.M(((k31.h) aVar).c()).i("HasReceivedAutoNotifySubscribeMsg", false) : false) {
                    return;
                }
                java.lang.String str2 = jVar.f349253a.f218989w;
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    if (str2 != null) {
                        java.lang.String str3 = null;
                        if (!(!com.tencent.mm.sdk.platformtools.t8.K0(str2))) {
                            str2 = null;
                        }
                        if (str2 != null) {
                            java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str2, "msgsource", null);
                            if (d17 != null && (str = (java.lang.String) d17.get(".msgsource.notify_option.is_notify_by_tmpl")) != null) {
                                str3 = r26.n0.u0(str).toString();
                            }
                            if (((str3 == null || (h17 = r26.h0.h(str3)) == null) ? 0 : h17.intValue()) > 0) {
                                z17 = true;
                            }
                        }
                    }
                    m521constructorimpl = kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(z17));
                } catch (java.lang.Throwable th6) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                }
                java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
                if (m524exceptionOrNullimpl != null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.BrsNotificationNotifyUtils", "isBrsImportantNotification parse error: " + m524exceptionOrNullimpl.getMessage());
                    m521constructorimpl = java.lang.Boolean.FALSE;
                }
                if (!((java.lang.Boolean) m521constructorimpl).booleanValue() || aVar == null) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.BrandSubscribeStorageManager", "markAutoNotifySubscribeMsgAsReceived");
                com.tencent.mm.sdk.platformtools.o4.M(((k31.h) aVar).c()).G("HasReceivedAutoNotifySubscribeMsg", true);
            }
        }
    }

    private void ZIDL_IX(java.lang.Object obj) {
        ((com.tencent.wechat.mm.brand_service.f0) obj).getClass();
    }

    private void ZIDL_LX(java.lang.Object obj) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    public native void ZIDL_AV(long j17, java.lang.Object obj, byte[] bArr);

    public native byte[] ZIDL_B(long j17, long j18, int i17);

    public native long ZIDL_C(long j17);

    public native byte[] ZIDL_D(long j17, long j18, int i17);

    public native byte[] ZIDL_E(long j17, long j18);

    public native long ZIDL_F(long j17);

    public native long ZIDL_G(long j17);

    public native byte[] ZIDL_H(long j17);

    public native void ZIDL_IV(long j17, java.lang.Object obj, long j18);

    public native void ZIDL_K(long j17);

    public native void ZIDL_LV(long j17, java.lang.Object obj, byte[] bArr);

    public native boolean ZIDL_M(long j17, long j18);

    public native boolean ZIDL_N(long j17, byte[] bArr);

    public native void ZIDL_P(long j17, byte[] bArr);

    public native void ZIDL_R(long j17, byte[] bArr);

    public native void ZIDL_T(long j17, long j18, byte[] bArr, long j19);

    public native void ZIDL_V(long j17, long j18);

    public native boolean ZIDL_W(long j17);

    public native void ZIDL_q1bTCHfwC(java.lang.Object obj, java.lang.Object obj2, java.lang.String str, java.lang.String str2);
}

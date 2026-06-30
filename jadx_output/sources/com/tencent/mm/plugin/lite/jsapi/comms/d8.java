package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes8.dex */
public abstract class d8 {
    public static final boolean a() {
        try {
            ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).getClass();
            return qp.b.f365678e;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("LiteAppLivePhotoBridge", "isSupportLivePhoto exception: %s", th6.getMessage());
            return false;
        }
    }
}

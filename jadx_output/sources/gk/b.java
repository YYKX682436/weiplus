package gk;

/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final gk.b f272408a = new gk.b();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f272409b;

    static {
        com.tencent.mm.sdk.platformtools.o4 J2 = com.tencent.mm.sdk.platformtools.o4.J("AdCommonFeatureMAP", ((java.lang.Number) ((jz5.n) jz5.h.b(gk.a.f272407d)).getValue()).intValue(), 2);
        kotlin.jvm.internal.o.f(J2, "getAccountAwareMMKV(...)");
        f272409b = J2;
    }

    public final r45.e5 a(java.lang.String aid) {
        byte[] j17;
        kotlin.jvm.internal.o.g(aid, "aid");
        try {
            j17 = f272409b.j("magicAd-adsInfo-".concat(aid));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("AdCommonFeatureMAP", "Failed to decode ad info for aid: ".concat(aid), e17);
        }
        if (j17 == null) {
            com.tencent.mars.xlog.Log.w("AdCommonFeatureMAP", "No ad info found for aid: ".concat(aid));
            return null;
        }
        r45.e5 e5Var = new r45.e5();
        e5Var.fromProtobuf(j17);
        return e5Var;
    }

    public final r45.e5 b(wj.t0 posId) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(posId, "posId");
        java.util.Set c17 = c(posId.f446518d);
        if (c17 == null || (str = (java.lang.String) kz5.n0.Y(c17)) == null) {
            com.tencent.mars.xlog.Log.e("AdCommonFeatureMAP", "getAdsInfo, serverAid for cur posId not found, posId: " + posId);
            return null;
        }
        r45.e5 a17 = a(str);
        if (a17 != null) {
            return a17;
        }
        com.tencent.mars.xlog.Log.e("AdCommonFeatureMAP", "getAdsInfo, adInfo not found, posId: " + posId + ", aid: " + str + ' ');
        return null;
    }

    public final java.util.Set c(java.lang.String posId) {
        kotlin.jvm.internal.o.g(posId, "posId");
        java.util.Set v17 = f272409b.v(g(posId));
        if (v17 != null) {
            return v17;
        }
        com.tencent.mars.xlog.Log.w("AdCommonFeatureMAP", "No aid found for posId: ".concat(posId));
        return null;
    }

    public final boolean d(java.lang.String posId) {
        kotlin.jvm.internal.o.g(posId, "posId");
        long q17 = f272409b.q("magicAd-expiredTime-".concat(posId), 0L);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean z17 = q17 <= currentTimeMillis;
        com.tencent.mars.xlog.Log.i("AdCommonFeatureMAP", "checkIsExpired, expiredTime: " + q17 + ", curTime: " + currentTimeMillis + ", isExpired: " + z17);
        return z17;
    }

    public final void e(java.lang.String posId, java.lang.String aid) {
        kotlin.jvm.internal.o.g(posId, "posId");
        kotlin.jvm.internal.o.g(aid, "aid");
        java.lang.String g17 = g(posId);
        com.tencent.mm.sdk.platformtools.o4 o4Var = f272409b;
        java.util.Set v17 = o4Var.v(g17);
        if (v17 == null) {
            v17 = new java.util.HashSet();
        }
        v17.add(aid);
        o4Var.F(f272408a.g(posId), v17);
        com.tencent.mars.xlog.Log.i("AdCommonFeatureMAP", "Aid set to " + aid + " for posId: " + posId);
    }

    public final boolean f(java.lang.String posId) {
        kotlin.jvm.internal.o.g(posId, "posId");
        boolean i17 = f272409b.i("magicAd-feedback-".concat(posId), false);
        com.tencent.mars.xlog.Log.i("AdCommonFeatureMAP", "is feedback, posId: " + posId + ", enable: " + i17);
        return i17;
    }

    public final java.lang.String g(java.lang.String str) {
        return "magicAd-new-posAidSet-" + str;
    }

    public final void h(java.lang.String aid) {
        kotlin.jvm.internal.o.g(aid, "aid");
        f272409b.remove("magicAd-adsInfo-".concat(aid));
        com.tencent.mars.xlog.Log.i("AdCommonFeatureMAP", "reset adInfo, aid: ".concat(aid));
    }

    public final void i(java.lang.String aid, r45.e5 adInfo) {
        kotlin.jvm.internal.o.g(aid, "aid");
        kotlin.jvm.internal.o.g(adInfo, "adInfo");
        byte[] byteArray = adInfo.toByteArray();
        kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
        f272409b.H("magicAd-adsInfo-".concat(aid), byteArray);
        com.tencent.mars.xlog.Log.i("AdCommonFeatureMAP", "Ad info (byte array) set for aid: ".concat(aid));
        com.tencent.mars.xlog.Log.i("AdCommonFeatureMAP", "Ad info set for aid: ".concat(aid));
    }

    public final void j(long j17, java.lang.String posId) {
        kotlin.jvm.internal.o.g(posId, "posId");
        f272409b.B("magicAd-expiredTime-".concat(posId), j17);
        com.tencent.mars.xlog.Log.i("AdCommonFeatureMAP", "Expired time set to: " + j17);
    }
}

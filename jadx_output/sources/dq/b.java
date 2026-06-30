package dq;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.o4 f242284a = com.tencent.mm.sdk.platformtools.o4.M("FINDER_VIDEO_MMKV");

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.o4 f242285b = com.tencent.mm.sdk.platformtools.o4.J("FINDER_VIDEO_MMKV", gm0.j1.b().h(), 2);

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.o4 f242286c = com.tencent.mm.sdk.platformtools.o4.M("FINDER_INTERACTION_MILE_STONE");

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f242287d = jz5.h.b(dq.a.f242283d);

    public final boolean a(java.lang.String tipsKey) {
        kotlin.jvm.internal.o.g(tipsKey, "tipsKey");
        com.tencent.mm.sdk.platformtools.o4 o4Var = this.f242285b;
        long q17 = o4Var != null ? o4Var.q("KEY_FINDER_EDU_TIPS_SHOW_TIME_".concat(tipsKey), 0L) : 0L;
        int o17 = o4Var != null ? o4Var.o("KEY_FINDER_EDU_TIPS_FEATURE_USE_COUNT_".concat(tipsKey), 0) : 0;
        long e17 = (c01.id.e() - q17) / 86400;
        com.tencent.mars.xlog.Log.i("Finder.FinderMMKVManager", "canShowEduTips key=" + tipsKey + ", showTime=" + q17 + ", dayDiff=" + e17 + ", featureUseCount=" + o17);
        if (q17 > 0 && e17 < 14) {
            com.tencent.mars.xlog.Log.i("Finder.FinderMMKVManager", "canShowEduTips key=" + tipsKey + ", shown within 14 days, return false");
            return false;
        }
        if (o17 < 2) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderMMKVManager", "canShowEduTips key=" + tipsKey + ", feature used " + o17 + " times, reach limit, return false");
        return false;
    }

    public final void b(java.lang.Long l17) {
        com.tencent.mm.sdk.platformtools.o4 o4Var = this.f242285b;
        if (l17 == null || l17.longValue() == 0) {
            if (o4Var != null) {
                o4Var.W("KEY_FINDER_INTERACTION_EASTER_EGG_LAST_EMOJI_FEED_ID");
            }
        } else if (o4Var != null) {
            o4Var.B("KEY_FINDER_INTERACTION_EASTER_EGG_LAST_EMOJI_FEED_ID", l17.longValue());
        }
    }

    public final void c(java.lang.String str) {
        com.tencent.mm.sdk.platformtools.o4 o4Var = this.f242285b;
        if (str == null) {
            if (o4Var != null) {
                o4Var.W("KEY_FINDER_INTERACTION_EASTER_EGG_LAST_EMOJI_MD5");
            }
        } else if (o4Var != null) {
            o4Var.D("KEY_FINDER_INTERACTION_EASTER_EGG_LAST_EMOJI_MD5", str);
        }
    }

    public final void d(int i17, java.lang.String fromScene) {
        kotlin.jvm.internal.o.g(fromScene, "fromScene");
        boolean z17 = pm0.v.z(i17, 2);
        com.tencent.mars.xlog.Log.i("Finder.FinderMMKVManager", "updateSvrEnableLikeTemplate scene: " + fromScene + ", disableAnimation: " + z17);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIKE_ANIMATION_SVR_DISABLE_BOOLEAN_SYNC, java.lang.Boolean.valueOf(z17));
    }
}

package n74;

/* loaded from: classes4.dex */
public abstract class a2 {
    public static void a(android.widget.ImageView imageView, java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillUserAvatarAsyncWithCdn", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper");
        try {
            b(imageView, str, i17);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillUserAvatarAsyncWithCdn", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper");
    }

    public static void b(android.widget.ImageView imageView, java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillUserAvatarAsyncWithCdnInternal", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper");
        if (imageView == null || android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.w("AdUserAvatarHelper", "fillUserAvatarAsyncWithCdn: the avatar url is empty or image view is empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillUserAvatarAsyncWithCdnInternal", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper");
            return;
        }
        imageView.toString();
        if (str.equalsIgnoreCase((java.lang.String) a84.y0.d(imageView, com.tencent.mm.R.id.nae))) {
            za4.t0.d("adId", str, new n74.y1(imageView, i17, str));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillUserAvatarAsyncWithCdnInternal", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper");
        } else {
            com.tencent.mars.xlog.Log.w("AdUserAvatarHelper", "fillUserAvatarAsyncWithCdn: the input avatarUrl is not same as the tag url in the ImageView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillUserAvatarAsyncWithCdnInternal", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper");
        }
    }

    public static void c(android.widget.ImageView imageView, java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillUserAvatarWhenFileExisted", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper");
        try {
            i64.m1.f289238c.c(imageView, str, i17);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillUserAvatarWhenFileExisted", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper");
    }

    public static boolean d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("useCdnDownloadUserAvatar", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper");
        try {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_timeline_use_cdn_download_user_avatar, 1);
            com.tencent.mars.xlog.Log.i("AdUserAvatarHelper", "useCdnDownloadUserAvatar value is " + Ni);
            boolean z17 = Ni > 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("useCdnDownloadUserAvatar", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper");
            return z17;
        } catch (java.lang.Throwable unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("useCdnDownloadUserAvatar", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper");
            return false;
        }
    }
}

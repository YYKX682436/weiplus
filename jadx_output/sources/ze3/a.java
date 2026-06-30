package ze3;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ze3.a f471778a = new ze3.a();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f471779b;

    static {
        java.lang.String str = com.tencent.mm.vfs.q7.c("mb_ad") + '/';
        com.tencent.mars.xlog.Log.i("MB_External_surface_video_item", "prepare AD_DATA_ROOT:" + str);
        java.lang.String str2 = str + "reward_ad_video/";
        com.tencent.mars.xlog.Log.i("MB_External_surface_video_item", "prepare REWARD_AD_VIDEO_DIR:" + str2);
        f471779b = str2;
    }

    public final java.lang.String a(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(f471779b);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("ad_video_");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            if (str2 == null) {
                str2 = "";
            }
            char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
            str = com.tencent.mm.sdk.platformtools.w2.b(str2.getBytes());
        }
        sb7.append(str);
        sb6.append(sb7.toString());
        return sb6.toString();
    }
}

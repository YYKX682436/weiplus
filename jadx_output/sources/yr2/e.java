package yr2;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final yr2.e f464664a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f464665b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f464666c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f464667d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f464668e;

    static {
        yr2.e eVar = new yr2.e();
        f464664a = eVar;
        boolean z17 = false;
        f464665b = com.tencent.thumbplayer.core.common.TPPlayerDecoderCapability.isHDRsupport(2, 0, 0);
        f464666c = com.tencent.thumbplayer.core.common.TPPlayerDecoderCapability.isHDRsupport(0, 0, 0);
        f464667d = com.tencent.thumbplayer.core.common.TPPlayerDecoderCapability.isHDRsupport(1, 0, 0);
        synchronized (eVar) {
            com.tencent.thumbplayer.core.common.TPMediaDecoderInfo[] tPMediaDecoderInfos = com.tencent.thumbplayer.core.common.TPMediaDecoderList.getTPMediaDecoderInfos(null);
            kotlin.jvm.internal.o.d(tPMediaDecoderInfos);
            int length = tPMediaDecoderInfos.length;
            int i17 = 0;
            loop0: while (true) {
                if (i17 >= length) {
                    break;
                }
                com.tencent.thumbplayer.core.common.TPMediaDecoderInfo tPMediaDecoderInfo = tPMediaDecoderInfos[i17];
                if (android.text.TextUtils.equals(tPMediaDecoderInfo.getDecoderMimeType(), "video/hevc")) {
                    com.tencent.thumbplayer.core.common.TPMediaDecoderInfo.DecoderProfileLevel[] profileLevels = tPMediaDecoderInfo.getProfileLevels();
                    kotlin.jvm.internal.o.d(profileLevels);
                    for (com.tencent.thumbplayer.core.common.TPMediaDecoderInfo.DecoderProfileLevel decoderProfileLevel : profileLevels) {
                        if (decoderProfileLevel.profile == 2) {
                            z17 = true;
                            break loop0;
                        }
                    }
                }
                i17++;
            }
        }
        f464668e = z17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isSupportDolbyVersion:");
        yr2.e eVar2 = f464664a;
        sb6.append(eVar2.a());
        sb6.append(" isSupportHDR10:");
        sb6.append(eVar2.b());
        sb6.append(" isSupportHDR10PLUS:");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("isSupportHDR10PLUS:");
        boolean z18 = f464667d;
        sb7.append(z18);
        com.tencent.mars.xlog.Log.i("HdrCapability", sb7.toString());
        sb6.append(z18);
        sb6.append(" isSupportHDRHLG:");
        sb6.append(eVar2.c());
        com.tencent.mars.xlog.Log.i("HdrCapability", sb6.toString());
    }

    public final boolean a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isSupportDolbyVersion:");
        boolean z17 = f464665b;
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("HdrCapability", sb6.toString());
        return z17;
    }

    public final boolean b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isSupportHDR10:");
        boolean z17 = f464666c;
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("HdrCapability", sb6.toString());
        return z17;
    }

    public final boolean c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isSupportHDRHLG:");
        boolean z17 = f464668e;
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("HdrCapability", sb6.toString());
        return z17;
    }
}

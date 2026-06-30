package com.tencent.mm.sdk.platformtools;

/* loaded from: classes13.dex */
public abstract class v5 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f193040a = true;

    public static boolean a(android.content.Context context) {
        if (!f193040a) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PlaySound", "skip isNotificationMuted check");
            return false;
        }
        android.media.AudioManager audioManager = (android.media.AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return false;
        }
        int ringerMode = audioManager.getRingerMode();
        return ringerMode == 0 || ringerMode == 1 || audioManager.getStreamVolume(5) == 0;
    }

    public static void b(android.content.Context context, int i17) {
        com.tencent.mm.sdk.platformtools.d6.d(context, i17, com.tencent.mm.sdk.platformtools.x5.f193084d, false, null);
    }

    public static void c(android.content.Context context, int i17, com.tencent.mm.sdk.platformtools.t5 t5Var) {
        com.tencent.mm.sdk.platformtools.d6.d(context, i17, com.tencent.mm.sdk.platformtools.x5.f193084d, false, new com.tencent.mm.sdk.platformtools.s5(t5Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x010b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.media.MediaPlayer d(android.content.Context r17, int r18, com.tencent.mm.sdk.platformtools.u5 r19, int r20, boolean r21, com.tencent.mm.sdk.platformtools.t5 r22) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.sdk.platformtools.v5.d(android.content.Context, int, com.tencent.mm.sdk.platformtools.u5, int, boolean, com.tencent.mm.sdk.platformtools.t5):android.media.MediaPlayer");
    }

    public static void e(android.content.Context context, int i17) {
        if (a(context)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.PlaySound", "device in ringer mode mute, no need to play sound");
        } else {
            b(context, i17);
        }
    }
}

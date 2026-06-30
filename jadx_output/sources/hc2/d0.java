package hc2;

/* loaded from: classes2.dex */
public abstract class d0 {
    public static final int a(int i17) {
        if (i17 == 1) {
            return 0;
        }
        if (i17 == 2) {
            return 1;
        }
        switch (i17) {
            case 4:
                return 2;
            case 128:
                return 4;
            case 256:
                return 10;
            case 512:
                return 5;
            case 1024:
                return 6;
            case 2048:
                return 7;
            case 4096:
                return 8;
            case 8192:
                return 14;
            case 33280:
                return 17;
            case 33536:
                return 21;
            case 73729:
                return 30;
            case 131072:
                return 18;
            case 196608:
                return 19;
            case 1048576:
                return 23;
            case com.tencent.youtu.sdkkitframework.common.ErrorCode.YT_SDK_PARAM_ERROR /* 3145728 */:
                return 31;
            case 4194304:
                return 29;
            case 5242880:
                return 32;
            case 8388608:
                return 34;
            case com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62 /* 16777216 */:
                return 35;
            case com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62 /* 33554432 */:
                return 36;
            case 67108864:
                return 37;
            default:
                return 3;
        }
    }

    public static final int b(int i17) {
        if (i17 == 1) {
            return 18;
        }
        if (i17 == 2) {
            return 16;
        }
        if (i17 == 3) {
            return ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.y0().r()).intValue() == 1 ? 155 : 17;
        }
        if (i17 != 4) {
            return i17 != 35 ? i17 != 39 ? -1 : 397 : com.tencent.mm.plugin.appbrand.jsapi.nfc.t.CTRL_INDEX;
        }
        return 20;
    }

    public static final com.tencent.mm.storage.u3 c(int i17) {
        return i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? i17 != 35 ? i17 != 39 ? com.tencent.mm.storage.u3.USERINFO_FINDER_TIMELINE_ALL_LASTBUF_STRING_SYNC : com.tencent.mm.storage.u3.USERINFO_FINDER_TIMELINE_NATIVE_DRAMA_LASTBUF_STRING_SYNC : com.tencent.mm.storage.u3.USERINFO_FINDER_TIMELINE_LBS_SAMECITY_LASTBUF_STRING_SYNC : com.tencent.mm.storage.u3.USERINFO_FINDER_TIMELINE_MACHINE_LASTBUF_STRING_SYNC : com.tencent.mm.storage.u3.USERINFO_FINDER_TIMELINE_FOLLOW_LASTBUF_STRING_SYNC : com.tencent.mm.storage.u3.USERINFO_FINDER_TIMELINE_LBS_LASTBUF_STRING_SYNC : com.tencent.mm.storage.u3.USERINFO_FINDER_TIMELINE_FRIEND_LASTBUF_STRING_SYNC : com.tencent.mm.storage.u3.USERINFO_FINDER_TIMELINE_ALL_LASTBUF_STRING_SYNC;
    }

    public static final int d(int i17) {
        if (i17 == 0) {
            return 1;
        }
        if (i17 == 1) {
            return 512;
        }
        if (i17 == 2) {
            return 1024;
        }
        if (i17 == 3) {
            return 2048;
        }
        if (i17 == 4) {
            return 4096;
        }
        if (i17 == 35) {
            return com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62;
        }
        if (i17 != 39) {
            return i17 != 1001 ? 1 : 33024;
        }
        return 67108864;
    }
}

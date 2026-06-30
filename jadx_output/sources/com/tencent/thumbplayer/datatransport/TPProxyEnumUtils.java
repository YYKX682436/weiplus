package com.tencent.thumbplayer.datatransport;

/* loaded from: classes11.dex */
public class TPProxyEnumUtils {
    private static final java.lang.String TAG = "TPThumbPlayer[TPProxyEnumUtils.java]";

    public static int dlType2Inner(int i17) {
        int i18 = 18;
        if (i17 != 18) {
            i18 = 202;
            if (i17 != 202) {
                switch (i17) {
                    case 0:
                        return 0;
                    case 1:
                        return 1;
                    case 2:
                        return 2;
                    case 3:
                        return 3;
                    case 4:
                        return 4;
                    case 5:
                        return 5;
                    case 6:
                        return 6;
                    case 7:
                        return 7;
                    case 8:
                        return 8;
                    case 9:
                        return 9;
                    case 10:
                        return 10;
                    case 11:
                        return 11;
                    case 12:
                        return 16;
                    default:
                        throw new java.lang.IllegalArgumentException("event is invalid: " + i17);
                }
            }
        }
        return i18;
    }

    public static int eventID2Inner(int i17) {
        int i18 = 3;
        if (i17 != 3) {
            i18 = 4;
            if (i17 != 4) {
                i18 = 5;
                if (i17 != 5) {
                    i18 = 6;
                    if (i17 != 6) {
                        switch (i17) {
                            case 13:
                                return 13;
                            case 14:
                                return 14;
                            case 15:
                                return 15;
                            case 16:
                                return 16;
                            case 17:
                                return 17;
                            case 18:
                                return 18;
                            case 19:
                                return 19;
                            case 20:
                                return 20;
                            case 21:
                                return 21;
                            default:
                                throw new java.lang.IllegalArgumentException("event is invalid : " + i17);
                        }
                    }
                }
            }
        }
        return i18;
    }
}

package ob1;

/* loaded from: classes7.dex */
public abstract class h {
    public static java.lang.String a(int i17) {
        if (i17 == 1) {
            return "GATT CONN L2C FAILURE";
        }
        if (i17 == 8) {
            return "GATT CONN TIMEOUT";
        }
        if (i17 == 19) {
            return "GATT CONN TERMINATE PEER USER";
        }
        if (i17 == 22) {
            return "GATT CONN TERMINATE LOCAL HOST";
        }
        if (i17 == 34) {
            return "GATT CONN LMP TIMEOUT";
        }
        if (i17 == 62) {
            return "GATT CONN FAIL ESTABLISH";
        }
        if (i17 == 133) {
            return "GATT ERROR";
        }
        if (i17 == 256) {
            return "GATT CONN CANCEL ";
        }
        if (i17 == 257) {
            return "GATT FAILURE, TOO MANY OPEN CONNECTIONS";
        }
        switch (i17) {
            case 0:
                return "GATT SUCCESS";
            case 1:
                return "GATT INVALID HANDLE";
            case 2:
                return "GATT READ NOT PERMIT";
            case 3:
                return "GATT WRITE NOT PERMIT";
            case 4:
                return "GATT INVALID PDU";
            case 5:
                return "GATT INSUF AUTHENTICATION";
            case 6:
                return "GATT REQ NOT SUPPORTED";
            case 7:
                return "GATT INVALID OFFSET";
            case 8:
                return "GATT INSUF AUTHORIZATION";
            case 9:
                return "GATT PREPARE Q FULL";
            case 10:
                return "GATT NOT FOUND";
            case 11:
                return "GATT NOT LONG";
            case 12:
                return "GATT INSUF KEY SIZE";
            case 13:
                return "GATT INVALID ATTR LEN";
            case 14:
                return "GATT ERR UNLIKELY";
            case 15:
                return "GATT INSUF ENCRYPTION";
            case 16:
                return "GATT UNSUPPORT GRP TYPE";
            case 17:
                return "GATT INSUF RESOURCE";
            default:
                switch (i17) {
                    case 128:
                        return "GATT NO RESOURCES";
                    case 129:
                        return "GATT INTERNAL ERROR";
                    case 130:
                        return "GATT WRONG STATE";
                    case 131:
                        return "GATT DB FULL";
                    case 132:
                        return "GATT BUSY";
                    case 133:
                        return "GATT ERROR";
                    case 134:
                        return "GATT CMD STARTED";
                    case 135:
                        return "GATT ILLEGAL PARAMETER";
                    case 136:
                        return "GATT PENDING";
                    case 137:
                        return "GATT AUTH FAIL";
                    case 138:
                        return "GATT MORE";
                    case 139:
                        return "GATT INVALID CFG";
                    case 140:
                        return "GATT SERVICE STARTED";
                    case 141:
                        return "GATT ENCRYPTED NO MITM";
                    case com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS /* 142 */:
                        return "GATT NOT ENCRYPTED";
                    case com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_ENABLE_ORIGINAL_VIDEO_INFO_CALLBACK_FROM_SURFACE_LISTENER /* 143 */:
                        return "GATT CONGESTED";
                    default:
                        switch (i17) {
                            case com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR /* 253 */:
                                return "GATT CCCD CFG ERROR";
                            case 254:
                                return "GATT PROCEDURE IN PROGRESS";
                            case 255:
                                return "GATT VALUE OUT OF RANGE";
                            default:
                                return "UNKNOWN (" + i17 + ")";
                        }
                }
        }
    }
}

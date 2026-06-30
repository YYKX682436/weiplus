package com.tencent.youtu.ytcommon;

/* loaded from: classes14.dex */
public class YTCommonExInterface {
    private static final java.lang.String TAG = "YTUtilityInterface";
    public static final java.lang.String VERSION = "3.2.3";
    protected static java.lang.reflect.Method commonSoInitAuth;
    private static int mBusinessCode;

    /* loaded from: classes14.dex */
    public interface BUSINESS_CODE {
        public static final int YT_COMMON = 0;
        public static final int YT_WX = 1;
    }

    public static int getBusinessCode() {
        return mBusinessCode;
    }

    public static float setAppBrightness(android.app.Activity activity, int i17) {
        com.tencent.youtu.ytcommon.tools.YTLogger.i(TAG, "[YTUtilityInterface.setAppBrightness] brightness: " + i17);
        float f17 = -1.0f;
        try {
            if (!activity.isDestroyed() && !activity.isFinishing()) {
                android.view.Window window = activity.getWindow();
                android.view.WindowManager.LayoutParams attributes = window.getAttributes();
                if (i17 == -1) {
                    attributes.screenBrightness = -1.0f;
                } else {
                    if (i17 <= 0) {
                        i17 = 1;
                    }
                    attributes.screenBrightness = i17 / 255.0f;
                }
                f17 = attributes.screenBrightness;
                window.setAttributes(attributes);
                return f17;
            }
            return -1.0f;
        } catch (java.lang.Exception e17) {
            com.tencent.youtu.ytcommon.tools.YTLogger.e(TAG, "set appbrightness failed :" + e17.getLocalizedMessage());
            return f17;
        }
    }

    public static void setBusinessCode(int i17) {
        mBusinessCode = i17;
    }

    public static void setIsEnabledLog(boolean z17) {
        com.tencent.youtu.ytcommon.tools.YTLogger.setIsEnabledLog(z17);
    }

    public static void setIsEnabledNativeLog(boolean z17) {
        com.tencent.youtu.ytcommon.tools.YTLogger.setIsEnabledNativeLog(z17);
    }

    public static void setLogger(com.tencent.youtu.ytcommon.tools.YTLogger.IFaceLiveLogger iFaceLiveLogger) {
        com.tencent.youtu.ytcommon.tools.YTLogger.setLog(iFaceLiveLogger);
    }
}

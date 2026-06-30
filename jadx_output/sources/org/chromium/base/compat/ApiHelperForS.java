package org.chromium.base.compat;

/* loaded from: classes13.dex */
public final class ApiHelperForS {
    private static final java.lang.String TAG = "ApiHelperForS";

    private ApiHelperForS() {
    }

    public static android.content.Context createWindowContext(android.content.Context context, android.view.Display display, int i17, android.os.Bundle bundle) {
        return context.createWindowContext(display, i17, bundle);
    }

    public static float getConfidenceScore(android.content.ClipDescription clipDescription, java.lang.String str) {
        return clipDescription.getConfidenceScore(str);
    }

    public static int getPendingIntentMutableFlag() {
        return com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62;
    }

    public static android.view.textclassifier.TextClassification getTextClassification(android.view.textclassifier.TextSelection textSelection) {
        return textSelection.getTextClassification();
    }

    public static android.view.textclassifier.TextLinks getTextLinks(android.content.ClipData.Item item) {
        return item.getTextLinks();
    }

    public static boolean hasBluetoothConnectPermission() {
        return org.chromium.base.ApiCompatibilityUtils.checkPermission(org.chromium.base.ContextUtils.getApplicationContext(), "android.permission.BLUETOOTH_CONNECT", android.os.Process.myPid(), android.os.Process.myUid()) == 0;
    }

    public static boolean isGetClassificationStatusIsComplete(android.content.ClipDescription clipDescription) {
        return clipDescription.getClassificationStatus() == 3;
    }

    public static boolean isStyleText(android.content.ClipDescription clipDescription) {
        return clipDescription.isStyledText();
    }

    public static void setAutoEnterEnabled(android.app.PictureInPictureParams.Builder builder, boolean z17) {
        builder.setAutoEnterEnabled(z17);
    }

    public static android.view.textclassifier.TextSelection.Request.Builder setIncludeTextClassification(android.view.textclassifier.TextSelection.Request.Builder builder, boolean z17) {
        return builder.setIncludeTextClassification(z17);
    }

    public static void startForeground(android.app.Service service, int i17, android.app.Notification notification, int i18) {
        try {
            service.startForeground(i17, notification, i18);
        } catch (android.app.ForegroundServiceStartNotAllowedException e17) {
            org.chromium.base.Log.e(TAG, "Cannot run service as foreground: " + e17 + " for notification channel " + notification.getChannelId() + " notification id " + i17);
        }
    }
}

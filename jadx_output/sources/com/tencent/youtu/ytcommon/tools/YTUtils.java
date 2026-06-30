package com.tencent.youtu.ytcommon.tools;

/* loaded from: classes10.dex */
public class YTUtils {
    private static final java.lang.String TAG = "ToolUtils";
    private static java.util.Map<java.lang.String, java.lang.String> mLoadedLibrary = new java.util.HashMap();

    public static int dip2px(android.content.Context context, float f17) {
        return (int) ((f17 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static void loadLibrary(java.lang.String str) {
        if (mLoadedLibrary.get(str) == null) {
            com.tencent.youtu.ytcommon.tools.YTLogger.i(TAG, "[YTUtils.loadLibrary] " + java.lang.System.getProperty("java.library.path"));
            com.tencent.cso.CsoLoader.e(str);
            mLoadedLibrary.put(str, "loaded");
        }
    }

    public static void prepareMatrix(android.graphics.Matrix matrix, boolean z17, int i17, int i18, int i19) {
        com.tencent.youtu.ytcommon.tools.YTLogger.e(TAG, "prepareMatrix viewWidth=" + i18 + ",viewHeight=" + i19 + ",displayOrientation=" + i17);
        matrix.setScale(z17 ? -1.0f : 1.0f, 1.0f);
        matrix.postRotate(i17);
        float f17 = i18;
        float f18 = i19;
        matrix.postScale(f17 / 2000.0f, f18 / 2000.0f);
        matrix.postTranslate(f17 / 2.0f, f18 / 2.0f);
    }

    public static android.graphics.Rect trans2ScreenRect(android.content.Context context, int i17, int i18, android.graphics.Rect rect) {
        float f17;
        float f18;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.youtu.ytcommon.tools.YTLogger.e(TAG, "trans2ScreenRect srcRect=" + rect.toString());
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        com.tencent.youtu.ytcommon.tools.YTLogger.e(TAG, "trans2ScreenRect dm.widthPixels=" + displayMetrics.widthPixels);
        com.tencent.youtu.ytcommon.tools.YTLogger.e(TAG, "trans2ScreenRect dm.heightPixels=" + displayMetrics.heightPixels);
        com.tencent.youtu.ytcommon.tools.YTLogger.e(TAG, "trans2ScreenRect previewWidth=" + i17);
        com.tencent.youtu.ytcommon.tools.YTLogger.e(TAG, "trans2ScreenRect previewHeight=" + i18);
        int i19 = displayMetrics.widthPixels;
        int i27 = displayMetrics.heightPixels;
        float f19 = i17;
        float f27 = i18;
        double d17 = (f19 * 1.0f) / f27;
        boolean z17 = i19 > i27;
        int i28 = z17 ? i19 : i27;
        if (z17) {
            i19 = i27;
        }
        boolean z18 = z17;
        double d18 = i28;
        double d19 = i19 * d17;
        if (d18 < d19) {
            i28 = (int) d19;
        } else {
            i19 = (int) (d18 / d17);
        }
        if (z18) {
            int i29 = i28;
            i28 = i19;
            i19 = i29;
        }
        com.tencent.youtu.ytcommon.tools.YTLogger.i(TAG, "trans2ScreenRect aspectRatio=" + d17);
        com.tencent.youtu.ytcommon.tools.YTLogger.i(TAG, "trans2ScreenRect widthLonger=" + z18);
        com.tencent.youtu.ytcommon.tools.YTLogger.e(TAG, "trans2ScreenRect screenWidth=" + i19);
        com.tencent.youtu.ytcommon.tools.YTLogger.e(TAG, "trans2ScreenRect screenHeight=" + i28);
        float f28 = 0.0f;
        if (i18 * i28 > i19 * i17) {
            f17 = (i28 * 1.0f) / f19;
            f28 = (i19 - (f27 * f17)) * 0.5f;
            f18 = 0.0f;
        } else {
            f17 = (i19 * 1.0f) / f27;
            f18 = (i28 - (f19 * f17)) * 0.5f;
        }
        android.graphics.Rect rect2 = new android.graphics.Rect();
        rect2.set((int) ((rect.left * f17) - f28), (int) ((rect.top * f17) - f18), (int) (rect.right * f17), (int) (rect.bottom * f17));
        com.tencent.youtu.ytcommon.tools.YTLogger.i(TAG, "scale=" + f17);
        com.tencent.youtu.ytcommon.tools.YTLogger.i(TAG, "dx=" + f28);
        com.tencent.youtu.ytcommon.tools.YTLogger.i(TAG, "dy=" + f18);
        com.tencent.youtu.ytcommon.tools.YTLogger.i(TAG, "screenWidth=" + i19);
        com.tencent.youtu.ytcommon.tools.YTLogger.i(TAG, "screenHeight=" + i28);
        com.tencent.youtu.ytcommon.tools.YTLogger.i(TAG, "dWidth=" + i18);
        com.tencent.youtu.ytcommon.tools.YTLogger.i(TAG, "dHeight=" + i17);
        com.tencent.youtu.ytcommon.tools.YTLogger.i(TAG, "dst=" + rect2.toString());
        float f29 = (float) ((i19 - displayMetrics.widthPixels) / 2);
        float f37 = (float) ((i28 - displayMetrics.heightPixels) / 2);
        rect.set((int) ((rect.left * f17) - f29), (int) ((rect.top * f17) - f37), (int) ((rect.right * f17) - f29), (int) ((rect.bottom * f17) - f37));
        com.tencent.youtu.ytcommon.tools.YTLogger.i(TAG, "target=" + rect.toString() + ",time=" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        return rect;
    }

    public static android.graphics.Rect trans2ScreenRectForYT(android.content.Context context, int i17, int i18, android.graphics.Rect rect) {
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        com.tencent.youtu.ytcommon.tools.YTLogger.e(TAG, "trans2ScreenRectForYT dm.widthPixels=" + displayMetrics.widthPixels);
        com.tencent.youtu.ytcommon.tools.YTLogger.e(TAG, "trans2ScreenRectForYT dm.heightPixels=" + displayMetrics.heightPixels);
        com.tencent.youtu.ytcommon.tools.YTLogger.e(TAG, "trans2ScreenRectForYT previewHeight=" + i18);
        float f17 = (((float) displayMetrics.widthPixels) * 1.0f) / ((float) i18);
        rect.set((int) (rect.left * f17), (int) (rect.top * f17), (int) ((r4 + rect.width()) * f17), (int) ((rect.top + rect.height()) * f17));
        return rect;
    }

    public static android.graphics.Rect translateToMeteringAreaCoordinate(int i17, int i18, android.graphics.Rect rect) {
        android.graphics.Rect rect2 = new android.graphics.Rect();
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        prepareMatrix(matrix, true, 90, i17, i18);
        matrix.postRotate(0.0f);
        android.graphics.RectF rectF = new android.graphics.RectF(rect.left * 1.0f, rect.top * 1.0f, rect.right * 1.0f, rect.bottom * 1.0f);
        com.tencent.youtu.ytcommon.tools.YTLogger.e(TAG, "translationToMeteringAreaCoordinate old rectF.left=" + rectF.left + ",rectF.top=" + rectF.top + ",rectF.right=" + rectF.right + ",rectF.bottom=" + rectF.bottom);
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        matrix.invert(matrix2);
        matrix2.mapRect(rectF);
        com.tencent.youtu.ytcommon.tools.YTLogger.e(TAG, "translationToMeteringAreaCoordinate new rectF.left=" + rectF.left + ",rectF.top=" + rectF.top + ",rectF.right=" + rectF.right + ",rectF.bottom=" + rectF.bottom);
        rect2.set(java.lang.Math.round(rectF.left), java.lang.Math.round(rectF.top), java.lang.Math.round(rectF.right), java.lang.Math.round(rectF.bottom));
        return rect2;
    }
}

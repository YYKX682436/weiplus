package io.flutter.plugin.platform;

/* loaded from: classes15.dex */
public class SkylineTextureLogic {
    private static final java.lang.String TAG = "SkylineTextureLogic";
    private static final java.lang.String VIEW_TYPE = "skyline_texture";
    private static io.flutter.plugin.platform.ISkylineTextureHandler sSkylineTextureHandler;
    private static final android.util.SparseArray<java.util.HashMap<java.lang.String, java.lang.String>> skylineTextureIdsArray = new android.util.SparseArray<>();
    private static final android.util.SparseArray<java.util.HashMap<java.lang.String, io.flutter.plugin.platform.SkylineTextureInfo>> sSkylineTextureInfoMapArray = new android.util.SparseArray<>();

    public static void addSkylineTexture(int i17, int i18, java.lang.String str) {
        android.util.SparseArray<java.util.HashMap<java.lang.String, java.lang.String>> sparseArray = skylineTextureIdsArray;
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = sparseArray.get(i17);
        if (hashMap == null) {
            hashMap = new java.util.HashMap<>();
            sparseArray.put(i17, hashMap);
        }
        hashMap.put("skyline_texture-" + i18, str);
    }

    public static void destroy(int i17) {
        skylineTextureIdsArray.remove(i17);
        java.util.HashMap<java.lang.String, io.flutter.plugin.platform.SkylineTextureInfo> hashMap = sSkylineTextureInfoMapArray.get(i17);
        if (hashMap != null) {
            java.util.Iterator<java.util.Map.Entry<java.lang.String, io.flutter.plugin.platform.SkylineTextureInfo>> it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                io.flutter.plugin.platform.SkylineTextureInfo value = it.next().getValue();
                java.lang.String str = value.type;
                int i18 = value.id;
                io.flutter.plugin.platform.ISkylineTextureHandler iSkylineTextureHandler = sSkylineTextureHandler;
                if (iSkylineTextureHandler != null) {
                    iSkylineTextureHandler.onTextureDestroy(i17, str, i18);
                }
            }
        }
        sSkylineTextureInfoMapArray.clear();
    }

    public static io.flutter.plugin.platform.SkylineTextureInfo getSkylineTextureInfo(int i17, java.lang.String str, int i18) {
        java.util.HashMap<java.lang.String, io.flutter.plugin.platform.SkylineTextureInfo> hashMap = sSkylineTextureInfoMapArray.get(i17);
        if (hashMap == null) {
            return null;
        }
        return hashMap.get(str + "#" + i18);
    }

    public static java.lang.String getSkylineTextureType(int i17, int i18) {
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = skylineTextureIdsArray.get(i17);
        if (hashMap == null) {
            return null;
        }
        return hashMap.get("skyline_texture-" + i18);
    }

    public static void initSkylineTextureHandler(io.flutter.plugin.platform.ISkylineTextureHandler iSkylineTextureHandler) {
        sSkylineTextureHandler = iSkylineTextureHandler;
    }

    public static boolean isSkylineTexture(int i17, int i18) {
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = skylineTextureIdsArray.get(i17);
        if (hashMap != null) {
            if (hashMap.containsKey("skyline_texture-" + i18)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSkylineTextureType(java.lang.String str) {
        return VIEW_TYPE.equals(str);
    }

    public static android.graphics.SurfaceTexture onCreateTexture(int i17, java.lang.String str, int i18) {
        io.flutter.plugin.platform.ISkylineTextureHandler iSkylineTextureHandler = sSkylineTextureHandler;
        if (iSkylineTextureHandler != null) {
            return iSkylineTextureHandler.onCreateTexture(i17, str, i18);
        }
        return null;
    }

    public static boolean onDestroyTexture(int i17, java.lang.String str, int i18) {
        io.flutter.plugin.platform.ISkylineTextureHandler iSkylineTextureHandler = sSkylineTextureHandler;
        return iSkylineTextureHandler != null && iSkylineTextureHandler.onDestroyTexture(i17, str, i18);
    }

    public static void onTextureDestroy(int i17, java.lang.String str, int i18) {
        android.util.SparseArray<java.util.HashMap<java.lang.String, io.flutter.plugin.platform.SkylineTextureInfo>> sparseArray = sSkylineTextureInfoMapArray;
        java.util.HashMap<java.lang.String, io.flutter.plugin.platform.SkylineTextureInfo> hashMap = sparseArray.get(i17);
        if (hashMap != null) {
            hashMap.remove(str + "#" + i18);
            if (hashMap.isEmpty()) {
                sparseArray.remove(i17);
            }
        }
        io.flutter.plugin.platform.ISkylineTextureHandler iSkylineTextureHandler = sSkylineTextureHandler;
        if (iSkylineTextureHandler != null) {
            iSkylineTextureHandler.onTextureDestroy(i17, str, i18);
        }
    }

    public static void onTextureReady(int i17, java.lang.String str, int i18, android.graphics.SurfaceTexture surfaceTexture, int i19, int i27) {
        java.util.Objects.toString(surfaceTexture);
        android.util.SparseArray<java.util.HashMap<java.lang.String, io.flutter.plugin.platform.SkylineTextureInfo>> sparseArray = sSkylineTextureInfoMapArray;
        java.util.HashMap<java.lang.String, io.flutter.plugin.platform.SkylineTextureInfo> hashMap = sparseArray.get(i17);
        if (hashMap == null) {
            hashMap = new java.util.HashMap<>();
            sparseArray.put(i17, hashMap);
        }
        hashMap.put(str + "#" + i18, new io.flutter.plugin.platform.SkylineTextureInfo(i18, str, i19, i27));
        io.flutter.plugin.platform.ISkylineTextureHandler iSkylineTextureHandler = sSkylineTextureHandler;
        if (iSkylineTextureHandler != null) {
            iSkylineTextureHandler.onTextureReady(i17, str, i18, surfaceTexture, i19, i27);
        }
    }

    public static void onTextureTouch(int i17, java.lang.String str, int i18, android.view.MotionEvent motionEvent) {
        java.util.Objects.toString(motionEvent);
        io.flutter.plugin.platform.ISkylineTextureHandler iSkylineTextureHandler = sSkylineTextureHandler;
        if (iSkylineTextureHandler != null) {
            iSkylineTextureHandler.onTextureTouch(i17, str, i18, motionEvent);
        }
    }

    public static void onTextureUpdate(int i17, java.lang.String str, int i18, int i19, int i27) {
        io.flutter.plugin.platform.ISkylineTextureHandler iSkylineTextureHandler = sSkylineTextureHandler;
        if (iSkylineTextureHandler != null) {
            iSkylineTextureHandler.onTextureUpdate(i17, str, i18, i19, i27);
        }
    }

    public static void removeSkylineTexture(int i17, int i18) {
        android.util.SparseArray<java.util.HashMap<java.lang.String, java.lang.String>> sparseArray = skylineTextureIdsArray;
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = sparseArray.get(i17);
        if (hashMap != null) {
            hashMap.remove("skyline_texture-" + i18);
            if (hashMap.isEmpty()) {
                sparseArray.remove(i17);
            }
        }
    }

    public static void updateSkylineTextureScale(int i17, int i18, double d17, double d18) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(dm.i4.COL_ID, java.lang.Integer.valueOf(i18));
        hashMap.put("scaleX", java.lang.Double.valueOf(d17));
        hashMap.put("scaleY", java.lang.Double.valueOf(d18));
        if (com.tencent.skyline.SkylineLogic.getTextureChannel(i17) != null) {
            com.tencent.skyline.SkylineLogic.getTextureChannel(i17).invokeMethod("updateTextureScale", hashMap);
        }
    }
}

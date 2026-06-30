package com.tencent.thumbplayer.tmediacodec.hook;

/* loaded from: classes14.dex */
public final class HookManager {
    private static final java.lang.String TAG = "HookManager";
    private static final java.util.Map<java.lang.String, com.tencent.thumbplayer.tmediacodec.hook.SurfaceCallback> sHoldCallbackMap = new java.util.concurrent.ConcurrentHashMap();
    private static boolean sIsSurfaceMethodHooked;

    public static void hookSurfaceCallback(java.lang.String str, com.tencent.thumbplayer.tmediacodec.hook.SurfaceCallback surfaceCallback) {
        java.util.Map<java.lang.String, com.tencent.thumbplayer.tmediacodec.hook.SurfaceCallback> map = sHoldCallbackMap;
        map.put(str, surfaceCallback);
        if (com.tencent.thumbplayer.tmediacodec.util.LogUtils.isLogEnable()) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.d(TAG, "after hookSurfaceCallback size:" + map.size() + " mHoldCallbackMap:" + map);
        }
        if (sIsSurfaceMethodHooked) {
            return;
        }
        sIsSurfaceMethodHooked = true;
        com.tencent.thumbplayer.tmediacodec.hook.THookTextureView.setHookCallback(new com.tencent.thumbplayer.tmediacodec.hook.THookTextureView.SurfaceTextureHookCallback() { // from class: com.tencent.thumbplayer.tmediacodec.hook.HookManager.1
            @Override // com.tencent.thumbplayer.tmediacodec.hook.THookTextureView.SurfaceTextureHookCallback
            public boolean onSurfaceTextureDestroyedCalled(android.graphics.SurfaceTexture surfaceTexture) {
                if (surfaceTexture == null) {
                    return true;
                }
                java.lang.String obj = surfaceTexture.toString();
                java.util.Iterator it = com.tencent.thumbplayer.tmediacodec.hook.HookManager.sHoldCallbackMap.keySet().iterator();
                while (it.hasNext()) {
                    if (android.text.TextUtils.equals((java.lang.String) it.next(), obj)) {
                        com.tencent.thumbplayer.tmediacodec.hook.SurfaceCallback surfaceCallback2 = (com.tencent.thumbplayer.tmediacodec.hook.SurfaceCallback) com.tencent.thumbplayer.tmediacodec.hook.HookManager.sHoldCallbackMap.get(obj);
                        if (surfaceCallback2 == null) {
                            return false;
                        }
                        surfaceCallback2.onDestroy(surfaceTexture);
                        return false;
                    }
                }
                return true;
            }
        });
    }

    public static void realReleaseSurfaceTexture(android.graphics.SurfaceTexture surfaceTexture) {
        try {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.w(TAG, "realReleaseSurfaceTexture surfaceTexture:" + surfaceTexture);
            unHookSurfaceCallback(surfaceTexture.toString());
            surfaceTexture.release();
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.w(TAG, "realReleaseSurfaceTexture surfaceTexture:" + surfaceTexture + " ignoreThrowable", th6);
        }
    }

    public static void unHookSurfaceCallback(java.lang.String str) {
        sHoldCallbackMap.remove(str);
    }
}

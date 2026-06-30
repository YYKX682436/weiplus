package com.tencent.thumbplayer.adapter.player.thumbplayer;

/* loaded from: classes13.dex */
public class TPDrmCapability {
    private static final java.lang.String DRM_CAPABILITY_LIST_KEY = "DRM_CAPABILITY_LIST";
    private static final java.lang.String DRM_SP_NAME = "TP_DRM_CAPABILITY";
    private static final java.lang.String TAG = "TPDrmCapability";
    private static java.util.Set<java.lang.String> mDrmCapabilities = new java.util.HashSet();
    private static java.util.Set<java.lang.String> mDrmBlacklist = new java.util.HashSet();

    public static synchronized void addDRMBlacklist(@com.tencent.thumbplayer.api.TPCommonEnum.TP_DRM_TYPE int i17) {
        synchronized (com.tencent.thumbplayer.adapter.player.thumbplayer.TPDrmCapability.class) {
            if (i17 == -1) {
                return;
            }
            mDrmBlacklist.add(java.lang.String.valueOf(i17));
            mDrmCapabilities.removeAll(mDrmBlacklist);
        }
    }

    public static synchronized int[] getDRMCapabilities() {
        int[] iArr;
        synchronized (com.tencent.thumbplayer.adapter.player.thumbplayer.TPDrmCapability.class) {
            iArr = new int[mDrmCapabilities.size()];
            java.util.Iterator<java.lang.String> it = mDrmCapabilities.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                int i18 = i17 + 1;
                iArr[i17] = com.tencent.thumbplayer.utils.TPCommonUtils.optInt(it.next(), -1);
                i17 = i18;
            }
        }
        return iArr;
    }

    private static void getDRMCapabilitiesAsync(final android.content.SharedPreferences sharedPreferences) {
        com.tencent.thumbplayer.utils.TPThreadPool.getInstance().obtainThreadExecutor().execute(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.adapter.player.thumbplayer.TPDrmCapability.1
            @Override // java.lang.Runnable
            public void run() {
                int[] iArr = new int[0];
                try {
                    iArr = com.tencent.thumbplayer.core.common.TPThumbplayerCapabilityHelper.getDRMCapabilities();
                } catch (com.tencent.thumbplayer.core.common.TPNativeLibraryException e17) {
                    com.tencent.thumbplayer.utils.TPLogUtil.e(com.tencent.thumbplayer.adapter.player.thumbplayer.TPDrmCapability.TAG, e17);
                }
                com.tencent.thumbplayer.utils.TPLogUtil.i(com.tencent.thumbplayer.adapter.player.thumbplayer.TPDrmCapability.TAG, "TPThumbPlayerCapabilityHelper, DRM capability:" + java.util.Arrays.toString(iArr));
                if (iArr.length == 0) {
                    return;
                }
                java.util.HashSet hashSet = new java.util.HashSet();
                for (int i17 : iArr) {
                    hashSet.add(java.lang.String.valueOf(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toTPIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapDrmType.class, i17)));
                }
                android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putStringSet(com.tencent.thumbplayer.adapter.player.thumbplayer.TPDrmCapability.DRM_CAPABILITY_LIST_KEY, hashSet);
                edit.apply();
                synchronized (com.tencent.thumbplayer.adapter.player.thumbplayer.TPDrmCapability.class) {
                    java.util.Set unused = com.tencent.thumbplayer.adapter.player.thumbplayer.TPDrmCapability.mDrmCapabilities = hashSet;
                    com.tencent.thumbplayer.adapter.player.thumbplayer.TPDrmCapability.mDrmCapabilities.removeAll(com.tencent.thumbplayer.adapter.player.thumbplayer.TPDrmCapability.mDrmBlacklist);
                }
            }
        });
    }

    public static synchronized void init(android.content.Context context) {
        synchronized (com.tencent.thumbplayer.adapter.player.thumbplayer.TPDrmCapability.class) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "TPDrmCapability, init");
            com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "TPDrmCapability, get shared preferences.");
            android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(DRM_SP_NAME, 0);
            try {
                mDrmCapabilities = sharedPreferences.getStringSet(DRM_CAPABILITY_LIST_KEY, mDrmCapabilities);
            } catch (java.lang.ClassCastException e17) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
            }
            mDrmCapabilities.removeAll(mDrmBlacklist);
            getDRMCapabilitiesAsync(sharedPreferences);
        }
    }

    public static synchronized boolean isDRMSupport(@com.tencent.thumbplayer.api.TPCommonEnum.TP_DRM_TYPE int i17) {
        synchronized (com.tencent.thumbplayer.adapter.player.thumbplayer.TPDrmCapability.class) {
            if (i17 == -1) {
                return false;
            }
            java.util.Iterator<java.lang.String> it = mDrmCapabilities.iterator();
            while (it.hasNext()) {
                if (com.tencent.thumbplayer.utils.TPCommonUtils.optInt(it.next(), -1) == i17) {
                    return true;
                }
            }
            return false;
        }
    }
}

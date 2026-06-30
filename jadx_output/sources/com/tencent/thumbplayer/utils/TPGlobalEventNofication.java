package com.tencent.thumbplayer.utils;

/* loaded from: classes13.dex */
public class TPGlobalEventNofication {
    public static final int EVENT_ID_APP_ENTER_BACKGROUND = 100001;
    public static final int EVENT_ID_APP_ENTER_FOREGROUND = 100002;
    public static final int EVENT_ID_UPC_CHANGED = 100003;
    private static final java.lang.String TAG = "TPGlobalEventNofication";
    private static java.util.concurrent.CopyOnWriteArrayList<com.tencent.thumbplayer.utils.TPGlobalEventNofication.OnGlobalEventChangeListener> mListeners = new java.util.concurrent.CopyOnWriteArrayList<>();

    /* loaded from: classes13.dex */
    public interface OnGlobalEventChangeListener {
        void onEvent(int i17, int i18, int i19, java.lang.Object obj);
    }

    public static synchronized void addEventListener(com.tencent.thumbplayer.utils.TPGlobalEventNofication.OnGlobalEventChangeListener onGlobalEventChangeListener) {
        synchronized (com.tencent.thumbplayer.utils.TPGlobalEventNofication.class) {
            java.util.concurrent.CopyOnWriteArrayList<com.tencent.thumbplayer.utils.TPGlobalEventNofication.OnGlobalEventChangeListener> copyOnWriteArrayList = mListeners;
            if (copyOnWriteArrayList != null && !copyOnWriteArrayList.contains(onGlobalEventChangeListener)) {
                mListeners.add(onGlobalEventChangeListener);
                com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "add onNetStatus change listener: " + onGlobalEventChangeListener + ", mListeners: " + mListeners.size());
            }
        }
    }

    public static synchronized void postGlobalEvent(int i17, int i18, int i19, java.lang.Object obj) {
        synchronized (com.tencent.thumbplayer.utils.TPGlobalEventNofication.class) {
            java.util.Iterator<com.tencent.thumbplayer.utils.TPGlobalEventNofication.OnGlobalEventChangeListener> it = mListeners.iterator();
            while (it.hasNext()) {
                it.next().onEvent(i17, i18, i19, obj);
            }
        }
    }

    public static synchronized void removeEventListener(com.tencent.thumbplayer.utils.TPGlobalEventNofication.OnGlobalEventChangeListener onGlobalEventChangeListener) {
        synchronized (com.tencent.thumbplayer.utils.TPGlobalEventNofication.class) {
            java.util.concurrent.CopyOnWriteArrayList<com.tencent.thumbplayer.utils.TPGlobalEventNofication.OnGlobalEventChangeListener> copyOnWriteArrayList = mListeners;
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.remove(onGlobalEventChangeListener);
                com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "remove netStatusChangeListener, listener: " + onGlobalEventChangeListener + ", mListeners: " + mListeners.size());
            }
        }
    }
}

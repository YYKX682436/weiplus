package com.tencent.thumbplayer.utils;

/* loaded from: classes13.dex */
public class TPProcessLifeCycleEventPublisher implements androidx.lifecycle.x {
    public static final int EVENT_PROCESS_LIFE_CYCLE_CREATE = 0;
    public static final int EVENT_PROCESS_LIFE_CYCLE_DESTROY = 5;
    public static final int EVENT_PROCESS_LIFE_CYCLE_PAUSE = 2;
    public static final int EVENT_PROCESS_LIFE_CYCLE_RESUME = 3;
    public static final int EVENT_PROCESS_LIFE_CYCLE_START = 1;
    public static final int EVENT_PROCESS_LIFE_CYCLE_STOP = 4;
    public static final int EVENT_PROCESS_ON_BACKGROUND = 2;
    public static final int EVENT_PROCESS_ON_FOREGROUND = 3;
    private static final int STATE_INITED = 2;
    private static final int STATE_INITING = 1;
    private static final int STATE_UNINITED = 0;
    private static final int STATE_UNINITING = 3;
    private static final java.lang.String TAG = "TPProcessLifeCycleEventPublisher";
    private static com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher mObserver = new com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher();
    private static int mState = 0;
    private static java.util.concurrent.CopyOnWriteArraySet<com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher.ITPOnProcessLifeCycleChangeListener> mListeners = new java.util.concurrent.CopyOnWriteArraySet<>();

    /* loaded from: classes6.dex */
    public interface ITPOnProcessLifeCycleChangeListener {
        void onEvent(int i17);
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.PARAMETER})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface TPProcessLiftCycleEventId {
    }

    private TPProcessLifeCycleEventPublisher() {
    }

    public static void addEventListener(com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher.ITPOnProcessLifeCycleChangeListener iTPOnProcessLifeCycleChangeListener) {
        if (mListeners.add(iTPOnProcessLifeCycleChangeListener)) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "add ProcessLifeCycleChangeListener: " + iTPOnProcessLifeCycleChangeListener);
        }
    }

    public static void clearEventListener() {
        mListeners.clear();
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "clear ProcessLifeCycleChangeListeners");
    }

    public static synchronized void init() {
        synchronized (com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher.class) {
            int i17 = mState;
            if (i17 != 2 && i17 != 1) {
                if (i17 == 3) {
                    com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "current state is UNINITING, no need to init, just change state to INITED");
                    mState = 2;
                    return;
                }
                mState = 1;
                if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
                    androidx.lifecycle.q0.f11640o.f11646i.a(mObserver);
                    mState = 2;
                    com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "init successfully");
                } else {
                    com.tencent.thumbplayer.utils.TPThreadPool.getInstance().postRunnableOnMainThread(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher.1
                        @Override // java.lang.Runnable
                        public void run() {
                            synchronized (com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher.class) {
                                if (com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher.mState != 1) {
                                    com.tencent.thumbplayer.utils.TPLogUtil.i(com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher.TAG, "stop init, current state:" + com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher.mState);
                                } else {
                                    androidx.lifecycle.q0.f11640o.f11646i.a(com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher.mObserver);
                                    int unused = com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher.mState = 2;
                                    com.tencent.thumbplayer.utils.TPLogUtil.i(com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher.TAG, "init successfully");
                                }
                            }
                        }
                    });
                }
                return;
            }
            com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "no need to init, current state:" + mState);
        }
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_CREATE)
    private void onCreate() {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onCreate");
        postEventToAllListeners(0);
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
    private void onDestroy() {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onDestroy");
        postEventToAllListeners(5);
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_PAUSE)
    private void onPause() {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onPause");
        postEventToAllListeners(2);
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_RESUME)
    private void onResume() {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onResume");
        postEventToAllListeners(3);
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_START)
    private void onStart() {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onStart");
        postEventToAllListeners(1);
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_STOP)
    private void onStop() {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onStop");
        postEventToAllListeners(4);
    }

    private void postEventToAllListeners(int i17) {
        java.util.Iterator<com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher.ITPOnProcessLifeCycleChangeListener> it = mListeners.iterator();
        while (it.hasNext()) {
            it.next().onEvent(i17);
        }
    }

    public static void removeEventListener(com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher.ITPOnProcessLifeCycleChangeListener iTPOnProcessLifeCycleChangeListener) {
        if (mListeners.remove(iTPOnProcessLifeCycleChangeListener)) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "remove ProcessLifeCycleChangeListener: " + iTPOnProcessLifeCycleChangeListener);
        }
    }

    public static synchronized void uninit() {
        synchronized (com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher.class) {
            int i17 = mState;
            if (i17 != 0 && i17 != 3) {
                if (i17 == 1) {
                    com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "current state is initing, no need to uninit, just change state to uninited");
                    mState = 0;
                    return;
                }
                mState = 3;
                if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
                    androidx.lifecycle.q0.f11640o.f11646i.c(mObserver);
                    mState = 0;
                    com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "uninit successfully");
                } else {
                    com.tencent.thumbplayer.utils.TPThreadPool.getInstance().postRunnableOnMainThread(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher.2
                        @Override // java.lang.Runnable
                        public void run() {
                            synchronized (com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher.class) {
                                if (com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher.mState != 3) {
                                    com.tencent.thumbplayer.utils.TPLogUtil.i(com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher.TAG, "stop uninit, current state:" + com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher.mState);
                                } else {
                                    androidx.lifecycle.q0.f11640o.f11646i.c(com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher.mObserver);
                                    int unused = com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher.mState = 0;
                                    com.tencent.thumbplayer.utils.TPLogUtil.i(com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher.TAG, "uninit successfully");
                                }
                            }
                        }
                    });
                }
                return;
            }
            com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "no need to uninit, current state:" + mState);
        }
    }
}

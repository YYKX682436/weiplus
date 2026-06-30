package com.tencent.thumbplayer.core.common;

/* loaded from: classes13.dex */
public class TPScreenRefreshRateDetector {
    public static final int DISPLAY_CHANGE = 10001;
    private static java.lang.String TAG = "TPScreenRefreshRateDetector";
    private static boolean isInitted;
    private static java.lang.ref.WeakReference<android.content.Context> mContext;
    private static android.os.Handler mHandler;
    private static android.view.WindowManager mWindowManager;
    private static java.util.List<com.tencent.thumbplayer.core.common.TPScreenRefreshRateDetector.ScreenRefreshRateChangedListener> listeners = new java.util.LinkedList();
    private static float mCurScreenRefreshRate = 60.0f;
    private static android.hardware.display.DisplayManager mDisplayManager = null;
    private static android.hardware.display.DisplayManager.DisplayListener mDisplayListener = new android.hardware.display.DisplayManager.DisplayListener() { // from class: com.tencent.thumbplayer.core.common.TPScreenRefreshRateDetector.2
        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i17) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i17) {
            if (i17 == 0) {
                com.tencent.thumbplayer.core.common.TPScreenRefreshRateDetector.mHandler.sendEmptyMessage(10001);
            }
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, com.tencent.thumbplayer.core.common.TPScreenRefreshRateDetector.TAG, "onDisplayChanged displayId:" + i17);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i17) {
        }
    };

    /* loaded from: classes13.dex */
    public interface ScreenRefreshRateChangedListener {
        void onScreenRefreshRateChanged(float f17);
    }

    public static void addListener(com.tencent.thumbplayer.core.common.TPScreenRefreshRateDetector.ScreenRefreshRateChangedListener screenRefreshRateChangedListener) {
        synchronized (com.tencent.thumbplayer.core.common.TPScreenRefreshRateDetector.class) {
            listeners.add(screenRefreshRateChangedListener);
        }
    }

    public static void deinit() {
        java.lang.ref.WeakReference<android.content.Context> weakReference;
        synchronized (com.tencent.thumbplayer.core.common.TPScreenRefreshRateDetector.class) {
            if (isInitted && (weakReference = mContext) != null) {
                weakReference.clear();
                isInitted = false;
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "TPScreenRefreshRateDetector deinit succeed!");
            }
        }
    }

    private static android.os.Looper getLooper() {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        return myLooper != null ? myLooper : android.os.Looper.getMainLooper();
    }

    public static float getScreenRefreshRate() {
        java.lang.ref.WeakReference<android.content.Context> weakReference = mContext;
        if (weakReference == null) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, "Current mContext is null, set default.");
            return mCurScreenRefreshRate;
        }
        android.content.Context context = weakReference.get();
        if (context != null) {
            if (mWindowManager == null) {
                mWindowManager = (android.view.WindowManager) context.getSystemService("window");
            }
            if (mDisplayManager == null) {
                android.hardware.display.DisplayManager displayManager = (android.hardware.display.DisplayManager) context.getSystemService("display");
                mDisplayManager = displayManager;
                displayManager.registerDisplayListener(mDisplayListener, mHandler);
            }
            android.view.WindowManager windowManager = mWindowManager;
            if (windowManager != null) {
                android.view.Display defaultDisplay = windowManager.getDefaultDisplay();
                android.view.Display.Mode[] supportedModes = defaultDisplay.getSupportedModes();
                android.view.Display.Mode mode = defaultDisplay.getMode();
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "getMode width:" + mode.getPhysicalWidth() + " height:" + mode.getPhysicalHeight() + " refreshRate:" + mode.getRefreshRate() + " ModeId:" + mode.getModeId());
                java.lang.String str = TAG;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getSupportedModes length:");
                sb6.append(supportedModes.length);
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, str, sb6.toString());
                for (int i17 = 0; i17 < supportedModes.length; i17++) {
                    com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "getSupportedModes width:" + supportedModes[i17].getPhysicalWidth() + " height:" + supportedModes[i17].getPhysicalHeight() + " refreshRate:" + supportedModes[i17].getRefreshRate() + " ModeId:" + supportedModes[i17].getModeId());
                }
                mCurScreenRefreshRate = mode.getRefreshRate();
            }
        }
        return mCurScreenRefreshRate;
    }

    public static void init(android.content.Context context) {
        synchronized (com.tencent.thumbplayer.core.common.TPScreenRefreshRateDetector.class) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "TPScreenRefreshRateDetector init enter!");
            if (isInitted) {
                return;
            }
            mContext = new java.lang.ref.WeakReference<>(context.getApplicationContext());
            isInitted = true;
            initHandleMsg();
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "TPScreenRefreshRateDetector init succeed!");
        }
    }

    public static void initHandleMsg() {
        mHandler = new android.os.Handler(getLooper()) { // from class: com.tencent.thumbplayer.core.common.TPScreenRefreshRateDetector.1
            @Override // android.os.Handler
            public void handleMessage(android.os.Message message) {
                if (message.what == 10001 && com.tencent.thumbplayer.core.common.TPScreenRefreshRateDetector.mDisplayManager != null) {
                    android.view.Display display = com.tencent.thumbplayer.core.common.TPScreenRefreshRateDetector.mDisplayManager.getDisplay(0);
                    java.lang.String mode = display.getMode().toString();
                    com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, com.tencent.thumbplayer.core.common.TPScreenRefreshRateDetector.TAG, "handleMessage DISPLAY_CHANGE, mode:" + mode.toString());
                    com.tencent.thumbplayer.core.common.TPScreenRefreshRateDetector.notifyScreenRefreshRateChange(display.getMode().getRefreshRate());
                }
                super.handleMessage(message);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void notifyScreenRefreshRateChange(float f17) {
        boolean z17;
        if (java.lang.Math.abs(f17 - mCurScreenRefreshRate) >= 1.0f) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "notifyScreenRefreshRateChange Change From " + mCurScreenRefreshRate + " to " + f17);
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17) {
            mCurScreenRefreshRate = f17;
            synchronized (com.tencent.thumbplayer.core.common.TPScreenRefreshRateDetector.class) {
                java.util.Iterator<com.tencent.thumbplayer.core.common.TPScreenRefreshRateDetector.ScreenRefreshRateChangedListener> it = listeners.iterator();
                while (it.hasNext()) {
                    it.next().onScreenRefreshRateChanged(f17);
                }
            }
        }
    }

    public static void removeListener(com.tencent.thumbplayer.core.common.TPScreenRefreshRateDetector.ScreenRefreshRateChangedListener screenRefreshRateChangedListener) {
        synchronized (com.tencent.thumbplayer.core.common.TPScreenRefreshRateDetector.class) {
            listeners.remove(screenRefreshRateChangedListener);
        }
    }
}

package com.tencent.paymars;

/* loaded from: classes12.dex */
public class BaseEvent {
    public static native void onCreate();

    public static native void onDestroy();

    public static native void onExceptionCrash();

    public static native void onForeground(boolean z17);

    public static native void onInitConfigBeforeOnCreate(int i17);

    public static native void onNetworkChange();

    public static native void onSingalCrash(int i17);
}

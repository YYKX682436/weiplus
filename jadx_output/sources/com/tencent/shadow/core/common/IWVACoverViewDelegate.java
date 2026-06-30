package com.tencent.shadow.core.common;

/* loaded from: classes.dex */
public interface IWVACoverViewDelegate {
    void onCreate(android.content.Context context, android.widget.FrameLayout frameLayout);

    default void onDestroy() {
    }

    default void onPause() {
    }

    default void onResume() {
    }

    default void onStart() {
    }

    default void onStop() {
    }
}

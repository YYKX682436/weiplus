package io.flutter.util;

/* loaded from: classes12.dex */
public final class HandlerCompat {
    public static android.os.Handler createAsyncHandler(android.os.Looper looper) {
        return android.os.Build.VERSION.SDK_INT >= 28 ? android.os.Handler.createAsync(looper) : new android.os.Handler(looper);
    }
}

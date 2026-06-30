package org.chromium.base;

@java.lang.FunctionalInterface
/* loaded from: classes13.dex */
public interface Callback<T> {

    /* loaded from: classes13.dex */
    public static abstract class Helper {
        public static void onBooleanResultFromNative(org.chromium.base.Callback callback, boolean z17) {
            callback.lambda$bind$0(java.lang.Boolean.valueOf(z17));
        }

        public static void onIntResultFromNative(org.chromium.base.Callback callback, int i17) {
            callback.lambda$bind$0(java.lang.Integer.valueOf(i17));
        }

        public static void onLongResultFromNative(org.chromium.base.Callback callback, long j17) {
            callback.lambda$bind$0(java.lang.Long.valueOf(j17));
        }

        public static void onObjectResultFromNative(org.chromium.base.Callback callback, java.lang.Object obj) {
            callback.lambda$bind$0(obj);
        }

        public static void onTimeResultFromNative(org.chromium.base.Callback callback, long j17) {
            callback.lambda$bind$0(java.lang.Long.valueOf(j17));
        }

        public static void runRunnable(java.lang.Runnable runnable) {
            runnable.run();
        }
    }

    default java.lang.Runnable bind(final T t17) {
        return new java.lang.Runnable() { // from class: org.chromium.base.Callback$$a
            @Override // java.lang.Runnable
            public final void run() {
                org.chromium.base.Callback.this.lambda$bind$0(t17);
            }
        };
    }

    /* renamed from: onResult, reason: merged with bridge method [inline-methods] */
    void lambda$bind$0(T t17);
}

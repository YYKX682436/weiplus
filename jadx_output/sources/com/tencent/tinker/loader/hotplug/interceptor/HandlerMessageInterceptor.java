package com.tencent.tinker.loader.hotplug.interceptor;

/* loaded from: classes13.dex */
public class HandlerMessageInterceptor extends com.tencent.tinker.loader.hotplug.interceptor.Interceptor<android.os.Handler.Callback> {
    private static java.lang.reflect.Field sMCallbackField;
    private final com.tencent.tinker.loader.hotplug.interceptor.HandlerMessageInterceptor.MessageHandler mMessageHandler;
    private final android.os.Handler mTarget;

    /* loaded from: classes13.dex */
    public static class CallbackWrapper implements android.os.Handler.Callback, com.tencent.tinker.loader.hotplug.interceptor.Interceptor.ITinkerHotplugProxy {
        private volatile boolean mIsInHandleMethod = false;
        private final com.tencent.tinker.loader.hotplug.interceptor.HandlerMessageInterceptor.MessageHandler mMessageHandler;
        private final android.os.Handler.Callback mOrigCallback;

        public CallbackWrapper(com.tencent.tinker.loader.hotplug.interceptor.HandlerMessageInterceptor.MessageHandler messageHandler, android.os.Handler.Callback callback) {
            this.mMessageHandler = messageHandler;
            this.mOrigCallback = callback;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message message) {
            if (this.mIsInHandleMethod) {
                return false;
            }
            boolean z17 = true;
            this.mIsInHandleMethod = true;
            if (!this.mMessageHandler.handleMessage(message)) {
                android.os.Handler.Callback callback = this.mOrigCallback;
                z17 = callback != null ? callback.handleMessage(message) : false;
            }
            this.mIsInHandleMethod = false;
            return z17;
        }
    }

    /* loaded from: classes13.dex */
    public interface MessageHandler {
        boolean handleMessage(android.os.Message message);
    }

    static {
        synchronized (com.tencent.tinker.loader.hotplug.interceptor.HandlerMessageInterceptor.class) {
            if (sMCallbackField == null) {
                try {
                    sMCallbackField = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField((java.lang.Class<?>) android.os.Handler.class, "mCallback");
                } catch (java.lang.Throwable unused) {
                }
            }
        }
    }

    public HandlerMessageInterceptor(android.os.Handler handler, com.tencent.tinker.loader.hotplug.interceptor.HandlerMessageInterceptor.MessageHandler messageHandler) {
        this.mTarget = handler;
        this.mMessageHandler = messageHandler;
    }

    @Override // com.tencent.tinker.loader.hotplug.interceptor.Interceptor
    public android.os.Handler.Callback decorate(android.os.Handler.Callback callback) {
        return (callback == null || !com.tencent.tinker.loader.hotplug.interceptor.Interceptor.ITinkerHotplugProxy.class.isAssignableFrom(callback.getClass())) ? new com.tencent.tinker.loader.hotplug.interceptor.HandlerMessageInterceptor.CallbackWrapper(this.mMessageHandler, callback) : callback;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.tinker.loader.hotplug.interceptor.Interceptor
    public android.os.Handler.Callback fetchTarget() {
        return (android.os.Handler.Callback) sMCallbackField.get(this.mTarget);
    }

    @Override // com.tencent.tinker.loader.hotplug.interceptor.Interceptor
    public void inject(android.os.Handler.Callback callback) {
        sMCallbackField.set(this.mTarget, callback);
    }
}

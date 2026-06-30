package com.tencent.thumbplayer.utils;

/* loaded from: classes13.dex */
public class TPThreadSwitch {
    private static final int API_CALL_TIME_OUT_MS = 500;
    private static final boolean ENV_DEBUG = false;
    private java.lang.Class<?> mClass;
    private com.tencent.thumbplayer.utils.TPThreadSwitch.EventHandler mEventHandler;
    private java.lang.Object mHandleListener;
    private com.tencent.thumbplayer.utils.TPReadWriteLock mLock = new com.tencent.thumbplayer.utils.TPReadWriteLock();
    private java.lang.String mLogTag;
    private android.os.Looper mLooper;

    /* loaded from: classes13.dex */
    public class EventHandler extends android.os.Handler {
        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            com.tencent.thumbplayer.utils.TPThreadSwitch.this.handleEventMessage(message);
        }

        private EventHandler(android.os.Looper looper) {
            super(looper);
        }
    }

    /* loaded from: classes13.dex */
    public static class MessageParams {
        java.lang.Object params;
        com.tencent.thumbplayer.utils.TPFutureResult result;

        private MessageParams() {
        }
    }

    public TPThreadSwitch(java.lang.String str, android.os.Looper looper, java.lang.Object obj) {
        this.mLogTag = str;
        this.mLooper = looper;
        this.mEventHandler = new com.tencent.thumbplayer.utils.TPThreadSwitch.EventHandler(this.mLooper);
        this.mHandleListener = obj;
        java.lang.Class<?> cls = obj.getClass();
        this.mClass = cls;
        if (com.tencent.thumbplayer.utils.TPThreadAnnotations.register(cls, 0)) {
            return;
        }
        com.tencent.thumbplayer.utils.TPLogUtil.e(this.mLogTag, "Register " + this.mClass.getName() + " @ThreadSwitch method failed, version: 2.33.0.1206");
        throw new java.lang.RuntimeException("register @ThreadSwitch method failed, player can not work");
    }

    private java.lang.Object dealResult(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        if (obj != null) {
            return obj;
        }
        java.lang.String name = com.tencent.thumbplayer.utils.TPThreadAnnotations.getMethod(this.mClass, str, getMethodParams(obj2)).getReturnType().getName();
        if (name.equals(com.tencent.tmassistantsdk.downloadservice.DownloadSetting.TYPE_BOOLEAN)) {
            return java.lang.Boolean.FALSE;
        }
        if (name.equals("int")) {
            return 0;
        }
        if (name.equals("long")) {
            return 0L;
        }
        if (name.equals("float")) {
            return java.lang.Float.valueOf(0.0f);
        }
        return null;
    }

    private java.lang.Object[] getMethodParams(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof com.tencent.thumbplayer.utils.TPThreadSwitch.MessageParams)) {
            return (java.lang.Object[]) obj;
        }
        java.lang.Object obj2 = ((com.tencent.thumbplayer.utils.TPThreadSwitch.MessageParams) obj).params;
        if (obj2 == null) {
            return null;
        }
        return (java.lang.Object[]) obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleEventMessage(android.os.Message message) {
        if (this.mHandleListener == null) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(this.mLogTag, "handle listener is null, return");
        } else {
            invokeMethod(message.what, message.obj);
        }
    }

    private boolean internalMessage(int i17, java.lang.Object obj) {
        return internalMessage(i17, 0, 0, obj, false, false, 0L);
    }

    private java.lang.Object internalMessageLock(int i17, int i18, int i19, java.lang.Object obj, boolean z17, boolean z18, long j17) {
        com.tencent.thumbplayer.utils.TPFutureResult tPFutureResult = new com.tencent.thumbplayer.utils.TPFutureResult();
        com.tencent.thumbplayer.utils.TPThreadSwitch.MessageParams messageParams = new com.tencent.thumbplayer.utils.TPThreadSwitch.MessageParams();
        messageParams.params = obj;
        messageParams.result = tPFutureResult;
        internalMessage(i17, i18, i19, messageParams, z17, z18, j17);
        return tPFutureResult.getResult(500L);
    }

    private void invokeMethod(int i17, java.lang.Object obj) {
        com.tencent.thumbplayer.utils.TPFutureResult tPFutureResult = obj instanceof com.tencent.thumbplayer.utils.TPThreadSwitch.MessageParams ? ((com.tencent.thumbplayer.utils.TPThreadSwitch.MessageParams) obj).result : null;
        java.lang.reflect.Method methodByMsgId = com.tencent.thumbplayer.utils.TPThreadAnnotations.getMethodByMsgId(this.mClass, i17);
        if (methodByMsgId == null) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(this.mLogTag, "invokeMethod, handle method name is empty, msg:" + i17);
            if (tPFutureResult != null) {
                tPFutureResult.setException(new java.lang.RuntimeException("invokeMethod, handle method name is empty"));
                return;
            }
            return;
        }
        try {
            java.lang.Object invoke = methodByMsgId.getParameterTypes().length == 0 ? methodByMsgId.invoke(this.mHandleListener, new java.lang.Object[0]) : methodByMsgId.invoke(this.mHandleListener, getMethodParams(obj));
            if (tPFutureResult != null) {
                tPFutureResult.setResult(invoke);
            }
        } catch (java.lang.reflect.InvocationTargetException e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(this.mLogTag, "invokeMethod " + methodByMsgId.getName() + " has excecption: " + e17.getTargetException().toString());
            if (tPFutureResult == null) {
                return;
            }
            if (e17.getTargetException() instanceof java.lang.IllegalArgumentException) {
                tPFutureResult.setException(new java.lang.IllegalArgumentException("invokeMethod " + methodByMsgId.getName() + " failed, params invalid", e17.getCause()));
                return;
            }
            if (!(e17.getTargetException() instanceof java.lang.IllegalStateException)) {
                tPFutureResult.setException(e17.getTargetException());
                return;
            }
            tPFutureResult.setException(new java.lang.IllegalStateException("invokeMethod " + methodByMsgId.getName() + " failed, state invalid", e17.getCause()));
        } catch (java.lang.Exception e18) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(this.mLogTag, "invokeMethod " + methodByMsgId.getName() + " has excecption: " + e18.toString());
            if (tPFutureResult != null) {
                tPFutureResult.setException(e18);
            }
        }
    }

    private boolean isSameLooper() {
        return android.os.Looper.myLooper() == this.mLooper;
    }

    private java.lang.String messageToCommand(int i17) {
        java.lang.String api = com.tencent.thumbplayer.utils.TPThreadAnnotations.getApi(this.mClass, i17);
        if (!android.text.TextUtils.isEmpty(api) && !api.equals(com.eclipsesource.mmv8.Platform.UNKNOWN)) {
            return api;
        }
        return i17 + " not find";
    }

    private void recycle() {
        this.mEventHandler.removeCallbacksAndMessages(null);
    }

    public java.lang.Object dealThreadSwitch(java.lang.String str, java.lang.Object obj) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(this.mLogTag, "dealThreadSwitch failed , methodName is null");
            throw new java.lang.RuntimeException("dealThreadSwitch failed , methodName is null");
        }
        int methodMsgId = com.tencent.thumbplayer.utils.TPThreadAnnotations.getMethodMsgId(this.mClass, str, getMethodParams(obj));
        if (methodMsgId >= 0) {
            boolean removeRepeat = com.tencent.thumbplayer.utils.TPThreadAnnotations.removeRepeat(this.mClass, methodMsgId);
            boolean checkObj = com.tencent.thumbplayer.utils.TPThreadAnnotations.checkObj(this.mClass, methodMsgId);
            if (com.tencent.thumbplayer.utils.TPThreadAnnotations.isNeedWait(this.mClass, methodMsgId)) {
                return internalMessageLock(methodMsgId, 0, 0, obj, checkObj, removeRepeat, 0L);
            }
            internalMessage(methodMsgId, 0, 0, obj, checkObj, removeRepeat, 0L);
            return null;
        }
        com.tencent.thumbplayer.utils.TPLogUtil.e(this.mLogTag, "dealThreadSwitch failed , not match method:" + str);
        throw new java.lang.RuntimeException("dealThreadSwitch failed , not match method:" + str);
    }

    public java.lang.Object dealThreadSwitchWithResult(java.lang.String str, java.lang.Object obj) {
        return dealResult(str, dealThreadSwitch(str, obj), obj);
    }

    private boolean internalMessage(int i17, int i18, int i19, java.lang.Object obj, boolean z17, boolean z18, long j17) {
        if (this.mEventHandler == null) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(this.mLogTag, messageToCommand(i17) + " , send failed , handler null");
            return false;
        }
        if (z17 && obj == null) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(this.mLogTag, messageToCommand(i17) + ", send failed , params null");
            return false;
        }
        if (!this.mLooper.getThread().isAlive()) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(this.mLogTag, messageToCommand(i17) + ", send failed , thread had dead");
            return false;
        }
        if (!isSameLooper()) {
            this.mLock.readLock().lock();
        }
        if (z18) {
            this.mEventHandler.removeMessages(i17);
        }
        android.os.Message obtainMessage = this.mEventHandler.obtainMessage();
        obtainMessage.what = i17;
        obtainMessage.arg1 = i18;
        obtainMessage.arg2 = i19;
        obtainMessage.obj = obj;
        if (isSameLooper()) {
            handleEventMessage(obtainMessage);
            return true;
        }
        this.mEventHandler.sendMessageDelayed(obtainMessage, j17);
        this.mLock.readLock().unlock();
        return true;
    }
}

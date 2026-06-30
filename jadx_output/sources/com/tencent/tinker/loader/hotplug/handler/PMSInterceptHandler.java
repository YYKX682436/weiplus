package com.tencent.tinker.loader.hotplug.handler;

/* loaded from: classes13.dex */
public class PMSInterceptHandler implements com.tencent.tinker.loader.hotplug.interceptor.ServiceBinderInterceptor.BinderInvocationHandler {
    private static final java.lang.String TAG = "Tinker.PMSIntrcptHndlr";

    private java.lang.Object handleGetActivityInfo(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        android.content.ComponentName componentName;
        java.lang.Class<?>[] exceptionTypes = method.getExceptionTypes();
        try {
            java.lang.Object invoke = method.invoke(obj, objArr);
            if (invoke != null) {
                return invoke;
            }
            int i17 = 0;
            while (true) {
                if (i17 >= objArr.length) {
                    componentName = null;
                    break;
                }
                if (objArr[i17] instanceof android.content.ComponentName) {
                    com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(TAG, "locate componentName field of " + method.getName() + " done at idx: " + i17, new java.lang.Object[0]);
                    componentName = (android.content.ComponentName) objArr[i17];
                    break;
                }
                i17++;
            }
            if (componentName != null) {
                return com.tencent.tinker.loader.hotplug.IncrementComponentManager.queryActivityInfo(componentName.getClassName());
            }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.w(TAG, "failed to locate componentName field of " + method.getName() + ", notice any crashes or mistakes after resolve works.", new java.lang.Object[0]);
            return null;
        } catch (java.lang.reflect.InvocationTargetException e17) {
            e = e17;
            java.lang.Throwable targetException = e.getTargetException();
            if (exceptionTypes != null && exceptionTypes.length > 0) {
                if (targetException != null) {
                    throw targetException;
                }
                throw e;
            }
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            if (targetException != null) {
                e = targetException;
            }
            objArr2[0] = e;
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(TAG, "unexpected exception.", objArr2);
            return null;
        } catch (java.lang.Throwable th6) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(TAG, "unexpected exception.", th6);
            return null;
        }
    }

    private java.lang.Object handleResolveIntent(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        android.content.Intent intent;
        java.lang.Class<?>[] exceptionTypes = method.getExceptionTypes();
        try {
            java.lang.Object invoke = method.invoke(obj, objArr);
            if (invoke != null) {
                return invoke;
            }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.w(TAG, "failed to resolve activity in base package, try again in patch package.", new java.lang.Object[0]);
            int i17 = 0;
            while (true) {
                if (i17 >= objArr.length) {
                    intent = null;
                    break;
                }
                if (objArr[i17] instanceof android.content.Intent) {
                    com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(TAG, "locate intent field of " + method.getName() + " done at idx: " + i17, new java.lang.Object[0]);
                    intent = (android.content.Intent) objArr[i17];
                    break;
                }
                i17++;
            }
            if (intent != null) {
                return com.tencent.tinker.loader.hotplug.IncrementComponentManager.resolveIntent(intent);
            }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.w(TAG, "failed to locate intent field of " + method.getName() + ", notice any crashes or mistakes after resolve works.", new java.lang.Object[0]);
            return null;
        } catch (java.lang.reflect.InvocationTargetException e17) {
            e = e17;
            java.lang.Throwable targetException = e.getTargetException();
            if (exceptionTypes != null && exceptionTypes.length > 0) {
                if (targetException != null) {
                    throw targetException;
                }
                throw e;
            }
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            if (targetException != null) {
                e = targetException;
            }
            objArr2[0] = e;
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(TAG, "unexpected exception.", objArr2);
            return null;
        } catch (java.lang.Throwable th6) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(TAG, "unexpected exception.", th6);
            return null;
        }
    }

    @Override // com.tencent.tinker.loader.hotplug.interceptor.ServiceBinderInterceptor.BinderInvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        java.lang.String name = method.getName();
        return "getActivityInfo".equals(name) ? handleGetActivityInfo(obj, method, objArr) : "resolveIntent".equals(name) ? handleResolveIntent(obj, method, objArr) : method.invoke(obj, objArr);
    }
}

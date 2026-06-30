package com.tencent.tinker.loader.hotplug.interceptor;

/* loaded from: classes13.dex */
public class ServiceBinderInterceptor extends com.tencent.tinker.loader.hotplug.interceptor.Interceptor<android.os.IBinder> {
    private static final java.lang.String TAG = "Tinker.SvcBndrIntrcptr";
    private static java.lang.reflect.Method sGetServiceMethod;
    private static java.lang.reflect.Field sSCacheField;
    private static java.lang.Class<?> sServiceManagerClazz;
    private final android.content.Context mBaseContext;
    private final com.tencent.tinker.loader.hotplug.interceptor.ServiceBinderInterceptor.BinderInvocationHandler mBinderInvocationHandler;
    private final java.lang.String mServiceName;

    /* loaded from: classes13.dex */
    public interface BinderInvocationHandler {
        java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr);
    }

    /* loaded from: classes13.dex */
    public static class FakeClientBinderHandler implements java.lang.reflect.InvocationHandler {
        private final com.tencent.tinker.loader.hotplug.interceptor.ServiceBinderInterceptor.BinderInvocationHandler mBinderInvocationHandler;
        private final android.os.IBinder mOriginalClientBinder;

        public FakeClientBinderHandler(android.os.IBinder iBinder, com.tencent.tinker.loader.hotplug.interceptor.ServiceBinderInterceptor.BinderInvocationHandler binderInvocationHandler) {
            this.mOriginalClientBinder = iBinder;
            this.mBinderInvocationHandler = binderInvocationHandler;
        }

        @Override // java.lang.reflect.InvocationHandler
        public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
            if (!"queryLocalInterface".equals(method.getName())) {
                return method.invoke(this.mOriginalClientBinder, objArr);
            }
            java.lang.String interfaceDescriptor = this.mOriginalClientBinder.getInterfaceDescriptor();
            android.os.IInterface iInterface = (android.os.IInterface) com.tencent.tinker.loader.shareutil.ShareReflectUtil.findMethod(java.lang.Class.forName(interfaceDescriptor.equals("android.app.IActivityManager") ? "android.app.ActivityManagerNative" : interfaceDescriptor.concat("$Stub")), "asInterface", (java.lang.Class<?>[]) new java.lang.Class[]{android.os.IBinder.class}).invoke(null, this.mOriginalClientBinder);
            return com.tencent.tinker.loader.hotplug.interceptor.ServiceBinderInterceptor.createProxy(com.tencent.tinker.loader.hotplug.interceptor.ServiceBinderInterceptor.getAllInterfacesThroughDeriveChain(iInterface.getClass()), new com.tencent.tinker.loader.hotplug.interceptor.ServiceBinderInterceptor.FakeInterfaceHandler(iInterface, (android.os.IBinder) obj, this.mBinderInvocationHandler));
        }
    }

    /* loaded from: classes13.dex */
    public static class FakeInterfaceHandler implements java.lang.reflect.InvocationHandler {
        private final com.tencent.tinker.loader.hotplug.interceptor.ServiceBinderInterceptor.BinderInvocationHandler mBinderInvocationHandler;
        private final android.os.IBinder mOriginalClientBinder;
        private final android.os.IInterface mOriginalInterface;

        public FakeInterfaceHandler(android.os.IInterface iInterface, android.os.IBinder iBinder, com.tencent.tinker.loader.hotplug.interceptor.ServiceBinderInterceptor.BinderInvocationHandler binderInvocationHandler) {
            this.mOriginalInterface = iInterface;
            this.mOriginalClientBinder = iBinder;
            this.mBinderInvocationHandler = binderInvocationHandler;
        }

        @Override // java.lang.reflect.InvocationHandler
        public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
            return "asBinder".equals(method.getName()) ? this.mOriginalClientBinder : this.mBinderInvocationHandler.invoke(this.mOriginalInterface, method, objArr);
        }
    }

    static {
        synchronized (com.tencent.tinker.loader.hotplug.interceptor.ServiceBinderInterceptor.class) {
            if (sServiceManagerClazz == null) {
                try {
                    java.lang.Class<?> cls = java.lang.Class.forName("android.os.ServiceManager");
                    sServiceManagerClazz = cls;
                    sSCacheField = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField(cls, "sCache");
                    sGetServiceMethod = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findMethod(sServiceManagerClazz, "getService", (java.lang.Class<?>[]) new java.lang.Class[]{java.lang.String.class});
                } catch (java.lang.Throwable th6) {
                    com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(TAG, "unexpected exception.", th6);
                }
            }
        }
    }

    public ServiceBinderInterceptor(android.content.Context context, java.lang.String str, com.tencent.tinker.loader.hotplug.interceptor.ServiceBinderInterceptor.BinderInvocationHandler binderInvocationHandler) {
        while (context != null && (context instanceof android.content.ContextWrapper)) {
            context = ((android.content.ContextWrapper) context).getBaseContext();
        }
        this.mBaseContext = context;
        this.mServiceName = str;
        this.mBinderInvocationHandler = binderInvocationHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T createProxy(java.lang.Class<?>[] clsArr, java.lang.reflect.InvocationHandler invocationHandler) {
        int length = clsArr.length + 1;
        java.lang.Class[] clsArr2 = new java.lang.Class[length];
        java.lang.System.arraycopy(clsArr, 0, clsArr2, 0, clsArr.length);
        clsArr2[clsArr.length] = com.tencent.tinker.loader.hotplug.interceptor.Interceptor.ITinkerHotplugProxy.class;
        try {
            return (T) java.lang.reflect.Proxy.newProxyInstance(java.lang.Thread.currentThread().getContextClassLoader(), clsArr2, invocationHandler);
        } catch (java.lang.Throwable th6) {
            final java.util.HashSet hashSet = new java.util.HashSet(4);
            for (int i17 = 0; i17 < length; i17++) {
                hashSet.add(clsArr2[i17].getClassLoader());
            }
            java.lang.ClassLoader classLoader = hashSet.size() == 1 ? (java.lang.ClassLoader) hashSet.iterator().next() : new java.lang.ClassLoader() { // from class: com.tencent.tinker.loader.hotplug.interceptor.ServiceBinderInterceptor.1
                @Override // java.lang.ClassLoader
                public java.lang.Class<?> loadClass(java.lang.String str, boolean z17) {
                    java.util.Iterator it = hashSet.iterator();
                    java.lang.Class<?> cls = null;
                    while (it.hasNext()) {
                        try {
                            cls = ((java.lang.ClassLoader) it.next()).loadClass(str);
                        } catch (java.lang.Throwable unused) {
                        }
                        if (cls != null) {
                            return cls;
                        }
                    }
                    throw new java.lang.ClassNotFoundException("cannot find class: " + str);
                }
            };
            return (T) java.lang.reflect.Proxy.newProxyInstance(classLoader, clsArr2, invocationHandler);
        }
    }

    private static void fixAMSBinderCache(android.os.IBinder iBinder) {
        java.lang.Object obj;
        try {
            obj = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField(java.lang.Class.forName("android.app.ActivityManagerNative"), "gDefault").get(null);
        } catch (java.lang.Throwable unused) {
            obj = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField(java.lang.Class.forName("android.app.ActivityManager"), "IActivityManagerSingleton").get(null);
        }
        java.lang.reflect.Field findField = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField(obj, "mInstance");
        android.os.IInterface iInterface = (android.os.IInterface) findField.get(obj);
        if (iInterface == null || com.tencent.tinker.loader.hotplug.interceptor.Interceptor.ITinkerHotplugProxy.class.isAssignableFrom(iInterface.getClass())) {
            return;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(iBinder.getInterfaceDescriptor());
        if (queryLocalInterface != null && com.tencent.tinker.loader.hotplug.interceptor.Interceptor.ITinkerHotplugProxy.class.isAssignableFrom(queryLocalInterface.getClass())) {
            findField.set(obj, queryLocalInterface);
            return;
        }
        throw new java.lang.IllegalStateException("fakeBinder does not return fakeInterface, binder: " + iBinder + ", itf: " + queryLocalInterface);
    }

    private static void fixPMSBinderCache(android.content.Context context, android.os.IBinder iBinder) {
        java.lang.reflect.Field findField = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField(java.lang.Class.forName("android.app.ActivityThread"), "sPackageManager");
        android.os.IInterface iInterface = (android.os.IInterface) findField.get(null);
        if (iInterface != null && !com.tencent.tinker.loader.hotplug.interceptor.Interceptor.ITinkerHotplugProxy.class.isAssignableFrom(iInterface.getClass())) {
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(iBinder.getInterfaceDescriptor());
            if (queryLocalInterface == null || !com.tencent.tinker.loader.hotplug.interceptor.Interceptor.ITinkerHotplugProxy.class.isAssignableFrom(queryLocalInterface.getClass())) {
                throw new java.lang.IllegalStateException("fakeBinder does not return fakeInterface, binder: " + iBinder + ", itf: " + queryLocalInterface);
            }
            findField.set(null, queryLocalInterface);
        }
        java.lang.reflect.Field findField2 = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField(java.lang.Class.forName("android.app.ApplicationPackageManager"), "mPM");
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        android.os.IInterface iInterface2 = (android.os.IInterface) findField2.get(packageManager);
        if (iInterface2 == null || com.tencent.tinker.loader.hotplug.interceptor.Interceptor.ITinkerHotplugProxy.class.isAssignableFrom(iInterface2.getClass())) {
            return;
        }
        android.os.IInterface queryLocalInterface2 = iBinder.queryLocalInterface(iBinder.getInterfaceDescriptor());
        if (queryLocalInterface2 != null && com.tencent.tinker.loader.hotplug.interceptor.Interceptor.ITinkerHotplugProxy.class.isAssignableFrom(queryLocalInterface2.getClass())) {
            findField2.set(packageManager, queryLocalInterface2);
            return;
        }
        throw new java.lang.IllegalStateException("fakeBinder does not return fakeInterface, binder: " + iBinder + ", itf: " + queryLocalInterface2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.Class<?>[] getAllInterfacesThroughDeriveChain(java.lang.Class<?> cls) {
        if (cls == null) {
            return null;
        }
        java.util.HashSet hashSet = new java.util.HashSet(10);
        while (!java.lang.Object.class.equals(cls)) {
            hashSet.addAll(java.util.Arrays.asList(cls.getInterfaces()));
            cls = cls.getSuperclass();
        }
        return (java.lang.Class[]) hashSet.toArray(new java.lang.Class[hashSet.size()]);
    }

    @Override // com.tencent.tinker.loader.hotplug.interceptor.Interceptor
    public android.os.IBinder decorate(android.os.IBinder iBinder) {
        if (iBinder != null) {
            return com.tencent.tinker.loader.hotplug.interceptor.Interceptor.ITinkerHotplugProxy.class.isAssignableFrom(iBinder.getClass()) ? iBinder : (android.os.IBinder) createProxy(getAllInterfacesThroughDeriveChain(iBinder.getClass()), new com.tencent.tinker.loader.hotplug.interceptor.ServiceBinderInterceptor.FakeClientBinderHandler(iBinder, this.mBinderInvocationHandler));
        }
        throw new java.lang.IllegalStateException("target is null.");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.tinker.loader.hotplug.interceptor.Interceptor
    public android.os.IBinder fetchTarget() {
        return (android.os.IBinder) sGetServiceMethod.invoke(null, this.mServiceName);
    }

    @Override // com.tencent.tinker.loader.hotplug.interceptor.Interceptor
    public void inject(android.os.IBinder iBinder) {
        ((java.util.Map) sSCacheField.get(null)).put(this.mServiceName, iBinder);
        if (com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME.equals(this.mServiceName)) {
            fixAMSBinderCache(iBinder);
        } else if ("package".equals(this.mServiceName)) {
            fixPMSBinderCache(this.mBaseContext, iBinder);
        }
    }
}

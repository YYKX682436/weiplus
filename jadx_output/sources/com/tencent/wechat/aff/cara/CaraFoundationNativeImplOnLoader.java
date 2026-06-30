package com.tencent.wechat.aff.cara;

/* loaded from: classes16.dex */
public class CaraFoundationNativeImplOnLoader {
    private static com.tencent.wechat.aff.cara.CaraFoundationNativeImplOnLoader instance = new com.tencent.wechat.aff.cara.CaraFoundationNativeImplOnLoader();
    private static java.lang.Class<?> caraUserContextRegistedClass = null;
    private static java.lang.Class<?> caraNativeAppRegistedClass = null;
    private static java.lang.Class<?> caraAndroidSoRegistedClass = null;
    private static java.lang.Class<?> caraNativeDeviceRegistedClass = null;

    public static void createCaraAndroidSo(java.lang.Object obj) {
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        try {
            java.lang.reflect.Constructor<?> declaredConstructor = caraAndroidSoRegistedClass.getDeclaredConstructor(new java.lang.Class[0]);
            declaredConstructor.setAccessible(true);
            java.lang.Object newInstance = declaredConstructor.newInstance(new java.lang.Object[0]);
            zidlBaseBridge.attachStub(newInstance);
            java.lang.String.valueOf(newInstance);
        } catch (java.lang.Exception e17) {
            java.lang.String.valueOf(e17);
        }
    }

    public static void createCaraNativeApp(java.lang.Object obj) {
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        try {
            java.lang.reflect.Constructor<?> declaredConstructor = caraNativeAppRegistedClass.getDeclaredConstructor(new java.lang.Class[0]);
            declaredConstructor.setAccessible(true);
            java.lang.Object newInstance = declaredConstructor.newInstance(new java.lang.Object[0]);
            zidlBaseBridge.attachStub(newInstance);
            java.lang.String.valueOf(newInstance);
        } catch (java.lang.Exception e17) {
            java.lang.String.valueOf(e17);
        }
    }

    public static void createCaraNativeDevice(java.lang.Object obj) {
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        try {
            java.lang.reflect.Constructor<?> declaredConstructor = caraNativeDeviceRegistedClass.getDeclaredConstructor(new java.lang.Class[0]);
            declaredConstructor.setAccessible(true);
            java.lang.Object newInstance = declaredConstructor.newInstance(new java.lang.Object[0]);
            zidlBaseBridge.attachStub(newInstance);
            java.lang.String.valueOf(newInstance);
        } catch (java.lang.Exception e17) {
            java.lang.String.valueOf(e17);
        }
    }

    public static void createCaraUserContext(java.lang.Object obj) {
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        try {
            java.lang.reflect.Constructor<?> declaredConstructor = caraUserContextRegistedClass.getDeclaredConstructor(new java.lang.Class[0]);
            declaredConstructor.setAccessible(true);
            java.lang.Object newInstance = declaredConstructor.newInstance(new java.lang.Object[0]);
            zidlBaseBridge.attachStub(newInstance);
            java.lang.String.valueOf(newInstance);
        } catch (java.lang.Exception e17) {
            java.lang.String.valueOf(e17);
        }
    }

    public static com.tencent.wechat.aff.cara.CaraFoundationNativeImplOnLoader getInstance() {
        return instance;
    }

    public void onLoader() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void registerCaraAndroidSo(java.lang.Class<T> cls) {
        caraAndroidSoRegistedClass = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void registerCaraNativeApp(java.lang.Class<T> cls) {
        caraNativeAppRegistedClass = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void registerCaraNativeDevice(java.lang.Class<T> cls) {
        caraNativeDeviceRegistedClass = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void registerCaraUserContext(java.lang.Class<T> cls) {
        caraUserContextRegistedClass = cls;
    }
}

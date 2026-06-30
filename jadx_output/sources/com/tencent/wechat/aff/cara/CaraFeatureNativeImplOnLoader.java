package com.tencent.wechat.aff.cara;

/* loaded from: classes16.dex */
public class CaraFeatureNativeImplOnLoader {
    private static com.tencent.wechat.aff.cara.CaraFeatureNativeImplOnLoader instance = new com.tencent.wechat.aff.cara.CaraFeatureNativeImplOnLoader();
    private static java.lang.Class<?> caraNativeFeatureCenterRegistedClass = null;
    private static java.lang.Class<?> caraNativeAccountFeatureCenterRegistedClass = null;
    private static java.lang.Class<?> caraNativeDiscoverViewFeatureCenterRegistedClass = null;
    private static java.lang.Class<?> caraNativeLiveFeatureCenterRegistedClass = null;
    private static java.lang.Class<?> caraNativeContactFeatureCenterRegistedClass = null;
    private static java.lang.Class<?> caraNativeSessionFeatureCenterRegistedClass = null;
    private static java.lang.Class<?> caraNativeFinderFeatureCenterRegistedClass = null;

    public static void createCaraNativeAccountFeatureCenter(java.lang.Object obj) {
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        try {
            java.lang.reflect.Constructor<?> declaredConstructor = caraNativeAccountFeatureCenterRegistedClass.getDeclaredConstructor(new java.lang.Class[0]);
            declaredConstructor.setAccessible(true);
            java.lang.Object newInstance = declaredConstructor.newInstance(new java.lang.Object[0]);
            zidlBaseBridge.attachStub(newInstance);
            java.lang.String.valueOf(newInstance);
        } catch (java.lang.Exception e17) {
            java.lang.String.valueOf(e17);
        }
    }

    public static void createCaraNativeContactFeatureCenter(java.lang.Object obj) {
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        try {
            java.lang.reflect.Constructor<?> declaredConstructor = caraNativeContactFeatureCenterRegistedClass.getDeclaredConstructor(new java.lang.Class[0]);
            declaredConstructor.setAccessible(true);
            java.lang.Object newInstance = declaredConstructor.newInstance(new java.lang.Object[0]);
            zidlBaseBridge.attachStub(newInstance);
            java.lang.String.valueOf(newInstance);
        } catch (java.lang.Exception e17) {
            java.lang.String.valueOf(e17);
        }
    }

    public static void createCaraNativeDiscoverViewFeatureCenter(java.lang.Object obj) {
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        try {
            java.lang.reflect.Constructor<?> declaredConstructor = caraNativeDiscoverViewFeatureCenterRegistedClass.getDeclaredConstructor(new java.lang.Class[0]);
            declaredConstructor.setAccessible(true);
            java.lang.Object newInstance = declaredConstructor.newInstance(new java.lang.Object[0]);
            zidlBaseBridge.attachStub(newInstance);
            java.lang.String.valueOf(newInstance);
        } catch (java.lang.Exception e17) {
            java.lang.String.valueOf(e17);
        }
    }

    public static void createCaraNativeFeatureCenter(java.lang.Object obj) {
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        try {
            java.lang.reflect.Constructor<?> declaredConstructor = caraNativeFeatureCenterRegistedClass.getDeclaredConstructor(new java.lang.Class[0]);
            declaredConstructor.setAccessible(true);
            java.lang.Object newInstance = declaredConstructor.newInstance(new java.lang.Object[0]);
            zidlBaseBridge.attachStub(newInstance);
            java.lang.String.valueOf(newInstance);
        } catch (java.lang.Exception e17) {
            java.lang.String.valueOf(e17);
        }
    }

    public static void createCaraNativeFinderFeatureCenter(java.lang.Object obj) {
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        try {
            java.lang.reflect.Constructor<?> declaredConstructor = caraNativeFinderFeatureCenterRegistedClass.getDeclaredConstructor(new java.lang.Class[0]);
            declaredConstructor.setAccessible(true);
            java.lang.Object newInstance = declaredConstructor.newInstance(new java.lang.Object[0]);
            zidlBaseBridge.attachStub(newInstance);
            java.lang.String.valueOf(newInstance);
        } catch (java.lang.Exception e17) {
            java.lang.String.valueOf(e17);
        }
    }

    public static void createCaraNativeLiveFeatureCenter(java.lang.Object obj) {
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        try {
            java.lang.reflect.Constructor<?> declaredConstructor = caraNativeLiveFeatureCenterRegistedClass.getDeclaredConstructor(new java.lang.Class[0]);
            declaredConstructor.setAccessible(true);
            java.lang.Object newInstance = declaredConstructor.newInstance(new java.lang.Object[0]);
            zidlBaseBridge.attachStub(newInstance);
            java.lang.String.valueOf(newInstance);
        } catch (java.lang.Exception e17) {
            java.lang.String.valueOf(e17);
        }
    }

    public static void createCaraNativeSessionFeatureCenter(java.lang.Object obj) {
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        try {
            java.lang.reflect.Constructor<?> declaredConstructor = caraNativeSessionFeatureCenterRegistedClass.getDeclaredConstructor(new java.lang.Class[0]);
            declaredConstructor.setAccessible(true);
            java.lang.Object newInstance = declaredConstructor.newInstance(new java.lang.Object[0]);
            zidlBaseBridge.attachStub(newInstance);
            java.lang.String.valueOf(newInstance);
        } catch (java.lang.Exception e17) {
            java.lang.String.valueOf(e17);
        }
    }

    public static com.tencent.wechat.aff.cara.CaraFeatureNativeImplOnLoader getInstance() {
        return instance;
    }

    public void onLoader() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void registerCaraNativeAccountFeatureCenter(java.lang.Class<T> cls) {
        caraNativeAccountFeatureCenterRegistedClass = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void registerCaraNativeContactFeatureCenter(java.lang.Class<T> cls) {
        caraNativeContactFeatureCenterRegistedClass = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void registerCaraNativeDiscoverViewFeatureCenter(java.lang.Class<T> cls) {
        caraNativeDiscoverViewFeatureCenterRegistedClass = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void registerCaraNativeFeatureCenter(java.lang.Class<T> cls) {
        caraNativeFeatureCenterRegistedClass = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void registerCaraNativeFinderFeatureCenter(java.lang.Class<T> cls) {
        caraNativeFinderFeatureCenterRegistedClass = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void registerCaraNativeLiveFeatureCenter(java.lang.Class<T> cls) {
        caraNativeLiveFeatureCenterRegistedClass = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void registerCaraNativeSessionFeatureCenter(java.lang.Class<T> cls) {
        caraNativeSessionFeatureCenterRegistedClass = cls;
    }
}

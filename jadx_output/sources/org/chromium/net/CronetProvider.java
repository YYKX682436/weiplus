package org.chromium.net;

/* loaded from: classes13.dex */
public abstract class CronetProvider {
    private static final java.lang.String GMS_CORE_CRONET_PROVIDER_CLASS = "com.google.android.gms.net.GmsCoreCronetProvider";
    private static final java.lang.String JAVA_CRONET_PROVIDER_CLASS = "org.chromium.net.impl.JavaCronetProvider";
    private static final java.lang.String NATIVE_CRONET_PROVIDER_CLASS = "org.chromium.net.impl.NativeCronetProvider";
    private static final java.lang.String PLAY_SERVICES_CRONET_PROVIDER_CLASS = "com.google.android.gms.net.PlayServicesCronetProvider";
    public static final java.lang.String PROVIDER_NAME_APP_PACKAGED = "App-Packaged-Cronet-Provider";
    public static final java.lang.String PROVIDER_NAME_FALLBACK = "Fallback-Cronet-Provider";
    private static final java.lang.String RES_KEY_CRONET_IMPL_CLASS = "CronetProviderClassName";
    private static final java.lang.String TAG = "CronetProvider";
    protected final android.content.Context mContext;

    public CronetProvider(android.content.Context context) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("Context must not be null");
        }
        this.mContext = context;
    }

    private static boolean addCronetProviderFromResourceFile(android.content.Context context, java.util.Set<org.chromium.net.CronetProvider> set) {
        java.lang.String string;
        int identifier = context.getResources().getIdentifier(RES_KEY_CRONET_IMPL_CLASS, "string", context.getPackageName());
        if (identifier == 0 || (string = context.getResources().getString(identifier)) == null || string.equals(PLAY_SERVICES_CRONET_PROVIDER_CLASS) || string.equals(GMS_CORE_CRONET_PROVIDER_CLASS) || string.equals(JAVA_CRONET_PROVIDER_CLASS) || string.equals(NATIVE_CRONET_PROVIDER_CLASS)) {
            return false;
        }
        addCronetProviderImplByClassName(context, string, set, true);
        return true;
    }

    private static boolean addCronetProviderImplByClassName(android.content.Context context, java.lang.String str, java.util.Set<org.chromium.net.CronetProvider> set, boolean z17) {
        try {
            set.add((org.chromium.net.CronetProvider) context.getClassLoader().loadClass(str).asSubclass(org.chromium.net.CronetProvider.class).getConstructor(android.content.Context.class).newInstance(context));
            return true;
        } catch (java.lang.ClassNotFoundException e17) {
            logReflectiveOperationException(str, z17, e17);
            return false;
        } catch (java.lang.IllegalAccessException e18) {
            logReflectiveOperationException(str, z17, e18);
            return false;
        } catch (java.lang.InstantiationException e19) {
            logReflectiveOperationException(str, z17, e19);
            return false;
        } catch (java.lang.NoSuchMethodException e27) {
            logReflectiveOperationException(str, z17, e27);
            return false;
        } catch (java.lang.reflect.InvocationTargetException e28) {
            logReflectiveOperationException(str, z17, e28);
            return false;
        }
    }

    public static java.util.List<org.chromium.net.CronetProvider> getAllProviders(android.content.Context context) {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        addCronetProviderFromResourceFile(context, linkedHashSet);
        addCronetProviderImplByClassName(context, PLAY_SERVICES_CRONET_PROVIDER_CLASS, linkedHashSet, false);
        addCronetProviderImplByClassName(context, GMS_CORE_CRONET_PROVIDER_CLASS, linkedHashSet, false);
        addCronetProviderImplByClassName(context, NATIVE_CRONET_PROVIDER_CLASS, linkedHashSet, false);
        addCronetProviderImplByClassName(context, JAVA_CRONET_PROVIDER_CLASS, linkedHashSet, false);
        return java.util.Collections.unmodifiableList(new java.util.ArrayList(linkedHashSet));
    }

    private static void logReflectiveOperationException(java.lang.String str, boolean z17, java.lang.Exception exc) {
        if (z17) {
            return;
        }
        android.util.Log.isLoggable(TAG, 3);
    }

    public abstract org.chromium.net.CronetEngine.Builder createBuilder();

    public abstract java.lang.String getName();

    public abstract java.lang.String getVersion();

    public abstract boolean isEnabled();

    public java.lang.String toString() {
        return "[class=" + getClass().getName() + ", name=" + getName() + ", version=" + getVersion() + ", enabled=" + isEnabled() + "]";
    }
}

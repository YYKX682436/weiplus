package com.tencent.tinker.loader.app;

/* loaded from: classes13.dex */
public final class TinkerInlineFenceAction {
    public static final int ACTION_GET_ASSETS = 9;
    public static final int ACTION_GET_BASE_CONTEXT = 8;
    public static final int ACTION_GET_CLASSLOADER = 7;
    public static final int ACTION_GET_RESOURCES = 10;
    public static final int ACTION_GET_SYSTEM_SERVICE = 11;
    public static final int ACTION_GET_THEME = 13;
    public static final int ACTION_MZ_NIGHTMODE_USE_OF = 12;
    public static final int ACTION_ON_BASE_CONTEXT_ATTACHED = 1;
    public static final int ACTION_ON_CONFIGURATION_CHANGED = 3;
    public static final int ACTION_ON_CREATE = 2;
    public static final int ACTION_ON_LOW_MEMORY = 5;
    public static final int ACTION_ON_TERMINATE = 6;
    public static final int ACTION_ON_TRIM_MEMORY = 4;

    public static android.content.res.AssetManager callGetAssets(android.os.Handler handler, android.content.res.AssetManager assetManager) {
        android.os.Message message;
        try {
            message = android.os.Message.obtain(handler, 9, assetManager);
            try {
                handler.handleMessage(message);
                android.content.res.AssetManager assetManager2 = (android.content.res.AssetManager) message.obj;
                message.recycle();
                return assetManager2;
            } catch (java.lang.Throwable th6) {
                th = th6;
                message.recycle();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            message = null;
        }
    }

    public static android.content.Context callGetBaseContext(android.os.Handler handler, android.content.Context context) {
        android.os.Message message;
        try {
            message = android.os.Message.obtain(handler, 8, context);
            try {
                handler.handleMessage(message);
                android.content.Context context2 = (android.content.Context) message.obj;
                message.recycle();
                return context2;
            } catch (java.lang.Throwable th6) {
                th = th6;
                message.recycle();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            message = null;
        }
    }

    public static java.lang.ClassLoader callGetClassLoader(android.os.Handler handler, java.lang.ClassLoader classLoader) {
        android.os.Message message;
        try {
            message = android.os.Message.obtain(handler, 7, classLoader);
            try {
                handler.handleMessage(message);
                java.lang.ClassLoader classLoader2 = (java.lang.ClassLoader) message.obj;
                message.recycle();
                return classLoader2;
            } catch (java.lang.Throwable th6) {
                th = th6;
                message.recycle();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            message = null;
        }
    }

    public static android.content.res.Resources callGetResources(android.os.Handler handler, android.content.res.Resources resources) {
        android.os.Message message;
        try {
            message = android.os.Message.obtain(handler, 10, resources);
            try {
                handler.handleMessage(message);
                android.content.res.Resources resources2 = (android.content.res.Resources) message.obj;
                message.recycle();
                return resources2;
            } catch (java.lang.Throwable th6) {
                th = th6;
                message.recycle();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            message = null;
        }
    }

    public static java.lang.Object callGetSystemService(android.os.Handler handler, java.lang.String str, java.lang.Object obj) {
        android.os.Message message = null;
        try {
            message = android.os.Message.obtain(handler, 11, new java.lang.Object[]{str, obj});
            handler.handleMessage(message);
            return message.obj;
        } finally {
            message.recycle();
        }
    }

    public static android.content.res.Resources.Theme callGetTheme(android.os.Handler handler, android.content.res.Resources.Theme theme) {
        android.os.Message message;
        try {
            message = android.os.Message.obtain(handler, 13, theme);
            try {
                handler.handleMessage(message);
                android.content.res.Resources.Theme theme2 = (android.content.res.Resources.Theme) message.obj;
                message.recycle();
                return theme2;
            } catch (java.lang.Throwable th6) {
                th = th6;
                message.recycle();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            message = null;
        }
    }

    public static int callMZNightModeUseOf(android.os.Handler handler) {
        android.os.Message message;
        try {
            message = android.os.Message.obtain(handler, 12);
            try {
                handler.handleMessage(message);
                int intValue = ((java.lang.Integer) message.obj).intValue();
                message.recycle();
                return intValue;
            } catch (java.lang.Throwable th6) {
                th = th6;
                message.recycle();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            message = null;
        }
    }

    public static void callOnBaseContextAttached(android.os.Handler handler, android.content.Context context) {
        android.os.Message message;
        try {
            message = android.os.Message.obtain(handler, 1, context);
            try {
                handler.handleMessage(message);
                message.recycle();
            } catch (java.lang.Throwable th6) {
                th = th6;
                message.recycle();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            message = null;
        }
    }

    public static void callOnConfigurationChanged(android.os.Handler handler, android.content.res.Configuration configuration) {
        android.os.Message message;
        try {
            message = android.os.Message.obtain(handler, 3, configuration);
            try {
                handler.handleMessage(message);
                message.recycle();
            } catch (java.lang.Throwable th6) {
                th = th6;
                message.recycle();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            message = null;
        }
    }

    public static void callOnCreate(android.os.Handler handler) {
        android.os.Message message;
        try {
            message = android.os.Message.obtain(handler, 2);
            try {
                handler.handleMessage(message);
                message.recycle();
            } catch (java.lang.Throwable th6) {
                th = th6;
                message.recycle();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            message = null;
        }
    }

    public static void callOnLowMemory(android.os.Handler handler) {
        android.os.Message message;
        try {
            message = android.os.Message.obtain(handler, 5);
            try {
                handler.handleMessage(message);
                message.recycle();
            } catch (java.lang.Throwable th6) {
                th = th6;
                message.recycle();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            message = null;
        }
    }

    public static void callOnTerminate(android.os.Handler handler) {
        android.os.Message message;
        try {
            message = android.os.Message.obtain(handler, 6);
            try {
                handler.handleMessage(message);
                message.recycle();
            } catch (java.lang.Throwable th6) {
                th = th6;
                message.recycle();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            message = null;
        }
    }

    public static void callOnTrimMemory(android.os.Handler handler, int i17) {
        android.os.Message message = null;
        try {
            message = android.os.Message.obtain(handler, 4, java.lang.Integer.valueOf(i17));
            handler.handleMessage(message);
        } finally {
            message.recycle();
        }
    }
}

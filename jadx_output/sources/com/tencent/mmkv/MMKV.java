package com.tencent.mmkv;

/* loaded from: classes12.dex */
public class MMKV implements android.content.SharedPreferences, android.content.SharedPreferences.Editor {
    private static final int ASHMEM_MODE = 8;
    private static final int BACKUP_MODE = 16;
    private static final int CONTEXT_MODE_MULTI_PROCESS = 4;
    public static final int ExpireInDay = 86400;
    public static final int ExpireInHour = 3600;
    public static final int ExpireInMinute = 60;
    public static final int ExpireInMonth = 2592000;
    public static final int ExpireInYear = 946080000;
    public static final int ExpireNever = 0;
    public static final int MULTI_PROCESS_MODE = 2;
    public static final int READ_ONLY_MODE = 32;
    public static final int SINGLE_PROCESS_MODE = 1;
    private static final java.util.Set<java.lang.Long> checkedHandleSet;
    private static ir5.d gCallbackHandler;
    private static ir5.c gContentChangeNotify;
    private static boolean gWantLogReDirecting;
    private static final ir5.e[] index2LogLevel;
    private static boolean isNativeLibLoaded;
    private static boolean isProcessModeCheckerEnabled;
    private static final java.util.EnumMap<ir5.e, java.lang.Integer> logLevel2Index;
    private static final java.util.HashMap<java.lang.String, android.os.Parcelable.Creator<?>> mCreators;
    private static final java.util.EnumMap<ir5.g, java.lang.Integer> recoverIndex;
    private static java.lang.String rootDir;
    private byte _hellAccFlag_;
    private final long nativeHandle;

    static {
        java.util.EnumMap<ir5.g, java.lang.Integer> enumMap = new java.util.EnumMap<>((java.lang.Class<ir5.g>) ir5.g.class);
        recoverIndex = enumMap;
        enumMap.put((java.util.EnumMap<ir5.g, java.lang.Integer>) ir5.g.OnErrorDiscard, (ir5.g) 0);
        enumMap.put((java.util.EnumMap<ir5.g, java.lang.Integer>) ir5.g.OnErrorRecover, (ir5.g) 1);
        java.util.EnumMap<ir5.e, java.lang.Integer> enumMap2 = new java.util.EnumMap<>((java.lang.Class<ir5.e>) ir5.e.class);
        logLevel2Index = enumMap2;
        ir5.e eVar = ir5.e.LevelDebug;
        enumMap2.put((java.util.EnumMap<ir5.e, java.lang.Integer>) eVar, (ir5.e) 0);
        ir5.e eVar2 = ir5.e.LevelInfo;
        enumMap2.put((java.util.EnumMap<ir5.e, java.lang.Integer>) eVar2, (ir5.e) 1);
        ir5.e eVar3 = ir5.e.LevelWarning;
        enumMap2.put((java.util.EnumMap<ir5.e, java.lang.Integer>) eVar3, (ir5.e) 2);
        ir5.e eVar4 = ir5.e.LevelError;
        enumMap2.put((java.util.EnumMap<ir5.e, java.lang.Integer>) eVar4, (ir5.e) 3);
        ir5.e eVar5 = ir5.e.LevelNone;
        enumMap2.put((java.util.EnumMap<ir5.e, java.lang.Integer>) eVar5, (ir5.e) 4);
        index2LogLevel = new ir5.e[]{eVar, eVar2, eVar3, eVar4, eVar5};
        checkedHandleSet = new java.util.HashSet();
        isNativeLibLoaded = false;
        rootDir = null;
        isProcessModeCheckerEnabled = true;
        mCreators = new java.util.HashMap<>();
        gCallbackHandler = null;
        gWantLogReDirecting = false;
    }

    private MMKV(long j17) {
        this.nativeHandle = j17;
    }

    private native long actualSize(long j17);

    private native java.lang.String[] allKeys(long j17, boolean z17);

    public static com.tencent.mmkv.MMKV backedUpMMKVWithID(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        ir5.b bVar = new ir5.b();
        bVar.f294281a = i17;
        bVar.f294283c = str2;
        bVar.f294284d = str3;
        return mmkvWithID(str, bVar);
    }

    public static native long backupAllToDirectory(java.lang.String str);

    public static native boolean backupOneToDirectory(java.lang.String str, java.lang.String str2, java.lang.String str3);

    public static boolean checkExist(java.lang.String str) {
        return checkExist(str, null);
    }

    public static native boolean checkExist(java.lang.String str, java.lang.String str2);

    public static com.tencent.mmkv.MMKV checkProcessMode(long j17, java.lang.String str, int i17) {
        java.lang.String str2;
        if (j17 != 0) {
            if (!isProcessModeCheckerEnabled) {
                return new com.tencent.mmkv.MMKV(j17);
            }
            java.util.Set<java.lang.Long> set = checkedHandleSet;
            synchronized (set) {
                if (!set.contains(java.lang.Long.valueOf(j17))) {
                    if (!checkProcessMode(j17)) {
                        if (i17 == 1) {
                            str2 = "Opening a multi-process MMKV instance [" + str + "] with SINGLE_PROCESS_MODE!";
                        } else {
                            str2 = ("Opening an MMKV instance [" + str + "] with MULTI_PROCESS_MODE, ") + "while it's already been opened with SINGLE_PROCESS_MODE by someone somewhere else!";
                        }
                        throw new java.lang.IllegalArgumentException(str2);
                    }
                    set.add(java.lang.Long.valueOf(j17));
                }
            }
            return new com.tencent.mmkv.MMKV(j17);
        }
        throw new java.lang.RuntimeException("Fail to create an MMKV instance [" + str + "] in JNI");
    }

    private static native boolean checkProcessMode(long j17);

    private native boolean containsKey(long j17, java.lang.String str);

    private native long count(long j17, boolean z17);

    private static native long createNB(int i17);

    public static ir5.i createNativeBuffer(int i17) {
        long createNB = createNB(i17);
        if (createNB == 0) {
            return null;
        }
        return new ir5.i(createNB, i17);
    }

    private native boolean decodeBool(long j17, java.lang.String str, boolean z17);

    private native byte[] decodeBytes(long j17, java.lang.String str);

    private native double decodeDouble(long j17, java.lang.String str, double d17);

    private native float decodeFloat(long j17, java.lang.String str, float f17);

    private native int decodeInt(long j17, java.lang.String str, int i17);

    private native long decodeLong(long j17, java.lang.String str, long j18);

    private native java.lang.String decodeString(long j17, java.lang.String str, java.lang.String str2);

    private native java.lang.String[] decodeStringSet(long j17, java.lang.String str);

    public static com.tencent.mmkv.MMKV defaultMMKV() {
        return defaultMMKV(new ir5.b());
    }

    public static ir5.h defaultNameSpace() {
        java.lang.String str = rootDir;
        if (str != null) {
            return new ir5.h(str);
        }
        throw new java.lang.IllegalStateException("You should Call MMKV.initialize() first.");
    }

    private static native void destroyNB(long j17, int i17);

    public static void destroyNativeBuffer(ir5.i iVar) {
        destroyNB(iVar.f294296a, iVar.f294297b);
    }

    public static void disableProcessModeChecker() {
        synchronized (checkedHandleSet) {
            isProcessModeCheckerEnabled = false;
        }
        enableDisableProcessMode(false);
    }

    private native void doCheckReSetCryptKey(java.lang.String str, boolean z17);

    private static java.lang.String doInitialize(java.lang.String str, java.lang.String str2, ir5.a aVar, ir5.e eVar, boolean z17, boolean z18, long j17) {
        tryLoadNativeLib(aVar);
        jniInitialize(str, str2, logLevel2Int(eVar), z17, z18, j17);
        rootDir = str;
        return str;
    }

    private native boolean doReKey(java.lang.String str, boolean z17);

    private static native void enableDisableProcessMode(boolean z17);

    public static void enableProcessModeChecker() {
        synchronized (checkedHandleSet) {
            isProcessModeCheckerEnabled = true;
        }
        enableDisableProcessMode(true);
    }

    private native boolean encodeBool(long j17, java.lang.String str, boolean z17);

    private native boolean encodeBool_2(long j17, java.lang.String str, boolean z17, int i17);

    private native boolean encodeBytes(long j17, java.lang.String str, byte[] bArr);

    private native boolean encodeBytes_2(long j17, java.lang.String str, byte[] bArr, int i17);

    private native boolean encodeDouble(long j17, java.lang.String str, double d17);

    private native boolean encodeDouble_2(long j17, java.lang.String str, double d17, int i17);

    private native boolean encodeFloat(long j17, java.lang.String str, float f17);

    private native boolean encodeFloat_2(long j17, java.lang.String str, float f17, int i17);

    private native boolean encodeInt(long j17, java.lang.String str, int i17);

    private native boolean encodeInt_2(long j17, java.lang.String str, int i17, int i18);

    private native boolean encodeLong(long j17, java.lang.String str, long j18);

    private native boolean encodeLong_2(long j17, java.lang.String str, long j18, int i17);

    private native boolean encodeSet(long j17, java.lang.String str, java.lang.String[] strArr);

    private native boolean encodeSet_2(long j17, java.lang.String str, java.lang.String[] strArr, int i17);

    private native boolean encodeString(long j17, java.lang.String str, java.lang.String str2);

    private native boolean encodeString_2(long j17, java.lang.String str, java.lang.String str2, int i17);

    private static native long getDefaultMMKV(int i17, java.lang.String str, long j17, boolean z17, int i18, int i19, boolean z18, int i27, int i28);

    private static native long getMMKVWithAshmemFD(java.lang.String str, int i17, int i18, java.lang.String str2, boolean z17);

    public static native long getMMKVWithID(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, long j17, boolean z17, int i18, int i19, boolean z18, int i27, int i28);

    private static native boolean getNameSpace(java.lang.String str);

    private byte[] getParcelableByte(android.os.Parcelable parcelable) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        parcelable.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static java.lang.String getRootDir() {
        return rootDir;
    }

    private native long importFrom(long j17, long j18);

    public static java.lang.String initialize(android.content.Context context) {
        return initialize(context, context.getFilesDir().getAbsolutePath() + "/mmkv", null, ir5.e.LevelInfo, null);
    }

    private native boolean isCompareBeforeSetEnabled();

    @dalvik.annotation.optimization.FastNative
    private native boolean isEncryptionEnabled();

    @dalvik.annotation.optimization.FastNative
    private native boolean isExpirationEnabled();

    public static boolean isFileValid(java.lang.String str) {
        return isFileValid(str, null);
    }

    public static native boolean isFileValid(java.lang.String str, java.lang.String str2);

    private static native void jniInitialize(java.lang.String str, java.lang.String str2, int i17, boolean z17, boolean z18, long j17);

    private static int logLevel2Int(ir5.e eVar) {
        int ordinal = eVar.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        if (ordinal == 2) {
            return 2;
        }
        if (ordinal != 3) {
            return ordinal != 4 ? 1 : 4;
        }
        return 3;
    }

    private static void mmkvLogImp(int i17, java.lang.String str, int i18, java.lang.String str2, java.lang.String str3) {
        if (gCallbackHandler == null || !gWantLogReDirecting) {
            index2LogLevel[i17].ordinal();
        } else {
            ir5.e eVar = index2LogLevel[i17];
            com.tencent.mars.xlog.Log.i("MMKV", "[%s:%d][%s] %s", str, java.lang.Integer.valueOf(i18), str2, str3);
        }
    }

    public static com.tencent.mmkv.MMKV mmkvWithAshmemFD(java.lang.String str, int i17, int i18, java.lang.String str2) {
        return mmkvWithAshmemFD(str, i17, i18, str2, false);
    }

    public static com.tencent.mmkv.MMKV mmkvWithAshmemID(android.content.Context context, java.lang.String str, int i17, int i18, java.lang.String str2) {
        return mmkvWithAshmemID(context, str, i17, i18, str2, false);
    }

    public static com.tencent.mmkv.MMKV mmkvWithID(java.lang.String str) {
        return mmkvWithID(str, new ir5.b());
    }

    public static ir5.h nameSpace(java.lang.String str) {
        tryLoadNativeLib(null);
        if (getNameSpace(str)) {
            return new ir5.h(str);
        }
        throw new java.lang.RuntimeException("Fail to get NameSpace[" + str + "] in JNI.");
    }

    @dalvik.annotation.optimization.FastNative
    private native void nativeEnableCompareBeforeSet();

    private static void onContentChangedByOuterProcess(java.lang.String str) {
    }

    public static native void onExit();

    private static int onMMKVCRCCheckFail(java.lang.String str) {
        ir5.g gVar = ir5.g.OnErrorDiscard;
        if (gCallbackHandler != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiProcessMMKV", "onMMKVCRCCheckFail:%s", str);
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.idkeyStat(941L, 3L, 1L, true);
            fVar.d(24632, str, 1, 0, 0);
        }
        simpleLog(ir5.e.LevelInfo, "Recover strategic for " + str + " is " + gVar);
        java.lang.Integer num = recoverIndex.get(gVar);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    private static void onMMKVContentLoadSuccessfully(java.lang.String str) {
    }

    private static int onMMKVFileLengthError(java.lang.String str) {
        ir5.g gVar = ir5.g.OnErrorDiscard;
        if (gCallbackHandler != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiProcessMMKV", "onMMKVFileLengthError:%s", str);
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.idkeyStat(941L, 4L, 1L, true);
            fVar.d(24632, str, 2, 0, 0);
        }
        simpleLog(ir5.e.LevelInfo, "Recover strategic for " + str + " is " + gVar);
        java.lang.Integer num = recoverIndex.get(gVar);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static native int pageSize();

    @java.lang.Deprecated
    public static void registerContentChangeNotify(ir5.c cVar) {
        ir5.d dVar = gCallbackHandler;
        if (dVar != null) {
            dVar.getClass();
        }
        setWantsContentChangeNotify(false);
    }

    public static void registerHandler(ir5.d dVar) {
        gCallbackHandler = dVar;
        dVar.getClass();
        gWantLogReDirecting = true;
        ((com.tencent.mm.sdk.platformtools.n4) gCallbackHandler).getClass();
        long nativeWriteLogFunc = com.tencent.mars.xlog.Log.getNativeWriteLogFunc();
        com.tencent.mars.xlog.Log.i("MMKV", "getNativeWriteLogFunc: %x", java.lang.Long.valueOf(nativeWriteLogFunc));
        setCallbackHandler(gWantLogReDirecting, true, nativeWriteLogFunc);
        gCallbackHandler.getClass();
    }

    public static boolean removeStorage(java.lang.String str) {
        return removeStorage(str, null);
    }

    public static native boolean removeStorage(java.lang.String str, java.lang.String str2);

    private native void removeValueForKey(long j17, java.lang.String str);

    public static native long restoreAllFromDirectory(java.lang.String str);

    public static native boolean restoreOneMMKVFromDirectory(java.lang.String str, java.lang.String str2, java.lang.String str3);

    private static native void setCallbackHandler(boolean z17, boolean z18, long j17);

    private static native void setLogLevel(int i17);

    public static void setLogLevel(ir5.e eVar) {
        setLogLevel(logLevel2Int(eVar));
    }

    private static native void setWantsContentChangeNotify(boolean z17);

    private static void simpleLog(ir5.e eVar, java.lang.String str) {
        java.lang.StackTraceElement stackTraceElement = java.lang.Thread.currentThread().getStackTrace()[r0.length - 1];
        java.lang.Integer num = logLevel2Index.get(eVar);
        mmkvLogImp(num == null ? 0 : num.intValue(), stackTraceElement.getFileName(), stackTraceElement.getLineNumber(), stackTraceElement.getMethodName(), str);
    }

    private native void sync(boolean z17);

    private native long totalSize(long j17);

    private static void tryLoadNativeLib(ir5.a aVar) {
        if (isNativeLibLoaded) {
            return;
        }
        if (aVar != null) {
            aVar.loadLibrary("c++_shared");
            aVar.loadLibrary("mmkv");
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("c++_shared");
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mmkv/MMKV", "tryLoadNativeLib", "(Lcom/tencent/mmkv/MMKV$LibLoader;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            java.lang.System.loadLibrary((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/mmkv/MMKV", "tryLoadNativeLib", "(Lcom/tencent/mmkv/MMKV$LibLoader;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add("mmkv");
            java.lang.Object obj2 = new java.lang.Object();
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mmkv/MMKV", "tryLoadNativeLib", "(Lcom/tencent/mmkv/MMKV$LibLoader;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            java.lang.System.loadLibrary((java.lang.String) arrayList2.get(0));
            yj0.a.f(obj2, "com/tencent/mmkv/MMKV", "tryLoadNativeLib", "(Lcom/tencent/mmkv/MMKV$LibLoader;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        }
        isNativeLibLoaded = true;
    }

    @java.lang.Deprecated
    public static void unregisterContentChangeNotify() {
        ir5.d dVar = gCallbackHandler;
        if (dVar != null) {
            dVar.getClass();
        }
        setWantsContentChangeNotify(false);
    }

    public static void unregisterHandler() {
        gCallbackHandler = null;
        setCallbackHandler(false, false, 0L);
        gWantLogReDirecting = false;
        setWantsContentChangeNotify(false);
    }

    private native int valueSize(long j17, java.lang.String str, boolean z17);

    public static native java.lang.String version();

    private native int writeValueToNB(long j17, java.lang.String str, long j18, int i17);

    public long actualSize() {
        return actualSize(this.nativeHandle);
    }

    public java.lang.String[] allKeys() {
        return allKeys(this.nativeHandle, false);
    }

    public java.lang.String[] allNonExpireKeys() {
        return allKeys(this.nativeHandle, true);
    }

    @Override // android.content.SharedPreferences.Editor
    @java.lang.Deprecated
    public void apply() {
        sync(false);
    }

    public native int ashmemFD();

    public native int ashmemMetaFD();

    public void async() {
        sync(false);
    }

    public native void checkContentChangedByOuterProcess();

    public void checkReSetCryptKey(java.lang.String str) {
        doCheckReSetCryptKey(str, false);
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor clear() {
        clearAll();
        return this;
    }

    public native void clearAll();

    public native void clearAllWithKeepingSpace();

    public native void clearMemoryCache();

    public native void close();

    @Override // android.content.SharedPreferences.Editor
    @java.lang.Deprecated
    public boolean commit() {
        sync(true);
        return true;
    }

    @Override // android.content.SharedPreferences
    public boolean contains(java.lang.String str) {
        return containsKey(str);
    }

    public boolean containsKey(java.lang.String str) {
        return containsKey(this.nativeHandle, str);
    }

    public long count() {
        return count(this.nativeHandle, false);
    }

    public long countNonExpiredKeys() {
        return count(this.nativeHandle, true);
    }

    public native java.lang.String cryptKey();

    public boolean decodeBool(java.lang.String str) {
        return decodeBool(this.nativeHandle, str, false);
    }

    public byte[] decodeBytes(java.lang.String str) {
        return decodeBytes(str, (byte[]) null);
    }

    public double decodeDouble(java.lang.String str) {
        return decodeDouble(this.nativeHandle, str, 0.0d);
    }

    public float decodeFloat(java.lang.String str) {
        return decodeFloat(this.nativeHandle, str, 0.0f);
    }

    public int decodeInt(java.lang.String str) {
        return decodeInt(this.nativeHandle, str, 0);
    }

    public long decodeLong(java.lang.String str) {
        return decodeLong(this.nativeHandle, str, 0L);
    }

    public <T extends android.os.Parcelable> T decodeParcelable(java.lang.String str, java.lang.Class<T> cls) {
        return (T) decodeParcelable(str, cls, null);
    }

    public java.lang.String decodeString(java.lang.String str) {
        return decodeString(this.nativeHandle, str, null);
    }

    public java.util.Set<java.lang.String> decodeStringSet(java.lang.String str) {
        return decodeStringSet(str, (java.util.Set<java.lang.String>) null);
    }

    public native boolean disableAutoKeyExpire();

    public native void disableCompareBeforeSet();

    @Override // android.content.SharedPreferences
    public android.content.SharedPreferences.Editor edit() {
        return this;
    }

    public native boolean enableAutoKeyExpire(int i17);

    public void enableCompareBeforeSet() {
        isExpirationEnabled();
        isEncryptionEnabled();
        nativeEnableCompareBeforeSet();
    }

    public boolean encode(java.lang.String str, boolean z17) {
        return encodeBool(this.nativeHandle, str, z17);
    }

    @Override // android.content.SharedPreferences
    public java.util.Map<java.lang.String, ?> getAll() {
        throw new java.lang.UnsupportedOperationException("Intentionally Not Supported. Use allKeys() instead, getAll() not implement because type-erasure inside mmkv");
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(java.lang.String str, boolean z17) {
        return decodeBool(this.nativeHandle, str, z17);
    }

    public byte[] getBytes(java.lang.String str, byte[] bArr) {
        return decodeBytes(str, bArr);
    }

    @Override // android.content.SharedPreferences
    public float getFloat(java.lang.String str, float f17) {
        return decodeFloat(this.nativeHandle, str, f17);
    }

    @Override // android.content.SharedPreferences
    public int getInt(java.lang.String str, int i17) {
        return decodeInt(this.nativeHandle, str, i17);
    }

    @Override // android.content.SharedPreferences
    public long getLong(java.lang.String str, long j17) {
        return decodeLong(this.nativeHandle, str, j17);
    }

    @Override // android.content.SharedPreferences
    public java.lang.String getString(java.lang.String str, java.lang.String str2) {
        return decodeString(this.nativeHandle, str, str2);
    }

    @Override // android.content.SharedPreferences
    public java.util.Set<java.lang.String> getStringSet(java.lang.String str, java.util.Set<java.lang.String> set) {
        return decodeStringSet(str, set);
    }

    public int getValueActualSize(java.lang.String str) {
        return valueSize(this.nativeHandle, str, true);
    }

    public int getValueSize(java.lang.String str) {
        return valueSize(this.nativeHandle, str, false);
    }

    public long importFrom(com.tencent.mmkv.MMKV mmkv) {
        return importFrom(this.nativeHandle, mmkv.nativeHandle);
    }

    public int importFromSharedPreferences(android.content.SharedPreferences sharedPreferences) {
        java.util.Map<java.lang.String, ?> all = sharedPreferences.getAll();
        if (all == null || all.size() <= 0) {
            return 0;
        }
        for (java.util.Map.Entry<java.lang.String, ?> entry : all.entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.Object value = entry.getValue();
            if (key != null && value != null) {
                if (value instanceof java.lang.Boolean) {
                    encodeBool(this.nativeHandle, key, ((java.lang.Boolean) value).booleanValue());
                } else if (value instanceof java.lang.Integer) {
                    encodeInt(this.nativeHandle, key, ((java.lang.Integer) value).intValue());
                } else if (value instanceof java.lang.Long) {
                    encodeLong(this.nativeHandle, key, ((java.lang.Long) value).longValue());
                } else if (value instanceof java.lang.Float) {
                    encodeFloat(this.nativeHandle, key, ((java.lang.Float) value).floatValue());
                } else if (value instanceof java.lang.Double) {
                    encodeDouble(this.nativeHandle, key, ((java.lang.Double) value).doubleValue());
                } else if (value instanceof java.lang.String) {
                    encodeString(this.nativeHandle, key, (java.lang.String) value);
                } else if (value instanceof java.util.Set) {
                    encode(key, (java.util.Set<java.lang.String>) value);
                } else {
                    simpleLog(ir5.e.LevelError, "unknown type: " + value.getClass());
                }
            }
        }
        return all.size();
    }

    public native boolean isMultiProcess();

    public native boolean isReadOnly();

    public native void lock();

    public native java.lang.String mmapID();

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putBoolean(java.lang.String str, boolean z17) {
        encodeBool(this.nativeHandle, str, z17);
        return this;
    }

    public android.content.SharedPreferences.Editor putBytes(java.lang.String str, byte[] bArr) {
        encode(str, bArr);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putFloat(java.lang.String str, float f17) {
        encodeFloat(this.nativeHandle, str, f17);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putInt(java.lang.String str, int i17) {
        encodeInt(this.nativeHandle, str, i17);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putLong(java.lang.String str, long j17) {
        encodeLong(this.nativeHandle, str, j17);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putString(java.lang.String str, java.lang.String str2) {
        encodeString(this.nativeHandle, str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putStringSet(java.lang.String str, java.util.Set<java.lang.String> set) {
        encode(str, set);
        return this;
    }

    public boolean reKey(java.lang.String str) {
        return doReKey(str, false);
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new java.lang.UnsupportedOperationException("Intentionally Not implement in MMKV");
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor remove(java.lang.String str) {
        removeValueForKey(str);
        return this;
    }

    public void removeValueForKey(java.lang.String str) {
        removeValueForKey(this.nativeHandle, str);
    }

    public native void removeValuesForKeys(java.lang.String[] strArr);

    public void sync() {
        sync(true);
    }

    public long totalSize() {
        return totalSize(this.nativeHandle);
    }

    public native void trim();

    public native boolean tryLock();

    public native void unlock();

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new java.lang.UnsupportedOperationException("Intentionally Not implement in MMKV");
    }

    public int writeValueToNativeBuffer(java.lang.String str, ir5.i iVar) {
        return writeValueToNB(this.nativeHandle, str, iVar.f294296a, iVar.f294297b);
    }

    public static com.tencent.mmkv.MMKV mmkvWithAshmemFD(java.lang.String str, int i17, int i18, java.lang.String str2, boolean z17) {
        long mMKVWithAshmemFD = getMMKVWithAshmemFD(str, i17, i18, str2, z17);
        if (mMKVWithAshmemFD != 0) {
            return new com.tencent.mmkv.MMKV(mMKVWithAshmemFD);
        }
        throw new java.lang.RuntimeException("Fail to create an ashmem MMKV instance [" + str + "] in JNI");
    }

    public static com.tencent.mmkv.MMKV mmkvWithAshmemID(android.content.Context context, java.lang.String str, int i17, int i18, java.lang.String str2, boolean z17) {
        ir5.b bVar = new ir5.b();
        bVar.f294281a = i18 | 8;
        bVar.f294285e = i17;
        bVar.f294282b = z17;
        bVar.f294283c = str2;
        return mmkvWithAshmemID(context, str, bVar);
    }

    public static com.tencent.mmkv.MMKV mmkvWithID(java.lang.String str, ir5.b bVar) {
        if (rootDir != null) {
            bVar.getClass();
            java.lang.Integer num = recoverIndex.get(null);
            return checkProcessMode(getMMKVWithID(str, bVar.f294281a, bVar.f294283c, bVar.f294284d, bVar.f294285e, bVar.f294282b, -1, 0, false, num == null ? -1 : num.intValue(), 0), str, bVar.f294281a);
        }
        throw new java.lang.IllegalStateException("You should Call MMKV.initialize() first.");
    }

    public void checkReSetCryptKey(java.lang.String str, boolean z17) {
        doCheckReSetCryptKey(str, z17);
    }

    public boolean decodeBool(java.lang.String str, boolean z17) {
        return decodeBool(this.nativeHandle, str, z17);
    }

    public byte[] decodeBytes(java.lang.String str, byte[] bArr) {
        byte[] decodeBytes = decodeBytes(this.nativeHandle, str);
        return decodeBytes != null ? decodeBytes : bArr;
    }

    public double decodeDouble(java.lang.String str, double d17) {
        return decodeDouble(this.nativeHandle, str, d17);
    }

    public float decodeFloat(java.lang.String str, float f17) {
        return decodeFloat(this.nativeHandle, str, f17);
    }

    public int decodeInt(java.lang.String str, int i17) {
        return decodeInt(this.nativeHandle, str, i17);
    }

    public long decodeLong(java.lang.String str, long j17) {
        return decodeLong(this.nativeHandle, str, j17);
    }

    public <T extends android.os.Parcelable> T decodeParcelable(java.lang.String str, java.lang.Class<T> cls, T t17) {
        byte[] decodeBytes;
        android.os.Parcelable.Creator<?> creator;
        if (cls == null || (decodeBytes = decodeBytes(this.nativeHandle, str)) == null) {
            return t17;
        }
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.unmarshall(decodeBytes, 0, decodeBytes.length);
        obtain.setDataPosition(0);
        try {
            java.lang.String cls2 = cls.toString();
            java.util.HashMap<java.lang.String, android.os.Parcelable.Creator<?>> hashMap = mCreators;
            synchronized (hashMap) {
                creator = hashMap.get(cls2);
                if (creator == null && (creator = (android.os.Parcelable.Creator) cls.getField("CREATOR").get(null)) != null) {
                    hashMap.put(cls2, creator);
                }
            }
            if (creator != null) {
                return (T) creator.createFromParcel(obtain);
            }
            throw new java.lang.Exception("Parcelable protocol requires a non-null static Parcelable.Creator object called CREATOR on class " + cls2);
        } catch (java.lang.Exception e17) {
            simpleLog(ir5.e.LevelError, e17.toString());
            return t17;
        } finally {
            obtain.recycle();
        }
    }

    public java.lang.String decodeString(java.lang.String str, java.lang.String str2) {
        return decodeString(this.nativeHandle, str, str2);
    }

    public java.util.Set<java.lang.String> decodeStringSet(java.lang.String str, java.util.Set<java.lang.String> set) {
        return decodeStringSet(str, set, java.util.HashSet.class);
    }

    public boolean encode(java.lang.String str, boolean z17, int i17) {
        return encodeBool_2(this.nativeHandle, str, z17, i17);
    }

    public android.content.SharedPreferences.Editor putBoolean(java.lang.String str, boolean z17, int i17) {
        encodeBool_2(this.nativeHandle, str, z17, i17);
        return this;
    }

    public android.content.SharedPreferences.Editor putBytes(java.lang.String str, byte[] bArr, int i17) {
        encode(str, bArr, i17);
        return this;
    }

    public android.content.SharedPreferences.Editor putFloat(java.lang.String str, float f17, int i17) {
        encodeFloat_2(this.nativeHandle, str, f17, i17);
        return this;
    }

    public android.content.SharedPreferences.Editor putInt(java.lang.String str, int i17, int i18) {
        encodeInt_2(this.nativeHandle, str, i17, i18);
        return this;
    }

    public android.content.SharedPreferences.Editor putLong(java.lang.String str, long j17, int i17) {
        encodeLong_2(this.nativeHandle, str, j17, i17);
        return this;
    }

    public android.content.SharedPreferences.Editor putString(java.lang.String str, java.lang.String str2, int i17) {
        encodeString_2(this.nativeHandle, str, str2, i17);
        return this;
    }

    public android.content.SharedPreferences.Editor putStringSet(java.lang.String str, java.util.Set<java.lang.String> set, int i17) {
        encode(str, set, i17);
        return this;
    }

    public boolean reKey(java.lang.String str, boolean z17) {
        return doReKey(str, z17);
    }

    public static com.tencent.mmkv.MMKV defaultMMKV(int i17, java.lang.String str) {
        ir5.b bVar = new ir5.b();
        bVar.f294281a = i17;
        bVar.f294283c = str;
        return defaultMMKV(bVar);
    }

    public java.util.Set<java.lang.String> decodeStringSet(java.lang.String str, java.util.Set<java.lang.String> set, java.lang.Class<? extends java.util.Set> cls) {
        java.lang.String[] decodeStringSet = decodeStringSet(this.nativeHandle, str);
        if (decodeStringSet == null) {
            return set;
        }
        try {
            java.util.Set<java.lang.String> newInstance = cls.newInstance();
            newInstance.addAll(java.util.Arrays.asList(decodeStringSet));
            return newInstance;
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException unused) {
            return set;
        }
    }

    public boolean encode(java.lang.String str, int i17) {
        return encodeInt(this.nativeHandle, str, i17);
    }

    public static java.lang.String initialize(android.content.Context context, ir5.e eVar) {
        return initialize(context, context.getFilesDir().getAbsolutePath() + "/mmkv", null, eVar, null);
    }

    public boolean encode(java.lang.String str, int i17, int i18) {
        return encodeInt_2(this.nativeHandle, str, i17, i18);
    }

    public boolean encode(java.lang.String str, long j17) {
        return encodeLong(this.nativeHandle, str, j17);
    }

    public static com.tencent.mmkv.MMKV backedUpMMKVWithID(java.lang.String str, int i17, java.lang.String str2, boolean z17, java.lang.String str3) {
        ir5.b bVar = new ir5.b();
        bVar.f294281a = i17 | 16;
        bVar.f294283c = str2;
        bVar.f294284d = str3;
        return mmkvWithID(str, bVar);
    }

    public static java.lang.String initialize(android.content.Context context, ir5.a aVar) {
        return initialize(context, context.getFilesDir().getAbsolutePath() + "/mmkv", aVar, ir5.e.LevelInfo, null);
    }

    public boolean encode(java.lang.String str, long j17, int i17) {
        return encodeLong_2(this.nativeHandle, str, j17, i17);
    }

    public static com.tencent.mmkv.MMKV defaultMMKV(int i17, java.lang.String str, boolean z17) {
        ir5.b bVar = new ir5.b();
        bVar.f294281a = i17;
        bVar.f294282b = z17;
        bVar.f294283c = str;
        return defaultMMKV(bVar);
    }

    public boolean encode(java.lang.String str, float f17) {
        return encodeFloat(this.nativeHandle, str, f17);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.tencent.mmkv.MMKV mmkvWithAshmemID(android.content.Context r7, java.lang.String r8, ir5.b r9) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mmkv.MMKV.mmkvWithAshmemID(android.content.Context, java.lang.String, ir5.b):com.tencent.mmkv.MMKV");
    }

    public boolean encode(java.lang.String str, float f17, int i17) {
        return encodeFloat_2(this.nativeHandle, str, f17, i17);
    }

    public static java.lang.String initialize(android.content.Context context, ir5.a aVar, ir5.e eVar) {
        return initialize(context, context.getFilesDir().getAbsolutePath() + "/mmkv", aVar, eVar, null);
    }

    public static com.tencent.mmkv.MMKV mmkvWithID(java.lang.String str, int i17) {
        ir5.b bVar = new ir5.b();
        bVar.f294281a = i17;
        return mmkvWithID(str, bVar);
    }

    public boolean encode(java.lang.String str, double d17) {
        return encodeDouble(this.nativeHandle, str, d17);
    }

    public boolean encode(java.lang.String str, double d17, int i17) {
        return encodeDouble_2(this.nativeHandle, str, d17, i17);
    }

    public static java.lang.String initialize(android.content.Context context, java.lang.String str) {
        return initialize(context, str, null, ir5.e.LevelInfo, null);
    }

    public boolean encode(java.lang.String str, java.lang.String str2) {
        return encodeString(this.nativeHandle, str, str2);
    }

    public static com.tencent.mmkv.MMKV defaultMMKV(ir5.b bVar) {
        if (rootDir != null) {
            bVar.getClass();
            java.lang.Integer num = recoverIndex.get(null);
            return checkProcessMode(getDefaultMMKV(bVar.f294281a, bVar.f294283c, bVar.f294285e, bVar.f294282b, -1, 0, false, num == null ? -1 : num.intValue(), 0), "DefaultMMKV", bVar.f294281a);
        }
        throw new java.lang.IllegalStateException("You should Call MMKV.initialize() first.");
    }

    public static com.tencent.mmkv.MMKV mmkvWithID(java.lang.String str, int i17, long j17) {
        ir5.b bVar = new ir5.b();
        bVar.f294281a = i17;
        bVar.f294285e = j17;
        return mmkvWithID(str, bVar);
    }

    public boolean encode(java.lang.String str, java.lang.String str2, int i17) {
        return encodeString_2(this.nativeHandle, str, str2, i17);
    }

    public static java.lang.String initialize(android.content.Context context, java.lang.String str, ir5.e eVar) {
        return initialize(context, str, null, eVar, null);
    }

    public boolean encode(java.lang.String str, java.util.Set<java.lang.String> set) {
        return encodeSet(this.nativeHandle, str, set == null ? null : (java.lang.String[]) set.toArray(new java.lang.String[0]));
    }

    public static java.lang.String initialize(android.content.Context context, java.lang.String str, ir5.a aVar) {
        return initialize(context, str, aVar, ir5.e.LevelInfo, null);
    }

    public boolean encode(java.lang.String str, java.util.Set<java.lang.String> set, int i17) {
        return encodeSet_2(this.nativeHandle, str, set == null ? null : (java.lang.String[]) set.toArray(new java.lang.String[0]), i17);
    }

    public boolean encode(java.lang.String str, byte[] bArr) {
        return encodeBytes(this.nativeHandle, str, bArr);
    }

    public static java.lang.String initialize(android.content.Context context, java.lang.String str, ir5.a aVar, ir5.e eVar) {
        return initialize(context, str, aVar, eVar, null);
    }

    public static com.tencent.mmkv.MMKV mmkvWithID(java.lang.String str, int i17, java.lang.String str2) {
        ir5.b bVar = new ir5.b();
        bVar.f294281a = i17;
        bVar.f294283c = str2;
        return mmkvWithID(str, bVar);
    }

    public boolean encode(java.lang.String str, byte[] bArr, int i17) {
        return encodeBytes_2(this.nativeHandle, str, bArr, i17);
    }

    public static java.lang.String initialize(android.content.Context context, java.lang.String str, ir5.a aVar, ir5.e eVar, ir5.d dVar) {
        boolean z17;
        long j17;
        if (android.os.Process.is64Bit()) {
            java.lang.String absolutePath = context.getCacheDir().getAbsolutePath();
            gCallbackHandler = dVar;
            if (dVar != null) {
                z17 = true;
                gWantLogReDirecting = true;
                j17 = com.tencent.mars.xlog.Log.getNativeWriteLogFunc();
                com.tencent.mars.xlog.Log.i("MMKV", "getNativeWriteLogFunc: %x", java.lang.Long.valueOf(j17));
            } else {
                z17 = false;
                j17 = 0;
            }
            java.lang.String doInitialize = doInitialize(str, absolutePath, aVar, eVar, gWantLogReDirecting, z17, j17);
            if ((context.getApplicationInfo().flags & 2) == 0) {
                disableProcessModeChecker();
            } else {
                enableProcessModeChecker();
            }
            return doInitialize;
        }
        throw new ir5.k("MMKV 2.0+ requires 64-bit App, use 1.3.x instead.");
    }

    public boolean encode(java.lang.String str, android.os.Parcelable parcelable) {
        if (parcelable == null) {
            return encodeBytes(this.nativeHandle, str, null);
        }
        return encodeBytes(this.nativeHandle, str, getParcelableByte(parcelable));
    }

    public static com.tencent.mmkv.MMKV mmkvWithID(java.lang.String str, int i17, java.lang.String str2, boolean z17) {
        ir5.b bVar = new ir5.b();
        bVar.f294281a = i17;
        bVar.f294282b = z17;
        bVar.f294283c = str2;
        return mmkvWithID(str, bVar);
    }

    public boolean encode(java.lang.String str, android.os.Parcelable parcelable, int i17) {
        if (parcelable == null) {
            return encodeBytes_2(this.nativeHandle, str, null, i17);
        }
        return encodeBytes_2(this.nativeHandle, str, getParcelableByte(parcelable), i17);
    }

    public static com.tencent.mmkv.MMKV mmkvWithID(java.lang.String str, java.lang.String str2) {
        ir5.b bVar = new ir5.b();
        bVar.f294284d = str2;
        return mmkvWithID(str, bVar);
    }

    @java.lang.Deprecated
    public static java.lang.String initialize(java.lang.String str) {
        return doInitialize(str, str + "/.tmp", null, ir5.e.LevelInfo, false, false, 0L);
    }

    public static com.tencent.mmkv.MMKV mmkvWithID(java.lang.String str, java.lang.String str2, long j17) {
        ir5.b bVar = new ir5.b();
        bVar.f294284d = str2;
        bVar.f294285e = j17;
        return mmkvWithID(str, bVar);
    }

    @java.lang.Deprecated
    public static java.lang.String initialize(java.lang.String str, ir5.e eVar) {
        return doInitialize(str, str + "/.tmp", null, eVar, false, false, 0L);
    }

    @java.lang.Deprecated
    public static java.lang.String initialize(java.lang.String str, ir5.a aVar) {
        return doInitialize(str, str + "/.tmp", aVar, ir5.e.LevelInfo, false, false, 0L);
    }

    public static com.tencent.mmkv.MMKV mmkvWithID(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, long j17) {
        ir5.b bVar = new ir5.b();
        bVar.f294281a = i17;
        bVar.f294283c = str2;
        bVar.f294284d = str3;
        bVar.f294285e = j17;
        return mmkvWithID(str, bVar);
    }

    @java.lang.Deprecated
    public static java.lang.String initialize(java.lang.String str, ir5.a aVar, ir5.e eVar) {
        return doInitialize(str, str + "/.tmp", aVar, eVar, false, false, 0L);
    }

    public static com.tencent.mmkv.MMKV mmkvWithID(java.lang.String str, int i17, java.lang.String str2, boolean z17, java.lang.String str3, long j17) {
        ir5.b bVar = new ir5.b();
        bVar.f294281a = i17;
        bVar.f294282b = z17;
        bVar.f294283c = str2;
        bVar.f294284d = str3;
        bVar.f294285e = j17;
        return mmkvWithID(str, bVar);
    }

    public static com.tencent.mmkv.MMKV mmkvWithID(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        ir5.b bVar = new ir5.b();
        bVar.f294281a = i17;
        bVar.f294283c = str2;
        bVar.f294284d = str3;
        return mmkvWithID(str, bVar);
    }

    public static com.tencent.mmkv.MMKV mmkvWithID(java.lang.String str, int i17, java.lang.String str2, boolean z17, java.lang.String str3) {
        ir5.b bVar = new ir5.b();
        bVar.f294281a = i17;
        bVar.f294282b = z17;
        bVar.f294283c = str2;
        bVar.f294284d = str3;
        return mmkvWithID(str, bVar);
    }
}

package com.tencent.thumbplayer.adapter.strategy.utils;

/* loaded from: classes13.dex */
public class TPNativeKeyMapUtil {
    private static final java.lang.String REVERSE_MAP_NAME_SUFFIX = ".reverseMap";
    private static final java.lang.String TAG = "TPNativeKeyMapUtil";
    private static final java.util.Map<java.lang.String, java.util.Map<java.lang.Number, java.lang.Number>> sNameToMap = new java.util.concurrent.ConcurrentHashMap();
    private static final java.util.Map<java.lang.Class<?>, java.util.concurrent.atomic.AtomicBoolean> sHasThisAnnotationInitMap = new java.util.concurrent.ConcurrentHashMap();
    private static final android.util.SparseArray<com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils.OptionIdMapping> sToNativeOptionalIdMap = new android.util.SparseArray<>();
    private static final android.util.SparseArray<java.lang.String> sOptionalIdKeyToNameMap = new android.util.SparseArray<>();
    private static final java.util.concurrent.atomic.AtomicBoolean sHasOptionalIdMapInit = new java.util.concurrent.atomic.AtomicBoolean(false);

    private static <T extends java.lang.annotation.Annotation> void buildBiDirectionMapForAnnotation(java.lang.Class<T> cls) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "buildBiDirectionMapForAnnotation, clazz=" + cls);
        java.util.Map<java.lang.Class<?>, java.util.concurrent.atomic.AtomicBoolean> map = sHasThisAnnotationInitMap;
        synchronized (map) {
            atomicBoolean = map.get(cls);
            if (atomicBoolean == null) {
                atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
                map.put(cls, atomicBoolean);
            }
        }
        synchronized (atomicBoolean) {
            if (!atomicBoolean.get()) {
                searchClassToFillMap(cls);
                atomicBoolean.set(true);
            } else {
                com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "className=" + cls.getSimpleName() + " already init");
            }
        }
    }

    private static void buildNativeInitConfigMap() {
        com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapInitConfig mapInitConfig;
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(com.tencent.thumbplayer.api.TPOptionalID.class.getName());
            for (java.lang.reflect.Field field : cls.getDeclaredFields()) {
                if (field.getType().toString().equals("int") && (mapInitConfig = (com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapInitConfig) field.getAnnotation(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapInitConfig.class)) != null) {
                    int i17 = field.getInt(cls);
                    sOptionalIdKeyToNameMap.put(i17, mapInitConfig.keyName());
                    if (mapInitConfig.value() == -1) {
                        sToNativeOptionalIdMap.put(i17, new com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils.OptionIdMapping());
                    } else {
                        field.setAccessible(true);
                        sToNativeOptionalIdMap.put(i17, new com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils.OptionIdMapping(mapInitConfig.type(), mapInitConfig.value()));
                    }
                }
            }
        } catch (java.lang.ClassNotFoundException e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
        } catch (java.lang.IllegalAccessException e18) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e18);
        }
    }

    private static void buildNativeOptionalIdToMapInternal(java.lang.Class<?> cls) {
        com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapOptionalId mapOptionalId;
        try {
            for (java.lang.reflect.Field field : cls.getDeclaredFields()) {
                if (field.getType().toString().equals("int") && (mapOptionalId = (com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapOptionalId) field.getAnnotation(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapOptionalId.class)) != null) {
                    int i17 = field.getInt(cls);
                    sOptionalIdKeyToNameMap.put(i17, mapOptionalId.keyName());
                    if (mapOptionalId.value() == -1) {
                        sToNativeOptionalIdMap.put(i17, new com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils.OptionIdMapping());
                    } else {
                        field.setAccessible(true);
                        sToNativeOptionalIdMap.put(i17, new com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils.OptionIdMapping(mapOptionalId.type(), mapOptionalId.value()));
                    }
                }
            }
        } catch (java.lang.IllegalAccessException e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
        }
    }

    private static void buildOptionalIdMap() {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = sHasOptionalIdMapInit;
        synchronized (atomicBoolean) {
            if (sToNativeOptionalIdMap.size() != 0) {
                return;
            }
            if (atomicBoolean.get()) {
                throw new java.lang.IllegalStateException("构建Map错误，请查看【--keep class com.tencent.thumbplayer.api.** { *; }】是否加入反混淆");
            }
            buildNativeInitConfigMap();
            buildPublicToNativeOptionalIdMap();
            buildPrivateToNativeOptionalIdMap();
            atomicBoolean.set(true);
        }
    }

    private static void buildPrivateToNativeOptionalIdMap() {
        try {
            buildNativeOptionalIdToMapInternal(java.lang.Class.forName(com.tencent.thumbplayer.tplayer.TPOptionalIDInternal.class.getName()));
        } catch (java.lang.ClassNotFoundException e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
        }
    }

    private static void buildPublicToNativeOptionalIdMap() {
        try {
            buildNativeOptionalIdToMapInternal(java.lang.Class.forName(com.tencent.thumbplayer.api.TPOptionalID.class.getName()));
        } catch (java.lang.ClassNotFoundException e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
        }
    }

    private static <T extends java.lang.annotation.Annotation> void checkFillMapValidity(java.lang.Class<T> cls, java.util.Map<java.lang.Number, java.lang.Number> map, java.util.Map<java.lang.Number, java.lang.Number> map2, java.lang.Class<?> cls2, java.lang.Number number, java.lang.Number number2) {
        if (map.containsKey(number2)) {
            throw new java.lang.IllegalStateException(cls2.getName() + " 配置了重复的成员变量，注解=" + cls.getName() + " 成员变量值=" + number2 + " 请查找一下使用这个注解@" + cls.getName() + "的哪两个成员变量值相等");
        }
        if (map2.containsKey(number)) {
            throw new java.lang.IllegalStateException(cls2.getName() + " 配置了重复的注解值，注解=" + cls.getName() + " 成员变量值=" + number2 + " 请查找一下@" + cls.getName() + "(这个值)在哪里重复了");
        }
    }

    public static com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils.OptionIdMapping convertToNativeOptionalId(@com.tencent.thumbplayer.api.TPCommonEnum.TPOptionalId int i17) {
        android.util.SparseArray<com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils.OptionIdMapping> sparseArray = sToNativeOptionalIdMap;
        if (sparseArray.size() == 0) {
            buildOptionalIdMap();
        }
        return sparseArray.get(i17, new com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils.OptionIdMapping());
    }

    @com.tencent.thumbplayer.api.TPCommonEnum.NativeSurfaceType
    public static int convertToNativeSurfaceType(@com.tencent.thumbplayer.api.TPCommonEnum.TPSurfaceType int i17) {
        com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapSurfaceType mapSurfaceType;
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(com.tencent.thumbplayer.api.ITPPlayer.class.getName());
            for (java.lang.reflect.Field field : cls.getDeclaredFields()) {
                if (field.getType().toString().equals("int")) {
                    field.setAccessible(true);
                    if (i17 == field.getInt(cls) && (mapSurfaceType = (com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapSurfaceType) field.getAnnotation(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapSurfaceType.class)) != null) {
                        return mapSurfaceType.value();
                    }
                }
            }
        } catch (java.lang.ClassNotFoundException e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
        } catch (java.lang.IllegalAccessException e18) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e18);
        }
        com.tencent.thumbplayer.utils.TPLogUtil.w(TAG, "convertToNativeSurfaceType, player surface type is invalid(" + i17 + "), return unspecified instead");
        return 0;
    }

    public static <T extends java.lang.annotation.Annotation> java.util.Set<java.util.Map.Entry<java.lang.Number, java.lang.Number>> getEntrySetOfToNativeMap(java.lang.Class<T> cls) {
        return new java.util.HashSet(getMapForAnnotation(cls, true).entrySet());
    }

    public static <T extends java.lang.annotation.Annotation> java.util.Set<java.util.Map.Entry<java.lang.Number, java.lang.Number>> getEntrySetOfToTPMap(java.lang.Class<T> cls) {
        return new java.util.HashSet(getMapForAnnotation(cls, false).entrySet());
    }

    private static <T extends java.lang.annotation.Annotation> java.util.Map<java.lang.Number, java.lang.Number> getMapForAnnotation(java.lang.Class<T> cls, boolean z17) {
        java.lang.String mapKey = getMapKey(cls, z17);
        java.util.Map<java.lang.String, java.util.Map<java.lang.Number, java.lang.Number>> map = sNameToMap;
        java.util.Map<java.lang.Number, java.lang.Number> map2 = map.get(mapKey);
        if (map2 == null || map2.size() == 0) {
            buildBiDirectionMapForAnnotation(cls);
            map2 = map.get(mapKey);
        }
        if (((com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig) cls.getAnnotation(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig.class)) == null) {
            throw new java.lang.IllegalArgumentException(cls.getSimpleName().concat("has not SearchConfig annotation"));
        }
        if (map2 == null || map2.size() == 0) {
            throw new java.lang.IllegalStateException(cls.getSimpleName().concat(" is null after buildBiDirectionMap"));
        }
        return map2;
    }

    private static <T extends java.lang.annotation.Annotation> java.lang.String getMapKey(java.lang.Class<T> cls, boolean z17) {
        java.lang.String canonicalName = cls.getCanonicalName();
        if (z17) {
            return canonicalName;
        }
        return canonicalName + REVERSE_MAP_NAME_SUFFIX;
    }

    public static java.lang.String getOptionalIdName(int i17) {
        if (!sHasOptionalIdMapInit.get()) {
            buildOptionalIdMap();
        }
        return sOptionalIdKeyToNameMap.get(i17, "");
    }

    public static void init() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.Class<?>[] declaredClasses = com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.class.getDeclaredClasses();
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "init BiDirectionMap for tp&native value");
        for (java.lang.Class<?> cls : declaredClasses) {
            if (cls.isAnnotation() && java.lang.reflect.Modifier.isPublic(cls.getModifiers()) && ((com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig) cls.getAnnotation(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig.class)) != null) {
                buildBiDirectionMapForAnnotation(cls);
            }
        }
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "init cost time=" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    private static <T extends java.lang.annotation.Annotation> void searchClassToFillMap(java.lang.Class<T> cls) {
        java.lang.annotation.Annotation annotation;
        boolean z17;
        java.lang.Number valueOf;
        java.lang.Number number;
        int i17;
        boolean z18;
        boolean z19 = true;
        java.lang.String mapKey = getMapKey(cls, true);
        java.util.Map<java.lang.String, java.util.Map<java.lang.Number, java.lang.Number>> map = sNameToMap;
        java.util.Map<java.lang.Number, java.lang.Number> map2 = map.get(mapKey);
        java.lang.String mapKey2 = getMapKey(cls, false);
        java.util.Map<java.lang.Number, java.lang.Number> map3 = map.get(mapKey2);
        if (map2 == null || map3 == null) {
            map2 = new java.util.HashMap<>();
            map.put(mapKey, map2);
            map3 = new java.util.HashMap<>();
            map.put(mapKey2, map3);
        }
        java.util.Map<java.lang.Number, java.lang.Number> map4 = map2;
        java.util.Map<java.lang.Number, java.lang.Number> map5 = map3;
        try {
            com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig searchConfig = (com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig) cls.getAnnotation(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig.class);
            if (searchConfig == null) {
                throw new java.lang.IllegalArgumentException(cls.getCanonicalName() + "has not SearchConfig annotation");
            }
            java.lang.Class<?> searchClass = searchConfig.searchClass();
            java.lang.reflect.Field[] declaredFields = searchClass.getDeclaredFields();
            int length = declaredFields.length;
            int i18 = 0;
            while (i18 < length) {
                java.lang.reflect.Field field = declaredFields[i18];
                java.lang.String str = "";
                java.lang.Class<? extends java.lang.Number> valueClass = searchConfig.valueClass();
                java.lang.Class<? extends java.lang.Number> cls2 = java.lang.Integer.TYPE;
                if (valueClass == cls2) {
                    str = "int";
                } else if (searchConfig.valueClass() == java.lang.Long.TYPE) {
                    str = "long";
                }
                if (android.text.TextUtils.isEmpty(str)) {
                    throw new java.lang.IllegalArgumentException("代码还没实现对" + searchConfig.valueClass().getName() + "的支持");
                }
                if (field.getType().toString().equals(str) && (annotation = field.getAnnotation(cls)) != null) {
                    field.setAccessible(z19);
                    int i19 = i18;
                    java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("value", new java.lang.Class[0]);
                    z19 = true;
                    declaredMethod.setAccessible(true);
                    if (searchConfig.valueClass() == cls2) {
                        java.lang.Integer num = (java.lang.Integer) declaredMethod.invoke(annotation, new java.lang.Object[0]);
                        valueOf = java.lang.Integer.valueOf(field.getInt(searchClass));
                        number = num;
                        z17 = false;
                    } else {
                        if (searchConfig.valueClass() != java.lang.Long.TYPE) {
                            throw new java.lang.IllegalArgumentException("代码还没实现对" + searchConfig.valueClass().getName() + "的支持");
                        }
                        z17 = false;
                        java.lang.Long l17 = (java.lang.Long) declaredMethod.invoke(annotation, new java.lang.Object[0]);
                        valueOf = java.lang.Long.valueOf(field.getLong(searchClass));
                        number = l17;
                    }
                    java.lang.Number number2 = number;
                    i17 = i19;
                    z18 = z17;
                    checkFillMapValidity(cls, map4, map5, searchClass, number2, valueOf);
                    map4.put(valueOf, number2);
                    map5.put(number2, valueOf);
                    i18 = i17 + 1;
                }
                i17 = i18;
                z18 = false;
                i18 = i17 + 1;
            }
        } catch (java.lang.IllegalAccessException e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
        } catch (java.lang.NoSuchMethodException e18) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e18);
            throw new java.lang.IllegalStateException("com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap下所有元素需要加到混淆中, 并且每个MapXXX注解需要有value方法");
        } catch (java.lang.reflect.InvocationTargetException e19) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e19);
        }
    }

    public static <T extends java.lang.annotation.Annotation> int toNativeIntValue(java.lang.Class<T> cls, int i17) {
        java.util.Map<java.lang.Number, java.lang.Number> mapForAnnotation = getMapForAnnotation(cls, true);
        if (mapForAnnotation.containsKey(java.lang.Integer.valueOf(i17))) {
            return mapForAnnotation.get(java.lang.Integer.valueOf(i17)).intValue();
        }
        com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "toNativeValue, tpValue=" + i17 + "return default value, clazz" + cls);
        return (int) ((com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig) cls.getAnnotation(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig.class)).nativeDefValue();
    }

    public static <T extends java.lang.annotation.Annotation> long toNativeLongValue(java.lang.Class<T> cls, long j17) {
        java.util.Map<java.lang.Number, java.lang.Number> mapForAnnotation = getMapForAnnotation(cls, true);
        if (mapForAnnotation.containsKey(java.lang.Long.valueOf(j17))) {
            return mapForAnnotation.get(java.lang.Long.valueOf(j17)).longValue();
        }
        com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "toNativeValue, tpValue=" + j17 + "return default value, clazz" + cls);
        return ((com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig) cls.getAnnotation(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig.class)).nativeDefValue();
    }

    public static <T extends java.lang.annotation.Annotation> int toTPIntValue(java.lang.Class<T> cls, int i17) {
        java.util.Map<java.lang.Number, java.lang.Number> mapForAnnotation = getMapForAnnotation(cls, false);
        if (mapForAnnotation.containsKey(java.lang.Integer.valueOf(i17))) {
            return mapForAnnotation.get(java.lang.Integer.valueOf(i17)).intValue();
        }
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "toTPValue, nativeValue=" + i17 + "return default value, clazz" + cls);
        return (int) ((com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig) cls.getAnnotation(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig.class)).tpDefValue();
    }

    public static <T extends java.lang.annotation.Annotation> long toTPLongValue(java.lang.Class<T> cls, long j17) {
        java.util.Map<java.lang.Number, java.lang.Number> mapForAnnotation = getMapForAnnotation(cls, false);
        if (mapForAnnotation.containsKey(java.lang.Long.valueOf(j17))) {
            return mapForAnnotation.get(java.lang.Long.valueOf(j17)).longValue();
        }
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "toTPValue, nativeValue=" + j17 + "return default value, clazz" + cls);
        return ((com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig) cls.getAnnotation(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig.class)).tpDefValue();
    }
}

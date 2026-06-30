package com.tencent.wechat.zidl2;

/* loaded from: classes15.dex */
public class ZidlUtil {
    private static final java.lang.String TAG = "ZidlUtil";

    /* loaded from: classes11.dex */
    public interface InterfaceBuilder<T extends com.tencent.wechat.zidl2.ZidlBaseCaller> {
        T call(java.lang.String str, java.lang.String str2, long j17);
    }

    /* loaded from: classes14.dex */
    public interface ValueToEnum<T> {
        T call(java.lang.Integer num);
    }

    public static java.util.ArrayList<java.lang.Boolean> booleanArrayToList(boolean[] zArr) {
        java.util.ArrayList<java.lang.Boolean> arrayList = new java.util.ArrayList<>(zArr.length);
        for (boolean z17 : zArr) {
            arrayList.add(java.lang.Boolean.valueOf(z17));
        }
        return arrayList;
    }

    public static boolean[] booleanJavaToJniOptional(java.util.Optional<java.lang.Boolean> optional) {
        return (boolean[]) optional.map(new com.tencent.wechat.zidl2.ZidlUtil$$f()).orElse(null);
    }

    public static java.util.Optional<java.lang.Boolean> booleanJniToJavaOptional(boolean[] zArr) {
        return zArr == null ? java.util.Optional.empty() : java.util.Optional.of(java.lang.Boolean.valueOf(zArr[0]));
    }

    public static boolean[] booleanListToArray(java.util.ArrayList<java.lang.Boolean> arrayList) {
        boolean[] zArr = new boolean[arrayList.size()];
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            zArr[i17] = arrayList.get(i17).booleanValue();
        }
        return zArr;
    }

    public static java.nio.ByteBuffer byteBufferJavaToJniOptional(java.util.Optional<java.nio.ByteBuffer> optional) {
        return optional.orElse(null);
    }

    public static java.util.Optional<java.nio.ByteBuffer> byteBufferJniToJavaOptional(java.nio.ByteBuffer byteBuffer) {
        return byteBuffer == null ? java.util.Optional.empty() : java.util.Optional.of(byteBuffer);
    }

    public static java.util.ArrayList<byte[]> bytesArrayToList(byte[][] bArr) {
        java.util.ArrayList<byte[]> arrayList = new java.util.ArrayList<>(bArr.length);
        arrayList.addAll(java.util.Arrays.asList(bArr));
        return arrayList;
    }

    public static byte[] bytesJavaToJniOptional(java.util.Optional<byte[]> optional) {
        return optional.orElse(null);
    }

    public static java.util.Optional<byte[]> bytesJniToJavaOptional(byte[] bArr) {
        return java.util.Optional.ofNullable(bArr);
    }

    public static byte[][] bytesListToArray(java.util.ArrayList<byte[]> arrayList) {
        byte[][] bArr = new byte[arrayList.size()];
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            bArr[i17] = arrayList.get(i17);
        }
        return bArr;
    }

    public static java.lang.Object createInstanceFromName(java.lang.String str) {
        try {
            java.lang.reflect.Constructor<?> declaredConstructor = java.lang.Class.forName(str).getDeclaredConstructor(new java.lang.Class[0]);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception e17) {
            com.tencent.wechat.zlog.Zlog.d(hw5.a.ERROR, TAG, "createInstanceFromName failed: " + e17.toString(), new java.lang.Object[0]);
            return null;
        }
    }

    public static long directBufferJavaToJniOptional(java.util.Optional<com.tencent.wechat.zidl2.ZDirectBuffer> optional) {
        return ((java.lang.Long) optional.map(new com.tencent.wechat.zidl2.ZidlUtil$$c()).orElse(0L)).longValue();
    }

    public static java.util.Optional<com.tencent.wechat.zidl2.ZDirectBuffer> directBufferJniToJavaOptional(long j17) {
        return j17 == 0 ? java.util.Optional.empty() : java.util.Optional.of(com.tencent.wechat.zidl2.ZDirectBuffer.fromImpl(j17));
    }

    public static java.util.ArrayList<java.lang.Double> doubleArrayToList(double[] dArr) {
        java.util.ArrayList<java.lang.Double> arrayList = new java.util.ArrayList<>(dArr.length);
        for (double d17 : dArr) {
            arrayList.add(java.lang.Double.valueOf(d17));
        }
        return arrayList;
    }

    public static double[] doubleJavaToJniOptional(java.util.Optional<java.lang.Double> optional) {
        return (double[]) optional.map(new com.tencent.wechat.zidl2.ZidlUtil$$g()).orElse(null);
    }

    public static java.util.Optional<java.lang.Double> doubleJniToJavaOptional(double[] dArr) {
        return dArr == null ? java.util.Optional.empty() : java.util.Optional.of(java.lang.Double.valueOf(dArr[0]));
    }

    public static double[] doubleListToArray(java.util.ArrayList<java.lang.Double> arrayList) {
        double[] dArr = new double[arrayList.size()];
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            dArr[i17] = arrayList.get(i17).doubleValue();
        }
        return dArr;
    }

    public static <T extends com.google.protobuf.p6> java.util.ArrayList<T> enumBasicValueArrayToEnumList(int[] iArr, com.tencent.wechat.zidl2.ZidlUtil.ValueToEnum<T> valueToEnum) {
        java.util.ArrayList<T> arrayList = new java.util.ArrayList<>(iArr.length);
        for (int i17 : iArr) {
            arrayList.add(valueToEnum.call(java.lang.Integer.valueOf(i17)));
        }
        return arrayList;
    }

    public static <T extends com.google.protobuf.p6> int[] enumJavaToJniOptional(java.util.Optional<T> optional) {
        return (int[]) optional.map(new com.tencent.wechat.zidl2.ZidlUtil$$a()).orElse(null);
    }

    public static <T extends com.google.protobuf.p6> java.util.Optional<T> enumJniToJavaOptional(int[] iArr, com.tencent.wechat.zidl2.ZidlUtil.ValueToEnum<T> valueToEnum) {
        return iArr == null ? java.util.Optional.empty() : java.util.Optional.of(valueToEnum.call(java.lang.Integer.valueOf(iArr[0])));
    }

    public static <T extends com.google.protobuf.p6> int[] enumListToBasicValueArray(java.util.ArrayList<T> arrayList) {
        int[] iArr = new int[arrayList.size()];
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            iArr[i17] = arrayList.get(i17).getNumber();
        }
        return iArr;
    }

    public static <T extends com.google.protobuf.p6> java.util.ArrayList<java.lang.Integer> enumListToValueArray(java.util.ArrayList<T> arrayList) {
        java.util.ArrayList<java.lang.Integer> arrayList2 = new java.util.ArrayList<>(arrayList.size());
        java.util.Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(java.lang.Integer.valueOf(it.next().getNumber()));
        }
        return arrayList2;
    }

    public static <T extends com.google.protobuf.p6> java.util.ArrayList<T> enumValueListToEnumArray(java.util.ArrayList<java.lang.Integer> arrayList, com.tencent.wechat.zidl2.ZidlUtil.ValueToEnum<T> valueToEnum) {
        java.util.ArrayList<T> arrayList2 = new java.util.ArrayList<>(arrayList.size());
        java.util.Iterator<java.lang.Integer> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(valueToEnum.call(it.next()));
        }
        return arrayList2;
    }

    public static java.util.ArrayList<java.lang.Float> floatArrayToList(float[] fArr) {
        java.util.ArrayList<java.lang.Float> arrayList = new java.util.ArrayList<>(fArr.length);
        for (float f17 : fArr) {
            arrayList.add(java.lang.Float.valueOf(f17));
        }
        return arrayList;
    }

    public static float[] floatJavaToJniOptional(java.util.Optional<java.lang.Float> optional) {
        return (float[]) optional.map(new com.tencent.wechat.zidl2.ZidlUtil$$e()).orElse(null);
    }

    public static java.util.Optional<java.lang.Float> floatJniToJavaOptional(float[] fArr) {
        return fArr == null ? java.util.Optional.empty() : java.util.Optional.of(java.lang.Float.valueOf(fArr[0]));
    }

    public static float[] floatListToArray(java.util.ArrayList<java.lang.Float> arrayList) {
        float[] fArr = new float[arrayList.size()];
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            fArr[i17] = arrayList.get(i17).floatValue();
        }
        return fArr;
    }

    public static java.util.ArrayList<java.lang.Integer> intArrayToList(int[] iArr) {
        java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>(iArr.length);
        for (int i17 : iArr) {
            arrayList.add(java.lang.Integer.valueOf(i17));
        }
        return arrayList;
    }

    public static int[] intJavaToJniOptional(java.util.Optional<java.lang.Integer> optional) {
        return (int[]) optional.map(new com.tencent.wechat.zidl2.ZidlUtil$$k()).orElse(null);
    }

    public static java.util.Optional<java.lang.Integer> intJniToJavaOptional(int[] iArr) {
        return iArr == null ? java.util.Optional.empty() : java.util.Optional.of(java.lang.Integer.valueOf(iArr[0]));
    }

    public static int[] intListToArray(java.util.ArrayList<java.lang.Integer> arrayList) {
        int[] iArr = new int[arrayList.size()];
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            iArr[i17] = arrayList.get(i17).intValue();
        }
        return iArr;
    }

    public static java.lang.String[] javaObjToJni(com.tencent.wechat.zidl2.ZidlBaseCaller zidlBaseCaller) {
        return new java.lang.String[]{zidlBaseCaller.zidlCreateName, zidlBaseCaller.zidlSvrIdentity};
    }

    public static com.tencent.wechat.zidl2.ZidlObjHolder2 javaObjToJni2(com.tencent.wechat.zidl2.ZidlBaseCaller zidlBaseCaller) {
        return new com.tencent.wechat.zidl2.ZidlObjHolder2(zidlBaseCaller.zidlCreateName, zidlBaseCaller.zidlSvrIdentity, zidlBaseCaller.refCntManagerHandler);
    }

    public static <T extends com.tencent.wechat.zidl2.ZidlBaseCaller> com.tencent.wechat.zidl2.ZidlObjHolder2 javaObjToJni2Optional(java.util.Optional<T> optional) {
        return (com.tencent.wechat.zidl2.ZidlObjHolder2) optional.map(new com.tencent.wechat.zidl2.ZidlUtil$$m()).orElse(null);
    }

    public static <T extends com.tencent.wechat.zidl2.ZidlBaseCaller> java.lang.String[] javaObjToJniOptional(java.util.Optional<T> optional) {
        return (java.lang.String[]) optional.map(new com.tencent.wechat.zidl2.ZidlUtil$$j()).orElse(null);
    }

    public static native void jniAddRef(long j17);

    public static native void jniRelease(long j17);

    public static <T extends com.tencent.wechat.zidl2.ZidlBaseCaller> T jniToJavaObj(java.lang.String[] strArr, java.util.function.BiFunction<java.lang.String, java.lang.String, T> biFunction) {
        return biFunction.apply(strArr[0], strArr[1]);
    }

    public static <T extends com.tencent.wechat.zidl2.ZidlBaseCaller> T jniToJavaObj2(com.tencent.wechat.zidl2.ZidlObjHolder2 zidlObjHolder2, com.tencent.wechat.zidl2.ZidlUtil.InterfaceBuilder<T> interfaceBuilder) {
        return interfaceBuilder.call(zidlObjHolder2.getName(), zidlObjHolder2.getIdentity(), zidlObjHolder2.getManager());
    }

    public static <T extends com.tencent.wechat.zidl2.ZidlBaseCaller> java.util.Optional<T> jniToJavaObj2Optional(com.tencent.wechat.zidl2.ZidlObjHolder2 zidlObjHolder2, com.tencent.wechat.zidl2.ZidlUtil.InterfaceBuilder<T> interfaceBuilder) {
        return zidlObjHolder2 == null ? java.util.Optional.empty() : java.util.Optional.of(jniToJavaObj2(zidlObjHolder2, interfaceBuilder));
    }

    public static <T extends com.tencent.wechat.zidl2.ZidlBaseCaller> java.util.Optional<T> jniToJavaObjOptional(java.lang.String[] strArr, java.util.function.BiFunction<java.lang.String, java.lang.String, T> biFunction) {
        return strArr == null ? java.util.Optional.empty() : java.util.Optional.of(biFunction.apply(strArr[0], strArr[1]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean[] lambda$booleanJavaToJniOptional$4(java.lang.Boolean bool) {
        return new boolean[]{bool.booleanValue()};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Long lambda$directBufferJavaToJniOptional$6(com.tencent.wechat.zidl2.ZDirectBuffer zDirectBuffer) {
        return java.lang.Long.valueOf(zDirectBuffer.toImpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ double[] lambda$doubleJavaToJniOptional$2(java.lang.Double d17) {
        return new double[]{d17.doubleValue()};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int[] lambda$enumJavaToJniOptional$7(com.google.protobuf.p6 p6Var) {
        return new int[]{p6Var.getNumber()};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float[] lambda$floatJavaToJniOptional$3(java.lang.Float f17) {
        return new float[]{f17.floatValue()};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int[] lambda$intJavaToJniOptional$0(java.lang.Integer num) {
        return new int[]{num.intValue()};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.String[] lambda$javaObjToJniOptional$10(com.tencent.wechat.zidl2.ZidlBaseCaller zidlBaseCaller) {
        return new java.lang.String[]{zidlBaseCaller.zidlCreateName, zidlBaseCaller.zidlSvrIdentity};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ long[] lambda$longJavaToJniOptional$1(java.lang.Long l17) {
        return new long[]{l17.longValue()};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int[] lambda$mmpbEnumJavaToJniOptional$8(com.tencent.mm.protobuf.h hVar) {
        return new int[]{hVar.getNumber()};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$stringJavaToJniOptionalBytes$5(java.lang.String str) {
        return str.getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    public static <T> T[] listToArray(java.util.ArrayList<T> arrayList) {
        T[] tArr = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(arrayList.get(0).getClass(), arrayList.size()));
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            tArr[i17] = arrayList.get(i17);
        }
        return tArr;
    }

    public static java.util.ArrayList<java.lang.Long> longArrayToList(long[] jArr) {
        java.util.ArrayList<java.lang.Long> arrayList = new java.util.ArrayList<>(jArr.length);
        for (long j17 : jArr) {
            arrayList.add(java.lang.Long.valueOf(j17));
        }
        return arrayList;
    }

    public static long[] longJavaToJniOptional(java.util.Optional<java.lang.Long> optional) {
        return (long[]) optional.map(new com.tencent.wechat.zidl2.ZidlUtil$$d()).orElse(null);
    }

    public static java.util.Optional<java.lang.Long> longJniToJavaOptional(long[] jArr) {
        return jArr == null ? java.util.Optional.empty() : java.util.Optional.of(java.lang.Long.valueOf(jArr[0]));
    }

    public static long[] longListToArray(java.util.ArrayList<java.lang.Long> arrayList) {
        long[] jArr = new long[arrayList.size()];
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            jArr[i17] = arrayList.get(i17).longValue();
        }
        return jArr;
    }

    public static <T extends com.google.protobuf.n5> byte[] messageJavaToJniOptional(java.util.Optional<T> optional) {
        return (byte[]) optional.map(new com.tencent.wechat.zidl2.ZidlUtil$$b()).orElse(null);
    }

    public static <T extends com.google.protobuf.n5> java.util.Optional<T> messageJniToJavaOptional(T t17, byte[] bArr) {
        try {
            return bArr == null ? java.util.Optional.empty() : java.util.Optional.of((com.google.protobuf.n5) t17.newBuilderForType().mo20mergeFrom(bArr).build());
        } catch (com.google.protobuf.y6 unused) {
            return java.util.Optional.empty();
        }
    }

    public static <T extends com.tencent.mm.protobuf.h> java.util.ArrayList<T> mmpbEnumBasicValueArrayToEnumList(int[] iArr, com.tencent.wechat.zidl2.ZidlUtil.ValueToEnum<T> valueToEnum) {
        java.util.ArrayList<T> arrayList = new java.util.ArrayList<>(iArr.length);
        for (int i17 : iArr) {
            arrayList.add(valueToEnum.call(java.lang.Integer.valueOf(i17)));
        }
        return arrayList;
    }

    public static <T extends com.tencent.mm.protobuf.h> int[] mmpbEnumJavaToJniOptional(java.util.Optional<T> optional) {
        return (int[]) optional.map(new com.tencent.wechat.zidl2.ZidlUtil$$l()).orElse(null);
    }

    public static <T extends com.tencent.mm.protobuf.h> java.util.Optional<T> mmpbEnumJniToJavaOptional(int[] iArr, com.tencent.wechat.zidl2.ZidlUtil.ValueToEnum<T> valueToEnum) {
        return iArr == null ? java.util.Optional.empty() : java.util.Optional.of(valueToEnum.call(java.lang.Integer.valueOf(iArr[0])));
    }

    public static <T extends com.tencent.mm.protobuf.h> int[] mmpbEnumListToBasicValueArray(java.util.ArrayList<T> arrayList) {
        int[] iArr = new int[arrayList.size()];
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            iArr[i17] = arrayList.get(i17).getNumber();
        }
        return iArr;
    }

    public static <T extends com.tencent.mm.protobuf.h> java.util.ArrayList<java.lang.Integer> mmpbEnumListToValueArray(java.util.ArrayList<T> arrayList) {
        java.util.ArrayList<java.lang.Integer> arrayList2 = new java.util.ArrayList<>(arrayList.size());
        java.util.Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(java.lang.Integer.valueOf(it.next().getNumber()));
        }
        return arrayList2;
    }

    public static <T extends com.tencent.mm.protobuf.h> java.util.ArrayList<T> mmpbEnumValueListToEnumArray(java.util.ArrayList<java.lang.Integer> arrayList, com.tencent.wechat.zidl2.ZidlUtil.ValueToEnum<T> valueToEnum) {
        java.util.ArrayList<T> arrayList2 = new java.util.ArrayList<>(arrayList.size());
        java.util.Iterator<java.lang.Integer> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(valueToEnum.call(it.next()));
        }
        return arrayList2;
    }

    public static <T extends com.tencent.mm.protobuf.f> byte[][] mmpbListSerializeToBasic(java.util.ArrayList<T> arrayList) {
        try {
            byte[][] bArr = new byte[arrayList.size()];
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                bArr[i17] = arrayList.get(i17).toByteArray();
            }
            return bArr;
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    public static <T extends com.tencent.mm.protobuf.f> java.util.ArrayList<T> mmpbListUnSerializeFromBasic(T t17, byte[][] bArr) {
        com.tencent.mm.plugin.finder.live.util.b0 b0Var = (java.util.ArrayList<T>) new java.util.ArrayList(bArr.length);
        try {
            for (byte[] bArr2 : bArr) {
                b0Var.add(mmpbUnSerialize(t17, bArr2));
            }
            return b0Var;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static <T extends com.tencent.mm.protobuf.f> byte[] mmpbMessageJavaToJniOptional(java.util.Optional<T> optional) {
        return (byte[]) optional.map(new com.tencent.wechat.zidl2.ZidlUtil$$h()).orElse(null);
    }

    public static <T extends com.tencent.mm.protobuf.f> java.util.Optional<T> mmpbMessageJniToJavaOptional(T t17, byte[] bArr) {
        try {
            return bArr == null ? java.util.Optional.empty() : java.util.Optional.of(mmpbUnSerialize(t17, bArr));
        } catch (java.lang.Exception unused) {
            return java.util.Optional.empty();
        }
    }

    public static <T extends com.tencent.mm.protobuf.f> byte[] mmpbSerialize(T t17) {
        try {
            return t17.toByteArray();
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    public static <T extends com.tencent.mm.protobuf.f> T mmpbUnSerialize(T t17, byte[] bArr) {
        try {
            T t18 = (T) t17.newInstance();
            t18.parseFrom(bArr);
            return t18;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static <T extends com.google.protobuf.n5> byte[][] pbListSerializeToBasic(java.util.ArrayList<T> arrayList) {
        byte[][] bArr = new byte[arrayList.size()];
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            bArr[i17] = arrayList.get(i17).toByteArray();
        }
        return bArr;
    }

    public static <T extends com.google.protobuf.n5> java.util.ArrayList<T> pbListUnSerializeFromBasic(T t17, byte[][] bArr) {
        com.tencent.mm.plugin.finder.live.util.b0 b0Var = (java.util.ArrayList<T>) new java.util.ArrayList(bArr.length);
        try {
            for (byte[] bArr2 : bArr) {
                com.google.protobuf.h5 newBuilderForType = t17.newBuilderForType();
                com.google.protobuf.y yVar = com.google.protobuf.y.f45712e;
                newBuilderForType.mergeFrom(com.google.protobuf.y.g(bArr2, 0, bArr2.length));
                b0Var.add(newBuilderForType.build());
            }
            return b0Var;
        } catch (com.google.protobuf.y6 unused) {
            return null;
        }
    }

    public static <T extends com.google.protobuf.n5> java.util.ArrayList<byte[]> pbSerialize(java.util.ArrayList<T> arrayList) {
        java.util.ArrayList<byte[]> arrayList2 = new java.util.ArrayList<>(arrayList.size());
        java.util.Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().toByteArray());
        }
        return arrayList2;
    }

    public static <T extends com.google.protobuf.n5> java.util.ArrayList<T> pbUnSerialize(T t17, java.util.ArrayList<byte[]> arrayList) {
        com.tencent.mm.plugin.finder.live.util.b0 b0Var = (java.util.ArrayList<T>) new java.util.ArrayList(arrayList.size());
        java.util.Iterator<byte[]> it = arrayList.iterator();
        while (it.hasNext()) {
            byte[] next = it.next();
            com.google.protobuf.h5 newBuilderForType = t17.newBuilderForType();
            try {
                com.google.protobuf.y yVar = com.google.protobuf.y.f45712e;
                newBuilderForType.mergeFrom(com.google.protobuf.y.g(next, 0, next.length));
                b0Var.add(newBuilderForType.build());
            } catch (com.google.protobuf.y6 unused) {
            }
        }
        return b0Var;
    }

    public static java.util.ArrayList<java.lang.String> stringArrayToList(java.lang.String[] strArr) {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>(strArr.length);
        arrayList.addAll(java.util.Arrays.asList(strArr));
        return arrayList;
    }

    public static java.lang.String stringJavaToJniOptional(java.util.Optional<java.lang.String> optional) {
        return optional.orElse(null);
    }

    public static byte[] stringJavaToJniOptionalBytes(java.util.Optional<java.lang.String> optional) {
        return (byte[]) optional.map(new com.tencent.wechat.zidl2.ZidlUtil$$i()).orElse(null);
    }

    public static java.util.Optional<java.lang.String> stringJniToJavaOptional(java.lang.String str) {
        return java.util.Optional.ofNullable(str);
    }

    public static java.lang.String[] stringListToArray(java.util.ArrayList<java.lang.String> arrayList) {
        java.lang.String[] strArr = new java.lang.String[arrayList.size()];
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            strArr[i17] = arrayList.get(i17);
        }
        return strArr;
    }

    public static byte[][] stringListToArrayBytes(java.util.ArrayList<java.lang.String> arrayList) {
        byte[][] bArr = new byte[arrayList.size()];
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            bArr[i17] = arrayList.get(i17).getBytes(java.nio.charset.StandardCharsets.UTF_8);
        }
        return bArr;
    }

    public static java.lang.String uppercaseFirstLetter(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str);
        sb6.setCharAt(0, java.lang.Character.toUpperCase(sb6.charAt(0)));
        return sb6.toString();
    }

    public static <T extends com.tencent.mm.protobuf.f> java.util.ArrayList<byte[]> mmpbSerialize(java.util.ArrayList<T> arrayList) {
        java.util.ArrayList<byte[]> arrayList2 = new java.util.ArrayList<>();
        java.util.Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(mmpbSerialize(it.next()));
        }
        return arrayList2;
    }

    public static java.util.Optional<java.lang.String> stringJniToJavaOptional(byte[] bArr) {
        return bArr == null ? java.util.Optional.empty() : java.util.Optional.of(new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8));
    }

    public static <T extends com.tencent.mm.protobuf.f> java.util.ArrayList<T> mmpbUnSerialize(T t17, java.util.ArrayList<byte[]> arrayList) {
        com.tencent.mm.plugin.finder.live.util.b0 b0Var = (java.util.ArrayList<T>) new java.util.ArrayList();
        java.util.Iterator<byte[]> it = arrayList.iterator();
        while (it.hasNext()) {
            b0Var.add(mmpbUnSerialize(t17, it.next()));
        }
        return b0Var;
    }

    public static java.util.ArrayList<java.lang.String> stringArrayToList(byte[][] bArr) {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>(bArr.length);
        for (byte[] bArr2 : bArr) {
            arrayList.add(new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8));
        }
        return arrayList;
    }

    public static <T> java.util.ArrayList<java.lang.Integer> enumListToValueArray(java.lang.Class<?> cls, java.util.ArrayList<T> arrayList) {
        java.util.ArrayList<java.lang.Integer> arrayList2 = new java.util.ArrayList<>();
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            arrayList2.add((java.lang.Integer) cls.getMethod("getNumber", new java.lang.Class[0]).invoke(arrayList.get(i17), new java.lang.Object[0]));
        }
        return arrayList2;
    }

    public static <T> java.util.ArrayList<T> enumValueListToEnumArray(java.lang.Class<?> cls, java.util.ArrayList<java.lang.Integer> arrayList) {
        com.tencent.mm.plugin.finder.live.util.b0 b0Var = (java.util.ArrayList<T>) new java.util.ArrayList();
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            b0Var.add(cls.getMethod("forNumber", java.lang.Integer.TYPE).invoke(null, arrayList.get(i17)));
        }
        return b0Var;
    }

    public static <T extends com.google.protobuf.n5> byte[] pbSerialize(T t17) {
        return t17.toByteArray();
    }

    public static <T extends com.google.protobuf.n5> T pbUnSerialize(T t17, byte[] bArr) {
        com.google.protobuf.h5 newBuilderForType = t17.newBuilderForType();
        try {
            com.google.protobuf.y yVar = com.google.protobuf.y.f45712e;
            newBuilderForType.mergeFrom(com.google.protobuf.y.g(bArr, 0, bArr.length));
            return (T) newBuilderForType.build();
        } catch (com.google.protobuf.y6 unused) {
            return null;
        }
    }
}

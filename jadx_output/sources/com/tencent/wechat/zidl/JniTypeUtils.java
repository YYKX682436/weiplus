package com.tencent.wechat.zidl;

/* loaded from: classes15.dex */
public class JniTypeUtils {
    public static <T extends com.google.protobuf.n5> java.lang.Object[] java2JniVV(T[] tArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (T t17 : tArr) {
            arrayList.add(t17.toByteArray());
        }
        return arrayList.toArray();
    }

    public static <T extends com.google.protobuf.n5> java.util.ArrayList<T> jni2JavaVV(T t17, java.util.ArrayList<byte[]> arrayList) {
        com.tencent.mm.plugin.finder.live.util.b0 b0Var = (java.util.ArrayList<T>) new java.util.ArrayList();
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
}

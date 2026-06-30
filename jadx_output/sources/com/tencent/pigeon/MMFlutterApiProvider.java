package com.tencent.pigeon;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001f\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u0007¢\u0006\u0002\u0010\u000eR$\u0010\u0005\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tencent/pigeon/MMFlutterApiProvider;", "", "binaryMessenger", "Lio/flutter/plugin/common/BinaryMessenger;", "(Lio/flutter/plugin/common/BinaryMessenger;)V", "apiCreatorMap", "", "Ljava/lang/Class;", "Lkotlin/Function0;", "apiInstanceMap", "", "getApi", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "apiClass", "(Ljava/lang/Class;)Ljava/lang/Object;", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MMFlutterApiProvider {
    private final java.util.Map<java.lang.Class<?>, yz5.a> apiCreatorMap;
    private final java.util.Map<java.lang.Class<?>, java.lang.Object> apiInstanceMap;

    public MMFlutterApiProvider(io.flutter.plugin.common.BinaryMessenger binaryMessenger) {
        kotlin.jvm.internal.o.g(binaryMessenger, "binaryMessenger");
        this.apiCreatorMap = kz5.b1.e(new jz5.l(com.tencent.pigeon.mm_foundation.DemoServiceFlutterApi.class, new com.tencent.pigeon.MMFlutterApiProvider$apiCreatorMap$1(binaryMessenger)));
        this.apiInstanceMap = new java.util.LinkedHashMap();
    }

    public final <T> T getApi(java.lang.Class<T> apiClass) {
        T t17;
        kotlin.jvm.internal.o.g(apiClass, "apiClass");
        synchronized (this) {
            if (this.apiInstanceMap.containsKey(apiClass)) {
                t17 = (T) this.apiInstanceMap.get(apiClass);
            } else {
                yz5.a aVar = this.apiCreatorMap.get(apiClass);
                t17 = aVar != null ? (T) aVar.invoke() : null;
                if (t17 != null) {
                    this.apiInstanceMap.put(apiClass, t17);
                }
            }
            if (t17 == null) {
                throw new java.lang.RuntimeException(apiClass + " not found");
            }
        }
        return t17;
    }
}

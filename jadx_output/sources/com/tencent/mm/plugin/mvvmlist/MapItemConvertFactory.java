package com.tencent.mm.plugin.mvvmlist;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B;\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u00070\u0006\u0012\u0012\u0010\f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R/\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR#\u0010\f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/mvvmlist/MapItemConvertFactory;", "Lin5/s;", "", "type", "Lin5/r;", "getItemConvert", "", "Ljava/lang/Class;", "map", "Ljava/util/Map;", "getMap", "()Ljava/util/Map;", "defaultConvert", "Ljava/lang/Class;", "getDefaultConvert", "()Ljava/lang/Class;", "<init>", "(Ljava/util/Map;Ljava/lang/Class;)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MapItemConvertFactory implements in5.s {
    private final java.lang.Class<? extends in5.r> defaultConvert;
    private final java.util.Map<java.lang.Integer, java.lang.Class<? extends in5.r>> map;

    /* JADX WARN: Multi-variable type inference failed */
    public MapItemConvertFactory(java.util.Map<java.lang.Integer, ? extends java.lang.Class<? extends in5.r>> map, java.lang.Class<? extends in5.r> defaultConvert) {
        kotlin.jvm.internal.o.g(map, "map");
        kotlin.jvm.internal.o.g(defaultConvert, "defaultConvert");
        this.map = map;
        this.defaultConvert = defaultConvert;
    }

    public final java.lang.Class<? extends in5.r> getDefaultConvert() {
        return this.defaultConvert;
    }

    @Override // in5.s
    public in5.r getItemConvert(int type) {
        java.lang.Class<? extends in5.r> cls = this.map.get(java.lang.Integer.valueOf(type));
        in5.r newInstance = cls != null ? cls.newInstance() : null;
        if (newInstance != null) {
            return newInstance;
        }
        in5.r newInstance2 = this.defaultConvert.newInstance();
        kotlin.jvm.internal.o.f(newInstance2, "newInstance(...)");
        return newInstance2;
    }

    public final java.util.Map<java.lang.Integer, java.lang.Class<? extends in5.r>> getMap() {
        return this.map;
    }
}

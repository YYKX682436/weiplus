package com.tencent.mm.plugin.mvvmlist;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R#\u0010\u0007\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/tencent/mm/plugin/mvvmlist/SingleItemConvertFactory;", "Lin5/s;", "", "type", "Lin5/r;", "getItemConvert", "Ljava/lang/Class;", "clazz", "Ljava/lang/Class;", "getClazz", "()Ljava/lang/Class;", "<init>", "(Ljava/lang/Class;)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SingleItemConvertFactory implements in5.s {
    private final java.lang.Class<? extends in5.r> clazz;

    public SingleItemConvertFactory(java.lang.Class<? extends in5.r> clazz) {
        kotlin.jvm.internal.o.g(clazz, "clazz");
        this.clazz = clazz;
    }

    public final java.lang.Class<? extends in5.r> getClazz() {
        return this.clazz;
    }

    @Override // in5.s
    public in5.r getItemConvert(int type) {
        in5.r newInstance = this.clazz.newInstance();
        kotlin.jvm.internal.o.f(newInstance, "newInstance(...)");
        return newInstance;
    }
}

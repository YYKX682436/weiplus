package com.tencent.unit_rc;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0011\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0087 R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/tencent/unit_rc/BaseObjectFinalizer;", "", "Lcom/tencent/unit_rc/BaseObjectDef;", "obj", "Ljz5/f0;", "registerObject", "", "nativePointer", "destroy", "Lcom/tencent/unit_rc/cleaner/Cleaner;", "cleaner$delegate", "Ljz5/g;", "getCleaner", "()Lcom/tencent/unit_rc/cleaner/Cleaner;", "cleaner", "<init>", "()V", "unit_rc_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes16.dex */
public final class BaseObjectFinalizer {
    public static final com.tencent.unit_rc.BaseObjectFinalizer INSTANCE = new com.tencent.unit_rc.BaseObjectFinalizer();

    /* renamed from: cleaner$delegate, reason: from kotlin metadata */
    private static final jz5.g cleaner = jz5.h.b(com.tencent.unit_rc.BaseObjectFinalizer$cleaner$2.INSTANCE);

    private BaseObjectFinalizer() {
    }

    public static final native void destroy(long j17);

    private final com.tencent.unit_rc.cleaner.Cleaner getCleaner() {
        java.lang.Object value = cleaner.getValue();
        kotlin.jvm.internal.o.f(value, "<get-cleaner>(...)");
        return (com.tencent.unit_rc.cleaner.Cleaner) value;
    }

    public static final void registerObject(com.tencent.unit_rc.BaseObjectDef obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        final long strongPointer = obj.getStrongPointer();
        INSTANCE.getCleaner().register(obj, new java.lang.Runnable() { // from class: com.tencent.unit_rc.BaseObjectFinalizer$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.unit_rc.BaseObjectFinalizer.destroy(strongPointer);
            }
        });
    }
}

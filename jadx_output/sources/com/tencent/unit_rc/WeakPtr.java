package com.tencent.unit_rc;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0004J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\r\u0010\u0011\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\tR\u0012\u0010\u0005\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0016\u0010\u0007\u001a\u0004\u0018\u00018\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tencent/unit_rc/WeakPtr;", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "", "obj", "(Ljava/lang/Object;)V", "strongPtr", "Ljava/lang/Object;", "value", "getValue", "()Ljava/lang/Object;", "weakPtr", "Ljava/lang/ref/WeakReference;", "equals", "", "other", "hashCode", "", "lock", "unit_rc_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class WeakPtr<T> {
    private T strongPtr;
    private java.lang.ref.WeakReference<T> weakPtr;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public WeakPtr() {
        /*
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.unit_rc.WeakPtr.<init>():void");
    }

    private final T getValue() {
        T t17 = this.strongPtr;
        if (t17 != null) {
            return t17;
        }
        java.lang.ref.WeakReference<T> weakReference = this.weakPtr;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.o.b(com.tencent.unit_rc.WeakPtr.class, other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.o.e(other, "null cannot be cast to non-null type com.tencent.unit_rc.WeakPtr<*>");
        return kotlin.jvm.internal.o.b(getValue(), ((com.tencent.unit_rc.WeakPtr) other).getValue());
    }

    public int hashCode() {
        T value = getValue();
        if (value != null) {
            return value.hashCode();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T lock() {
        T value = getValue();
        if (!(value instanceof com.tencent.unit_rc.BaseObject)) {
            return value;
        }
        com.tencent.unit_rc.BaseObject baseObject = (com.tencent.unit_rc.BaseObject) value;
        return baseObject.isProxy() ? (T) baseObject.strongBaseRC() : value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WeakPtr(T t17) {
        if (t17 != 0) {
            if (t17 instanceof com.tencent.unit_rc.BaseObject) {
                com.tencent.unit_rc.BaseObject baseObject = (com.tencent.unit_rc.BaseObject) t17;
                if (baseObject.isProxy()) {
                    this.strongPtr = (T) baseObject.weakBaseRC();
                    return;
                }
            }
            this.weakPtr = new java.lang.ref.WeakReference<>(t17);
        }
    }

    public /* synthetic */ WeakPtr(java.lang.Object obj, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : obj);
    }
}

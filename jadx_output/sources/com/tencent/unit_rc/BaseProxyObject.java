package com.tencent.unit_rc;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/tencent/unit_rc/BaseProxyObject;", "Lcom/tencent/unit_rc/BaseObject;", "()V", "equals", "", "other", "", "hashCode", "", "isProxy", "Companion", "unit_rc_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes15.dex */
public class BaseProxyObject extends com.tencent.unit_rc.BaseObject {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.unit_rc.BaseProxyObject.Companion INSTANCE = new com.tencent.unit_rc.BaseProxyObject.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0082 J\u0011\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H\u0082 ¨\u0006\u000b"}, d2 = {"Lcom/tencent/unit_rc/BaseProxyObject$Companion;", "", "()V", "equal", "", "pa", "", "pb", "hashCode", "", "pointer", "unit_rc_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final native boolean equal(long pa6, long pb6);

        /* JADX INFO: Access modifiers changed from: private */
        public final native int hashCode(long pointer);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.o.b(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.o.e(other, "null cannot be cast to non-null type com.tencent.unit_rc.BaseProxyObject");
        return INSTANCE.equal(getCppPointer(), ((com.tencent.unit_rc.BaseProxyObject) other).getCppPointer());
    }

    public int hashCode() {
        return INSTANCE.hashCode(getCppPointer());
    }

    @Override // com.tencent.unit_rc.BaseObject, com.tencent.unit_rc.BaseObjectDef
    public boolean isProxy() {
        return true;
    }
}

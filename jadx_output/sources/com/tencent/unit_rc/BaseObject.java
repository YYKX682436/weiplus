package com.tencent.unit_rc;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\b&\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0000H\u0086 J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0000H\u0086 R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0012\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/tencent/unit_rc/BaseObject;", "Lcom/tencent/unit_rc/BaseObjectDef;", "", "isProxy", "", ya.b.INDEX, "Ljz5/f0;", "notifyFieldUpdated", "strongBaseRC", "weakBaseRC", "", "strongPointer", "J", "getStrongPointer", "()J", "weakPointer", "getWeakPointer", "getCppPointer", "cppPointer", "<init>", "()V", "Companion", "unit_rc_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes11.dex */
public abstract class BaseObject implements com.tencent.unit_rc.BaseObjectDef {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.unit_rc.BaseObject.Companion INSTANCE = new com.tencent.unit_rc.BaseObject.Companion(null);
    private final long strongPointer;
    private final long weakPointer;

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 J\u0016\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\r"}, d2 = {"Lcom/tencent/unit_rc/BaseObject$Companion;", "", "", "nativePointer", "", ya.b.INDEX, "Ljz5/f0;", "nativeNotifyFieldUpdated", "Lcom/tencent/unit_rc/BaseObjectDef;", "obj", "notifyFieldUpdated", "<init>", "()V", "unit_rc_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final native void nativeNotifyFieldUpdated(long j17, int i17);

        public final void notifyFieldUpdated(com.tencent.unit_rc.BaseObjectDef obj, int i17) {
            kotlin.jvm.internal.o.g(obj, "obj");
            long strongPointer = obj.getStrongPointer();
            if (strongPointer == 0) {
                strongPointer = obj.getWeakPointer();
            }
            if (strongPointer == 0) {
                return;
            }
            nativeNotifyFieldUpdated(strongPointer, i17);
        }
    }

    public final long getCppPointer() {
        if (getStrongPointer() != 0) {
            return getStrongPointer();
        }
        if (getWeakPointer() != 0) {
            return getWeakPointer();
        }
        return 0L;
    }

    @Override // com.tencent.unit_rc.BaseObjectDef
    public long getStrongPointer() {
        return this.strongPointer;
    }

    @Override // com.tencent.unit_rc.BaseObjectDef
    public long getWeakPointer() {
        return this.weakPointer;
    }

    @Override // com.tencent.unit_rc.BaseObjectDef
    public boolean isProxy() {
        return false;
    }

    @Override // com.tencent.unit_rc.BaseObjectDef
    public void notifyFieldUpdated(int i17) {
        long cppPointer = getCppPointer();
        if (cppPointer == 0) {
            return;
        }
        INSTANCE.nativeNotifyFieldUpdated(cppPointer, i17);
    }

    public final native com.tencent.unit_rc.BaseObject strongBaseRC();

    public final native com.tencent.unit_rc.BaseObject weakBaseRC();
}

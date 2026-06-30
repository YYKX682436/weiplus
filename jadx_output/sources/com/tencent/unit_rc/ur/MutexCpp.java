package com.tencent.unit_rc.ur;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \n2\u00020\u00012\u00020\u0002:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, d2 = {"Lcom/tencent/unit_rc/ur/MutexCpp;", "Lcom/tencent/unit_rc/BaseProxyObject;", "Lcom/tencent/unit_rc/ur/Mutex;", "", "tryLock", "Ljz5/f0;", "lock", "unlock", "<init>", "()V", "Companion", "unit_rc_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes16.dex */
public class MutexCpp extends com.tencent.unit_rc.BaseProxyObject implements com.tencent.unit_rc.ur.Mutex {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.unit_rc.ur.MutexCpp.Companion INSTANCE = new com.tencent.unit_rc.ur.MutexCpp.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/tencent/unit_rc/ur/MutexCpp$Companion;", "", "()V", "create", "Lcom/tencent/unit_rc/ur/Mutex;", "unit_rc_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.unit_rc.ur.Mutex create() {
            return (com.tencent.unit_rc.ur.Mutex) urgen.ur_96F1.UR_2F01.UR_21C5();
        }
    }

    public static final com.tencent.unit_rc.ur.Mutex create() {
        return INSTANCE.create();
    }

    @Override // com.tencent.unit_rc.ur.Mutex
    public void lock() {
        urgen.ur_96F1.UR_2F01.UR_1288(getCppPointer());
    }

    @Override // com.tencent.unit_rc.ur.Mutex
    public boolean tryLock() {
        return urgen.ur_96F1.UR_2F01.UR_8EAA(getCppPointer());
    }

    @Override // com.tencent.unit_rc.ur.Mutex
    public void unlock() {
        urgen.ur_96F1.UR_2F01.UR_EF7B(getCppPointer());
    }
}

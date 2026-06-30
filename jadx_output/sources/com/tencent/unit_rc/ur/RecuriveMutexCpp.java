package com.tencent.unit_rc.ur;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/unit_rc/ur/RecuriveMutexCpp;", "Lcom/tencent/unit_rc/ur/MutexCpp;", "Lcom/tencent/unit_rc/ur/RecuriveMutex;", "()V", "Companion", "unit_rc_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes16.dex */
public class RecuriveMutexCpp extends com.tencent.unit_rc.ur.MutexCpp implements com.tencent.unit_rc.ur.RecuriveMutex {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.unit_rc.ur.RecuriveMutexCpp.Companion INSTANCE = new com.tencent.unit_rc.ur.RecuriveMutexCpp.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/tencent/unit_rc/ur/RecuriveMutexCpp$Companion;", "", "()V", "create", "Lcom/tencent/unit_rc/ur/RecuriveMutex;", "unit_rc_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.unit_rc.ur.RecuriveMutex create() {
            return (com.tencent.unit_rc.ur.RecuriveMutex) urgen.ur_96F1.UR_B25D.UR_21C5();
        }
    }

    public static final com.tencent.unit_rc.ur.RecuriveMutex create() {
        return INSTANCE.create();
    }
}

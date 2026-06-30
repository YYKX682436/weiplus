package com.tencent.unit_rc;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/tencent/unit_rc/Executor;", "", "Ljava/lang/Runnable;", "runnable", "Ljz5/f0;", "execute", "Companion", "unit_rc_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes13.dex */
public interface Executor {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.unit_rc.Executor.Companion INSTANCE = com.tencent.unit_rc.Executor.Companion.$$INSTANCE;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0007R.\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/tencent/unit_rc/Executor$Companion;", "", "Lcom/tencent/unit_rc/Executor;", "get", "value", "executor", "Lcom/tencent/unit_rc/Executor;", "getExecutor", "()Lcom/tencent/unit_rc/Executor;", "setExecutor", "(Lcom/tencent/unit_rc/Executor;)V", "Lcom/tencent/unit_rc/DefaultExecutor;", "defaultExecutor$delegate", "Ljz5/g;", "getDefaultExecutor", "()Lcom/tencent/unit_rc/DefaultExecutor;", "defaultExecutor", "<init>", "()V", "unit_rc_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes13.dex */
    public static final class Companion {
        static final /* synthetic */ com.tencent.unit_rc.Executor.Companion $$INSTANCE = new com.tencent.unit_rc.Executor.Companion();

        /* renamed from: defaultExecutor$delegate, reason: from kotlin metadata */
        private static final jz5.g defaultExecutor = jz5.h.b(com.tencent.unit_rc.Executor$Companion$defaultExecutor$2.INSTANCE);
        private static com.tencent.unit_rc.Executor executor;

        private Companion() {
        }

        private final com.tencent.unit_rc.DefaultExecutor getDefaultExecutor() {
            return (com.tencent.unit_rc.DefaultExecutor) defaultExecutor.getValue();
        }

        public final com.tencent.unit_rc.Executor get() {
            com.tencent.unit_rc.Executor executor2 = executor;
            return executor2 == null ? getDefaultExecutor() : executor2;
        }

        public final com.tencent.unit_rc.Executor getExecutor() {
            return executor;
        }

        public final void setExecutor(com.tencent.unit_rc.Executor executor2) {
            com.tencent.unit_rc.UnitRCLog.info("Executor, set " + executor2);
            executor = executor2;
        }
    }

    static com.tencent.unit_rc.Executor get() {
        return INSTANCE.get();
    }

    void execute(java.lang.Runnable runnable);
}

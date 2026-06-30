package com.tencent.unit_rc.ur.p001static;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u0005\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/unit_rc/ur/static/ThreadUtilsJavaStatic;", "", "Lkotlin/Function0;", "Ljz5/f0;", "runnable", "asyncRunDefault", "<init>", "()V", "unit_rc_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes13.dex */
public final class ThreadUtilsJavaStatic {
    public static final com.tencent.unit_rc.ur.p001static.ThreadUtilsJavaStatic INSTANCE = new com.tencent.unit_rc.ur.p001static.ThreadUtilsJavaStatic();

    private ThreadUtilsJavaStatic() {
    }

    public static final void asyncRunDefault(final yz5.a aVar) {
        if (aVar == null) {
            com.tencent.unit_rc.UnitRCLog.error("asyncRunDefault, runnable is null");
        } else {
            com.tencent.unit_rc.Executor.INSTANCE.get().execute(new java.lang.Runnable() { // from class: wv5.a$$a
                @Override // java.lang.Runnable
                public final void run() {
                    yz5.a.this.invoke();
                }
            });
        }
    }
}

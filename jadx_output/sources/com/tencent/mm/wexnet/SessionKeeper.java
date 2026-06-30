package com.tencent.mm.wexnet;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/wexnet/SessionKeeper;", "Lx71/o;", "Ljz5/f0;", "close", "finalize", "expire", "", "provideSessionPtr", "sessionPtr", "J", "<init>", "(J)V", "Companion", "com/tencent/mm/wexnet/q", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class SessionKeeper implements x71.o {
    public static final com.tencent.mm.wexnet.q Companion = new com.tencent.mm.wexnet.q(null);
    public static final java.lang.String TAG = "MicroMsg.SessionKeeper";
    private long sessionPtr;

    public SessionKeeper(long j17) {
        this.sessionPtr = j17;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        try {
            com.tencent.mm.wexnet.WeXNet.Companion companion = com.tencent.mm.wexnet.WeXNet.INSTANCE;
            long j17 = this.sessionPtr;
            companion.a();
            com.tencent.mm.wexnet.Result releaseSession = com.tencent.mm.wexnet.WeXNet.releaseSession(j17);
            com.tencent.mars.xlog.Log.i(TAG, "close, sessionPtr: " + this.sessionPtr + ", result.success: " + releaseSession.getSuccess());
            if (releaseSession.getSuccess()) {
                expire();
            }
        } catch (com.tencent.mm.wexnet.w e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
        }
    }

    @Override // x71.o
    public void expire() {
        this.sessionPtr = -1L;
    }

    public final void finalize() {
        close();
    }

    @Override // x71.o
    /* renamed from: provideSessionPtr, reason: from getter */
    public long getSessionPtr() {
        return this.sessionPtr;
    }
}

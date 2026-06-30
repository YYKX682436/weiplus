package com.tencent.mm.wexnet;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/wexnet/SessionCreateResult;", "Lcom/tencent/mm/wexnet/Result;", ya.b.SUCCESS, "", "codes", "", "desc", "", "", "sessionKeeper", "Lcom/tencent/mm/wexnet/SessionKeeper;", "(Z[J[Ljava/lang/String;Lcom/tencent/mm/wexnet/SessionKeeper;)V", "getSessionKeeper", "()Lcom/tencent/mm/wexnet/SessionKeeper;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SessionCreateResult extends com.tencent.mm.wexnet.Result {
    private final com.tencent.mm.wexnet.SessionKeeper sessionKeeper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionCreateResult(boolean z17, long[] codes, java.lang.String[] desc, com.tencent.mm.wexnet.SessionKeeper sessionKeeper) {
        super(z17, codes, desc);
        kotlin.jvm.internal.o.g(codes, "codes");
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(sessionKeeper, "sessionKeeper");
        this.sessionKeeper = sessionKeeper;
    }

    public final com.tencent.mm.wexnet.SessionKeeper getSessionKeeper() {
        return this.sessionKeeper;
    }
}

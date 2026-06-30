package com.tencent.wva.hostsdk;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\b\u0007\u0018\u0000 \u00172\u00060\u0001j\u0002`\u0002:\u0001\u0018B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0014B\u0019\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0015B\u0019\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/tencent/wva/hostsdk/WVAException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lcom/tencent/shadow/dynamic/host/ErrorInfo;", "errInfo", "Lcom/tencent/shadow/dynamic/host/ErrorInfo;", "getErrInfo", "()Lcom/tencent/shadow/dynamic/host/ErrorInfo;", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", "", com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, "", "cause", "<init>", "(Lcom/tencent/shadow/dynamic/host/ErrorInfo;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Throwable;)V", "errorInfo", "(Lcom/tencent/shadow/dynamic/host/ErrorInfo;)V", "(Lcom/tencent/shadow/dynamic/host/ErrorInfo;Ljava/lang/String;)V", "(Lcom/tencent/shadow/dynamic/host/ErrorInfo;Ljava/lang/Throwable;)V", "Companion", "hx5/f", "host-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes16.dex */
public final class WVAException extends java.lang.RuntimeException {
    public static final hx5.f Companion = new hx5.f(null);
    private final java.lang.Object data;
    private final com.tencent.shadow.dynamic.host.ErrorInfo errInfo;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public WVAException(com.tencent.shadow.dynamic.host.ErrorInfo r3, java.lang.Object r4, java.lang.String r5, java.lang.Throwable r6) {
        /*
            r2 = this;
            java.lang.String r0 = "errInfo"
            kotlin.jvm.internal.o.g(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.toString()
            r0.append(r1)
            if (r5 == 0) goto L1b
            java.lang.String r1 = ": "
            java.lang.String r5 = r1.concat(r5)
            if (r5 != 0) goto L1d
        L1b:
            java.lang.String r5 = ""
        L1d:
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r2.<init>(r5, r6)
            r2.errInfo = r3
            r2.data = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wva.hostsdk.WVAException.<init>(com.tencent.shadow.dynamic.host.ErrorInfo, java.lang.Object, java.lang.String, java.lang.Throwable):void");
    }

    public final java.lang.Object getData() {
        return this.data;
    }

    public final com.tencent.shadow.dynamic.host.ErrorInfo getErrInfo() {
        return this.errInfo;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WVAException(com.tencent.shadow.dynamic.host.ErrorInfo errorInfo) {
        this(errorInfo, null, null, null);
        kotlin.jvm.internal.o.g(errorInfo, "errorInfo");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WVAException(com.tencent.shadow.dynamic.host.ErrorInfo errorInfo, java.lang.String message) {
        this(errorInfo, null, message, null);
        kotlin.jvm.internal.o.g(errorInfo, "errorInfo");
        kotlin.jvm.internal.o.g(message, "message");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WVAException(com.tencent.shadow.dynamic.host.ErrorInfo errorInfo, java.lang.Throwable cause) {
        this(errorInfo, cause.getMessage(), null, cause);
        kotlin.jvm.internal.o.g(errorInfo, "errorInfo");
        kotlin.jvm.internal.o.g(cause, "cause");
    }
}

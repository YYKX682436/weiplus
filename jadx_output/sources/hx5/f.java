package hx5;

/* loaded from: classes16.dex */
public final class f {
    public f(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.wva.hostsdk.WVAException a(com.tencent.shadow.dynamic.host.ErrorInfo errorInfo, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(errorInfo, "errorInfo");
        return obj == null ? new com.tencent.wva.hostsdk.WVAException(errorInfo) : obj instanceof java.lang.Throwable ? new com.tencent.wva.hostsdk.WVAException(errorInfo, (java.lang.Throwable) obj) : obj instanceof java.lang.String ? new com.tencent.wva.hostsdk.WVAException(errorInfo, (java.lang.String) obj) : new com.tencent.wva.hostsdk.WVAException(errorInfo, obj, null, null);
    }
}

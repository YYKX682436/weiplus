package pg0;

@j95.b
/* loaded from: classes.dex */
public final class t1 extends i95.w implements qg0.z {
    public void wi(java.lang.String bizType, java.lang.String bizId, java.lang.String errorCode, java.lang.String errorMsg) {
        kotlin.jvm.internal.o.g(bizType, "bizType");
        kotlin.jvm.internal.o.g(bizId, "bizId");
        kotlin.jvm.internal.o.g(errorCode, "errorCode");
        kotlin.jvm.internal.o.g(errorMsg, "errorMsg");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(24610, bizType, bizId, errorCode, errorMsg);
    }
}

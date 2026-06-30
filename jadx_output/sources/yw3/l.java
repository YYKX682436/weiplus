package yw3;

/* loaded from: classes.dex */
public final class l extends com.tencent.pigeon.mm_foundation.AutoSetupDemoServiceHostApi {
    @Override // com.tencent.pigeon.mm_foundation.DemoServiceHostApi
    public void getDemoString(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl("test12")));
    }
}

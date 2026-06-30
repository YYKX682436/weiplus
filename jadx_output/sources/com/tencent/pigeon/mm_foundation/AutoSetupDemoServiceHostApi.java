package com.tencent.pigeon.mm_foundation;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"Lcom/tencent/pigeon/mm_foundation/AutoSetupDemoServiceHostApi;", "Lsi0/p0;", "Lcom/tencent/pigeon/mm_foundation/DemoServiceHostApi;", "Lio/flutter/plugin/common/BinaryMessenger;", "binaryMessenger", "Ljz5/f0;", "register", "unregister", "<init>", "()V", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public abstract class AutoSetupDemoServiceHostApi implements si0.p0, com.tencent.pigeon.mm_foundation.DemoServiceHostApi {
    @Override // si0.p0
    public void register(io.flutter.plugin.common.BinaryMessenger binaryMessenger) {
        kotlin.jvm.internal.o.g(binaryMessenger, "binaryMessenger");
        com.tencent.pigeon.mm_foundation.DemoServiceHostApi.Companion.setUp$default(com.tencent.pigeon.mm_foundation.DemoServiceHostApi.INSTANCE, binaryMessenger, this, null, 4, null);
    }

    public void unregister(io.flutter.plugin.common.BinaryMessenger binaryMessenger) {
        kotlin.jvm.internal.o.g(binaryMessenger, "binaryMessenger");
        com.tencent.pigeon.mm_foundation.DemoServiceHostApi.Companion.setUp$default(com.tencent.pigeon.mm_foundation.DemoServiceHostApi.INSTANCE, binaryMessenger, null, null, 4, null);
    }
}

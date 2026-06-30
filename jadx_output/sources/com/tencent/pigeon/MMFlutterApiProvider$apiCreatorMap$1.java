package com.tencent.pigeon;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/tencent/pigeon/mm_foundation/DemoServiceFlutterApi;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MMFlutterApiProvider$apiCreatorMap$1 extends kotlin.jvm.internal.q implements yz5.a {
    final /* synthetic */ io.flutter.plugin.common.BinaryMessenger $binaryMessenger;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MMFlutterApiProvider$apiCreatorMap$1(io.flutter.plugin.common.BinaryMessenger binaryMessenger) {
        super(0);
        this.$binaryMessenger = binaryMessenger;
    }

    @Override // yz5.a
    public final com.tencent.pigeon.mm_foundation.DemoServiceFlutterApi invoke() {
        return new com.tencent.pigeon.mm_foundation.DemoServiceFlutterApi(this.$binaryMessenger, null, 2, null);
    }
}

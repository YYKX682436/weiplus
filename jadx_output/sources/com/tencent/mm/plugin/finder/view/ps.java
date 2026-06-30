package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class ps extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.SimpleTouchableLayout f132861d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ps(com.tencent.mm.plugin.finder.view.SimpleTouchableLayout simpleTouchableLayout) {
        super(0);
        this.f132861d = simpleTouchableLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.view.SimpleTouchableLayout simpleTouchableLayout = this.f132861d;
        return new com.tencent.mm.plugin.finder.view.z0(simpleTouchableLayout.getContext(), simpleTouchableLayout, new android.os.Handler(android.os.Looper.getMainLooper()), "MicroMsg.TouchableLayout#touchDetector");
    }
}

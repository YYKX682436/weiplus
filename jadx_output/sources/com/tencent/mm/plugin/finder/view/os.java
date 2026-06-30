package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class os extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.SimpleTouchableLayout f132806d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public os(com.tencent.mm.plugin.finder.view.SimpleTouchableLayout simpleTouchableLayout) {
        super(0);
        this.f132806d = simpleTouchableLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.view.SimpleTouchableLayout simpleTouchableLayout = this.f132806d;
        return new com.tencent.mm.plugin.finder.view.z0(simpleTouchableLayout.getContext(), new com.tencent.mm.plugin.finder.view.ns(simpleTouchableLayout), null, "MicroMsg.TouchableLayout#simultaneousLongPressDetector");
    }
}

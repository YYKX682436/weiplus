package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes14.dex */
public final class cw extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.sx f134040d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw(com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar) {
        super(0);
        this.f134040d = sxVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new com.tencent.mm.sdk.platformtools.b4("finder_device_search", (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.finder.viewmodel.component.bw(this.f134040d), true);
    }
}

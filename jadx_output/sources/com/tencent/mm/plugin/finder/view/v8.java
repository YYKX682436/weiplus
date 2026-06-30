package com.tencent.mm.plugin.finder.view;

/* loaded from: classes8.dex */
public final class v8 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderExtendActivityView f133231d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8(com.tencent.mm.plugin.finder.view.FinderExtendActivityView finderExtendActivityView) {
        super(1);
        this.f133231d = finderExtendActivityView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar != null && fVar.f70616b == -4064) {
            this.f133231d.setEnable(false);
        }
        return jz5.f0.f302826a;
    }
}

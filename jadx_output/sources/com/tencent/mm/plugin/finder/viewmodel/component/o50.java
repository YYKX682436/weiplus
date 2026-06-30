package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class o50 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC f135424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f135425e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o50(com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC finderSpeedControlUIC, yz5.l lVar) {
        super(1);
        this.f135424d = finderSpeedControlUIC;
        this.f135425e = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yz5.l lVar;
        float floatValue = ((java.lang.Number) obj).floatValue();
        if (!this.f135424d.f133648s.f349388i && (lVar = this.f135425e) != null) {
            lVar.invoke(java.lang.Float.valueOf(floatValue));
        }
        return jz5.f0.f302826a;
    }
}

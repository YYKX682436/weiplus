package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class fc extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f134390d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.nc f134391e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc(com.tencent.mm.protocal.protobuf.FinderObject finderObject, com.tencent.mm.plugin.finder.viewmodel.component.nc ncVar) {
        super(1);
        this.f134390d = finderObject;
        this.f134391e = ncVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        com.tencent.mm.plugin.finder.viewmodel.component.ob obVar = this.f134391e.f135297n;
        if ((obVar == null || (finderObject = obVar.f135460a) == null || this.f134390d.getId() != finderObject.getId()) ? false : true) {
            this.f134391e.f135297n = null;
        }
        return jz5.f0.f302826a;
    }
}

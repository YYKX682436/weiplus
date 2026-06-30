package com.tencent.mm.plugin.finder.service;

/* loaded from: classes2.dex */
public final class c2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.service.l2 f126015a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f126016b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.p f126017c;

    public c2(com.tencent.mm.plugin.finder.service.l2 l2Var, java.lang.String str, yz5.p pVar) {
        this.f126015a = l2Var;
        this.f126016b = str;
        this.f126017c = pVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2);
        long id6 = finderObject != null ? finderObject.getId() : 0L;
        int i17 = fVar.f70616b;
        java.lang.String str = this.f126016b;
        if (i17 == 0 && fVar.f70615a == 0 && id6 != 0) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2);
            kotlin.jvm.internal.o.d(finderObject2);
            this.f126015a.f126113d.d(str, finderObject2);
            bu2.j.f24534a.n(com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject2, 0), bu2.i.f24531l);
        }
        this.f126017c.invoke(str, (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2));
        return jz5.f0.f302826a;
    }
}

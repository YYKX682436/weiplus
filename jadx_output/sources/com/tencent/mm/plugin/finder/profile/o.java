package com.tencent.mm.plugin.finder.profile;

/* loaded from: classes2.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f123400d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.w f123401e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.lang.String str, com.tencent.mm.plugin.finder.profile.w wVar) {
        super(0);
        this.f123400d = str;
        this.f123401e = wVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.profile.f0 f0Var;
        r45.ro2 ro2Var;
        java.util.List<so2.j5> h17 = bu2.e0.f24498a.h(20, this.f123400d);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (so2.j5 j5Var : h17) {
            if ((j5Var instanceof so2.k) && (f0Var = ((so2.k) j5Var).f410451d.f126996e) != null && (ro2Var = f0Var.f123339a) != null) {
                linkedList.add(ro2Var);
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.UserPoiHandler", "[loadLocalData] infoList.size=" + linkedList.size());
        if (linkedList.size() > 0) {
            pm0.v.X(new com.tencent.mm.plugin.finder.profile.n(this.f123401e, linkedList));
        }
        return jz5.f0.f302826a;
    }
}

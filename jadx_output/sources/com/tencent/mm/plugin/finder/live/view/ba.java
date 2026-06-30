package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class ba extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.ka f116211d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(com.tencent.mm.plugin.finder.live.view.ka kaVar) {
        super(2);
        this.f116211d = kaVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.view.View view = (android.view.View) obj;
        el2.v2 info = (el2.v2) obj2;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mm.plugin.finder.live.view.ka kaVar = this.f116211d;
        rl5.r rVar = new rl5.r(kaVar.f118183e);
        rVar.g(view, 0, 0L, new com.tencent.mm.plugin.finder.live.view.z9(kaVar), new com.tencent.mm.plugin.finder.live.view.aa(kaVar, info), com.tencent.mm.view.TouchableLayout.f213511d, com.tencent.mm.view.TouchableLayout.f213512e);
        rVar.m();
        return jz5.f0.f302826a;
    }
}

package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class oa extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.qa f113729d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa(com.tencent.mm.plugin.finder.live.plugin.qa qaVar) {
        super(1);
        this.f113729d = qaVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderObjectDesc it = (com.tencent.mm.protocal.protobuf.FinderObjectDesc) obj;
        kotlin.jvm.internal.o.g(it, "it");
        qo0.c cVar = this.f113729d.f113980p;
        qo0.b bVar = qo0.b.J1;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putByteArray("PARAM_KEY_POST_OBJECT_DESC", it.toByteArray());
        cVar.statusChange(bVar, bundle);
        return jz5.f0.f302826a;
    }
}

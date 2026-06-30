package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class bb extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.nb f117858d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az2.f f117859e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f117860f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb(com.tencent.mm.plugin.finder.live.widget.nb nbVar, az2.f fVar, java.lang.String str) {
        super(1);
        this.f117858d = nbVar;
        this.f117859e = fVar;
        this.f117860f = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.nx0 it = (r45.nx0) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.live.widget.nb nbVar = this.f117858d;
        kotlinx.coroutines.y0 y0Var = nbVar.E;
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, new com.tencent.mm.plugin.finder.live.widget.ab(this.f117859e, this.f117860f, nbVar, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}

package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ms extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.et f119117d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.vv1 f119118e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ms(com.tencent.mm.plugin.finder.live.widget.et etVar, r45.vv1 vv1Var) {
        super(0);
        this.f119117d = etVar;
        this.f119118e = vv1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.widget.et etVar = this.f119117d;
        kotlinx.coroutines.y0 y0Var = etVar.E;
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.plugin.finder.live.widget.ls(etVar, this.f119118e, null), 2, null);
        }
        return jz5.f0.f302826a;
    }
}

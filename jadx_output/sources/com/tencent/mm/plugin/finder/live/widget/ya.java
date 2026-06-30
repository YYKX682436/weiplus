package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class ya extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f120427d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az2.f f120428e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.nb f120429f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya(kotlinx.coroutines.y0 y0Var, az2.f fVar, com.tencent.mm.plugin.finder.live.widget.nb nbVar) {
        super(2);
        this.f120427d = y0Var;
        this.f120428e = fVar;
        this.f120429f = nbVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String str = (java.lang.String) obj2;
        kotlinx.coroutines.y0 y0Var = this.f120427d;
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, new com.tencent.mm.plugin.finder.live.widget.xa(this.f120428e, intValue, str, this.f120429f, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}

package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class ka extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f118828d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az2.f f118829e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.ra f118830f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka(kotlinx.coroutines.y0 y0Var, az2.f fVar, com.tencent.mm.plugin.finder.live.widget.ra raVar) {
        super(2);
        this.f118828d = y0Var;
        this.f118829e = fVar;
        this.f118830f = raVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String str = (java.lang.String) obj2;
        kotlinx.coroutines.y0 y0Var = this.f118828d;
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, new com.tencent.mm.plugin.finder.live.widget.ja(this.f118829e, intValue, str, this.f118830f, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}

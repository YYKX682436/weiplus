package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class db extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.nb f118096d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az2.f f118097e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db(com.tencent.mm.plugin.finder.live.widget.nb nbVar, az2.f fVar) {
        super(2);
        this.f118096d = nbVar;
        this.f118097e = fVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String str = (java.lang.String) obj2;
        com.tencent.mm.plugin.finder.live.widget.nb nbVar = this.f118096d;
        kotlinx.coroutines.y0 y0Var = nbVar.E;
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, new com.tencent.mm.plugin.finder.live.widget.cb(this.f118097e, intValue, str, nbVar, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}

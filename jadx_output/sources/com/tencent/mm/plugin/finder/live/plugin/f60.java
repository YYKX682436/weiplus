package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class f60 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.r60 f112505d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f60(com.tencent.mm.plugin.finder.live.plugin.r60 r60Var) {
        super(1);
        this.f112505d = r60Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        kotlinx.coroutines.r2 r2Var;
        cm2.t item = (cm2.t) obj;
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.finder.live.plugin.r60 r60Var = this.f112505d;
        com.tencent.mars.xlog.Log.i(r60Var.f114098s, "[onBubbleContentClick] itemId = " + item.f43385d);
        if (r60Var.G.contains(item.getClass()) && (r2Var = r60Var.C) != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        df2.nt ntVar = (df2.nt) r60Var.U0(df2.nt.class);
        if (ntVar != null) {
            r45.yp5 yp5Var = new r45.yp5();
            yp5Var.set(0, java.lang.Long.valueOf(item.f43385d));
            yp5Var.set(2, 1);
            yp5Var.set(1, 2);
            yp5Var.set(3, item.f43397s);
            ntVar.a7(yp5Var);
        }
        com.tencent.mm.protobuf.g gVar = item.f43397s;
        com.tencent.mars.xlog.Log.i("kenneth_PromoteReport", "[reportClick] reportExtBuff:".concat(gVar != null ? new java.lang.String(gVar.g(), r26.c.f368865a) : ""));
        return jz5.f0.f302826a;
    }
}

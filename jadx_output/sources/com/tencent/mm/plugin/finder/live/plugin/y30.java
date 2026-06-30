package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class y30 {
    public y30(kotlin.jvm.internal.i iVar) {
    }

    public final void a(android.content.Context context, cm2.b0 data) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(data, "data");
        int i17 = data.f43332w;
        if (i17 == 15) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            com.tencent.mm.protocal.protobuf.FinderJumpInfo info = data.f43331v;
            r45.l34 l34Var = new r45.l34();
            l34Var.set(4, java.lang.Float.valueOf(0.65f));
            kotlin.jvm.internal.o.g(info, "info");
            xc2.y2 y2Var = xc2.y2.f453343a;
            xc2.p0 p0Var = new xc2.p0(info);
            p0Var.f453238c = l34Var;
            xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
            return;
        }
        if (i17 == 18) {
            pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.x30(context, data));
            return;
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        com.tencent.mm.protocal.protobuf.FinderJumpInfo info2 = data.f43331v;
        kotlin.jvm.internal.o.g(info2, "info");
        xc2.y2 y2Var2 = xc2.y2.f453343a;
        xc2.p0 p0Var2 = new xc2.p0(info2);
        p0Var2.f453252n = 0;
        xc2.y2.i(y2Var2, context, p0Var2, 0, null, 8, null);
    }
}

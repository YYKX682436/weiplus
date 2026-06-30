package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class td0 implements com.tencent.mm.sdk.platformtools.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.de0 f114387d;

    public td0(com.tencent.mm.plugin.finder.live.plugin.de0 de0Var) {
        this.f114387d = de0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message msg) {
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z27;
        kotlin.jvm.internal.o.g(msg, "msg");
        int i17 = msg.what;
        com.tencent.mm.plugin.finder.live.plugin.de0 de0Var = this.f114387d;
        if (i17 == de0Var.f112279t) {
            java.lang.Object obj = msg.obj;
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveMsg");
            r45.t12 t12Var = (r45.t12) obj;
            de0Var.getClass();
            r45.xn1 xn1Var = (r45.xn1) t12Var.getCustom(8);
            java.util.LinkedList<r45.yl1> list = xn1Var != null ? xn1Var.getList(11) : null;
            if (list != null) {
                for (r45.yl1 yl1Var : list) {
                    if (yl1Var.getInteger(0) == 5) {
                        z17 = kotlin.jvm.internal.o.b(yl1Var.getString(4), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f491469d60));
                        break;
                    }
                }
            }
            z17 = false;
            r45.xn1 xn1Var2 = (r45.xn1) t12Var.getCustom(8);
            java.util.LinkedList<r45.yl1> list2 = xn1Var2 != null ? xn1Var2.getList(11) : null;
            if (list2 != null) {
                for (r45.yl1 yl1Var2 : list2) {
                    if (yl1Var2.getInteger(0) == 5) {
                        z18 = kotlin.jvm.internal.o.b(yl1Var2.getString(4), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dtf));
                        break;
                    }
                }
            }
            z18 = false;
            r45.xn1 xn1Var3 = (r45.xn1) t12Var.getCustom(8);
            java.util.LinkedList<r45.yl1> list3 = xn1Var3 != null ? xn1Var3.getList(11) : null;
            if (list3 != null) {
                for (r45.yl1 yl1Var3 : list3) {
                    if (yl1Var3.getInteger(0) == 20) {
                        z19 = kotlin.jvm.internal.o.b(yl1Var3.getString(4), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.ouc));
                        break;
                    }
                }
            }
            z19 = false;
            r45.xn1 xn1Var4 = (r45.xn1) t12Var.getCustom(8);
            java.util.LinkedList<r45.yl1> list4 = xn1Var4 != null ? xn1Var4.getList(11) : null;
            if (list4 != null) {
                for (r45.yl1 yl1Var4 : list4) {
                    if (yl1Var4.getInteger(0) == -10001) {
                        z27 = kotlin.jvm.internal.o.b(yl1Var4.getString(4), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.npz));
                        break;
                    }
                }
            }
            z27 = false;
            pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.zd0(de0Var, t12Var, z17, z18, z19, z27));
        } else if (i17 == de0Var.f112280u) {
            pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.qd0(de0Var));
        } else if (i17 == de0Var.f112281v) {
            pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.rd0(de0Var));
        } else if (i17 == de0Var.f112282w) {
            java.lang.Object obj2 = msg.obj;
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<com.tencent.mm.protocal.protobuf.FinderLiveMsg>{ kotlin.collections.TypeAliasesKt.ArrayList<com.tencent.mm.protocal.protobuf.FinderLiveMsg> }");
            java.util.ArrayList arrayList = (java.util.ArrayList) obj2;
            if (!(!arrayList.isEmpty())) {
                arrayList = null;
            }
            r45.t12 t12Var2 = arrayList != null ? (r45.t12) kz5.n0.F0(arrayList, new com.tencent.mm.plugin.finder.live.plugin.sd0()).get(0) : null;
            if (t12Var2 != null) {
                android.os.Message obtainMessage = de0Var.w1().obtainMessage(de0Var.f112279t);
                obtainMessage.obj = t12Var2;
                de0Var.w1().sendMessage(obtainMessage);
            }
        }
        return true;
    }
}

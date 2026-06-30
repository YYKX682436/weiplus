package com.tencent.mm.plugin.ting.uic;

/* loaded from: classes8.dex */
public final class q0 implements ga0.e {
    @Override // ga0.e
    public com.tencent.mm.plugin.multitask.model.MultiTaskInfo B9(bw5.a40 localStarData) {
        kotlin.jvm.internal.o.g(localStarData, "localStarData");
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = new com.tencent.mm.plugin.multitask.model.MultiTaskInfo();
        multiTaskInfo.v0().set(1, localStarData.b().getTitle());
        if (localStarData.b().f25741r[9] && localStarData.b().b().f36039d == 10 && localStarData.b().b().f36045m[6]) {
            r45.lr4 v07 = multiTaskInfo.v0();
            bw5.hl0 b17 = localStarData.b().b().b();
            v07.set(5, b17.f28266g[2] ? b17.f28264e : "");
            r45.lr4 v08 = multiTaskInfo.v0();
            bw5.hl0 b18 = localStarData.b().b().b();
            v08.set(10, b18.f28266g[1] ? b18.f28263d : "");
            r45.lr4 v09 = multiTaskInfo.v0();
            bw5.hl0 b19 = localStarData.b().b().b();
            v09.set(0, b19.f28266g[3] ? b19.f28265f : "");
            r45.lr4 v010 = multiTaskInfo.v0();
            bw5.al0 d17 = localStarData.b().d();
            v010.set(2, d17.f25262h[2] ? d17.f25259e : "");
        }
        return multiTaskInfo;
    }

    @Override // ga0.e
    public bw5.a40 b4(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
        kotlin.jvm.internal.o.g(multiTaskInfo, "multiTaskInfo");
        bw5.a40 a40Var = new bw5.a40();
        bw5.bl0 bl0Var = new bw5.bl0();
        bw5.zk0 zk0Var = new bw5.zk0();
        zk0Var.f36039d = 10;
        boolean[] zArr = zk0Var.f36045m;
        zArr[1] = true;
        bw5.hl0 hl0Var = new bw5.hl0();
        hl0Var.f28263d = multiTaskInfo.v0().getString(10);
        boolean[] zArr2 = hl0Var.f28266g;
        zArr2[1] = true;
        hl0Var.f28264e = multiTaskInfo.v0().getString(5);
        zArr2[2] = true;
        hl0Var.f28265f = multiTaskInfo.v0().getString(0);
        zArr2[3] = true;
        zk0Var.f36043h = hl0Var;
        zArr[6] = true;
        bl0Var.f25738o = zk0Var;
        boolean[] zArr3 = bl0Var.f25741r;
        zArr3[9] = true;
        bw5.al0 al0Var = new bw5.al0();
        al0Var.f25259e = multiTaskInfo.v0().getString(2);
        al0Var.f25262h[2] = true;
        bl0Var.f25739p = al0Var;
        zArr3[10] = true;
        a40Var.f25008d = bl0Var;
        a40Var.f25011g[1] = true;
        return a40Var;
    }

    @Override // ga0.e
    public java.lang.Class get(int i17) {
        return com.tencent.mm.plugin.ting.uic.m0.class;
    }
}

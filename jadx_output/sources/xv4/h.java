package xv4;

/* loaded from: classes8.dex */
public final class h implements ga0.e {
    @Override // ga0.e
    public com.tencent.mm.plugin.multitask.model.MultiTaskInfo B9(bw5.a40 localStarData) {
        kotlin.jvm.internal.o.g(localStarData, "localStarData");
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = new com.tencent.mm.plugin.multitask.model.MultiTaskInfo();
        multiTaskInfo.v0().set(1, localStarData.b().getTitle());
        return multiTaskInfo;
    }

    @Override // ga0.e
    public bw5.a40 b4(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
        kotlin.jvm.internal.o.g(multiTaskInfo, "multiTaskInfo");
        bw5.a40 a40Var = new bw5.a40();
        bw5.bl0 bl0Var = new bw5.bl0();
        bl0Var.f25738o = new bw5.zk0();
        bl0Var.f25741r[9] = true;
        a40Var.f25008d = bl0Var;
        a40Var.f25011g[1] = true;
        return a40Var;
    }

    @Override // ga0.e
    public java.lang.Class get(int i17) {
        return xv4.g.class;
    }
}

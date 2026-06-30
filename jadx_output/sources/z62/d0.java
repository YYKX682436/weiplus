package z62;

/* loaded from: classes8.dex */
public final class d0 implements ga0.e {
    @Override // ga0.e
    public com.tencent.mm.plugin.multitask.model.MultiTaskInfo B9(bw5.a40 localStarData) {
        kotlin.jvm.internal.o.g(localStarData, "localStarData");
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = new com.tencent.mm.plugin.multitask.model.MultiTaskInfo();
        multiTaskInfo.v0().set(1, localStarData.b().getTitle());
        if (localStarData.b().f25741r[9]) {
            if (localStarData.b().b().f36039d == 3) {
                if (localStarData.b().b().f36045m[5]) {
                    r45.lr4 v07 = multiTaskInfo.v0();
                    bw5.zk0 b17 = localStarData.b().b();
                    bw5.el0 el0Var = b17.f36045m[5] ? b17.f36042g : new bw5.el0();
                    v07.set(5, el0Var.f26951g[2] ? el0Var.f26949e : "");
                    r45.lr4 v08 = multiTaskInfo.v0();
                    bw5.zk0 b18 = localStarData.b().b();
                    bw5.el0 el0Var2 = b18.f36045m[5] ? b18.f36042g : new bw5.el0();
                    v08.set(10, el0Var2.f26951g[1] ? el0Var2.f26948d : "");
                    r45.lr4 v09 = multiTaskInfo.v0();
                    bw5.zk0 b19 = localStarData.b().b();
                    bw5.el0 el0Var3 = b19.f36045m[5] ? b19.f36042g : new bw5.el0();
                    v09.set(0, el0Var3.f26951g[3] ? el0Var3.f26950f : "");
                }
            } else if (localStarData.b().b().f36039d == 2 && localStarData.b().b().f36045m[4]) {
                r45.lr4 v010 = multiTaskInfo.v0();
                bw5.zk0 b27 = localStarData.b().b();
                bw5.gl0 gl0Var = b27.f36045m[4] ? b27.f36041f : new bw5.gl0();
                v010.set(5, gl0Var.f27904g[2] ? gl0Var.f27902e : "");
                r45.lr4 v011 = multiTaskInfo.v0();
                bw5.zk0 b28 = localStarData.b().b();
                bw5.gl0 gl0Var2 = b28.f36045m[4] ? b28.f36041f : new bw5.gl0();
                v011.set(10, gl0Var2.f27904g[1] ? gl0Var2.f27901d : "");
                r45.lr4 v012 = multiTaskInfo.v0();
                bw5.zk0 b29 = localStarData.b().b();
                bw5.gl0 gl0Var3 = b29.f36045m[4] ? b29.f36041f : new bw5.gl0();
                v012.set(0, gl0Var3.f27904g[3] ? gl0Var3.f27903f : "");
            }
        }
        return multiTaskInfo;
    }

    @Override // ga0.e
    public bw5.a40 b4(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
        kotlin.jvm.internal.o.g(multiTaskInfo, "multiTaskInfo");
        bw5.a40 a40Var = new bw5.a40();
        bw5.bl0 bl0Var = new bw5.bl0();
        bw5.zk0 zk0Var = new bw5.zk0();
        int i17 = multiTaskInfo.field_type;
        boolean[] zArr = zk0Var.f36045m;
        if (i17 == 25) {
            zk0Var.f36039d = 3;
            zArr[1] = true;
            bw5.el0 el0Var = new bw5.el0();
            el0Var.f26948d = multiTaskInfo.v0().getString(10);
            boolean[] zArr2 = el0Var.f26951g;
            zArr2[1] = true;
            el0Var.f26949e = multiTaskInfo.v0().getString(5);
            zArr2[2] = true;
            el0Var.f26950f = multiTaskInfo.v0().getString(0);
            zArr2[3] = true;
            zk0Var.f36042g = el0Var;
            zArr[5] = true;
        } else if (i17 == 27) {
            zk0Var.f36039d = 2;
            zArr[1] = true;
            bw5.gl0 gl0Var = new bw5.gl0();
            gl0Var.f27901d = multiTaskInfo.v0().getString(10);
            boolean[] zArr3 = gl0Var.f27904g;
            zArr3[1] = true;
            gl0Var.f27902e = multiTaskInfo.v0().getString(5);
            zArr3[2] = true;
            gl0Var.f27903f = multiTaskInfo.v0().getString(0);
            zArr3[3] = true;
            zk0Var.f36041f = gl0Var;
            zArr[4] = true;
        }
        bl0Var.f25738o = zk0Var;
        bl0Var.f25741r[9] = true;
        a40Var.f25008d = bl0Var;
        a40Var.f25011g[1] = true;
        return a40Var;
    }

    @Override // ga0.e
    public java.lang.Class get(int i17) {
        if (i17 == 25) {
            return com.tencent.mm.plugin.finder.viewmodel.component.tb0.class;
        }
        if (i17 != 27) {
            return null;
        }
        return com.tencent.mm.plugin.finder.viewmodel.component.rp.class;
    }
}

package nh3;

/* loaded from: classes8.dex */
public abstract class a implements f70.f {
    @Override // f70.f
    public void a(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N(path);
    }

    @Override // f70.f
    public /* bridge */ /* synthetic */ byte[] b(int i17) {
        return null;
    }

    @Override // f70.f
    public byte[] c(java.lang.String path) {
        r45.vs2 vs2Var;
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0(path);
        if (L0 == null || (vs2Var = L0.field_ctrInfo) == null) {
            return null;
        }
        return vs2Var.toByteArray();
    }

    @Override // f70.f
    public /* bridge */ /* synthetic */ byte[] d(int i17) {
        return null;
    }

    @Override // f70.f
    public void g(int i17, int i18, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MMEcRedDotHandler", "businessType=" + i17 + " scene=" + i18);
        if (bArr == null || bArr.length == 0) {
            com.tencent.mars.xlog.Log.w("MMEcRedDotHandler", "handleSyncResponse finderCommonReddotSyncResponse is null");
            return;
        }
        try {
            com.tencent.wechat.aff.newlife.FinderCommonReddotSyncResponse newBuilder = com.tencent.wechat.aff.newlife.FinderCommonReddotSyncResponse.newBuilder();
            newBuilder.mergeFrom(bArr);
            java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderCmdItem> cmdList = newBuilder.build().getCmdList();
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = cmdList != null ? java.lang.Integer.valueOf(cmdList.size()) : null;
            com.tencent.mars.xlog.Log.i("MMEcRedDotHandler", "handleSyncResponse cmdListSize: %s", objArr);
            if (cmdList != null) {
                for (com.tencent.wechat.aff.newlife.FinderCmdItem finderCmdItem : cmdList) {
                    kotlin.jvm.internal.o.d(finderCmdItem);
                    l(finderCmdItem, i18);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MMEcRedDotHandler", e17, "handleSyncResponse exception", new java.lang.Object[0]);
        }
    }

    @Override // f70.f
    public java.lang.String i(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        return null;
    }

    @Override // f70.f
    public byte[] k(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        r45.f03 I0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().I0(path);
        if (I0 != null) {
            return I0.toByteArray();
        }
        return null;
    }

    public abstract void l(com.tencent.wechat.aff.newlife.FinderCmdItem finderCmdItem, int i17);
}

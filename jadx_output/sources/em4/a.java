package em4;

/* loaded from: classes8.dex */
public final class a implements f70.f {
    @Override // f70.f
    public void a(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        em4.b.a(path);
    }

    @Override // f70.f
    public byte[] b(int i17) {
        byte[] bytes = ((b81.a) ((y71.e) i95.n0.c(y71.e.class))).wi().getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        return bytes;
    }

    @Override // f70.f
    public byte[] c(java.lang.String path) {
        r45.vs2 vs2Var;
        kotlin.jvm.internal.o.g(path, "path");
        boolean z17 = em4.b.f255212a;
        try {
            com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0(path);
            if (L0 != null && (vs2Var = L0.field_ctrInfo) != null) {
                return vs2Var.toByteArray();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TingRedDotManager", e17, "getReddotCtrlInfo exception", new java.lang.Object[0]);
        }
        return null;
    }

    @Override // f70.f
    public byte[] d(int i17) {
        return gz2.c.f277728a.g(0).toByteArray();
    }

    @Override // f70.f
    public boolean e(int i17) {
        return i17 == 10;
    }

    @Override // f70.f
    public boolean f(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        return kotlin.jvm.internal.o.b(path, "Listen.Entrance") || kotlin.jvm.internal.o.b(path, "Listen.MentionEntrance") || kotlin.jvm.internal.o.b(path, "Listen.Music.Bubble") || kotlin.jvm.internal.o.b(path, "Listen.NonMusic.Bubble") || kotlin.jvm.internal.o.b(path, "Listen.CircleX.Bubble") || kotlin.jvm.internal.o.b(path, "Listen.SlideOver");
    }

    @Override // f70.f
    public void g(int i17, int i18, byte[] bArr) {
        ((hm4.c) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).f397137h.getValue()).getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleSyncResponse businessType: ");
        sb6.append(i17);
        sb6.append(", scene: ");
        sb6.append(i18);
        sb6.append(", finderCommonReddotSyncResponse: ");
        sb6.append(bArr != null ? java.lang.Integer.valueOf(bArr.length) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.TingSyncExtension", sb6.toString());
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = hm4.c.f282294b;
        if (bArr == null || bArr.length == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TingSyncExtension", "handleSyncResponse finderCommonReddotSyncResponse is null");
            java.util.Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                ((hm4.b) ((hm4.a) it.next())).getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.TingRedDotSyncHandler", "handleSyncResponseError scene: " + i18);
                if (i18 == 8) {
                    ((ef0.d4) ((qk.h9) i95.n0.c(qk.h9.class))).Ai(null);
                }
            }
            return;
        }
        try {
            com.tencent.wechat.aff.newlife.FinderCommonReddotSyncResponse newBuilder = com.tencent.wechat.aff.newlife.FinderCommonReddotSyncResponse.newBuilder();
            newBuilder.mergeFrom(bArr);
            java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderCmdItem> cmdList = newBuilder.build().getCmdList();
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = cmdList != null ? java.lang.Integer.valueOf(cmdList.size()) : null;
            com.tencent.mars.xlog.Log.i("MicroMsg.TingSyncExtension", "handleSyncResponse cmdListSize: %s", objArr);
            if (cmdList != null) {
                for (com.tencent.wechat.aff.newlife.FinderCmdItem finderCmdItem : cmdList) {
                    java.util.Iterator it6 = copyOnWriteArraySet.iterator();
                    while (it6.hasNext()) {
                        hm4.a aVar = (hm4.a) it6.next();
                        kotlin.jvm.internal.o.d(finderCmdItem);
                        ((hm4.b) aVar).b(finderCmdItem, i18);
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TingSyncExtension", e17, "handleSyncResponse exception", new java.lang.Object[0]);
        }
    }

    @Override // f70.f
    public byte[] h(int i17) {
        i95.m c17 = i95.n0.c(zy2.ca.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.t source = zy2.t.Ting;
        kotlin.jvm.internal.o.g(source, "source");
        int b17 = com.tencent.mm.plugin.finder.assist.h4.f102221a.b(source, null);
        com.tencent.wechat.aff.newlife.FinderSyncClientInfo newBuilder = com.tencent.wechat.aff.newlife.FinderSyncClientInfo.newBuilder();
        newBuilder.setFinderEntranceTitleLengthLimit(b17 * 2);
        newBuilder.setFinderEntranceSingleTitleLengthLimit(b17);
        return newBuilder.build().toByteArray();
    }

    @Override // f70.f
    public java.lang.String i(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        return ((ef0.z3) ((qk.d9) i95.n0.c(qk.d9.class))).Ai(path);
    }

    @Override // f70.f
    public boolean j(int i17, bw5.e4 e4Var) {
        ((ef0.z3) ((qk.d9) i95.n0.c(qk.d9.class))).getClass();
        return hm4.c.f282293a.b();
    }

    @Override // f70.f
    public byte[] k(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        boolean z17 = em4.b.f255212a;
        try {
            r45.f03 I0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().I0(path);
            if (I0 != null) {
                return I0.toByteArray();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TingRedDotManager", e17, "getFinderTipsShowInfoAtPath exception", new java.lang.Object[0]);
        }
        return null;
    }
}

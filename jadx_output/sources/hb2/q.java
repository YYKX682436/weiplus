package hb2;

/* loaded from: classes2.dex */
public final class q extends hb2.w0 {

    /* renamed from: e, reason: collision with root package name */
    public static final hb2.q f280082e = new hb2.q();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f280083f = "Finder.FinderModPersonalizedSetting";

    @Override // hb2.w0
    public com.tencent.mm.protobuf.g c(java.lang.Object obj) {
        r45.ti2 cmdBufItem = (r45.ti2) obj;
        kotlin.jvm.internal.o.g(cmdBufItem, "cmdBufItem");
        return com.tencent.mm.protobuf.g.b(cmdBufItem.toByteArray());
    }

    @Override // hb2.w0
    public int i() {
        return 18;
    }

    @Override // hb2.w0
    public java.lang.String k() {
        return f280083f;
    }

    @Override // hb2.w0
    public void l(java.lang.String username, java.lang.Object obj, r45.ix0 cmdRef) {
        r45.e33 e33Var;
        r45.e33 e33Var2;
        r45.ti2 cmdBufItem = (r45.ti2) obj;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(cmdBufItem, "cmdBufItem");
        kotlin.jvm.internal.o.g(cmdRef, "cmdRef");
        int integer = cmdRef.getInteger(1);
        com.tencent.mars.xlog.Log.i(f280083f, "opType=" + cmdBufItem.getInteger(0) + " scene=" + cmdBufItem.getInteger(1) + " retCode:" + integer);
        if (integer != -1) {
            if (cmdBufItem.getInteger(1) != 3 && cmdBufItem.getInteger(1) != 4) {
                if (cmdBufItem.getInteger(1) == 1) {
                    if (cmdBufItem.getInteger(0) == 1) {
                        pm0.v.X(hb2.n.f280072d);
                    }
                    new com.tencent.mm.autogen.events.FinderPersonalizedUpdateEvent().e();
                    return;
                }
                return;
            }
            if (cmdBufItem.getInteger(0) == 0) {
                g92.b bVar = g92.b.f269769e;
                m92.f fVar = new m92.f();
                if (cmdBufItem.getInteger(1) == 3) {
                    r45.e33 e33Var3 = (r45.e33) fVar.d().getCustom(17);
                    if (e33Var3 != null) {
                        e33Var3.set(2, java.lang.Boolean.FALSE);
                    }
                } else if (cmdBufItem.getInteger(1) == 4 && (e33Var2 = (r45.e33) fVar.d().getCustom(17)) != null) {
                    e33Var2.set(3, java.lang.Boolean.FALSE);
                }
                bVar.S1(fVar, m92.j.A);
                return;
            }
            g92.b bVar2 = g92.b.f269769e;
            m92.f fVar2 = new m92.f();
            if (cmdBufItem.getInteger(1) == 3) {
                r45.e33 e33Var4 = (r45.e33) fVar2.d().getCustom(17);
                if (e33Var4 != null) {
                    e33Var4.set(2, java.lang.Boolean.TRUE);
                }
            } else if (cmdBufItem.getInteger(1) == 4 && (e33Var = (r45.e33) fVar2.d().getCustom(17)) != null) {
                e33Var.set(3, java.lang.Boolean.TRUE);
            }
            bVar2.S1(fVar2, m92.j.A);
        }
    }

    public final void n(android.content.Context context, com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataList, yz5.a onRemove) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(dataList, "dataList");
        kotlin.jvm.internal.o.g(onRemove, "onRemove");
        boolean a17 = hc2.e.a();
        java.lang.String str = f280083f;
        if (a17) {
            if (pm0.v.b0(dataList, hb2.o.f280076d)) {
                onRemove.invoke();
                int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                e4Var.f211776c = context.getString(com.tencent.mm.R.string.eso);
                e4Var.b(com.tencent.mm.R.raw.toast_ok);
                e4Var.c();
            }
            com.tencent.mars.xlog.Log.e(str, "openPersonalizedSetting: personalized recommend video is opened");
            return;
        }
        com.tencent.mars.xlog.Log.e(str, "openPersonalizedSetting");
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        zy2.j9.a(ya2.r.f460525a, true, 1, null, 4, null);
        g92.b bVar = g92.b.f269769e;
        m92.f fVar = new m92.f();
        if (((r45.e33) fVar.d().getCustom(17)) == null) {
            fVar.d().set(17, new r45.e33());
        }
        r45.e33 e33Var = (r45.e33) fVar.d().getCustom(17);
        if (e33Var != null) {
            e33Var.set(0, java.lang.Boolean.TRUE);
        }
        bVar.S1(fVar, m92.j.f325005w);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[LOOP:0: B:8:0x0029->B:49:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o(android.content.Context r18, com.tencent.mm.view.RefreshLoadMoreLayout r19, com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r20, java.lang.Integer r21, int r22) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hb2.q.o(android.content.Context, com.tencent.mm.view.RefreshLoadMoreLayout, com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer, java.lang.Integer, int):boolean");
    }
}

package df2;

/* loaded from: classes3.dex */
public final class co extends df2.de {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f229903p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f229903p = "Micro.LiveMsgRevokeController";
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (kotlin.jvm.internal.o.b(r5.v(), r3) == false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m7(dk2.zf r5, jz5.o r6) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof dk2.fg
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r5
            dk2.fg r0 = (dk2.fg) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 == 0) goto L10
            jz5.l r1 = r0.q()
        L10:
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L16
            r1 = r0
            goto L17
        L16:
            r1 = r2
        L17:
            if (r1 == 0) goto L6e
            java.lang.Object r1 = r6.f302841d
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L28
            int r1 = r1.length()
            if (r1 != 0) goto L26
            goto L28
        L26:
            r1 = r2
            goto L29
        L28:
            r1 = r0
        L29:
            if (r1 != 0) goto L41
            java.lang.String r1 = r5.f()
            java.lang.Object r3 = r6.f302841d
            boolean r1 = kotlin.jvm.internal.o.b(r1, r3)
            if (r1 != 0) goto L68
            java.lang.String r1 = r5.v()
            boolean r1 = kotlin.jvm.internal.o.b(r1, r3)
            if (r1 != 0) goto L68
        L41:
            java.lang.Object r6 = r6.f302842e
            r1 = r6
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L51
            int r1 = r1.length()
            if (r1 != 0) goto L4f
            goto L51
        L4f:
            r1 = r2
            goto L52
        L51:
            r1 = r0
        L52:
            if (r1 != 0) goto L6a
            java.lang.String r1 = r5.f()
            boolean r1 = kotlin.jvm.internal.o.b(r1, r6)
            if (r1 != 0) goto L68
            java.lang.String r5 = r5.v()
            boolean r5 = kotlin.jvm.internal.o.b(r5, r6)
            if (r5 == 0) goto L6a
        L68:
            r5 = r0
            goto L6b
        L6a:
            r5 = r2
        L6b:
            if (r5 == 0) goto L6e
            goto L6f
        L6e:
            r0 = r2
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.co.m7(dk2.zf, jz5.o):boolean");
    }

    public final void n7(java.util.List localClientMsgIdList) {
        boolean z17;
        java.lang.Object obj;
        dk2.zf t17;
        kotlin.jvm.internal.o.g(localClientMsgIdList, "localClientMsgIdList");
        java.util.Iterator it = localClientMsgIdList.iterator();
        boolean z18 = false;
        while (it.hasNext()) {
            jz5.o oVar = (jz5.o) it.next();
            java.util.List list = ((mm2.x4) business(mm2.x4.class)).f329528f;
            kotlin.jvm.internal.o.f(list, "<get-msgList>(...)");
            synchronized (list) {
                java.util.Iterator it6 = list.iterator();
                while (true) {
                    z17 = true;
                    if (!it6.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it6.next();
                    dk2.zf zfVar = (dk2.zf) obj;
                    kotlin.jvm.internal.o.d(zfVar);
                    boolean m76 = m7(zfVar, oVar);
                    dk2.ia iaVar = zfVar instanceof dk2.ia ? (dk2.ia) zfVar : null;
                    if (iaVar != null && (t17 = iaVar.t()) != null) {
                        m76 = m76 || m7(t17, oVar);
                    }
                    if (m76) {
                        break;
                    }
                }
            }
            dk2.zf zfVar2 = (dk2.zf) obj;
            if (zfVar2 != null) {
                if ((zfVar2.getType() == 20124 ? zfVar2 : null) != null) {
                    dk2.v5 v5Var = zfVar2 instanceof dk2.v5 ? (dk2.v5) zfVar2 : null;
                    if (v5Var != null) {
                        v5Var.f234239f = (java.lang.String) oVar.f302843f;
                        z18 = true;
                    }
                }
            }
            if (zfVar2 != null) {
                if ((zfVar2.getType() == 20002 ? zfVar2 : null) != null) {
                    dk2.a8 a8Var = zfVar2 instanceof dk2.a8 ? (dk2.a8) zfVar2 : null;
                    if (a8Var != null) {
                        a8Var.f233192g = (java.lang.String) oVar.f302843f;
                        z18 = true;
                    }
                }
            }
            if (zfVar2 != null) {
                if ((zfVar2.getType() == 20128 ? zfVar2 : null) != null) {
                    dk2.ia iaVar2 = zfVar2 instanceof dk2.ia ? (dk2.ia) zfVar2 : null;
                    java.lang.Object t18 = iaVar2 != null ? iaVar2.t() : null;
                    dk2.fg fgVar = t18 instanceof dk2.fg ? (dk2.fg) t18 : null;
                    if (fgVar != null) {
                        fgVar.E((java.lang.String) oVar.f302843f);
                    } else {
                        z17 = z18;
                    }
                    z18 = z17;
                }
            }
        }
        if (z18) {
            pm0.v.X(new df2.bo(this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0080 A[SYNTHETIC] */
    @Override // df2.de, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLiveMsg(r45.r71 r9) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.co.onLiveMsg(r45.r71):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0035 A[SYNTHETIC] */
    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLiveStart(r45.hc1 r9) {
        /*
            r8 = this;
            super.onLiveStart(r9)
            if (r9 == 0) goto Lb1
            r0 = 85
            com.tencent.mm.protobuf.f r9 = r9.getCustom(r0)
            r45.ic1 r9 = (r45.ic1) r9
            if (r9 == 0) goto Lb1
            r0 = 17
            com.tencent.mm.protobuf.f r9 = r9.getCustom(r0)
            r45.nc1 r9 = (r45.nc1) r9
            if (r9 == 0) goto Lb1
            r0 = 0
            java.util.LinkedList r9 = r9.getList(r0)
            if (r9 == 0) goto Lb1
            boolean r1 = r9.isEmpty()
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L29
            goto L2a
        L29:
            r9 = 0
        L2a:
            if (r9 == 0) goto Lb1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r9 = r9.iterator()
        L35:
            boolean r3 = r9.hasNext()
            r4 = 2
            if (r3 == 0) goto L71
            java.lang.Object r3 = r9.next()
            r5 = r3
            r45.vq4 r5 = (r45.vq4) r5
            java.lang.String r6 = r5.getString(r0)
            if (r6 == 0) goto L52
            int r6 = r6.length()
            if (r6 != 0) goto L50
            goto L52
        L50:
            r6 = r0
            goto L53
        L52:
            r6 = r2
        L53:
            if (r6 == 0) goto L6a
            java.lang.String r4 = r5.getString(r4)
            if (r4 == 0) goto L64
            int r4 = r4.length()
            if (r4 != 0) goto L62
            goto L64
        L62:
            r4 = r0
            goto L65
        L64:
            r4 = r2
        L65:
            if (r4 != 0) goto L68
            goto L6a
        L68:
            r4 = r0
            goto L6b
        L6a:
            r4 = r2
        L6b:
            if (r4 == 0) goto L35
            r1.add(r3)
            goto L35
        L71:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r1 = r1.iterator()
        L7a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L9b
            java.lang.Object r3 = r1.next()
            r45.vq4 r3 = (r45.vq4) r3
            jz5.o r5 = new jz5.o
            java.lang.String r6 = r3.getString(r0)
            java.lang.String r7 = r3.getString(r4)
            java.lang.String r3 = r3.getString(r2)
            r5.<init>(r6, r7, r3)
            r9.add(r5)
            goto L7a
        L9b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[onLiveStart] list = "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r8.f229903p
            com.tencent.mars.xlog.Log.i(r1, r0)
            r8.n7(r9)
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.co.onLiveStart(r45.hc1):void");
    }
}

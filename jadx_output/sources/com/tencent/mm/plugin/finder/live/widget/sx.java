package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class sx {
    public sx(kotlin.jvm.internal.i iVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[LOOP:0: B:14:0x0030->B:30:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a() {
        /*
            r5 = this;
            dk2.ef r0 = dk2.ef.f233372a
            co0.s r0 = r0.u0()
            r1 = 0
            if (r0 == 0) goto L57
            hn0.r r0 = r0.R1
            if (r0 == 0) goto L57
            kn0.g r0 = r0.f282410b
            if (r0 == 0) goto L57
            java.util.HashMap r0 = r0.f309544k
            java.util.Collection r0 = r0.values()
            java.lang.String r2 = "<get-values>(...)"
            kotlin.jvm.internal.o.f(r0, r2)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r2 = r0 instanceof java.util.Collection
            if (r2 == 0) goto L2c
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L2c
            goto L57
        L2c:
            java.util.Iterator r0 = r0.iterator()
        L30:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L57
            java.lang.Object r2 = r0.next()
            kn0.r r2 = (kn0.r) r2
            int r3 = r2.f309597b
            r4 = 1
            if (r3 == 0) goto L53
            java.lang.String r2 = r2.f309598c
            if (r2 == 0) goto L4e
            int r2 = r2.length()
            if (r2 != 0) goto L4c
            goto L4e
        L4c:
            r2 = r1
            goto L4f
        L4e:
            r2 = r4
        L4f:
            if (r2 != 0) goto L53
            r2 = r4
            goto L54
        L53:
            r2 = r1
        L54:
            if (r2 == 0) goto L30
            r1 = r4
        L57:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.sx.a():boolean");
    }

    public final boolean b(android.content.Context context, gk2.e buContext) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        java.util.List list = ((mm2.o4) buContext.a(mm2.o4.class)).f329327v;
        kotlin.jvm.internal.o.f(list, "<get-audienceLinkMicUserList>(...)");
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (com.tencent.mm.sdk.platformtools.t8.D0(((km2.q) obj).f309170a, ((mm2.c1) buContext.a(mm2.c1.class)).m8())) {
                    break;
                }
            }
        }
        boolean z17 = obj != null;
        boolean E7 = ((mm2.o4) buContext.a(mm2.o4.class)).E7();
        com.tencent.mars.xlog.Log.i("FinderLiveVideoDefinitionWidget", "showCustomerVideoLevel linking:" + z17 + ",linkWait:" + E7);
        if (z17 || E7) {
            db5.t7.b(context, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.egv));
            return false;
        }
        boolean z18 = ((mm2.c1) buContext.a(mm2.c1.class)).V4 != 0;
        boolean isConnected = com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a);
        if (!z18 && isConnected) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveVideoDefinitionWidget", "anchor pause live:" + z18 + ",networkEnable:" + isConnected + '!');
        db5.t7.b(context, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.egu));
        return false;
    }

    public final kn0.r c(boolean z17) {
        kn0.g gVar;
        java.util.HashMap hashMap;
        java.util.Collection<kn0.r> values;
        kn0.g gVar2;
        r45.ka4 ka4Var;
        java.util.LinkedList linkedList;
        java.lang.Object obj;
        co0.s u07 = dk2.ef.f233372a.u0();
        java.lang.String str = null;
        hn0.r rVar = u07 != null ? u07.R1 : null;
        kn0.r c17 = rVar != null ? rVar.c() : null;
        if (z17) {
            if (rVar != null && (gVar2 = rVar.f282410b) != null && (ka4Var = gVar2.f309548o) != null && (linkedList = ka4Var.f378540m) != null) {
                java.util.Iterator it = linkedList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((r45.gv) obj).f375544o == 1) {
                        break;
                    }
                }
                r45.gv gvVar = (r45.gv) obj;
                if (gvVar != null) {
                    str = gvVar.f375537e;
                }
            }
            if (str == null) {
                str = "";
            }
            int i17 = c17 != null ? c17.f309597b : 0;
            if (rVar != null && (gVar = rVar.f282410b) != null && (hashMap = gVar.f309544k) != null && (values = hashMap.values()) != null) {
                for (kn0.r rVar2 : values) {
                    if (rVar2.f309597b > i17) {
                        java.lang.String str2 = rVar2.f309598c;
                        if (!(str2 == null || str2.length() == 0) && !kotlin.jvm.internal.o.b(rVar2.f309596a, str)) {
                            c17 = rVar2;
                        }
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("FinderLiveVideoDefinitionWidget", "heightest level:" + c17);
        }
        return c17;
    }
}

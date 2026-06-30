package df2;

/* loaded from: classes3.dex */
public final class o5 {
    public o5(kotlin.jvm.internal.i iVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(gk2.e r7) {
        /*
            r6 = this;
            ae2.in r0 = ae2.in.f3688a
            lb2.j r0 = r0.G()
            java.lang.Object r0 = r0.r()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.String r1 = "Finder.GestureEffectAnchorSettingController"
            r2 = 0
            if (r0 != 0) goto L1b
            java.lang.String r7 = "canShowGestureEffect FINDER_LIVE_GESTURE_EFFECT_CONFIG false"
            com.tencent.mars.xlog.Log.i(r1, r7)
            return r2
        L1b:
            r0 = 1
            if (r7 == 0) goto L2c
            java.lang.Class<mm2.c1> r3 = mm2.c1.class
            androidx.lifecycle.c1 r7 = r7.a(r3)
            mm2.c1 r7 = (mm2.c1) r7
            boolean r7 = r7.f328778a5
            if (r7 != r0) goto L2c
            r7 = r0
            goto L2d
        L2c:
            r7 = r2
        L2d:
            r3 = 0
            if (r7 == 0) goto L40
            gm0.b0 r7 = gm0.j1.u()
            com.tencent.mm.storage.n3 r7 = r7.c()
            com.tencent.mm.storage.u3 r5 = com.tencent.mm.storage.u3.USERINFO_FINDER_GAME_LIVE_FUNC_SWITCH_FLAG_LONG_SYNC
            long r3 = r7.t(r5, r3)
            goto L4e
        L40:
            gm0.b0 r7 = gm0.j1.u()
            com.tencent.mm.storage.n3 r7 = r7.c()
            com.tencent.mm.storage.u3 r5 = com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_FUNC_SWITCH_FLAG_LONG_SYNC
            long r3 = r7.t(r5, r3)
        L4e:
            int r7 = (int) r3
            r3 = 4
            boolean r7 = pm0.v.z(r7, r3)
            java.lang.Class<rh0.f0> r3 = rh0.f0.class
            i95.m r3 = i95.n0.c(r3)
            rh0.f0 r3 = (rh0.f0) r3
            qh0.r r3 = (qh0.r) r3
            r3.getClass()
            p05.a3 r3 = p05.a3.f350439a
            java.lang.String r4 = "MODEL_HAND"
            java.lang.String r3 = r3.g(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "canShowGestureEffect modelHandPath="
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            com.tencent.mars.xlog.Log.i(r1, r4)
            if (r7 == 0) goto Lb7
            sg2.x r7 = sg2.x.f407955a
            java.util.Map r7 = sg2.x.f407959e
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto L88
        L86:
            r7 = r2
            goto La6
        L88:
            java.util.LinkedHashMap r7 = (java.util.LinkedHashMap) r7
            java.util.Collection r7 = r7.values()
            java.util.Iterator r7 = r7.iterator()
        L92:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto La5
            java.lang.Object r1 = r7.next()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L92
            goto L86
        La5:
            r7 = r0
        La6:
            if (r7 == 0) goto Lb7
            if (r3 == 0) goto Lb3
            int r7 = r3.length()
            if (r7 != 0) goto Lb1
            goto Lb3
        Lb1:
            r7 = r2
            goto Lb4
        Lb3:
            r7 = r0
        Lb4:
            if (r7 != 0) goto Lb7
            r2 = r0
        Lb7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.o5.a(gk2.e):boolean");
    }

    public final boolean b(gk2.e eVar) {
        boolean a17 = a(eVar);
        boolean o17 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_ANCHOR_HAS_SHOW_GESTURE_EFFECT_BOOLEAN_SYNC, false);
        com.tencent.mars.xlog.Log.i("Finder.GestureEffectAnchorSettingController", "canShowRedDot: " + a17 + ", " + o17);
        return a17 && !o17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ea, code lost:
    
        if (r5.contains(java.lang.Integer.valueOf(r14 != null ? r14.getInteger(0) : -1)) != false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(gk2.e r14) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.o5.c(gk2.e):boolean");
    }
}

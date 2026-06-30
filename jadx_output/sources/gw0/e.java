package gw0;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final du0.t0 f276144a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.j0 f276145b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.g0 f276146c;

    public e(du0.t0 materialService) {
        kotlin.jvm.internal.o.g(materialService, "materialService");
        this.f276144a = materialService;
        androidx.lifecycle.j0 j0Var = new androidx.lifecycle.j0(new zu0.h(new dw0.d(null, null, null, 7, null)));
        this.f276145b = j0Var;
        this.f276146c = androidx.lifecycle.b1.a(j0Var, new gw0.d());
    }

    public final zu0.h a(fv0.d dVar) {
        zu0.h hVar;
        int ordinal = dVar.ordinal();
        androidx.lifecycle.j0 j0Var = this.f276145b;
        if (ordinal != 9) {
            return (ordinal == 12 && (hVar = (zu0.h) j0Var.getValue()) != null) ? hVar : new zu0.h(new dw0.d(null, null, null, 7, null));
        }
        zu0.h hVar2 = (zu0.h) j0Var.getValue();
        return hVar2 == null ? new zu0.h(new dw0.d(null, null, null, 7, null)) : hVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof gw0.a
            if (r0 == 0) goto L13
            r0 = r6
            gw0.a r0 = (gw0.a) r0
            int r1 = r0.f276131f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f276131f = r1
            goto L18
        L13:
            gw0.a r0 = new gw0.a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f276129d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f276131f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.throwOnFailure(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.throwOnFailure(r6)
            r0.f276131f = r3
            du0.t0 r6 = r4.f276144a
            java.lang.Object r6 = r6.R6(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            com.tencent.maas.material.MJMaterialPack r6 = (com.tencent.maas.material.MJMaterialPack) r6
            if (r6 == 0) goto L53
            java.util.List r5 = r6.a()
            r6 = 0
            java.lang.Object r5 = kz5.n0.a0(r5, r6)
            com.tencent.maas.material.MJMaterialCategory r5 = (com.tencent.maas.material.MJMaterialCategory) r5
            if (r5 == 0) goto L53
            java.util.List r5 = r5.a()
            goto L54
        L53:
            r5 = 0
        L54:
            if (r5 != 0) goto L58
            kz5.p0 r5 = kz5.p0.f313996d
        L58:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: gw0.e.b(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r5, com.tencent.maas.moviecomposing.segments.Segment r6, fv0.d r7, kotlin.coroutines.Continuation r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof gw0.b
            if (r0 == 0) goto L13
            r0 = r8
            gw0.b r0 = (gw0.b) r0
            int r1 = r0.f276136h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f276136h = r1
            goto L18
        L13:
            gw0.b r0 = new gw0.b
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f276134f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f276136h
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r5 = r0.f276133e
            r7 = r5
            fv0.d r7 = (fv0.d) r7
            java.lang.Object r5 = r0.f276132d
            gw0.e r5 = (gw0.e) r5
            kotlin.ResultKt.throwOnFailure(r8)
            goto L49
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            kotlin.ResultKt.throwOnFailure(r8)
            r0.f276132d = r4
            r0.f276133e = r7
            r0.f276136h = r3
            java.lang.Object r8 = r4.d(r7, r5, r6, r0)
            if (r8 != r1) goto L48
            return r1
        L48:
            r5 = r4
        L49:
            java.util.List r8 = (java.util.List) r8
            java.util.List r6 = kz5.n0.V0(r8)
            r8 = r6
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.util.Iterator r8 = r8.iterator()
            r0 = 0
        L57:
            boolean r1 = r8.hasNext()
            r2 = -1
            if (r1 == 0) goto L6c
            java.lang.Object r1 = r8.next()
            dw0.c r1 = (dw0.c) r1
            boolean r1 = r1.f244089d
            if (r1 == 0) goto L69
            goto L6d
        L69:
            int r0 = r0 + 1
            goto L57
        L6c:
            r0 = r2
        L6d:
            boolean r8 = r6.isEmpty()
            r8 = r8 ^ r3
            if (r8 == 0) goto L99
            dw0.e r8 = new dw0.e
            r8.<init>(r2, r0)
            r5.getClass()
            zu0.k r0 = new zu0.k
            int r1 = r7.f266968d
            zu0.h r7 = r5.a(r7)
            java.lang.Object r7 = r7.f475673a
            dw0.d r7 = (dw0.d) r7
            dw0.h r2 = dw0.h.f244096a
            dw0.d r6 = r7.a(r6, r8, r2)
            zu0.h r7 = new zu0.h
            r7.<init>(r6)
            r0.<init>(r1, r7)
            r5.e(r0)
        L99:
            jz5.f0 r5 = jz5.f0.f302826a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: gw0.e.c(java.lang.String, com.tencent.maas.moviecomposing.segments.Segment, fv0.d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(fv0.d r9, java.lang.String r10, com.tencent.maas.moviecomposing.segments.Segment r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gw0.e.d(fv0.d, java.lang.String, com.tencent.maas.moviecomposing.segments.Segment, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void e(zu0.k kVar) {
        int i17 = kVar.f475681a;
        int i18 = fv0.d.f266963o.f266968d;
        androidx.lifecycle.j0 j0Var = this.f276145b;
        zu0.h hVar = kVar.f475682b;
        if (i17 == i18) {
            j0Var.setValue(hVar);
            return;
        }
        if (i17 == fv0.d.f266965q.f266968d) {
            j0Var.setValue(hVar);
            return;
        }
        com.tencent.mars.xlog.Log.e("TimbreMaterialViewModel", "notify: Incorrect sceneValue " + kVar.f475681a + ' ');
        kz5.p0 infoList = (7 & 1) != 0 ? kz5.p0.f313996d : null;
        dw0.e selectedIndexPack = (7 & 2) != 0 ? new dw0.e(-1, -1) : null;
        dw0.g updateState = (7 & 4) != 0 ? dw0.g.f244095a : null;
        kotlin.jvm.internal.o.g(infoList, "infoList");
        kotlin.jvm.internal.o.g(selectedIndexPack, "selectedIndexPack");
        kotlin.jvm.internal.o.g(updateState, "updateState");
    }

    public final void f(dw0.c timbreInfo) {
        kotlin.jvm.internal.o.g(timbreInfo, "timbreInfo");
        com.tencent.maas.material.MJMaterialInfo mJMaterialInfo = timbreInfo.f244086a;
        com.tencent.maas.material.g gVar = mJMaterialInfo.f48223a;
        kotlin.jvm.internal.o.f(gVar, "getMaterialScene(...)");
        fv0.d c17 = fv0.e.c(gVar);
        dw0.d dVar = (dw0.d) a(c17).f475673a;
        java.util.List V0 = kz5.n0.V0(dVar.f244090a);
        java.util.ArrayList arrayList = (java.util.ArrayList) V0;
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else if (kotlin.jvm.internal.o.b(((dw0.c) it.next()).f244086a.f48224b, mJMaterialInfo.f48224b)) {
                break;
            } else {
                i17++;
            }
        }
        int i18 = dVar.f244091b.f244094b;
        if (i18 >= 0) {
            arrayList.set(i18, dw0.c.a((dw0.c) arrayList.get(i18), null, null, null, false, 7, null));
        }
        if (i17 >= 0) {
            arrayList.set(i17, dw0.c.a((dw0.c) arrayList.get(i17), null, null, null, true, 7, null));
        }
        zu0.h hVar = new zu0.h(dVar.a(V0, new dw0.e(i18, i17), dw0.k.f244101a));
        int i19 = c17.f266968d;
        e(new zu0.k(i19, hVar));
        e(new zu0.k(i19, new zu0.h(fv0.e.a((dw0.d) a(c17).f475673a, timbreInfo, zu0.i.f475675e))));
    }
}

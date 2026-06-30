package xw0;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a */
    public final du0.t0 f457637a;

    /* renamed from: b */
    public final java.util.Map f457638b;

    /* renamed from: c */
    public final kotlinx.coroutines.y0 f457639c;

    /* renamed from: d */
    public final androidx.lifecycle.j0 f457640d;

    /* renamed from: e */
    public boolean f457641e;

    /* renamed from: f */
    public boolean f457642f;

    /* renamed from: g */
    public final com.tencent.maas.material.MJMaterialInfo f457643g;

    /* renamed from: h */
    public final com.tencent.maas.material.MJMaterialInfo f457644h;

    /* renamed from: i */
    public final com.tencent.maas.material.MJMaterialInfo f457645i;

    /* renamed from: j */
    public final com.tencent.maas.material.MJMaterialInfo f457646j;

    /* renamed from: k */
    public final com.tencent.maas.material.MJMaterialInfo f457647k;

    /* renamed from: l */
    public final androidx.lifecycle.g0 f457648l;

    /* renamed from: m */
    public final androidx.lifecycle.j0 f457649m;

    /* renamed from: n */
    public final androidx.lifecycle.g0 f457650n;

    /* renamed from: o */
    public final androidx.lifecycle.j0 f457651o;

    /* renamed from: p */
    public final androidx.lifecycle.g0 f457652p;

    /* renamed from: q */
    public final androidx.lifecycle.j0 f457653q;

    /* renamed from: r */
    public final androidx.lifecycle.g0 f457654r;

    /* renamed from: s */
    public final androidx.lifecycle.j0 f457655s;

    /* renamed from: t */
    public final androidx.lifecycle.g0 f457656t;

    public r(du0.t0 materialService) {
        kotlin.jvm.internal.o.g(materialService, "materialService");
        this.f457637a = materialService;
        this.f457638b = kz5.c1.k(new jz5.l(ug.m.Narration, "color_white_1"), new jz5.l(ug.m.Caption, "color_white_1"), new jz5.l(ug.m.ContentDesc, "color_white_1"));
        oz5.i a17 = kotlinx.coroutines.t3.a(null, 1, null);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        this.f457639c = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) a17).plus(kotlinx.coroutines.internal.b0.f310484a));
        androidx.lifecycle.j0 j0Var = new androidx.lifecycle.j0(new zu0.h(new sw0.e(null, null, null, 7, null)));
        this.f457640d = j0Var;
        this.f457643g = materialService.f243440d;
        this.f457644h = materialService.f243441e;
        this.f457645i = materialService.f243442f;
        kz5.q0 q0Var = kz5.q0.f314001d;
        this.f457646j = new com.tencent.maas.material.MJMaterialInfo(13, "EMPTY_ANIM_PRESET_ID", 0L, "", "", "", q0Var);
        this.f457647k = new com.tencent.maas.material.MJMaterialInfo(13, "BUILTIN_ANIM_PRESET_ID", 0L, "", "", "", q0Var);
        this.f457648l = androidx.lifecycle.b1.a(j0Var, new xw0.l());
        androidx.lifecycle.j0 j0Var2 = new androidx.lifecycle.j0(new zu0.h(new sw0.e(null, null, null, 7, null)));
        this.f457649m = j0Var2;
        this.f457650n = androidx.lifecycle.b1.a(j0Var2, new xw0.m());
        androidx.lifecycle.j0 j0Var3 = new androidx.lifecycle.j0(new zu0.h(new sw0.e(null, null, null, 7, null)));
        this.f457651o = j0Var3;
        this.f457652p = androidx.lifecycle.b1.a(j0Var3, new xw0.n());
        androidx.lifecycle.j0 j0Var4 = new androidx.lifecycle.j0(new zu0.h(new sw0.e(null, null, null, 7, null)));
        this.f457653q = j0Var4;
        this.f457654r = androidx.lifecycle.b1.a(j0Var4, new xw0.o());
        androidx.lifecycle.j0 j0Var5 = new androidx.lifecycle.j0(new zu0.h(new sw0.e(null, null, null, 7, null)));
        this.f457655s = j0Var5;
        this.f457656t = androidx.lifecycle.b1.a(j0Var5, new xw0.p());
    }

    public static final zu0.k a(xw0.r rVar, fv0.d dVar, sw0.d dVar2) {
        rVar.getClass();
        int i17 = dVar.f266968d;
        sw0.e eVar = (sw0.e) rVar.e(dVar).f475673a;
        java.util.List V0 = kz5.n0.V0(eVar.f413426a);
        java.util.ArrayList arrayList = (java.util.ArrayList) V0;
        java.util.Iterator it = arrayList.iterator();
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                i18 = -1;
                break;
            }
            if (kotlin.jvm.internal.o.b(dVar2.f413422a.f48224b, ((sw0.d) it.next()).f413422a.f48224b)) {
                break;
            }
            i18++;
        }
        if (i18 >= 0) {
            sw0.d dVar3 = (sw0.d) arrayList.get(i18);
            zu0.i iVar = zu0.i.f475676f;
            arrayList.set(i18, sw0.d.a(dVar3, null, iVar, false, null, 13, null));
            eVar = eVar.f413427b.f413435b == i18 ? sw0.e.b(eVar, V0, null, new sw0.k(i18, iVar), 2, null) : sw0.e.b(eVar, V0, null, new sw0.j(i18, iVar), 2, null);
        }
        return new zu0.k(i17, new zu0.h(eVar));
    }

    public static final zu0.k b(xw0.r rVar, fv0.d dVar, sw0.d dVar2) {
        rVar.getClass();
        int i17 = dVar.f266968d;
        sw0.e eVar = (sw0.e) rVar.e(dVar).f475673a;
        java.util.List V0 = kz5.n0.V0(eVar.f413426a);
        java.util.ArrayList arrayList = (java.util.ArrayList) V0;
        java.util.Iterator it = arrayList.iterator();
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                i18 = -1;
                break;
            }
            if (kotlin.jvm.internal.o.b(dVar2.f413422a.f48224b, ((sw0.d) it.next()).f413422a.f48224b)) {
                break;
            }
            i18++;
        }
        if (i18 >= 0) {
            arrayList.set(i18, sw0.d.a((sw0.d) arrayList.get(i18), null, zu0.i.f475675e, false, null, 13, null));
        }
        return new zu0.k(i17, new zu0.h(sw0.e.b(eVar, V0, null, new sw0.j(i18, zu0.i.f475675e), 2, null)));
    }

    public static final zu0.k c(xw0.r rVar, fv0.d dVar, sw0.d dVar2) {
        rVar.getClass();
        int i17 = dVar.f266968d;
        sw0.e eVar = (sw0.e) rVar.e(dVar).f475673a;
        java.util.List V0 = kz5.n0.V0(eVar.f413426a);
        java.util.ArrayList arrayList = (java.util.ArrayList) V0;
        java.util.Iterator it = arrayList.iterator();
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                i18 = -1;
                break;
            }
            if (kotlin.jvm.internal.o.b(((sw0.d) it.next()).f413422a.f48224b, dVar2.f413422a.f48224b)) {
                break;
            }
            i18++;
        }
        int i19 = eVar.f413427b.f413435b;
        if (i19 >= 0) {
            arrayList.set(i19, sw0.d.a((sw0.d) arrayList.get(i19), null, null, false, null, 11, null));
        }
        if (i18 >= 0) {
            arrayList.set(i18, sw0.d.a((sw0.d) arrayList.get(i18), null, null, true, null, 11, null));
        }
        return new zu0.k(i17, new zu0.h(eVar.a(V0, new sw0.g(i19, i18), sw0.l.f413442a)));
    }

    public static /* synthetic */ void m(xw0.r rVar, sw0.d dVar, java.lang.String str, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            str = null;
        }
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        rVar.l(dVar, str, z17);
    }

    public static /* synthetic */ java.lang.Object o(xw0.r rVar, java.lang.String str, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = null;
        }
        return rVar.n(str, continuation);
    }

    public static /* synthetic */ java.lang.Object q(xw0.r rVar, fv0.d dVar, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj) {
        return rVar.p(dVar, str, (i17 & 4) != 0 ? null : str2, (i17 & 8) != 0 ? null : str3, continuation);
    }

    public final zu0.k d(fv0.d dVar, java.util.List list, sw0.g gVar) {
        return new zu0.k(dVar.f266968d, new zu0.h(((sw0.e) e(dVar).f475673a).a(list, gVar, sw0.i.f413437a)));
    }

    public final zu0.h e(fv0.d dVar) {
        switch (dVar.ordinal()) {
            case 4:
                zu0.h hVar = (zu0.h) this.f457640d.getValue();
                return hVar == null ? new zu0.h(new sw0.e(null, null, null, 7, null)) : hVar;
            case 5:
                zu0.h hVar2 = (zu0.h) this.f457649m.getValue();
                return hVar2 == null ? new zu0.h(new sw0.e(null, null, null, 7, null)) : hVar2;
            case 6:
                zu0.h hVar3 = (zu0.h) this.f457651o.getValue();
                return hVar3 == null ? new zu0.h(new sw0.e(null, null, null, 7, null)) : hVar3;
            case 7:
                zu0.h hVar4 = (zu0.h) this.f457653q.getValue();
                return hVar4 == null ? new zu0.h(new sw0.e(null, null, null, 7, null)) : hVar4;
            case 8:
                zu0.h hVar5 = (zu0.h) this.f457655s.getValue();
                return hVar5 == null ? new zu0.h(new sw0.e(null, null, null, 7, null)) : hVar5;
            default:
                return new zu0.h(new sw0.e(null, null, null, 7, null));
        }
    }

    public final java.lang.String f(ug.m segmentType) {
        kotlin.jvm.internal.o.g(segmentType, "segmentType");
        return (java.lang.String) this.f457638b.get(segmentType);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r21, java.lang.String r22, java.lang.String r23, kotlin.coroutines.Continuation r24) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xw0.r.g(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.Object h(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        du0.t0 t0Var = this.f457637a;
        return t0Var.Q6(str) ? java.lang.Boolean.TRUE : t0Var.S6(str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(int r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof xw0.b
            if (r0 == 0) goto L13
            r0 = r6
            xw0.b r0 = (xw0.b) r0
            int r1 = r0.f457583f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f457583f = r1
            goto L18
        L13:
            xw0.b r0 = new xw0.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f457581d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f457583f
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
            r0.f457583f = r3
            du0.t0 r6 = r4.f457637a
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
        throw new UnsupportedOperationException("Method not decompiled: xw0.r.i(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.String r21, java.lang.String r22, java.lang.String r23, kotlin.coroutines.Continuation r24) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xw0.r.j(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.String r13, kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xw0.r.k(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void l(sw0.d selectedData, java.lang.String str, boolean z17) {
        int h17;
        kotlin.jvm.internal.o.g(selectedData, "selectedData");
        com.tencent.maas.material.MJMaterialInfo mJMaterialInfo = selectedData.f413422a;
        java.lang.String str2 = mJMaterialInfo.f48224b;
        kotlin.jvm.internal.o.f(str2, "getMaterialID(...)");
        du0.t0 t0Var = this.f457637a;
        if (t0Var.Q6(str2)) {
            fv0.d dVar = fv0.d.f266961m;
            java.lang.String str3 = mJMaterialInfo.f48224b;
            kotlin.jvm.internal.o.f(str3, "getMaterialID(...)");
            java.util.List P6 = t0Var.P6(str3);
            if (str == null || str.length() == 0) {
                if (z17) {
                    h17 = kz5.c0.h(P6);
                }
                h17 = 0;
            } else {
                java.util.Iterator it = P6.iterator();
                int i17 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i17 = -1;
                        break;
                    } else if (kotlin.jvm.internal.o.b(str, ((com.tencent.maas.material.MJMaterialInfo) it.next()).f48224b)) {
                        break;
                    } else {
                        i17++;
                    }
                }
                java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
                if (!(valueOf.intValue() != -1)) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    h17 = valueOf.intValue();
                } else {
                    if (z17) {
                        h17 = kz5.c0.h(P6);
                    }
                    h17 = 0;
                }
            }
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(h17);
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(P6, 10));
            int i18 = 0;
            for (java.lang.Object obj : P6) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.tencent.maas.material.MJMaterialInfo mJMaterialInfo2 = (com.tencent.maas.material.MJMaterialInfo) obj;
                boolean z18 = h17 == i18;
                kotlin.jvm.internal.o.f(mJMaterialInfo2.f48224b, "getMaterialID(...)");
                arrayList.add(new sw0.d(mJMaterialInfo2, zu0.i.f475676f, z18, null));
                i18 = i19;
            }
            r(d(dVar, arrayList, new sw0.g(-1, valueOf2.intValue())));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.String r13, kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xw0.r.n(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(fv0.d r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xw0.r.p(fv0.d, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void r(zu0.k kVar) {
        fv0.d.f266956e.a(kVar.f475681a).toString();
        int i17 = fv0.d.f266958g.f266968d;
        zu0.h hVar = kVar.f475682b;
        int i18 = kVar.f475681a;
        if (i18 == i17) {
            this.f457640d.setValue(hVar);
            return;
        }
        if (i18 == fv0.d.f266959h.f266968d) {
            this.f457649m.setValue(hVar);
            return;
        }
        if (i18 == fv0.d.f266960i.f266968d) {
            this.f457651o.setValue(hVar);
            return;
        }
        if (i18 == fv0.d.f266961m.f266968d) {
            this.f457653q.setValue(hVar);
            return;
        }
        if (i18 == fv0.d.f266962n.f266968d) {
            this.f457655s.setValue(hVar);
            return;
        }
        kz5.p0 infoList = (7 & 1) != 0 ? kz5.p0.f313996d : null;
        sw0.g selectedIndexPack = (7 & 2) != 0 ? new sw0.g(-1, -1) : null;
        sw0.h updateState = (7 & 4) != 0 ? sw0.h.f413436a : null;
        kotlin.jvm.internal.o.g(infoList, "infoList");
        kotlin.jvm.internal.o.g(selectedIndexPack, "selectedIndexPack");
        kotlin.jvm.internal.o.g(updateState, "updateState");
    }

    public final void s() {
        kotlinx.coroutines.z0.d(this.f457639c, this + " onCleared.", null, 2, null);
    }

    public final void t() {
        this.f457640d.setValue(new zu0.h(new sw0.e(null, null, null, 7, null)));
        this.f457649m.setValue(new zu0.h(new sw0.e(null, null, null, 7, null)));
        this.f457653q.setValue(new zu0.h(new sw0.e(null, null, null, 7, null)));
        this.f457651o.setValue(new zu0.h(new sw0.e(null, null, null, 7, null)));
        this.f457655s.setValue(new zu0.h(new sw0.e(null, null, null, 7, null)));
    }

    public final void u(sw0.d selectedData) {
        kotlin.jvm.internal.o.g(selectedData, "selectedData");
        kotlinx.coroutines.l.d(this.f457639c, null, null, new xw0.i(this, selectedData, null), 3, null);
    }

    public final void v(sw0.d selectedData) {
        kotlin.jvm.internal.o.g(selectedData, "selectedData");
        kotlinx.coroutines.l.d(this.f457639c, null, null, new xw0.j(selectedData, this, null), 3, null);
    }

    public final void w(sw0.d selectedData, java.lang.String str) {
        kotlin.jvm.internal.o.g(selectedData, "selectedData");
        kotlinx.coroutines.l.d(this.f457639c, null, null, new xw0.k(selectedData, this, str, null), 3, null);
    }
}

package wt;

/* loaded from: classes12.dex */
public final class i extends wt.a {
    public final v05.a a(l15.a aVar) {
        r05.k b17;
        v05.a a17;
        r05.k b18 = ot.a.b(aVar);
        boolean z17 = false;
        if (b18 != null && b18.getInteger(b18.f368365d + 6) == 5) {
            z17 = true;
        }
        if (!z17 || (b17 = ot.a.b(aVar)) == null || (a17 = ot.a.a(b17)) == null) {
            return null;
        }
        return a17;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(zu.e r17, java.util.List r18, java.util.List r19, kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wt.i.b(zu.e, java.util.List, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public java.lang.Object c(eu.c cVar, oi3.e eVar, kotlin.coroutines.Continuation continuation) {
        v05.a a17;
        r05.k b17 = ot.a.b(cVar.f256683b);
        if (b17 == null) {
            return new eu.d(cVar, eu.e.f256692e);
        }
        com.tencent.mm.storage.f9 f9Var = null;
        pu.l lVar = cVar.f256685d;
        if (lVar != null) {
            pt0.e0 e0Var = pt0.f0.f358209b1;
            c01.h7 h7Var = lVar.f358326a;
            java.lang.String str = h7Var != null ? h7Var.f37229d : null;
            if (str == null) {
                str = "";
            }
            f9Var = e0Var.k(str, h7Var != null ? h7Var.f37227b : 0L);
        }
        if (f9Var != null) {
            if (b17.getInteger(b17.f368365d + 6) == 5) {
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                m11.l0 Di = m11.b1.Di();
                tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
                kotlin.jvm.internal.o.d(u0Var);
                java.lang.String ga6 = tg3.u0.ga(u0Var, f9Var, f9Var.z0(), false, 4, null);
                java.lang.String h17 = com.tencent.mm.sdk.platformtools.t8.h1();
                java.lang.String ij6 = ((k90.b) u0Var).ij(null, bm5.f0.f22564i, h17, "msgth_", "", true, true);
                if (com.tencent.mm.vfs.w6.j(ga6)) {
                    com.tencent.mm.vfs.w6.h(ij6);
                    com.tencent.mm.vfs.w6.c(ga6, ij6);
                }
                java.lang.String o17 = Di.o1(h17);
                kotlin.jvm.internal.o.f(o17, "getAppMsgThumbSavePath(...)");
                eVar.k(o17);
                if (com.tencent.mm.vfs.w6.j(ij6) && (a17 = ot.a.a(b17)) != null) {
                    if (r26.n0.N(a17.n())) {
                        java.lang.String e17 = kk.k.e(ij6);
                        kotlin.jvm.internal.o.f(e17, "getMD5(...)");
                        a17.J(e17);
                    }
                    if (a17.l() == 0) {
                        a17.I((int) com.tencent.mm.vfs.w6.k(ij6));
                    }
                    if (a17.p() == 0 || a17.k() == 0) {
                        com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
                        com.tencent.mm.pointers.PInt pInt2 = new com.tencent.mm.pointers.PInt();
                        com.tencent.mm.sdk.platformtools.x.r0(ij6, pInt, pInt2);
                        a17.L(pInt.value);
                        a17.H(pInt2.value);
                    }
                }
            }
            java.lang.String U1 = f9Var.U1();
            eVar.set(eVar.f345617d + 13, U1 != null ? U1 : "");
        } else {
            eVar.set(eVar.f345617d + 13, cVar.f256683b.toXml());
        }
        eVar.set(eVar.f345617d + 4, java.lang.Integer.valueOf(((ez.e) ((pt.j0) i95.n0.c(pt.j0.class))).bj(b17)));
        return new eu.d(cVar, eu.e.f256691d);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(pu.p r20, eu.d r21, zu.f r22, kotlin.coroutines.Continuation r23) {
        /*
            Method dump skipped, instructions count: 791
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wt.i.d(pu.p, eu.d, zu.f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(zu.e r10, java.util.List r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wt.i.e(zu.e, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(zu.e r11, java.util.List r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wt.i.f(zu.e, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

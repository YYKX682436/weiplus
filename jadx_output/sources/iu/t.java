package iu;

/* loaded from: classes12.dex */
public final class t extends iu.h {
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004a, code lost:
    
        if ((r0 == 43) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004f, code lost:
    
        if (r0 == false) goto L35;
     */
    @Override // iu.h, gu.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(gu.j r17, kotlin.coroutines.Continuation r18) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: iu.t.a(gu.j, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x002d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x03ad A[PHI: r2
  0x03ad: PHI (r2v49 java.lang.Object) = (r2v42 java.lang.Object), (r2v1 java.lang.Object) binds: [B:19:0x03aa, B:11:0x0038] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x03ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    @Override // iu.h, gu.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(gu.j r27, kotlin.coroutines.Continuation r28) {
        /*
            Method dump skipped, instructions count: 960
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: iu.t.b(gu.j, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // iu.h
    public java.lang.String m() {
        return "MicroMsg.AppMsg.QuoteTextRecordSendApi";
    }

    public final boolean r(gu.j jVar) {
        l15.c u17;
        s15.d0 I = jVar.f275609c.I();
        return (I == null || I.getType() != 49 || (u17 = u(I.getContent())) == null || s(u17) == null) ? false : true;
    }

    public final java.lang.Integer s(l15.c cVar) {
        java.lang.String str;
        java.lang.Integer valueOf;
        v05.a aVar;
        b15.c cVar2;
        kotlin.jvm.internal.o.g(cVar, "<this>");
        v05.b k17 = cVar.k();
        int integer = k17 != null ? k17.getInteger(k17.f368365d + 6) : 0;
        if (integer != 6 && integer != 130) {
            if (integer != 2001) {
                return null;
            }
            v05.b k18 = cVar.k();
            if (kotlin.jvm.internal.o.b((k18 == null || (cVar2 = (b15.c) k18.getCustom(k18.f432315e + 31)) == null) ? null : cVar2.w(), "1001")) {
                return null;
            }
            return java.lang.Integer.valueOf(com.tencent.mm.R.drawable.c2c_hongbao_icon_cn);
        }
        pt.m0 m0Var = (pt.m0) i95.n0.c(pt.m0.class);
        v05.b k19 = cVar.k();
        if (k19 == null || (aVar = (v05.a) k19.getCustom(k19.f432315e + 8)) == null || (str = aVar.r()) == null || !(!r26.n0.N(str))) {
            str = null;
        }
        if (str == null || r26.n0.N(str)) {
            valueOf = java.lang.Integer.valueOf(((ot.g) m0Var).bj());
            if (!(valueOf.intValue() != 0)) {
                return null;
            }
        } else {
            ot.g gVar = (ot.g) m0Var;
            valueOf = java.lang.Integer.valueOf(gVar.nj(str, null));
            if (!(valueOf.intValue() != 0)) {
                valueOf = null;
            }
            if (valueOf == null) {
                valueOf = java.lang.Integer.valueOf(gVar.bj());
                if (!(valueOf.intValue() != 0)) {
                    return null;
                }
            }
        }
        return valueOf;
    }

    public final boolean t(gu.j jVar) {
        s15.h hVar = jVar.f275609c;
        return (r26.n0.N(hVar.getString(hVar.f303422d + 4)) ^ true) || (r26.n0.N(jVar.f275609c.c0()) ^ true);
    }

    public final l15.c u(java.lang.String str) {
        java.lang.Object m521constructorimpl;
        if (r26.n0.N(str)) {
            return null;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            l15.c cVar = new l15.c();
            cVar.fromXml(str, true);
            m521constructorimpl = kotlin.Result.m521constructorimpl(cVar);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        return (l15.c) (kotlin.Result.m527isFailureimpl(m521constructorimpl) ? null : m521constructorimpl);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (r0 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final oi3.e v(gu.j r7) {
        /*
            r6 = this;
            s15.h r0 = r7.f275609c
            s15.d0 r0 = r0.I()
            r1 = 0
            if (r0 == 0) goto L6e
            long r2 = r0.k()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            long r2 = r0.longValue()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L1d
            r2 = 1
            goto L1e
        L1d:
            r2 = 0
        L1e:
            if (r2 == 0) goto L21
            goto L22
        L21:
            r0 = r1
        L22:
            if (r0 == 0) goto L6e
            long r2 = r0.longValue()
            s15.h r0 = r7.f275609c
            s15.i r0 = r0.p()
            oi3.g r7 = r7.f275608b
            if (r0 == 0) goto L48
            java.lang.String r0 = r0.j()
            if (r0 == 0) goto L48
            boolean r4 = r26.n0.N(r0)
            if (r4 == 0) goto L46
            int r0 = r7.f345617d
            int r0 = r0 + 3
            java.lang.String r0 = r7.getString(r0)
        L46:
            if (r0 != 0) goto L50
        L48:
            int r0 = r7.f345617d
            int r0 = r0 + 3
            java.lang.String r0 = r7.getString(r0)
        L50:
            boolean r7 = r26.n0.N(r0)
            if (r7 == 0) goto L57
            goto L6e
        L57:
            pt0.e0 r7 = pt0.f0.f358209b1
            com.tencent.mm.storage.f9 r7 = r7.l(r0, r2)
            if (r7 == 0) goto L6e
            java.lang.Class<pt.j0> r0 = pt.j0.class
            i95.m r0 = i95.n0.c(r0)
            pt.j0 r0 = (pt.j0) r0
            ez.e r0 = (ez.e) r0
            oi3.e r7 = r0.qj(r7)
            r1 = r7
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: iu.t.v(gu.j):oi3.e");
    }
}

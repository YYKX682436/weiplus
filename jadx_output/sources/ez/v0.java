package ez;

/* loaded from: classes9.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ez.v0 f257777a = new ez.v0();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f257778b = jz5.h.b(ez.u0.f257775d);

    public static /* synthetic */ boolean b(ez.v0 v0Var, com.tencent.mm.storage.f9 f9Var, v05.b bVar, java.lang.String str, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            bVar = null;
        }
        if ((i17 & 4) != 0) {
            str = null;
        }
        return v0Var.a(f9Var, bVar, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0066 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(com.tencent.mm.storage.f9 r6, v05.b r7, java.lang.String r8) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L7b
            ez.v0 r1 = ez.v0.f257777a
            if (r7 != 0) goto L17
            v05.b r7 = new v05.b
            r7.<init>()
            java.lang.String r2 = r6.U1()
            if (r2 != 0) goto L14
            java.lang.String r2 = ""
        L14:
            r7.fromXml(r2)
        L17:
            if (r8 != 0) goto L1d
            java.lang.String r8 = r1.f(r6, r7)
        L1d:
            java.lang.Class<e40.v> r2 = e40.v.class
            i95.m r2 = i95.n0.c(r2)
            e40.v r2 = (e40.v) r2
            d40.n r2 = (d40.n) r2
            r2.getClass()
            java.lang.Class<sx.e0> r2 = sx.e0.class
            i95.m r2 = i95.n0.c(r2)
            sx.e0 r2 = (sx.e0) r2
            rx.l r2 = (rx.l) r2
            r3 = 1
            boolean r2 = r2.Ri(r3)
            if (r2 != 0) goto L67
            java.lang.Class<e40.u> r2 = e40.u.class
            i95.m r2 = i95.n0.c(r2)
            e40.u r2 = (e40.u) r2
            int r4 = r7.f368365d
            int r4 = r4 + 6
            int r4 = r7.getInteger(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            bf5.o r2 = (bf5.o) r2
            r2.getClass()
            if (r4 == 0) goto L63
            r4.intValue()
            r2 = 130(0x82, float:1.82E-43)
            int r4 = r4.intValue()
            if (r4 != r2) goto L63
            r2 = r3
            goto L64
        L63:
            r2 = r0
        L64:
            if (r2 == 0) goto L67
            return r0
        L67:
            boolean r2 = com.tencent.mm.vfs.w6.j(r8)
            if (r2 == 0) goto L6e
            return r3
        L6e:
            boolean r7 = r1.e(r7)
            if (r7 == 0) goto L7b
            boolean r6 = r1.c(r6, r8)
            if (r6 != 0) goto L7b
            return r3
        L7b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ez.v0.a(com.tencent.mm.storage.f9, v05.b, java.lang.String):boolean");
    }

    public final boolean c(com.tencent.mm.storage.f9 msgInfo, java.lang.String str) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        if (str == null) {
            v05.b bVar = new v05.b();
            java.lang.String U1 = msgInfo.U1();
            if (U1 == null) {
                U1 = "";
            }
            bVar.fromXml(U1);
            str = f(msgInfo, bVar);
        }
        return com.tencent.mm.ui.chatting.component.z4.c(msgInfo, str);
    }

    public final boolean d(java.lang.String str) {
        if (str == null) {
            return false;
        }
        v05.b bVar = new v05.b();
        bVar.fromXml(str);
        return f257777a.e(bVar);
    }

    public final boolean e(v05.b appMsg) {
        kotlin.jvm.internal.o.g(appMsg, "appMsg");
        v05.a aVar = (v05.a) appMsg.getCustom(appMsg.f432315e + 8);
        if (aVar != null) {
            int i17 = aVar.f368364d;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(aVar.getString(i17 + 3)) && !com.tencent.mm.sdk.platformtools.t8.K0(aVar.getString(i17 + 2))) {
                java.lang.String string = aVar.getString(i17 + 2);
                return (r26.i0.y(string, "/", false) || r26.i0.y(string, "content://", false)) ? false : true;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(aVar.u()) && !com.tencent.mm.sdk.platformtools.t8.K0(aVar.C())) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.String f(com.tencent.mm.storage.f9 f9Var, v05.b bVar) {
        java.lang.String str;
        pt.j0 j0Var = (pt.j0) i95.n0.c(pt.j0.class);
        java.lang.String g17 = g(bVar);
        if (g17 == null) {
            g17 = bVar.getString(bVar.f368365d + 2);
        }
        v05.a aVar = (v05.a) bVar.getCustom(bVar.f432315e + 8);
        if (aVar == null || (str = aVar.r()) == null) {
            str = "";
        }
        return ((ez.e) j0Var).cj(f9Var, g17, str, false);
    }

    public final java.lang.String g(v05.b bVar) {
        v05.a aVar;
        java.lang.String s17;
        if (!i(bVar != null ? java.lang.Integer.valueOf(bVar.getInteger(bVar.f368365d + 6)) : null)) {
            if (bVar != null) {
                return bVar.getString(bVar.f368365d + 2);
            }
            return null;
        }
        if (bVar != null && (aVar = (v05.a) bVar.getCustom(bVar.f432315e + 8)) != null && (s17 = aVar.s()) != null) {
            if (!(!r26.n0.N(s17))) {
                s17 = null;
            }
            if (s17 != null) {
                return s17;
            }
        }
        if (bVar != null) {
            return bVar.getString(bVar.f368365d + 2);
        }
        return null;
    }

    public final long h() {
        java.lang.Object m521constructorimpl;
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            return ((com.tencent.mm.ipcinvoker.type.IPCLong) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCVoid(), ez.t0.class)).f68405d;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(java.lang.Long.valueOf(ip.c.k()));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            m521constructorimpl = 1073741824L;
        }
        return ((java.lang.Number) m521constructorimpl).longValue();
    }

    public final boolean i(java.lang.Integer num) {
        if (num == null) {
            return false;
        }
        num.intValue();
        return j(num) || k(num);
    }

    public final boolean j(java.lang.Integer num) {
        if (num == null) {
            return false;
        }
        num.intValue();
        return num.intValue() == 6 || num.intValue() == 130;
    }

    public final boolean k(java.lang.Integer num) {
        if (num == null) {
            return false;
        }
        num.intValue();
        return num.intValue() == 74 || num.intValue() == 131;
    }
}

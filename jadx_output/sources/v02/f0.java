package v02;

@j95.b
/* loaded from: classes8.dex */
public final class f0 extends jm0.o implements a00.j {

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f432248m = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: n, reason: collision with root package name */
    public kotlinx.coroutines.z f432249n = kotlinx.coroutines.b0.a(null, 1, null);

    /* renamed from: o, reason: collision with root package name */
    public kotlinx.coroutines.z f432250o = kotlinx.coroutines.b0.a(null, 1, null);

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f432251p = jz5.h.b(v02.z.f432297d);

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f432252q = jz5.h.b(v02.k.f432261d);

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f432253r = jz5.h.b(v02.o.f432273d);

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f432254s = jz5.h.b(v02.p.f432274d);

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Zi(v02.f0 r4, com.tencent.mm.storage.f9 r5, kotlin.coroutines.Continuation r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof v02.m
            if (r0 == 0) goto L16
            r0 = r6
            v02.m r0 = (v02.m) r0
            int r1 = r0.f432269h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f432269h = r1
            goto L1b
        L16:
            v02.m r0 = new v02.m
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.f432267f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f432269h
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f432266e
            r5 = r4
            com.tencent.mm.storage.f9 r5 = (com.tencent.mm.storage.f9) r5
            java.lang.Object r4 = r0.f432265d
            v02.f0 r4 = (v02.f0) r4
            kotlin.ResultKt.throwOnFailure(r6)
            goto L53
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.ResultKt.throwOnFailure(r6)
            v02.n r6 = new v02.n
            r2 = 0
            r6.<init>(r4, r2)
            r0.f432265d = r4
            r0.f432266e = r5
            r0.f432269h = r3
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r6 = kotlinx.coroutines.a4.c(r2, r6, r0)
            if (r6 != r1) goto L53
            goto L5e
        L53:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L5d
            java.lang.String r4 = r4.oj(r5)
            r1 = r4
            goto L5e
        L5d:
            r1 = r6
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v02.f0.Zi(v02.f0, com.tencent.mm.storage.f9, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void aj(v02.f0 f0Var, com.tencent.mm.storage.f9 f9Var) {
        java.lang.String oj6 = f0Var.oj(f9Var);
        ((cy1.a) f0Var.rj()).Ej("click_open_file", kz5.c1.m(f0Var.mj(f9Var), kz5.b1.e(new jz5.l("same_file_link_id", oj6))), 36223);
    }

    public static final void bj(v02.f0 f0Var, com.tencent.mm.storage.f9 f9Var, java.lang.String str) {
        ((cy1.a) f0Var.rj()).Hj("menu_half_screen", "view_exp", kz5.c1.m(f0Var.mj(f9Var), kz5.c1.k(new jz5.l("is_include_view_chat_btn", 0), new jz5.l("same_file_link_id", str))), 36223);
    }

    public static final void cj(v02.f0 f0Var, int i17, java.lang.String str, long j17, java.lang.String str2, java.lang.String str3) {
        f0Var.getClass();
        f0Var.f432249n = kotlinx.coroutines.b0.a(null, 1, null);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f0Var.f432248m;
        concurrentHashMap.clear();
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        concurrentHashMap.put("menu_half_screen_sessionid", uuid);
        concurrentHashMap.put("file_type", java.lang.Integer.valueOf(i17));
        concurrentHashMap.put("file_extension", str);
        concurrentHashMap.put("msgsvrid", java.lang.Long.valueOf(j17));
        concurrentHashMap.put("chat_name", str2);
        concurrentHashMap.put("same_file_link_id", str3);
        ((kotlinx.coroutines.a0) f0Var.f432249n).U(java.lang.Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object fj(v02.f0 r4, yz5.a r5, kotlin.coroutines.Continuation r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof v02.d0
            if (r0 == 0) goto L16
            r0 = r6
            v02.d0 r0 = (v02.d0) r0
            int r1 = r0.f432245g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f432245g = r1
            goto L1b
        L16:
            v02.d0 r0 = new v02.d0
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.f432243e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f432245g
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f432242d
            r5 = r4
            yz5.a r5 = (yz5.a) r5
            kotlin.ResultKt.throwOnFailure(r6)
            goto L4d
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.ResultKt.throwOnFailure(r6)
            v02.e0 r6 = new v02.e0
            r2 = 0
            r6.<init>(r4, r2)
            r0.f432242d = r5
            r0.f432245g = r3
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r4 = kotlinx.coroutines.a4.c(r2, r6, r0)
            if (r4 != r1) goto L4d
            goto L52
        L4d:
            r5.invoke()
            jz5.f0 r1 = jz5.f0.f302826a
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v02.f0.fj(v02.f0, yz5.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void hj(java.util.Map parameters) {
        kotlin.jvm.internal.o.g(parameters, "parameters");
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            this.f432248m.putAll(parameters);
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putSerializable("parameters", new java.util.HashMap(parameters));
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, v02.a.class, null);
    }

    public void ij() {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            this.f432248m.clear();
        } else {
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCVoid(), v02.b.class, v02.j.f432259d);
        }
    }

    public final java.util.Map mj(com.tencent.mm.storage.f9 f9Var) {
        return kz5.c1.k(new jz5.l("file_type", java.lang.Integer.valueOf(pj(f9Var))), new jz5.l("file_extension", nj(f9Var)), new jz5.l("msgsvrid", java.lang.Long.valueOf(f9Var.I0())), new jz5.l("chat_name", f9Var.Q0()));
    }

    public final java.lang.String nj(com.tencent.mm.storage.f9 f9Var) {
        java.lang.String r17;
        if (!f9Var.n2()) {
            return "";
        }
        v05.a aVar = null;
        try {
            l15.c cVar = new l15.c();
            java.lang.String U1 = f9Var.U1();
            if (U1 == null) {
                U1 = "";
            }
            cVar.fromXml(U1);
            v05.b k17 = cVar.k();
            if (k17 != null) {
                aVar = (v05.a) k17.getCustom(k17.f432315e + 8);
            }
        } catch (java.lang.Exception unused) {
        }
        return (aVar == null || (r17 = aVar.r()) == null) ? "" : r17;
    }

    public final java.lang.String oj(com.tencent.mm.storage.f9 f9Var) {
        java.lang.String str;
        java.lang.String a07;
        this.f432250o = kotlinx.coroutines.b0.a(null, 1, null);
        boolean J2 = f9Var.J2();
        jz5.g gVar = this.f432252q;
        if (J2) {
            ((j70.e) ((k70.y) ((jz5.n) this.f432253r).getValue())).getClass();
            str = ((k90.b) ((tg3.u0) ((jz5.n) gVar).getValue())).aj(f9Var, bm5.f0.f22564i, m11.b1.Di().T1(f9Var.Q0(), f9Var.getMsgId()).f322639g, "", "");
        } else if (f9Var.isVideo()) {
            tg3.u0 u0Var = (tg3.u0) ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(u0Var, "<get-fileService>(...)");
            str = tg3.u0.L4(u0Var, f9Var, f9Var.z0(), false, 4, null);
        } else if (f9Var.n2()) {
            tg3.u0 u0Var2 = (tg3.u0) ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(u0Var2, "<get-fileService>(...)");
            str = tg3.u0.Z1(u0Var2, f9Var, null, 2, null);
        } else {
            str = null;
        }
        java.lang.String str2 = com.tencent.mm.vfs.w6.j(str) ? str : null;
        if (str2 != null) {
            try {
                jz5.g gVar2 = c01.td.f37497a;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.DupCheckReportFeatureService", e17, "calculateFileMd5", new java.lang.Object[0]);
            }
            if (!com.tencent.mm.vfs.w6.j(str2)) {
                throw new java.lang.IllegalArgumentException("File not exists: ".concat(str2));
            }
            byte[] o17 = com.tencent.mm.vfs.w6.o(str2);
            kotlin.jvm.internal.o.f(o17, "getFileMD5(...)");
            a07 = kz5.z.a0(o17, "", null, null, 0, null, v02.l.f432262d, 30, null);
            ((kotlinx.coroutines.a0) this.f432250o).U(a07);
            return a07;
        }
        a07 = "";
        ((kotlinx.coroutines.a0) this.f432250o).U(a07);
        return a07;
    }

    public final int pj(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var.J2()) {
            return 1;
        }
        if (f9Var.isVideo()) {
            return 2;
        }
        return f9Var.n2() ? 3 : 4;
    }

    public final kotlinx.coroutines.y0 qj() {
        return (kotlinx.coroutines.y0) ((jz5.n) this.f432254s).getValue();
    }

    public final dy1.r rj() {
        return (dy1.r) ((jz5.n) this.f432251p).getValue();
    }

    public final void sj(yz5.a aVar) {
        kotlinx.coroutines.l.d(qj(), null, null, new v02.q(this, aVar, null), 3, null);
    }

    public void tj(java.lang.Long l17, java.lang.String str) {
        if (l17 == null || str == null) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            if (gm0.j1.a()) {
                kotlinx.coroutines.l.d(qj(), null, null, new v02.s(str, l17, this, null), 3, null);
            }
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong("msgId", l17.longValue());
            bundle.putString("msgTalker", str);
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, v02.c.class, null);
        }
    }

    public void uj(java.lang.String str) {
        if (str == null) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            sj(new v02.t(this, str));
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("targetChatUsername", str);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, v02.d.class, null);
    }

    public void vj(java.util.List list) {
        if (list == null) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            sj(new v02.u(this, list));
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putStringArrayList("chatUsernames", new java.util.ArrayList<>(list));
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, v02.e.class, null);
    }

    public void wj() {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            sj(new v02.v(this));
        } else {
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCVoid(), v02.f.class, null);
        }
    }

    public void xj() {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            sj(new v02.w(this));
        } else {
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCVoid(), v02.g.class, null);
        }
    }

    public void yj(java.lang.Long l17, java.lang.String str) {
        if (l17 == null || str == null) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            if (gm0.j1.a()) {
                kotlinx.coroutines.l.d(qj(), null, null, new v02.y(str, l17, this, null), 3, null);
            }
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong("msgId", l17.longValue());
            bundle.putString("msgTalker", str);
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, v02.h.class, null);
        }
    }

    public void zj(java.lang.Long l17, java.lang.String str, yz5.a aVar) {
        if (l17 == null || str == null) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            if (gm0.j1.a()) {
                kotlinx.coroutines.l.d(qj(), null, null, new v02.b0(str, l17, this, aVar, null), 3, null);
            }
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong("msgId", l17.longValue());
            bundle.putString("msgTalker", str);
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, v02.i.class, new v02.c0(aVar));
        }
    }
}

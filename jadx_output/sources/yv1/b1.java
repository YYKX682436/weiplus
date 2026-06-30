package yv1;

@j95.b(dependencies = {qk.x7.class, c01.j8.class, tg3.v0.class, le0.x.class})
/* loaded from: classes12.dex */
public final class b1 extends i95.w implements c01.f8 {

    /* renamed from: e, reason: collision with root package name */
    public static final yv1.m0 f465997e = new yv1.m0(null);

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f465998f = jz5.h.b(yv1.k0.f466098d);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f465999g = jz5.h.b(yv1.j0.f466092d);

    /* renamed from: d, reason: collision with root package name */
    public volatile yv1.i0 f466000d;

    public static final java.lang.String Bi(java.lang.String str, java.util.List list) {
        java.util.Iterator it = list.iterator();
        java.lang.String str2 = null;
        while (it.hasNext()) {
            ot1.h hVar = (ot1.h) ((ot1.i) it.next());
            java.lang.String t07 = hVar.t0();
            if (!kotlin.jvm.internal.o.b(t07, str)) {
                long k17 = com.tencent.mm.vfs.w6.k(t07);
                if (com.tencent.mm.vfs.w6.j(t07) && k17 > 0 && k17 == hVar.field_size) {
                    com.tencent.mm.vfs.x1 m17 = com.tencent.mm.vfs.w6.m(t07);
                    boolean z17 = false;
                    if (m17 != null && (m17 instanceof com.tencent.mm.vfs.k5)) {
                        z17 = true;
                    }
                    if (z17) {
                        return t07;
                    }
                    if (str2 == null && com.tencent.mm.vfs.w6.m(t07) != null) {
                        str2 = t07;
                    }
                }
            }
        }
        return str2;
    }

    public void Ai(android.content.Context context, android.os.Bundle jumpChatArg) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jumpChatArg, "jumpChatArg");
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingChooseConvUI.f95719f.b(context, jumpChatArg);
    }

    public final jz5.l Di() {
        com.tencent.mm.sdk.platformtools.o4 J2 = com.tencent.mm.sdk.platformtools.o4.J("mmkv_compress_original_media_unfinished", gm0.j1.b().h(), 1);
        java.lang.String t17 = J2.t("clean_cache_estimated_detail");
        if (t17 == null) {
            t17 = "";
        }
        long p17 = J2.p("clean_cache_appbrand1") + J2.p("clean_cache_appbrand2");
        long p18 = J2.p("clean_cache_cached_origin");
        aw1.o0 h17 = aw1.l0.f14568a.h();
        return new jz5.l(kz5.n0.g0(r26.n0.e0(t17, new char[]{'#'}, false, 0, 6, null), "#", null, null, 0, null, new yv1.w0(h17.f14626c, p18, h17.f14625b, p17), 30, null), t17);
    }

    public java.lang.String Ni(android.content.Context context, android.os.Bundle jumpChatArg) {
        java.lang.String e17;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jumpChatArg, "jumpChatArg");
        java.lang.String[] stringArray = jumpChatArg.getStringArray("u");
        if (stringArray == null) {
            throw new java.lang.IllegalArgumentException(jumpChatArg.toString());
        }
        if (stringArray.length != 1) {
            java.lang.String string = context.getString(com.tencent.mm.R.string.n_b, java.lang.Integer.valueOf(stringArray.length));
            kotlin.jvm.internal.o.f(string, "getString(...)");
            return string;
        }
        java.lang.String str = stringArray[0];
        if (com.tencent.mm.storage.z3.R4(str)) {
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            e17 = c01.a2.f(str, str);
        } else {
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            e17 = c01.a2.e(str);
        }
        java.lang.String string2 = context.getString(com.tencent.mm.R.string.n_c, e17);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        return string2;
    }

    public java.lang.CharSequence Ri(android.content.Context context, android.os.Bundle jumpChatArg, float f17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jumpChatArg, "jumpChatArg");
        java.lang.String[] stringArray = jumpChatArg.getStringArray("u");
        if (stringArray == null) {
            throw new java.lang.IllegalArgumentException(jumpChatArg.toString());
        }
        java.lang.String Ni = Ni(context, jumpChatArg);
        if (stringArray.length != 1) {
            return Ni;
        }
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        return com.tencent.mm.pluginsdk.ui.span.c0.j(context, Ni, f17);
    }

    public boolean Ui() {
        boolean z17 = f465997e.a().getBoolean("WxFileIndex2ndIndex", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanService", "hasSecondIndex: " + z17);
        return z17;
    }

    public boolean Vi() {
        boolean z17 = f465997e.a().getBoolean("WxFileIndex3rdIndex", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanService", "hasThirdIndex: " + z17);
        return z17;
    }

    public boolean Zi(java.lang.String path, int i17) {
        kotlin.jvm.internal.o.g(path, "path");
        if (!com.tencent.mm.vfs.w6.j(path)) {
            return false;
        }
        com.tencent.mm.vfs.x1 m17 = com.tencent.mm.vfs.w6.m(path);
        java.lang.String str = null;
        if (m17 != null) {
            if (!(m17 instanceof com.tencent.mm.vfs.k5)) {
                m17 = null;
            }
            if (m17 != null) {
                java.util.UUID fromString = java.util.UUID.fromString(((com.tencent.mm.vfs.k5) m17).f213029h);
                kotlin.jvm.internal.o.f(fromString, "fromString(...)");
                java.lang.String Bi = Bi(path, kz5.n0.V(mt1.b0.f331191a.n().f1(c01.td.b(fromString), i17, -1, null)));
                if (Bi != null) {
                    str = Bi;
                    return !(str != null || str.length() == 0) && com.tencent.mm.vfs.w6.d(str, path, true) >= 0;
                }
            }
        }
        if (Ui()) {
            java.lang.String Bi2 = Bi(path, kz5.n0.V(mt1.b0.f331191a.n().o1(c01.td.a(path), i17, -1, null)));
            if (Bi2 != null) {
                str = Bi2;
            }
        }
        if (str != null || str.length() == 0) {
            return false;
        }
    }

    public final void aj(yv1.b0 b0Var) {
        yv1.i0 i0Var = this.f466000d;
        if (i0Var == null || b0Var == null) {
            return;
        }
        i0Var.f466083o = false;
        java.util.HashSet hashSet = i0Var.f466073e;
        synchronized (hashSet) {
            hashSet.remove(b0Var);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanService", "Clean cache callback removed: " + b0Var);
    }

    public final void bj() {
        yv1.i0 i0Var = this.f466000d;
        if (i0Var == null) {
            com.tencent.mm.sdk.platformtools.o4 J2 = com.tencent.mm.sdk.platformtools.o4.J("mmkv_compress_original_media_unfinished", gm0.j1.b().h(), 1);
            J2.remove("clean_cache_last_clean_size");
            J2.remove("clean_cache_estimated_size");
            J2.remove("clean_cache_session_id");
            J2.remove("clean_cache_typed_deleted_size");
            J2.remove("clean_cache_appbrand1");
            J2.remove("clean_cache_appbrand2");
            J2.remove("clean_cache_cached_origin");
            J2.remove("clean_cache_cached_origin_image");
            J2.remove("clean_cache_cached_origin_video");
            J2.remove("clean_cache_estimated_detail");
            J2.remove("clean_cache_reported");
            aw1.l0 l0Var = aw1.l0.f14568a;
            com.tencent.mm.sdk.platformtools.o4 o4Var = aw1.l0.f14579l;
            o4Var.remove("mmkv_compress_original_media_last_task_compressed_size");
            o4Var.remove("mmkv_compress_original_media_last_task_send_compressed_size");
            o4Var.remove("mmkv_compress_original_media_last_task_recv_compressed_size");
            o4Var.remove("mmkv_compress_original_media_last_task_send_expected_size");
            o4Var.remove("mmkv_compress_original_media_last_task_recv_expected_size");
            return;
        }
        i0Var.f466074f = 0L;
        i0Var.f466075g = 0L;
        i0Var.f466076h = 0L;
        i0Var.f466077i = 0L;
        i0Var.f466078j = 0L;
        i0Var.f466079k = 0L;
        aw1.l0 l0Var2 = aw1.l0.f14568a;
        com.tencent.mm.sdk.platformtools.o4 o4Var2 = aw1.l0.f14579l;
        o4Var2.remove("mmkv_compress_original_media_last_task_compressed_size");
        o4Var2.remove("mmkv_compress_original_media_last_task_send_compressed_size");
        o4Var2.remove("mmkv_compress_original_media_last_task_recv_compressed_size");
        o4Var2.remove("mmkv_compress_original_media_last_task_send_expected_size");
        o4Var2.remove("mmkv_compress_original_media_last_task_recv_expected_size");
        com.tencent.mm.sdk.platformtools.o4 o4Var3 = i0Var.f466084p;
        o4Var3.remove("clean_cache_last_clean_size");
        o4Var3.remove("clean_cache_estimated_size");
        o4Var3.remove("clean_cache_session_id");
        o4Var3.remove("clean_cache_typed_deleted_size");
        o4Var3.remove("clean_cache_appbrand1");
        o4Var3.remove("clean_cache_appbrand2");
        o4Var3.remove("clean_cache_cached_origin");
        o4Var3.remove("clean_cache_cached_origin_image");
        o4Var3.remove("clean_cache_cached_origin_video");
        o4Var3.remove("clean_cache_estimated_detail");
        o4Var3.remove("clean_cache_reported");
    }

    public final java.lang.String cj(int i17, yv1.b0 b0Var) {
        long j17;
        yv1.g1 b17 = yv1.g1.f466040p.b(i17);
        yv1.i0 i0Var = this.f466000d;
        if (i0Var != null) {
            i0Var.f466069a = b17;
            i0Var.f466080l = b17.f466043b;
        } else {
            i0Var = new yv1.i0(this);
            i0Var.f466069a = b17;
            i0Var.f466080l = b17.f466043b;
            this.f466000d = i0Var;
            i0Var.f();
        }
        if (b0Var != null) {
            java.util.HashSet hashSet = i0Var.f466073e;
            synchronized (hashSet) {
                hashSet.add(b0Var);
            }
            boolean isCanceled = i0Var.f466072d.isCanceled();
            boolean c17 = i0Var.c();
            synchronized (i0Var) {
                j17 = i0Var.f466075g + i0Var.f466076h + i0Var.f466074f;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.CleanService", "Clean cache callback registered: " + b0Var);
            b0Var.j4(c17, isCanceled, j17, i0Var.f466079k);
        }
        return i0Var.f466081m;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void fj(android.content.Context r20, long r21, java.lang.String r23, int r24) {
        /*
            Method dump skipped, instructions count: 1004
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yv1.b1.fj(android.content.Context, long, java.lang.String, int):void");
    }

    public void hj(long j17, java.lang.String talker, boolean z17) {
        com.tencent.wcdb.support.CancellationSignal cancellationSignal;
        kotlin.jvm.internal.o.g(talker, "talker");
        mt1.b0 b0Var = mt1.b0.f331191a;
        com.tencent.wcdb.support.CancellationSignal cancellationSignal2 = new com.tencent.wcdb.support.CancellationSignal();
        mt1.z zVar = new mt1.z(cancellationSignal2, j17, talker, z17);
        com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = new com.tencent.mm.plugin.msg.MsgIdTalker(j17, talker);
        jz5.g gVar = mt1.b0.f331198h;
        jz5.l lVar = (jz5.l) ((java.util.Map) ((jz5.n) gVar).getValue()).get(msgIdTalker);
        if (lVar != null && (cancellationSignal = (com.tencent.wcdb.support.CancellationSignal) lVar.f302834e) != null) {
            cancellationSignal.cancel();
        }
        ((java.util.Map) ((jz5.n) gVar).getValue()).put(msgIdTalker, new jz5.l(zVar, cancellationSignal2));
        ((ku5.t0) ku5.t0.f312615d).l(zVar, 100L, "CalcWxUpdates");
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (Ui() && Vi()) {
            return;
        }
        ((com.tencent.mm.sdk.event.IListener) ((jz5.n) f465999g).getValue()).alive();
    }

    public void wi(java.util.List talkers, c01.e8 e8Var, long j17, long j18, boolean z17, boolean z18, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        kotlin.jvm.internal.o.g(talkers, "talkers");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        yv1.n0 n0Var = new yv1.n0(talkers.size(), e8Var, z18);
        mt1.b0 b0Var = mt1.b0.f331191a;
        mt1.b0.f331201k = false;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CleanService", "Scan WxFileIndex for message delete");
            try {
                b0Var.B(true, cancellationSignal);
                b0Var.t(null, cancellationSignal);
            } catch (com.tencent.wcdb.support.OperationCanceledException unused) {
            }
        }
        wz1.b.b(true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(((ku5.t0) ku5.t0.f312615d).a(aw1.n0.b(talkers, null, j17, j18, false, n0Var, cancellationSignal)));
        arrayList.add(((ku5.t0) ku5.t0.f312615d).a(new yv1.s0(talkers, n0Var, j17, j18, cancellationSignal)));
        arrayList.add(((ku5.t0) ku5.t0.f312615d).a(new yv1.t0(talkers, cancellationSignal, n0Var)));
        arrayList.add(((ku5.t0) ku5.t0.f312615d).a(z18 ? new yv1.u0(talkers, n0Var) : new yv1.v0(talkers, cancellationSignal, j18, n0Var)));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((wu5.c) it.next()).get();
        }
        mt1.b0 b0Var2 = mt1.b0.f331191a;
        mt1.b0.f331201k = true;
        boolean isCanceled = cancellationSignal != null ? cancellationSignal.isCanceled() : false;
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanService", "Done sync delete messages, time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ", cancelled: " + isCanceled);
        if (e8Var != null) {
            e8Var.c(isCanceled, n0Var.f466119m, n0Var.f466120n);
        }
    }
}

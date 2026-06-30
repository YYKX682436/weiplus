package w11;

/* loaded from: classes12.dex */
public final class b2 {
    public b2(kotlin.jvm.internal.i iVar) {
    }

    public final byte[] a() {
        boolean n17 = com.tencent.mm.sdk.platformtools.x2.n();
        java.lang.String c17 = c();
        byte[] bArr = w11.c2.f441995e;
        if (bArr != null && n17) {
            return bArr;
        }
        if (com.tencent.mm.sdk.platformtools.x2.p()) {
            return com.tencent.mm.sdk.platformtools.t8.h(com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("notify_sync_pref", 4).getString("notify_sync_key_keybuf", ""));
        }
        java.lang.Object l17 = gm0.j1.u().c().l(8195, "");
        kotlin.jvm.internal.o.e(l17, "null cannot be cast to non-null type kotlin.String");
        byte[] h17 = com.tencent.mm.sdk.platformtools.t8.h((java.lang.String) l17);
        com.tencent.mars.xlog.Log.i("MicroMsg.SyncKeyKV", "getSyncKeyBuf uin:%s buffer:%s ", c17, o45.qi.d(h17));
        w11.c2.f441995e = h17;
        return h17;
    }

    public final com.tencent.mm.sdk.platformtools.o4 b() {
        java.lang.StackTraceElement stackTraceElement;
        java.lang.String j17 = gm0.j1.b().j();
        kotlin.jvm.internal.o.f(j17, "getUinString(...)");
        if (w11.c2.f441994d == null) {
            w11.c2.f441994d = com.tencent.mm.sdk.platformtools.o4.N("SyncMMKV_".concat(j17), 2, null);
        }
        com.tencent.mm.sdk.platformtools.o4 o4Var = w11.c2.f441994d;
        kotlin.jvm.internal.o.d(o4Var);
        if (o4Var.Y() > 4194304) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SyncKeyKV", "mmkvOverSize: " + (o4Var.Y() / 1024) + "KB");
            if (mm.k.j(mm.k.f328517x1, null, 1, null)) {
                synchronized (o4Var) {
                    if (!w11.c2.f441992b) {
                        java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().getStackTrace();
                        kotlin.jvm.internal.o.f(stackTrace, "getStackTrace(...)");
                        int length = stackTrace.length;
                        int i17 = 0;
                        while (true) {
                            if (i17 >= length) {
                                stackTraceElement = null;
                                break;
                            }
                            stackTraceElement = stackTrace[i17];
                            kotlin.jvm.internal.o.f(stackTraceElement.getClassName(), "getClassName(...)");
                            if (!r26.n0.B(r8, w11.c2.class.getName(), false)) {
                                break;
                            }
                            i17++;
                        }
                        ((ku5.t0) ku5.t0.f312615d).g(new w11.a2(o4Var, stackTraceElement != null ? stackTraceElement.toString() : null));
                    }
                }
            }
        }
        return o4Var;
    }

    public final java.lang.String c() {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            java.lang.String j17 = gm0.j1.b().j();
            kotlin.jvm.internal.o.d(j17);
            return j17;
        }
        if (com.tencent.mm.sdk.platformtools.x2.p()) {
            java.lang.String vVar = new kk.v(com.tencent.mm.network.x2.c().f71993n.f71902o).toString();
            kotlin.jvm.internal.o.d(vVar);
            return vVar;
        }
        throw new java.lang.IllegalThreadStateException("invoke must main process current processName:" + bm5.f1.a());
    }

    public final void d(byte[] bArr, boolean z17) {
        java.lang.String c17 = c();
        if (java.util.Arrays.equals(bArr, w11.c2.f441995e)) {
            return;
        }
        java.lang.String l17 = com.tencent.mm.sdk.platformtools.t8.l(bArr);
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            gm0.j1.u().c().w(8195, l17);
        }
        w11.c2.f441995e = bArr;
        com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("notify_sync_pref", 4).edit().putString("notify_sync_key_keybuf", l17).commit();
        if (z17) {
            gm0.j1.u().c().b(bArr == null ? 5 : 4, gm0.j1.u().c(), 8195);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SyncKeyKV", "setSyncKeyBuf uin:%s buffer:%s ", c17, o45.qi.d(bArr));
    }
}

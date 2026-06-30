package w11;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final w11.k f442068a = new w11.k();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f442069b = jz5.h.b(w11.i.f442055d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f442070c = jz5.h.b(w11.h.f442037d);

    public static final void a(w11.k kVar, r45.jl0 jl0Var) {
        kVar.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.DoCmdErrorHandler", "tryClean() called");
        long c17 = c01.id.c();
        int size = jl0Var.f377917d.size();
        java.util.LinkedList items = jl0Var.f377917d;
        kotlin.jvm.internal.o.f(items, "items");
        java.util.List F0 = kz5.n0.F0(items, new w11.j());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : F0) {
            if (c17 - ((r45.kl0) obj).f378802g < 604800000) {
                arrayList.add(obj);
            }
        }
        int size2 = arrayList.size();
        java.util.Collection collection = arrayList;
        if (size2 > 10) {
            collection = kz5.n0.L0(arrayList, 10);
        }
        java.util.LinkedList linkedList = new java.util.LinkedList(collection);
        jl0Var.f377917d = linkedList;
        int size3 = linkedList.size();
        com.tencent.mars.xlog.Log.i("MicroMsg.DoCmdErrorHandler", "tryClean() end called cost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + " beforeSize:" + size + " afterSize:" + size3);
        java.lang.Object value = ((jz5.n) f442069b).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((com.tencent.mm.sdk.platformtools.o4) value).H(gm0.j1.b().j(), jl0Var.toByteArray());
    }

    public final void b(r45.b50 cmdItem, java.lang.Throwable e17, int i17) {
        int i18;
        boolean z17;
        int i19;
        kotlin.jvm.internal.o.g(cmdItem, "cmdItem");
        kotlin.jvm.internal.o.g(e17, "e");
        int i27 = cmdItem.f370530d;
        if (i27 == 5) {
            try {
                r45.cu5 cu5Var = cmdItem.f370531e;
                byte[] bArr = cu5Var != null ? cu5Var.f371841f.f192156a : null;
                r45.j4 j4Var = new r45.j4();
                j4Var.parseFrom(bArr);
                i18 = j4Var.f377560g;
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.DoCmdErrorHandler", th6, "CmdItem.getMsgType error cmdId:" + i27, new java.lang.Object[0]);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.DoCmdErrorHandler", "collectError() called with cmdid:" + cmdItem.f370530d + " msgType:" + i18 + " callSource:" + i17);
            java.lang.String stackTraceString = android.util.Log.getStackTraceString(e17);
            kotlin.jvm.internal.o.f(stackTraceString, "getStackTraceString(...)");
            java.lang.String u17 = r26.i0.u(stackTraceString, ',', ' ', false, 4, null);
            r45.kl0 kl0Var = new r45.kl0();
            kl0Var.f378799d = cmdItem;
            z17 = true;
            java.lang.String format = java.lang.String.format("%08X", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(o45.wf.f343029g)}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            kl0Var.f378800e = format;
            kl0Var.f378801f = com.tencent.mm.sdk.platformtools.z.f193109e;
            kl0Var.f378802g = c01.id.c();
            kl0Var.f378803h = u17;
            kl0Var.f378804i = i17;
            kl0Var.f378805m = i18;
            jz5.g gVar = f442070c;
            ((r45.jl0) ((jz5.n) gVar).getValue()).f377917d.add(kl0Var);
            r45.jl0 jl0Var = (r45.jl0) ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.g(jl0Var, "<this>");
            java.lang.Object value = ((jz5.n) f442069b).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            ((com.tencent.mm.sdk.platformtools.o4) value).H(gm0.j1.b().j(), jl0Var.toByteArray());
            ((ku5.t0) ku5.t0.f312615d).h(new w11.g(cmdItem, kl0Var, u17), "DoCmdErrorHandler.Report");
            i19 = com.tencent.mm.sdk.platformtools.z.f193112h;
            if (!(i19 != 788529167 || i19 == 788529166) && !z65.c.a()) {
                z17 = false;
            }
            if (z17 || !bm5.o1.f22719a.a() || (e17 instanceof c01.c)) {
                return;
            }
            try {
                android.support.v4.media.f.a(i95.n0.c(com.tencent.mm.app.v2.class));
                kotlin.jvm.internal.o.f(gm0.j1.b().j(), "getUinString(...)");
                throw null;
            } catch (java.lang.Throwable th7) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.DoCmdErrorHandler", th7, "showDebugInfo err", new java.lang.Object[0]);
                return;
            }
        }
        i18 = 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.DoCmdErrorHandler", "collectError() called with cmdid:" + cmdItem.f370530d + " msgType:" + i18 + " callSource:" + i17);
        java.lang.String stackTraceString2 = android.util.Log.getStackTraceString(e17);
        kotlin.jvm.internal.o.f(stackTraceString2, "getStackTraceString(...)");
        java.lang.String u172 = r26.i0.u(stackTraceString2, ',', ' ', false, 4, null);
        r45.kl0 kl0Var2 = new r45.kl0();
        kl0Var2.f378799d = cmdItem;
        z17 = true;
        java.lang.String format2 = java.lang.String.format("%08X", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(o45.wf.f343029g)}, 1));
        kotlin.jvm.internal.o.f(format2, "format(...)");
        kl0Var2.f378800e = format2;
        kl0Var2.f378801f = com.tencent.mm.sdk.platformtools.z.f193109e;
        kl0Var2.f378802g = c01.id.c();
        kl0Var2.f378803h = u172;
        kl0Var2.f378804i = i17;
        kl0Var2.f378805m = i18;
        jz5.g gVar2 = f442070c;
        ((r45.jl0) ((jz5.n) gVar2).getValue()).f377917d.add(kl0Var2);
        r45.jl0 jl0Var2 = (r45.jl0) ((jz5.n) gVar2).getValue();
        kotlin.jvm.internal.o.g(jl0Var2, "<this>");
        java.lang.Object value2 = ((jz5.n) f442069b).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        ((com.tencent.mm.sdk.platformtools.o4) value2).H(gm0.j1.b().j(), jl0Var2.toByteArray());
        ((ku5.t0) ku5.t0.f312615d).h(new w11.g(cmdItem, kl0Var2, u172), "DoCmdErrorHandler.Report");
        i19 = com.tencent.mm.sdk.platformtools.z.f193112h;
        if (!(i19 != 788529167 || i19 == 788529166)) {
            z17 = false;
        }
        if (z17) {
        }
    }
}

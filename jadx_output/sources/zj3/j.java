package zj3;

/* loaded from: classes14.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final zj3.j f473337a = new zj3.j();

    public static final boolean a() {
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("mmkv_screen_project_info");
        kotlin.jvm.internal.o.f(M, "getMMKV(...)");
        return M.getBoolean("screen_project_has_been_educated", false);
    }

    public static final int c(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.plugin.multitalk.model.e3.Ri().f150177t == null) {
            return -1;
        }
        com.tencent.mm.plugin.multitalk.model.e3.Ri().f150177t.getClass();
        com.tencent.mm.plugin.multitalk.ilinkservice.w b17 = com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.f149623f.b(str);
        if (b17 != null) {
            return b17.f149840a;
        }
        return -1;
    }

    public static final java.lang.String d() {
        java.lang.String b17 = f473337a.b();
        if (com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
            return null;
        }
        try {
            return new cl0.g(b17).optString("talking");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MultitalkUtils", e17, "getMulitalkMemberListSizeWording error", new java.lang.Object[0]);
            return null;
        }
    }

    public static final int e() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_multitalk_max_limited_number, 15);
    }

    public static final boolean g() {
        bm5.o1 o1Var = bm5.o1.f22719a;
        bm5.h0 h0Var = bm5.h0.RepairerConfig_MultiTalk_GlRender_Int;
        boolean z17 = (o1Var.g(h0Var, -1) == -1 ? ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_multitalk_use_new_render, 0) : o1Var.g(h0Var, -1)) == 1;
        boolean h17 = h();
        com.tencent.mars.xlog.Log.i("MicroMsg.MultitalkUtils", "useNewRender: " + z17 + ", useNewView: " + h17);
        return z17 || h17;
    }

    public static final boolean h() {
        bm5.o1 o1Var = bm5.o1.f22719a;
        bm5.h0 h0Var = bm5.h0.RepairerConfig_MultiTalk_NewView_Int;
        boolean z17 = (o1Var.g(h0Var, -1) == -1 ? ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_multitalk_use_new_view, 1) : o1Var.g(h0Var, -1)) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.MultitalkUtils", "useNewView: " + z17);
        return z17;
    }

    public final java.lang.String b() {
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_multitalk_navpop_wording, "", true);
        if (com.tencent.mm.sdk.platformtools.t8.K0(Zi)) {
            return null;
        }
        try {
            cl0.g gVar = new cl0.g(Zi);
            java.lang.String d17 = com.tencent.mm.sdk.platformtools.m2.d();
            com.tencent.mars.xlog.Log.i("MicroMsg.MultitalkUtils", "getMultitalkNavpopWording, langCode:%s", d17);
            return gVar.optString(d17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MultitalkUtils", e17, "getMultitalkNavpopWording error", new java.lang.Object[0]);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String f(android.content.Context r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.g(r10, r0)
            java.lang.String r0 = "nickName"
            kotlin.jvm.internal.o.g(r11, r0)
            java.lang.String r0 = r9.b()
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            r2 = 0
            if (r1 != 0) goto L2b
            cl0.g r1 = new cl0.g     // Catch: java.lang.Exception -> L21
            r1.<init>(r0)     // Catch: java.lang.Exception -> L21
            java.lang.String r0 = "screen_cast_title"
            java.lang.String r0 = r1.optString(r0)     // Catch: java.lang.Exception -> L21
            goto L2c
        L21:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r3 = "MicroMsg.MultitalkUtils"
            java.lang.String r4 = "getMultitalkWaitingAcceptWording error"
            com.tencent.mars.xlog.Log.printErrStackTrace(r3, r0, r4, r1)
        L2b:
            r0 = 0
        L2c:
            if (r0 != 0) goto L3a
            r0 = 2131774863(0x7f104d8f, float:1.9181154E38)
            java.lang.String r0 = r10.getString(r0)
            java.lang.String r1 = "getString(...)"
            kotlin.jvm.internal.o.f(r0, r1)
        L3a:
            int r1 = r0.length()
            java.lang.String r3 = "substring(...)"
            r4 = 3
            if (r1 < r4) goto L4b
            java.lang.String r1 = r0.substring(r2, r4)
            kotlin.jvm.internal.o.f(r1, r3)
            goto L4c
        L4b:
            r1 = r0
        L4c:
            com.tencent.mm.ui.ah r4 = com.tencent.mm.ui.bh.a(r10)
            r5 = 112(0x70, float:1.57E-43)
            int r5 = i65.a.b(r10, r5)
            android.content.res.Resources r6 = r10.getResources()
            r7 = 2131167692(0x7f0709cc, float:1.7949665E38)
            float r6 = r6.getDimension(r7)
            int r10 = i65.a.a(r10, r6)
            float r10 = (float) r10
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>()
            r7.setTextSize(r10)
            int r8 = r1.length()
            r7.getTextBounds(r1, r2, r8, r6)
            int r1 = r6.width()
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>()
            r7.setTextSize(r10)
            int r10 = r11.length()
            r7.getTextBounds(r11, r2, r10, r6)
            int r10 = r6.width()
            int r6 = r1 + r10
            int r6 = r6 + r5
            java.lang.String r7 = "format(...)"
            r8 = 1
            int r4 = r4.f197135a
            if (r6 <= r4) goto Le2
            if (r10 != 0) goto La3
            goto Le2
        La3:
            int r4 = r4 - r5
            int r4 = r4 - r1
            float r1 = (float) r4
            float r10 = (float) r10
            float r1 = r1 / r10
            int r10 = r11.length()
            float r10 = (float) r10
            float r1 = r1 * r10
            float r10 = (float) r8
            float r1 = r1 - r10
            int r10 = (int) r1
            if (r10 > 0) goto Lc5
            java.lang.String r10 = ""
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r8)
            java.lang.String r10 = java.lang.String.format(r0, r10)
            kotlin.jvm.internal.o.f(r10, r7)
            return r10
        Lc5:
            java.lang.String r10 = r11.substring(r2, r10)
            kotlin.jvm.internal.o.f(r10, r3)
            java.lang.String r11 = "..."
            java.lang.String r10 = r10.concat(r11)
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r8)
            java.lang.String r10 = java.lang.String.format(r0, r10)
            kotlin.jvm.internal.o.f(r10, r7)
            return r10
        Le2:
            java.lang.Object[] r10 = new java.lang.Object[]{r11}
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r8)
            java.lang.String r10 = java.lang.String.format(r0, r10)
            kotlin.jvm.internal.o.f(r10, r7)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: zj3.j.f(android.content.Context, java.lang.String):java.lang.String");
    }
}

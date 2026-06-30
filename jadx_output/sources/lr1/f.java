package lr1;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final lr1.f f320657a = new lr1.f();

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.sdk.platformtools.o4 f320658b;

    public final void a(java.lang.String url, int i17) {
        kotlin.jvm.internal.o.g(url, "url");
        if (b(url)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizPayLogic", "appMsgPaySuccess url=" + url + ", itemShowType=" + i17);
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94435a.l(url);
        e(url, true);
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.b(url, i17, 90, "", new java.lang.Object[0]);
        com.tencent.mm.autogen.events.AppMsgRelatedInfoUpdateEvent appMsgRelatedInfoUpdateEvent = new com.tencent.mm.autogen.events.AppMsgRelatedInfoUpdateEvent();
        appMsgRelatedInfoUpdateEvent.f53989g.getClass();
        appMsgRelatedInfoUpdateEvent.b(android.os.Looper.getMainLooper());
    }

    public final boolean b(java.lang.String str) {
        return str != null && d().o(lr1.c0.f320643a.b(str), 0) == 1;
    }

    public final void c(java.util.Map values) {
        kotlin.jvm.internal.o.g(values, "values");
        java.lang.String str = (java.lang.String) values.get(".sysmsg.MMBizPaySubscribePayNotify.AppmsgUrl");
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) values.get(".sysmsg.MMBizPaySubscribePayNotify.ItemShowType"), -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizPayLogic", "onPaySuccessNotify url=" + str + ", itemShowType=" + P);
        if (str == null || P <= -1) {
            return;
        }
        a(str, P);
    }

    public final com.tencent.mm.sdk.platformtools.o4 d() {
        com.tencent.mm.sdk.platformtools.o4 o4Var = f320658b;
        if (o4Var != null) {
            kotlin.jvm.internal.o.e(o4Var, "null cannot be cast to non-null type com.tencent.mm.sdk.platformtools.MultiProcessMMKV");
            return o4Var;
        }
        com.tencent.mm.sdk.platformtools.o4 N = com.tencent.mm.sdk.platformtools.o4.N("appMsgPay_" + (com.tencent.mm.sdk.platformtools.x2.n() ? gm0.j1.b().h() : gm0.m.i()), 2, null);
        f320658b = N;
        kotlin.jvm.internal.o.e(N, "null cannot be cast to non-null type com.tencent.mm.sdk.platformtools.MultiProcessMMKV");
        return N;
    }

    public final void e(java.lang.String url, boolean z17) {
        kotlin.jvm.internal.o.g(url, "url");
        java.lang.String b17 = lr1.c0.f320643a.b(url);
        if (z17) {
            d().A(b17, 1);
        } else {
            d().remove(b17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.lang.CharSequence r11, com.tencent.mm.ui.widget.MMNeat7extView r12, boolean r13, java.lang.String r14, int r15) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lr1.f.f(java.lang.CharSequence, com.tencent.mm.ui.widget.MMNeat7extView, boolean, java.lang.String, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r11.I == 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(java.lang.String r9, com.tencent.mm.ui.widget.MMNeat7extView r10, ot0.s0 r11, int r12) {
        /*
            r8 = this;
            java.lang.String r0 = "text"
            kotlin.jvm.internal.o.g(r9, r0)
            java.lang.String r0 = "titleTv"
            kotlin.jvm.internal.o.g(r10, r0)
            java.lang.String r0 = "item"
            kotlin.jvm.internal.o.g(r11, r0)
            int r0 = r11.f348770o
            if (r0 != 0) goto L1b
            int r0 = r11.I
            r1 = 1
            if (r0 != r1) goto L1b
            goto L1c
        L1b:
            r1 = 0
        L1c:
            java.lang.Class<le0.x> r0 = le0.x.class
            i95.m r0 = i95.n0.c(r0)
            le0.x r0 = (le0.x) r0
            android.content.Context r2 = r10.getContext()
            ke0.e r0 = (ke0.e) r0
            r0.getClass()
            android.text.SpannableString r3 = com.tencent.mm.pluginsdk.ui.span.c0.i(r2, r9)
            java.lang.String r6 = r11.f348762e
            r2 = r8
            r4 = r10
            r5 = r1
            r7 = r12
            r2.f(r3, r4, r5, r6, r7)
            r9 = 2131298580(0x7f090914, float:1.8215137E38)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r1)
            r10.setTag(r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lr1.f.g(java.lang.String, com.tencent.mm.ui.widget.MMNeat7extView, ot0.s0, int):void");
    }
}

package dd4;

/* loaded from: classes4.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public xc4.p f228990a;

    /* renamed from: b, reason: collision with root package name */
    public dd4.t0 f228991b;

    /* renamed from: c, reason: collision with root package name */
    public android.content.Context f228992c;

    /* renamed from: d, reason: collision with root package name */
    public kotlinx.coroutines.r2 f228993d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$menuEventListener$1 f228994e;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$menuEventListener$1] */
    public e0() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f228994e = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsVideoMenuEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$menuEventListener$1
            {
                this.__eventId = 413312424;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsVideoMenuEvent snsVideoMenuEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$menuEventListener$1");
                com.tencent.mm.autogen.events.SnsVideoMenuEvent event = snsVideoMenuEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$menuEventListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                am.ix ixVar = event.f54852g;
                int i17 = ixVar.f6980a;
                java.lang.String str = ixVar.f6983d;
                dd4.e0 e0Var = dd4.e0.this;
                xc4.p a17 = dd4.e0.a(e0Var);
                java.lang.String W0 = a17 != null ? a17.W0() : null;
                boolean z17 = false;
                if (com.tencent.mm.sdk.platformtools.t8.D0(str, W0)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FlexibleShareHelper", hashCode() + " menu local id[" + str + " cur:" + W0 + " opcode:" + i17 + ' ');
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getJob$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper");
                    kotlinx.coroutines.r2 r2Var = e0Var.f228993d;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getJob$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper");
                    if (r2Var != null && r2Var.a()) {
                        z17 = true;
                    }
                    if (z17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.FlexibleShareHelper", "repeat job,ignore");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$menuEventListener$1");
                    } else {
                        kotlinx.coroutines.r2 d17 = kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new dd4.a0(event, e0Var, null), 3, null);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setJob$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper");
                        e0Var.f228993d = d17;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setJob$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$menuEventListener$1");
                    }
                    z17 = true;
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$menuEventListener$1");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$menuEventListener$1");
                return z17;
            }
        };
    }

    public static final /* synthetic */ xc4.p a(dd4.e0 e0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getInfo$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper");
        xc4.p pVar = e0Var.f228990a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getInfo$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper");
        return pVar;
    }

    public final java.lang.Object b(int i17, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleResourceDownload", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper");
        xc4.p pVar = this.f228990a;
        if (pVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleResourceDownload", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper");
            return "";
        }
        java.lang.Object c17 = c(i17, pVar.R0(), continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleResourceDownload", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper");
        return c17;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(int r9, r45.jj4 r10, kotlin.coroutines.Continuation r11) {
        /*
            r8 = this;
            java.lang.String r0 = "handleResourceDownload"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r11 instanceof dd4.z
            if (r2 == 0) goto L1b
            r2 = r11
            dd4.z r2 = (dd4.z) r2
            int r3 = r2.f229080f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.f229080f = r3
            goto L20
        L1b:
            dd4.z r2 = new dd4.z
            r2.<init>(r8, r11)
        L20:
            java.lang.Object r11 = r2.f229078d
            pz5.a r3 = pz5.a.f359186d
            int r4 = r2.f229080f
            java.lang.String r5 = ""
            r6 = 1
            java.lang.String r7 = "MicroMsg.FlexibleShareHelper"
            if (r4 == 0) goto L3e
            if (r4 != r6) goto L33
            kotlin.ResultKt.throwOnFailure(r11)
            goto L84
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r9
        L3e:
            kotlin.ResultKt.throwOnFailure(r11)
            xc4.p r11 = r8.f228990a
            if (r11 != 0) goto L49
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r5
        L49:
            java.lang.String r11 = r11.W0()
            java.lang.String r10 = com.tencent.mm.plugin.sns.model.y6.o(r11, r10)
            boolean r11 = com.tencent.mm.vfs.w6.j(r10)
            if (r11 == 0) goto L6c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r11 = "fileExists:"
            r9.<init>(r11)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.mars.xlog.Log.i(r7, r9)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r10
        L6c:
            java.lang.String r10 = "requestFullDownload start"
            com.tencent.mars.xlog.Log.i(r7, r10)
            dd4.t0 r10 = r8.f228991b
            if (r10 == 0) goto L87
            r2.f229080f = r6
            com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView r10 = (com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView) r10
            java.lang.Object r11 = r10.t(r9, r2)
            if (r11 != r3) goto L84
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        L84:
            java.lang.String r11 = (java.lang.String) r11
            goto L88
        L87:
            r11 = 0
        L88:
            java.lang.String r9 = "requestFullDownload finish"
            com.tencent.mars.xlog.Log.i(r7, r9)
            boolean r9 = com.tencent.mm.vfs.w6.j(r11)
            if (r9 != 0) goto Lac
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r11)
            java.lang.String r10 = " file not exist!"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.mars.xlog.Log.e(r7, r9)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r5
        Lac:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: dd4.e0.c(int, r45.jj4, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void d(android.content.Context context, dd4.t0 downloader, xc4.p info) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("prepare", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(downloader, "downloader");
        kotlin.jvm.internal.o.g(info, "info");
        this.f228990a = info;
        this.f228992c = context;
        this.f228991b = downloader;
        alive();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prepare", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper");
    }

    public final void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("release", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper");
        dead();
        this.f228990a = null;
        this.f228992c = null;
        this.f228991b = null;
        kotlinx.coroutines.r2 r2Var = this.f228993d;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f228993d = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("release", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper");
    }
}

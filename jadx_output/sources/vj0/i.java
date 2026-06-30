package vj0;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final vj0.i f437649a = new vj0.i();

    /* renamed from: b, reason: collision with root package name */
    public static w15.a f437650b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mm.sdk.event.IListener f437651c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.sdk.event.IListener f437652d;

    static {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        f437651c = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WebViewExWindowCloseEvent>(a0Var) { // from class: com.tencent.mm.guidance.CommonLiteAppGuidanceManager$exWindowCloseEventIListener$1
            {
                this.__eventId = 1684674094;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x008c, code lost:
            
                if (r5 == null) goto L18;
             */
            @Override // com.tencent.mm.sdk.event.IListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean callback(com.tencent.mm.autogen.events.WebViewExWindowCloseEvent r10) {
                /*
                    r9 = this;
                    com.tencent.mm.autogen.events.WebViewExWindowCloseEvent r10 = (com.tencent.mm.autogen.events.WebViewExWindowCloseEvent) r10
                    java.lang.String r0 = "event"
                    kotlin.jvm.internal.o.g(r10, r0)
                    am.l20 r0 = r10.f54984g
                    java.lang.String r0 = r0.f7220a
                    java.lang.String r1 = "escape_common_lite_app_guidance"
                    boolean r0 = kotlin.jvm.internal.o.b(r0, r1)
                    r1 = 0
                    if (r0 == 0) goto L96
                    vj0.i r0 = vj0.i.f437649a
                    w15.a r2 = vj0.i.f437650b
                    java.lang.String r3 = "MicroMsg.CommonLiteAppGuidanceManager"
                    if (r2 == 0) goto L8e
                    java.lang.String r4 = r2.l()
                    java.lang.String r5 = "yes"
                    boolean r4 = kotlin.jvm.internal.o.b(r4, r5)
                    r5 = 0
                    if (r4 == 0) goto L51
                    android.content.Context r4 = com.tencent.mm.sdk.platformtools.x2.f193071a
                    r6 = 2131756063(0x7f10041f, float:1.9143023E38)
                    java.lang.String r6 = r4.getString(r6)
                    vj0.e r7 = vj0.e.f437645d
                    com.tencent.mm.ui.widget.dialog.u3 r4 = com.tencent.mm.ui.widget.dialog.u3.c(r4, r6, r1, r1, r7)
                    r4.show()
                    gm0.m r6 = gm0.j1.b()
                    gm0.b r6 = r6.f273245h
                    com.tencent.mm.sdk.coroutines.LifecycleScope r6 = r6.f273145e
                    if (r6 == 0) goto L8c
                    vj0.d r7 = new vj0.d
                    r7.<init>(r2, r10, r4, r5)
                    r2 = 1
                    kotlinx.coroutines.r2 r5 = v65.i.b(r6, r5, r7, r2, r5)
                    goto L8c
                L51:
                    java.lang.String r4 = "closeWindow !isSyncEscape"
                    com.tencent.mars.xlog.Log.e(r3, r4)
                    r0.a(r10)
                    n61.c r4 = new n61.c
                    int r6 = r2.j()
                    gm0.b0 r7 = gm0.j1.u()
                    com.tencent.mm.storage.n3 r7 = r7.c()
                    r8 = 274436(0x43004, float:3.84567E-40)
                    java.lang.Object r7 = r7.l(r8, r5)
                    boolean r8 = r7 instanceof java.lang.String
                    if (r8 == 0) goto L75
                    r5 = r7
                    java.lang.String r5 = (java.lang.String) r5
                L75:
                    if (r5 != 0) goto L79
                    java.lang.String r5 = ""
                L79:
                    java.lang.String r2 = r2.getScene()
                    r4.<init>(r6, r5, r2)
                    com.tencent.mm.modelbase.r1 r2 = gm0.j1.d()
                    boolean r2 = r2.h(r4, r1)
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
                L8c:
                    if (r5 != 0) goto L96
                L8e:
                    java.lang.String r2 = "closeWindow without lastInfo"
                    com.tencent.mars.xlog.Log.e(r3, r2)
                    r0.a(r10)
                L96:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.guidance.CommonLiteAppGuidanceManager$exWindowCloseEventIListener$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        f437652d = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LiteAppLifeCycleEvent>(a0Var) { // from class: com.tencent.mm.guidance.CommonLiteAppGuidanceManager$liteAppWindowCloseEventIListener$1
            {
                this.__eventId = 1907495603;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.LiteAppLifeCycleEvent liteAppLifeCycleEvent) {
                com.tencent.mm.autogen.events.LiteAppLifeCycleEvent event = liteAppLifeCycleEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.ri riVar = event.f54468g;
                if (riVar.f7817a != 3) {
                    return false;
                }
                java.lang.String str = riVar.f7819c;
                w15.a aVar = vj0.i.f437650b;
                if (!com.tencent.mm.sdk.platformtools.t8.D0(str, aVar != null ? aVar.getAppid() : null)) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.CommonLiteAppGuidanceManager", "closeLiteApp");
                vj0.i iVar = vj0.i.f437649a;
                com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193054b, null, v45.c.class, vj0.b.f437638d);
                return false;
            }
        };
    }

    public final void a(com.tencent.mm.autogen.events.WebViewExWindowCloseEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        java.lang.Object obj = event.f54984g.f7221b.get("liteAppUuid");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        long parseLong = str != null ? java.lang.Long.parseLong(str) : 0L;
        com.tencent.mars.xlog.Log.i("MicroMsg.CommonLiteAppGuidanceManager", "NEXT_ESCAPE_COMMON_LITE_APP_GUIDANCE, liteAppUuid=" + parseLong);
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        android.content.Intent intent = new android.content.Intent();
        ((com.tencent.mm.feature.lite.i) g0Var).getClass();
        com.tencent.mm.plugin.lite.LiteAppCenter.closeWindow(parseLong, intent);
    }
}

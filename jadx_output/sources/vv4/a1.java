package vv4;

/* loaded from: classes12.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI f440444d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI webSearchSnsImageLoadingUI) {
        super(0);
        this.f440444d = webSearchSnsImageLoadingUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        final com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI webSearchSnsImageLoadingUI = this.f440444d;
        return new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsImageDownloadedEvent>(a0Var) { // from class: com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI$snsImageDownloadListener$2$1
            {
                this.__eventId = -1231290816;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
            /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
            @Override // com.tencent.mm.sdk.event.IListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean callback(com.tencent.mm.autogen.events.SnsImageDownloadedEvent r7) {
                /*
                    r6 = this;
                    com.tencent.mm.autogen.events.SnsImageDownloadedEvent r7 = (com.tencent.mm.autogen.events.SnsImageDownloadedEvent) r7
                    java.lang.String r0 = "event"
                    kotlin.jvm.internal.o.g(r7, r0)
                    am.yv r0 = r7.f54816g
                    int r1 = r0.f8481a
                    r2 = 0
                    r3 = 5
                    r4 = 0
                    com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI r5 = com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI.this
                    if (r1 != r3) goto L24
                    java.lang.String r0 = r0.f8483c
                    r45.jj4 r1 = r5.f181675o
                    if (r1 == 0) goto L1b
                    java.lang.String r1 = r1.f377855d
                    goto L1c
                L1b:
                    r1 = r4
                L1c:
                    boolean r0 = kotlin.jvm.internal.o.b(r0, r1)
                    if (r0 == 0) goto L24
                    r0 = 1
                    goto L25
                L24:
                    r0 = r2
                L25:
                    if (r0 == 0) goto L28
                    goto L29
                L28:
                    r7 = r4
                L29:
                    if (r7 == 0) goto L52
                    java.lang.String r0 = r5.f181667d
                    am.yv r7 = r7.f54816g
                    java.lang.String r7 = r7.f8483c
                    java.lang.String r1 = "[image-flow]"
                    java.lang.Object[] r7 = new java.lang.Object[]{r1, r7}
                    java.lang.String r1 = "[%s][media:%s]snsImageDownloadListener invoke "
                    com.tencent.mars.xlog.Log.i(r0, r1, r7)
                    java.lang.String r7 = r5.f181676p
                    boolean r7 = com.tencent.mm.vfs.w6.j(r7)
                    if (r7 == 0) goto L4a
                    java.lang.String r7 = r5.f181676p
                    r5.U6(r7)
                    goto L52
                L4a:
                    vv4.z0 r7 = new vv4.z0
                    r7.<init>(r5)
                    pm0.v.X(r7)
                L52:
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI$snsImageDownloadListener$2$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
    }
}

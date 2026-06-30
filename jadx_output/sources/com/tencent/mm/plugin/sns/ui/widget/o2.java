package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public final class o2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f171241d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f171242e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f171243f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.m f171244g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, boolean z17, int i17, com.tencent.mm.plugin.sns.ui.widget.m mVar) {
        super(2);
        this.f171241d = snsInfo;
        this.f171242e = z17;
        this.f171243f = i17;
        this.f171244g = mVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0084, code lost:
    
        if (r13 < 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0090, code lost:
    
        r9 = (yd4.d[]) r9.getSpans(r13, r9.length(), yd4.d.class);
        kotlin.jvm.internal.o.d(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a1, code lost:
    
        if (r9.length != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a3, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a7, code lost:
    
        if ((!r10) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a9, code lost:
    
        r9 = kz5.z.L(r9);
        kotlin.jvm.internal.o.e(r9, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.view.VerticalAlignAlphaImageSpan");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRect", "com.tencent.mm.plugin.sns.ui.view.VerticalAlignAlphaImageSpan");
        r9 = ((yd4.d) r9).f461085g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRect", "com.tencent.mm.plugin.sns.ui.view.VerticalAlignAlphaImageSpan");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c1, code lost:
    
        if (r9 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c3, code lost:
    
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openImageBrowseUI", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c7, code lost:
    
        r10 = new int[2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cd, code lost:
    
        if (com.tencent.mm.ui.bk.y() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cf, code lost:
    
        r3.getLocationOnScreen(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d6, code lost:
    
        r12 = r4.A;
        kotlin.jvm.internal.o.f(r12, "SnsCommentImageInfo");
        r12 = (r45.d86) kz5.n0.X(r12);
        r15 = r12.f372239t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e5, code lost:
    
        if (r15 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00eb, code lost:
    
        if (r15.length() != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ee, code lost:
    
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f1, code lost:
    
        if (r15 == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f3, code lost:
    
        r12 = r12.f372226d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f5, code lost:
    
        if (r12 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fb, code lost:
    
        if (r12.length() != 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fe, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0101, code lost:
    
        if (r12 == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0103, code lost:
    
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openImageBrowseUI", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0100, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010c, code lost:
    
        r12 = r4.A;
        kotlin.jvm.internal.o.f(r12, "SnsCommentImageInfo");
        r12 = kz5.n0.X(r12);
        kotlin.jvm.internal.o.f(r12, "first(...)");
        r12 = r5.s((r45.d86) r12);
        r13 = r28.f171241d;
        r16 = "invoke";
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0129, code lost:
    
        if (r28.f171242e == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012b, code lost:
    
        r11 = r5.j(r28.f171243f);
        r5.p(false, r13, r4, r11);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentMediaLoadManager", "openImageBrowseUI >> id: " + r12.f377855d + " url: " + r12.f377858g + " pageSource: " + r11);
        r3 = r3.getContext();
        kotlin.jvm.internal.o.e(r3, "null cannot be cast to non-null type android.app.Activity");
        r5 = new com.tencent.mm.plugin.sns.ui.kj((android.app.Activity) r3);
        r1 = new int[]{((int) r9.left) + r10[0], ((int) r9.top) + r10[1]};
        r3 = (int) r9.width();
        r9 = (int) r9.height();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("openCommentImagesFlow", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.SnsImageDialogShowerMgr", "openCommentImagesFlow", new java.lang.Object[0]);
        gm0.j1.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01a2, code lost:
    
        if (gm0.j1.u().l() != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01a4, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.SnsImageDialogShowerMgr", "[openCommentImagesFlow] isSDCardAvailable:false");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openCommentImagesFlow", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x02e6, code lost:
    
        r17 = "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager$handleCommentImage$1";
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01ae, code lost:
    
        r14 = new android.content.Intent();
        r17 = "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager$handleCommentImage$1";
        r14.putExtra("key_from_scene", 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01c1, code lost:
    
        r14.putExtra("k_comments_arr", 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0290, code lost:
    
        r17 = "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager$handleCommentImage$1";
        r2 = r3.getContext();
        kotlin.jvm.internal.o.e(r2, "null cannot be cast to non-null type android.app.Activity");
        r0 = new com.tencent.mm.plugin.sns.ui.kj((android.app.Activity) r2);
        r19 = r13.getSnsId();
        r1 = r4.A;
        kotlin.jvm.internal.o.f(r1, "SnsCommentImageInfo");
        r1 = kz5.n0.X(r1);
        kotlin.jvm.internal.o.f(r1, "first(...)");
        r0.b(r19, r5.s((r45.d86) r1), r4.f373126d, 0, -1, new int[]{((int) r9.left) + r10[0], ((int) r9.top) + r10[1]}, (int) r9.width(), (int) r9.height());
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f0, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d3, code lost:
    
        r3.getLocationInWindow(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x02e4, code lost:
    
        r16 = "invoke";
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00a5, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x008f, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x008d, code lost:
    
        if (r13 < 0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x02f4  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // yz5.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r29, java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.widget.o2.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}

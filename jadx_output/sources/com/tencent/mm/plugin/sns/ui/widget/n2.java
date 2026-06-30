package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public final class n2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f171233d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.m f171234e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(java.lang.String str, com.tencent.mm.plugin.sns.ui.widget.m mVar) {
        super(2);
        this.f171233d = str;
        this.f171234e = mVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
    
        if (r12 < 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0091, code lost:
    
        r8 = (yd4.d[]) r8.getSpans(r12, r8.length(), yd4.d.class);
        kotlin.jvm.internal.o.d(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a2, code lost:
    
        if (r8.length != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a4, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a8, code lost:
    
        if ((!r9) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00aa, code lost:
    
        r8 = kz5.z.L(r8);
        kotlin.jvm.internal.o.e(r8, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.view.VerticalAlignAlphaImageSpan");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRect", "com.tencent.mm.plugin.sns.ui.view.VerticalAlignAlphaImageSpan");
        r8 = ((yd4.d) r8).f461085g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRect", "com.tencent.mm.plugin.sns.ui.view.VerticalAlignAlphaImageSpan");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c2, code lost:
    
        if (r8 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c4, code lost:
    
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openEmoticonDetailUI", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c9, code lost:
    
        r9 = new int[2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cf, code lost:
    
        if (com.tencent.mm.ui.bk.y() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d1, code lost:
    
        r3.getLocationOnScreen(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d8, code lost:
    
        r10 = new android.content.Intent();
        r13 = com.tencent.mm.plugin.sns.ui.widget.x1.f171306a.f(ca4.z0.F0(r20.f171233d), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e9, code lost:
    
        if (r13 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00eb, code lost:
    
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openEmoticonDetailUI", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f0, code lost:
    
        r10.putExtra("IntentKeyEmojiMd5", r13.f379230d);
        r10.putExtra("IntentKeyEmojiBuffer", r13.f379231e.f371841f.f192156a);
        r13 = (int) (r8.left + r9[0]);
        r9 = (int) (r8.top + r9[1]);
        r10.putExtra("IntentKeyThumbLocation", new android.graphics.Rect(r13, r9, ((int) r8.width()) + r13, ((int) r8.height()) + r9));
        r10.setClass(r3.getContext(), com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI.class);
        r3 = r3.getContext();
        r8 = new java.util.ArrayList();
        r8.add(r10);
        java.util.Collections.reverse(r8);
        yj0.a.d(r3, r8.toArray(), "com/tencent/mm/plugin/sns/ui/widget/SnsCommentMediaLoadManager", "openEmoticonDetailUI", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/SnsCommentInfo;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        r3.startActivity((android.content.Intent) r8.get(0));
        yj0.a.f(r3, "com/tencent/mm/plugin/sns/ui/widget/SnsCommentMediaLoadManager", "openEmoticonDetailUI", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/SnsCommentInfo;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d5, code lost:
    
        r3.getLocationInWindow(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x016e, code lost:
    
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openEmoticonDetailUI", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a6, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0090, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008e, code lost:
    
        if (r12 < 0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    @Override // yz5.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r21, java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.widget.n2.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}

package in4;

/* loaded from: classes8.dex */
public class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f292992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog f292993e;

    public t(com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog topStoryCommentFloatDialog, com.tencent.mm.ui.MMActivity mMActivity) {
        this.f292993e = topStoryCommentFloatDialog;
        this.f292992d = mMActivity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0087, code lost:
    
        if (r5 != 6) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008a, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0099, code lost:
    
        if (r5 != 6) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.view.View r13) {
        /*
            r12 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/topstory/ui/widget/TopStoryCommentFloatDialog$2"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r13)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r12
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            long r0 = java.lang.System.currentTimeMillis()
            com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog r13 = r12.f292993e
            long r2 = r13.f175264o
            long r0 = r0 - r2
            r2 = 500(0x1f4, double:2.47E-321)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            java.lang.String r1 = "(Landroid/view/View;)V"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "android/view/View$OnClickListener"
            java.lang.String r4 = "com/tencent/mm/plugin/topstory/ui/widget/TopStoryCommentFloatDialog$2"
            if (r0 >= 0) goto L38
            yj0.a.h(r12, r4, r3, r2, r1)
            return
        L38:
            long r5 = java.lang.System.currentTimeMillis()
            r13.f175264o = r5
            com.tencent.mm.plugin.sns.ui.SnsEditText r0 = r13.f175259g
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            int r5 = r0.length()
            r6 = 200(0xc8, float:2.8E-43)
            if (r5 <= r6) goto L54
            yj0.a.h(r12, r4, r3, r2, r1)
            return
        L54:
            int r5 = r0.length()
            if (r5 <= 0) goto Ldf
            java.lang.String r5 = r0.trim()
            int r5 = r5.length()
            if (r5 > 0) goto L66
            goto Ldf
        L66:
            r13.getClass()
            gm0.a0 r5 = gm0.j1.p()
            km0.b r5 = r5.a()
            km0.c r5 = (km0.c) r5
            boolean r5 = r5.a()
            r6 = 1
            r7 = 4
            r8 = 0
            r9 = 6
            if (r5 == 0) goto L8c
            com.tencent.mm.modelbase.r1 r5 = gm0.j1.d()
            int r5 = r5.n()
            if (r5 == r7) goto L9b
            if (r5 != r9) goto L8a
            goto L9b
        L8a:
            r6 = r8
            goto L9b
        L8c:
            android.content.Context r5 = com.tencent.mm.sdk.platformtools.x2.f193071a
            boolean r5 = com.tencent.mars.comm.NetStatusUtil.isConnected(r5)
            if (r5 == 0) goto L96
            r5 = r9
            goto L97
        L96:
            r5 = r8
        L97:
            if (r5 == r7) goto L9b
            if (r5 != r9) goto L8a
        L9b:
            if (r6 != 0) goto Laf
            r13 = 2131756206(0x7f1004ae, float:1.9143313E38)
            com.tencent.mm.ui.MMActivity r0 = r12.f292992d
            java.lang.String r13 = r0.getString(r13)
            java.lang.String r5 = ""
            db5.e1.s(r0, r13, r5)
            yj0.a.h(r12, r4, r3, r2, r1)
            return
        Laf:
            com.tencent.mm.ui.MMActivity r6 = r12.f292992d
            java.lang.String r7 = ""
            r5 = 2131756284(0x7f1004fc, float:1.9143471E38)
            java.lang.String r8 = r6.getString(r5)
            r9 = 1
            r10 = 0
            r11 = 0
            com.tencent.mm.ui.widget.dialog.u3 r5 = db5.e1.Q(r6, r7, r8, r9, r10, r11)
            r13.f175262m = r5
            sm4.f r5 = new sm4.f
            sm4.f r13 = r13.f175265p
            r5.<init>(r13)
            com.tencent.mm.modelbase.o r13 = r5.f409938e
            com.tencent.mm.modelbase.m r13 = r13.f70710a
            com.tencent.mm.protobuf.f r13 = r13.f70684a
            r45.kn6 r13 = (r45.kn6) r13
            r13.f378864f = r0
            com.tencent.mm.modelbase.r1 r13 = gm0.j1.d()
            r13.g(r5)
            yj0.a.h(r12, r4, r3, r2, r1)
            return
        Ldf:
            yj0.a.h(r12, r4, r3, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in4.t.onClick(android.view.View):void");
    }
}

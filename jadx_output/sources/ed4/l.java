package ed4;

/* loaded from: classes4.dex */
public class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew f251313d;

    public l(com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew fullCardAdTimeLineItemNew) {
        this.f251313d = fullCardAdTimeLineItemNew;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006e A[Catch: Exception -> 0x007b, TryCatch #0 {Exception -> 0x007b, blocks: (B:3:0x002e, B:7:0x004b, B:10:0x006e, B:11:0x0071, B:20:0x0058, B:22:0x005e, B:23:0x0063), top: B:2:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009f  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.view.View r13) {
        /*
            r12 = this;
            com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew r0 = r12.f251313d
            java.lang.String r1 = "onClick"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$5"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            java.lang.String r3 = "com/tencent/mm/plugin/sns/ui/item/FullCardAdTimeLineItemNew$5"
            java.lang.String r4 = "android/view/View$OnClickListener"
            java.lang.String r5 = "onClick"
            java.lang.String r6 = "(Landroid/view/View;)V"
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r7.add(r13)
            java.lang.Object[] r8 = r7.toArray()
            r7.clear()
            r7 = r12
            yj0.a.b(r3, r4, r5, r6, r7, r8)
            java.lang.String r3 = "MicroMsg.FullCardAdTimeLineItemNew"
            java.lang.String r4 = "ProxyCardClickListener onClick"
            com.tencent.mars.xlog.Log.i(r3, r4)
            r4 = 1
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r0.f169314u     // Catch: java.lang.Exception -> L7b
            com.tencent.mm.plugin.sns.ui.item.y r6 = r0.f169311r     // Catch: java.lang.Exception -> L7b
            u74.d r6 = r6.D0     // Catch: java.lang.Exception -> L7b
            com.tencent.mm.plugin.sns.ui.bs r7 = r0.f169251h     // Catch: java.lang.Exception -> L7b
            com.tencent.mm.plugin.sns.ui.listener.i r7 = r7.f168039e     // Catch: java.lang.Exception -> L7b
            java.lang.String r8 = "createFullCardAdLandingPageJumpAnimInfo"
            java.lang.String r9 = "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r9)     // Catch: java.lang.Exception -> L7b
            e42.c0 r10 = e42.c0.clicfg_sns_full_card_ad_disable_jump_anim_info     // Catch: java.lang.Exception -> L7b
            r11 = 0
            int r10 = ca4.m0.u0(r10, r11)     // Catch: java.lang.Exception -> L7b
            if (r10 != r4) goto L49
            r11 = r4
        L49:
            if (r11 == 0) goto L56
            java.lang.String r5 = "ClickActionHelper"
            java.lang.String r6 = "disableJumpAnimInfo, do origin logic"
            com.tencent.mars.xlog.Log.i(r5, r6)     // Catch: java.lang.Exception -> L7b
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)     // Catch: java.lang.Exception -> L7b
            goto L61
        L56:
            if (r5 != 0) goto L5c
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)     // Catch: java.lang.Exception -> L7b
            goto L61
        L5c:
            if (r6 != 0) goto L63
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)     // Catch: java.lang.Exception -> L7b
        L61:
            r5 = 0
            goto L6c
        L63:
            l44.j4 r10 = new l44.j4     // Catch: java.lang.Exception -> L7b
            r10.<init>(r5, r6, r7)     // Catch: java.lang.Exception -> L7b
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)     // Catch: java.lang.Exception -> L7b
            r5 = r10
        L6c:
            if (r5 == 0) goto L71
            w64.x.k(r13, r5)     // Catch: java.lang.Exception -> L7b
        L71:
            com.tencent.mm.plugin.sns.ui.bs r5 = r0.f169251h     // Catch: java.lang.Exception -> L7b
            com.tencent.mm.plugin.sns.ui.listener.i r5 = r5.f168039e     // Catch: java.lang.Exception -> L7b
            android.view.View$OnClickListener r5 = r5.T     // Catch: java.lang.Exception -> L7b
            r5.onClick(r13)     // Catch: java.lang.Exception -> L7b
            goto L91
        L7b:
            r13 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "ProxyCardClickListener onClick, exp="
            r5.<init>(r6)
            java.lang.String r13 = r13.toString()
            r5.append(r13)
            java.lang.String r13 = r5.toString()
            com.tencent.mars.xlog.Log.e(r3, r13)
        L91:
            java.lang.String r13 = "access$000"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r3)
            boolean r5 = r0.f169313t
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r3)
            if (r5 == 0) goto La4
            com.tencent.mm.plugin.sns.storage.SnsInfo r13 = r0.f169314u
            com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView.e(r13, r4)
        La4:
            java.lang.String r13 = "(Landroid/view/View;)V"
            java.lang.String r0 = "com/tencent/mm/plugin/sns/ui/item/FullCardAdTimeLineItemNew$5"
            java.lang.String r3 = "android/view/View$OnClickListener"
            yj0.a.h(r12, r0, r3, r1, r13)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ed4.l.onClick(android.view.View):void");
    }
}

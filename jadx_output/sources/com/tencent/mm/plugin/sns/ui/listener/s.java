package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public class s extends com.tencent.mm.plugin.sns.ui.listener.h1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.i f169849d;

    public s(com.tencent.mm.plugin.sns.ui.listener.i iVar) {
        this.f169849d = iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
    
        if (r2 != 54) goto L19;
     */
    @Override // com.tencent.mm.plugin.sns.ui.listener.h1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.view.ContextMenu r7, android.view.View r8, android.view.ContextMenu.ContextMenuInfo r9) {
        /*
            r6 = this;
            java.lang.String r9 = "onMMCreateContextMenu"
            java.lang.String r0 = "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$17"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r0)
            java.lang.Object r1 = r8.getTag()
            boolean r2 = r1 instanceof com.tencent.mm.plugin.sns.ui.oj
            if (r2 == 0) goto L15
            com.tencent.mm.plugin.sns.ui.oj r1 = (com.tencent.mm.plugin.sns.ui.oj) r1
            java.lang.String r1 = r1.f170102a
            goto L1f
        L15:
            boolean r2 = r1 instanceof com.tencent.mm.plugin.sns.ui.i2
            if (r2 == 0) goto L1e
            com.tencent.mm.plugin.sns.ui.i2 r1 = (com.tencent.mm.plugin.sns.ui.i2) r1
            java.lang.String r1 = r1.f168550b
            goto L1f
        L1e:
            r1 = 0
        L1f:
            if (r1 == 0) goto L63
            com.tencent.mm.plugin.sns.storage.f2 r2 = com.tencent.mm.plugin.sns.model.l4.Fj()
            com.tencent.mm.plugin.sns.storage.SnsInfo r1 = r2.k1(r1)
            com.tencent.mm.protocal.protobuf.TimeLineObject r2 = r1.getTimeLine()
            java.lang.String r3 = "favorite"
            j45.l.g(r3)
            r45.a90 r2 = r2.ContentObj
            int r2 = r2.f369837e
            r3 = 1
            r4 = 2131773067(0x7f10468b, float:1.9177511E38)
            r5 = 0
            if (r2 == r3) goto L54
            r3 = 15
            if (r2 == r3) goto L46
            r3 = 54
            if (r2 == r3) goto L54
            goto L60
        L46:
            android.content.Context r8 = r8.getContext()
            java.lang.String r8 = r8.getString(r4)
            r2 = 10
            r7.add(r5, r2, r5, r8)
            goto L60
        L54:
            android.content.Context r8 = r8.getContext()
            java.lang.String r8 = r8.getString(r4)
            r2 = 2
            r7.add(r5, r2, r5, r8)
        L60:
            com.tencent.mm.plugin.sns.abtest.a.b(r7, r1)
        L63:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.listener.s.a(android.view.ContextMenu, android.view.View, android.view.ContextMenu$ContextMenuInfo):void");
    }

    @Override // com.tencent.mm.plugin.sns.ui.listener.h1
    public boolean b(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$17");
        java.lang.Object tag = view.getTag();
        java.lang.String str = tag instanceof com.tencent.mm.plugin.sns.ui.oj ? ((com.tencent.mm.plugin.sns.ui.oj) tag).f170102a : tag instanceof com.tencent.mm.plugin.sns.ui.i2 ? ((com.tencent.mm.plugin.sns.ui.i2) tag).f168550b : null;
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$17");
            return false;
        }
        this.f169849d.f169809l.e(view, str, com.tencent.mm.plugin.sns.model.l4.Fj().k1(str).getTimeLine());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$17");
        return true;
    }
}

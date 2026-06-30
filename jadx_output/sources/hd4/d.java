package hd4;

/* loaded from: classes4.dex */
public final class d implements com.tencent.mm.plugin.sns.ui.widget.w2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hd4.g f280567a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f280568b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s34.l0 f280569c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f280570d;

    public d(hd4.g gVar, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, s34.l0 l0Var, android.content.Context context) {
        this.f280567a = gVar;
        this.f280568b = snsInfo;
        this.f280569c = l0Var;
        this.f280570d = context;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.w2
    public void a() {
        com.tencent.mm.plugin.sns.ui.g9 g9Var;
        android.view.View view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent$enableGestureDraw$1");
        hd4.g gVar = this.f280567a;
        com.tencent.mars.xlog.Log.i(gVar.j(), "onClick");
        u74.d B = gVar.B();
        if (B != null && (g9Var = B.f425154o) != null && (view = g9Var.f168414d) != null) {
            view.performClick();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent$enableGestureDraw$1");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0 A[Catch: all -> 0x0141, TryCatch #0 {all -> 0x0141, blocks: (B:28:0x0081, B:30:0x00b0, B:32:0x00b9, B:34:0x00bf, B:36:0x00cc, B:38:0x013a, B:39:0x013d), top: B:27:0x0081 }] */
    @Override // com.tencent.mm.plugin.sns.ui.widget.w2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.util.List r20) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hd4.d.b(java.util.List):void");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.w2
    public void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGestureStart", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent$enableGestureDraw$1");
        com.tencent.mars.xlog.Log.i(this.f280567a.j(), "onGestureStart");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGestureStart", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent$enableGestureDraw$1");
    }
}

package u84;

/* loaded from: classes4.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f425638d;

    /* renamed from: e, reason: collision with root package name */
    public int f425639e;

    /* renamed from: f, reason: collision with root package name */
    public int f425640f;

    /* renamed from: g, reason: collision with root package name */
    public int f425641g;

    /* renamed from: h, reason: collision with root package name */
    public int f425642h;

    /* renamed from: i, reason: collision with root package name */
    public int f425643i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f425644m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Object f425645n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Object f425646o;

    /* renamed from: p, reason: collision with root package name */
    public int f425647p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f425648q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ u84.f0 f425649r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f425650s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(android.content.Context context, u84.f0 f0Var, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f425648q = context;
        this.f425649r = f0Var;
        this.f425650s = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarComponent$initHeadImageView$1$1");
        u84.p pVar = new u84.p(this.f425648q, this.f425649r, this.f425650s, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarComponent$initHeadImageView$1$1");
        return pVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarComponent$initHeadImageView$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarComponent$initHeadImageView$1$1");
        java.lang.Object invokeSuspend = ((u84.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarComponent$initHeadImageView$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarComponent$initHeadImageView$1$1");
        return invokeSuspend;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ee  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u84.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

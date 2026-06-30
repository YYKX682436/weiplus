package dd4;

/* loaded from: classes4.dex */
public final class m0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f229022d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f229023e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView f229024f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f229025g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f229026h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f229027i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(boolean z17, com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView, boolean z18, boolean z19, r45.jj4 jj4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f229023e = z17;
        this.f229024f = flexibleVideoView;
        this.f229025g = z18;
        this.f229026h = z19;
        this.f229027i = jj4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView$play$1");
        dd4.m0 m0Var = new dd4.m0(this.f229023e, this.f229024f, this.f229025g, this.f229026h, this.f229027i, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView$play$1");
        return m0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView$play$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView$play$1");
        java.lang.Object invokeSuspend = ((dd4.m0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView$play$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView$play$1");
        return invokeSuspend;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0106  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dd4.m0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

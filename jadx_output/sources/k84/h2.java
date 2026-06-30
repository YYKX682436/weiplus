package k84;

/* loaded from: classes4.dex */
public final class h2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f305050d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f305051e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k84.i2 f305052f;

    /* renamed from: g, reason: collision with root package name */
    public int f305053g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(k84.i2 i2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f305052f = i2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$6$1$1$emit$1");
        this.f305051e = obj;
        this.f305053g |= Integer.MIN_VALUE;
        java.lang.Object a17 = this.f305052f.a(null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$6$1$1$emit$1");
        return a17;
    }
}

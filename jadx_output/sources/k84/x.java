package k84;

/* loaded from: classes4.dex */
public final class x extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f305316d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f305317e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k84.y f305318f;

    /* renamed from: g, reason: collision with root package name */
    public int f305319g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(k84.y yVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f305318f = yVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindComponentModel$2$1$emit$1");
        this.f305317e = obj;
        this.f305319g |= Integer.MIN_VALUE;
        java.lang.Object a17 = this.f305318f.a(null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindComponentModel$2$1$emit$1");
        return a17;
    }
}

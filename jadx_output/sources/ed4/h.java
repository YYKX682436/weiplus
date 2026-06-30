package ed4;

/* loaded from: classes2.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f251299d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f251300e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f251301f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f251302g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.widget.ImageView imageView, long j17, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f251300e = imageView;
        this.f251301f = j17;
        this.f251302g = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$bindActivityIcon$1$1");
        ed4.h hVar = new ed4.h(this.f251300e, this.f251301f, this.f251302g, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$bindActivityIcon$1$1");
        return hVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$bindActivityIcon$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$bindActivityIcon$1$1");
        java.lang.Object invokeSuspend = ((ed4.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$bindActivityIcon$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$bindActivityIcon$1$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$bindActivityIcon$1$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f251299d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
            android.content.Context context = this.f251300e.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            long j17 = this.f251301f;
            java.lang.String str = this.f251302g;
            android.widget.ImageView imageView = this.f251300e;
            this.f251299d = 1;
            if (((com.tencent.mm.feature.finder.live.v4) w0Var).wj(context, j17, str, imageView, 3, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$bindActivityIcon$1$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$bindActivityIcon$1$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$bindActivityIcon$1$1");
        return f0Var;
    }
}

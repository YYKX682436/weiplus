package s74;

/* loaded from: classes4.dex */
public final class a3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f404205d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s74.b3 f404206e;

    /* renamed from: f, reason: collision with root package name */
    public int f404207f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(s74.b3 b3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f404206e = b3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicTemplateEventHelper$collect$1");
        this.f404205d = obj;
        this.f404207f |= Integer.MIN_VALUE;
        this.f404206e.a(null, this);
        pz5.a aVar = pz5.a.f359186d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicTemplateEventHelper$collect$1");
        return aVar;
    }
}

package qa4;

/* loaded from: classes4.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f361088d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qa4.h f361089e;

    /* renamed from: f, reason: collision with root package name */
    public int f361090f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(qa4.h hVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f361089e = hVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeGetPageOpImpl$getPage$1");
        this.f361088d = obj;
        this.f361090f |= Integer.MIN_VALUE;
        java.lang.Object a17 = this.f361089e.a(0L, 0, null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeGetPageOpImpl$getPage$1");
        return a17;
    }
}

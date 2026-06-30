package nb4;

/* loaded from: classes4.dex */
public final class f extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f336069d;

    /* renamed from: e, reason: collision with root package name */
    public int f336070e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nb4.g f336071f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(nb4.g gVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f336071f = gVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$invokeSuspend$$inlined$filter$1$2$1");
        this.f336069d = obj;
        this.f336070e |= Integer.MIN_VALUE;
        java.lang.Object emit = this.f336071f.emit(null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$invokeSuspend$$inlined$filter$1$2$1");
        return emit;
    }
}

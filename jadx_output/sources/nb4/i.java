package nb4;

/* loaded from: classes4.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f336076d;

    /* renamed from: e, reason: collision with root package name */
    public int f336077e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nb4.j f336078f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(nb4.j jVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f336078f = jVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$invokeSuspend$$inlined$map$1$2$1");
        this.f336076d = obj;
        this.f336077e |= Integer.MIN_VALUE;
        java.lang.Object emit = this.f336078f.emit(null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$invokeSuspend$$inlined$map$1$2$1");
        return emit;
    }
}

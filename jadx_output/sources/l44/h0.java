package l44;

/* loaded from: classes4.dex */
public final class h0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f316159d;

    /* renamed from: e, reason: collision with root package name */
    public int f316160e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l44.i0 f316161f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(l44.i0 i0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f316161f = i0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getAdCommentFlow$$inlined$filter$1$2$1");
        this.f316159d = obj;
        this.f316160e |= Integer.MIN_VALUE;
        java.lang.Object emit = this.f316161f.emit(null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getAdCommentFlow$$inlined$filter$1$2$1");
        return emit;
    }
}

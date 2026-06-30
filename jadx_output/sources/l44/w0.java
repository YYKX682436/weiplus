package l44;

/* loaded from: classes4.dex */
public final class w0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f316403d;

    /* renamed from: e, reason: collision with root package name */
    public int f316404e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l44.x0 f316405f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(l44.x0 x0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f316405f = x0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getAdLikedStateSingleTapFlow$$inlined$filter$1$2$1");
        this.f316403d = obj;
        this.f316404e |= Integer.MIN_VALUE;
        java.lang.Object emit = this.f316405f.emit(null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getAdLikedStateSingleTapFlow$$inlined$filter$1$2$1");
        return emit;
    }
}

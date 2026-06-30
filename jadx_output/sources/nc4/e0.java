package nc4;

/* loaded from: classes4.dex */
public final class e0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f336140d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f336141e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nc4.g0 f336142f;

    /* renamed from: g, reason: collision with root package name */
    public int f336143g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(nc4.g0 g0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f336142f = g0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.RecordEntrance$handleSelect$1");
        this.f336141e = obj;
        this.f336143g |= Integer.MIN_VALUE;
        java.lang.Object b17 = this.f336142f.b(null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.RecordEntrance$handleSelect$1");
        return b17;
    }
}

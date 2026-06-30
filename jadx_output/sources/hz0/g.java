package hz0;

/* loaded from: classes4.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f286259d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.backgroundwork.TemplateBackgroundWork f286260e;

    /* renamed from: f, reason: collision with root package name */
    public int f286261f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.mj_template.sns.backgroundwork.TemplateBackgroundWork templateBackgroundWork, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f286260e = templateBackgroundWork;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f286259d = obj;
        this.f286261f |= Integer.MIN_VALUE;
        return this.f286260e.h(this);
    }
}

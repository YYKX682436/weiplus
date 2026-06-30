package f93;

/* loaded from: classes11.dex */
public final class r extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f260442d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f260443e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f260444f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.AbsLabelUserDialog f260445g;

    /* renamed from: h, reason: collision with root package name */
    public int f260446h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.plugin.label.ui.AbsLabelUserDialog absLabelUserDialog, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f260445g = absLabelUserDialog;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f260444f = obj;
        this.f260446h |= Integer.MIN_VALUE;
        int i17 = com.tencent.mm.plugin.label.ui.AbsLabelUserDialog.K;
        return this.f260445g.N(0, this);
    }
}

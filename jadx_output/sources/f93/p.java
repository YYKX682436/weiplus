package f93;

/* loaded from: classes11.dex */
public final class p extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f260416d;

    /* renamed from: e, reason: collision with root package name */
    public int f260417e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f260418f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.AbsLabelUserDialog f260419g;

    /* renamed from: h, reason: collision with root package name */
    public int f260420h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.plugin.label.ui.AbsLabelUserDialog absLabelUserDialog, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f260419g = absLabelUserDialog;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f260418f = obj;
        this.f260420h |= Integer.MIN_VALUE;
        return this.f260419g.M(this);
    }
}

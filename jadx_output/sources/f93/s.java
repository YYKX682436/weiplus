package f93;

/* loaded from: classes11.dex */
public final class s extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f260453d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f260454e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f260455f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.AbsLabelUserDialog f260456g;

    /* renamed from: h, reason: collision with root package name */
    public int f260457h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.tencent.mm.plugin.label.ui.AbsLabelUserDialog absLabelUserDialog, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f260456g = absLabelUserDialog;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f260455f = obj;
        this.f260457h |= Integer.MIN_VALUE;
        int i17 = com.tencent.mm.plugin.label.ui.AbsLabelUserDialog.K;
        return this.f260456g.O(0, this);
    }
}

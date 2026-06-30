package r2;

/* loaded from: classes14.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f368751d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.g1 f368752e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o1.e f368753f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f368754g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w0.s f368755h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f368756i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u1.y1 f368757m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(android.content.Context context, n0.g1 g1Var, o1.e eVar, yz5.l lVar, w0.s sVar, java.lang.String str, u1.y1 y1Var) {
        super(0);
        this.f368751d = context;
        this.f368752e = g1Var;
        this.f368753f = eVar;
        this.f368754g = lVar;
        this.f368755h = sVar;
        this.f368756i = str;
        this.f368757m = y1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View typedView$ui_release;
        r2.h0 h0Var = new r2.h0(this.f368751d, this.f368752e, this.f368753f);
        h0Var.setFactory(this.f368754g);
        w0.s sVar = this.f368755h;
        java.lang.Object c17 = sVar != null ? sVar.c(this.f368756i) : null;
        android.util.SparseArray<android.os.Parcelable> sparseArray = c17 instanceof android.util.SparseArray ? (android.util.SparseArray) c17 : null;
        if (sparseArray != null && (typedView$ui_release = h0Var.getTypedView$ui_release()) != null) {
            typedView$ui_release.restoreHierarchyState(sparseArray);
        }
        this.f368757m.f423724a = h0Var;
        return h0Var.getLayoutNode();
    }
}

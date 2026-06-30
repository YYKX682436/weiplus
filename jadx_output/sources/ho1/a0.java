package ho1;

/* loaded from: classes5.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f282619d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fo1.n f282620e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f282621f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.tencent.mm.ui.widget.dialog.u3 u3Var, fo1.n nVar, yz5.l lVar) {
        super(0);
        this.f282619d = u3Var;
        this.f282620e = nVar;
        this.f282621f = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f282619d.dismiss();
        int ordinal = this.f282620e.ordinal();
        this.f282621f.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? "error_path_not_support" : "error_permission_denied" : "error_meta_corrupted" : "error_path_error" : ya.b.SUCCESS)));
        return jz5.f0.f302826a;
    }
}

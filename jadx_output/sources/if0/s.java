package if0;

/* loaded from: classes9.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f291040d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.zs4 f291041e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ if0.w f291042f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(android.view.View view, r45.zs4 zs4Var, if0.w wVar) {
        super(0);
        this.f291040d = view;
        this.f291041e = zs4Var;
        this.f291042f = wVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f291040d;
        if (view != null) {
            boolean z17 = this.f291041e.f392358p;
            if0.w wVar = this.f291042f;
            if (z17) {
                view.setBackgroundColor(view.getContext().getResources().getColor(((java.lang.Number) ((jz5.n) wVar.f291054e).getValue()).intValue()));
            } else {
                view.setBackgroundColor(view.getContext().getResources().getColor(((java.lang.Number) ((jz5.n) wVar.f291053d).getValue()).intValue()));
            }
        }
        return jz5.f0.f302826a;
    }
}

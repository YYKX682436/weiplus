package th5;

/* loaded from: classes12.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ th5.o f419462d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f419463e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(th5.o oVar, android.view.View view) {
        super(1);
        this.f419462d = oVar;
        this.f419463e = view;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        pf3.b visibility = (pf3.b) obj;
        kotlin.jvm.internal.o.g(visibility, "$this$visibility");
        android.view.View view = this.f419463e;
        th5.o oVar = this.f419462d;
        if (oVar != null && oVar.d()) {
            if (oVar.f419423h.length() == 0) {
                visibility.c(view);
                return jz5.f0.f302826a;
            }
        }
        visibility.b(view);
        return jz5.f0.f302826a;
    }
}

package ut2;

/* loaded from: classes3.dex */
public final class y4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut2.j5 f431162d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f431163e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f431164f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(ut2.j5 j5Var, float f17, float f18) {
        super(0);
        this.f431162d = j5Var;
        this.f431163e = f17;
        this.f431164f = f18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ut2.j5 j5Var = this.f431162d;
        android.view.ViewGroup.LayoutParams layoutParams = j5Var.g().getLayoutParams();
        layoutParams.width = (int) this.f431163e;
        layoutParams.height = (int) this.f431164f;
        j5Var.g().setLayoutParams(layoutParams);
        j5Var.g().setVisibility(0);
        return jz5.f0.f302826a;
    }
}

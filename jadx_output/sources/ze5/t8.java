package ze5;

/* loaded from: classes9.dex */
public final class t8 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze5.w8 f472211d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f472212e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rd5.d f472213f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8(ze5.w8 w8Var, yb5.d dVar, rd5.d dVar2) {
        super(1);
        this.f472211d = w8Var;
        this.f472212e = dVar;
        this.f472213f = dVar2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ze5.n8 it = (ze5.n8) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.widget.LinearLayout linearLayout = it.f472114f;
        if (linearLayout != null) {
            ze5.y8.b(this.f472211d.e0(it), linearLayout, this.f472212e, this.f472213f, it);
        }
        return jz5.f0.f302826a;
    }
}

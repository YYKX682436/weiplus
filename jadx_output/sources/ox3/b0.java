package ox3;

/* loaded from: classes10.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ox3.f0 f349725d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f349726e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f349727f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(ox3.f0 f0Var, in5.s0 s0Var, boolean z17) {
        super(0);
        this.f349725d = f0Var;
        this.f349726e = s0Var;
        this.f349727f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        c50.a1 a1Var = this.f349725d.f349747n;
        android.view.View p17 = this.f349726e.p(com.tencent.mm.R.id.f486695m63);
        kotlin.jvm.internal.o.f(p17, "getView(...)");
        ((lt2.b) a1Var).a((android.widget.FrameLayout) p17, this.f349727f);
        return jz5.f0.f302826a;
    }
}

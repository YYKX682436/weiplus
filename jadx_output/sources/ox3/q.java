package ox3;

/* loaded from: classes.dex */
public final class q implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ox3.g f349766a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ox3.s f349767b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f349768c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f349769d;

    public q(ox3.g gVar, ox3.s sVar, in5.s0 s0Var, int i17) {
        this.f349766a = gVar;
        this.f349767b = sVar;
        this.f349768c = s0Var;
        this.f349769d = i17;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        kotlin.jvm.internal.o.g(compoundButton, "<anonymous parameter 0>");
        ox3.g gVar = this.f349766a;
        gVar.f349753h = z17;
        ox3.s sVar = this.f349767b;
        sVar.n(this.f349768c);
        sVar.f349774e.invoke(java.lang.Integer.valueOf(this.f349769d), gVar);
    }
}

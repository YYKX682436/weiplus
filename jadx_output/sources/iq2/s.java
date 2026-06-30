package iq2;

/* loaded from: classes2.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iq2.d0 f293761d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f293762e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f293763f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.f2 f293764g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f293765h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(iq2.d0 d0Var, int i17, so2.j5 j5Var, androidx.recyclerview.widget.f2 f2Var, int i18) {
        super(0);
        this.f293761d = d0Var;
        this.f293762e = i17;
        this.f293763f = j5Var;
        this.f293764g = f2Var;
        this.f293765h = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        iq2.d0 d0Var = this.f293761d;
        java.util.ArrayList arrayList = d0Var.f293732p;
        int i17 = this.f293762e;
        if (kotlin.jvm.internal.o.b((so2.j5) kz5.n0.a0(arrayList, i17), this.f293763f)) {
            d0Var.f293732p.remove(i17);
            this.f293764g.notifyItemRemoved(this.f293765h);
            if (d0Var.f293741y) {
                iq2.d0.a(d0Var);
            }
        }
        return jz5.f0.f302826a;
    }
}

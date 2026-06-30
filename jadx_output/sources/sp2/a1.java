package sp2;

/* loaded from: classes2.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f410965d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f410966e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f410967f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.f2 f410968g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f410969h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(sp2.o2 o2Var, int i17, so2.j5 j5Var, androidx.recyclerview.widget.f2 f2Var, int i18) {
        super(0);
        this.f410965d = o2Var;
        this.f410966e = i17;
        this.f410967f = j5Var;
        this.f410968g = f2Var;
        this.f410969h = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sp2.o2 o2Var = this.f410965d;
        java.util.ArrayList arrayList = o2Var.f411145m;
        int i17 = this.f410966e;
        if (kotlin.jvm.internal.o.b((so2.j5) kz5.n0.a0(arrayList, i17), this.f410967f)) {
            o2Var.f411145m.remove(i17);
            this.f410968g.notifyItemRemoved(this.f410969h);
            sp2.o2.b(o2Var);
        }
        return jz5.f0.f302826a;
    }
}

package cr2;

/* loaded from: classes2.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cr2.x f221862d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f221863e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f221864f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.f2 f221865g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f221866h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(cr2.x xVar, int i17, so2.j5 j5Var, androidx.recyclerview.widget.f2 f2Var, int i18) {
        super(0);
        this.f221862d = xVar;
        this.f221863e = i17;
        this.f221864f = j5Var;
        this.f221865g = f2Var;
        this.f221866h = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        cr2.x xVar = this.f221862d;
        java.util.ArrayList arrayList = xVar.f221911q;
        int i17 = this.f221863e;
        if (kotlin.jvm.internal.o.b((so2.j5) kz5.n0.a0(arrayList, i17), this.f221864f)) {
            xVar.f221911q.remove(i17);
            this.f221865g.notifyItemRemoved(this.f221866h);
        }
        return jz5.f0.f302826a;
    }
}

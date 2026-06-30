package sp2;

/* loaded from: classes2.dex */
public final class y1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f411285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f411286e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f411287f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f411288g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(sp2.o2 o2Var, int i17, long j17, boolean z17) {
        super(1);
        this.f411285d = o2Var;
        this.f411286e = i17;
        this.f411287f = j17;
        this.f411288g = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f it = (com.tencent.mm.modelbase.f) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f411285d.f411137i = false;
        rq2.o.f398847a.e(this.f411286e, java.lang.System.currentTimeMillis() - this.f411287f, this.f411288g);
        return jz5.f0.f302826a;
    }
}

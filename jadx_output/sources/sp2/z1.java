package sp2;

/* loaded from: classes2.dex */
public final class z1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f411296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f411297e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f411298f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(sp2.o2 o2Var, long j17, boolean z17) {
        super(1);
        this.f411296d = o2Var;
        this.f411297e = j17;
        this.f411298f = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f it = (com.tencent.mm.modelbase.f) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f411296d.f411135h = false;
        rq2.o.f398847a.e(4, java.lang.System.currentTimeMillis() - this.f411297e, this.f411298f);
        return jz5.f0.f302826a;
    }
}

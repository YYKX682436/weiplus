package sp2;

/* loaded from: classes2.dex */
public final class d2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f411004d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f411005e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f411006f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(sp2.o2 o2Var, int i17, long j17, boolean z17) {
        super(1);
        this.f411004d = o2Var;
        this.f411005e = j17;
        this.f411006f = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f it = (com.tencent.mm.modelbase.f) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f411004d.f411137i = false;
        rq2.o.f398847a.e(1, java.lang.System.currentTimeMillis() - this.f411005e, this.f411006f);
        return jz5.f0.f302826a;
    }
}

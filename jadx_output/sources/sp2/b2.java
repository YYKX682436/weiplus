package sp2;

/* loaded from: classes2.dex */
public final class b2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f410986d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f410987e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f410988f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(sp2.o2 o2Var, long j17, boolean z17) {
        super(1);
        this.f410986d = o2Var;
        this.f410987e = j17;
        this.f410988f = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f it = (com.tencent.mm.modelbase.f) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f410986d.f411137i = false;
        rq2.o.f398847a.e(3, java.lang.System.currentTimeMillis() - this.f410987e, this.f410988f);
        return jz5.f0.f302826a;
    }
}

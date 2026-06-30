package k0;

/* loaded from: classes14.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f302873d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f302874e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z17, long j17) {
        super(1);
        this.f302873d = z17;
        this.f302874e = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        y1.p0 semantics = (y1.p0) obj;
        kotlin.jvm.internal.o.g(semantics, "$this$semantics");
        ((y1.l) semantics).g(k0.y.f302974c, new k0.x(this.f302873d ? j0.u1.SelectionStart : j0.u1.SelectionEnd, this.f302874e, null));
        return jz5.f0.f302826a;
    }
}

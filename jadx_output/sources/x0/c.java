package x0;

/* loaded from: classes14.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f450867d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(yz5.l lVar) {
        super(1);
        this.f450867d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int i17;
        x0.s invalid = (x0.s) obj;
        kotlin.jvm.internal.o.g(invalid, "invalid");
        synchronized (x0.z.f450963b) {
            i17 = x0.z.f450965d;
            x0.z.f450965d = i17 + 1;
        }
        return new x0.j(i17, invalid, this.f450867d);
    }
}

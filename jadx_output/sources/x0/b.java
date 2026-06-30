package x0;

/* loaded from: classes14.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f450863d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f450864e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(yz5.l lVar, yz5.l lVar2) {
        super(1);
        this.f450863d = lVar;
        this.f450864e = lVar2;
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
        return new x0.e(i17, invalid, this.f450863d, this.f450864e);
    }
}

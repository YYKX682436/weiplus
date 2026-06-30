package tl2;

/* loaded from: classes8.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl2.u f420270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f420271e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(tl2.u uVar, yz5.a aVar) {
        super(0);
        this.f420270d = uVar;
        this.f420271e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f420270d.f420274d.getWindow().getDecorView().post(new tl2.q(this.f420271e));
        return jz5.f0.f302826a;
    }
}

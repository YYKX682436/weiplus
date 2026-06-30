package rk4;

/* loaded from: classes11.dex */
public final class r1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f396947d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(yz5.l lVar) {
        super(1);
        this.f396947d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        bw5.y0[] arr = (bw5.y0[]) obj;
        kotlin.jvm.internal.o.g(arr, "arr");
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new rk4.q1(arr, this.f396947d, null), 3, null);
        return jz5.f0.f302826a;
    }
}

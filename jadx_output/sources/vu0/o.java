package vu0;

/* loaded from: classes5.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vu0.s f440127d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(vu0.s sVar) {
        super(0);
        this.f440127d = sVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        su0.j jVar = (su0.j) ((jz5.n) this.f440127d.f440152d).getValue();
        if (jVar == null) {
            return null;
        }
        return new yu0.m(jVar);
    }
}

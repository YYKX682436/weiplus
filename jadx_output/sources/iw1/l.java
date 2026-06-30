package iw1;

/* loaded from: classes12.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iw1.n f295223d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(iw1.n nVar) {
        super(0);
        this.f295223d = nVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object value = ((jz5.n) this.f295223d.f295226e).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return new android.os.Handler(((android.os.HandlerThread) value).getLooper());
    }
}

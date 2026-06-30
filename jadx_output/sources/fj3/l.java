package fj3;

/* loaded from: classes12.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fj3.n f263218d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(fj3.n nVar) {
        super(0);
        this.f263218d = nVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object value = ((jz5.n) this.f263218d.f263221e).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return new android.os.Handler(((android.os.HandlerThread) value).getLooper());
    }
}

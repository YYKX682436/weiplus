package yo5;

/* loaded from: classes12.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yo5.h f464366d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(yo5.h hVar) {
        super(0);
        this.f464366d = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object value = ((jz5.n) this.f464366d.f464370f).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return new android.os.Handler(((android.os.HandlerThread) value).getLooper());
    }
}

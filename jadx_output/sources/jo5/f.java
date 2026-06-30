package jo5;

/* loaded from: classes14.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jo5.i f300942d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(jo5.i iVar) {
        super(0);
        this.f300942d = iVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new android.os.Handler(((android.os.HandlerThread) ((jz5.n) this.f300942d.f300953c).getValue()).getLooper());
    }
}

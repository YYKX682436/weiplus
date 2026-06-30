package iw1;

/* loaded from: classes14.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iw1.f f295201d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(iw1.f fVar) {
        super(0);
        this.f295201d = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new android.os.Handler(((android.os.HandlerThread) ((jz5.n) this.f295201d.f295206c).getValue()).getLooper());
    }
}

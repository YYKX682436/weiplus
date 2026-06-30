package kh;

/* loaded from: classes12.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kh.h0 f307803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.Choreographer.FrameData f307804e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(kh.h0 h0Var, android.view.Choreographer.FrameData frameData) {
        super(0);
        this.f307803d = h0Var;
        this.f307804e = frameData;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f307803d.f307822a.onVsync(this.f307804e);
        return jz5.f0.f302826a;
    }
}

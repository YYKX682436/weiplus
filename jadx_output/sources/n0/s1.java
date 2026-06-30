package n0;

/* loaded from: classes13.dex */
public final class s1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.Choreographer.FrameCallback f333698d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(android.view.Choreographer.FrameCallback frameCallback) {
        super(1);
        this.f333698d = frameCallback;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n0.u1.f333715e.removeFrameCallback(this.f333698d);
        return jz5.f0.f302826a;
    }
}

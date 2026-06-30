package vr;

/* loaded from: classes8.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vr.q f439413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f439414e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(vr.q qVar, java.lang.String str) {
        super(0);
        this.f439413d = qVar;
        this.f439414e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f439413d.f439422f.invokeMethod("onEmojiSelected", this.f439414e);
        return jz5.f0.f302826a;
    }
}

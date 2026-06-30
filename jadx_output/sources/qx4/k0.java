package qx4;

/* loaded from: classes8.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f367419d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f367420e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(java.lang.String str, int i17) {
        super(0);
        this.f367419d = str;
        this.f367420e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.os.Looper.myQueue().addIdleHandler(new qx4.j0(this.f367419d, this.f367420e));
        return jz5.f0.f302826a;
    }
}

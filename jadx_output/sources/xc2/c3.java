package xc2;

/* loaded from: classes.dex */
public final class c3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.f96 f453110d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(r45.f96 f96Var) {
        super(0);
        this.f453110d = f96Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Failed to preload POI basic info, id:");
        r45.f96 f96Var = this.f453110d;
        sb6.append(f96Var.getString(5));
        sb6.append(" name:");
        sb6.append(f96Var.getString(3));
        com.tencent.mars.xlog.Log.e("PoiPreloadAndJumpHandler", sb6.toString());
        return jz5.f0.f302826a;
    }
}

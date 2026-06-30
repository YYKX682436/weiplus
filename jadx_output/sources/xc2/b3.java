package xc2;

/* loaded from: classes.dex */
public final class b3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.f96 f453090d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(r45.f96 f96Var) {
        super(1);
        this.f453090d = f96Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.c35 it = (r45.c35) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Succeed to preload POI basic info, id:");
        r45.f96 f96Var = this.f453090d;
        sb6.append(f96Var.getString(5));
        sb6.append(" name:");
        sb6.append(f96Var.getString(3));
        com.tencent.mars.xlog.Log.i("PoiPreloadAndJumpHandler", sb6.toString());
        return jz5.f0.f302826a;
    }
}

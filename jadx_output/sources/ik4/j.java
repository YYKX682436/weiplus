package ik4;

/* loaded from: classes4.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ik4.g f291939d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ik4.g gVar) {
        super(0);
        this.f291939d = gVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ik4.g gVar = this.f291939d;
        gVar.release();
        com.tencent.mars.xlog.Log.i("MicroMsg.TPFlexiblePlayerManager", "[" + gVar.hashCode() + "]Player instance has been released");
        return jz5.f0.f302826a;
    }
}

package uf;

/* loaded from: classes7.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf.o0 f427014d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(uf.o0 o0Var) {
        super(1);
        this.f427014d = o0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCastController", "reconnect: isSuccess = " + booleanValue);
        if (booleanValue) {
            uf.o0 o0Var = this.f427014d;
            o0Var.c(o0Var.f427070m, uf.a.f426961h);
        }
        return jz5.f0.f302826a;
    }
}

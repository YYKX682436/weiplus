package ju1;

/* loaded from: classes9.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ju1.j0 f301719d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(ju1.j0 j0Var) {
        super(1);
        this.f301719d = j0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String ret_msg;
        r45.sd3 sd3Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CouponAndGiftCardViewModel", "force get card list errType: " + fVar.f70615a + ", errCode: " + fVar.f70616b + ", errMsg: " + fVar.f70617c);
            int i17 = fVar.f70615a;
            ju1.j0 j0Var = this.f301719d;
            if (i17 == 0 && fVar.f70616b == 0 && (sd3Var = (r45.sd3) fVar.f70618d) != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CouponAndGiftCardViewModel", "force get card list retcode: " + sd3Var.f385635d + ", retmsg: " + sd3Var.f385636e);
                if (sd3Var.f385635d == 0) {
                    j0Var.f301744n = 0;
                    boolean z17 = sd3Var.f385637f;
                    androidx.lifecycle.j0 j0Var2 = j0Var.f301752g;
                    if (z17) {
                        j0Var2.postValue(ju1.o0.f301779i);
                    } else {
                        j0Var2.postValue(ju1.o0.f301778h);
                    }
                    j0Var.f301745o = sd3Var;
                    j0Var.f301749d.postValue(sd3Var.f385640i);
                    j0Var.f301751f.postValue(j0Var.S6(sd3Var, true));
                } else {
                    ret_msg = sd3Var.f385636e;
                    kotlin.jvm.internal.o.f(ret_msg, "ret_msg");
                }
            } else {
                ret_msg = "";
            }
            ju1.o0 o0Var = ju1.o0.f301780m;
            o0Var.f301782d = ret_msg;
            j0Var.f301752g.postValue(o0Var);
        }
        return jz5.f0.f302826a;
    }
}

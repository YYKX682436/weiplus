package ku1;

/* loaded from: classes15.dex */
public class n extends ku1.i {
    @Override // ku1.i
    public ku1.l0 g() {
        return new ku1.g(this, this.f312093b);
    }

    @Override // ku1.i
    public java.lang.String h(lu1.e eVar) {
        return this.f312095d.i0().f385189o;
    }

    @Override // ku1.i
    public ku1.l0 i() {
        return new ku1.b0(this, this.f312093b);
    }

    @Override // ku1.i
    public ku1.l0 j() {
        return new ku1.d0(this, this.f312093b);
    }

    @Override // ku1.i
    public boolean k(tt1.j jVar) {
        tt1.j jVar2 = this.f312095d;
        if (jVar2 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain mCardInfo is null！");
            return true;
        }
        if (jVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain false  newCardInfo null！");
            return false;
        }
        java.lang.String str = jVar2.i0().f385189o;
        java.lang.String str2 = jVar.i0().f385189o;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2) || str.equals(str2)) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain   code  is diffrent！");
        return true;
    }
}

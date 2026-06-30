package ku1;

/* loaded from: classes15.dex */
public class y extends ku1.i {

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f312157l = "";

    @Override // ku1.i
    public ku1.l0 g() {
        return new ku1.x(this, this.f312093b);
    }

    @Override // ku1.i
    public java.lang.String h(lu1.e eVar) {
        return !com.tencent.mm.sdk.platformtools.t8.K0(this.f312095d.i0().C) ? this.f312095d.i0().C : (!this.f312095d.N() || com.tencent.mm.sdk.platformtools.t8.K0(this.f312157l)) ? this.f312095d.i0().f385189o : this.f312157l;
    }

    @Override // ku1.i
    public ku1.l0 i() {
        return new ku1.z(this, this.f312093b);
    }

    @Override // ku1.i
    public ku1.l0 j() {
        return new ku1.a0(this, this.f312093b);
    }

    @Override // ku1.i
    public boolean k(tt1.j jVar) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        tt1.j jVar2 = this.f312095d;
        if (jVar2 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain mCardInfo is null！");
            return true;
        }
        if (jVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain false  newCardInfo null！");
            return false;
        }
        java.lang.String str5 = jVar2.i0().f385189o;
        java.lang.String str6 = jVar.i0().f385189o;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str5) && !com.tencent.mm.sdk.platformtools.t8.K0(str6) && !str5.equals(str6)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain   code  is diffrent！");
            return true;
        }
        r45.w50 w50Var = this.f312095d.s0().Z;
        r45.w50 w50Var2 = jVar.s0().Z;
        if ((w50Var == null && w50Var2 != null) || (w50Var != null && w50Var2 == null)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain pay_and_qrcode_field  is diffrent！");
            return true;
        }
        if (w50Var != null && w50Var2 != null && (str3 = w50Var.f388878d) != null && (str4 = w50Var2.f388878d) != null && !str3.equals(str4)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain pay_and_qrcode_field title is diffrent！");
            return true;
        }
        if (w50Var != null && w50Var2 != null && (str = w50Var.f388880f) != null && (str2 = w50Var2.f388880f) != null && !str.equals(str2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain pay_and_qrcode_field aux_title  is diffrent！");
            return true;
        }
        if (!this.f312095d.N() || com.tencent.mm.sdk.platformtools.t8.K0(this.f312157l)) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CardCodeView", "dynamicCode updated！");
        return true;
    }
}
